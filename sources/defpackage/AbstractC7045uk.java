package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7045uk<D> extends C6349rR0<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile AbstractC7045uk<D>.a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile AbstractC7045uk<D>.a mTask;
    long mUpdateThrottle;

    /* JADX INFO: renamed from: uk$a */
    public final class a extends N01<Void, Void, D> implements Runnable {
        public final CountDownLatch m = new CountDownLatch(1);
        public boolean n;

        public a() {
        }

        @Override // defpackage.N01
        public final Object a() {
            return AbstractC7045uk.this.onLoadInBackground();
        }

        @Override // defpackage.N01
        public final void b(D d) {
            CountDownLatch countDownLatch = this.m;
            try {
                AbstractC7045uk.this.dispatchOnCancelled(this, d);
            } finally {
                countDownLatch.countDown();
            }
        }

        @Override // defpackage.N01
        public final void c(D d) {
            CountDownLatch countDownLatch = this.m;
            try {
                AbstractC7045uk.this.dispatchOnLoadComplete(this, d);
            } finally {
                countDownLatch.countDown();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.n = false;
            AbstractC7045uk.this.executePendingTask();
        }
    }

    public AbstractC7045uk(@NonNull Context context) {
        this(context, N01.j);
    }

    public void dispatchOnCancelled(AbstractC7045uk<D>.a aVar, D d) {
        onCanceled(d);
        if (this.mCancellingTask == aVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(AbstractC7045uk<D>.a aVar, D d) {
        if (this.mTask != aVar) {
            dispatchOnCancelled(aVar, d);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d);
    }

    @Override // defpackage.C6349rR0
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.n);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.n);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C4994l.e(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            long j = this.mLastLoadCompleteTime;
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (j == 0) {
                printWriter.print("--");
            } else {
                C4994l.e(j - jUptimeMillis, printWriter);
            }
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.n) {
            this.mTask.n = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.n = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        AbstractC7045uk<D>.a aVar = this.mTask;
        Executor executor = this.mExecutor;
        if (aVar.g == N01.f.d) {
            aVar.g = N01.f.e;
            aVar.d.getClass();
            executor.execute(aVar.e);
        } else {
            int iOrdinal = aVar.g.ordinal();
            if (iOrdinal == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iOrdinal == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    @Override // defpackage.C6349rR0
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.n) {
                this.mTask.n = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.n) {
            this.mTask.n = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        AbstractC7045uk<D>.a aVar = this.mTask;
        aVar.h.set(true);
        boolean zCancel = aVar.e.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    @Override // defpackage.C6349rR0
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new a();
        executePendingTask();
    }

    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        AbstractC7045uk<D>.a aVar = this.mTask;
        if (aVar != null) {
            try {
                aVar.m.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    private AbstractC7045uk(@NonNull Context context, @NonNull Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }

    public void cancelLoadInBackground() {
    }

    public void onCanceled(D d) {
    }
}

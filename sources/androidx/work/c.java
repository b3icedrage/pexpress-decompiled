package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import defpackage.C3219ck2;
import defpackage.C5565nh0;
import defpackage.C6117qJ1;
import defpackage.C7679xk2;
import defpackage.InterfaceC7208vX1;
import defpackage.PQ0;
import defpackage.RunnableC3010bk2;
import defpackage.RunnableC7469wk2;
import defpackage.Xk2;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    @NonNull
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C0242a extends a {
            public final androidx.work.b a = androidx.work.b.c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0242a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0242a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() + (C0242a.class.getName().hashCode() * 31);
            }

            @NonNull
            public final String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }
        }

        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            @NonNull
            public final String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        public static final class C0243c extends a {
            public final androidx.work.b a;

            public C0243c() {
                this(androidx.work.b.c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0243c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0243c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() + (C0243c.class.getName().hashCode() * 31);
            }

            @NonNull
            public final String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }

            public C0243c(@NonNull androidx.work.b bVar) {
                this.a = bVar;
            }
        }
    }

    public c(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    @NonNull
    public PQ0<C5565nh0> getForegroundInfoAsync() {
        C6117qJ1 c6117qJ1 = new C6117qJ1();
        c6117qJ1.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c6117qJ1;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    @NonNull
    public final b getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.d.c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    @NonNull
    public InterfaceC7208vX1 getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    @NonNull
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.d.a;
    }

    @NonNull
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.d.b;
    }

    @NonNull
    public Xk2 getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @NonNull
    public final PQ0<Void> setForegroundAsync(@NonNull C5565nh0 c5565nh0) {
        C3219ck2 c3219ck2 = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        c3219ck2.getClass();
        C6117qJ1 c6117qJ1 = new C6117qJ1();
        c3219ck2.a.a(new RunnableC3010bk2(c3219ck2, c6117qJ1, id, c5565nh0, applicationContext));
        return c6117qJ1;
    }

    @NonNull
    public PQ0<Void> setProgressAsync(@NonNull b bVar) {
        C7679xk2 c7679xk2 = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        c7679xk2.getClass();
        C6117qJ1 c6117qJ1 = new C6117qJ1();
        c7679xk2.b.a(new RunnableC7469wk2(c7679xk2, id, bVar, c6117qJ1));
        return c6117qJ1;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    @NonNull
    public abstract PQ0<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}

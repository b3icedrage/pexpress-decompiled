package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: Es1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class FutureC0932Es1<R> implements Future, InterfaceC5529nX1, InterfaceC1088Gs1<R> {
    public R d;
    public InterfaceC4762js1 e;
    public boolean g;
    public boolean h;
    public boolean i;
    public C2160Ul0 j;

    /* JADX INFO: renamed from: Es1$a */
    public static class a {
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void b(@NonNull DM1 dm1) throws Throwable {
        dm1.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1088Gs1
    public final synchronized boolean c(Object obj, InterfaceC5529nX1 interfaceC5529nX1) {
        this.h = true;
        this.d = obj;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.g = true;
                notifyAll();
                InterfaceC4762js1 interfaceC4762js1 = null;
                if (z) {
                    InterfaceC4762js1 interfaceC4762js2 = this.e;
                    this.e = null;
                    interfaceC4762js1 = interfaceC4762js2;
                }
                if (interfaceC4762js1 != null) {
                    interfaceC4762js1.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC5529nX1
    public final synchronized InterfaceC4762js1 d() {
        return this.e;
    }

    @Override // defpackage.InterfaceC5529nX1
    public final synchronized void e(InterfaceC4762js1 interfaceC4762js1) {
        this.e = interfaceC4762js1;
    }

    @Override // defpackage.InterfaceC1088Gs1
    public final synchronized boolean g(C2160Ul0 c2160Ul0, InterfaceC5529nX1 interfaceC5529nX1) {
        this.i = true;
        this.j = c2160Ul0;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        try {
            return l(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.InterfaceC5529nX1
    public final synchronized void h(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.g;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.g || this.h || this.i;
    }

    @Override // defpackage.InterfaceC5529nX1
    public final synchronized void j(@NonNull R r, H42<? super R> h42) {
    }

    public final synchronized R l(Long l) {
        if (!isDone() && !C6177qc2.i()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.g) {
            throw new CancellationException();
        }
        if (this.i) {
            throw new ExecutionException(this.j);
        }
        if (this.h) {
            return this.d;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.i) {
            throw new ExecutionException(this.j);
        }
        if (this.g) {
            throw new CancellationException();
        }
        if (!this.h) {
            throw new TimeoutException();
        }
        return this.d;
    }

    public final String toString() {
        InterfaceC4762js1 interfaceC4762js1;
        String str;
        String strB = C5807oq.b(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                interfaceC4762js1 = null;
                if (this.g) {
                    str = "CANCELLED";
                } else if (this.i) {
                    str = "FAILURE";
                } else if (this.h) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    interfaceC4762js1 = this.e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC4762js1 == null) {
            return C2629a1.b(strB, str, "]");
        }
        return strB + str + ", request=[" + interfaceC4762js1 + "]]";
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, @NonNull TimeUnit timeUnit) {
        return l(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.DP0
    public final void onDestroy() {
    }

    @Override // defpackage.DP0
    public final void onStart() {
    }

    @Override // defpackage.DP0
    public final void onStop() {
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void a(@NonNull DM1 dm1) {
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void i(Drawable drawable) {
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void k(Drawable drawable) {
    }
}

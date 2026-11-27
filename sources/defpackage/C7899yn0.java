package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7899yn0 extends AbstractC8109zn0 {

    @NotNull
    public final Handler g;
    public final boolean h;

    @NotNull
    public final C7899yn0 i;

    public C7899yn0(Handler handler, boolean z) {
        this.g = handler;
        this.h = z;
        this.i = z ? this : new C7899yn0(handler, true);
    }

    @Override // defpackage.GW
    public final void D(long j, @NotNull C6251qy c6251qy) {
        RunnableC7479wn0 runnableC7479wn0 = new RunnableC7479wn0(c6251qy, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.g.postDelayed(runnableC7479wn0, j)) {
            c6251qy.u(new C7689xn0(this, runnableC7479wn0));
        } else {
            t1(c6251qy.i, runnableC7479wn0);
        }
    }

    @Override // defpackage.AbstractC8109zn0, defpackage.GW
    @NotNull
    public final A20 G(long j, @NotNull final Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.g.postDelayed(runnable, j)) {
            return new A20() { // from class: vn0
                @Override // defpackage.A20
                public final void b() {
                    this.d.g.removeCallbacks(runnable);
                }
            };
        }
        t1(coroutineContext, runnable);
        return C7960z51.d;
    }

    @Override // defpackage.DN
    public final void c1(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (this.g.post(runnable)) {
            return;
        }
        t1(coroutineContext, runnable);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C7899yn0)) {
            return false;
        }
        C7899yn0 c7899yn0 = (C7899yn0) obj;
        return c7899yn0.g == this.g && c7899yn0.h == this.h;
    }

    public final int hashCode() {
        return System.identityHashCode(this.g) ^ (this.h ? 1231 : 1237);
    }

    @Override // defpackage.DN
    public final boolean k1(@NotNull CoroutineContext coroutineContext) {
        return (this.h && Intrinsics.a(Looper.myLooper(), this.g.getLooper())) ? false : true;
    }

    @Override // defpackage.AbstractC8109zn0
    public final AbstractC8109zn0 s1() {
        return this.i;
    }

    public final void t1(CoroutineContext coroutineContext, Runnable runnable) {
        ED.d(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C6266r20.c.c1(coroutineContext, runnable);
    }

    @Override // defpackage.AbstractC8109zn0, defpackage.DN
    @NotNull
    public final String toString() {
        AbstractC8109zn0 abstractC8109zn0S1;
        String str;
        RV rv = C6266r20.a;
        AbstractC8109zn0 abstractC8109zn0 = QV0.a;
        if (this == abstractC8109zn0) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC8109zn0S1 = abstractC8109zn0.s1();
            } catch (UnsupportedOperationException unused) {
                abstractC8109zn0S1 = null;
            }
            str = this == abstractC8109zn0S1 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.g.toString();
        return this.h ? Z0.c(string, ".immediate") : string;
    }
}

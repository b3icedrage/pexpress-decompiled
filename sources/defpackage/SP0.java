package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SP0 extends DN implements GW {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(SP0.class, "runningWorkers$volatile");

    @NotNull
    public final S82 g;
    public final int h;
    public final /* synthetic */ GW i;

    @NotNull
    public final C3992gS0<Runnable> j;

    @NotNull
    public final Object k;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public final class a implements Runnable {

        @NotNull
        public Runnable d;

        public a(Runnable runnable) {
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SP0 sp0;
            int i = 0;
            do {
                try {
                    this.d.run();
                } catch (Throwable th) {
                    GN.a(th, e.d);
                }
                sp0 = SP0.this;
                Runnable runnableS1 = sp0.s1();
                if (runnableS1 == null) {
                    return;
                }
                this.d = runnableS1;
                i++;
            } while (i < 16);
            S82 s82 = sp0.g;
            s82.getClass();
            s82.c1(sp0, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SP0(@NotNull S82 s82, int i) {
        this.g = s82;
        this.h = i;
        GW gw = s82 instanceof GW ? (GW) s82 : null;
        this.i = gw == null ? C4678jV.a : gw;
        this.j = new C3992gS0<>();
        this.k = new Object();
    }

    @Override // defpackage.GW
    public final void D(long j, @NotNull C6251qy c6251qy) {
        this.i.D(j, c6251qy);
    }

    @Override // defpackage.GW
    @NotNull
    public final A20 G(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return this.i.G(j, runnable, coroutineContext);
    }

    @Override // defpackage.DN
    public final void c1(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable runnableS1;
        this.j.a(runnable);
        if (l.get(this) >= this.h || !t1() || (runnableS1 = s1()) == null) {
            return;
        }
        this.g.c1(this, new a(runnableS1));
    }

    @Override // defpackage.DN
    public final void j1(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable runnableS1;
        this.j.a(runnable);
        if (l.get(this) >= this.h || !t1() || (runnableS1 = s1()) == null) {
            return;
        }
        this.g.j1(this, new a(runnableS1));
    }

    public final Runnable s1() {
        while (true) {
            Runnable runnableD = this.j.d();
            if (runnableD != null) {
                return runnableD;
            }
            synchronized (this.k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean t1() {
        synchronized (this.k) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
            if (atomicIntegerFieldUpdater.get(this) >= this.h) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}

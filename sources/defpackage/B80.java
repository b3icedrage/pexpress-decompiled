package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B80 extends C80 implements GW {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(B80.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(B80.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(B80.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public final class a extends c {

        @NotNull
        public final C6251qy g;

        public a(@NotNull long j, C6251qy c6251qy) {
            super(j);
            this.g = c6251qy;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.g.B(B80.this, Unit.a);
        }

        @Override // B80.c
        @NotNull
        public final String toString() {
            return super.toString() + this.g;
        }
    }

    public static final class b extends c {

        @NotNull
        public final Runnable g;

        public b(@NotNull Runnable runnable, long j) {
            super(j);
            this.g = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.g.run();
        }

        @Override // B80.c
        @NotNull
        public final String toString() {
            return super.toString() + this.g;
        }
    }

    public static abstract class c implements Runnable, Comparable<c>, A20, IY1 {

        @Nullable
        private volatile Object _heap;
        public long d;
        public int e = -1;

        public c(long j) {
            this.d = j;
        }

        @Override // defpackage.A20
        public final void b() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    GW1 gw1 = N7.e;
                    if (obj == gw1) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        synchronized (dVar) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof HY1 ? (HY1) obj2 : null) != null) {
                                dVar.b(this.e);
                            }
                        }
                    }
                    this._heap = gw1;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j = this.d - cVar.d;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override // defpackage.IY1
        public final void f(@Nullable d dVar) {
            if (this._heap == N7.e) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = dVar;
        }

        @Override // defpackage.IY1
        public final void i(int i) {
            this.e = i;
        }

        public final int k(long j, @NotNull d dVar, @NotNull B80 b80) {
            synchronized (this) {
                if (this._heap == N7.e) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        Object[] objArr = dVar.a;
                        c cVar = (c) (objArr != null ? objArr[0] : null);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B80.k;
                        b80.getClass();
                        if (B80.m.get(b80) != 0) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.c = j;
                        } else {
                            long j2 = cVar.d;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - dVar.c > 0) {
                                dVar.c = j;
                            }
                        }
                        long j3 = this.d;
                        long j4 = dVar.c;
                        if (j3 - j4 < 0) {
                            this.d = j4;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.d + ']';
        }
    }

    public static final class d extends HY1<c> {
        public long c;
    }

    public final boolean A1(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m.get(this) != 0) {
                break;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C4202hS0)) {
                if (obj == N7.g) {
                    break;
                }
                C4202hS0 c4202hS0 = new C4202hS0(8, true);
                c4202hS0.a((Runnable) obj);
                c4202hS0.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4202hS0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            C4202hS0 c4202hS1 = (C4202hS0) obj;
            int iA = c4202hS1.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                C4202hS0 c4202hS0C = c4202hS1.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4202hS0C) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                break;
            }
        }
        return false;
    }

    public final boolean B1() {
        d dVar;
        C6202qj<AbstractC5427n20<?>> c6202qj = this.i;
        if (!(c6202qj != null ? c6202qj.isEmpty() : true) || ((dVar = (d) l.get(this)) != null && HY1.b.get(dVar) != 0)) {
            return false;
        }
        Object obj = k.get(this);
        if (obj != null) {
            if (obj instanceof C4202hS0) {
                long j = C4202hS0.f.get((C4202hS0) obj);
                return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
            }
            if (obj != N7.g) {
                return false;
            }
        }
        return true;
    }

    public final void C1(long j, @NotNull c cVar) {
        int iK;
        Thread threadX1;
        boolean z = m.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        IY1 iy1 = null;
        if (z) {
            iK = 1;
        } else {
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            if (dVar == null) {
                d dVar2 = new d();
                dVar2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.checkNotNull(obj);
                dVar = (d) obj;
            }
            iK = cVar.k(j, dVar, this);
        }
        if (iK != 0) {
            if (iK == 1) {
                y1(j, cVar);
                return;
            } else {
                if (iK != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        d dVar3 = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar3 != null) {
            synchronized (dVar3) {
                IY1[] iy1Arr = dVar3.a;
                iy1 = iy1Arr != null ? iy1Arr[0] : null;
            }
            iy1 = (c) iy1;
        }
        if (iy1 != cVar || Thread.currentThread() == (threadX1 = x1())) {
            return;
        }
        LockSupport.unpark(threadX1);
    }

    @Override // defpackage.GW
    public final void D(long j, @NotNull C6251qy c6251qy) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            a aVar = new a(j2 + jNanoTime, c6251qy);
            C1(jNanoTime, aVar);
            c6251qy.v(new D20(aVar));
        }
    }

    @Override // defpackage.GW
    @NotNull
    public A20 G(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return C4678jV.a.G(j, runnable, coroutineContext);
    }

    @Override // defpackage.DN
    public final void c1(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        z1(runnable);
    }

    @Override // defpackage.A80
    public void shutdown() {
        c cVarB;
        EY1.a.set(null);
        m.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            GW1 gw1 = N7.g;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, gw1)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof C4202hS0) {
                ((C4202hS0) obj).b();
                break;
            } else {
                if (obj == gw1) {
                    break;
                }
                C4202hS0 c4202hS0 = new C4202hS0(8, true);
                c4202hS0.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c4202hS0)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (v1() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) l.get(this);
            if (dVar == null) {
                return;
            }
            synchronized (dVar) {
                cVarB = HY1.b.get(dVar) > 0 ? dVar.b(0) : null;
            }
            c cVar = cVarB;
            if (cVar == null) {
                return;
            } else {
                y1(jNanoTime, cVar);
            }
        }
    }

    @Override // defpackage.A80
    public final long v1() {
        Runnable runnable;
        Object obj;
        c cVarB;
        if (!w1()) {
            d dVar = (d) l.get(this);
            if (dVar != null && HY1.b.get(dVar) != 0) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (dVar) {
                        try {
                            Object[] objArr = dVar.a;
                            Object obj2 = objArr != null ? objArr[0] : null;
                            if (obj2 == null) {
                                cVarB = null;
                            } else {
                                c cVar = (c) obj2;
                                cVarB = ((jNanoTime - cVar.d) > 0L ? 1 : ((jNanoTime - cVar.d) == 0L ? 0 : -1)) >= 0 ? A1(cVar) : false ? dVar.b(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (cVarB != null);
            }
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                if (obj3 != null) {
                    if (obj3 instanceof C4202hS0) {
                        C4202hS0 c4202hS0 = (C4202hS0) obj3;
                        Object objD = c4202hS0.d();
                        if (objD != C4202hS0.g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        C4202hS0 c4202hS0C = c4202hS0.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, c4202hS0C) && atomicReferenceFieldUpdater.get(this) == obj3) {
                        }
                    } else if (obj3 != N7.g) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, null)) {
                                runnable = (Runnable) obj3;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj3);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C6202qj<AbstractC5427n20<?>> c6202qj = this.i;
            if (((c6202qj == null || c6202qj.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj4 = k.get(this);
                if (obj4 != null) {
                    if (obj4 instanceof C4202hS0) {
                        long j = C4202hS0.f.get((C4202hS0) obj4);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                        }
                    } else if (obj4 == N7.g) {
                        return Long.MAX_VALUE;
                    }
                }
                d dVar2 = (d) l.get(this);
                if (dVar2 != null) {
                    synchronized (dVar2) {
                        Object[] objArr2 = dVar2.a;
                        obj = objArr2 != null ? objArr2[0] : null;
                    }
                    c cVar2 = (c) obj;
                    if (cVar2 != null) {
                        long jNanoTime2 = cVar2.d - System.nanoTime();
                        if (jNanoTime2 >= 0) {
                            return jNanoTime2;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void z1(@NotNull Runnable runnable) {
        if (!A1(runnable)) {
            RunnableC4420iV.n.z1(runnable);
            return;
        }
        Thread threadX1 = x1();
        if (Thread.currentThread() != threadX1) {
            LockSupport.unpark(threadX1);
        }
    }
}

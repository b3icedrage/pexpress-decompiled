package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class JN implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(JN.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(JN.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(JN.class, "_isTerminated$volatile");

    @NotNull
    public static final GW1 o = new GW1("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int d;
    public final int e;
    public final long g;

    @NotNull
    public final String h;

    @NotNull
    public final C6005pm0 i;

    @NotNull
    public final C6005pm0 j;

    @NotNull
    public final C2342Ws1<a> k;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public final class a extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

        @NotNull
        public final C7889yk2 d;

        @NotNull
        public final C3027bp1<AbstractRunnableC6788tX1> e;

        @NotNull
        public b g;
        public long h;
        public long i;
        private volatile int indexInArray;
        public int j;
        public boolean k;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public a() {
            throw null;
        }

        public a(int i) {
            setDaemon(true);
            setContextClassLoader(JN.this.getClass().getClassLoader());
            this.d = new C7889yk2();
            this.e = new C3027bp1<>();
            this.g = b.h;
            this.nextParkedWorker = JN.o;
            int iNanoTime = (int) System.nanoTime();
            this.j = iNanoTime == 0 ? 42 : iNanoTime;
            f(i);
        }

        @Nullable
        public final AbstractRunnableC6788tX1 a(boolean z) {
            AbstractRunnableC6788tX1 abstractRunnableC6788tX1E;
            AbstractRunnableC6788tX1 abstractRunnableC6788tX1E2;
            JN jn;
            long j;
            b bVar = this.g;
            b bVar2 = b.d;
            AbstractRunnableC6788tX1 abstractRunnableC6788tX1 = null;
            C7889yk2 c7889yk2 = this.d;
            JN jn2 = JN.this;
            if (bVar != bVar2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = JN.m;
                do {
                    jn = JN.this;
                    j = atomicLongFieldUpdater.get(jn);
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        c7889yk2.getClass();
                        loop1: while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7889yk2.b;
                            AbstractRunnableC6788tX1 abstractRunnableC6788tX2 = (AbstractRunnableC6788tX1) atomicReferenceFieldUpdater.get(c7889yk2);
                            if (abstractRunnableC6788tX2 == null || abstractRunnableC6788tX2.e.a != 1) {
                                int i = C7889yk2.d.get(c7889yk2);
                                int i2 = C7889yk2.c.get(c7889yk2);
                                while (i != i2 && C7889yk2.e.get(c7889yk2) != 0) {
                                    i2--;
                                    AbstractRunnableC6788tX1 abstractRunnableC6788tX1C = c7889yk2.c(i2, true);
                                    if (abstractRunnableC6788tX1C != null) {
                                        abstractRunnableC6788tX1 = abstractRunnableC6788tX1C;
                                        break;
                                    }
                                }
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(c7889yk2, abstractRunnableC6788tX2, null)) {
                                    abstractRunnableC6788tX1 = abstractRunnableC6788tX2;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(c7889yk2) == abstractRunnableC6788tX2);
                        }
                        if (abstractRunnableC6788tX1 != null) {
                            return abstractRunnableC6788tX1;
                        }
                        AbstractRunnableC6788tX1 abstractRunnableC6788tX1D = jn2.j.d();
                        return abstractRunnableC6788tX1D == null ? i(1) : abstractRunnableC6788tX1D;
                    }
                } while (!JN.m.compareAndSet(jn, j, j - 4398046511104L));
                this.g = b.d;
            }
            if (z) {
                boolean z2 = d(jn2.d * 2) == 0;
                if (z2 && (abstractRunnableC6788tX1E2 = e()) != null) {
                    return abstractRunnableC6788tX1E2;
                }
                c7889yk2.getClass();
                AbstractRunnableC6788tX1 abstractRunnableC6788tX1B = (AbstractRunnableC6788tX1) C7889yk2.b.getAndSet(c7889yk2, null);
                if (abstractRunnableC6788tX1B == null) {
                    abstractRunnableC6788tX1B = c7889yk2.b();
                }
                if (abstractRunnableC6788tX1B != null) {
                    return abstractRunnableC6788tX1B;
                }
                if (!z2 && (abstractRunnableC6788tX1E = e()) != null) {
                    return abstractRunnableC6788tX1E;
                }
            } else {
                AbstractRunnableC6788tX1 abstractRunnableC6788tX1E3 = e();
                if (abstractRunnableC6788tX1E3 != null) {
                    return abstractRunnableC6788tX1E3;
                }
            }
            return i(3);
        }

        public final int b() {
            return this.indexInArray;
        }

        @Nullable
        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i) {
            int i2 = this.j;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.j = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i;
        }

        public final AbstractRunnableC6788tX1 e() {
            int iD = d(2);
            JN jn = JN.this;
            if (iD == 0) {
                AbstractRunnableC6788tX1 abstractRunnableC6788tX1D = jn.i.d();
                return abstractRunnableC6788tX1D != null ? abstractRunnableC6788tX1D : jn.j.d();
            }
            AbstractRunnableC6788tX1 abstractRunnableC6788tX1D2 = jn.j.d();
            return abstractRunnableC6788tX1D2 != null ? abstractRunnableC6788tX1D2 : jn.i.d();
        }

        public final void f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(JN.this.h);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void g(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(@NotNull b bVar) {
            b bVar2 = this.g;
            boolean z = bVar2 == b.d;
            if (z) {
                JN.m.addAndGet(JN.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.g = bVar;
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.Object, tX1] */
        /* JADX WARN: Type inference failed for: r7v14, types: [tX1] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [tX1] */
        public final AbstractRunnableC6788tX1 i(int i) {
            int i2;
            long j;
            T tC;
            long j2;
            long j3;
            T t;
            AtomicLongFieldUpdater atomicLongFieldUpdater = JN.m;
            JN jn = JN.this;
            int i3 = (int) (atomicLongFieldUpdater.get(jn) & 2097151);
            Object obj = null;
            if (i3 < 2) {
                return null;
            }
            int iD = d(i3);
            int i4 = 0;
            long jMin = Long.MAX_VALUE;
            while (i4 < i3) {
                int i5 = iD + 1;
                if (i5 > i3) {
                    i5 = 1;
                }
                a aVarB = jn.k.b(i5);
                if (aVarB == null || aVarB == this) {
                    i2 = i5;
                } else {
                    C7889yk2 c7889yk2 = aVarB.d;
                    if (i != 3) {
                        c7889yk2.getClass();
                        int i6 = C7889yk2.d.get(c7889yk2);
                        int i7 = C7889yk2.c.get(c7889yk2);
                        boolean z = i == 1;
                        while (true) {
                            if (i6 != i7) {
                                j = 0;
                                if (!z || C7889yk2.e.get(c7889yk2) != 0) {
                                    int i8 = i6 + 1;
                                    tC = c7889yk2.c(i6, z);
                                    if (tC != 0) {
                                        break;
                                    }
                                    i6 = i8;
                                }
                            } else {
                                j = 0;
                            }
                            tC = obj;
                            break;
                        }
                    } else {
                        tC = c7889yk2.b();
                        j = 0;
                    }
                    C3027bp1<AbstractRunnableC6788tX1> c3027bp1 = this.e;
                    Object obj2 = obj;
                    if (tC == 0) {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7889yk2.b;
                            ?? r14 = (AbstractRunnableC6788tX1) atomicReferenceFieldUpdater.get(c7889yk2);
                            if (r14 == 0) {
                                j2 = -1;
                            } else {
                                j2 = -1;
                                if (((r14.e.a == 1 ? 1 : 2) & i) != 0) {
                                    BX1.f.getClass();
                                    i2 = i5;
                                    long jNanoTime = System.nanoTime() - r14.d;
                                    long j4 = BX1.b;
                                    if (jNanoTime < j4) {
                                        j3 = j4 - jNanoTime;
                                        t = 0;
                                        break;
                                    }
                                    do {
                                        t = 0;
                                        if (atomicReferenceFieldUpdater.compareAndSet(c7889yk2, r14, null)) {
                                            c3027bp1.d = r14;
                                            j3 = -1;
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater.get(c7889yk2) == r14);
                                    i5 = i2;
                                    obj2 = null;
                                }
                            }
                            j3 = -2;
                            i2 = i5;
                            t = obj2;
                            break;
                        }
                    } else {
                        c3027bp1.d = tC;
                        i2 = i5;
                        j3 = -1;
                        j2 = -1;
                        t = obj;
                    }
                    if (j3 == j2) {
                        AbstractRunnableC6788tX1 abstractRunnableC6788tX1 = c3027bp1.d;
                        c3027bp1.d = t;
                        return abstractRunnableC6788tX1;
                    }
                    if (j3 > j) {
                        jMin = Math.min(jMin, j3);
                    }
                }
                i4++;
                iD = i2;
                obj = null;
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.i = jMin;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            AtomicLongFieldUpdater atomicLongFieldUpdater;
            long j;
            int i;
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    JN jn = JN.this;
                    jn.getClass();
                    if (JN.n.get(jn) == 0) {
                        b bVar = this.g;
                        b bVar2 = b.i;
                        if (bVar == bVar2) {
                            break loop0;
                        }
                        AbstractRunnableC6788tX1 abstractRunnableC6788tX1A = a(this.k);
                        if (abstractRunnableC6788tX1A == null) {
                            this.k = false;
                            if (this.i == 0) {
                                Object obj = this.nextParkedWorker;
                                GW1 gw1 = JN.o;
                                long j2 = 2097151;
                                if (obj != gw1) {
                                    m.set(this, -1);
                                    while (this.nextParkedWorker != JN.o) {
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m;
                                        if (atomicIntegerFieldUpdater.get(this) != -1) {
                                            break;
                                        }
                                        JN jn2 = JN.this;
                                        jn2.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = JN.n;
                                        if (atomicIntegerFieldUpdater2.get(jn2) != 0) {
                                            break;
                                        }
                                        b bVar3 = this.g;
                                        b bVar4 = b.i;
                                        if (bVar3 == bVar4) {
                                            break;
                                        }
                                        h(b.g);
                                        Thread.interrupted();
                                        if (this.h == 0) {
                                            this.h = System.nanoTime() + JN.this.g;
                                        }
                                        LockSupport.parkNanos(JN.this.g);
                                        if (System.nanoTime() - this.h >= 0) {
                                            this.h = 0L;
                                            JN jn3 = JN.this;
                                            synchronized (jn3.k) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(jn3) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = JN.m;
                                                        if (((int) (atomicLongFieldUpdater2.get(jn3) & j2)) > jn3.d) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i2 = this.indexInArray;
                                                                f(0);
                                                                jn3.l(this, i2, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(jn3) & j2);
                                                                if (andDecrement != i2) {
                                                                    a aVarB = jn3.k.b(andDecrement);
                                                                    Intrinsics.checkNotNull(aVarB);
                                                                    a aVar = aVarB;
                                                                    jn3.k.c(i2, aVar);
                                                                    aVar.f(i2);
                                                                    jn3.l(aVar, andDecrement, i2);
                                                                }
                                                                jn3.k.c(andDecrement, null);
                                                                Unit unit = Unit.a;
                                                                this.g = bVar4;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                        }
                                        j2 = j2;
                                    }
                                } else {
                                    JN jn4 = JN.this;
                                    jn4.getClass();
                                    if (this.nextParkedWorker == gw1) {
                                        do {
                                            atomicLongFieldUpdater = JN.l;
                                            j = atomicLongFieldUpdater.get(jn4);
                                            i = this.indexInArray;
                                            this.nextParkedWorker = jn4.k.b((int) (j & 2097151));
                                        } while (!atomicLongFieldUpdater.compareAndSet(jn4, j, ((2097152 + j) & (-2097152)) | ((long) i)));
                                    }
                                }
                            } else {
                                if (z) {
                                    h(b.g);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.i);
                                    this.i = 0L;
                                    break;
                                }
                                z = true;
                            }
                        } else {
                            this.i = 0L;
                            int i3 = abstractRunnableC6788tX1A.e.a;
                            this.h = 0L;
                            if (this.g == b.g) {
                                this.g = b.e;
                            }
                            JN jn5 = JN.this;
                            if (i3 != 0 && h(b.e) && !jn5.q() && !jn5.p(JN.m.get(jn5))) {
                                jn5.q();
                            }
                            jn5.getClass();
                            try {
                                abstractRunnableC6788tX1A.run();
                            } catch (Throwable th2) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                            }
                            if (i3 != 0) {
                                JN.m.addAndGet(jn5, -2097152L);
                                if (this.g == bVar2) {
                                    break;
                                }
                                this.g = b.h;
                                break;
                            }
                            break;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            h(b.i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final /* synthetic */ b[] j;

        static {
            b bVar = new b("CPU_ACQUIRED", 0);
            d = bVar;
            b bVar2 = new b("BLOCKING", 1);
            e = bVar2;
            b bVar3 = new b("PARKING", 2);
            g = bVar3;
            b bVar4 = new b("DORMANT", 3);
            h = bVar4;
            b bVar5 = new b("TERMINATED", 4);
            i = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            j = bVarArr;
            C1952Ru.i(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) j.clone();
        }
    }

    public JN(@NotNull String str, int i, int i2, long j) {
        this.d = i;
        this.e = i2;
        this.g = j;
        this.h = str;
        if (i < 1) {
            throw new IllegalArgumentException(C1332Jw.a(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C4564j.c(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(C1332Jw.a(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.i = new C6005pm0();
        this.j = new C6005pm0();
        this.k = new C2342Ws1<>((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void k(JN jn, Runnable runnable, int i) {
        jn.g(runnable, BX1.g, (i & 4) == 0);
    }

    public final int c() {
        synchronized (this.k) {
            try {
                if (n.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = m;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.d) {
                    return 0;
                }
                if (i >= this.e) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.k.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(i3);
                this.k.c(i3, aVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                aVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC6788tX1 abstractRunnableC6788tX1D;
        if (n.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !Intrinsics.a(JN.this, this)) {
                aVar = null;
            }
            synchronized (this.k) {
                i = (int) (m.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    a aVarB = this.k.b(i2);
                    Intrinsics.checkNotNull(aVarB);
                    a aVar2 = aVarB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        C7889yk2 c7889yk2 = aVar2.d;
                        C6005pm0 c6005pm0 = this.j;
                        c7889yk2.getClass();
                        AbstractRunnableC6788tX1 abstractRunnableC6788tX1 = (AbstractRunnableC6788tX1) C7889yk2.b.getAndSet(c7889yk2, null);
                        if (abstractRunnableC6788tX1 != null) {
                            c6005pm0.a(abstractRunnableC6788tX1);
                        }
                        while (true) {
                            AbstractRunnableC6788tX1 abstractRunnableC6788tX1B = c7889yk2.b();
                            if (abstractRunnableC6788tX1B == null) {
                                break;
                            } else {
                                c6005pm0.a(abstractRunnableC6788tX1B);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.j.b();
            this.i.b();
            while (true) {
                if (aVar != null) {
                    abstractRunnableC6788tX1D = aVar.a(true);
                    if (abstractRunnableC6788tX1D == null) {
                        abstractRunnableC6788tX1D = this.i.d();
                        if (abstractRunnableC6788tX1D == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC6788tX1D = this.i.d();
                    if (abstractRunnableC6788tX1D == null && (abstractRunnableC6788tX1D = this.j.d()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC6788tX1D.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.i);
            }
            l.set(this, 0L);
            m.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull Runnable runnable) {
        k(this, runnable, 6);
    }

    public final void g(@NotNull Runnable runnable, @NotNull C6998uX1 c6998uX1, boolean z) {
        AbstractRunnableC6788tX1 c7419wX1;
        b bVar;
        BX1.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC6788tX1) {
            c7419wX1 = (AbstractRunnableC6788tX1) runnable;
            c7419wX1.d = jNanoTime;
            c7419wX1.e = c6998uX1;
        } else {
            c7419wX1 = new C7419wX1(runnable, jNanoTime, c6998uX1);
        }
        boolean z2 = false;
        boolean z3 = c7419wX1.e.a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !Intrinsics.a(JN.this, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.g) != b.i && (c7419wX1.e.a != 0 || bVar != b.e)) {
            aVar.k = true;
            C7889yk2 c7889yk2 = aVar.d;
            if (z) {
                c7419wX1 = c7889yk2.a(c7419wX1);
            } else {
                c7889yk2.getClass();
                AbstractRunnableC6788tX1 abstractRunnableC6788tX1 = (AbstractRunnableC6788tX1) C7889yk2.b.getAndSet(c7889yk2, c7419wX1);
                c7419wX1 = abstractRunnableC6788tX1 == null ? null : c7889yk2.a(abstractRunnableC6788tX1);
            }
        }
        if (c7419wX1 != null) {
            if (!(c7419wX1.e.a == 1 ? this.j.a(c7419wX1) : this.i.a(c7419wX1))) {
                throw new RejectedExecutionException(C5807oq.b(new StringBuilder(), this.h, " was terminated"));
            }
        }
        if (z && aVar != null) {
            z2 = true;
        }
        if (z3) {
            if (z2 || q() || p(jAddAndGet)) {
                return;
            }
            q();
            return;
        }
        if (z2 || q() || p(atomicLongFieldUpdater.get(this))) {
            return;
        }
        q();
    }

    public final void l(@NotNull a aVar, int i, int i2) {
        while (true) {
            long j = l.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == o) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (l.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean p(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.d;
        if (i < i2) {
            int iC = c();
            if (iC == 1 && i2 > 1) {
                c();
            }
            if (iC > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        GW1 gw1;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = l;
            long j = atomicLongFieldUpdater.get(this);
            a aVarB = this.k.b((int) (2097151 & j));
            if (aVarB == null) {
                aVarB = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = aVarB.c();
                while (true) {
                    gw1 = o;
                    if (objC == gw1) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar = (a) objC;
                    iB = aVar.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j2 | ((long) iB))) {
                    aVarB.g(gw1);
                }
            }
            if (aVarB == null) {
                return false;
            }
            if (a.m.compareAndSet(aVarB, -1, 0)) {
                LockSupport.unpark(aVarB);
                return true;
            }
        }
    }

    @NotNull
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C2342Ws1<a> c2342Ws1 = this.k;
        int iA = c2342Ws1.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            a aVarB = c2342Ws1.b(i6);
            if (aVarB != null) {
                C7889yk2 c7889yk2 = aVarB.d;
                c7889yk2.getClass();
                int i7 = C7889yk2.b.get(c7889yk2) != null ? (C7889yk2.c.get(c7889yk2) - C7889yk2.d.get(c7889yk2)) + 1 : C7889yk2.c.get(c7889yk2) - C7889yk2.d.get(c7889yk2);
                int iOrdinal = aVarB.g.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iOrdinal == 4) {
                    i5++;
                }
            }
        }
        long j = m.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.h);
        sb4.append('@');
        sb4.append(C3787fU.f(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.d;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.i.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.j.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}

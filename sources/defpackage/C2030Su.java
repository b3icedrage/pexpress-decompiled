package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2030Su<E> implements InterfaceC1733Oz<E> {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(C2030Su.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(C2030Su.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(C2030Su.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(C2030Su.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(C2030Su.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(C2030Su.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(C2030Su.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(C2030Su.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(C2030Su.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: Su$a */
    public final class a implements InterfaceC2621Zz<E>, InterfaceC7449wf2 {

        @Nullable
        public Object d = C2450Xu.p;

        @Nullable
        public C6251qy<? super Boolean> e;

        public a() {
        }

        @Override // defpackage.InterfaceC2621Zz
        @Nullable
        public final Object a(@NotNull LM frame) throws Throwable {
            C3727fA<E> c3727fAS;
            Boolean bool;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2030Su.k;
            C2030Su<E> c2030Su = C2030Su.this;
            C3727fA<E> c3727fA = (C3727fA) atomicReferenceFieldUpdater.get(c2030Su);
            while (!c2030Su.z()) {
                long andIncrement = C2030Su.g.getAndIncrement(c2030Su);
                long j = C2450Xu.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (c3727fA.g != j2) {
                    c3727fAS = c2030Su.s(j2, c3727fA);
                    if (c3727fAS == null) {
                        continue;
                    }
                } else {
                    c3727fAS = c3727fA;
                }
                Object objK = c2030Su.K(c3727fAS, i, andIncrement, null);
                GW1 gw1 = C2450Xu.m;
                if (objK == gw1) {
                    throw new IllegalStateException("unreachable");
                }
                GW1 gw2 = C2450Xu.o;
                if (objK != gw2) {
                    if (objK != C2450Xu.n) {
                        c3727fAS.b();
                        this.d = objK;
                        return Boolean.TRUE;
                    }
                    C2030Su<E> c2030Su2 = C2030Su.this;
                    C6251qy<? super Boolean> c6251qyJ = C3476e.j(C5885pC0.b(frame));
                    try {
                        this.e = c6251qyJ;
                        Object objK2 = c2030Su2.K(c3727fAS, i, andIncrement, this);
                        if (objK2 != gw1) {
                            if (objK2 == gw2) {
                                if (andIncrement < c2030Su2.w()) {
                                    c3727fAS.b();
                                }
                                C3727fA<E> c3727fA2 = (C3727fA) C2030Su.k.get(c2030Su2);
                                while (true) {
                                    if (c2030Su2.z()) {
                                        C6251qy<? super Boolean> c6251qy = this.e;
                                        Intrinsics.checkNotNull(c6251qy);
                                        this.e = null;
                                        this.d = C2450Xu.l;
                                        Throwable thT = c2030Su.t();
                                        if (thT != null) {
                                            C1717Ot1.a aVar = C1717Ot1.e;
                                            c6251qy.resumeWith(C1795Pt1.a(thT));
                                            break;
                                        }
                                        C1717Ot1.a aVar2 = C1717Ot1.e;
                                        c6251qy.resumeWith(Boolean.FALSE);
                                        break;
                                    }
                                    long andIncrement2 = C2030Su.g.getAndIncrement(c2030Su2);
                                    long j3 = C2450Xu.b;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (c3727fA2.g != j4) {
                                        C3727fA<E> c3727fAS2 = c2030Su2.s(j4, c3727fA2);
                                        if (c3727fAS2 != null) {
                                            c3727fA2 = c3727fAS2;
                                        }
                                    }
                                    Object objK3 = c2030Su2.K(c3727fA2, i2, andIncrement2, this);
                                    if (objK3 == C2450Xu.m) {
                                        c(c3727fA2, i2);
                                        break;
                                    }
                                    if (objK3 == C2450Xu.o) {
                                        if (andIncrement2 < c2030Su2.w()) {
                                            c3727fA2.b();
                                        }
                                    } else {
                                        if (objK3 == C2450Xu.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c3727fA2.b();
                                        this.d = objK3;
                                        this.e = null;
                                        bool = Boolean.TRUE;
                                    }
                                }
                            } else {
                                c3727fAS.b();
                                this.d = objK2;
                                this.e = null;
                                bool = Boolean.TRUE;
                            }
                            c6251qyJ.m(bool, null);
                            break;
                        }
                        c(c3727fAS, i);
                        Object objQ = c6251qyJ.q();
                        if (objQ == MN.d) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        return objQ;
                    } catch (Throwable th) {
                        c6251qyJ.z();
                        throw th;
                    }
                }
                if (andIncrement < c2030Su.w()) {
                    c3727fAS.b();
                }
                c3727fA = c3727fAS;
            }
            this.d = C2450Xu.l;
            Throwable thT2 = c2030Su.t();
            if (thT2 == null) {
                return Boolean.FALSE;
            }
            int i3 = VO1.a;
            throw thT2;
        }

        @Override // defpackage.InterfaceC7449wf2
        public final void c(@NotNull AbstractC7992zE1<?> abstractC7992zE1, int i) {
            C6251qy<? super Boolean> c6251qy = this.e;
            if (c6251qy != null) {
                c6251qy.c(abstractC7992zE1, i);
            }
        }

        @Override // defpackage.InterfaceC2621Zz
        public final E next() throws Throwable {
            E e = (E) this.d;
            GW1 gw1 = C2450Xu.p;
            if (e == gw1) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.d = gw1;
            if (e != C2450Xu.l) {
                return e;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = C2030Su.e;
            Throwable thU = C2030Su.this.u();
            int i = VO1.a;
            throw thU;
        }
    }

    /* JADX INFO: renamed from: Su$b */
    public static final class b implements InterfaceC7449wf2 {
        @Override // defpackage.InterfaceC7449wf2
        public final void c(@NotNull AbstractC7992zE1<?> abstractC7992zE1, int i) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: Su$c */
    public /* synthetic */ class c extends C2784ak0 implements InterfaceC1060Gj0<C2030Su<?>, InterfaceC3744fF1<?>, Object, Unit> {
        public static final c m = new c(3, C2030Su.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final Unit k(C2030Su<?> c2030Su, InterfaceC3744fF1<?> interfaceC3744fF1, Object obj) {
            C3727fA<?> c3727fA;
            C2030Su<?> c2030Su2 = c2030Su;
            InterfaceC3744fF1<?> interfaceC3744fF2 = interfaceC3744fF1;
            AtomicLongFieldUpdater atomicLongFieldUpdater = C2030Su.e;
            c2030Su2.getClass();
            C3727fA<?> c3727fA2 = (C3727fA) C2030Su.k.get(c2030Su2);
            while (!c2030Su2.z()) {
                long andIncrement = C2030Su.g.getAndIncrement(c2030Su2);
                long j = C2450Xu.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (c3727fA2.g != j2) {
                    C3727fA<?> c3727fAS = c2030Su2.s(j2, c3727fA2);
                    if (c3727fAS == null) {
                        continue;
                    } else {
                        c3727fA = c3727fAS;
                    }
                } else {
                    c3727fA = c3727fA2;
                }
                Object objK = c2030Su2.K(c3727fA, i, andIncrement, interfaceC3744fF2);
                C3727fA<?> c3727fA3 = c3727fA;
                if (objK == C2450Xu.m) {
                    InterfaceC7449wf2 interfaceC7449wf2 = interfaceC3744fF2 instanceof InterfaceC7449wf2 ? (InterfaceC7449wf2) interfaceC3744fF2 : null;
                    if (interfaceC7449wf2 != null) {
                        interfaceC7449wf2.c(c3727fA3, i);
                    }
                } else if (objK == C2450Xu.o) {
                    if (andIncrement < c2030Su2.w()) {
                        c3727fA3.b();
                    }
                    c3727fA2 = c3727fA3;
                } else {
                    if (objK == C2450Xu.n) {
                        throw new IllegalStateException("unexpected");
                    }
                    c3727fA3.b();
                    interfaceC3744fF2.e(objK);
                }
                return Unit.a;
            }
            interfaceC3744fF2.e(C2450Xu.l);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Su$d */
    public /* synthetic */ class d extends C2784ak0 implements InterfaceC1060Gj0<C2030Su<?>, Object, Object, Object> {
        public static final d m = new d(3, C2030Su.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(C2030Su<?> c2030Su, Object obj, Object obj2) {
            C2030Su<?> c2030Su2 = c2030Su;
            AtomicLongFieldUpdater atomicLongFieldUpdater = C2030Su.e;
            c2030Su2.getClass();
            if (obj2 == C2450Xu.l) {
                obj2 = new C3308dA.a(c2030Su2.t());
            }
            return new C3308dA(obj2);
        }
    }

    public C2030Su(int i2) {
        this.d = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(C1332Jw.a(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C3727fA<Object> c3727fA = C2450Xu.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = h.get(this);
        C3727fA<Object> c3727fA2 = new C3727fA<>(0L, null, this, 3);
        this.sendSegment$volatile = c3727fA2;
        this.receiveSegment$volatile = c3727fA2;
        if (B()) {
            c3727fA2 = C2450Xu.a;
            Intrinsics.c(c3727fA2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c3727fA2;
        this._closeCause$volatile = C2450Xu.s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object F(C2030Su c2030Su, LM lm) {
        C2186Uu c2186Uu;
        C3727fA<E> c3727fA;
        if (lm instanceof C2186Uu) {
            c2186Uu = (C2186Uu) lm;
            int i2 = c2186Uu.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2186Uu.g = i2 - Integer.MIN_VALUE;
            } else {
                c2186Uu = new C2186Uu(c2030Su, lm);
            }
        } else {
            c2186Uu = new C2186Uu(c2030Su, lm);
        }
        C2186Uu c2186Uu2 = c2186Uu;
        Object obj = c2186Uu2.d;
        MN mn = MN.d;
        int i3 = c2186Uu2.g;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return ((C3308dA) obj).a;
        }
        C1795Pt1.b(obj);
        C3727fA<E> c3727fA2 = (C3727fA) k.get(c2030Su);
        while (!c2030Su.z()) {
            long andIncrement = g.getAndIncrement(c2030Su);
            long j2 = C2450Xu.b;
            long j3 = andIncrement / j2;
            int i4 = (int) (andIncrement % j2);
            if (c3727fA2.g != j3) {
                C3727fA<E> c3727fAS = c2030Su.s(j3, c3727fA2);
                if (c3727fAS == null) {
                    continue;
                } else {
                    c3727fA = c3727fAS;
                }
            } else {
                c3727fA = c3727fA2;
            }
            C2030Su c2030Su2 = c2030Su;
            Object objK = c2030Su2.K(c3727fA, i4, andIncrement, null);
            if (objK == C2450Xu.m) {
                throw new IllegalStateException("unexpected");
            }
            if (objK != C2450Xu.o) {
                if (objK != C2450Xu.n) {
                    c3727fA.b();
                    return objK;
                }
                c2186Uu2.g = 1;
                Object objG = c2030Su2.G(c3727fA, i4, andIncrement, c2186Uu2);
                return objG == mn ? mn : objG;
            }
            if (andIncrement < c2030Su2.w()) {
                c3727fA.b();
            }
            c2030Su = c2030Su2;
            c3727fA2 = c3727fA;
        }
        return new C3308dA.a(c2030Su.t());
    }

    public static final C3727fA b(C2030Su c2030Su, long j2, C3727fA c3727fA) {
        Object objD;
        C2030Su c2030Su2;
        c2030Su.getClass();
        C3727fA<Object> c3727fA2 = C2450Xu.a;
        C2346Wu c2346Wu = C2346Wu.m;
        loop0: while (true) {
            objD = C4994l.d(c3727fA, j2, c2346Wu);
            if (!C6621sj.i(objD)) {
                AbstractC7992zE1 abstractC7992zE1F = C6621sj.f(objD);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                    AbstractC7992zE1 abstractC7992zE1 = (AbstractC7992zE1) atomicReferenceFieldUpdater.get(c2030Su);
                    if (abstractC7992zE1.g >= abstractC7992zE1F.g) {
                        break loop0;
                    }
                    if (!abstractC7992zE1F.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c2030Su, abstractC7992zE1, abstractC7992zE1F)) {
                            if (!abstractC7992zE1.f()) {
                                break loop0;
                            }
                            abstractC7992zE1.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(c2030Su) == abstractC7992zE1);
                    if (abstractC7992zE1F.f()) {
                        abstractC7992zE1F.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zI = C6621sj.i(objD);
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if (zI) {
            c2030Su.o();
            if (c3727fA.g * ((long) C2450Xu.b) < atomicLongFieldUpdater.get(c2030Su)) {
                c3727fA.b();
                return null;
            }
        } else {
            C3727fA c3727fA3 = (C3727fA) C6621sj.f(objD);
            long j3 = c3727fA3.g;
            if (j3 <= j2) {
                return c3727fA3;
            }
            long j4 = ((long) C2450Xu.b) * j3;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
                long j5 = atomicLongFieldUpdater2.get(c2030Su);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    c2030Su2 = c2030Su;
                    break;
                }
                c2030Su2 = c2030Su;
                if (atomicLongFieldUpdater2.compareAndSet(c2030Su2, j5, j6 + (((long) ((int) (j5 >> 60))) << 60))) {
                    break;
                }
                c2030Su = c2030Su2;
            }
            if (j3 * ((long) C2450Xu.b) < atomicLongFieldUpdater.get(c2030Su2)) {
                c3727fA3.b();
            }
        }
        return null;
    }

    public static final void c(C2030Su c2030Su, Object obj, C6251qy c6251qy) {
        c2030Su.getClass();
        Throwable thV = c2030Su.v();
        C1717Ot1.a aVar = C1717Ot1.e;
        c6251qy.resumeWith(C1795Pt1.a(thV));
    }

    public static final int f(C2030Su c2030Su, C3727fA c3727fA, int i2, Object obj, long j2, Object obj2, boolean z) {
        c2030Su.getClass();
        c3727fA.n(i2, obj);
        if (z) {
            return c2030Su.L(c3727fA, i2, obj, j2, obj2, z);
        }
        Object objL = c3727fA.l(i2);
        if (objL == null) {
            if (c2030Su.g(j2)) {
                if (c3727fA.k(i2, null, C2450Xu.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c3727fA.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof InterfaceC7449wf2) {
            c3727fA.n(i2, null);
            if (c2030Su.I(objL, obj)) {
                c3727fA.o(i2, C2450Xu.i);
                return 0;
            }
            GW1 gw1 = C2450Xu.k;
            if (c3727fA.j.getAndSet((i2 * 2) + 1, gw1) == gw1) {
                return 5;
            }
            c3727fA.m(i2, true);
            return 5;
        }
        return c2030Su.L(c3727fA, i2, obj, j2, obj2, z);
    }

    public static void x(C2030Su c2030Su) {
        c2030Su.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if ((atomicLongFieldUpdater.addAndGet(c2030Su, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c2030Su) & 4611686018427387904L) != 0) {
            }
        }
    }

    public boolean A() {
        return false;
    }

    public final boolean B() {
        long j2 = h.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    public final void C(long j2, C3727fA<E> c3727fA) {
        C3727fA<E> c3727fA2;
        C3727fA<E> c3727fA3;
        while (c3727fA.g < j2 && (c3727fA3 = (C3727fA) c3727fA.c()) != null) {
            c3727fA = c3727fA3;
        }
        while (true) {
            if (!c3727fA.d() || (c3727fA2 = (C3727fA) c3727fA.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
                    AbstractC7992zE1 abstractC7992zE1 = (AbstractC7992zE1) atomicReferenceFieldUpdater.get(this);
                    if (abstractC7992zE1.g >= c3727fA.g) {
                        return;
                    }
                    if (!c3727fA.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC7992zE1, c3727fA)) {
                            if (abstractC7992zE1.f()) {
                                abstractC7992zE1.e();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC7992zE1);
                    if (c3727fA.f()) {
                        c3727fA.e();
                    }
                }
            } else {
                c3727fA = c3727fA2;
            }
        }
    }

    public final Object E(JM frame, Object obj) {
        C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
        c6251qy.r();
        Throwable thV = v();
        C1717Ot1.a aVar = C1717Ot1.e;
        c6251qy.resumeWith(C1795Pt1.a(thV));
        Object objQ = c6251qy.q();
        MN mn = MN.d;
        if (objQ == mn) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objQ == mn ? objQ : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object G(C3727fA c3727fA, int i2, long j2, LM lm) {
        C2264Vu frame;
        C3308dA c3308dA;
        C3727fA<E> c3727fAS;
        if (lm instanceof C2264Vu) {
            frame = (C2264Vu) lm;
            int i3 = frame.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                frame.g = i3 - Integer.MIN_VALUE;
            } else {
                frame = new C2264Vu(this, lm);
            }
        } else {
            frame = new C2264Vu(this, lm);
        }
        Object objQ = frame.d;
        MN mn = MN.d;
        int i4 = frame.g;
        if (i4 == 0) {
            C1795Pt1.b(objQ);
            frame.g = 1;
            C6251qy c6251qyJ = C3476e.j(C5885pC0.b(frame));
            try {
                C0686Bo1 c0686Bo1 = new C0686Bo1(c6251qyJ);
                Object objK = K(c3727fA, i2, j2, c0686Bo1);
                if (objK != C2450Xu.m) {
                    if (objK == C2450Xu.o) {
                        if (j2 < w()) {
                            c3727fA.b();
                        }
                        C3727fA<E> c3727fA2 = (C3727fA) k.get(this);
                        while (true) {
                            if (z()) {
                                C1717Ot1.a aVar = C1717Ot1.e;
                                c6251qyJ.resumeWith(new C3308dA(new C3308dA.a(t())));
                                break;
                            }
                            long andIncrement = g.getAndIncrement(this);
                            long j3 = C2450Xu.b;
                            long j4 = andIncrement / j3;
                            int i5 = (int) (andIncrement % j3);
                            if (c3727fA2.g != j4) {
                                c3727fAS = s(j4, c3727fA2);
                                if (c3727fAS == null) {
                                }
                            } else {
                                c3727fAS = c3727fA2;
                            }
                            Object objK2 = K(c3727fAS, i5, andIncrement, c0686Bo1);
                            if (objK2 == C2450Xu.m) {
                                c0686Bo1.c(c3727fAS, i5);
                                break;
                            }
                            if (objK2 == C2450Xu.o) {
                                if (andIncrement < w()) {
                                    c3727fAS.b();
                                }
                                c3727fA2 = c3727fAS;
                            } else {
                                if (objK2 == C2450Xu.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c3727fAS.b();
                                c3308dA = new C3308dA(objK2);
                            }
                        }
                    } else {
                        c3727fA.b();
                        c3308dA = new C3308dA(objK);
                    }
                    c6251qyJ.m(c3308dA, null);
                    break;
                }
                c0686Bo1.c(c3727fA, i2);
                objQ = c6251qyJ.q();
                if (objQ == MN.d) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objQ == mn) {
                    return mn;
                }
            } catch (Throwable th) {
                c6251qyJ.z();
                throw th;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objQ);
        }
        return ((C3308dA) objQ).a;
    }

    public final void H(InterfaceC7449wf2 interfaceC7449wf2, boolean z) {
        if (interfaceC7449wf2 instanceof b) {
            ((b) interfaceC7449wf2).getClass();
            C1717Ot1.a aVar = C1717Ot1.e;
            throw null;
        }
        if (interfaceC7449wf2 instanceof InterfaceC6041py) {
            JM jm = (JM) interfaceC7449wf2;
            C1717Ot1.a aVar2 = C1717Ot1.e;
            jm.resumeWith(C1795Pt1.a(z ? u() : v()));
            return;
        }
        if (interfaceC7449wf2 instanceof C0686Bo1) {
            C6251qy<C3308dA<? extends E>> c6251qy = ((C0686Bo1) interfaceC7449wf2).d;
            C1717Ot1.a aVar3 = C1717Ot1.e;
            c6251qy.resumeWith(new C3308dA(new C3308dA.a(t())));
            return;
        }
        if (!(interfaceC7449wf2 instanceof a)) {
            if (interfaceC7449wf2 instanceof InterfaceC3744fF1) {
                ((InterfaceC3744fF1) interfaceC7449wf2).b(this, C2450Xu.l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + interfaceC7449wf2).toString());
            }
        }
        a aVar4 = (a) interfaceC7449wf2;
        C6251qy<? super Boolean> c6251qy2 = aVar4.e;
        Intrinsics.checkNotNull(c6251qy2);
        aVar4.e = null;
        aVar4.d = C2450Xu.l;
        Throwable thT = C2030Su.this.t();
        if (thT == null) {
            C1717Ot1.a aVar5 = C1717Ot1.e;
            c6251qy2.resumeWith(Boolean.FALSE);
        } else {
            C1717Ot1.a aVar6 = C1717Ot1.e;
            c6251qy2.resumeWith(C1795Pt1.a(thT));
        }
    }

    public final boolean I(Object obj, E e2) {
        if (obj instanceof InterfaceC3744fF1) {
            return ((InterfaceC3744fF1) obj).b(this, e2);
        }
        if (obj instanceof C0686Bo1) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return C2450Xu.a(((C0686Bo1) obj).d, new C3308dA(e2), null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof InterfaceC6041py) {
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return C2450Xu.a((InterfaceC6041py) obj, e2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C6251qy<? super Boolean> c6251qy = aVar.e;
        Intrinsics.checkNotNull(c6251qy);
        aVar.e = null;
        aVar.d = e2;
        Boolean bool = Boolean.TRUE;
        C2030Su.this.getClass();
        return C2450Xu.a(c6251qy, bool, null);
    }

    public final boolean J(Object obj, C3727fA<E> c3727fA, int i2) {
        EnumC6700t52 enumC6700t52;
        if (obj instanceof InterfaceC6041py) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return C2450Xu.a((InterfaceC6041py) obj, Unit.a, null);
        }
        if (!(obj instanceof InterfaceC3744fF1)) {
            if (obj instanceof b) {
                ((b) obj).getClass();
                C2450Xu.a(null, Boolean.TRUE, null);
                throw null;
            }
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int iJ = ((VE1) obj).j(this, Unit.a);
        C3954gF1.a aVar = C3954gF1.a;
        if (iJ == 0) {
            enumC6700t52 = EnumC6700t52.d;
        } else if (iJ == 1) {
            enumC6700t52 = EnumC6700t52.e;
        } else if (iJ == 2) {
            enumC6700t52 = EnumC6700t52.g;
        } else {
            if (iJ != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iJ).toString());
            }
            enumC6700t52 = EnumC6700t52.h;
        }
        if (enumC6700t52 == EnumC6700t52.e) {
            c3727fA.n(i2, null);
        }
        return enumC6700t52 == EnumC6700t52.d;
    }

    public final Object K(C3727fA<E> c3727fA, int i2, long j2, Object obj) {
        Object objL = c3727fA.l(i2);
        AtomicReferenceArray atomicReferenceArray = c3727fA.j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (objL == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return C2450Xu.n;
                }
                if (c3727fA.k(i2, objL, obj)) {
                    q();
                    return C2450Xu.m;
                }
            }
        } else if (objL == C2450Xu.d && c3727fA.k(i2, objL, C2450Xu.i)) {
            q();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            c3727fA.n(i2, null);
            return obj2;
        }
        while (true) {
            Object objL2 = c3727fA.l(i2);
            if (objL2 == null || objL2 == C2450Xu.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c3727fA.k(i2, objL2, C2450Xu.h)) {
                        q();
                        return C2450Xu.o;
                    }
                } else {
                    if (obj == null) {
                        return C2450Xu.n;
                    }
                    if (c3727fA.k(i2, objL2, obj)) {
                        q();
                        return C2450Xu.m;
                    }
                }
            } else if (objL2 != C2450Xu.d) {
                GW1 gw1 = C2450Xu.j;
                if (objL2 == gw1) {
                    return C2450Xu.o;
                }
                if (objL2 == C2450Xu.h) {
                    return C2450Xu.o;
                }
                if (objL2 == C2450Xu.l) {
                    q();
                    return C2450Xu.o;
                }
                if (objL2 != C2450Xu.g && c3727fA.k(i2, objL2, C2450Xu.f)) {
                    boolean z = objL2 instanceof C7869yf2;
                    if (z) {
                        objL2 = ((C7869yf2) objL2).a;
                    }
                    if (J(objL2, c3727fA, i2)) {
                        c3727fA.o(i2, C2450Xu.i);
                        q();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        c3727fA.n(i2, null);
                        return obj3;
                    }
                    c3727fA.o(i2, gw1);
                    c3727fA.i();
                    if (z) {
                        q();
                    }
                    return C2450Xu.o;
                }
            } else if (c3727fA.k(i2, objL2, C2450Xu.i)) {
                q();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                c3727fA.n(i2, null);
                return obj4;
            }
        }
    }

    public final int L(C3727fA<E> c3727fA, int i2, E e2, long j2, Object obj, boolean z) {
        while (true) {
            Object objL = c3727fA.l(i2);
            if (objL == null) {
                if (!g(j2) || z) {
                    if (z) {
                        if (c3727fA.k(i2, null, C2450Xu.j)) {
                            c3727fA.i();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (c3727fA.k(i2, null, obj)) {
                            return 2;
                        }
                    }
                } else if (c3727fA.k(i2, null, C2450Xu.d)) {
                    break;
                }
            } else {
                if (objL != C2450Xu.e) {
                    GW1 gw1 = C2450Xu.k;
                    if (objL == gw1) {
                        c3727fA.n(i2, null);
                        return 5;
                    }
                    if (objL == C2450Xu.h) {
                        c3727fA.n(i2, null);
                        return 5;
                    }
                    if (objL == C2450Xu.l) {
                        c3727fA.n(i2, null);
                        o();
                        return 4;
                    }
                    c3727fA.n(i2, null);
                    if (objL instanceof C7869yf2) {
                        objL = ((C7869yf2) objL).a;
                    }
                    if (I(objL, e2)) {
                        c3727fA.o(i2, C2450Xu.i);
                        return 0;
                    }
                    if (c3727fA.j.getAndSet((i2 * 2) + 1, gw1) != gw1) {
                        c3727fA.m(i2, true);
                    }
                    return 5;
                }
                if (c3727fA.k(i2, objL, C2450Xu.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void M(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C2030Su<E> c2030Su = this;
        if (c2030Su.B()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = h;
            if (atomicLongFieldUpdater.get(c2030Su) > j2) {
                break;
            } else {
                c2030Su = this;
            }
        }
        int i2 = C2450Xu.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = i;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(c2030Su);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(c2030Su)) && j3 == atomicLongFieldUpdater.get(c2030Su)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(c2030Su);
                    if (atomicLongFieldUpdater2.compareAndSet(c2030Su, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c2030Su = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(c2030Su);
                    long j6 = atomicLongFieldUpdater2.get(c2030Su);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(c2030Su)) {
                        break;
                    }
                    if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j6, 4611686018427387904L + j7);
                    }
                    c2030Su = this;
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(c2030Su);
                    if (atomicLongFieldUpdater2.compareAndSet(c2030Su, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        c2030Su = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC7364wF1
    public final boolean a(@Nullable Throwable th) {
        return k(th, false);
    }

    @Override // defpackage.InterfaceC0764Co1
    @NotNull
    public final KE1 d() {
        F62.e(3, c.m);
        F62.e(3, d.m);
        return new KE1(this, null);
    }

    @Override // defpackage.InterfaceC0764Co1
    @NotNull
    public final Object e() {
        C3727fA<E> c3727fA;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        long j2 = atomicLongFieldUpdater.get(this);
        long j3 = e.get(this);
        if (y(j3, true)) {
            return new C3308dA.a(t());
        }
        long j4 = j3 & 1152921504606846975L;
        C3308dA.b bVar = C3308dA.b;
        if (j2 >= j4) {
            return bVar;
        }
        Object obj = C2450Xu.k;
        C3727fA<E> c3727fA2 = (C3727fA) k.get(this);
        while (!z()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = C2450Xu.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (c3727fA2.g != j6) {
                C3727fA<E> c3727fAS = s(j6, c3727fA2);
                if (c3727fAS == null) {
                    continue;
                } else {
                    c3727fA = c3727fAS;
                }
            } else {
                c3727fA = c3727fA2;
            }
            Object objK = K(c3727fA, i2, andIncrement, obj);
            C3727fA<E> c3727fA3 = c3727fA;
            if (objK == C2450Xu.m) {
                InterfaceC7449wf2 interfaceC7449wf2 = obj instanceof InterfaceC7449wf2 ? (InterfaceC7449wf2) obj : null;
                if (interfaceC7449wf2 != null) {
                    interfaceC7449wf2.c(c3727fA3, i2);
                }
                M(andIncrement);
                c3727fA3.i();
                return bVar;
            }
            if (objK != C2450Xu.o) {
                if (objK == C2450Xu.n) {
                    throw new IllegalStateException("unexpected");
                }
                c3727fA3.b();
                return objK;
            }
            if (andIncrement < w()) {
                c3727fA3.b();
            }
            c3727fA2 = c3727fA3;
        }
        return new C3308dA.a(t());
    }

    public final boolean g(long j2) {
        return j2 < h.get(this) || j2 < g.get(this) + ((long) this.d);
    }

    @Override // defpackage.InterfaceC0764Co1
    @Nullable
    public final Object h(@NotNull JM<? super E> frame) throws Throwable {
        C3727fA<E> c3727fA;
        Throwable th;
        C3727fA<E> c3727fA2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        C3727fA<E> c3727fA3 = (C3727fA) atomicReferenceFieldUpdater.get(this);
        while (!z()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = C2450Xu.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (c3727fA3.g != j3) {
                C3727fA<E> c3727fAS = s(j3, c3727fA3);
                if (c3727fAS == null) {
                    continue;
                } else {
                    c3727fA = c3727fAS;
                }
            } else {
                c3727fA = c3727fA3;
            }
            Object objK = K(c3727fA, i2, andIncrement, null);
            GW1 gw1 = C2450Xu.m;
            if (objK == gw1) {
                throw new IllegalStateException("unexpected");
            }
            GW1 gw2 = C2450Xu.o;
            if (objK == gw2) {
                if (andIncrement < w()) {
                    c3727fA.b();
                }
                c3727fA3 = c3727fA;
            } else {
                if (objK != C2450Xu.n) {
                    c3727fA.b();
                    return objK;
                }
                C6251qy c6251qyJ = C3476e.j(C5885pC0.b(frame));
                C2030Su<E> c2030Su = this;
                try {
                    Object objK2 = c2030Su.K(c3727fA, i2, andIncrement, c6251qyJ);
                    if (objK2 == gw1) {
                        c6251qyJ.c(c3727fA, i2);
                    } else if (objK2 == gw2) {
                        if (andIncrement < w()) {
                            c3727fA.b();
                        }
                        C3727fA<E> c3727fA4 = (C3727fA) atomicReferenceFieldUpdater.get(this);
                        while (true) {
                            if (z()) {
                                C1717Ot1.a aVar = C1717Ot1.e;
                                c6251qyJ.resumeWith(C1795Pt1.a(u()));
                                break;
                            }
                            C6251qy c6251qy = c6251qyJ;
                            try {
                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                long j4 = C2450Xu.b;
                                long j5 = andIncrement2 / j4;
                                int i3 = (int) (andIncrement2 % j4);
                                if (c3727fA4.g != j5) {
                                    try {
                                        C3727fA<E> c3727fAS2 = s(j5, c3727fA4);
                                        if (c3727fAS2 == null) {
                                            c6251qyJ = c6251qy;
                                        } else {
                                            c3727fA2 = c3727fAS2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c6251qyJ = c6251qy;
                                        c6251qyJ.z();
                                        throw th;
                                    }
                                } else {
                                    c3727fA2 = c3727fA4;
                                }
                                Object objK3 = c2030Su.K(c3727fA2, i3, andIncrement2, c6251qy);
                                C3727fA<E> c3727fA5 = c3727fA2;
                                c6251qyJ = c6251qy;
                                if (objK3 == C2450Xu.m) {
                                    c6251qyJ.c(c3727fA5, i3);
                                    break;
                                }
                                if (objK3 != C2450Xu.o) {
                                    if (objK3 == C2450Xu.n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c3727fA5.b();
                                    c6251qyJ.m(objK3, null);
                                    break;
                                }
                                if (andIncrement2 < w()) {
                                    c3727fA5.b();
                                }
                                c2030Su = this;
                                c3727fA4 = c3727fA5;
                            } catch (Throwable th3) {
                                th = th3;
                                c6251qyJ = c6251qy;
                                th = th;
                                c6251qyJ.z();
                                throw th;
                            }
                        }
                    } else {
                        c3727fA.b();
                        c6251qyJ.m(objK2, null);
                    }
                    Object objQ = c6251qyJ.q();
                    if (objQ == MN.d) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    return objQ;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thU = u();
        int i4 = VO1.a;
        throw thU;
    }

    @Override // defpackage.InterfaceC7364wF1
    public final void i(@NotNull C0899Eh1 c0899Eh1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c0899Eh1)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            GW1 gw1 = C2450Xu.q;
            if (obj != gw1) {
                if (obj == C2450Xu.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            GW1 gw2 = C2450Xu.r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, gw1, gw2)) {
                    c0899Eh1.invoke(t());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == gw1);
        }
    }

    @Override // defpackage.InterfaceC0764Co1
    @NotNull
    public final InterfaceC2621Zz<E> iterator() {
        return new a();
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0174  */
    /* JADX WARN: Code duplicated, block: B:96:0x017e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0182 A[RETURN] */
    @Override // defpackage.InterfaceC7364wF1
    @Nullable
    public Object j(@NotNull JM frame, Object obj) throws Throwable {
        Unit unit;
        Object objQ;
        MN mn;
        Object obj2;
        C2030Su<E> c2030Su;
        C3727fA c3727fA;
        boolean z;
        C2030Su<E> c2030Su2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        C3727fA c3727fA2 = (C3727fA) atomicReferenceFieldUpdater.get(c2030Su2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c2030Su2);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zY = c2030Su2.y(andIncrement, false);
            int i2 = C2450Xu.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (c3727fA2.g != j4) {
                C3727fA c3727fAB = b(c2030Su2, j4, c3727fA2);
                if (c3727fAB != null) {
                    c3727fA2 = c3727fAB;
                } else if (zY) {
                    Object objE = E(frame, obj);
                    if (objE != MN.d) {
                        break;
                    }
                    return objE;
                }
            }
            int iF = f(c2030Su2, c3727fA2, i3, obj, j2, null, zY);
            if (iF == 0) {
                c3727fA2.b();
            } else {
                if (iF == 1) {
                    break;
                }
                if (iF != 2) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = g;
                    if (iF == 3) {
                        C6251qy c6251qyJ = C3476e.j(C5885pC0.b(frame));
                        Object obj3 = obj;
                        try {
                            int iF2 = f(c2030Su2, c3727fA2, i3, obj3, j2, c6251qyJ, false);
                            try {
                                if (iF2 == 0) {
                                    c3727fA2.b();
                                    C1717Ot1.a aVar = C1717Ot1.e;
                                    unit = Unit.a;
                                } else if (iF2 != 1) {
                                    if (iF2 != 2) {
                                        if (iF2 != 4) {
                                            String str = "unexpected";
                                            if (iF2 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            c3727fA2.b();
                                            C3727fA c3727fA3 = (C3727fA) atomicReferenceFieldUpdater.get(c2030Su2);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c2030Su2);
                                                long j5 = andIncrement2 & 1152921504606846975L;
                                                boolean zY2 = c2030Su2.y(andIncrement2, false);
                                                int i4 = C2450Xu.b;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater;
                                                long j6 = i4;
                                                str = str;
                                                long j7 = j5 / j6;
                                                int i5 = (int) (j5 % j6);
                                                if (c3727fA3.g != j7) {
                                                    C3727fA c3727fAB2 = b(c2030Su2, j7, c3727fA3);
                                                    if (c3727fAB2 != null) {
                                                        z = zY2;
                                                        c3727fA = c3727fAB2;
                                                    } else if (zY2) {
                                                        c(c2030Su2, obj3, c6251qyJ);
                                                        break;
                                                    }
                                                } else {
                                                    c3727fA = c3727fA3;
                                                    z = zY2;
                                                }
                                                int iF3 = f(c2030Su2, c3727fA, i5, obj3, j5, c6251qyJ, z);
                                                Object obj4 = obj3;
                                                c2030Su = c2030Su2;
                                                C3727fA c3727fA4 = c3727fA;
                                                obj2 = obj4;
                                                if (iF3 == 0) {
                                                    c3727fA4.b();
                                                    C1717Ot1.a aVar2 = C1717Ot1.e;
                                                    unit = Unit.a;
                                                } else if (iF3 == 1) {
                                                    C1717Ot1.a aVar3 = C1717Ot1.e;
                                                    unit = Unit.a;
                                                } else if (iF3 == 2) {
                                                    if (!z) {
                                                        c6251qyJ.c(c3727fA4, i5 + i4);
                                                        break;
                                                    }
                                                    c3727fA4.i();
                                                } else {
                                                    if (iF3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iF3 != 4) {
                                                        if (iF3 == 5) {
                                                            c3727fA4.b();
                                                        }
                                                        c3727fA3 = c3727fA4;
                                                        c2030Su2 = c2030Su;
                                                        obj3 = obj2;
                                                    } else if (j5 < atomicLongFieldUpdater2.get(c2030Su)) {
                                                        c3727fA4.b();
                                                    }
                                                }
                                            }
                                            c6251qyJ.z();
                                            throw th;
                                        }
                                        obj2 = obj3;
                                        c2030Su = c2030Su2;
                                        if (j2 < atomicLongFieldUpdater2.get(c2030Su)) {
                                            c3727fA2.b();
                                        }
                                        c(c2030Su, obj2, c6251qyJ);
                                        break;
                                    } else {
                                        c6251qyJ.c(c3727fA2, i3 + i2);
                                    }
                                    objQ = c6251qyJ.q();
                                    mn = MN.d;
                                    if (objQ == mn) {
                                        Intrinsics.checkNotNullParameter(frame, "frame");
                                    }
                                    if (objQ != mn) {
                                        objQ = Unit.a;
                                    }
                                    if (objQ == mn) {
                                        return objQ;
                                    }
                                } else {
                                    C1717Ot1.a aVar4 = C1717Ot1.e;
                                    unit = Unit.a;
                                }
                                c6251qyJ.resumeWith(unit);
                                objQ = c6251qyJ.q();
                                mn = MN.d;
                                if (objQ == mn) {
                                    Intrinsics.checkNotNullParameter(frame, "frame");
                                }
                                if (objQ != mn) {
                                    objQ = Unit.a;
                                }
                                if (objQ == mn) {
                                    return objQ;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        if (iF == 4) {
                            if (j2 < atomicLongFieldUpdater2.get(c2030Su2)) {
                                c3727fA2.b();
                            }
                            Object objE2 = E(frame, obj);
                            if (objE2 != MN.d) {
                                break;
                            }
                            return objE2;
                        }
                        if (iF == 5) {
                            c3727fA2.b();
                        }
                    }
                } else if (zY) {
                    c3727fA2.i();
                    Object objE3 = E(frame, obj);
                    if (objE3 == MN.d) {
                        return objE3;
                    }
                }
            }
            return Unit.a;
        }
        return Unit.a;
    }

    public final boolean k(@Nullable Throwable th, boolean z) {
        C2030Su<E> c2030Su;
        boolean z2;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (!z) {
            c2030Su = this;
            break;
        }
        do {
            j6 = atomicLongFieldUpdater.get(this);
            if (((int) (j6 >> 60)) != 0) {
                c2030Su = this;
                break;
            }
            C3727fA<Object> c3727fA = C2450Xu.a;
            c2030Su = this;
        } while (!atomicLongFieldUpdater.compareAndSet(c2030Su, j6, (j6 & 1152921504606846975L) + (((long) 1) << 60)));
        GW1 gw1 = C2450Xu.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, gw1, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != gw1) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(c2030Su, j5, (((long) 3) << 60) + (j5 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j4 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j2 & 1152921504606846975L;
                    j4 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c2030Su, j2, (j4 << 60) + j3));
        }
        o();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n;
                obj = atomicReferenceFieldUpdater2.get(this);
                GW1 gw2 = obj == null ? C2450Xu.q : C2450Xu.r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, gw2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                F62.e(1, obj);
                ((Function1) obj).invoke(t());
                return z2;
            }
        }
        return z2;
    }

    @Override // defpackage.InterfaceC0764Co1
    public final void l(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        k(cancellationException, true);
    }

    public final C3727fA<E> m(long j2) {
        Object objT;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = l.get(this);
        C3727fA c3727fA = (C3727fA) j.get(this);
        if (c3727fA.g > ((C3727fA) obj).g) {
            obj = c3727fA;
        }
        C3727fA c3727fA2 = (C3727fA) k.get(this);
        if (c3727fA2.g > ((C3727fA) obj).g) {
            obj = c3727fA2;
        }
        XH xh = (XH) obj;
        loop0: while (true) {
            xh.getClass();
            Object obj2 = XH.d.get(xh);
            GW1 gw1 = C4994l.b;
            objT = null;
            if (obj2 == gw1) {
                break;
            }
            XH xh2 = (XH) obj2;
            if (xh2 == null) {
                do {
                    atomicReferenceFieldUpdater = XH.d;
                    if (atomicReferenceFieldUpdater.compareAndSet(xh, null, gw1)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(xh) == null);
            } else {
                xh = xh2;
            }
        }
        C3727fA<E> c3727fA3 = (C3727fA) xh;
        if (A()) {
            C3727fA<E> c3727fA4 = c3727fA3;
            loop2: while (true) {
                int i2 = C2450Xu.b - 1;
                while (true) {
                    if (-1 < i2) {
                        j3 = (c3727fA4.g * ((long) C2450Xu.b)) + ((long) i2);
                        if (j3 >= g.get(this)) {
                            while (true) {
                                Object objL = c3727fA4.l(i2);
                                if (objL != null && objL != C2450Xu.e) {
                                    if (objL != C2450Xu.d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (c3727fA4.k(i2, objL, C2450Xu.l)) {
                                    c3727fA4.i();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        c3727fA4 = (C3727fA) ((XH) XH.e.get(c3727fA4));
                        if (c3727fA4 == null) {
                        }
                    }
                    j3 = -1;
                    break;
                }
            }
            if (j3 != -1) {
                p(j3);
            }
        }
        loop5: for (C3727fA<E> c3727fA5 = c3727fA3; c3727fA5 != null; c3727fA5 = (C3727fA) ((XH) XH.e.get(c3727fA5))) {
            for (int i3 = C2450Xu.b - 1; -1 < i3; i3--) {
                if ((c3727fA5.g * ((long) C2450Xu.b)) + ((long) i3) < j2) {
                    break loop5;
                }
                while (true) {
                    Object objL2 = c3727fA5.l(i3);
                    if (objL2 != null && objL2 != C2450Xu.e) {
                        if (!(objL2 instanceof C7869yf2)) {
                            if (!(objL2 instanceof InterfaceC7449wf2)) {
                                break;
                            }
                            if (c3727fA5.k(i3, objL2, C2450Xu.l)) {
                                objT = N7.t(objT, objL2);
                                c3727fA5.m(i3, true);
                                break;
                            }
                        } else {
                            if (c3727fA5.k(i3, objL2, C2450Xu.l)) {
                                objT = N7.t(objT, ((C7869yf2) objL2).a);
                                c3727fA5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (c3727fA5.k(i3, objL2, C2450Xu.l)) {
                            c3727fA5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objT != null) {
            if (!(objT instanceof ArrayList)) {
                H((InterfaceC7449wf2) objT, true);
                return c3727fA3;
            }
            ArrayList arrayList = (ArrayList) objT;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                H((InterfaceC7449wf2) arrayList.get(size), true);
            }
        }
        return c3727fA3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x007c A[SYNTHETIC] */
    @Override // defpackage.InterfaceC7364wF1
    @NotNull
    public Object n(E e2) {
        int iF;
        InterfaceC7449wf2 interfaceC7449wf2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        long j2 = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j3 = 1152921504606846975L;
        boolean z2 = y(j2, false) ? false : !g(j2 & 1152921504606846975L);
        C3308dA.b bVar = C3308dA.b;
        if (z2) {
            return bVar;
        }
        Object obj = C2450Xu.j;
        C3727fA c3727fA = (C3727fA) j.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean zY = y(andIncrement, z);
            int i2 = C2450Xu.b;
            long j5 = i2;
            long j6 = j4 / j5;
            int i3 = (int) (j4 % j5);
            if (c3727fA.g == j6) {
                iF = f(this, c3727fA, i3, e2, j4, obj, zY);
                if (iF != 0) {
                    c3727fA.b();
                    return Unit.a;
                }
                if (iF != 1) {
                    return Unit.a;
                }
                if (iF != 2) {
                    if (zY) {
                        c3727fA.i();
                        return new C3308dA.a(v());
                    }
                    if (obj instanceof InterfaceC7449wf2) {
                        interfaceC7449wf2 = (InterfaceC7449wf2) obj;
                    } else {
                        interfaceC7449wf2 = null;
                    }
                    if (interfaceC7449wf2 != null) {
                        interfaceC7449wf2.c(c3727fA, i3 + i2);
                    }
                    c3727fA.i();
                    return bVar;
                }
                if (iF != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iF != 4) {
                    if (j4 < g.get(this)) {
                        c3727fA.b();
                    }
                    return new C3308dA.a(v());
                }
                if (iF == 5) {
                    c3727fA.b();
                }
                z = false;
            } else {
                C3727fA c3727fAB = b(this, j6, c3727fA);
                if (c3727fAB != null) {
                    c3727fA = c3727fAB;
                    iF = f(this, c3727fA, i3, e2, j4, obj, zY);
                    if (iF != 0) {
                        c3727fA.b();
                        return Unit.a;
                    }
                    if (iF != 1) {
                        return Unit.a;
                    }
                    if (iF != 2) {
                        if (zY) {
                            c3727fA.i();
                            return new C3308dA.a(v());
                        }
                        if (obj instanceof InterfaceC7449wf2) {
                            interfaceC7449wf2 = (InterfaceC7449wf2) obj;
                        } else {
                            interfaceC7449wf2 = null;
                        }
                        if (interfaceC7449wf2 != null) {
                            interfaceC7449wf2.c(c3727fA, i3 + i2);
                        }
                        c3727fA.i();
                        return bVar;
                    }
                    if (iF != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iF != 4) {
                        if (j4 < g.get(this)) {
                            c3727fA.b();
                        }
                        return new C3308dA.a(v());
                    }
                    if (iF == 5) {
                        c3727fA.b();
                    }
                    z = false;
                } else {
                    if (zY) {
                        return new C3308dA.a(v());
                    }
                    z = false;
                }
            }
            j3 = 1152921504606846975L;
        }
    }

    @Override // defpackage.InterfaceC7364wF1
    public final boolean o() {
        return y(e.get(this), false);
    }

    public final void p(long j2) {
        C3727fA<E> c3727fA = (C3727fA) k.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.d) + j3, h.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = C2450Xu.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (c3727fA.g != j5) {
                    C3727fA<E> c3727fAS = s(j5, c3727fA);
                    if (c3727fAS != null) {
                        c3727fA = c3727fAS;
                    }
                }
                C3727fA<E> c3727fA2 = c3727fA;
                if (K(c3727fA2, i2, j3, null) != C2450Xu.o || j3 < w()) {
                    c3727fA2.b();
                }
                c3727fA = c3727fA2;
            }
        }
    }

    public final void q() {
        Object objD;
        if (B()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        C3727fA<E> c3727fA = (C3727fA) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = h.getAndIncrement(this);
            long j2 = andIncrement / ((long) C2450Xu.b);
            if (w() <= andIncrement) {
                if (c3727fA.g < j2 && c3727fA.c() != null) {
                    C(j2, c3727fA);
                }
                x(this);
                return;
            }
            if (c3727fA.g != j2) {
                C2346Wu c2346Wu = C2346Wu.m;
                while (true) {
                    objD = C4994l.d(c3727fA, j2, c2346Wu);
                    if (!C6621sj.i(objD)) {
                        AbstractC7992zE1 abstractC7992zE1F = C6621sj.f(objD);
                        while (true) {
                            AbstractC7992zE1 abstractC7992zE1 = (AbstractC7992zE1) atomicReferenceFieldUpdater.get(this);
                            if (abstractC7992zE1.g >= abstractC7992zE1F.g) {
                                break;
                            }
                            if (!abstractC7992zE1F.j()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC7992zE1, abstractC7992zE1F)) {
                                    if (!abstractC7992zE1.f()) {
                                        break;
                                    }
                                    abstractC7992zE1.e();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == abstractC7992zE1);
                            if (abstractC7992zE1F.f()) {
                                abstractC7992zE1F.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                C3727fA<E> c3727fA2 = null;
                if (C6621sj.i(objD)) {
                    o();
                    C(j2, c3727fA);
                    x(this);
                } else {
                    C3727fA<E> c3727fA3 = (C3727fA) C6621sj.f(objD);
                    long j3 = c3727fA3.g;
                    if (j3 > j2) {
                        long j4 = j3 * ((long) C2450Xu.b);
                        if (h.compareAndSet(this, 1 + andIncrement, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            x(this);
                        }
                    } else {
                        c3727fA2 = c3727fA3;
                    }
                }
                if (c3727fA2 == null) {
                    continue;
                } else {
                    c3727fA = c3727fA2;
                }
            }
            int i2 = (int) (andIncrement % ((long) C2450Xu.b));
            Object objL = c3727fA.l(i2);
            boolean z = objL instanceof InterfaceC7449wf2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = g;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !c3727fA.k(i2, objL, C2450Xu.g)) {
                while (true) {
                    Object objL2 = c3727fA.l(i2);
                    if (objL2 instanceof InterfaceC7449wf2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (c3727fA.k(i2, objL2, new C7869yf2((InterfaceC7449wf2) objL2))) {
                                x(this);
                                return;
                            }
                        } else if (c3727fA.k(i2, objL2, C2450Xu.g)) {
                            if (!J(objL2, c3727fA, i2)) {
                                c3727fA.o(i2, C2450Xu.j);
                                c3727fA.i();
                                break;
                            } else {
                                c3727fA.o(i2, C2450Xu.d);
                                x(this);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == C2450Xu.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (c3727fA.k(i2, objL2, C2450Xu.e)) {
                                x(this);
                                return;
                            }
                        } else if (objL2 == C2450Xu.d || objL2 == C2450Xu.h || objL2 == C2450Xu.i || objL2 == C2450Xu.k || objL2 == C2450Xu.l) {
                            x(this);
                            return;
                        } else if (objL2 != C2450Xu.f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objL2).toString());
                        }
                    }
                }
                x(this);
            } else if (J(objL, c3727fA, i2)) {
                c3727fA.o(i2, C2450Xu.d);
                x(this);
                return;
            } else {
                c3727fA.o(i2, C2450Xu.j);
                c3727fA.i();
                x(this);
            }
        }
    }

    @Override // defpackage.InterfaceC0764Co1
    @Nullable
    public final Object r(@NotNull C4372iF.a aVar) {
        return F(this, aVar);
    }

    public final C3727fA<E> s(long j2, C3727fA<E> c3727fA) {
        Object objD;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        C3727fA<Object> c3727fA2 = C2450Xu.a;
        C2346Wu c2346Wu = C2346Wu.m;
        loop0: while (true) {
            objD = C4994l.d(c3727fA, j2, c2346Wu);
            if (!C6621sj.i(objD)) {
                AbstractC7992zE1 abstractC7992zE1F = C6621sj.f(objD);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
                    AbstractC7992zE1 abstractC7992zE1 = (AbstractC7992zE1) atomicReferenceFieldUpdater.get(this);
                    if (abstractC7992zE1.g >= abstractC7992zE1F.g) {
                        break loop0;
                    }
                    if (!abstractC7992zE1F.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC7992zE1, abstractC7992zE1F)) {
                            if (!abstractC7992zE1.f()) {
                                break loop0;
                            }
                            abstractC7992zE1.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC7992zE1);
                    if (abstractC7992zE1F.f()) {
                        abstractC7992zE1F.e();
                    }
                }
            } else {
                break;
            }
        }
        if (C6621sj.i(objD)) {
            o();
            if (c3727fA.g * ((long) C2450Xu.b) < w()) {
                c3727fA.b();
                return null;
            }
        } else {
            C3727fA<E> c3727fA3 = (C3727fA) C6621sj.f(objD);
            boolean zB = B();
            long j4 = c3727fA3.g;
            if (!zB && j2 <= h.get(this) / ((long) C2450Xu.b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l;
                    AbstractC7992zE1 abstractC7992zE2 = (AbstractC7992zE1) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC7992zE2.g >= j4 || !c3727fA3.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, abstractC7992zE2, c3727fA3)) {
                            if (!abstractC7992zE2.f()) {
                                break loop3;
                            }
                            abstractC7992zE2.e();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == abstractC7992zE2);
                    if (c3727fA3.f()) {
                        c3727fA3.e();
                    }
                }
            }
            if (j4 <= j2) {
                return c3727fA3;
            }
            long j5 = j4 * ((long) C2450Xu.b);
            do {
                atomicLongFieldUpdater = g;
                j3 = atomicLongFieldUpdater.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
            if (j4 * ((long) C2450Xu.b) < w()) {
                c3727fA3.b();
            }
        }
        return null;
    }

    @Nullable
    public final Throwable t() {
        return (Throwable) m.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (e.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.d + ',');
        sb.append("data=[");
        int i3 = 0;
        boolean z = true;
        List listF = WE.f(k.get(this), j.get(this), l.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((C3727fA) obj) != C2450Xu.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((C3727fA) next).g;
            do {
                Object next2 = it.next();
                long j3 = ((C3727fA) next2).g;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        C3727fA c3727fA = (C3727fA) next;
        long j4 = g.get(this);
        long jW = w();
        loop2: while (true) {
            int i4 = C2450Xu.b;
            int i5 = i3;
            while (i5 < i4) {
                long j5 = (c3727fA.g * ((long) C2450Xu.b)) + ((long) i5);
                if (j5 >= jW && j5 >= j4) {
                    break loop2;
                }
                Object objL = c3727fA.l(i5);
                boolean z2 = z;
                Object obj2 = c3727fA.j.get(i5 * 2);
                if (objL instanceof InterfaceC6041py) {
                    string = (j5 >= j4 || j5 < jW) ? (j5 >= jW || j5 < j4) ? "cont" : "send" : "receive";
                } else if (objL instanceof InterfaceC3744fF1) {
                    string = (j5 >= j4 || j5 < jW) ? (j5 >= jW || j5 < j4) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof C0686Bo1) {
                    string = "receiveCatching";
                } else if (objL instanceof b) {
                    string = "sendBroadcast";
                } else if (objL instanceof C7869yf2) {
                    string = "EB(" + objL + ')';
                } else if (Intrinsics.a(objL, C2450Xu.f) ? z2 : Intrinsics.a(objL, C2450Xu.g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objL == null ? z2 : objL.equals(C2450Xu.e) ? z2 : Intrinsics.a(objL, C2450Xu.i) ? z2 : Intrinsics.a(objL, C2450Xu.h) ? z2 : Intrinsics.a(objL, C2450Xu.k) ? z2 : Intrinsics.a(objL, C2450Xu.j) ? z2 : Intrinsics.a(objL, C2450Xu.l))) {
                        string = objL.toString();
                    }
                    i5++;
                    z = z2;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i5++;
                z = z2;
            }
            boolean z3 = z;
            c3727fA = (C3727fA) c3727fA.c();
            if (c3727fA == null) {
                break;
            }
            z = z3;
            i3 = 0;
        }
        if (KS1.A(sb) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable thT = t();
        return thT == null ? new C6729tE("Channel was closed") : thT;
    }

    @NotNull
    public final Throwable v() {
        Throwable thT = t();
        return thT == null ? new C6939uE("Channel was closed") : thT;
    }

    public final long w() {
        return e.get(this) & 1152921504606846975L;
    }

    public final boolean y(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            if (i2 == 2) {
                m(1152921504606846975L & j2);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
                        C3727fA<E> c3727fAS = (C3727fA) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (w() <= j3) {
                            break;
                        }
                        long j4 = C2450Xu.b;
                        long j5 = j3 / j4;
                        if (c3727fAS.g != j5 && (c3727fAS = s(j5, c3727fAS)) == null) {
                            if (((C3727fA) atomicReferenceFieldUpdater.get(this)).g < j5) {
                                break;
                            }
                        } else {
                            c3727fAS.b();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object objL = c3727fAS.l(i3);
                                if (objL != null && objL != C2450Xu.e) {
                                    if (objL != C2450Xu.d && (objL == C2450Xu.j || objL == C2450Xu.l || objL == C2450Xu.i || objL == C2450Xu.h || (objL != C2450Xu.g && (objL == C2450Xu.f || j3 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (c3727fAS.k(i3, objL, C2450Xu.h)) {
                                    q();
                                    break;
                                }
                            }
                            g.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(EK.e(i2, "unexpected close status: ").toString());
                }
                C3727fA<E> c3727fAM = m(1152921504606846975L & j2);
                Object objT = null;
                loop0: do {
                    for (int i4 = C2450Xu.b - 1; -1 < i4; i4--) {
                        long j6 = (c3727fAM.g * ((long) C2450Xu.b)) + ((long) i4);
                        while (true) {
                            Object objL2 = c3727fAM.l(i4);
                            if (objL2 == C2450Xu.i) {
                                break loop0;
                            }
                            if (objL2 != C2450Xu.d) {
                                if (objL2 != C2450Xu.e && objL2 != null) {
                                    if (!(objL2 instanceof InterfaceC7449wf2) && !(objL2 instanceof C7869yf2)) {
                                        GW1 gw1 = C2450Xu.g;
                                        if (objL2 == gw1 || objL2 == C2450Xu.f) {
                                            break loop0;
                                        }
                                        if (objL2 != gw1) {
                                            break;
                                        }
                                    } else {
                                        if (j6 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        InterfaceC7449wf2 interfaceC7449wf2 = objL2 instanceof C7869yf2 ? ((C7869yf2) objL2).a : (InterfaceC7449wf2) objL2;
                                        if (c3727fAM.k(i4, objL2, C2450Xu.l)) {
                                            objT = N7.t(objT, interfaceC7449wf2);
                                            c3727fAM.n(i4, null);
                                            c3727fAM.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (c3727fAM.k(i4, objL2, C2450Xu.l)) {
                                        c3727fAM.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (c3727fAM.k(i4, objL2, C2450Xu.l)) {
                                    c3727fAM.n(i4, null);
                                    c3727fAM.i();
                                    break;
                                }
                            }
                        }
                    }
                    c3727fAM = (C3727fA) ((XH) XH.e.get(c3727fAM));
                } while (c3727fAM != null);
                if (objT != null) {
                    if (objT instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objT;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            H((InterfaceC7449wf2) arrayList.get(size), false);
                        }
                    } else {
                        H((InterfaceC7449wf2) objT, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean z() {
        return y(e.get(this), true);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3956gG0 implements XF0, InterfaceC3605ec1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(C3956gG0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C3956gG0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: gG0$a */
    public static final class a<T> extends C6251qy<T> {

        @NotNull
        public final C3956gG0 m;

        public a(@NotNull JM<? super T> jm, @NotNull C3956gG0 c3956gG0) {
            super(1, jm);
            this.m = c3956gG0;
        }

        @Override // defpackage.C6251qy
        @NotNull
        public final Throwable p(@NotNull C3956gG0 c3956gG0) {
            Throwable thB;
            Object objS = this.m.S();
            if (!(objS instanceof c) || (thB = ((c) objS).b()) == null) {
                return objS instanceof OG ? ((OG) objS).a : c3956gG0.C();
            }
            return thB;
        }

        @Override // defpackage.C6251qy
        @NotNull
        public final String y() {
            return "AwaitContinuation";
        }
    }

    /* JADX INFO: renamed from: gG0$b */
    public static final class b extends AbstractC3746fG0 {

        @NotNull
        public final C3956gG0 i;

        @NotNull
        public final c j;

        @NotNull
        public final XB k;

        @Nullable
        public final Object l;

        public b(@NotNull C3956gG0 c3956gG0, @NotNull c cVar, @NotNull XB xb, @Nullable Object obj) {
            this.i = c3956gG0;
            this.j = cVar;
            this.k = xb;
            this.l = obj;
        }

        @Override // defpackage.InterfaceC2672aC0
        public final void a(@Nullable Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3956gG0.d;
            C3956gG0 c3956gG0 = this.i;
            c3956gG0.getClass();
            XB xbF0 = C3956gG0.f0(this.k);
            c cVar = this.j;
            Object obj = this.l;
            if (xbF0 != null) {
                while (ED.j(xbF0.i, false, new b(c3956gG0, cVar, xbF0, obj), 1) == C7960z51.d) {
                    xbF0 = C3956gG0.f0(xbF0);
                    if (xbF0 == null) {
                    }
                }
                return;
            }
            c3956gG0.x(c3956gG0.M(cVar, obj));
        }
    }

    /* JADX INFO: renamed from: gG0$c */
    public static final class c implements InterfaceC7719xx0 {
        public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;

        @NotNull
        public final C7119v51 d;

        public c(@NotNull C7119v51 c7119v51, @Nullable Throwable th) {
            this.d = c7119v51;
            this._rootCause$volatile = th;
        }

        public final void a(@NotNull Throwable th) {
            Throwable thB = b();
            if (thB == null) {
                g.set(this, th);
                return;
            }
            if (th == thB) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        @Nullable
        public final Throwable b() {
            return (Throwable) g.get(this);
        }

        public final boolean c() {
            return b() != null;
        }

        public final boolean d() {
            return e.get(this) != 0;
        }

        @NotNull
        public final ArrayList e(@Nullable Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable thB = b();
            if (thB != null) {
                arrayList.add(0, thB);
            }
            if (th != null && !th.equals(thB)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, C3787fU.i);
            return arrayList;
        }

        @Override // defpackage.InterfaceC7719xx0
        public final boolean g() {
            return b() == null;
        }

        @Override // defpackage.InterfaceC7719xx0
        @NotNull
        public final C7119v51 h() {
            return this.d;
        }

        @NotNull
        public final String toString() {
            return "Finishing[cancelling=" + c() + ", completing=" + d() + ", rootCause=" + b() + ", exceptions=" + h.get(this) + ", list=" + this.d + ']';
        }
    }

    /* JADX INFO: renamed from: gG0$d */
    @InterfaceC3368dU(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {963, 965}, m = "invokeSuspend")
    public static final class d extends AbstractC1639Nt1 implements Function2<BH1<? super XF0>, JM<? super Unit>, Object> {
        public C3572eS0 e;
        public C3782fS0 g;
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ C3956gG0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JM jm, C3956gG0 c3956gG0) {
            super(2, jm);
            this.j = c3956gG0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            d dVar = new d(jm, this.j);
            dVar.i = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BH1<? super XF0> bh1, JM<? super Unit> jm) {
            return ((d) create(bh1, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0060  */
        /* JADX WARN: Code duplicated, block: B:23:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0062 -> B:25:0x0077). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                MN r0 = defpackage.MN.d
                int r1 = r5.h
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                fS0 r1 = r5.g
                eS0 r3 = r5.e
                java.lang.Object r4 = r5.i
                BH1 r4 = (defpackage.BH1) r4
                defpackage.C1795Pt1.b(r6)
                goto L77
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                defpackage.C1795Pt1.b(r6)
                goto L7c
            L24:
                defpackage.C1795Pt1.b(r6)
                java.lang.Object r6 = r5.i
                BH1 r6 = (defpackage.BH1) r6
                gG0 r1 = r5.j
                java.lang.Object r1 = r1.S()
                boolean r4 = r1 instanceof defpackage.XB
                if (r4 == 0) goto L3f
                XB r1 = (defpackage.XB) r1
                gG0 r1 = r1.i
                r5.h = r3
                r6.c(r1, r5)
                return r0
            L3f:
                boolean r3 = r1 instanceof defpackage.InterfaceC7719xx0
                if (r3 == 0) goto L7c
                xx0 r1 = (defpackage.InterfaceC7719xx0) r1
                v51 r1 = r1.h()
                if (r1 == 0) goto L7c
                java.lang.Object r3 = r1.f()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.Intrinsics.c(r3, r4)
                fS0 r3 = (defpackage.C3782fS0) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L5a:
                boolean r6 = r1.equals(r3)
                if (r6 != 0) goto L7c
                boolean r6 = r1 instanceof defpackage.XB
                if (r6 == 0) goto L77
                r6 = r1
                XB r6 = (defpackage.XB) r6
                r5.i = r4
                r5.e = r3
                r5.g = r1
                r5.h = r2
                gG0 r6 = r6.i
                r4.c(r6, r5)
                MN r6 = defpackage.MN.d
                return r0
            L77:
                fS0 r1 = r1.i()
                goto L5a
            L7c:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C3956gG0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3956gG0(boolean z) {
        this._state$volatile = z ? C3787fU.k : C3787fU.j;
    }

    public static XB f0(C3782fS0 c3782fS0) {
        while (c3782fS0.j()) {
            C3782fS0 c3782fS0C = c3782fS0.c();
            if (c3782fS0C == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3782fS0.e;
                Object obj = atomicReferenceFieldUpdater.get(c3782fS0);
                while (true) {
                    c3782fS0 = (C3782fS0) obj;
                    if (!c3782fS0.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c3782fS0);
                }
            } else {
                c3782fS0 = c3782fS0C;
            }
        }
        while (true) {
            c3782fS0 = c3782fS0.i();
            if (!c3782fS0.j()) {
                if (c3782fS0 instanceof XB) {
                    return (XB) c3782fS0;
                }
                if (c3782fS0 instanceof C7119v51) {
                    return null;
                }
            }
        }
    }

    public static String o0(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof InterfaceC7719xx0) {
                return ((InterfaceC7719xx0) obj).g() ? "Active" : "New";
            }
            return obj instanceof OG ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.c()) {
            return "Cancelling";
        }
        return cVar.d() ? "Completing" : "Active";
    }

    @Override // defpackage.XF0
    @NotNull
    public final A20 A(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1) {
        return Y(z, z2, new InterfaceC2672aC0.a(function1));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:2: B:59:0x00b6->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
      0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:24:0x0049, B:29:0x005e, B:32:0x0064, B:40:0x007e, B:36:0x0071, B:39:0x0078), top: B:84:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0064 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:24:0x0049, B:29:0x005e, B:32:0x0064, B:40:0x007e, B:36:0x0071, B:39:0x0078), top: B:84:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:24:0x0049, B:29:0x005e, B:32:0x0064, B:40:0x007e, B:36:0x0071, B:39:0x0078), top: B:84:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0109 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    public final boolean B(@Nullable Object obj) {
        Throwable thK;
        Object objS;
        c cVar;
        boolean z;
        Throwable thB;
        GW1 gw1;
        InterfaceC7719xx0 interfaceC7719xx0;
        C7119v51 c7119v51R;
        c cVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objP0;
        Object objP1 = C3787fU.d;
        if (Q()) {
            do {
                Object objS2 = S();
                if (!(objS2 instanceof InterfaceC7719xx0) || ((objS2 instanceof c) && ((c) objS2).d())) {
                    objP1 = C3787fU.d;
                    break;
                }
                objP1 = p0(objS2, new OG(K(obj), false));
            } while (objP1 == C3787fU.g);
            if (objP1 != C3787fU.e) {
                if (objP1 == C3787fU.d) {
                    thK = null;
                    loop1: while (true) {
                        objS = S();
                        if (objS instanceof c) {
                            synchronized (objS) {
                                try {
                                    cVar = (c) objS;
                                    cVar.getClass();
                                    if (c.h.get(cVar) == C3787fU.i) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        gw1 = C3787fU.h;
                                    } else {
                                        boolean zC = ((c) objS).c();
                                        if (obj == null || !zC) {
                                            if (thK == null) {
                                                thK = K(obj);
                                            }
                                            ((c) objS).a(thK);
                                        }
                                        thB = zC ? null : ((c) objS).b();
                                        if (thB != null) {
                                            g0(((c) objS).d, thB);
                                        }
                                        gw1 = C3787fU.d;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else if (objS instanceof InterfaceC7719xx0) {
                            if (thK == null) {
                                thK = K(obj);
                            }
                            interfaceC7719xx0 = (InterfaceC7719xx0) objS;
                            if (interfaceC7719xx0.g()) {
                                c7119v51R = R(interfaceC7719xx0);
                                if (c7119v51R == null) {
                                    continue;
                                } else {
                                    cVar2 = new c(c7119v51R, thK);
                                    while (true) {
                                        atomicReferenceFieldUpdater = d;
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC7719xx0, cVar2)) {
                                            g0(c7119v51R, thK);
                                            gw1 = C3787fU.d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC7719xx0) {
                                        }
                                    }
                                }
                            } else {
                                objP0 = p0(objS, new OG(thK, false));
                                if (objP0 != C3787fU.d) {
                                    throw new IllegalStateException(("Cannot happen in " + objS).toString());
                                }
                                if (objP0 != C3787fU.g) {
                                    objP1 = objP0;
                                    break;
                                }
                            }
                        } else {
                            gw1 = C3787fU.h;
                        }
                        objP1 = gw1;
                        break;
                    }
                }
                if (objP1 != C3787fU.d && objP1 != C3787fU.e) {
                    if (objP1 == C3787fU.h) {
                        return false;
                    }
                    x(objP1);
                    return true;
                }
            }
        } else {
            if (objP1 == C3787fU.d) {
                thK = null;
                loop1: while (true) {
                    objS = S();
                    if (objS instanceof c) {
                        synchronized (objS) {
                            cVar = (c) objS;
                            cVar.getClass();
                            if (c.h.get(cVar) == C3787fU.i) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                gw1 = C3787fU.h;
                            } else {
                                boolean zC2 = ((c) objS).c();
                                if (obj == null) {
                                    if (thK == null) {
                                        thK = K(obj);
                                    }
                                    ((c) objS).a(thK);
                                } else {
                                    if (thK == null) {
                                        thK = K(obj);
                                    }
                                    ((c) objS).a(thK);
                                }
                                if (zC2) {
                                }
                                if (thB != null) {
                                    g0(((c) objS).d, thB);
                                }
                                gw1 = C3787fU.d;
                            }
                        }
                    } else if (objS instanceof InterfaceC7719xx0) {
                        if (thK == null) {
                            thK = K(obj);
                        }
                        interfaceC7719xx0 = (InterfaceC7719xx0) objS;
                        if (interfaceC7719xx0.g()) {
                            c7119v51R = R(interfaceC7719xx0);
                            if (c7119v51R == null) {
                                continue;
                            } else {
                                cVar2 = new c(c7119v51R, thK);
                                while (true) {
                                    atomicReferenceFieldUpdater = d;
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC7719xx0, cVar2)) {
                                        g0(c7119v51R, thK);
                                        gw1 = C3787fU.d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC7719xx0) {
                                    }
                                }
                            }
                        } else {
                            objP0 = p0(objS, new OG(thK, false));
                            if (objP0 != C3787fU.d) {
                                throw new IllegalStateException(("Cannot happen in " + objS).toString());
                            }
                            if (objP0 != C3787fU.g) {
                                objP1 = objP0;
                                break;
                            }
                        }
                    } else {
                        gw1 = C3787fU.h;
                    }
                    objP1 = gw1;
                    break;
                }
            }
            if (objP1 != C3787fU.d) {
                if (objP1 == C3787fU.h) {
                    return false;
                }
                x(objP1);
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.XF0
    @NotNull
    public final CancellationException C() {
        CancellationException yf0;
        Object objS = S();
        if (!(objS instanceof c)) {
            if (objS instanceof InterfaceC7719xx0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objS instanceof OG)) {
                return new YF0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((OG) objS).a;
            yf0 = th instanceof CancellationException ? (CancellationException) th : null;
            return yf0 == null ? new YF0(H(), th, this) : yf0;
        }
        Throwable thB = ((c) objS).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        yf0 = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (yf0 == null) {
            if (strConcat == null) {
                strConcat = H();
            }
            yf0 = new YF0(strConcat, thB, this);
        }
        return yf0;
    }

    public void E(@NotNull CancellationException cancellationException) {
        B(cancellationException);
    }

    public final boolean F(Throwable th) {
        if (!a0()) {
            boolean z = th instanceof CancellationException;
            WB wb = (WB) e.get(this);
            if (wb == null || wb == C7960z51.d) {
                return z;
            }
            return wb.e(th) || z;
        }
        return true;
    }

    @NotNull
    public String H() {
        return "Job was cancelled";
    }

    public boolean I(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return B(th) && O();
    }

    public final void J(InterfaceC7719xx0 interfaceC7719xx0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        WB wb = (WB) atomicReferenceFieldUpdater.get(this);
        if (wb != null) {
            wb.b();
            atomicReferenceFieldUpdater.set(this, C7960z51.d);
        }
        QG qg = null;
        OG og = obj instanceof OG ? (OG) obj : null;
        Throwable th = og != null ? og.a : null;
        if (interfaceC7719xx0 instanceof AbstractC3746fG0) {
            try {
                ((AbstractC3746fG0) interfaceC7719xx0).a(th);
                return;
            } catch (Throwable th2) {
                U(new QG("Exception in completion handler " + interfaceC7719xx0 + " for " + this, th2));
                return;
            }
        }
        C7119v51 c7119v51H = interfaceC7719xx0.h();
        if (c7119v51H != null) {
            Object objF = c7119v51H.f();
            Intrinsics.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (C3782fS0 c3782fS0I = (C3782fS0) objF; !c3782fS0I.equals(c7119v51H); c3782fS0I = c3782fS0I.i()) {
                if (c3782fS0I instanceof AbstractC3746fG0) {
                    AbstractC3746fG0 abstractC3746fG0 = (AbstractC3746fG0) c3782fS0I;
                    try {
                        abstractC3746fG0.a(th);
                    } catch (Throwable th3) {
                        if (qg != null) {
                            J90.a(qg, th3);
                        } else {
                            qg = new QG("Exception in completion handler " + abstractC3746fG0 + " for " + this, th3);
                            Unit unit = Unit.a;
                        }
                    }
                }
            }
            if (qg != null) {
                U(qg);
            }
        }
    }

    public final Throwable K(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new YF0(H(), null, this) : th;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC3605ec1) obj).Q0();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext L(@NotNull CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.b(this, aVar);
    }

    public boolean L0(Object obj) {
        return c0(obj);
    }

    public final Object M(c cVar, Object obj) {
        Throwable thN;
        OG og = obj instanceof OG ? (OG) obj : null;
        Throwable th = og != null ? og.a : null;
        synchronized (cVar) {
            cVar.c();
            ArrayList<Throwable> arrayListE = cVar.e(th);
            thN = N(cVar, arrayListE);
            if (thN != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th2 : arrayListE) {
                    if (th2 != thN && th2 != thN && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        J90.a(thN, th2);
                    }
                }
            }
        }
        if (thN != null && thN != th) {
            obj = new OG(thN, false);
        }
        if (thN != null && (F(thN) || T(thN))) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            OG.b.compareAndSet((OG) obj, 0, 1);
        }
        k0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object c0634Ax0 = obj instanceof InterfaceC7719xx0 ? new C0634Ax0((InterfaceC7719xx0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, c0634Ax0) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        J(cVar, obj);
        return obj;
    }

    public final Throwable N(c cVar, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (cVar.c()) {
                return new YF0(H(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof MZ1) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof MZ1)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean O() {
        return true;
    }

    public boolean Q() {
        return this instanceof DG;
    }

    @Override // defpackage.InterfaceC3605ec1
    @NotNull
    public final CancellationException Q0() {
        Throwable thB;
        Object objS = S();
        if (objS instanceof c) {
            thB = ((c) objS).b();
        } else if (objS instanceof OG) {
            thB = ((OG) objS).a;
        } else {
            if (objS instanceof InterfaceC7719xx0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objS).toString());
            }
            thB = null;
        }
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        return cancellationException == null ? new YF0("Parent job is ".concat(o0(objS)), thB, this) : cancellationException;
    }

    public final C7119v51 R(InterfaceC7719xx0 interfaceC7719xx0) {
        C7119v51 c7119v51H = interfaceC7719xx0.h();
        if (c7119v51H != null) {
            return c7119v51H;
        }
        if (interfaceC7719xx0 instanceof C3083c60) {
            return new C7119v51();
        }
        if (interfaceC7719xx0 instanceof AbstractC3746fG0) {
            m0((AbstractC3746fG0) interfaceC7719xx0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC7719xx0).toString());
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R R0(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(r, this);
    }

    @Nullable
    public final Object S() {
        while (true) {
            Object obj = d.get(this);
            if (!(obj instanceof L91)) {
                return obj;
            }
            ((L91) obj).a(this);
        }
    }

    @Override // defpackage.XF0
    public final boolean S0() {
        return !(S() instanceof InterfaceC7719xx0);
    }

    public boolean T(@NotNull Throwable th) {
        return false;
    }

    public final void V(@Nullable XF0 xf0) {
        C7960z51 c7960z51 = C7960z51.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        if (xf0 == null) {
            atomicReferenceFieldUpdater.set(this, c7960z51);
            return;
        }
        xf0.start();
        WB wbV = xf0.v(this);
        atomicReferenceFieldUpdater.set(this, wbV);
        if (S0()) {
            wbV.b();
            atomicReferenceFieldUpdater.set(this, c7960z51);
        }
    }

    @Override // defpackage.XF0
    @NotNull
    public final A20 W(@NotNull Function1<? super Throwable, Unit> function1) {
        return Y(false, true, new InterfaceC2672aC0.a(function1));
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:98:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00c9 A[EDGE_INSN: B:99:0x00c9->B:78:0x00c9 BREAK  A[LOOP:0: B:18:0x0027->B:108:0x0027], SYNTHETIC] */
    @NotNull
    public final A20 Y(boolean z, boolean z2, @NotNull InterfaceC2672aC0 interfaceC2672aC0) {
        AbstractC3746fG0 c2675aD0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thB;
        if (z) {
            c2675aD0 = interfaceC2672aC0 instanceof ZF0 ? (ZF0) interfaceC2672aC0 : null;
            if (c2675aD0 == null) {
                c2675aD0 = new ZC0(interfaceC2672aC0);
            }
        } else {
            c2675aD0 = interfaceC2672aC0 instanceof AbstractC3746fG0 ? (AbstractC3746fG0) interfaceC2672aC0 : null;
            if (c2675aD0 == null) {
                c2675aD0 = new C2675aD0(interfaceC2672aC0);
            }
        }
        c2675aD0.h = this;
        loop0: while (true) {
            Object objS = S();
            if (objS instanceof C3083c60) {
                C3083c60 c3083c60 = (C3083c60) objS;
                if (c3083c60.d) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, objS, c2675aD0)) {
                        if (atomicReferenceFieldUpdater2.get(this) != objS) {
                        }
                    }
                    break loop0;
                }
                C7119v51 c7119v51 = new C7119v51();
                InterfaceC7719xx0 c6878tx0 = c3083c60.d ? c7119v51 : new C6878tx0(c7119v51);
                do {
                    atomicReferenceFieldUpdater = d;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c3083c60, c6878tx0)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == c3083c60);
            } else {
                if (!(objS instanceof InterfaceC7719xx0)) {
                    if (z2) {
                        OG og = objS instanceof OG ? (OG) objS : null;
                        interfaceC2672aC0.a(og != null ? og.a : null);
                    }
                    return C7960z51.d;
                }
                C7119v51 c7119v51H = ((InterfaceC7719xx0) objS).h();
                if (c7119v51H == null) {
                    Intrinsics.c(objS, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m0((AbstractC3746fG0) objS);
                } else {
                    A20 a20 = C7960z51.d;
                    if (z && (objS instanceof c)) {
                        synchronized (objS) {
                            try {
                                thB = ((c) objS).b();
                                if (thB == null || ((interfaceC2672aC0 instanceof XB) && !((c) objS).d())) {
                                    if (w((InterfaceC7719xx0) objS, c7119v51H, c2675aD0)) {
                                        if (thB == null) {
                                            return c2675aD0;
                                        }
                                        a20 = c2675aD0;
                                    }
                                }
                                Unit unit = Unit.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thB != null) {
                            if (z2) {
                                interfaceC2672aC0.a(thB);
                            }
                            return a20;
                        }
                        if (w((InterfaceC7719xx0) objS, c7119v51H, c2675aD0)) {
                            break;
                            break;
                        }
                    } else {
                        thB = null;
                        if (thB != null) {
                            if (z2) {
                                interfaceC2672aC0.a(thB);
                            }
                            return a20;
                        }
                        if (w((InterfaceC7719xx0) objS, c7119v51H, c2675aD0)) {
                            break;
                        }
                    }
                }
            }
        }
        return c2675aD0;
    }

    public boolean a0() {
        return this instanceof C3875ft;
    }

    @Override // defpackage.XF0
    @Nullable
    public final Object b1(@NotNull JM<? super Unit> frame) {
        Object objS;
        do {
            objS = S();
            if (!(objS instanceof InterfaceC7719xx0)) {
                ED.h(frame.getContext());
                return Unit.a;
            }
        } while (n0(objS) < 0);
        C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
        c6251qy.r();
        c6251qy.v(new D20(ED.j(this, false, new C1951Rt1(c6251qy), 3)));
        Object objQ = c6251qy.q();
        MN mn = MN.d;
        if (objQ == mn) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (objQ != mn) {
            objQ = Unit.a;
        }
        return objQ == mn ? objQ : Unit.a;
    }

    @Override // defpackage.XF0
    @NotNull
    public final Sequence<XF0> c() {
        d block = new d(null, this);
        Intrinsics.checkNotNullParameter(block, "block");
        return new CH1(block);
    }

    public final boolean c0(@Nullable Object obj) {
        Object objP0;
        do {
            objP0 = p0(S(), obj);
            if (objP0 == C3787fU.d) {
                return false;
            }
            if (objP0 == C3787fU.e) {
                return true;
            }
        } while (objP0 == C3787fU.g);
        x(objP0);
        return true;
    }

    @Nullable
    public final Object d0(@Nullable Object obj) {
        Object objP0;
        do {
            objP0 = p0(S(), obj);
            if (objP0 == C3787fU.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                OG og = obj instanceof OG ? (OG) obj : null;
                throw new IllegalStateException(str, og != null ? og.a : null);
            }
        } while (objP0 == C3787fU.g);
        return objP0;
    }

    @NotNull
    public String e0() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.XF0
    public boolean g() {
        Object objS = S();
        return (objS instanceof InterfaceC7719xx0) && ((InterfaceC7719xx0) objS).g();
    }

    public final void g0(C7119v51 c7119v51, Throwable th) {
        Object objF = c7119v51.f();
        Intrinsics.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        QG qg = null;
        for (C3782fS0 c3782fS0I = (C3782fS0) objF; !c3782fS0I.equals(c7119v51); c3782fS0I = c3782fS0I.i()) {
            if (c3782fS0I instanceof ZF0) {
                AbstractC3746fG0 abstractC3746fG0 = (AbstractC3746fG0) c3782fS0I;
                try {
                    abstractC3746fG0.a(th);
                } catch (Throwable th2) {
                    if (qg != null) {
                        J90.a(qg, th2);
                    } else {
                        qg = new QG("Exception in completion handler " + abstractC3746fG0 + " for " + this, th2);
                        Unit unit = Unit.a;
                    }
                }
            }
        }
        if (qg != null) {
            U(qg);
        }
        F(th);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.a<?> getKey() {
        return XF0.a.d;
    }

    @Override // defpackage.XF0
    @Nullable
    public final XF0 getParent() {
        WB wb = (WB) e.get(this);
        if (wb != null) {
            return wb.getParent();
        }
        return null;
    }

    @Override // defpackage.XF0
    public final boolean isCancelled() {
        Object objS = S();
        if (objS instanceof OG) {
            return true;
        }
        return (objS instanceof c) && ((c) objS).c();
    }

    @Override // defpackage.XF0, defpackage.InterfaceC0764Co1
    public void l(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new YF0(H(), null, this);
        }
        E(cancellationException);
    }

    public final void m0(AbstractC3746fG0 abstractC3746fG0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C7119v51 c7119v51 = new C7119v51();
        abstractC3746fG0.getClass();
        C3782fS0.e.set(c7119v51, abstractC3746fG0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C3782fS0.d;
        atomicReferenceFieldUpdater2.set(c7119v51, abstractC3746fG0);
        loop0: while (abstractC3746fG0.f() == abstractC3746fG0) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC3746fG0, abstractC3746fG0, c7119v51)) {
                    c7119v51.d(abstractC3746fG0);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(abstractC3746fG0) == abstractC3746fG0);
        }
        C3782fS0 c3782fS0I = abstractC3746fG0.i();
        do {
            atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC3746fG0, c3782fS0I)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC3746fG0);
    }

    public final int n0(Object obj) {
        boolean z = obj instanceof C3083c60;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        if (z) {
            if (((C3083c60) obj).d) {
                return 0;
            }
            C3083c60 c3083c60 = C3787fU.k;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3083c60)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            l0();
            return 1;
        }
        if (!(obj instanceof C6878tx0)) {
            return 0;
        }
        C7119v51 c7119v51 = ((C6878tx0) obj).d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7119v51)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        l0();
        return 1;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public final <E extends CoroutineContext.Element> E p(@NotNull CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.a(this, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.Throwable] */
    public final Object p0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC7719xx0)) {
            return C3787fU.d;
        }
        XB xbF0 = null;
        if (((obj instanceof C3083c60) || (obj instanceof AbstractC3746fG0)) && !(obj instanceof XB) && !(obj2 instanceof OG)) {
            InterfaceC7719xx0 interfaceC7719xx0 = (InterfaceC7719xx0) obj;
            Object c0634Ax0 = obj2 instanceof InterfaceC7719xx0 ? new C0634Ax0((InterfaceC7719xx0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = d;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC7719xx0, c0634Ax0)) {
                    k0(obj2);
                    J(interfaceC7719xx0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC7719xx0);
            return C3787fU.g;
        }
        InterfaceC7719xx0 interfaceC7719xx1 = (InterfaceC7719xx0) obj;
        C7119v51 c7119v51R = R(interfaceC7719xx1);
        if (c7119v51R == null) {
            return C3787fU.g;
        }
        c cVar = interfaceC7719xx1 instanceof c ? (c) interfaceC7719xx1 : null;
        if (cVar == null) {
            cVar = new c(c7119v51R, null);
        }
        C3027bp1 c3027bp1 = new C3027bp1();
        synchronized (cVar) {
            try {
                if (cVar.d()) {
                    return C3787fU.d;
                }
                c.e.set(cVar, 1);
                if (cVar != interfaceC7719xx1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC7719xx1, cVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC7719xx1) {
                            return C3787fU.g;
                        }
                    }
                }
                boolean zC = cVar.c();
                OG og = obj2 instanceof OG ? (OG) obj2 : null;
                if (og != null) {
                    cVar.a(og.a);
                }
                ?? B = !zC ? cVar.b() : 0;
                c3027bp1.d = B;
                Unit unit = Unit.a;
                if (B != 0) {
                    g0(c7119v51R, B);
                }
                XB xb = interfaceC7719xx1 instanceof XB ? (XB) interfaceC7719xx1 : null;
                if (xb == null) {
                    C7119v51 c7119v51H = interfaceC7719xx1.h();
                    if (c7119v51H != null) {
                        xbF0 = f0(c7119v51H);
                    }
                } else {
                    xbF0 = xb;
                }
                if (xbF0 != null) {
                    while (ED.j(xbF0.i, false, new b(this, cVar, xbF0, obj2), 1) == C7960z51.d) {
                        xbF0 = f0(xbF0);
                        if (xbF0 == null) {
                        }
                    }
                    return C3787fU.e;
                }
                return M(cVar, obj2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.XF0
    public final boolean start() {
        int iN0;
        do {
            iN0 = n0(S());
            if (iN0 == 0) {
                return false;
            }
        } while (iN0 != 1);
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext t(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.c(this, coroutineContext);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(e0() + '{' + o0(S()) + '}');
        sb.append('@');
        sb.append(C3787fU.f(this));
        return sb.toString();
    }

    @Override // defpackage.XF0
    @NotNull
    public final WB v(@NotNull C3956gG0 c3956gG0) {
        A20 a20J = ED.j(this, true, new XB(c3956gG0), 2);
        Intrinsics.c(a20J, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (WB) a20J;
    }

    public final boolean w(InterfaceC7719xx0 interfaceC7719xx0, C7119v51 c7119v51, AbstractC3746fG0 abstractC3746fG0) {
        char c2;
        C4166hG0 c4166hG0 = new C4166hG0(abstractC3746fG0, this, interfaceC7719xx0);
        do {
            C3782fS0 c3782fS0C = c7119v51.c();
            if (c3782fS0C == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3782fS0.e;
                Object obj = atomicReferenceFieldUpdater.get(c7119v51);
                while (true) {
                    c3782fS0C = (C3782fS0) obj;
                    if (!c3782fS0C.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c3782fS0C);
                }
            }
            C3782fS0.e.set(abstractC3746fG0, c3782fS0C);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C3782fS0.d;
            atomicReferenceFieldUpdater2.set(abstractC3746fG0, c7119v51);
            c4166hG0.c = c7119v51;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(c3782fS0C, c7119v51, c4166hG0)) {
                    if (c4166hG0.a(c3782fS0C) != null) {
                        c2 = 2;
                        break;
                    }
                    c2 = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(c3782fS0C) != c7119v51) {
                    c2 = 0;
                    break;
                }
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    public void y(@Nullable Object obj) {
        x(obj);
    }

    @Nullable
    public final Object z(@NotNull JM<Object> frame) throws Throwable {
        Object objS;
        do {
            objS = S();
            if (!(objS instanceof InterfaceC7719xx0)) {
                if (objS instanceof OG) {
                    throw ((OG) objS).a;
                }
                return C3787fU.o(objS);
            }
        } while (n0(objS) < 0);
        a aVar = new a(C5885pC0.b(frame), this);
        aVar.r();
        aVar.v(new D20(ED.j(this, false, new C1873Qt1(aVar), 3)));
        Object objQ = aVar.q();
        if (objQ == MN.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objQ;
    }

    public void l0() {
    }

    public void U(@NotNull QG qg) {
        throw qg;
    }

    public void j0(@Nullable Throwable th) {
    }

    public void k0(@Nullable Object obj) {
    }

    public void x(@Nullable Object obj) {
    }
}

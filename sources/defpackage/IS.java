package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class IS<T> implements ES<T> {

    @NotNull
    public final C3608ed0 a;

    @NotNull
    public final WN<T> b;

    @NotNull
    public final EM c;

    @NotNull
    public final C3735fC1 d;

    @NotNull
    public final C4795k21 e;
    public int f;

    @Nullable
    public C2936bP1 g;

    @NotNull
    public final C3574eT<T> h;

    @NotNull
    public final IS<T>.a i;

    @NotNull
    public final KW1 j;

    @NotNull
    public final KW1 k;

    @NotNull
    public final ZL1<AbstractC6373rZ0.a<T>> l;

    public final class a extends AbstractC7352wB1 {

        @Nullable
        public List<? extends Function2<? super InterfaceC6089qA0<T>, ? super JM<? super Unit>, ? extends Object>> c;
        public final /* synthetic */ IS<T> d;

        public a(@NotNull IS is, List<? extends Function2<? super InterfaceC6089qA0<T>, ? super JM<? super Unit>, ? extends Object>> initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.d = is;
            this.c = CollectionsKt.e0(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0066  */
        /* JADX WARN: Code duplicated, block: B:29:0x0072  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.AbstractC7352wB1
        @Nullable
        public final Object a(@NotNull LM lm) throws VN {
            FS fs;
            a aVar;
            C4669jS c4669jS;
            if (lm instanceof FS) {
                fs = (FS) lm;
                int i = fs.h;
                if ((i & Integer.MIN_VALUE) != 0) {
                    fs.h = i - Integer.MIN_VALUE;
                } else {
                    fs = new FS(this, lm);
                }
            } else {
                fs = new FS(this, lm);
            }
            Object objF = fs.e;
            MN mn = MN.d;
            int i2 = fs.h;
            if (i2 == 0) {
                C1795Pt1.b(objF);
                List<? extends Function2<? super InterfaceC6089qA0<T>, ? super JM<? super Unit>, ? extends Object>> list = this.c;
                IS<T> is = this.d;
                if (list != null) {
                    Intrinsics.checkNotNull(list);
                    if (list.isEmpty()) {
                        fs.d = this;
                        fs.h = 1;
                        objF = IS.f(is, false, fs);
                        if (objF != mn) {
                            aVar = this;
                            c4669jS = (C4669jS) objF;
                        }
                    } else {
                        SB0 sb0G = is.g();
                        HS hs = new HS(is, this, null);
                        fs.d = this;
                        fs.h = 2;
                        objF = sb0G.a(hs, fs);
                        if (objF != mn) {
                            aVar = this;
                            c4669jS = (C4669jS) objF;
                        }
                    }
                } else {
                    fs.d = this;
                    fs.h = 1;
                    objF = IS.f(is, false, fs);
                    if (objF != mn) {
                        aVar = this;
                        c4669jS = (C4669jS) objF;
                    }
                }
                return mn;
            }
            if (i2 == 1) {
                aVar = fs.d;
                C1795Pt1.b(objF);
                c4669jS = (C4669jS) objF;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = fs.d;
                C1795Pt1.b(objF);
                c4669jS = (C4669jS) objF;
            }
            aVar.d.h.b(c4669jS);
            return Unit.a;
        }
    }

    public IS(@NotNull C3608ed0 storage, @NotNull List initTasksList, @NotNull WN corruptionHandler, @NotNull EM scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = storage;
        this.b = corruptionHandler;
        this.c = scope;
        this.d = new C3735fC1(new JS(this, null));
        this.e = ED.c();
        this.h = new C3574eT<>();
        this.i = new a(this, initTasksList);
        int i = 2;
        this.j = XO0.b(new C5430n3(this, i));
        this.k = XO0.b(new C5220m3(this, i));
        this.l = new ZL1<>(scope, new ZS(this, 0), C2722aT.d, new C2946bT(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(IS is, LM lm) {
        KS ks;
        C4795k21 c4795k21;
        is.getClass();
        if (lm instanceof KS) {
            ks = (KS) lm;
            int i = ks.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ks.i = i - Integer.MIN_VALUE;
            } else {
                ks = new KS(is, lm);
            }
        } else {
            ks = new KS(is, lm);
        }
        Object obj = ks.g;
        MN mn = MN.d;
        int i2 = ks.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            ks.d = is;
            c4795k21 = is.e;
            ks.e = c4795k21;
            ks.i = 1;
            if (c4795k21.a(ks) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4795k21 c4795k22 = ks.e;
            IS is2 = ks.d;
            C1795Pt1.b(obj);
            c4795k21 = c4795k22;
            is = is2;
        }
        try {
            int i3 = is.f - 1;
            is.f = i3;
            if (i3 == 0) {
                C2936bP1 c2936bP1 = is.g;
                if (c2936bP1 != null) {
                    c2936bP1.l(null);
                }
                is.g = null;
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            c4795k21.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [AW1, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v8, types: [AW1, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v0, types: [IS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [IS] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3, types: [CG] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.IS r9, defpackage.AbstractC6373rZ0.a r10, defpackage.LM r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IS.c(IS, rZ0$a, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(IS is, LM lm) {
        NS ns;
        C4795k21 c4795k21;
        is.getClass();
        if (lm instanceof NS) {
            ns = (NS) lm;
            int i = ns.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ns.i = i - Integer.MIN_VALUE;
            } else {
                ns = new NS(is, lm);
            }
        } else {
            ns = new NS(is, lm);
        }
        Object obj = ns.g;
        MN mn = MN.d;
        int i2 = ns.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            ns.d = is;
            c4795k21 = is.e;
            ns.e = c4795k21;
            ns.i = 1;
            if (c4795k21.a(ns) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4795k21 c4795k22 = ns.e;
            IS is2 = ns.d;
            C1795Pt1.b(obj);
            c4795k21 = c4795k22;
            is = is2;
        }
        try {
            int i3 = is.f + 1;
            is.f = i3;
            if (i3 == 1) {
                is.g = C5189lv.k(is.c, null, new OS(is, null), 3);
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            c4795k21.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(IS is, boolean z, JM jm) {
        QS qs;
        IS is2;
        EP1<T> ep1;
        IS is3;
        Pair pair;
        EP1 ep2;
        is.getClass();
        if (jm instanceof QS) {
            qs = (QS) jm;
            int i = qs.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                qs.j = i - Integer.MIN_VALUE;
            } else {
                qs = new QS(is, jm);
            }
        } else {
            qs = new QS(is, jm);
        }
        Object objC = qs.h;
        MN mn = MN.d;
        int i2 = qs.j;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            EP1<T> ep1A = is.h.a();
            if (ep1A instanceof C6502s82) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            SB0 sb0G = is.g();
            qs.d = is;
            qs.e = ep1A;
            qs.g = z;
            qs.j = 1;
            Integer numE = sb0G.e();
            if (numE != mn) {
                is2 = is;
                ep1 = ep1A;
                objC = numE;
            }
            return mn;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                is3 = qs.d;
                C1795Pt1.b(objC);
                pair = (Pair) objC;
                ep2 = (EP1) pair.d;
                if (((Boolean) pair.e).booleanValue()) {
                    is3.h.b(ep2);
                }
                return ep2;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            is3 = qs.d;
            C1795Pt1.b(objC);
            pair = (Pair) objC;
            ep2 = (EP1) pair.d;
            if (((Boolean) pair.e).booleanValue()) {
                is3.h.b(ep2);
            }
            return ep2;
        }
        z = qs.g;
        ep1 = qs.e;
        is2 = qs.d;
        C1795Pt1.b(objC);
        int iIntValue = ((Number) objC).intValue();
        boolean z2 = ep1 instanceof C4669jS;
        int i3 = z2 ? ep1.a : -1;
        if (z2 && iIntValue == i3) {
            return ep1;
        }
        if (z) {
            SB0 sb0G2 = is2.g();
            RS rs = new RS(is2, null);
            qs.d = is2;
            qs.e = null;
            qs.j = 2;
            objC = sb0G2.a(rs, qs);
            if (objC != mn) {
                is3 = is2;
                pair = (Pair) objC;
                ep2 = (EP1) pair.d;
                if (((Boolean) pair.e).booleanValue()) {
                    is3.h.b(ep2);
                }
                return ep2;
            }
        } else {
            SB0 sb0G3 = is2.g();
            SS ss = new SS(is2, i3, null);
            qs.d = is2;
            qs.e = null;
            qs.j = 3;
            objC = sb0G3.c(ss, qs);
            if (objC != mn) {
                is3 = is2;
                pair = (Pair) objC;
                ep2 = (EP1) pair.d;
                if (((Boolean) pair.e).booleanValue()) {
                    is3.h.b(ep2);
                }
                return ep2;
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a2 A[Catch: VN -> 0x0062, TryCatch #2 {VN -> 0x0062, blocks: (B:19:0x005d, B:54:0x0101, B:24:0x006b, B:51:0x00e3, B:32:0x0088, B:40:0x00a2, B:42:0x00a8, B:36:0x0091, B:48:0x00d0), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e A[Catch: all -> 0x016a, TryCatch #1 {all -> 0x016a, blocks: (B:61:0x012c, B:63:0x013e, B:64:0x0146), top: B:80:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0146 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #1 {all -> 0x016a, blocks: (B:61:0x012c, B:63:0x013e, B:64:0x0146), top: B:80:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(IS is, boolean z, LM lm) throws VN {
        TS ts;
        C3027bp1 c3027bp1;
        VN vn;
        IS is2;
        boolean z2;
        C3027bp1 c3027bp2;
        C2590Zo1 c2590Zo1;
        VN vn2;
        VS vs;
        Object objA;
        C2590Zo1 c2590Zo2;
        C3027bp1 c3027bp3;
        int iHashCode;
        Integer numE;
        IS is3;
        int i;
        Object obj;
        is.getClass();
        if (lm instanceof TS) {
            ts = (TS) lm;
            int i2 = ts.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ts.m = i2 - Integer.MIN_VALUE;
            } else {
                ts = new TS(is, lm);
            }
        } else {
            ts = new TS(is, lm);
        }
        Object obj2 = (T) ts.k;
        Object c4669jS = MN.d;
        try {
            switch (ts.m) {
                case 0:
                    C1795Pt1.b(obj2);
                    if (z) {
                        ts.d = is;
                        ts.i = z;
                        ts.m = 1;
                        obj2 = (T) is.i(ts);
                        if (obj2 != c4669jS) {
                            if (obj2 != null) {
                                iHashCode = obj2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            SB0 sb0G = is.g();
                            ts.d = is;
                            ts.e = obj2;
                            ts.i = z;
                            ts.j = iHashCode;
                            ts.m = 2;
                            numE = sb0G.e();
                            if (numE != c4669jS) {
                                is3 = is;
                                i = iHashCode;
                                obj = obj2;
                                obj2 = (T) numE;
                                return new C4669jS(obj, i, ((Number) obj2).intValue());
                            }
                        }
                    } else {
                        SB0 sb0G2 = is.g();
                        ts.d = is;
                        ts.i = z;
                        ts.m = 3;
                        obj2 = (T) sb0G2.e();
                        if (obj2 != c4669jS) {
                            int iIntValue = ((Number) obj2).intValue();
                            SB0 sb0G3 = is.g();
                            US us = new US(is, iIntValue, null);
                            ts.d = is;
                            ts.i = z;
                            ts.m = 4;
                            obj2 = (T) sb0G3.c(us, ts);
                            if (obj2 == c4669jS) {
                            }
                            return (C4669jS) obj2;
                        }
                    }
                    return c4669jS;
                case 1:
                    z = ts.i;
                    is = (IS) ts.d;
                    C1795Pt1.b(obj2);
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    SB0 sb0G4 = is.g();
                    ts.d = is;
                    ts.e = obj2;
                    ts.i = z;
                    ts.j = iHashCode;
                    ts.m = 2;
                    numE = sb0G4.e();
                    if (numE != c4669jS) {
                        is3 = is;
                        i = iHashCode;
                        obj = obj2;
                        obj2 = (T) numE;
                        return new C4669jS(obj, i, ((Number) obj2).intValue());
                    }
                    return c4669jS;
                case 2:
                    i = ts.j;
                    z = ts.i;
                    obj = ts.e;
                    is3 = (IS) ts.d;
                    try {
                        C1795Pt1.b(obj2);
                        return new C4669jS(obj, i, ((Number) obj2).intValue());
                    } catch (VN e) {
                        e = e;
                        is = is3;
                        c3027bp1 = new C3027bp1();
                        WN<T> wn = is.b;
                        ts.d = is;
                        ts.e = e;
                        ts.g = c3027bp1;
                        ts.h = c3027bp1;
                        ts.i = z;
                        ts.m = 5;
                        Object objA2 = wn.a(e);
                        if (objA2 != c4669jS) {
                            vn = e;
                            obj2 = (T) objA2;
                            is2 = is;
                            z2 = z;
                            c3027bp2 = c3027bp1;
                            c3027bp2.d = (T) obj2;
                            c2590Zo1 = new C2590Zo1();
                            try {
                                vs = new VS(c3027bp1, is2, c2590Zo1, null);
                                ts.d = vn;
                                ts.e = c3027bp1;
                                ts.g = c2590Zo1;
                                ts.h = null;
                                ts.m = 6;
                                if (z2) {
                                    is2.getClass();
                                    objA = vs.invoke(ts);
                                } else {
                                    objA = is2.g().a(new LS(vs, null), ts);
                                }
                                if (objA != c4669jS) {
                                    c2590Zo2 = c2590Zo1;
                                    c3027bp3 = c3027bp1;
                                    T t = c3027bp3.d;
                                    c4669jS = new C4669jS(t, t != null ? t.hashCode() : 0, c2590Zo2.d);
                                }
                            } catch (Throwable th) {
                                th = th;
                                vn2 = vn;
                                J90.a(vn2, th);
                                throw vn2;
                            }
                        }
                        return c4669jS;
                    }
                case 3:
                    z = ts.i;
                    is = (IS) ts.d;
                    C1795Pt1.b(obj2);
                    int iIntValue2 = ((Number) obj2).intValue();
                    SB0 sb0G5 = is.g();
                    US us2 = new US(is, iIntValue2, null);
                    ts.d = is;
                    ts.i = z;
                    ts.m = 4;
                    obj2 = (T) sb0G5.c(us2, ts);
                    if (obj2 == c4669jS) {
                        return c4669jS;
                    }
                    return (C4669jS) obj2;
                case 4:
                    boolean z3 = ts.i;
                    C1795Pt1.b(obj2);
                    return (C4669jS) obj2;
                case 5:
                    z2 = ts.i;
                    c3027bp2 = ts.h;
                    c3027bp1 = (C3027bp1) ts.g;
                    vn = (VN) ts.e;
                    is2 = (IS) ts.d;
                    C1795Pt1.b(obj2);
                    c3027bp2.d = (T) obj2;
                    c2590Zo1 = new C2590Zo1();
                    vs = new VS(c3027bp1, is2, c2590Zo1, null);
                    ts.d = vn;
                    ts.e = c3027bp1;
                    ts.g = c2590Zo1;
                    ts.h = null;
                    ts.m = 6;
                    if (z2) {
                        is2.getClass();
                        objA = vs.invoke(ts);
                    } else {
                        objA = is2.g().a(new LS(vs, null), ts);
                    }
                    if (objA != c4669jS) {
                        c2590Zo2 = c2590Zo1;
                        c3027bp3 = c3027bp1;
                        T t2 = c3027bp3.d;
                        c4669jS = new C4669jS(t2, t2 != null ? t2.hashCode() : 0, c2590Zo2.d);
                    }
                    return c4669jS;
                case 6:
                    c2590Zo2 = (C2590Zo1) ts.g;
                    c3027bp3 = (C3027bp1) ts.e;
                    vn2 = (VN) ts.d;
                    try {
                        C1795Pt1.b(obj2);
                        T t3 = c3027bp3.d;
                        c4669jS = new C4669jS(t3, t3 != null ? t3.hashCode() : 0, c2590Zo2.d);
                        return c4669jS;
                    } catch (Throwable th2) {
                        th = th2;
                        J90.a(vn2, th);
                        throw vn2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (VN e2) {
            e = e2;
        }
    }

    @Override // defpackage.ES
    @Nullable
    public final Object a(@NotNull Function2 function2, @NotNull LM lm) {
        C2970ba2 c2970ba2 = (C2970ba2) lm.getContext().p(C2746aa2.d);
        if (c2970ba2 != null) {
            c2970ba2.a(this);
        }
        return C5189lv.p(new C2970ba2(c2970ba2, this), new YS(this, function2, null), lm);
    }

    public final SB0 g() {
        return (SB0) this.k.getValue();
    }

    @Override // defpackage.ES
    @NotNull
    public final InterfaceC6396rf0<T> getData() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.b(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.LM r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.PS
            if (r0 == 0) goto L13
            r0 = r6
            PS r0 = (defpackage.PS) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            PS r0 = new PS
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.e
            IS r0 = r0.d
            defpackage.C1795Pt1.b(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            IS r2 = r0.d
            defpackage.C1795Pt1.b(r6)
            goto L51
        L3e:
            defpackage.C1795Pt1.b(r6)
            SB0 r6 = r5.g()
            r0.d = r5
            r0.i = r4
            java.lang.Integer r6 = r6.e()
            if (r6 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            IS<T>$a r4 = r2.i     // Catch: java.lang.Throwable -> L6d
            r0.d = r2     // Catch: java.lang.Throwable -> L6d
            r0.e = r6     // Catch: java.lang.Throwable -> L6d
            r0.i = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.b(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L69:
            r1 = r6
            r6 = r0
            r0 = r2
            goto L6f
        L6d:
            r0 = move-exception
            goto L69
        L6f:
            eT<T> r0 = r0.h
            An1 r2 = new An1
            r2.<init>(r6, r1)
            r0.b(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IS.h(LM):java.lang.Object");
    }

    public final Object i(LM lm) {
        return ((MQ1) this.j.getValue()).d(new NQ1(3, null), lm);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object j(Object obj, boolean z, @NotNull LM lm) {
        C3155cT c3155cT;
        C2590Zo1 c2590Zo1;
        if (lm instanceof C3155cT) {
            c3155cT = (C3155cT) lm;
            int i = c3155cT.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3155cT.h = i - Integer.MIN_VALUE;
            } else {
                c3155cT = new C3155cT(this, lm);
            }
        } else {
            c3155cT = new C3155cT(this, lm);
        }
        Object obj2 = c3155cT.e;
        MN mn = MN.d;
        int i2 = c3155cT.h;
        if (i2 == 0) {
            C1795Pt1.b(obj2);
            C2590Zo1 c2590Zo2 = new C2590Zo1();
            MQ1 mq1 = (MQ1) this.j.getValue();
            C3365dT c3365dT = new C3365dT(c2590Zo2, this, obj, z, null);
            c3155cT.d = c2590Zo2;
            c3155cT.h = 1;
            if (mq1.c(c3365dT, c3155cT) == mn) {
                return mn;
            }
            c2590Zo1 = c2590Zo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2590Zo1 = c3155cT.d;
            C1795Pt1.b(obj2);
        }
        return new Integer(c2590Zo1.d);
    }
}

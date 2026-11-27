package defpackage;

import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: z22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7949z22 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final AbstractC7004uZ1 b;

    @NotNull
    public final J22 c;

    @NotNull
    public final NQ d;

    @NotNull
    public final AbstractC2199Uy0 e;

    @NotNull
    public final AbstractC1787Pr f;

    @NotNull
    public final AbstractC2783ak g;

    @Nullable
    public C2936bP1 h;

    @NotNull
    public final GP1 i;

    @NotNull
    public final GP1 j;

    @NotNull
    public final C6120qK1 k;

    @NotNull
    public final C1621Nn1 l;

    @NotNull
    public final C1699On1 m;

    @NotNull
    public final C1699On1 n;

    @NotNull
    public final InterfaceC6396rf0<C3279d22> o;

    /* JADX INFO: renamed from: z22$a */
    @InterfaceC3368dU(c = "com.api.feature.trading.providers.TradingAssetsProvider$init$1", f = "TradingAssetsProvider.kt", l = {98}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: z22$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.api.feature.trading.providers.TradingAssetsProvider$init$1$1", f = "TradingAssetsProvider.kt", l = {91, 92}, m = "invokeSuspend")
        public static final class C0546a extends AW1 implements InterfaceC1138Hj0<C7152vF, C1491Lx0, List<? extends C6942uF>, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public /* synthetic */ Object g;
            public /* synthetic */ List h;
            public final /* synthetic */ AbstractC7949z22 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0546a(AbstractC7949z22 abstractC7949z22, JM<? super C0546a> jm) {
                super(4, jm);
                this.i = abstractC7949z22;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0078  */
            /* JADX WARN: Code duplicated, block: B:43:0x00e6 A[LOOP:0: B:41:0x00e0->B:43:0x00e6, LOOP_END] */
            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                List list;
                List listZ;
                List list2;
                List list3;
                ArrayList arrayList;
                Iterator it;
                MN mn = MN.d;
                int i = this.d;
                AbstractC7949z22 abstractC7949z22 = this.i;
                if (i != 0) {
                    if (i == 1) {
                        List list4 = (List) this.g;
                        List list5 = (List) this.e;
                        C1795Pt1.b(obj);
                        listZ = list4;
                        list2 = list5;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list3 = (List) this.g;
                        list2 = (List) this.e;
                        C1795Pt1.b(obj);
                    }
                    abstractC7949z22.i.setValue(list3);
                    list = list2;
                    GP1 gp1 = abstractC7949z22.j;
                    arrayList = new ArrayList(XE.m(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(abstractC7949z22.l((C6942uF) it.next()));
                    }
                    gp1.getClass();
                    gp1.m(null, arrayList);
                    return Unit.a;
                }
                C1795Pt1.b(obj);
                C7152vF c7152vF = (C7152vF) this.e;
                C1491Lx0 c1491Lx0 = (C1491Lx0) this.g;
                list = this.h;
                if (c1491Lx0.j) {
                    if (c7152vF != null) {
                        abstractC7949z22.getClass();
                        ArrayList arrayList2 = c7152vF.a;
                        ArrayList arrayList3 = new ArrayList(XE.m(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(abstractC7949z22.l((C6942uF) it2.next()));
                        }
                        listZ = CollectionsKt.Z(arrayList3, new B22());
                    } else {
                        listZ = null;
                    }
                } else if (c7152vF != null) {
                    ArrayList arrayList4 = c7152vF.a;
                    ArrayList arrayList5 = new ArrayList(XE.m(arrayList4, 10));
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(abstractC7949z22.l((C6942uF) it3.next()));
                    }
                    listZ = arrayList5;
                } else {
                    listZ = null;
                }
                if (listZ == null) {
                    return Unit.a;
                }
                if (!listZ.isEmpty()) {
                    this.e = list;
                    this.g = listZ;
                    this.d = 1;
                    if (abstractC7949z22.m(listZ, this) != mn) {
                        list2 = list;
                    }
                    return mn;
                }
                abstractC7949z22.d();
                GP1 gp2 = abstractC7949z22.j;
                arrayList = new ArrayList(XE.m(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(abstractC7949z22.l((C6942uF) it.next()));
                }
                gp2.getClass();
                gp2.m(null, arrayList);
                return Unit.a;
                this.e = list2;
                this.g = listZ;
                this.d = 2;
                if (AbstractC7949z22.a(abstractC7949z22, listZ, this) != mn) {
                    list3 = listZ;
                    abstractC7949z22.i.setValue(list3);
                    list = list2;
                    GP1 gp3 = abstractC7949z22.j;
                    arrayList = new ArrayList(XE.m(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(abstractC7949z22.l((C6942uF) it.next()));
                    }
                    gp3.getClass();
                    gp3.m(null, arrayList);
                    return Unit.a;
                }
                return mn;
            }

            @Override // defpackage.InterfaceC1138Hj0
            public final Object l(C7152vF c7152vF, C1491Lx0 c1491Lx0, List<? extends C6942uF> list, JM<? super Unit> jm) {
                C0546a c0546a = new C0546a(this.i, jm);
                c0546a.e = c7152vF;
                c0546a.g = c1491Lx0;
                c0546a.h = list;
                return c0546a.invokeSuspend(Unit.a);
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC7949z22.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                AbstractC7949z22 abstractC7949z22 = AbstractC7949z22.this;
                C4923kf c4923kf = abstractC7949z22.a;
                C5561ng0 c5561ng0K = C4466ii.k(c4923kf.p, abstractC7949z22.d.b, c4923kf.q, new C0546a(abstractC7949z22, null));
                this.d = 1;
                if (C4466ii.i(c5561ng0K, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: z22$b */
    @InterfaceC3368dU(c = "com.api.feature.trading.providers.TradingAssetsProvider$init$2", f = "TradingAssetsProvider.kt", l = {101}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: z22$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ AbstractC7949z22 d;

            public a(AbstractC7949z22 abstractC7949z22) {
                this.d = abstractC7949z22;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final /* synthetic */ Object a(Object obj, JM jm) {
                long j = ((kotlin.time.b) obj).d;
                return b(jm);
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
            
                if (defpackage.AbstractC7949z22.b(r6, r0) == r1) goto L22;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(defpackage.JM r6) {
                /*
                    r5 = this;
                    boolean r0 = r6 instanceof defpackage.A22
                    if (r0 == 0) goto L13
                    r0 = r6
                    A22 r0 = (defpackage.A22) r0
                    int r1 = r0.h
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.h = r1
                    goto L18
                L13:
                    A22 r0 = new A22
                    r0.<init>(r5, r6)
                L18:
                    java.lang.Object r6 = r0.e
                    MN r1 = defpackage.MN.d
                    int r2 = r0.h
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L38
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    defpackage.C1795Pt1.b(r6)
                    goto L5f
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L32:
                    z22$b$a r2 = r0.d
                    defpackage.C1795Pt1.b(r6)
                    goto L51
                L38:
                    defpackage.C1795Pt1.b(r6)
                    z22 r6 = r5.d
                    GP1 r2 = r6.i
                    java.lang.Object r2 = r2.getValue()
                    java.util.List r2 = (java.util.List) r2
                    r0.d = r5
                    r0.h = r4
                    java.lang.Object r6 = r6.m(r2, r0)
                    if (r6 != r1) goto L50
                    goto L5e
                L50:
                    r2 = r5
                L51:
                    z22 r6 = r2.d
                    r2 = 0
                    r0.d = r2
                    r0.h = r3
                    java.lang.Object r6 = defpackage.AbstractC7949z22.b(r6, r0)
                    if (r6 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7949z22.b.a.b(JM):java.lang.Object");
            }
        }

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC7949z22.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                AbstractC7949z22 abstractC7949z22 = AbstractC7949z22.this;
                AbstractC1787Pr.a aVar = abstractC7949z22.f.b;
                a aVar2 = new a(abstractC7949z22);
                this.d = 1;
                if (aVar.c(aVar2, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: z22$c */
    @InterfaceC3368dU(c = "com.api.feature.trading.providers.TradingAssetsProvider$selectAsset$1", f = "TradingAssetsProvider.kt", l = {67}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C3279d22 g;

        /* JADX INFO: renamed from: z22$c$a */
        @InterfaceC3368dU(c = "com.api.feature.trading.providers.TradingAssetsProvider$selectAsset$1$1", f = "TradingAssetsProvider.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function1<JM<? super String>, Object> {
            public final /* synthetic */ C3279d22 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3279d22 c3279d22, JM<? super a> jm) {
                super(1, jm);
                this.d = c3279d22;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new a(this.d, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super String> jm) {
                return ((a) create(jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return this.d.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3279d22 c3279d22, JM<? super c> jm) {
            super(2, jm);
            this.g = c3279d22;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC7949z22.this.new c(this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                AbstractC2783ak abstractC2783ak = AbstractC7949z22.this.g;
                a aVar = new a(this.g, null);
                this.d = 1;
                if (abstractC2783ak.l(aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public AbstractC7949z22(@NotNull C4923kf appData, @NotNull AbstractC7004uZ1 timeSelectionsProvider, @NotNull J22 tradingCurrentAsset, @NotNull NQ currentIndicatorProvider, @NotNull AbstractC2199Uy0 indicatorUseCase, @NotNull AbstractC1787Pr betDurationUseCase, @NotNull AbstractC2783ak assetUseCase) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        Intrinsics.checkNotNullParameter(tradingCurrentAsset, "tradingCurrentAsset");
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(indicatorUseCase, "indicatorUseCase");
        Intrinsics.checkNotNullParameter(betDurationUseCase, "betDurationUseCase");
        Intrinsics.checkNotNullParameter(assetUseCase, "assetUseCase");
        this.a = appData;
        this.b = timeSelectionsProvider;
        this.c = tradingCurrentAsset;
        this.d = currentIndicatorProvider;
        this.e = indicatorUseCase;
        this.f = betDurationUseCase;
        this.g = assetUseCase;
        C5653o60 c5653o60 = C5653o60.d;
        this.i = C1589Ne.i(c5653o60);
        GP1 gp1I = C1589Ne.i(c5653o60);
        this.j = gp1I;
        C4466ii.f(gp1I);
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.k = c6120qK1G;
        this.l = C4466ii.e(c6120qK1G);
        this.m = tradingCurrentAsset.b;
        this.n = tradingCurrentAsset.d;
        this.o = tradingCurrentAsset.g;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101 A[DONT_INVERT, PHI: r2 r10
      0x0101: PHI (r2v5 z22) = (r2v4 z22), (r2v6 z22) binds: [B:48:0x00de, B:56:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r10v19 d22) = (r10v17 d22), (r10v23 d22) binds: [B:48:0x00de, B:56:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0103  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0109  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(AbstractC7949z22 abstractC7949z22, List list, LM lm) {
        D22 d22;
        AbstractC7949z22 abstractC7949z23;
        List list2;
        String str;
        String str2;
        List list3;
        Object objQ;
        AbstractC7949z22 abstractC7949z24;
        List list4;
        C3279d22 c3279d22;
        Iterator it;
        Object next;
        C3279d22 c3279d23;
        Object objC;
        C3279d22 c3279d24;
        AbstractC7949z22 abstractC7949z25;
        abstractC7949z22.getClass();
        if (lm instanceof D22) {
            d22 = (D22) lm;
            int i = d22.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                d22.j = i - Integer.MIN_VALUE;
            } else {
                d22 = new D22(abstractC7949z22, lm);
            }
        } else {
            d22 = new D22(abstractC7949z22, lm);
        }
        Object objO = d22.h;
        MN mn = MN.d;
        int i2 = d22.j;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            d22.d = abstractC7949z22;
            d22.e = list;
            d22.j = 1;
            objO = C4466ii.o(abstractC7949z22.m, d22);
            if (objO != mn) {
            }
            return mn;
        }
        if (i2 == 1) {
            list = (List) d22.e;
            abstractC7949z22 = d22.d;
            C1795Pt1.b(objO);
        } else {
            if (i2 == 2) {
                list2 = (List) d22.e;
                abstractC7949z23 = d22.d;
                C1795Pt1.b(objO);
                String str3 = (String) objO;
                list3 = list2;
                str2 = str3;
                C1699On1 c1699On1 = abstractC7949z23.n;
                d22.d = abstractC7949z23;
                d22.e = list3;
                d22.g = str2;
                d22.j = 3;
                objQ = C4466ii.q(c1699On1, d22);
                if (objQ != mn) {
                    abstractC7949z24 = abstractC7949z23;
                    list4 = list3;
                    objO = objQ;
                    c3279d22 = (C3279d22) objO;
                    if (str2 != null) {
                        it = list4.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.a(((C3279d22) next).c, str2));
                        c3279d23 = (C3279d22) next;
                        if (c3279d23 != null) {
                            d22.d = abstractC7949z24;
                            d22.e = c3279d22;
                            d22.g = c3279d23;
                            d22.j = 4;
                            objC = abstractC7949z24.c(c3279d23, null, d22);
                            if (objC != mn) {
                                objO = objC;
                                c3279d24 = c3279d22;
                                abstractC7949z25 = abstractC7949z24;
                            }
                        } else if (c3279d22 != null) {
                            abstractC7949z24.k(c3279d22);
                        }
                    } else if (c3279d22 != null) {
                        abstractC7949z24.k(c3279d22);
                    }
                    return Unit.a;
                }
                return mn;
            }
            if (i2 == 3) {
                str2 = (String) d22.g;
                list4 = (List) d22.e;
                abstractC7949z24 = d22.d;
                C1795Pt1.b(objO);
                c3279d22 = (C3279d22) objO;
                if (str2 != null) {
                    it = list4.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.a(((C3279d22) next).c, str2));
                    c3279d23 = (C3279d22) next;
                    if (c3279d23 != null) {
                        d22.d = abstractC7949z24;
                        d22.e = c3279d22;
                        d22.g = c3279d23;
                        d22.j = 4;
                        objC = abstractC7949z24.c(c3279d23, null, d22);
                        if (objC != mn) {
                            objO = objC;
                            c3279d24 = c3279d22;
                            abstractC7949z25 = abstractC7949z24;
                        }
                        return mn;
                    }
                    if (c3279d22 != null) {
                        abstractC7949z24.k(c3279d22);
                    }
                } else if (c3279d22 != null) {
                    abstractC7949z24.k(c3279d22);
                }
                return Unit.a;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3279d23 = (C3279d22) d22.g;
            c3279d24 = (C3279d22) d22.e;
            abstractC7949z25 = d22.d;
            C1795Pt1.b(objO);
        }
        if (((Boolean) objO).booleanValue()) {
            abstractC7949z25.k(c3279d23);
        } else {
            c3279d22 = c3279d24;
            abstractC7949z24 = abstractC7949z25;
            if (c3279d22 != null) {
                abstractC7949z24.k(c3279d22);
            }
        }
        return Unit.a;
        C3279d22 c3279d25 = (C3279d22) objO;
        if (c3279d25 == null || (str = c3279d25.c) == null) {
            InterfaceC6396rf0<String> interfaceC6396rf0K = abstractC7949z22.g.k();
            d22.d = abstractC7949z22;
            d22.e = list;
            d22.j = 2;
            objO = C4466ii.o(interfaceC6396rf0K, d22);
            if (objO != mn) {
                List list5 = list;
                abstractC7949z23 = abstractC7949z22;
                list2 = list5;
                String str4 = (String) objO;
                list3 = list2;
                str2 = str4;
                C1699On1 c1699On2 = abstractC7949z23.n;
                d22.d = abstractC7949z23;
                d22.e = list3;
                d22.g = str2;
                d22.j = 3;
                objQ = C4466ii.q(c1699On2, d22);
                if (objQ != mn) {
                    abstractC7949z24 = abstractC7949z23;
                    list4 = list3;
                    objO = objQ;
                    c3279d22 = (C3279d22) objO;
                    if (str2 != null) {
                        it = list4.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.a(((C3279d22) next).c, str2));
                        c3279d23 = (C3279d22) next;
                        if (c3279d23 != null) {
                            d22.d = abstractC7949z24;
                            d22.e = c3279d22;
                            d22.g = c3279d23;
                            d22.j = 4;
                            objC = abstractC7949z24.c(c3279d23, null, d22);
                            if (objC != mn) {
                                objO = objC;
                                c3279d24 = c3279d22;
                                abstractC7949z25 = abstractC7949z24;
                                if (((Boolean) objO).booleanValue()) {
                                    abstractC7949z25.k(c3279d23);
                                } else {
                                    c3279d22 = c3279d24;
                                    abstractC7949z24 = abstractC7949z25;
                                    if (c3279d22 != null) {
                                        abstractC7949z24.k(c3279d22);
                                    }
                                }
                            }
                        } else if (c3279d22 != null) {
                            abstractC7949z24.k(c3279d22);
                        }
                    } else if (c3279d22 != null) {
                        abstractC7949z24.k(c3279d22);
                    }
                    return Unit.a;
                }
            }
        } else {
            List list6 = list;
            abstractC7949z23 = abstractC7949z22;
            str2 = str;
            list3 = list6;
            C1699On1 c1699On3 = abstractC7949z23.n;
            d22.d = abstractC7949z23;
            d22.e = list3;
            d22.g = str2;
            d22.j = 3;
            objQ = C4466ii.q(c1699On3, d22);
            if (objQ != mn) {
                abstractC7949z24 = abstractC7949z23;
                list4 = list3;
                objO = objQ;
                c3279d22 = (C3279d22) objO;
                if (str2 != null) {
                    it = list4.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.a(((C3279d22) next).c, str2));
                    c3279d23 = (C3279d22) next;
                    if (c3279d23 != null) {
                        d22.d = abstractC7949z24;
                        d22.e = c3279d22;
                        d22.g = c3279d23;
                        d22.j = 4;
                        objC = abstractC7949z24.c(c3279d23, null, d22);
                        if (objC != mn) {
                            objO = objC;
                            c3279d24 = c3279d22;
                            abstractC7949z25 = abstractC7949z24;
                            if (((Boolean) objO).booleanValue()) {
                                abstractC7949z25.k(c3279d23);
                            } else {
                                c3279d22 = c3279d24;
                                abstractC7949z24 = abstractC7949z25;
                                if (c3279d22 != null) {
                                    abstractC7949z24.k(c3279d22);
                                }
                            }
                        }
                    } else if (c3279d22 != null) {
                        abstractC7949z24.k(c3279d22);
                    }
                } else if (c3279d22 != null) {
                    abstractC7949z24.k(c3279d22);
                }
                return Unit.a;
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0 A[PHI: r2 r10 r11
      0x00c0: PHI (r2v8 z22) = (r2v7 z22), (r2v15 z22) binds: [B:36:0x00bd, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r10v5 Lx0) = (r10v4 Lx0), (r10v19 Lx0) binds: [B:36:0x00bd, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r11v13 java.lang.Object) = (r11v12 java.lang.Object), (r11v1 java.lang.Object) binds: [B:36:0x00bd, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6 A[PHI: r2 r10 r11
      0x00e6: PHI (r2v9 z22) = (r2v8 z22), (r2v16 z22) binds: [B:43:0x00e3, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x00e6: PHI (r10v9 d22) = (r10v7 d22), (r10v21 d22) binds: [B:43:0x00e3, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x00e6: PHI (r11v18 java.lang.Object) = (r11v17 java.lang.Object), (r11v1 java.lang.Object) binds: [B:43:0x00e3, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(AbstractC7949z22 abstractC7949z22, LM lm) {
        E22 e22;
        C3279d22 c3279d22;
        Object objO;
        AbstractC7949z22 abstractC7949z23;
        C1491Lx0 c1491Lx0;
        C3279d22 c3279d22G;
        C6120qK1 c6120qK1;
        Unit unit;
        AbstractC7949z22 abstractC7949z24;
        abstractC7949z22.getClass();
        if (lm instanceof E22) {
            e22 = (E22) lm;
            int i = e22.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                e22.i = i - Integer.MIN_VALUE;
            } else {
                e22 = new E22(abstractC7949z22, lm);
            }
        } else {
            e22 = new E22(abstractC7949z22, lm);
        }
        Object objC = e22.g;
        MN mn = MN.d;
        int i2 = e22.i;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            c3279d22 = (C3279d22) abstractC7949z22.m.d.getValue();
            if (c3279d22 == null) {
                return Unit.a;
            }
            InterfaceC6396rf0<C1491Lx0> interfaceC6396rf0 = abstractC7949z22.d.b;
            e22.d = abstractC7949z22;
            e22.e = c3279d22;
            e22.i = 1;
            objO = C4466ii.o(interfaceC6396rf0, e22);
            if (objO != mn) {
            }
            return mn;
        }
        if (i2 == 1) {
            C3279d22 c3279d23 = (C3279d22) e22.e;
            AbstractC7949z22 abstractC7949z25 = e22.d;
            C1795Pt1.b(objC);
            c3279d22 = c3279d23;
            abstractC7949z22 = abstractC7949z25;
            objO = objC;
        } else {
            if (i2 == 2) {
                c1491Lx0 = (C1491Lx0) e22.e;
                abstractC7949z23 = e22.d;
                C1795Pt1.b(objC);
                if (!((Boolean) objC).booleanValue()) {
                    AbstractC7004uZ1 abstractC7004uZ1 = abstractC7949z23.b;
                    e22.d = abstractC7949z23;
                    e22.e = c1491Lx0;
                    e22.i = 3;
                    objC = abstractC7004uZ1.a(e22);
                    if (objC != mn) {
                        c3279d22G = abstractC7949z23.g((List) abstractC7949z23.i.getValue(), (C1709Or) objC, c1491Lx0.b);
                        if (c3279d22G == null) {
                            return Unit.a;
                        }
                        InterfaceC6396rf0<C3279d22> interfaceC6396rf1 = abstractC7949z23.c.g;
                        e22.d = abstractC7949z23;
                        e22.e = c3279d22G;
                        e22.i = 4;
                        objC = C4466ii.o(interfaceC6396rf1, e22);
                        if (objC != mn) {
                            if (!Intrinsics.a(objC, c3279d22G)) {
                                c6120qK1 = abstractC7949z23.k;
                                unit = Unit.a;
                                e22.d = abstractC7949z23;
                                e22.e = c3279d22G;
                                e22.i = 5;
                                if (c6120qK1.a(unit, e22) != mn) {
                                    abstractC7949z24 = abstractC7949z23;
                                }
                            }
                            abstractC7949z23.c.a.setValue(c3279d22G);
                            C5189lv.k(C3784fT.a, C6266r20.c, new F22(abstractC7949z23, c3279d22G, null), 2);
                        }
                    }
                    return mn;
                }
                return Unit.a;
            }
            if (i2 == 3) {
                c1491Lx0 = (C1491Lx0) e22.e;
                abstractC7949z23 = e22.d;
                C1795Pt1.b(objC);
                c3279d22G = abstractC7949z23.g((List) abstractC7949z23.i.getValue(), (C1709Or) objC, c1491Lx0.b);
                if (c3279d22G == null) {
                    return Unit.a;
                }
                InterfaceC6396rf0<C3279d22> interfaceC6396rf2 = abstractC7949z23.c.g;
                e22.d = abstractC7949z23;
                e22.e = c3279d22G;
                e22.i = 4;
                objC = C4466ii.o(interfaceC6396rf2, e22);
                if (objC != mn) {
                    if (!Intrinsics.a(objC, c3279d22G)) {
                        c6120qK1 = abstractC7949z23.k;
                        unit = Unit.a;
                        e22.d = abstractC7949z23;
                        e22.e = c3279d22G;
                        e22.i = 5;
                        if (c6120qK1.a(unit, e22) != mn) {
                            abstractC7949z24 = abstractC7949z23;
                        }
                    }
                    abstractC7949z23.c.a.setValue(c3279d22G);
                    C5189lv.k(C3784fT.a, C6266r20.c, new F22(abstractC7949z23, c3279d22G, null), 2);
                    return Unit.a;
                }
                return mn;
            }
            if (i2 == 4) {
                c3279d22G = (C3279d22) e22.e;
                abstractC7949z23 = e22.d;
                C1795Pt1.b(objC);
                if (!Intrinsics.a(objC, c3279d22G)) {
                    c6120qK1 = abstractC7949z23.k;
                    unit = Unit.a;
                    e22.d = abstractC7949z23;
                    e22.e = c3279d22G;
                    e22.i = 5;
                    if (c6120qK1.a(unit, e22) != mn) {
                        abstractC7949z24 = abstractC7949z23;
                    }
                    return mn;
                }
                abstractC7949z23.c.a.setValue(c3279d22G);
                C5189lv.k(C3784fT.a, C6266r20.c, new F22(abstractC7949z23, c3279d22G, null), 2);
                return Unit.a;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3279d22G = (C3279d22) e22.e;
            abstractC7949z24 = e22.d;
            C1795Pt1.b(objC);
        }
        abstractC7949z23 = abstractC7949z24;
        abstractC7949z23.c.a.setValue(c3279d22G);
        C5189lv.k(C3784fT.a, C6266r20.c, new F22(abstractC7949z23, c3279d22G, null), 2);
        return Unit.a;
        C1491Lx0 c1491Lx1 = (C1491Lx0) objO;
        e22.d = abstractC7949z22;
        e22.e = c1491Lx1;
        e22.i = 2;
        objC = abstractC7949z22.c(c3279d22, null, e22);
        if (objC != mn) {
            abstractC7949z23 = abstractC7949z22;
            c1491Lx0 = c1491Lx1;
            if (!((Boolean) objC).booleanValue()) {
                AbstractC7004uZ1 abstractC7004uZ2 = abstractC7949z23.b;
                e22.d = abstractC7949z23;
                e22.e = c1491Lx0;
                e22.i = 3;
                objC = abstractC7004uZ2.a(e22);
                if (objC != mn) {
                    c3279d22G = abstractC7949z23.g((List) abstractC7949z23.i.getValue(), (C1709Or) objC, c1491Lx0.b);
                    if (c3279d22G == null) {
                        return Unit.a;
                    }
                    InterfaceC6396rf0<C3279d22> interfaceC6396rf3 = abstractC7949z23.c.g;
                    e22.d = abstractC7949z23;
                    e22.e = c3279d22G;
                    e22.i = 4;
                    objC = C4466ii.o(interfaceC6396rf3, e22);
                    if (objC != mn) {
                        if (!Intrinsics.a(objC, c3279d22G)) {
                            c6120qK1 = abstractC7949z23.k;
                            unit = Unit.a;
                            e22.d = abstractC7949z23;
                            e22.e = c3279d22G;
                            e22.i = 5;
                            if (c6120qK1.a(unit, e22) != mn) {
                                abstractC7949z24 = abstractC7949z23;
                                abstractC7949z23 = abstractC7949z24;
                            }
                        }
                        abstractC7949z23.c.a.setValue(c3279d22G);
                        C5189lv.k(C3784fT.a, C6266r20.c, new F22(abstractC7949z23, c3279d22G, null), 2);
                    }
                }
            }
            return Unit.a;
        }
        return mn;
    }

    @Nullable
    public abstract Object c(@NotNull C3279d22 c3279d22, @Nullable C1709Or c1709Or, @NotNull LM lm);

    public final void d() {
        this.i.setValue(C5653o60.d);
        J22 j22 = this.c;
        j22.a.setValue(null);
        j22.c.setValue(null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f A[PHI: r2 r10 r11
      0x009f: PHI (r2v5 ??) = (r2v12 ??), (r2v13 ??), (r2v7 ??) binds: [B:28:0x009b, B:35:0x00c8, B:43:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r10v4 java.util.List) = (r10v1 java.util.List), (r10v2 java.util.List), (r10v7 java.util.List) binds: [B:28:0x009b, B:35:0x00c8, B:43:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r11v4 java.util.Iterator) = (r11v2 java.util.Iterator), (r11v3 java.util.Iterator), (r11v5 java.util.Iterator) binds: [B:28:0x009b, B:35:0x00c8, B:43:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2 A[PHI: r2 r5 r10 r11 r12
      0x00c2: PHI (r2v3 ??) = (r2v14 ??), (r2v10 ??) binds: [B:32:0x00bf, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r5v2 java.lang.Object) = (r5v8 java.lang.Object), (r5v11 java.lang.Object) binds: [B:32:0x00bf, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r10v2 java.util.List) = (r10v4 java.util.List), (r10v12 java.util.List) binds: [B:32:0x00bf, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r11v3 java.util.Iterator) = (r11v4 java.util.Iterator), (r11v9 java.util.Iterator) binds: [B:32:0x00bf, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r12v7 Or) = (r12v11 Or), (r12v15 Or) binds: [B:32:0x00bf, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3, types: [z22] */
    /* JADX WARN: Type inference failed for: r2v5, types: [z22] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c8 -> B:29:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00db -> B:40:0x00df). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.util.List r10, defpackage.C1709Or r11, defpackage.LM r12) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7949z22.e(java.util.List, Or, LM):java.lang.Object");
    }

    @NotNull
    public abstract String f(@NotNull I10 i10);

    public final C3279d22 g(List<C3279d22> list, C1709Or c1709Or, String str) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            C3279d22 c3279d22 = (C3279d22) obj2;
            if (Intrinsics.a(str, "close_price") || c3279d22.w) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int i = i((C3279d22) next, c1709Or);
                do {
                    Object next2 = it.next();
                    int i2 = i((C3279d22) next2, c1709Or);
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        C3279d22 c3279d23 = (C3279d22) obj;
        return c3279d23 == null ? (C3279d22) CollectionsKt.firstOrNull(list) : c3279d23;
    }

    @NotNull
    public abstract String h(@NotNull C6942uF c6942uF);

    public abstract int i(@NotNull C3279d22 c3279d22, @NotNull C1709Or c1709Or);

    public final void j() {
        C2936bP1 c2936bP1 = this.h;
        if (c2936bP1 == null || !c2936bP1.g()) {
            EM em = C3286d41.a;
            RV rv = C6266r20.a;
            this.h = C5189lv.k(em, rv, new a(null), 2);
            C5189lv.k(C7235vf.a, rv, new b(null), 2);
        }
    }

    public final void k(@NotNull C3279d22 tradingAsset) {
        Intrinsics.checkNotNullParameter(tradingAsset, "tradingAsset");
        C3279d22 c3279d22 = (C3279d22) this.m.d.getValue();
        if (c3279d22 != null) {
            c3279d22.v = false;
        }
        tradingAsset.v = true;
        this.c.a.setValue(tradingAsset);
        C5189lv.k(C3784fT.a, C6266r20.c, new c(tradingAsset, null), 2);
    }

    public final C3279d22 l(C6942uF c6942uF) {
        double d = 0;
        return new C3279d22(c6942uF.a, null, c6942uF.c, c6942uF.i, c6942uF.n, c6942uF.j, c6942uF.o, h(c6942uF), R.drawable.ic_trading_asset_not_loaded_icon, d, d, c6942uF.d, 0, 0, c6942uF.l, c6942uF.r, c6942uF.s, c6942uF.t, c6942uF.k, 6291456);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba A[PHI: r2 r5 r6
      0x00ba: PHI (r2v5 Or) = (r2v4 Or), (r2v6 Or) binds: [B:38:0x00bc, B:35:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r5v4 java.util.List) = (r5v1 java.util.List), (r5v5 java.util.List) binds: [B:38:0x00bc, B:35:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r6v4 ??) = (r6v10 ??), (r6v11 ??) binds: [B:38:0x00bc, B:35:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        if (r11 == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v4, types: [z22] */
    /* JADX WARN: Type inference failed for: r10v7, types: [z22] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [z22] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [z22] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.util.List r10, defpackage.LM r11) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7949z22.m(java.util.List, LM):java.lang.Object");
    }
}

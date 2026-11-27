package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class DA implements CA {

    @NotNull
    public final InterfaceC7768yA a;

    @NotNull
    public final InterfaceC2636a22 b;

    @NotNull
    public final KQ c;

    @NotNull
    public final GP1 d;

    @NotNull
    public final C1699On1 e;

    @NotNull
    public final C1699On1 f;

    @NotNull
    public final C1699On1 g;

    @InterfaceC3368dU(c = "com.base.feature.graphic.providers.ChartBetProviderBase", f = "ChartBetProviderBase.kt", l = {77}, m = "addBet")
    public static final class a extends LM {
        public DA d;
        public JQ e;
        public JQ g;
        public /* synthetic */ Object h;
        public int j;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return DA.this.a(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.graphic.providers.ChartBetProviderBase$lastBet$1", f = "ChartBetProviderBase.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements InterfaceC1060Gj0<String, List<? extends JQ>, JM<? super JQ>, Object> {
        public /* synthetic */ List d;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return CollectionsKt.N(this.d);
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(String str, List<? extends JQ> list, JM<? super JQ> jm) {
            b bVar = new b(3, jm);
            bVar.d = list;
            return bVar.invokeSuspend(Unit.a);
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.graphic.providers.ChartBetProviderBase$realBetDuration$2", f = "ChartBetProviderBase.kt", l = {}, m = "invokeSuspend")
    public static final class c extends AW1 implements InterfaceC1138Hj0<kotlin.time.b, JQ, Boolean, JM<? super kotlin.time.b>, Object> {
        public /* synthetic */ long d;
        public /* synthetic */ JQ e;
        public /* synthetic */ boolean g;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            long j = this.d;
            JQ jq = this.e;
            if (this.g && jq != null) {
                kotlin.time.b bVar = new kotlin.time.b(jq.l);
                kotlin.time.b minimumValue = new kotlin.time.b(j);
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
                if (bVar.compareTo(minimumValue) < 0) {
                    bVar = minimumValue;
                }
                j = bVar.d;
            }
            return new kotlin.time.b(j);
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(kotlin.time.b bVar, JQ jq, Boolean bool, JM<? super kotlin.time.b> jm) {
            long j = bVar.d;
            boolean zBooleanValue = bool.booleanValue();
            c cVar = new c(4, jm);
            cVar.d = j;
            cVar.e = jq;
            cVar.g = zBooleanValue;
            return cVar.invokeSuspend(Unit.a);
        }
    }

    public static final class d implements InterfaceC6396rf0<kotlin.time.b> {
        public final /* synthetic */ C1699On1 d;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: DA$d$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.graphic.providers.ChartBetProviderBase$special$$inlined$filter$1$2", f = "ChartBetProviderBase.kt", l = {219}, m = "emit")
            public static final class C0015a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0015a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0015a c0015a;
                if (jm instanceof C0015a) {
                    c0015a = (C0015a) jm;
                    int i = c0015a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0015a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0015a = new C0015a(jm);
                    }
                } else {
                    c0015a = new C0015a(jm);
                }
                Object obj2 = c0015a.d;
                MN mn = MN.d;
                int i2 = c0015a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    if (((kotlin.time.b) obj).d > 0) {
                        c0015a.e = 1;
                        if (this.d.a(obj, c0015a) == mn) {
                            return mn;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj2);
                }
                return Unit.a;
            }
        }

        public d(C1699On1 c1699On1) {
            this.d = c1699On1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super kotlin.time.b> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public DA(@NotNull S02<?> trader, @NotNull InterfaceC7768yA chartAssetProvider, @NotNull InterfaceC2636a22 traderInfoProviders, @NotNull KQ currentChartPositionProvider, @NotNull AbstractC1787Pr betDurationUseCase) {
        Intrinsics.checkNotNullParameter(trader, "trader");
        Intrinsics.checkNotNullParameter(chartAssetProvider, "chartAssetProvider");
        Intrinsics.checkNotNullParameter(traderInfoProviders, "traderInfoProviders");
        Intrinsics.checkNotNullParameter(currentChartPositionProvider, "currentChartPositionProvider");
        Intrinsics.checkNotNullParameter(betDurationUseCase, "betDurationUseCase");
        this.a = chartAssetProvider;
        this.b = traderInfoProviders;
        this.c = currentChartPositionProvider;
        GP1 gp1I = C1589Ne.i(C5653o60.d);
        this.d = gp1I;
        C4466ii.f(gp1I);
        C6610sg0 c6610sg0 = new C6610sg0(chartAssetProvider.a(), gp1I, new b(3, null));
        EM em = C3784fT.a;
        LL ll = IK1.a.a;
        C1699On1 c1699On1E = C4466ii.E(c6610sg0, em, ll, null);
        this.e = c1699On1E;
        AbstractC1787Pr.a aVar = betDurationUseCase.b;
        kotlin.time.b.e.getClass();
        C1699On1 c1699On1E2 = C4466ii.E(aVar, em, ll, new kotlin.time.b(0L));
        this.f = c1699On1E2;
        this.g = C4466ii.E(C4466ii.k(new d(c1699On1E2), c1699On1E, trader.y, new c(4, null)), em, ll, new kotlin.time.b(0L));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.CA
    @Nullable
    public final Object a(@NotNull JQ jq, @NotNull JM<? super Unit> jm) {
        a aVar;
        DA da;
        JQ jq2;
        Object value;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.j = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object objO = aVar.h;
        MN mn = MN.d;
        int i2 = aVar.j;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            AbstractC7978zA.b bVarA = this.a.a();
            aVar.d = this;
            aVar.e = jq;
            aVar.g = jq;
            aVar.j = 1;
            objO = C4466ii.o(bVarA, aVar);
            if (objO == mn) {
                return mn;
            }
            da = this;
            jq2 = jq;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jq = aVar.g;
            jq2 = aVar.e;
            da = aVar.d;
            C1795Pt1.b(objO);
        }
        String str = (String) objO;
        jq.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        jq.j = str;
        GP1 gp1 = da.d;
        do {
            value = gp1.getValue();
        } while (!gp1.d(value, CollectionsKt.R((List) value, jq2)));
        return Unit.a;
    }

    @Override // defpackage.CA
    @Nullable
    public final JQ b() {
        InterfaceC2636a22 interfaceC2636a22 = this.b;
        if (!((Boolean) interfaceC2636a22.b().d.getValue()).booleanValue() || ((Boolean) interfaceC2636a22.a().d.getValue()).booleanValue()) {
            return null;
        }
        C1699On1 c1699On1 = this.e;
        JQ jq = (JQ) c1699On1.d.getValue();
        if ((jq != null ? jq.b : 0L) > this.c.b().getValue().longValue()) {
            return (JQ) c1699On1.d.getValue();
        }
        return null;
    }

    @Override // defpackage.CA
    public final void c() {
        this.d.setValue(C5653o60.d);
    }

    @Override // defpackage.CA
    @NotNull
    public final FP1<kotlin.time.b> d() {
        return this.f;
    }

    @Override // defpackage.CA
    @NotNull
    public final C1699On1 e() {
        return this.g;
    }
}

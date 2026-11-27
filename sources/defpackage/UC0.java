package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class UC0 implements TC0 {

    @Nullable
    public PQ a;

    @NotNull
    public final InterfaceC6396rf0<PQ> b;

    public static final class a implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ InterfaceC6396rf0 d;
        public final /* synthetic */ C7061uo0 e;

        /* JADX INFO: renamed from: UC0$a$a, reason: collision with other inner class name */
        public static final class C0152a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ C7061uo0 e;

            /* JADX INFO: renamed from: UC0$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.providers.InvestmentStateProviderBase$special$$inlined$map$1$2", f = "InvestmentStateProviderBase.kt", l = {219}, m = "emit")
            public static final class C0153a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0153a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0152a.this.a(null, this);
                }
            }

            public C0152a(InterfaceC6606sf0 interfaceC6606sf0, C7061uo0 c7061uo0) {
                this.d = interfaceC6606sf0;
                this.e = c7061uo0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0153a c0153a;
                if (jm instanceof C0153a) {
                    c0153a = (C0153a) jm;
                    int i = c0153a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0153a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0153a = new C0153a(jm);
                    }
                } else {
                    c0153a = new C0153a(jm);
                }
                Object obj2 = c0153a.d;
                MN mn = MN.d;
                int i2 = c0153a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(!((Boolean) obj).booleanValue() && this.e.n());
                    c0153a.e = 1;
                    if (this.d.a(boolValueOf, c0153a) == mn) {
                        return mn;
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

        public a(InterfaceC6396rf0 interfaceC6396rf0, C7061uo0 c7061uo0) {
            this.d = interfaceC6396rf0;
            this.e = c7061uo0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0152a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public /* synthetic */ class b extends C7 implements InterfaceC1294Jj0<Boolean, Boolean, K32, AbstractC7721xy, Boolean, JM<? super PQ>, Object> {
        @Override // defpackage.InterfaceC1294Jj0
        public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
            PQ pq;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            K32 k32 = (K32) obj3;
            AbstractC7721xy abstractC7721xy = (AbstractC7721xy) obj4;
            boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
            UC0 uc0 = (UC0) this.d;
            uc0.getClass();
            if (!zBooleanValue) {
                pq = PQ.NOT_VISIBLE;
            } else if (zBooleanValue2 || k32.d) {
                pq = PQ.SEARCHING_FOR_SIGNALS;
            } else {
                pq = Intrinsics.a(abstractC7721xy, AbstractC7721xy.a.a) ? PQ.TRADING_WITHOUT_CHART : PQ.TRADING;
            }
            pq.e = zBooleanValue3;
            pq.d = uc0.a == PQ.NOT_VISIBLE;
            uc0.a = pq;
            return pq;
        }
    }

    public UC0(@NotNull C4617jA1 robotTrading, @NotNull QC0 investmentProgressDataProviderBaseApi, @NotNull InterfaceC3360dR0 loadChartHistoryUseCase, @NotNull C6348rR customIndicatorsExperimentProvider, @NotNull C7061uo0 hideChartLocalExperiment) {
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        Intrinsics.checkNotNullParameter(investmentProgressDataProviderBaseApi, "investmentProgressDataProviderBaseApi");
        Intrinsics.checkNotNullParameter(loadChartHistoryUseCase, "loadChartHistoryUseCase");
        Intrinsics.checkNotNullParameter(customIndicatorsExperimentProvider, "customIndicatorsExperimentProvider");
        Intrinsics.checkNotNullParameter(hideChartLocalExperiment, "hideChartLocalExperiment");
        a aVar = new a(customIndicatorsExperimentProvider.c, hideChartLocalExperiment);
        C1699On1 c1699On1 = robotTrading.B;
        C1699On1 c1699On1A = investmentProgressDataProviderBaseApi.a();
        C1699On1 c1699On1B = loadChartHistoryUseCase.b();
        this.b = C4466ii.m(new C6400rg0(0, new InterfaceC6396rf0[]{c1699On1, robotTrading.J, c1699On1A, c1699On1B, aVar}, new b(6, this, UC0.class, "getNewState", "getNewState(ZZLcom/api/feature/robot/robot/investment/models/TradingProgress;Lcom/api/feature/graphic/models/CandlesHistory;Z)Lcom/api/feature/robot/robot/investment/models/CurrentInvestmentState;", 4)));
    }

    @Override // defpackage.TC0
    @NotNull
    public final InterfaceC6396rf0<PQ> getState() {
        return this.b;
    }
}

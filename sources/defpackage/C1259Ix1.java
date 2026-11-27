package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ix1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1259Ix1 extends C7576xG {

    @NotNull
    public final C5561ng0 A;

    @NotNull
    public final C5561ng0 B;

    @NotNull
    public final C1699On1 C;

    @NotNull
    public final C5561ng0 D;

    @NotNull
    public final InterfaceC6396rf0<C7606xQ> E;

    @NotNull
    public final InterfaceC6396rf0<J32> F;

    @NotNull
    public final C5561ng0 G;

    @NotNull
    public final C5561ng0 H;

    @NotNull
    public final C1699On1 I;

    @NotNull
    public final InterfaceC3902g10 d;

    @NotNull
    public final InterfaceC4099gx1 e;

    @NotNull
    public final C4617jA1 f;

    @NotNull
    public final C4923kf g;

    @NotNull
    public final C1804Pw1 h;

    @NotNull
    public final ReporterApi i;

    @NotNull
    public final InterfaceC4409iR0 j;

    @NotNull
    public final U82 k;

    @NotNull
    public final C4777jx1 l;

    @NotNull
    public final KQ m;

    @NotNull
    public final CA n;

    @NotNull
    public final InterfaceC5828ox o;

    @NotNull
    public final AbstractC5045lD0 p;

    @NotNull
    public final AbstractC6925u91 q;

    @NotNull
    public final InterfaceC3706f42 r;

    @NotNull
    public final FP1<kotlin.time.b> s;

    @NotNull
    public final FP1<kotlin.time.b> t;

    @NotNull
    public final C1699On1 u;

    @NotNull
    public final GP1 v;

    @NotNull
    public final InterfaceC6396rf0<Boolean> w;

    @NotNull
    public final C5561ng0 x;

    @NotNull
    public final FP1<K32> y;

    @NotNull
    public final C5561ng0 z;

    /* JADX INFO: renamed from: Ix1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$_currentStrategy$1", f = "RobotInvestmentViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<EnumC2644a42, List<? extends C3496e42>, JM<? super C3496e42>, Object> {
        public /* synthetic */ EnumC2644a42 d;
        public /* synthetic */ List e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            EnumC2644a42 enumC2644a42 = this.d;
            for (Object obj2 : this.e) {
                if (((C3496e42) obj2).a == enumC2644a42) {
                    return obj2;
                }
            }
            return null;
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(EnumC2644a42 enumC2644a42, List<? extends C3496e42> list, JM<? super C3496e42> jm) {
            a aVar = new a(3, jm);
            aVar.d = enumC2644a42;
            aVar.e = list;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: Ix1$b */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$shouldRecreateChart$2", f = "RobotInvestmentViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements InterfaceC1060Gj0<Boolean, Boolean, JM<? super Boolean>, Object> {
        public /* synthetic */ boolean d;
        public /* synthetic */ boolean e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(this.d && this.e);
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Boolean bool, Boolean bool2, JM<? super Boolean> jm) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            b bVar = new b(3, jm);
            bVar.d = zBooleanValue;
            bVar.e = zBooleanValue2;
            return bVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: Ix1$c */
    public static final class c implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: Ix1$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Ix1$c$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$special$$inlined$filter$1$2", f = "RobotInvestmentViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0052a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0052a(JM jm) {
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
                C0052a c0052a;
                if (jm instanceof C0052a) {
                    c0052a = (C0052a) jm;
                    int i = c0052a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0052a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0052a = new C0052a(jm);
                    }
                } else {
                    c0052a = new C0052a(jm);
                }
                Object obj2 = c0052a.d;
                MN mn = MN.d;
                int i2 = c0052a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    if (((Boolean) obj).booleanValue()) {
                        c0052a.e = 1;
                        if (this.d.a(obj, c0052a) == mn) {
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

        public c(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    /* JADX INFO: renamed from: Ix1$d */
    public static final class d implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: Ix1$d$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Ix1$d$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$special$$inlined$map$1$2", f = "RobotInvestmentViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0053a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0053a(JM jm) {
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
                C0053a c0053a;
                if (jm instanceof C0053a) {
                    c0053a = (C0053a) jm;
                    int i = c0053a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0053a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0053a = new C0053a(jm);
                    }
                } else {
                    c0053a = new C0053a(jm);
                }
                Object obj2 = c0053a.d;
                MN mn = MN.d;
                int i2 = c0053a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    c0053a.e = 1;
                    if (this.d.a(boolValueOf, c0053a) == mn) {
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

        public d(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX INFO: renamed from: Ix1$e */
    public static final class e implements InterfaceC6396rf0<Integer> {
        public final /* synthetic */ C6610sg0 d;

        /* JADX INFO: renamed from: Ix1$e$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Ix1$e$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$special$$inlined$map$2$2", f = "RobotInvestmentViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0054a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0054a(JM jm) {
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
                C0054a c0054a;
                Integer num;
                if (jm instanceof C0054a) {
                    c0054a = (C0054a) jm;
                    int i = c0054a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0054a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0054a = new C0054a(jm);
                    }
                } else {
                    c0054a = new C0054a(jm);
                }
                Object obj2 = c0054a.d;
                MN mn = MN.d;
                int i2 = c0054a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C3496e42 c3496e42 = (C3496e42) obj;
                    if (c3496e42 == null || (num = c3496e42.p) == null) {
                        num = c3496e42 != null ? new Integer(c3496e42.b) : null;
                    }
                    c0054a.e = 1;
                    if (this.d.a(num, c0054a) == mn) {
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

        public e(C6610sg0 c6610sg0) {
            this.d = c6610sg0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Integer> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C1259Ix1(@NotNull InterfaceC3902g10 dialogsProvider, @NotNull InterfaceC4099gx1 callbacks, @NotNull C4617jA1 robotTrading, @NotNull C4923kf appData, @NotNull C1804Pw1 tutorialManager, @NotNull ReporterApi reporter, @NotNull InterfaceC4409iR0 loadChartUseCase, @NotNull U82 unlockIndicatorsBottomSheetDataProvider, @NotNull C4777jx1 robotInvestmentImagesProvider, @NotNull C6348rR customIndicatorsExperimentProvider, @NotNull NQ currentIndicatorProvider, @NotNull InterfaceC4878kR1 strategiesProvider, @NotNull KQ currentChartPositionProvider, @NotNull CA chartBetProvider, @NotNull InterfaceC3360dR0 loadChartHistoryUseCase, @NotNull InterfaceC5828ox cachedCandlesProvider, @NotNull QC0 investmentProgressDataProviderBaseApi, @NotNull TC0 currentInvestmentStateProviderApi, @NotNull VC0 tradingLimitsProviderApi, @NotNull KC0 directionProviderApi, @NotNull IC0 investmentAssetProviderApi, @NotNull MC0 investmentProfitProviderApi, @NotNull FC0 investmentAmountProviderApi, @NotNull BC0 investmentAccountModelProviderApi, @NotNull AbstractC5045lD0 isShowValueUseCase, @NotNull MR1 strategySelectionUseCase, @NotNull AbstractC6925u91 oneClickStopRobotUseCase, @NotNull InterfaceC3706f42 telemetryReporter) {
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(tutorialManager, "tutorialManager");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(loadChartUseCase, "loadChartUseCase");
        Intrinsics.checkNotNullParameter(unlockIndicatorsBottomSheetDataProvider, "unlockIndicatorsBottomSheetDataProvider");
        Intrinsics.checkNotNullParameter(robotInvestmentImagesProvider, "robotInvestmentImagesProvider");
        Intrinsics.checkNotNullParameter(customIndicatorsExperimentProvider, "customIndicatorsExperimentProvider");
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(strategiesProvider, "strategiesProvider");
        Intrinsics.checkNotNullParameter(currentChartPositionProvider, "currentChartPositionProvider");
        Intrinsics.checkNotNullParameter(chartBetProvider, "chartBetProvider");
        Intrinsics.checkNotNullParameter(loadChartHistoryUseCase, "loadChartHistoryUseCase");
        Intrinsics.checkNotNullParameter(cachedCandlesProvider, "cachedCandlesProvider");
        Intrinsics.checkNotNullParameter(investmentProgressDataProviderBaseApi, "investmentProgressDataProviderBaseApi");
        Intrinsics.checkNotNullParameter(currentInvestmentStateProviderApi, "currentInvestmentStateProviderApi");
        Intrinsics.checkNotNullParameter(tradingLimitsProviderApi, "tradingLimitsProviderApi");
        Intrinsics.checkNotNullParameter(directionProviderApi, "directionProviderApi");
        Intrinsics.checkNotNullParameter(investmentAssetProviderApi, "investmentAssetProviderApi");
        Intrinsics.checkNotNullParameter(investmentProfitProviderApi, "investmentProfitProviderApi");
        Intrinsics.checkNotNullParameter(investmentAmountProviderApi, "investmentAmountProviderApi");
        Intrinsics.checkNotNullParameter(investmentAccountModelProviderApi, "investmentAccountModelProviderApi");
        Intrinsics.checkNotNullParameter(isShowValueUseCase, "isShowValueUseCase");
        Intrinsics.checkNotNullParameter(strategySelectionUseCase, "strategySelectionUseCase");
        Intrinsics.checkNotNullParameter(oneClickStopRobotUseCase, "oneClickStopRobotUseCase");
        Intrinsics.checkNotNullParameter(telemetryReporter, "telemetryReporter");
        this.d = dialogsProvider;
        this.e = callbacks;
        this.f = robotTrading;
        this.g = appData;
        this.h = tutorialManager;
        this.i = reporter;
        this.j = loadChartUseCase;
        this.k = unlockIndicatorsBottomSheetDataProvider;
        this.l = robotInvestmentImagesProvider;
        this.m = currentChartPositionProvider;
        this.n = chartBetProvider;
        this.o = cachedCandlesProvider;
        this.p = isShowValueUseCase;
        this.q = oneClickStopRobotUseCase;
        this.r = telemetryReporter;
        this.s = chartBetProvider.d();
        this.t = chartBetProvider.e();
        InterfaceC6396rf0 interfaceC6396rf0A = tutorialManager.a(loadChartHistoryUseCase.b(), tutorialManager.c.k);
        AbstractC7721xy.a aVar = AbstractC7721xy.a.a;
        LL ll = IK1.a.a;
        this.u = k(interfaceC6396rf0A, aVar, ll);
        GP1 gp1I = C1589Ne.i(Boolean.FALSE);
        this.v = gp1I;
        this.w = C4466ii.m(new C6610sg0(new c(gp1I), new d(customIndicatorsExperimentProvider.c), new b(3, null)));
        InterfaceC6396rf0<C3489e3> interfaceC6396rf0A2 = investmentAccountModelProviderApi.a();
        C1648Nw1 c1648Nw1 = tutorialManager.c;
        this.x = tutorialManager.b(interfaceC6396rf0A2, c1648Nw1.a);
        this.y = investmentProgressDataProviderBaseApi.a();
        this.z = tutorialManager.b(investmentAssetProviderApi.a(), c1648Nw1.c);
        this.A = tutorialManager.b(directionProviderApi.a(), c1648Nw1.d);
        this.B = tutorialManager.b(currentIndicatorProvider.b, c1648Nw1.e);
        this.C = C4466ii.E(tutorialManager.b(investmentAmountProviderApi.e(), c1648Nw1.f), C8056za.j(this), ll, new C7396wQ(0));
        this.D = tutorialManager.b(currentInvestmentStateProviderApi.getState(), c1648Nw1.b);
        this.E = C4466ii.m(tutorialManager.b(investmentProfitProviderApi.a(), c1648Nw1.g));
        this.F = C4466ii.m(tutorialManager.b(tradingLimitsProviderApi.a(), c1648Nw1.h));
        this.G = tutorialManager.b(tradingLimitsProviderApi.b(), c1648Nw1.j);
        this.H = tutorialManager.b(new C4250hg0(new e(new C6610sg0(strategySelectionUseCase.k(), strategiesProvider.b(), new a(3, null))), 0), c1648Nw1.i);
        this.I = C4466ii.f(appData.e);
    }

    @Override // defpackage.C7576xG
    public final void j() {
        this.j.a();
    }
}

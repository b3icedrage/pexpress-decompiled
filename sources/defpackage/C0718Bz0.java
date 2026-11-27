package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0718Bz0 extends C2907bG {

    @NotNull
    public final InterfaceC1962Rx0 h;

    @NotNull
    public final InterfaceC2460Xx0 i;

    @NotNull
    public final ReporterApi j;

    @NotNull
    public final U82 k;

    @NotNull
    public final C6256qz1 l;

    @NotNull
    public final XE1 m;

    @NotNull
    public final C5412my0 n;

    @NotNull
    public final InterfaceC3706f42 o;

    @Nullable
    public C1491Lx0 p;

    @NotNull
    public final GP1 q;

    @NotNull
    public final C1699On1 r;

    @NotNull
    public final InterfaceC6396rf0<List<C2846az0>> s;

    /* JADX INFO: renamed from: Bz0$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.shared.IndicatorsViewModelBase$onInit$1", f = "IndicatorsViewModelBase.kt", l = {68}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C0718Bz0.this.new a(jm);
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
                this.d = 1;
                C0718Bz0 c0718Bz0 = C0718Bz0.this;
                C1621Nn1 c1621Nn1B = c0718Bz0.m.b();
                Object objC = c1621Nn1B.d.c(new C1108Gz0(c0718Bz0), this);
                if (objC != mn) {
                    objC = Unit.a;
                }
                if (objC == mn) {
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

    /* JADX INFO: renamed from: Bz0$b */
    @InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.shared.IndicatorsViewModelBase$onShowDetailsClick$1", f = "IndicatorsViewModelBase.kt", l = {114}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C1491Lx0 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1491Lx0 c1491Lx0, JM<? super b> jm) {
            super(2, jm);
            this.g = c1491Lx0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C0718Bz0.this.new b(this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C0718Bz0 c0718Bz0 = C0718Bz0.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC2460Xx0 interfaceC2460Xx0 = c0718Bz0.i;
                this.d = 1;
                if (interfaceC2460Xx0.a(this.g, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            c0718Bz0.h.j();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0718Bz0(@NotNull InterfaceC1962Rx0 callbacks, @NotNull C3051bx1 indicatorListSaver, @NotNull AbstractC2199Uy0 indicatorUseCase, @NotNull InterfaceC2460Xx0 indicatorDetailsSelectionProvider, @NotNull ReporterApi reporter, @NotNull C3069c22 tradingAmplitudeEventsLocalExperiment, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull U82 unlockIndicatorsBottomSheetDataProvider, @NotNull C6256qz1 robotShowUnlockAllBottomSheetLocalExperiment, @NotNull XE1 selectIndicatorUseCaseApi, @NotNull C5412my0 indicatorManualConfigProvider, @NotNull InterfaceC3706f42 telemetryReporter) {
        super(callbacks, tradingAssetsProvider, indicatorUseCase);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(indicatorListSaver, "indicatorListSaver");
        Intrinsics.checkNotNullParameter(indicatorUseCase, "indicatorUseCase");
        Intrinsics.checkNotNullParameter(indicatorDetailsSelectionProvider, "indicatorDetailsSelectionProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(tradingAmplitudeEventsLocalExperiment, "tradingAmplitudeEventsLocalExperiment");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(unlockIndicatorsBottomSheetDataProvider, "unlockIndicatorsBottomSheetDataProvider");
        Intrinsics.checkNotNullParameter(robotShowUnlockAllBottomSheetLocalExperiment, "robotShowUnlockAllBottomSheetLocalExperiment");
        Intrinsics.checkNotNullParameter(selectIndicatorUseCaseApi, "selectIndicatorUseCaseApi");
        Intrinsics.checkNotNullParameter(indicatorManualConfigProvider, "indicatorManualConfigProvider");
        Intrinsics.checkNotNullParameter(telemetryReporter, "telemetryReporter");
        this.h = callbacks;
        this.i = indicatorDetailsSelectionProvider;
        this.j = reporter;
        this.k = unlockIndicatorsBottomSheetDataProvider;
        this.l = robotShowUnlockAllBottomSheetLocalExperiment;
        this.m = selectIndicatorUseCaseApi;
        this.n = indicatorManualConfigProvider;
        this.o = telemetryReporter;
        GP1 gp1I = C1589Ne.i(0);
        this.q = gp1I;
        this.r = C4466ii.f(gp1I);
        this.s = indicatorListSaver.f;
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }

    public final void o(@NotNull C1491Lx0 indicatorParam) {
        Intrinsics.checkNotNullParameter(indicatorParam, "item");
        this.j.j(EnumC5028l80.h0.b(), "{}", false);
        C5412my0 c5412my0 = this.n;
        c5412my0.getClass();
        Intrinsics.checkNotNullParameter(indicatorParam, "indicatorParam");
        c5412my0.b.setValue(indicatorParam.b);
        this.h.h();
    }

    public final void p(@NotNull C1491Lx0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        C5189lv.k(C8056za.j(this), null, new b(item, null), 3);
    }
}

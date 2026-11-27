package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5955pZ1 extends AbstractC7066uq {

    @NotNull
    public final InterfaceC4902kZ1 e;

    @NotNull
    public final AbstractC7004uZ1 f;

    @NotNull
    public final ReporterApi g;

    @NotNull
    public final AbstractC1787Pr h;

    @NotNull
    public final GP1 i;

    @NotNull
    public final C6610sg0 j;

    /* JADX INFO: renamed from: pZ1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.timeselection.screens.TimeSelectionViewModelBase$onInit$1", f = "TimeSelectionViewModelBase.kt", l = {42}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        public GP1 d;
        public int e;

        public a(JM<? super a> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C5955pZ1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            GP1 gp1;
            MN mn = MN.d;
            int i = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                C5955pZ1 c5955pZ1 = C5955pZ1.this;
                GP1 gp2 = c5955pZ1.i;
                this.d = gp2;
                this.e = 1;
                obj = c5955pZ1.f.b(this);
                if (obj == mn) {
                    return mn;
                }
                gp1 = gp2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gp1 = this.d;
                C1795Pt1.b(obj);
            }
            gp1.setValue(obj);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: pZ1$b */
    @InterfaceC3368dU(c = "com.base.feature.robot.timeselection.screens.TimeSelectionViewModelBase$selectionsList$1", f = "TimeSelectionViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements InterfaceC1060Gj0<Boolean, List<? extends C1709Or>, JM<? super C6584sZ1>, Object> {
        public /* synthetic */ boolean d;
        public /* synthetic */ List e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return new C6584sZ1(this.e, !this.d);
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Boolean bool, List<? extends C1709Or> list, JM<? super C6584sZ1> jm) {
            boolean zBooleanValue = bool.booleanValue();
            b bVar = new b(3, jm);
            bVar.d = zBooleanValue;
            bVar.e = list;
            return bVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5955pZ1(@NotNull InterfaceC4902kZ1 callbacks, @NotNull AbstractC7004uZ1 timeSelectionsProvider, @NotNull ReporterApi reporter, @NotNull C3069c22 tradingAmplitudeEventsLocalExperiment, @NotNull AbstractC1787Pr betDurationUseCase, @NotNull AbstractC4892kW0 manualAssetSelectionEnabledUseCase) {
        super(callbacks);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(tradingAmplitudeEventsLocalExperiment, "tradingAmplitudeEventsLocalExperiment");
        Intrinsics.checkNotNullParameter(betDurationUseCase, "betDurationUseCase");
        Intrinsics.checkNotNullParameter(manualAssetSelectionEnabledUseCase, "manualAssetSelectionEnabledUseCase");
        this.e = callbacks;
        this.f = timeSelectionsProvider;
        this.g = reporter;
        this.h = betDurationUseCase;
        GP1 gp1I = C1589Ne.i(C5653o60.d);
        this.i = gp1I;
        this.j = new C6610sg0(manualAssetSelectionEnabledUseCase.l(), gp1I, new b(3, null));
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C6561sS.g(this, new a(null));
    }
}

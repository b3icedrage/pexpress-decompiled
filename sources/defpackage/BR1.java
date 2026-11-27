package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class BR1 extends AbstractC7066uq {

    @NotNull
    public final InterfaceC7401wR1 e;

    @NotNull
    public final ReporterApi f;

    @NotNull
    public final MR1 g;

    @NotNull
    public final InterfaceC6396rf0<C3496e42> h;

    @NotNull
    public final InterfaceC6396rf0<C3496e42> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BR1(@NotNull InterfaceC7401wR1 callbacks, @NotNull InterfaceC6350rR1 strategyInstructionSelectionProvider, @NotNull ReporterApi reporter, @NotNull C3069c22 tradingAmplitudeEventsLocalExperiment, @NotNull MR1 strategySelectionUseCase) {
        super(callbacks);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(strategyInstructionSelectionProvider, "strategyInstructionSelectionProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(tradingAmplitudeEventsLocalExperiment, "tradingAmplitudeEventsLocalExperiment");
        Intrinsics.checkNotNullParameter(strategySelectionUseCase, "strategySelectionUseCase");
        this.e = callbacks;
        this.f = reporter;
        this.g = strategySelectionUseCase;
        C6610sg0 c6610sg0B = strategyInstructionSelectionProvider.b();
        this.h = c6610sg0B;
        this.i = c6610sg0B;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object n(BR1 br1, LM lm) {
        AR1 ar1;
        br1.getClass();
        if (lm instanceof AR1) {
            ar1 = (AR1) lm;
            int i = ar1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ar1.h = i - Integer.MIN_VALUE;
            } else {
                ar1 = new AR1(br1, lm);
            }
        } else {
            ar1 = new AR1(br1, lm);
        }
        Object objO = ar1.e;
        MN mn = MN.d;
        int i2 = ar1.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            ar1.d = br1;
            ar1.h = 1;
            objO = C4466ii.o(br1.h, ar1);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            br1 = ar1.d;
            C1795Pt1.b(objO);
        }
        int iOrdinal = ((C3496e42) objO).a.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 3) {
                L80 l80 = L80.MAX_PROFIT;
                ReporterApi.a.b(br1.f, EnumC5028l80.y0, new C1510Md1("Aggressive"), null, 12);
                return Unit.a;
            }
            if (iOrdinal != 4) {
                throw new C6489s51();
            }
        }
        return Unit.a;
    }
}

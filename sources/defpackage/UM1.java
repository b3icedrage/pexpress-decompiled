package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class UM1 extends AbstractC6048q0<XM1, WM1.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UM1(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull WM1 smaIndicatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, smaIndicatorParamsProvider);
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(smaIndicatorParamsProvider, "smaIndicatorParamsProvider");
        this.j = core;
        CR0 cr0 = CR0.ADX;
        this.k = "sma";
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.k;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        XM1 xm1 = (XM1) cVar;
        WM1.a aVar = (WM1.a) interfaceC7722xy0;
        double dP = C1526Mj.p(xm1.b);
        double dP2 = C1526Mj.p(xm1.c);
        E10.b.b(this, "realSlow: " + dP + ", realFast: " + dP2);
        if (dP2 > dP) {
            return i(H32.a.CALL_UP, aVar);
        }
        return dP2 < dP ? i(H32.a.PUT_DOWN, aVar) : k(c6257r0);
    }

    @Override // defpackage.AbstractC6048q0
    public final Map l(InterfaceC7722xy0 interfaceC7722xy0) {
        WM1.a indicatorParam = (WM1.a) interfaceC7722xy0;
        Intrinsics.checkNotNullParameter(indicatorParam, "indicatorParam");
        return PW0.g(super.l(indicatorParam), PW0.e(new Pair("slowTimePeriod", Integer.valueOf(indicatorParam.a)), new Pair("fastTimePeriod", Integer.valueOf(indicatorParam.b))));
    }

    @Override // defpackage.AbstractC6048q0
    public final Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        WM1.a aVar = (WM1.a) interfaceC7722xy0;
        XM1 xm1 = (XM1) cVar;
        float[] fArrM = C0957Fb.m(CollectionsKt.a0(aVar.a, list));
        float[] fArrM2 = C0957Fb.m(CollectionsKt.a0(aVar.b, list));
        Intrinsics.checkNotNullParameter(fArrM, "<this>");
        int length = fArrM.length - 1;
        double[] dArr = xm1.b;
        C3372dV0 c3372dV0 = this.h;
        C3372dV0 c3372dV1 = this.i;
        C3556eN c3556eN = this.j;
        c3556eN.getClass();
        EnumC2107Tt1 enumC2107Tt1F = C3556eN.f(length, fArrM, aVar.a, c3372dV0, c3372dV1, dArr);
        Intrinsics.checkNotNullParameter(fArrM2, "<this>");
        int length2 = fArrM2.length - 1;
        double[] dArr2 = xm1.c;
        c3556eN.getClass();
        EnumC2107Tt1 enumC2107Tt1F2 = C3556eN.f(length2, fArrM2, aVar.b, c3372dV0, c3372dV1, dArr2);
        EnumC2107Tt1 enumC2107Tt1 = EnumC2107Tt1.d;
        return (enumC2107Tt1F == enumC2107Tt1 && enumC2107Tt1F2 == enumC2107Tt1) ? enumC2107Tt1 : EnumC2107Tt1.i;
    }
}

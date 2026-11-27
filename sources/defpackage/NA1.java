package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class NA1 extends AbstractC6048q0<C6990uV, PA1.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NA1(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull PA1 rocIndicatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, rocIndicatorParamsProvider);
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(rocIndicatorParamsProvider, "rocIndicatorParamsProvider");
        this.j = core;
        CR0 cr0 = CR0.ADX;
        this.k = "roc";
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.k;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        PA1.a aVar = (PA1.a) interfaceC7722xy0;
        double dP = C1526Mj.p(((C6990uV) cVar).a);
        E10.b.b(this, "real: " + dP);
        if (dP > 0.0d) {
            return i(H32.a.CALL_UP, aVar);
        }
        return dP < 0.0d ? i(H32.a.PUT_DOWN, aVar) : k(c6257r0);
    }

    @Override // defpackage.AbstractC6048q0
    public final Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        EnumC2107Tt1 enumC2107Tt1;
        int i;
        PA1.a aVar = (PA1.a) interfaceC7722xy0;
        float[] fArrM = C0957Fb.m(CollectionsKt.b0(aVar.a + 1, list));
        Intrinsics.checkNotNullParameter(fArrM, "<this>");
        int length = fArrM.length - 1;
        double[] dArr = ((C6990uV) cVar).a;
        this.j.getClass();
        if (length < 0 || length < 0) {
            enumC2107Tt1 = EnumC2107Tt1.g;
        } else {
            int i2 = aVar.a;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 10;
            } else if (i2 < 1 || i2 > 100000) {
                enumC2107Tt1 = EnumC2107Tt1.e;
            }
            int i3 = 0;
            int i4 = i2 > 0 ? i2 : 0;
            enumC2107Tt1 = EnumC2107Tt1.d;
            C3372dV0 c3372dV0 = this.h;
            C3372dV0 c3372dV1 = this.i;
            if (i4 > length) {
                c3372dV0.a = 0;
                c3372dV1.a = 0;
            } else {
                int i5 = i4 - i2;
                int i6 = i4;
                while (i6 <= length) {
                    int i7 = i5 + 1;
                    double d = fArrM[i5];
                    if (d != 0.0d) {
                        i = i3 + 1;
                        dArr[i3] = ((((double) fArrM[i6]) / d) - 1.0d) * 100.0d;
                    } else {
                        i = i3 + 1;
                        dArr[i3] = 0.0d;
                    }
                    i3 = i;
                    i6++;
                    i5 = i7;
                }
                c3372dV1.a = i3;
                c3372dV0.a = i4;
            }
        }
        Intrinsics.checkNotNullExpressionValue(enumC2107Tt1, "roc(...)");
        return enumC2107Tt1;
    }
}

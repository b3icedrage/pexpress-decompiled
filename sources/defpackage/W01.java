package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class W01 extends AbstractC6048q0<C6990uV, Y01.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W01(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull Y01 momIndicatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, momIndicatorParamsProvider);
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(momIndicatorParamsProvider, "momIndicatorParamsProvider");
        this.j = core;
        CR0 cr0 = CR0.ADX;
        this.k = "mom";
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.k;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        Y01.a aVar = (Y01.a) interfaceC7722xy0;
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
        Y01.a aVar = (Y01.a) interfaceC7722xy0;
        float[] fArrM = C0957Fb.m(CollectionsKt.b0(aVar.a + 1, list));
        Intrinsics.checkNotNullParameter(fArrM, "<this>");
        int length = fArrM.length - 1;
        double[] dArr = ((C6990uV) cVar).a;
        this.j.getClass();
        if (length < 0 || length < 0) {
            enumC2107Tt1 = EnumC2107Tt1.g;
        } else {
            int i = aVar.a;
            if (i == Integer.MIN_VALUE) {
                i = 10;
            } else if (i < 1 || i > 100000) {
                enumC2107Tt1 = EnumC2107Tt1.e;
            }
            int i2 = 0;
            int i3 = i > 0 ? i : 0;
            enumC2107Tt1 = EnumC2107Tt1.d;
            C3372dV0 c3372dV0 = this.h;
            C3372dV0 c3372dV1 = this.i;
            if (i3 > length) {
                c3372dV0.a = 0;
                c3372dV1.a = 0;
            } else {
                int i4 = i3 - i;
                int i5 = i3;
                while (i5 <= length) {
                    dArr[i2] = fArrM[i5] - fArrM[i4];
                    i2++;
                    i5++;
                    i4++;
                }
                c3372dV1.a = i2;
                c3372dV0.a = i3;
            }
        }
        Intrinsics.checkNotNullExpressionValue(enumC2107Tt1, "mom(...)");
        return enumC2107Tt1;
    }
}

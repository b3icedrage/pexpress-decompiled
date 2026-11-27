package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Hi2 extends AbstractC6048q0<C6990uV, Ji2.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hi2(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull Ji2 willRIndicatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, willRIndicatorParamsProvider);
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(willRIndicatorParamsProvider, "willRIndicatorParamsProvider");
        this.j = core;
        CR0 cr0 = CR0.ADX;
        this.k = "wpr";
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.k;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        Ji2.a aVar = (Ji2.a) interfaceC7722xy0;
        double dP = C1526Mj.p(((C6990uV) cVar).a);
        E10.b.b(this, "real: " + dP);
        if (dP < -50.0d) {
            return i(H32.a.CALL_UP, aVar);
        }
        return dP > -50.0d ? i(H32.a.PUT_DOWN, aVar) : k(c6257r0);
    }

    @Override // defpackage.AbstractC6048q0
    public final Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        EnumC2107Tt1 enumC2107Tt1;
        int i;
        int i2;
        float[] fArrN = C0957Fb.n(list);
        Intrinsics.checkNotNullParameter(list, "<this>");
        float[] fArrM = C0957Fb.m(list);
        float[] fArrM2 = C0957Fb.m(list);
        int iE = WE.e(list);
        int i3 = ((Ji2.a) interfaceC7722xy0).a;
        double[] dArr = ((C6990uV) cVar).a;
        this.j.getClass();
        if (iE < 0 || iE < 0) {
            enumC2107Tt1 = EnumC2107Tt1.g;
        } else {
            if (i3 == Integer.MIN_VALUE) {
                i3 = 14;
            } else if (i3 < 2 || i3 > 100000) {
                enumC2107Tt1 = EnumC2107Tt1.e;
            }
            int i4 = i3 - 1;
            int i5 = 0;
            int i6 = i4 > 0 ? i4 : 0;
            enumC2107Tt1 = EnumC2107Tt1.d;
            C3372dV0 c3372dV0 = this.h;
            C3372dV0 c3372dV1 = this.i;
            if (i6 > iE) {
                c3372dV0.a = 0;
                c3372dV1.a = 0;
            } else {
                int i7 = i6 - i4;
                int i8 = -1;
                int i9 = i6;
                int i11 = -1;
                double d = 0.0d;
                double d2 = 0.0d;
                double d3 = 0.0d;
                while (i9 <= iE) {
                    double[] dArr2 = dArr;
                    float[] fArr = fArrN;
                    double d4 = fArrM[i9];
                    if (i8 < i7) {
                        d = fArrM[i7];
                        int i12 = i7;
                        int i13 = i12;
                        while (true) {
                            i12++;
                            if (i12 > i9) {
                                break;
                            }
                            double d5 = fArrM[i12];
                            if (d5 < d) {
                                i13 = i12;
                                d = d5;
                            }
                        }
                        d3 = (d2 - d) / (-100.0d);
                        i8 = i13;
                    } else if (d4 <= d) {
                        d3 = (d2 - d4) / (-100.0d);
                        d = d4;
                        i8 = i9;
                    }
                    double d6 = fArr[i9];
                    if (i11 < i7) {
                        d2 = fArr[i7];
                        int i14 = i7;
                        int i15 = i14;
                        while (true) {
                            i14++;
                            if (i14 > i9) {
                                break;
                            }
                            int i16 = i7;
                            double d7 = fArr[i14];
                            if (d7 > d2) {
                                d2 = d7;
                                i15 = i14;
                            }
                            i7 = i16;
                        }
                        i = i7;
                        d3 = (d2 - d) / (-100.0d);
                        i11 = i15;
                    } else {
                        i = i7;
                        if (d6 >= d2) {
                            d3 = (d6 - d) / (-100.0d);
                            d2 = d6;
                            i11 = i9;
                        }
                    }
                    if (d3 != 0.0d) {
                        i2 = i5 + 1;
                        dArr2[i5] = (d2 - ((double) fArrM2[i9])) / d3;
                    } else {
                        i2 = i5 + 1;
                        dArr2[i5] = 0.0d;
                    }
                    i5 = i2;
                    i7 = i + 1;
                    i9++;
                    fArrN = fArr;
                    dArr = dArr2;
                }
                c3372dV0.a = i6;
                c3372dV1.a = i5;
            }
        }
        Intrinsics.checkNotNullExpressionValue(enumC2107Tt1, "willR(...)");
        return enumC2107Tt1;
    }
}

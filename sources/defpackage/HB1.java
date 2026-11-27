package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class HB1 extends AbstractC6048q0<C6990uV, JB1.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final String k;
    public float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HB1(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull JB1 sarIndicatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, sarIndicatorParamsProvider);
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(sarIndicatorParamsProvider, "sarIndicatorParamsProvider");
        this.j = core;
        CR0 cr0 = CR0.ADX;
        this.k = "sar";
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.k;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        JB1.a aVar = (JB1.a) interfaceC7722xy0;
        double dP = C1526Mj.p(((C6990uV) cVar).a);
        E10.b.b(this, "last price: " + this.l);
        E10.b.b(this, "real: " + dP);
        double d = (double) this.l;
        if (d > dP) {
            return i(H32.a.CALL_UP, aVar);
        }
        return d < dP ? i(H32.a.PUT_DOWN, aVar) : k(c6257r0);
    }

    @Override // defpackage.AbstractC6048q0
    public final Map l(InterfaceC7722xy0 interfaceC7722xy0) {
        JB1.a indicatorParam = (JB1.a) interfaceC7722xy0;
        Intrinsics.checkNotNullParameter(indicatorParam, "indicatorParam");
        return PW0.g(super.l(indicatorParam), PW0.e(new Pair("acceleration", Double.valueOf(indicatorParam.a)), new Pair("maximum", Double.valueOf(indicatorParam.b))));
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01e6  */
    @Override // defpackage.AbstractC6048q0
    public final Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        double d;
        int i;
        JB1.a aVar = (JB1.a) interfaceC7722xy0;
        float[] fArrN = C0957Fb.n(list);
        Intrinsics.checkNotNullParameter(list, "<this>");
        float[] fArrM = C0957Fb.m(list);
        this.l = ((CF) CollectionsKt.L(list)).c;
        int iE = WE.e(list);
        double d2 = aVar.a;
        double[] dArr = ((C6990uV) cVar).a;
        this.j.getClass();
        double[] dArr2 = new double[1];
        EnumC2107Tt1 enumC2107Tt1 = EnumC2107Tt1.g;
        if (iE >= 0 && iE >= 0) {
            EnumC2107Tt1 enumC2107Tt2 = EnumC2107Tt1.e;
            if (d2 == -4.0E37d) {
                d2 = 0.02d;
            } else if (d2 < 0.0d || d2 > 3.0E37d) {
                enumC2107Tt1 = enumC2107Tt2;
            }
            double d3 = aVar.b;
            if (d3 == -4.0E37d) {
                d3 = 0.2d;
            } else if (d3 < 0.0d || d3 > 3.0E37d) {
                enumC2107Tt1 = enumC2107Tt2;
            }
            EnumC2107Tt1 enumC2107Tt3 = EnumC2107Tt1.d;
            C3372dV0 c3372dV0 = this.h;
            C3372dV0 c3372dV1 = this.i;
            if (1 > iE) {
                c3372dV0.a = 0;
                c3372dV1.a = 0;
                enumC2107Tt1 = enumC2107Tt3;
            } else {
                if (d2 > d3) {
                    d2 = d3;
                }
                double d4 = fArrN[0];
                double d5 = fArrM[0];
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 1; i2 < i4; i4 = 1) {
                    int i5 = i2 + 1;
                    int i6 = i3;
                    double d6 = fArrN[i5];
                    double d7 = d6 - d4;
                    double d8 = fArrM[i5];
                    double d9 = d5 - d8;
                    if (d9 <= 0.0d || d7 >= d9) {
                        i = i6 + 1;
                        dArr2[i6] = 0.0d;
                    } else {
                        i = i6 + 1;
                        dArr2[i6] = d9;
                    }
                    d5 = d8;
                    i3 = i;
                    i2 = i5;
                    d4 = d6;
                }
                boolean z = dArr2[0] <= 0.0d;
                c3372dV0.a = 1;
                double d10 = fArrN[0];
                double d11 = fArrM[0];
                if (z) {
                    d = fArrN[1];
                } else {
                    d = fArrM[1];
                    d11 = d10;
                }
                boolean z2 = true;
                double d12 = fArrM[1];
                boolean z3 = z;
                double d13 = d11;
                double d14 = fArrN[1];
                double d15 = d2;
                double d16 = d;
                boolean z4 = z3;
                double d17 = d12;
                int i7 = 0;
                int i8 = 1;
                while (i8 <= iE) {
                    double d18 = d14;
                    double d19 = fArrM[i8];
                    d14 = fArrN[i8];
                    i8++;
                    boolean z5 = z2;
                    if (z4 != z5) {
                        if (d14 >= d13) {
                            if (d16 > d17) {
                                d16 = d17;
                            }
                            if (d16 > d19) {
                                d16 = d19;
                            }
                            int i9 = i7 + 1;
                            dArr[i7] = d16;
                            double d20 = ((d14 - d16) * d2) + d16;
                            d13 = d20 > d17 ? d17 : d20;
                            d16 = d14;
                            if (d13 > d19) {
                                i7 = i9;
                                d15 = d2;
                                z2 = z5;
                                z4 = z2;
                                d17 = d19;
                                d13 = d17;
                            } else {
                                i7 = i9;
                                d15 = d2;
                                z2 = z5;
                                z4 = z2;
                            }
                        } else {
                            int i11 = i7 + 1;
                            dArr[i7] = d13;
                            if (d19 < d16) {
                                d15 += d2;
                                if (d15 > d3) {
                                    d15 = d3;
                                }
                                d16 = d19;
                            }
                            double d21 = ((d16 - d13) * d15) + d13;
                            d13 = d21 < d18 ? d18 : d21;
                            if (d13 < d14) {
                                d13 = d14;
                            }
                            z2 = z5;
                            i7 = i11;
                        }
                        d17 = d19;
                    } else if (d19 <= d13) {
                        if (d16 < d18) {
                            d16 = d18;
                        }
                        if (d16 < d14) {
                            d16 = d14;
                        }
                        int i12 = i7 + 1;
                        dArr[i7] = d16;
                        double d22 = ((d19 - d16) * d2) + d16;
                        d13 = d22 < d18 ? d18 : d22;
                        if (d13 < d14) {
                            d13 = d14;
                        }
                        i7 = i12;
                        d15 = d2;
                        z2 = z5;
                        d17 = d19;
                        d16 = d17;
                        z4 = false;
                    } else {
                        int i13 = i7 + 1;
                        dArr[i7] = d13;
                        if (d14 > d16) {
                            d15 += d2;
                            d16 = d14;
                            if (d15 > d3) {
                                d15 = d3;
                            }
                        }
                        double d23 = ((d16 - d13) * d15) + d13;
                        d13 = d23 > d17 ? d17 : d23;
                        z2 = z5;
                        if (d13 > d19) {
                            i7 = i13;
                            d17 = d19;
                            d13 = d17;
                        } else {
                            i7 = i13;
                            d17 = d19;
                        }
                    }
                }
                c3372dV1.a = i7;
                enumC2107Tt1 = enumC2107Tt3;
            }
        }
        Intrinsics.checkNotNullExpressionValue(enumC2107Tt1, "sar(...)");
        return enumC2107Tt1;
    }
}

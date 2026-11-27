package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class VU0 extends AbstractC6048q0<YU0, XU0.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final XU0 k;

    @NotNull
    public final String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VU0(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull XU0 macdIndicatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, macdIndicatorParamsProvider);
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(macdIndicatorParamsProvider, "macdIndicatorParamsProvider");
        this.j = core;
        this.k = macdIndicatorParamsProvider;
        CR0 cr0 = CR0.ADX;
        this.l = "macd";
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.AbstractC6048q0, defpackage.E10
    @Nullable
    public final Object b(@NotNull I10 i10, @NotNull LM lm) {
        TU0 tu0;
        VU0 vu0;
        if (lm instanceof TU0) {
            tu0 = (TU0) lm;
            int i = tu0.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                tu0.i = i - Integer.MIN_VALUE;
            } else {
                tu0 = new TU0(this, lm);
            }
        } else {
            tu0 = new TU0(this, lm);
        }
        TU0 tu1 = tu0;
        Object objO = tu1.g;
        MN mn = MN.d;
        int i2 = tu1.i;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            if (i10.g) {
                C6610sg0 c6610sg0D = this.k.d();
                tu1.d = this;
                tu1.e = i10;
                tu1.i = 2;
                objO = C4466ii.o(c6610sg0D, tu1);
                if (objO != mn) {
                    vu0 = this;
                }
            } else {
                tu1.i = 1;
                Object objE = AbstractC6048q0.e(this, i10, tu1);
                if (objE != mn) {
                    return objE;
                }
            }
        }
        if (i2 == 1) {
            C1795Pt1.b(objO);
            return objO;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
            return objO;
        }
        i10 = tu1.e;
        vu0 = tu1.d;
        C1795Pt1.b(objO);
        XU0.a aVar = (XU0.a) objO;
        YU0 yu0 = new YU0(new double[aVar.a()], new double[aVar.a()], new double[aVar.a()]);
        MB mb = new MB(3);
        UU0 uu0 = new UU0(4, null);
        tu1.d = null;
        tu1.e = null;
        tu1.i = 3;
        Object objO2 = vu0.o(i10, aVar, yu0, mb, uu0, tu1);
        return objO2 == mn ? mn : objO2;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        YU0 yu0 = (YU0) cVar;
        XU0.a aVar = (XU0.a) interfaceC7722xy0;
        double dP = C1526Mj.p(yu0.a);
        double dP2 = C1526Mj.p(yu0.b);
        E10.b.b(this, "outMacd: " + dP);
        E10.b.b(this, "outSignal: " + dP2);
        if (dP > dP2) {
            return i(H32.a.CALL_UP, aVar);
        }
        return dP < dP2 ? i(H32.a.PUT_DOWN, aVar) : k(c6257r0);
    }

    @Override // defpackage.AbstractC6048q0
    public final Map l(InterfaceC7722xy0 interfaceC7722xy0) {
        XU0.a indicatorParam = (XU0.a) interfaceC7722xy0;
        Intrinsics.checkNotNullParameter(indicatorParam, "indicatorParam");
        return PW0.g(super.l(indicatorParam), PW0.e(new Pair("fast period", Integer.valueOf(indicatorParam.b)), new Pair("slow period", Integer.valueOf(indicatorParam.a)), new Pair("signal period", Integer.valueOf(indicatorParam.c))));
    }

    @Override // defpackage.AbstractC6048q0
    public final Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        EnumC2107Tt1 enumC2107Tt1;
        double d;
        double d2;
        int i;
        int i2;
        XU0.a aVar = (XU0.a) interfaceC7722xy0;
        YU0 yu0 = (YU0) cVar;
        float[] fArrM = C0957Fb.m(list);
        int iE = WE.e(list);
        int i3 = aVar.a;
        double[] dArr = yu0.a;
        C3556eN c3556eN = this.j;
        c3556eN.getClass();
        if (iE < 0 || iE < 0) {
            enumC2107Tt1 = EnumC2107Tt1.g;
        } else {
            enumC2107Tt1 = EnumC2107Tt1.e;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 12;
            } else if (i3 >= 2 && i3 <= 100000) {
            }
            int i4 = aVar.b;
            int i5 = 26;
            if (i4 == Integer.MIN_VALUE) {
                i4 = 26;
            } else if (i4 >= 2 && i4 <= 100000) {
            }
            int i6 = aVar.c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = 9;
            } else if (i6 >= 1 && i6 <= 100000) {
            }
            C3372dV0 c3372dV0 = new C3372dV0();
            C3372dV0 c3372dV1 = new C3372dV0();
            C3372dV0 c3372dV2 = new C3372dV0();
            C3372dV0 c3372dV3 = new C3372dV0();
            if (i4 >= i3) {
                int i7 = i4;
                i4 = i3;
                i3 = i7;
            }
            if (i3 != 0) {
                d = 2.0d / ((double) (i3 + 1));
                i5 = i3;
            } else {
                d = 0.075d;
            }
            if (i4 != 0) {
                d2 = 2.0d / ((double) (i4 + 1));
                i = i4;
            } else {
                d2 = 0.15d;
                i = 12;
            }
            double d3 = d2;
            int iC = c3556eN.c(i6);
            int iC2 = c3556eN.c(i5) + iC;
            if (iC2 <= 0) {
                iC2 = 0;
            }
            EnumC2107Tt1 enumC2107Tt2 = EnumC2107Tt1.d;
            C3372dV0 c3372dV4 = this.h;
            C3372dV0 c3372dV5 = this.i;
            if (iC2 > iE) {
                c3372dV4.a = 0;
                c3372dV5.a = 0;
            } else {
                int i8 = (iE - iC2) + 1;
                int i9 = i8 + iC;
                double[] dArr2 = new double[i9];
                double[] dArr3 = new double[i9];
                int i11 = iC2 - iC;
                int i12 = i6;
                int i13 = iC2;
                c3556eN.a(i11, iE, fArrM, i5, d, c3372dV0, c3372dV1, dArr3);
                c3556eN.a(i11, iE, fArrM, i, d3, c3372dV2, c3372dV3, dArr2);
                if (c3372dV0.a == i11 && c3372dV2.a == i11 && (i2 = c3372dV1.a) == c3372dV3.a && i2 == i9) {
                    for (int i14 = 0; i14 < c3372dV1.a; i14++) {
                        dArr2[i14] = dArr2[i14] - dArr3[i14];
                    }
                    System.arraycopy(dArr2, iC, dArr, 0, i8);
                    int i15 = c3372dV1.a - 1;
                    double d4 = 2.0d / ((double) (i12 + 1));
                    double[] dArr4 = yu0.b;
                    int iC3 = c3556eN.c(i12);
                    int i16 = iC3 > 0 ? iC3 : 0;
                    if (i16 > i15) {
                        c3372dV2.a = 0;
                        c3372dV3.a = 0;
                    } else {
                        c3372dV2.a = i16;
                        int i17 = i16 - iC3;
                        double d5 = 0.0d;
                        int i18 = i12;
                        while (true) {
                            int i19 = i18 - 1;
                            if (i18 <= 0) {
                                break;
                            }
                            d5 += dArr2[i17];
                            i17++;
                            i18 = i19;
                        }
                        double d6 = d5 / ((double) i12);
                        while (i17 <= i16) {
                            d6 += (dArr2[i17] - d6) * d4;
                            i17++;
                        }
                        dArr4[0] = d6;
                        int i20 = 1;
                        while (i17 <= i15) {
                            d6 += (dArr2[i17] - d6) * d4;
                            dArr4[i20] = d6;
                            i20++;
                            i17++;
                        }
                        c3372dV3.a = i20;
                    }
                    for (int i21 = 0; i21 < c3372dV3.a; i21++) {
                        yu0.c[i21] = dArr[i21] - dArr4[i21];
                    }
                    c3372dV4.a = i13;
                    c3372dV5.a = c3372dV3.a;
                } else {
                    c3372dV4.a = 0;
                    c3372dV5.a = 0;
                    enumC2107Tt1 = EnumC2107Tt1.i;
                }
            }
            enumC2107Tt1 = enumC2107Tt2;
        }
        Intrinsics.checkNotNullExpressionValue(enumC2107Tt1, "macd(...)");
        return enumC2107Tt1;
    }
}

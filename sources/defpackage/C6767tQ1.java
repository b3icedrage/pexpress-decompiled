package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6767tQ1 extends AbstractC6048q0<C6138qQ1, C6977uQ1.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final C6977uQ1 k;

    @NotNull
    public final String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6767tQ1(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull C6977uQ1 indicatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, indicatorParamsProvider);
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(indicatorParamsProvider, "indicatorParamsProvider");
        this.j = core;
        this.k = indicatorParamsProvider;
        CR0 cr0 = CR0.ADX;
        this.l = "stoch";
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
        C6347rQ1 c6347rQ1;
        C6767tQ1 c6767tQ1;
        if (lm instanceof C6347rQ1) {
            c6347rQ1 = (C6347rQ1) lm;
            int i = c6347rQ1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6347rQ1.i = i - Integer.MIN_VALUE;
            } else {
                c6347rQ1 = new C6347rQ1(this, lm);
            }
        } else {
            c6347rQ1 = new C6347rQ1(this, lm);
        }
        C6347rQ1 c6347rQ2 = c6347rQ1;
        Object objO = c6347rQ2.g;
        MN mn = MN.d;
        int i2 = c6347rQ2.i;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            if (i10.g) {
                C6610sg0 c6610sg0D = this.k.d();
                c6347rQ2.d = this;
                c6347rQ2.e = i10;
                c6347rQ2.i = 2;
                objO = C4466ii.o(c6610sg0D, c6347rQ2);
                if (objO != mn) {
                    c6767tQ1 = this;
                }
            } else {
                c6347rQ2.i = 1;
                Object objE = AbstractC6048q0.e(this, i10, c6347rQ2);
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
        i10 = c6347rQ2.e;
        c6767tQ1 = c6347rQ2.d;
        C1795Pt1.b(objO);
        C6977uQ1.a aVar = (C6977uQ1.a) objO;
        C6138qQ1 c6138qQ1 = new C6138qQ1(new double[aVar.a()], new double[aVar.a()]);
        MA ma = new MA(1);
        C6557sQ1 c6557sQ1 = new C6557sQ1(4, null);
        c6347rQ2.d = null;
        c6347rQ2.e = null;
        c6347rQ2.i = 3;
        Object objO2 = c6767tQ1.o(i10, aVar, c6138qQ1, ma, c6557sQ1, c6347rQ2);
        return objO2 == mn ? mn : objO2;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        C6138qQ1 c6138qQ1 = (C6138qQ1) cVar;
        C6977uQ1.a aVar = (C6977uQ1.a) interfaceC7722xy0;
        double dP = C1526Mj.p(c6138qQ1.a);
        double dP2 = C1526Mj.p(c6138qQ1.b);
        E10.b.b(this, "slowK: " + dP);
        E10.b.b(this, "slowD: " + dP2);
        if (dP > dP2) {
            return i(H32.a.CALL_UP, aVar);
        }
        return dP < dP2 ? i(H32.a.PUT_DOWN, aVar) : k(c6257r0);
    }

    @Override // defpackage.AbstractC6048q0
    public final Map l(InterfaceC7722xy0 interfaceC7722xy0) {
        C6977uQ1.a indicatorParam = (C6977uQ1.a) interfaceC7722xy0;
        Intrinsics.checkNotNullParameter(indicatorParam, "indicatorParam");
        return PW0.g(super.l(indicatorParam), PW0.e(new Pair("fastKPeriod", Integer.valueOf(indicatorParam.a)), new Pair("slowKPeriod", Integer.valueOf(indicatorParam.b)), new Pair("slowDPeriod", Integer.valueOf(indicatorParam.c))));
    }

    @Override // defpackage.AbstractC6048q0
    public final Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        EnumC2107Tt1 enumC2107Tt1D;
        int i;
        int i2;
        C6977uQ1.a aVar = (C6977uQ1.a) interfaceC7722xy0;
        C6138qQ1 c6138qQ1 = (C6138qQ1) cVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        float[] fArrM = C0957Fb.m(list);
        Intrinsics.checkNotNullParameter(list, "<this>");
        float[] fArrM2 = C0957Fb.m(list);
        float[] fArrM3 = C0957Fb.m(list);
        int iE = WE.e(list);
        int i3 = aVar.a;
        double[] dArr = c6138qQ1.a;
        C3556eN c3556eN = this.j;
        c3556eN.getClass();
        if (iE < 0 || iE < 0) {
            enumC2107Tt1D = EnumC2107Tt1.g;
        } else {
            enumC2107Tt1D = EnumC2107Tt1.e;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 5;
            } else if (i3 >= 1 && i3 <= 100000) {
            }
            int i4 = aVar.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = 3;
            } else if (i4 >= 1 && i4 <= 100000) {
            }
            int i5 = aVar.b;
            if (i5 == Integer.MIN_VALUE) {
                i5 = 3;
            } else if (i5 >= 1 && i5 <= 100000) {
            }
            int i6 = i3 - 1;
            int iE2 = c3556eN.e(i4);
            int iE3 = c3556eN.e(i5);
            int i7 = i6 + iE3 + iE2;
            int i8 = i7 > 0 ? i7 : 0;
            enumC2107Tt1D = EnumC2107Tt1.d;
            C3372dV0 c3372dV0 = this.h;
            int i9 = i4;
            C3372dV0 c3372dV1 = this.i;
            if (i8 > iE) {
                c3372dV0.a = 0;
                c3372dV1.a = 0;
            } else {
                int i11 = i8 - i7;
                int i12 = i11 + i6;
                double[] dArr2 = new double[(iE - i12) + 1];
                int i13 = i11;
                double d = 0.0d;
                double d2 = 0.0d;
                double d3 = 0.0d;
                int i14 = -1;
                int i15 = i5;
                int i16 = -1;
                int i17 = 0;
                while (i12 <= iE) {
                    int i18 = iE;
                    float[] fArr = fArrM;
                    float[] fArr2 = fArrM3;
                    double d4 = fArrM[i12];
                    if (i16 < i13) {
                        d = fArr[i13];
                        int i19 = i13;
                        i16 = i19;
                        while (true) {
                            i19++;
                            if (i19 > i12) {
                                break;
                            }
                            double d5 = fArr[i19];
                            if (d5 < d) {
                                i16 = i19;
                                d = d5;
                            }
                        }
                        d3 = (d2 - d) / 100.0d;
                    } else if (d4 <= d) {
                        d3 = (d2 - d4) / 100.0d;
                        d = d4;
                        i16 = i12;
                    }
                    double d6 = fArrM2[i12];
                    if (i14 < i13) {
                        int i20 = i13;
                        d2 = fArrM2[i13];
                        i14 = i20;
                        while (true) {
                            i20++;
                            if (i20 > i12) {
                                break;
                            }
                            double d7 = fArrM2[i20];
                            if (d7 > d2) {
                                i14 = i20;
                                d2 = d7;
                            }
                        }
                        d3 = (d2 - d) / 100.0d;
                    } else if (d6 >= d2) {
                        i14 = i12;
                        d3 = (d6 - d) / 100.0d;
                        d2 = d6;
                    }
                    if (d3 != 0.0d) {
                        i2 = i17 + 1;
                        dArr2[i17] = (((double) fArr2[i12]) - d) / d3;
                    } else {
                        i2 = i17 + 1;
                        dArr2[i17] = 0.0d;
                    }
                    i17 = i2;
                    i13++;
                    i12++;
                    iE = i18;
                    fArrM = fArr;
                    fArrM3 = fArr2;
                }
                int i21 = i8;
                enumC2107Tt1D = c3556eN.d(i17 - 1, dArr2, i9, c3372dV0, c3372dV1, dArr2);
                if (enumC2107Tt1D != enumC2107Tt1D || (i = c3372dV1.a) == 0) {
                    c3372dV0.a = 0;
                    c3372dV1.a = 0;
                } else {
                    enumC2107Tt1D = c3556eN.d(i - 1, dArr2, i15, c3372dV0, c3372dV1, c6138qQ1.b);
                    System.arraycopy(dArr2, iE3, dArr, 0, c3372dV1.a);
                    if (enumC2107Tt1D != enumC2107Tt1D) {
                        c3372dV0.a = 0;
                        c3372dV1.a = 0;
                    } else {
                        c3372dV0.a = i21;
                        enumC2107Tt1D = enumC2107Tt1D;
                    }
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(enumC2107Tt1D, "stoch(...)");
        return enumC2107Tt1D;
    }
}

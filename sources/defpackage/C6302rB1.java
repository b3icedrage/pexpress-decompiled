package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6302rB1 extends AbstractC6048q0<C6990uV, C4065gm1.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final C4065gm1 k;

    @NotNull
    public final String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6302rB1(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull C4065gm1 indicatorParamsProvider) {
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
        this.l = "rsi";
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
        C5883pB1 c5883pB1;
        C6302rB1 c6302rB1;
        if (lm instanceof C5883pB1) {
            c5883pB1 = (C5883pB1) lm;
            int i = c5883pB1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5883pB1.i = i - Integer.MIN_VALUE;
            } else {
                c5883pB1 = new C5883pB1(this, lm);
            }
        } else {
            c5883pB1 = new C5883pB1(this, lm);
        }
        C5883pB1 c5883pB2 = c5883pB1;
        Object objO = c5883pB2.g;
        MN mn = MN.d;
        int i2 = c5883pB2.i;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            if (i10.g) {
                C6610sg0 c6610sg0D = this.k.d();
                c5883pB2.d = this;
                c5883pB2.e = i10;
                c5883pB2.i = 2;
                objO = C4466ii.o(c6610sg0D, c5883pB2);
                if (objO != mn) {
                    c6302rB1 = this;
                }
            } else {
                c5883pB2.i = 1;
                Object objE = AbstractC6048q0.e(this, i10, c5883pB2);
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
        i10 = c5883pB2.e;
        c6302rB1 = c5883pB2.d;
        C1795Pt1.b(objO);
        C4065gm1.a aVar = (C4065gm1.a) objO;
        C6990uV c6990uV = new C6990uV(new double[aVar.a * 2]);
        C0816Dg c0816Dg = new C0816Dg(aVar, 1);
        C6093qB1 c6093qB1 = new C6093qB1(3, null);
        c5883pB2.d = null;
        c5883pB2.e = null;
        c5883pB2.i = 3;
        Object objN = c6302rB1.n(i10, aVar, c6990uV, c0816Dg, c6093qB1, c5883pB2);
        return objN == mn ? mn : objN;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        C4065gm1.a aVar = (C4065gm1.a) interfaceC7722xy0;
        double dP = C1526Mj.p(((C6990uV) cVar).a);
        E10.b.b(this, "real: " + dP);
        if (dP < 50.0d) {
            return i(H32.a.CALL_UP, aVar);
        }
        return dP > 50.0d ? i(H32.a.PUT_DOWN, aVar) : k(c6257r0);
    }

    @Override // defpackage.AbstractC6048q0
    public final Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        EnumC2107Tt1 enumC2107Tt1;
        int i;
        int i2;
        C3372dV0 c3372dV0;
        int i3;
        float[] fArrM = C0957Fb.m(list);
        Intrinsics.checkNotNullParameter(fArrM, "<this>");
        int length = fArrM.length - 1;
        int i4 = ((C4065gm1.a) interfaceC7722xy0).a;
        double[] dArr = ((C6990uV) cVar).a;
        C3556eN c3556eN = this.j;
        c3556eN.getClass();
        if (length < 0 || length < 0) {
            enumC2107Tt1 = EnumC2107Tt1.g;
        } else {
            int i5 = 14;
            if (i4 == Integer.MIN_VALUE) {
                i4 = 14;
            } else if (i4 < 2 || i4 > 100000) {
                enumC2107Tt1 = EnumC2107Tt1.e;
            }
            C3372dV0 c3372dV1 = this.h;
            c3372dV1.a = 0;
            C3372dV0 c3372dV2 = this.i;
            c3372dV2.a = 0;
            int[] iArr = c3556eN.a;
            if (i4 == Integer.MIN_VALUE) {
                i = i5 + iArr[20];
            } else if (i4 < 2 || i4 > 100000) {
                i = -1;
            } else {
                i5 = i4;
                i = i5 + iArr[20];
            }
            int i6 = i > 0 ? i : 0;
            enumC2107Tt1 = EnumC2107Tt1.d;
            if (i6 <= length) {
                if (i4 == 1) {
                    c3372dV1.a = i6;
                    int i7 = (length - i6) + 1;
                    c3372dV2.a = i7;
                    System.arraycopy(fArrM, i6, dArr, 0, i7);
                } else {
                    int i8 = i6 - i;
                    double d = fArrM[i8];
                    int i9 = iArr[20];
                    int i11 = i8 + 1;
                    int i12 = i4;
                    double d2 = 0.0d;
                    double d3 = 0.0d;
                    while (i12 > 0) {
                        int i13 = i11 + 1;
                        double d4 = fArrM[i11];
                        double d5 = d4 - d;
                        if (d5 < 0.0d) {
                            d2 -= d5;
                        } else {
                            d3 += d5;
                        }
                        i12--;
                        d = d4;
                        i11 = i13;
                    }
                    double d6 = i4;
                    double d7 = d2 / d6;
                    double d8 = d3 / d6;
                    if (i11 > i6) {
                        double d9 = d8 + d7;
                        if (-1.0E-8d >= d9 || d9 >= 1.0E-8d) {
                            dArr[0] = (d8 / d9) * 100.0d;
                        } else {
                            dArr[0] = 0.0d;
                        }
                        i3 = 1;
                        i2 = i4;
                        c3372dV0 = c3372dV2;
                    } else {
                        while (i11 < i6) {
                            C3372dV0 c3372dV3 = c3372dV2;
                            double d10 = fArrM[i11];
                            double d11 = d10 - d;
                            int i14 = i4;
                            double d12 = i4 - 1;
                            double d13 = d7 * d12;
                            double d14 = d8 * d12;
                            if (d11 < 0.0d) {
                                d13 -= d11;
                            } else {
                                d14 += d11;
                            }
                            d7 = d13 / d6;
                            d8 = d14 / d6;
                            i11++;
                            d = d10;
                            c3372dV2 = c3372dV3;
                            i4 = i14;
                        }
                        i2 = i4;
                        c3372dV0 = c3372dV2;
                        i3 = 0;
                    }
                    while (i11 <= length) {
                        int i15 = i11 + 1;
                        double d15 = fArrM[i11];
                        double d16 = d15 - d;
                        double d17 = i2 - 1;
                        double d18 = d7 * d17;
                        double d19 = d8 * d17;
                        if (d16 < 0.0d) {
                            d18 -= d16;
                        } else {
                            d19 += d16;
                        }
                        d7 = d18 / d6;
                        d8 = d19 / d6;
                        double d20 = d8 + d7;
                        if (-1.0E-8d >= d20 || d20 >= 1.0E-8d) {
                            dArr[i3] = (d8 / d20) * 100.0d;
                            i3++;
                        } else {
                            dArr[i3] = 0.0d;
                            i3++;
                        }
                        d = d15;
                        i11 = i15;
                    }
                    c3372dV1.a = i6;
                    c3372dV0.a = i3;
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(enumC2107Tt1, "rsi(...)");
        return enumC2107Tt1;
    }
}

package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5627o extends AbstractC6048q0<C6466s, C6047q.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final String k;

    @NotNull
    public final C3372dV0 l;

    @NotNull
    public final C3372dV0 m;

    @NotNull
    public final C3372dV0 n;

    @NotNull
    public final C3372dV0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5627o(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull C6047q indicatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, indicatorParamsProvider);
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(indicatorParamsProvider, "indicatorParamsProvider");
        this.j = core;
        CR0 cr0 = CR0.ADX;
        this.k = "adx";
        this.l = new C3372dV0();
        this.m = new C3372dV0();
        this.n = new C3372dV0();
        this.o = new C3372dV0();
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.k;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        C6466s c6466s = (C6466s) cVar;
        C6047q.a aVar = (C6047q.a) interfaceC7722xy0;
        double dP = C1526Mj.p(c6466s.a);
        double dP2 = C1526Mj.p(c6466s.b);
        double dP3 = C1526Mj.p(c6466s.c);
        E10.b.b(this, "adx: " + dP);
        E10.b.b(this, "adxPos: " + dP2);
        E10.b.b(this, "adxNeg: " + dP3);
        if (dP > 20.0d) {
            return dP2 > dP3 ? i(H32.a.CALL_UP, aVar) : i(H32.a.PUT_DOWN, aVar);
        }
        return k(c6257r0);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:347:0x06a7  */
    @Override // defpackage.AbstractC6048q0
    public final Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        int[] iArr;
        float[] fArr;
        EnumC2107Tt1 enumC2107Tt1;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C6047q.a aVar = (C6047q.a) interfaceC7722xy0;
        C6466s c6466s = (C6466s) cVar;
        int i7 = aVar.a + 1;
        float[] fArrN = C0957Fb.n(list);
        Intrinsics.checkNotNullParameter(list, "<this>");
        float[] fArrM = C0957Fb.m(list);
        float[] fArrM2 = C0957Fb.m(list);
        float[] fArrC0 = CollectionsKt.c0(C1526Mj.C(fArrN, i7));
        float[] fArrC1 = CollectionsKt.c0(C1526Mj.C(fArrM, i7));
        float[] fArrC2 = CollectionsKt.c0(C1526Mj.C(fArrM2, i7));
        Intrinsics.checkNotNullParameter(fArrC0, "<this>");
        int length = fArrC0.length - 1;
        double[] dArr = c6466s.b;
        C3556eN c3556eN = this.j;
        c3556eN.getClass();
        int[] iArr2 = c3556eN.a;
        int i8 = aVar.a;
        if (length < 0 || length < 0) {
            iArr = iArr2;
        } else {
            if (i8 == Integer.MIN_VALUE) {
                i4 = 14;
            } else if (i8 < 1 || i8 > 100000) {
                iArr = iArr2;
            } else {
                i4 = i8;
            }
            int i9 = i4 > 1 ? iArr2[18] + i4 : 1;
            int i11 = i9;
            if (i9 <= 0) {
                i9 = 0;
            }
            C3372dV0 c3372dV0 = this.l;
            C3372dV0 c3372dV1 = this.m;
            if (i9 > length) {
                c3372dV0.a = 0;
                c3372dV1.a = 0;
                iArr = iArr2;
            } else if (i4 <= 1) {
                c3372dV0.a = i9;
                int i12 = i9 - 1;
                iArr = iArr2;
                double d = fArrC0[i12];
                double d2 = fArrC1[i12];
                double d3 = fArrC2[i12];
                double d4 = d;
                int i13 = 0;
                while (i12 < length) {
                    i12++;
                    double d5 = d4;
                    double d6 = fArrC0[i12];
                    double d7 = d6 - d5;
                    double d8 = fArrC1[i12];
                    double d9 = d2 - d8;
                    if (d7 <= 0.0d || d7 <= d9) {
                        i6 = i13 + 1;
                        dArr[i13] = 0.0d;
                    } else {
                        double d10 = d6 - d8;
                        double dAbs = Math.abs(d6 - d3);
                        if (dAbs > d10) {
                            d10 = dAbs;
                        }
                        double dAbs2 = Math.abs(d8 - d3);
                        if (dAbs2 > d10) {
                            d10 = dAbs2;
                        }
                        if (-1.0E-8d >= d10 || d10 >= 1.0E-8d) {
                            i6 = i13 + 1;
                            dArr[i13] = d7 / d10;
                        } else {
                            i6 = i13 + 1;
                            dArr[i13] = 0.0d;
                        }
                    }
                    i13 = i6;
                    d2 = d8;
                    d3 = fArrC2[i12];
                    d4 = d6;
                }
                c3372dV1.a = i13;
            } else {
                double[] dArr2 = dArr;
                iArr = iArr2;
                c3372dV0.a = i9;
                int i14 = i9 - i11;
                double d11 = fArrC0[i14];
                double d12 = fArrC1[i14];
                int i15 = i4 - 1;
                double d13 = fArrC2[i14];
                double d14 = d11;
                double d15 = 0.0d;
                double d16 = 0.0d;
                while (true) {
                    int i16 = i15 - 1;
                    if (i15 <= 0) {
                        break;
                    }
                    i14++;
                    double d17 = d14;
                    double d18 = fArrC0[i14];
                    double d19 = d18 - d17;
                    double d20 = fArrC1[i14];
                    double d21 = d12 - d20;
                    if (d19 > 0.0d && d19 > d21) {
                        d15 += d19;
                    }
                    double d22 = d18 - d20;
                    double dAbs3 = Math.abs(d18 - d13);
                    if (dAbs3 > d22) {
                        d22 = dAbs3;
                    }
                    double dAbs4 = Math.abs(d20 - d13);
                    if (dAbs4 > d22) {
                        d22 = dAbs4;
                    }
                    d16 += d22;
                    d13 = fArrC2[i14];
                    i15 = i16;
                    d12 = d20;
                    d14 = d18;
                }
                int i17 = iArr[18] + 1;
                double d23 = d14;
                while (true) {
                    int i18 = i17 - 1;
                    if (i17 == 0) {
                        break;
                    }
                    i14++;
                    double d24 = d23;
                    double d25 = fArrC0[i14];
                    double d26 = d25 - d24;
                    double d27 = fArrC1[i14];
                    d15 = (d26 <= 0.0d || d26 <= d12 - d27) ? d15 - (d15 / ((double) i4)) : (d15 - (d15 / ((double) i4))) + d26;
                    double d28 = d25 - d27;
                    double dAbs5 = Math.abs(d25 - d13);
                    if (dAbs5 > d28) {
                        d28 = dAbs5;
                    }
                    double dAbs6 = Math.abs(d27 - d13);
                    if (dAbs6 <= d28) {
                        dAbs6 = d28;
                    }
                    d16 = (d16 - (d16 / ((double) i4))) + dAbs6;
                    d13 = fArrC2[i14];
                    i17 = i18;
                    d23 = d25;
                    d12 = d27;
                }
                double d29 = d23;
                if (-1.0E-8d >= d16 || d16 >= 1.0E-8d) {
                    dArr2[0] = (d15 / d16) * 100.0d;
                } else {
                    dArr2[0] = 0.0d;
                }
                int i19 = i14;
                double d30 = d29;
                int i20 = 1;
                while (i19 < length) {
                    int i21 = i19 + 1;
                    double[] dArr3 = dArr2;
                    int i22 = length;
                    double d31 = fArrC0[i21];
                    double d32 = d31 - d30;
                    d12 = fArrC1[i21];
                    d15 = (d32 <= 0.0d || d32 <= d12 - d12) ? d15 - (d15 / ((double) i4)) : (d15 - (d15 / ((double) i4))) + d32;
                    double d33 = d31 - d12;
                    double dAbs7 = Math.abs(d31 - d13);
                    if (dAbs7 > d33) {
                        d33 = dAbs7;
                    }
                    double dAbs8 = Math.abs(d12 - d13);
                    if (dAbs8 > d33) {
                        d33 = dAbs8;
                    }
                    d16 = (d16 - (d16 / ((double) i4))) + d33;
                    double d34 = fArrC2[i21];
                    if (-1.0E-8d >= d16 || d16 >= 1.0E-8d) {
                        i5 = i20 + 1;
                        dArr3[i20] = (d15 / d16) * 100.0d;
                    } else {
                        i5 = i20 + 1;
                        dArr3[i20] = 0.0d;
                    }
                    i20 = i5;
                    d13 = d34;
                    i19 = i21;
                    length = i22;
                    dArr2 = dArr3;
                    d30 = d31;
                }
                c3372dV1.a = i20;
            }
        }
        float[] fArrC3 = CollectionsKt.c0(C1526Mj.C(fArrN, i7));
        float[] fArrC4 = CollectionsKt.c0(C1526Mj.C(fArrM, i7));
        float[] fArrC5 = CollectionsKt.c0(C1526Mj.C(fArrM2, i7));
        Intrinsics.checkNotNullParameter(fArrC3, "<this>");
        int length2 = fArrC3.length - 1;
        if (length2 < 0 || length2 < 0) {
            fArr = fArrN;
        } else {
            if (i8 == Integer.MIN_VALUE) {
                i = 14;
            } else if (i8 < 1 || i8 > 100000) {
                fArr = fArrN;
            } else {
                i = i8;
            }
            int i23 = i > 1 ? iArr[15] + i : 1;
            int i24 = i23 > 0 ? i23 : 0;
            C3372dV0 c3372dV2 = this.n;
            C3372dV0 c3372dV3 = this.o;
            if (i24 > length2) {
                c3372dV2.a = 0;
                c3372dV3.a = 0;
                fArr = fArrN;
            } else {
                double[] dArr4 = c6466s.c;
                if (i <= 1) {
                    c3372dV2.a = i24;
                    int i25 = i24 - 1;
                    double d35 = fArrC3[i25];
                    double d36 = fArrC4[i25];
                    int i26 = i25;
                    double d37 = fArrC5[i25];
                    int i27 = 0;
                    while (i26 < length2) {
                        int i28 = i26 + 1;
                        float[] fArr2 = fArrN;
                        double d38 = fArrC3[i28];
                        double d39 = d38 - d35;
                        double d40 = fArrC4[i28];
                        double d41 = d36 - d40;
                        if (d41 <= 0.0d || d39 >= d41) {
                            i3 = i27 + 1;
                            dArr4[i27] = 0.0d;
                        } else {
                            double d42 = d38 - d40;
                            double dAbs9 = Math.abs(d38 - d37);
                            if (dAbs9 > d42) {
                                d42 = dAbs9;
                            }
                            double dAbs10 = Math.abs(d40 - d37);
                            if (dAbs10 > d42) {
                                d42 = dAbs10;
                            }
                            if (-1.0E-8d >= d42 || d42 >= 1.0E-8d) {
                                i3 = i27 + 1;
                                dArr4[i27] = d41 / d42;
                            } else {
                                i3 = i27 + 1;
                                dArr4[i27] = 0.0d;
                            }
                        }
                        i27 = i3;
                        d37 = fArrC5[i28];
                        d36 = d40;
                        i26 = i28;
                        fArrN = fArr2;
                        d35 = d38;
                    }
                    fArr = fArrN;
                    c3372dV3.a = i27;
                } else {
                    fArr = fArrN;
                    c3372dV2.a = i24;
                    int i29 = i24 - i23;
                    double d43 = fArrC3[i29];
                    double d44 = fArrC4[i29];
                    int i30 = i - 1;
                    int i31 = i29;
                    double d45 = 0.0d;
                    double d46 = fArrC5[i29];
                    double d47 = d43;
                    double d48 = 0.0d;
                    while (true) {
                        int i32 = i30 - 1;
                        if (i30 <= 0) {
                            break;
                        }
                        i31++;
                        double d49 = d47;
                        double d50 = fArrC3[i31];
                        double d51 = d50 - d49;
                        double d52 = fArrC4[i31];
                        double d53 = d44 - d52;
                        if (d53 > 0.0d && d51 < d53) {
                            d48 += d53;
                        }
                        double d54 = d50 - d52;
                        double dAbs11 = Math.abs(d50 - d46);
                        if (dAbs11 > d54) {
                            d54 = dAbs11;
                        }
                        double dAbs12 = Math.abs(d52 - d46);
                        if (dAbs12 > d54) {
                            d54 = dAbs12;
                        }
                        d45 += d54;
                        d46 = fArrC5[i31];
                        d44 = d52;
                        i30 = i32;
                        d47 = d50;
                    }
                    double d55 = d47;
                    int i33 = iArr[15] + 1;
                    while (true) {
                        int i34 = i33 - 1;
                        if (i33 == 0) {
                            break;
                        }
                        i31++;
                        double d56 = fArrC3[i31];
                        double d57 = d56 - d55;
                        double d58 = fArrC4[i31];
                        double d59 = d44 - d58;
                        d48 = (d59 <= 0.0d || d57 >= d59) ? d48 - (d48 / ((double) i)) : (d48 - (d48 / ((double) i))) + d59;
                        double d60 = d56 - d58;
                        double dAbs13 = Math.abs(d56 - d46);
                        if (dAbs13 > d60) {
                            d60 = dAbs13;
                        }
                        double dAbs14 = Math.abs(d58 - d46);
                        if (dAbs14 > d60) {
                            d60 = dAbs14;
                        }
                        d45 = (d45 - (d45 / ((double) i))) + d60;
                        d46 = fArrC5[i31];
                        i33 = i34;
                        d44 = d58;
                        d55 = d56;
                    }
                    if (-1.0E-8d >= d45 || d45 >= 1.0E-8d) {
                        dArr4[0] = (d48 / d45) * 100.0d;
                    } else {
                        dArr4[0] = 0.0d;
                    }
                    int i35 = 1;
                    while (i31 < length2) {
                        i31++;
                        int i36 = length2;
                        double d61 = fArrC3[i31];
                        double d62 = d61 - d55;
                        double d63 = fArrC4[i31];
                        double d64 = d44 - d63;
                        d48 = (d64 <= 0.0d || d62 >= d64) ? d48 - (d48 / ((double) i)) : (d48 - (d48 / ((double) i))) + d64;
                        double d65 = d61 - d63;
                        double dAbs15 = Math.abs(d61 - d46);
                        if (dAbs15 > d65) {
                            d65 = dAbs15;
                        }
                        double dAbs16 = Math.abs(d63 - d46);
                        if (dAbs16 > d65) {
                            d65 = dAbs16;
                        }
                        d45 = (d45 - (d45 / ((double) i))) + d65;
                        d46 = fArrC5[i31];
                        if (-1.0E-8d >= d45 || d45 >= 1.0E-8d) {
                            i2 = i35 + 1;
                            dArr4[i35] = (d48 / d45) * 100.0d;
                        } else {
                            i2 = i35 + 1;
                            dArr4[i35] = 0.0d;
                        }
                        i35 = i2;
                        length2 = i36;
                        d44 = d63;
                        d55 = d61;
                    }
                    c3372dV3.a = i35;
                }
            }
        }
        int iE = WE.e(list);
        if (iE < 0 || iE < 0) {
            enumC2107Tt1 = EnumC2107Tt1.g;
        } else {
            if (i8 == Integer.MIN_VALUE) {
                i8 = 14;
            } else if (i8 < 2 || i8 > 100000) {
                enumC2107Tt1 = EnumC2107Tt1.e;
            }
            int i37 = ((i8 * 2) + iArr[0]) - 1;
            int i38 = i37 > 0 ? i37 : 0;
            enumC2107Tt1 = EnumC2107Tt1.d;
            C3372dV0 c3372dV4 = this.h;
            C3372dV0 c3372dV5 = this.i;
            if (i38 > iE) {
                c3372dV4.a = 0;
                c3372dV5.a = 0;
            } else {
                c3372dV4.a = i38;
                int i39 = i38 - i37;
                double d66 = fArr[i39];
                double d67 = fArrM[i39];
                double d68 = fArrM2[i39];
                int i40 = i8 - 1;
                int i41 = i40;
                double d69 = 0.0d;
                double d70 = 0.0d;
                double d71 = 0.0d;
                while (true) {
                    int i42 = i41 - 1;
                    if (i41 <= 0) {
                        break;
                    }
                    int i43 = i39 + 1;
                    EnumC2107Tt1 enumC2107Tt2 = enumC2107Tt1;
                    double d72 = fArr[i43];
                    double d73 = d72 - d66;
                    double d74 = fArrM[i43];
                    double d75 = d67 - d74;
                    if (d75 > 0.0d && d73 < d75) {
                        d69 += d75;
                    } else if (d73 > 0.0d && d73 > d75) {
                        d70 += d73;
                    }
                    double d76 = d72 - d74;
                    double dAbs17 = Math.abs(d72 - d68);
                    if (dAbs17 > d76) {
                        d76 = dAbs17;
                    }
                    double dAbs18 = Math.abs(d74 - d68);
                    if (dAbs18 > d76) {
                        d76 = dAbs18;
                    }
                    d71 += d76;
                    d68 = fArrM2[i43];
                    d67 = d74;
                    i41 = i42;
                    d66 = d72;
                    enumC2107Tt1 = enumC2107Tt2;
                    i39 = i43;
                }
                EnumC2107Tt1 enumC2107Tt3 = enumC2107Tt1;
                int i44 = i8;
                double dAbs19 = 0.0d;
                while (true) {
                    int i45 = i44 - 1;
                    if (i44 <= 0) {
                        break;
                    }
                    int i46 = i39 + 1;
                    double d77 = fArr[i46];
                    double d78 = d77 - d66;
                    double d79 = fArrM[i46];
                    double d80 = d67 - d79;
                    double d81 = i8;
                    d69 -= d69 / d81;
                    d70 -= d70 / d81;
                    if (d80 > 0.0d && d78 < d80) {
                        d69 += d80;
                    } else if (d78 > 0.0d && d78 > d80) {
                        d70 += d78;
                    }
                    double d82 = d77 - d79;
                    double dAbs20 = Math.abs(d77 - d68);
                    if (dAbs20 > d82) {
                        d82 = dAbs20;
                    }
                    double dAbs21 = Math.abs(d79 - d68);
                    if (dAbs21 > d82) {
                        d82 = dAbs21;
                    }
                    d71 = (d71 - (d71 / d81)) + d82;
                    d68 = fArrM2[i46];
                    if (-1.0E-8d >= d71 || d71 >= 1.0E-8d) {
                        double d83 = (d69 / d71) * 100.0d;
                        double d84 = (d70 / d71) * 100.0d;
                        double d85 = d83 + d84;
                        if (-1.0E-8d >= d85 || d85 >= 1.0E-8d) {
                            dAbs19 = ((Math.abs(d83 - d84) / d85) * 100.0d) + dAbs19;
                        }
                    }
                    i39 = i46;
                    i44 = i45;
                    d66 = d77;
                    d67 = d79;
                }
                double d86 = i8;
                double dAbs22 = dAbs19 / d86;
                int i47 = iArr[0];
                while (true) {
                    i47--;
                    if (i47 <= 0) {
                        break;
                    }
                    i39++;
                    double d87 = fArr[i39];
                    double d88 = d87 - d66;
                    d66 = d87;
                    double d89 = fArrM[i39];
                    double d90 = d67 - d89;
                    d69 -= d69 / d86;
                    d70 -= d70 / d86;
                    if (d90 > 0.0d && d88 < d90) {
                        d69 += d90;
                    } else if (d88 > 0.0d && d88 > d90) {
                        d70 += d88;
                    }
                    double d91 = d66 - d89;
                    double dAbs23 = Math.abs(d66 - d68);
                    if (dAbs23 > d91) {
                        d91 = dAbs23;
                    }
                    double dAbs24 = Math.abs(d89 - d68);
                    if (dAbs24 > d91) {
                        d91 = dAbs24;
                    }
                    d71 = (d71 - (d71 / d86)) + d91;
                    d68 = fArrM2[i39];
                    if (-1.0E-8d >= d71 || d71 >= 1.0E-8d) {
                        double d92 = (d69 / d71) * 100.0d;
                        double d93 = (d70 / d71) * 100.0d;
                        double d94 = d92 + d93;
                        if (-1.0E-8d >= d94 || d94 >= 1.0E-8d) {
                            dAbs22 = ((dAbs22 * ((double) i40)) + ((Math.abs(d92 - d93) / d94) * 100.0d)) / d86;
                            d67 = d89;
                        }
                    }
                    d67 = d89;
                }
                double[] dArr5 = c6466s.a;
                dArr5[0] = dAbs22;
                int i48 = 1;
                while (i39 < iE) {
                    i39++;
                    int i49 = iE;
                    double d95 = fArr[i39];
                    double d96 = d95 - d66;
                    double d97 = fArrM[i39];
                    double d98 = d67 - d97;
                    d69 -= d69 / d86;
                    d70 -= d70 / d86;
                    if (d98 > 0.0d && d96 < d98) {
                        d69 += d98;
                    } else if (d96 > 0.0d && d96 > d98) {
                        d70 += d96;
                    }
                    double d99 = d95 - d97;
                    double dAbs25 = Math.abs(d95 - d68);
                    if (dAbs25 > d99) {
                        d99 = dAbs25;
                    }
                    double dAbs26 = Math.abs(d97 - d68);
                    if (dAbs26 > d99) {
                        d99 = dAbs26;
                    }
                    d71 = (d71 - (d71 / d86)) + d99;
                    d68 = fArrM2[i39];
                    if (-1.0E-8d >= d71 || d71 >= 1.0E-8d) {
                        double d100 = (d69 / d71) * 100.0d;
                        double d101 = (d70 / d71) * 100.0d;
                        double d102 = d100 + d101;
                        if (-1.0E-8d >= d102 || d102 >= 1.0E-8d) {
                            dAbs22 = ((dAbs22 * ((double) i40)) + ((Math.abs(d100 - d101) / d102) * 100.0d)) / d86;
                        }
                    }
                    dArr5[i48] = dAbs22;
                    iE = i49;
                    i48++;
                    d67 = d97;
                    d66 = d95;
                }
                c3372dV5.a = i48;
                enumC2107Tt1 = enumC2107Tt3;
            }
        }
        Intrinsics.checkNotNullExpressionValue(enumC2107Tt1, "adx(...)");
        return enumC2107Tt1;
    }
}

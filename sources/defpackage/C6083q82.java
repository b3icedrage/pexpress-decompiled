package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: q82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6083q82 extends AbstractC6048q0<C6990uV, C6292r82.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6083q82(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull C6292r82 ultOscillatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, ultOscillatorParamsProvider);
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(ultOscillatorParamsProvider, "ultOscillatorParamsProvider");
        this.j = core;
        CR0 cr0 = CR0.ADX;
        this.k = "uo";
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.k;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        C6292r82.a aVar = (C6292r82.a) interfaceC7722xy0;
        double dP = C1526Mj.p(((C6990uV) cVar).a);
        E10.b.b(this, "real: " + dP);
        if (dP < 50.0d) {
            return i(H32.a.CALL_UP, aVar);
        }
        return dP > 50.0d ? i(H32.a.PUT_DOWN, aVar) : k(c6257r0);
    }

    @Override // defpackage.AbstractC6048q0
    public final Map l(InterfaceC7722xy0 interfaceC7722xy0) {
        C6292r82.a indicatorParam = (C6292r82.a) interfaceC7722xy0;
        Intrinsics.checkNotNullParameter(indicatorParam, "indicatorParam");
        return PW0.g(super.l(indicatorParam), PW0.e(new Pair("timePeriod1", Integer.valueOf(indicatorParam.b)), new Pair("timePeriod2", Integer.valueOf(indicatorParam.c)), new Pair("timePeriod3", Integer.valueOf(indicatorParam.d))));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0183  */
    /* JADX WARN: Code duplicated, block: B:103:0x0198  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:123:0x0217  */
    /* JADX WARN: Code duplicated, block: B:125:0x022e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0233  */
    /* JADX WARN: Code duplicated, block: B:129:0x0248  */
    /* JADX WARN: Code duplicated, block: B:132:0x0254  */
    /* JADX WARN: Code duplicated, block: B:135:0x026e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0276  */
    /* JADX WARN: Code duplicated, block: B:142:0x0282  */
    /* JADX WARN: Code duplicated, block: B:144:0x0286  */
    /* JADX WARN: Code duplicated, block: B:147:0x0292  */
    /* JADX WARN: Code duplicated, block: B:149:0x0296  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:166:0x0306  */
    /* JADX WARN: Code duplicated, block: B:169:0x0312  */
    /* JADX WARN: Code duplicated, block: B:172:0x032a  */
    /* JADX WARN: Code duplicated, block: B:173:0x032f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0344  */
    /* JADX WARN: Code duplicated, block: B:179:0x0350  */
    /* JADX WARN: Code duplicated, block: B:192:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0108  */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x0128  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0142  */
    /* JADX WARN: Code duplicated, block: B:93:0x014e  */
    /* JADX WARN: Code duplicated, block: B:97:0x016a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0180  */
    @Override // defpackage.AbstractC6048q0
    public final Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        EnumC2107Tt1 enumC2107Tt1;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        double d;
        double d2;
        int i7;
        double d3;
        double d4;
        int i8;
        int i9;
        double d5;
        double d6;
        int i11;
        int i12;
        int i13;
        int i14;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        int i15;
        int i16;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double dAbs;
        double dAbs2;
        double d18;
        double d19;
        double d20;
        double d21;
        double d22;
        double d23;
        double d24;
        double d25;
        double d26;
        double d27;
        double d28;
        double d29;
        double dAbs3;
        double dAbs4;
        double d30;
        double d31;
        double d32;
        double d33;
        double d34;
        double dAbs5;
        double dAbs6;
        double d35;
        double d36;
        double d37;
        double d38;
        double d39;
        double dAbs7;
        double dAbs8;
        double d40;
        double d41;
        double d42;
        double d43;
        double d44;
        double dAbs9;
        double dAbs10;
        double d45;
        double d46;
        double d47;
        double d48;
        double dAbs11;
        double dAbs12;
        double d49;
        double d50;
        double d51;
        double d52;
        double d53;
        double dAbs13;
        double dAbs14;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C6292r82.a aVar = (C6292r82.a) interfaceC7722xy0;
        float[] fArrN = C0957Fb.n(list);
        Intrinsics.checkNotNullParameter(list, "<this>");
        float[] fArrM = C0957Fb.m(list);
        float[] fArrM2 = C0957Fb.m(list);
        int iE = WE.e(list);
        int i22 = aVar.b;
        double[] dArr = ((C6990uV) cVar).a;
        this.j.getClass();
        int i23 = 3;
        int[] iArr = new int[3];
        int[] iArr2 = new int[3];
        if (iE < 0 || iE < 0) {
            enumC2107Tt1 = EnumC2107Tt1.g;
        } else {
            enumC2107Tt1 = EnumC2107Tt1.e;
            if (i22 == Integer.MIN_VALUE) {
                i22 = 7;
            } else if (i22 >= 1 && i22 <= 100000) {
            }
            int i24 = aVar.c;
            if (i24 == Integer.MIN_VALUE) {
                i24 = 14;
            } else if (i24 >= 1 && i24 <= 100000) {
            }
            int i25 = aVar.d;
            if (i25 == Integer.MIN_VALUE) {
                i25 = 28;
            } else if (i25 >= 1 && i25 <= 100000) {
            }
            C3372dV0 c3372dV0 = this.h;
            int i26 = 0;
            c3372dV0.a = 0;
            C3372dV0 c3372dV1 = this.i;
            c3372dV1.a = 0;
            int[] iArr3 = {i22, i24, i25};
            iArr[0] = 0;
            iArr[1] = 0;
            int i27 = 2;
            iArr[2] = 0;
            int i28 = 0;
            while (i28 < i23) {
                int i29 = i27;
                int i30 = i26;
                int i31 = i30;
                int i32 = i31;
                while (i26 < i23) {
                    if (iArr[i26] == 0 && (i21 = iArr3[i26]) > i31) {
                        i31 = i21;
                        i32 = i26;
                    }
                    i26++;
                    i23 = 3;
                }
                iArr[i32] = 1;
                iArr2[i28] = i31;
                i28++;
                i26 = i30;
                i27 = i29;
                i23 = 3;
            }
            int i33 = i27;
            int i34 = i26;
            int i35 = iArr2[i33];
            int i36 = iArr2[1];
            int i37 = iArr2[i34];
            if (i35 == Integer.MIN_VALUE) {
                i = 1;
                i2 = 100000;
                i3 = 7;
            } else {
                i = 1;
                if (i35 >= 1) {
                    i2 = 100000;
                    if (i35 <= 100000) {
                        i3 = i35;
                    }
                    if (i4 <= 0) {
                        i4 = i34;
                    }
                    EnumC2107Tt1 enumC2107Tt2 = EnumC2107Tt1.d;
                    if (i4 <= iE) {
                        i5 = (i4 - i35) + 1;
                        i6 = i5;
                        d = 0.0d;
                        d2 = 0.0d;
                        while (i6 < i4) {
                            d49 = fArrM[i6];
                            int i38 = i5;
                            double d54 = fArrN[i6];
                            d50 = fArrM2[i6 - 1];
                            if (d49 < d50) {
                                d52 = d50;
                                d51 = d49;
                            } else {
                                d51 = d50;
                                d52 = d51;
                            }
                            double d55 = ((double) fArrM2[i6]) - d51;
                            d53 = d54 - d49;
                            dAbs13 = Math.abs(d52 - d54);
                            if (dAbs13 > d53) {
                                d53 = dAbs13;
                            }
                            dAbs14 = Math.abs(d52 - d49);
                            if (dAbs14 > d53) {
                                d53 = dAbs14;
                            }
                            d += d55;
                            d2 += d53;
                            i6++;
                            i5 = i38;
                        }
                        int i39 = i5;
                        i7 = (i4 - i36) + 1;
                        d3 = 0.0d;
                        d4 = 0.0d;
                        i8 = i7;
                        while (i8 < i4) {
                            int i40 = i7;
                            int i41 = i8;
                            d45 = fArrM[i8];
                            double d56 = fArrN[i41];
                            d46 = fArrM2[i41 - 1];
                            if (d45 < d46) {
                                d47 = d45;
                            } else {
                                d47 = d46;
                            }
                            double d57 = ((double) fArrM2[i41]) - d47;
                            d48 = d56 - d45;
                            dAbs11 = Math.abs(d46 - d56);
                            if (dAbs11 > d48) {
                                d48 = dAbs11;
                            }
                            dAbs12 = Math.abs(d46 - d45);
                            if (dAbs12 > d48) {
                                d48 = dAbs12;
                            }
                            d3 += d57;
                            d4 += d48;
                            i8 = i41 + 1;
                            i7 = i40;
                        }
                        int i42 = i7;
                        i9 = (i4 - i37) + 1;
                        d5 = 0.0d;
                        d6 = 0.0d;
                        i11 = i9;
                        while (i11 < i4) {
                            int i43 = i9;
                            int i44 = i11;
                            d40 = fArrM[i11];
                            double d58 = fArrN[i44];
                            d41 = fArrM2[i44 - 1];
                            if (d40 < d41) {
                                d43 = d41;
                                d42 = d40;
                            } else {
                                d42 = d41;
                                d43 = d42;
                            }
                            double d59 = ((double) fArrM2[i44]) - d42;
                            d44 = d58 - d40;
                            dAbs9 = Math.abs(d43 - d58);
                            if (dAbs9 > d44) {
                                d44 = dAbs9;
                            }
                            dAbs10 = Math.abs(d43 - d40);
                            if (dAbs10 > d44) {
                                d44 = dAbs10;
                            }
                            d5 += d59;
                            d6 += d44;
                            i11 = i44 + 1;
                            i9 = i43;
                        }
                        i12 = i9;
                        i13 = i4;
                        i14 = i42;
                        d7 = d6;
                        d8 = d4;
                        d9 = d2;
                        d10 = d;
                        d11 = d3;
                        d12 = d5;
                        i15 = i34;
                        i16 = i39;
                        while (i13 <= iE) {
                            int i45 = i13;
                            int i46 = i12;
                            d13 = fArrM[i45];
                            double d60 = fArrN[i45];
                            d14 = fArrM2[i45 - 1];
                            if (d13 < d14) {
                                d16 = d14;
                                d15 = d13;
                            } else {
                                d15 = d14;
                                d16 = d15;
                            }
                            double d61 = ((double) fArrM2[i45]) - d15;
                            d17 = d60 - d13;
                            dAbs = Math.abs(d16 - d60);
                            if (dAbs > d17) {
                                d17 = dAbs;
                            }
                            dAbs2 = Math.abs(d16 - d13);
                            if (dAbs2 > d17) {
                                d17 = dAbs2;
                            }
                            d18 = d10 + d61;
                            d19 = d11 + d61;
                            d20 = d12 + d61;
                            d21 = d9 + d17;
                            d22 = d8 + d17;
                            d23 = d7 + d17;
                            if (-1.0E-8d < d21 || d21 >= 1.0E-8d) {
                                d24 = ((d18 / d21) * 4.0d) + 0.0d;
                            } else {
                                d24 = 0.0d;
                            }
                            if (-1.0E-8d < d22 || d22 >= 1.0E-8d) {
                                d24 = ((d19 / d22) * 2.0d) + d24;
                            }
                            if (-1.0E-8d < d23 || d23 >= 1.0E-8d) {
                                d24 = (d20 / d23) + d24;
                            }
                            d25 = fArrM[i16];
                            double d62 = fArrN[i16];
                            d26 = fArrM2[i16 - 1];
                            if (d25 < d26) {
                                d28 = d26;
                                d27 = d25;
                            } else {
                                d27 = d26;
                                d28 = d27;
                            }
                            double d63 = ((double) fArrM2[i16]) - d27;
                            d29 = d62 - d25;
                            dAbs3 = Math.abs(d28 - d62);
                            if (dAbs3 > d29) {
                                d29 = dAbs3;
                            }
                            dAbs4 = Math.abs(d28 - d25);
                            if (dAbs4 > d29) {
                                d29 = dAbs4;
                            }
                            d10 = d18 - d63;
                            d9 = d21 - d29;
                            d30 = fArrM[i14];
                            double d64 = fArrN[i14];
                            d31 = fArrM2[i14 - 1];
                            if (d30 < d31) {
                                d33 = d31;
                                d32 = d30;
                            } else {
                                d32 = d31;
                                d33 = d32;
                            }
                            double d65 = ((double) fArrM2[i14]) - d32;
                            d34 = d64 - d30;
                            dAbs5 = Math.abs(d33 - d64);
                            if (dAbs5 > d34) {
                                d34 = dAbs5;
                            }
                            dAbs6 = Math.abs(d33 - d30);
                            if (dAbs6 > d34) {
                                d34 = dAbs6;
                            }
                            d11 = d19 - d65;
                            d8 = d22 - d34;
                            d35 = fArrM[i46];
                            double d66 = fArrN[i46];
                            d36 = fArrM2[i46 - 1];
                            if (d35 < d36) {
                                d38 = d36;
                                d37 = d35;
                            } else {
                                d37 = d36;
                                d38 = d37;
                            }
                            double d67 = ((double) fArrM2[i46]) - d37;
                            d39 = d66 - d35;
                            dAbs7 = Math.abs(d38 - d66);
                            if (dAbs7 > d39) {
                                d39 = dAbs7;
                            }
                            dAbs8 = Math.abs(d38 - d35);
                            if (dAbs8 > d39) {
                                d39 = dAbs8;
                            }
                            d12 = d20 - d67;
                            d7 = d23 - d39;
                            dArr[i15] = (d24 / 7.0d) * 100.0d;
                            i15++;
                            i13 = i45 + 1;
                            i16++;
                            i14++;
                            i12 = i46 + 1;
                        }
                        c3372dV1.a = i15;
                        c3372dV0.a = i4;
                    }
                    enumC2107Tt1 = enumC2107Tt2;
                }
                i4 = -1;
                if (i4 <= 0) {
                    i4 = i34;
                }
                EnumC2107Tt1 enumC2107Tt3 = EnumC2107Tt1.d;
                if (i4 <= iE) {
                    i5 = (i4 - i35) + 1;
                    i6 = i5;
                    d = 0.0d;
                    d2 = 0.0d;
                    while (i6 < i4) {
                        d49 = fArrM[i6];
                        int i310 = i5;
                        double d510 = fArrN[i6];
                        d50 = fArrM2[i6 - 1];
                        if (d49 < d50) {
                            d52 = d50;
                            d51 = d49;
                        } else {
                            d51 = d50;
                            d52 = d51;
                        }
                        double d511 = ((double) fArrM2[i6]) - d51;
                        d53 = d510 - d49;
                        dAbs13 = Math.abs(d52 - d510);
                        if (dAbs13 > d53) {
                            d53 = dAbs13;
                        }
                        dAbs14 = Math.abs(d52 - d49);
                        if (dAbs14 > d53) {
                            d53 = dAbs14;
                        }
                        d += d511;
                        d2 += d53;
                        i6++;
                        i5 = i310;
                    }
                    int i311 = i5;
                    i7 = (i4 - i36) + 1;
                    d3 = 0.0d;
                    d4 = 0.0d;
                    i8 = i7;
                    while (i8 < i4) {
                        int i47 = i7;
                        int i48 = i8;
                        d45 = fArrM[i8];
                        double d512 = fArrN[i48];
                        d46 = fArrM2[i48 - 1];
                        if (d45 < d46) {
                            d47 = d45;
                        } else {
                            d47 = d46;
                        }
                        double d513 = ((double) fArrM2[i48]) - d47;
                        d48 = d512 - d45;
                        dAbs11 = Math.abs(d46 - d512);
                        if (dAbs11 > d48) {
                            d48 = dAbs11;
                        }
                        dAbs12 = Math.abs(d46 - d45);
                        if (dAbs12 > d48) {
                            d48 = dAbs12;
                        }
                        d3 += d513;
                        d4 += d48;
                        i8 = i48 + 1;
                        i7 = i47;
                    }
                    int i49 = i7;
                    i9 = (i4 - i37) + 1;
                    d5 = 0.0d;
                    d6 = 0.0d;
                    i11 = i9;
                    while (i11 < i4) {
                        int i410 = i9;
                        int i411 = i11;
                        d40 = fArrM[i11];
                        double d514 = fArrN[i411];
                        d41 = fArrM2[i411 - 1];
                        if (d40 < d41) {
                            d43 = d41;
                            d42 = d40;
                        } else {
                            d42 = d41;
                            d43 = d42;
                        }
                        double d515 = ((double) fArrM2[i411]) - d42;
                        d44 = d514 - d40;
                        dAbs9 = Math.abs(d43 - d514);
                        if (dAbs9 > d44) {
                            d44 = dAbs9;
                        }
                        dAbs10 = Math.abs(d43 - d40);
                        if (dAbs10 > d44) {
                            d44 = dAbs10;
                        }
                        d5 += d515;
                        d6 += d44;
                        i11 = i411 + 1;
                        i9 = i410;
                    }
                    i12 = i9;
                    i13 = i4;
                    i14 = i49;
                    d7 = d6;
                    d8 = d4;
                    d9 = d2;
                    d10 = d;
                    d11 = d3;
                    d12 = d5;
                    i15 = i34;
                    i16 = i311;
                    while (i13 <= iE) {
                        int i412 = i13;
                        int i413 = i12;
                        d13 = fArrM[i412];
                        double d68 = fArrN[i412];
                        d14 = fArrM2[i412 - 1];
                        if (d13 < d14) {
                            d16 = d14;
                            d15 = d13;
                        } else {
                            d15 = d14;
                            d16 = d15;
                        }
                        double d69 = ((double) fArrM2[i412]) - d15;
                        d17 = d68 - d13;
                        dAbs = Math.abs(d16 - d68);
                        if (dAbs > d17) {
                            d17 = dAbs;
                        }
                        dAbs2 = Math.abs(d16 - d13);
                        if (dAbs2 > d17) {
                            d17 = dAbs2;
                        }
                        d18 = d10 + d69;
                        d19 = d11 + d69;
                        d20 = d12 + d69;
                        d21 = d9 + d17;
                        d22 = d8 + d17;
                        d23 = d7 + d17;
                        if (-1.0E-8d < d21) {
                            d24 = ((d18 / d21) * 4.0d) + 0.0d;
                        } else {
                            d24 = ((d18 / d21) * 4.0d) + 0.0d;
                        }
                        if (-1.0E-8d < d22) {
                            d24 = ((d19 / d22) * 2.0d) + d24;
                        } else {
                            d24 = ((d19 / d22) * 2.0d) + d24;
                        }
                        if (-1.0E-8d < d23) {
                            d24 = (d20 / d23) + d24;
                        } else {
                            d24 = (d20 / d23) + d24;
                        }
                        d25 = fArrM[i16];
                        double d610 = fArrN[i16];
                        d26 = fArrM2[i16 - 1];
                        if (d25 < d26) {
                            d28 = d26;
                            d27 = d25;
                        } else {
                            d27 = d26;
                            d28 = d27;
                        }
                        double d611 = ((double) fArrM2[i16]) - d27;
                        d29 = d610 - d25;
                        dAbs3 = Math.abs(d28 - d610);
                        if (dAbs3 > d29) {
                            d29 = dAbs3;
                        }
                        dAbs4 = Math.abs(d28 - d25);
                        if (dAbs4 > d29) {
                            d29 = dAbs4;
                        }
                        d10 = d18 - d611;
                        d9 = d21 - d29;
                        d30 = fArrM[i14];
                        double d612 = fArrN[i14];
                        d31 = fArrM2[i14 - 1];
                        if (d30 < d31) {
                            d33 = d31;
                            d32 = d30;
                        } else {
                            d32 = d31;
                            d33 = d32;
                        }
                        double d613 = ((double) fArrM2[i14]) - d32;
                        d34 = d612 - d30;
                        dAbs5 = Math.abs(d33 - d612);
                        if (dAbs5 > d34) {
                            d34 = dAbs5;
                        }
                        dAbs6 = Math.abs(d33 - d30);
                        if (dAbs6 > d34) {
                            d34 = dAbs6;
                        }
                        d11 = d19 - d613;
                        d8 = d22 - d34;
                        d35 = fArrM[i413];
                        double d614 = fArrN[i413];
                        d36 = fArrM2[i413 - 1];
                        if (d35 < d36) {
                            d38 = d36;
                            d37 = d35;
                        } else {
                            d37 = d36;
                            d38 = d37;
                        }
                        double d615 = ((double) fArrM2[i413]) - d37;
                        d39 = d614 - d35;
                        dAbs7 = Math.abs(d38 - d614);
                        if (dAbs7 > d39) {
                            d39 = dAbs7;
                        }
                        dAbs8 = Math.abs(d38 - d35);
                        if (dAbs8 > d39) {
                            d39 = dAbs8;
                        }
                        d12 = d20 - d615;
                        d7 = d23 - d39;
                        dArr[i15] = (d24 / 7.0d) * 100.0d;
                        i15++;
                        i13 = i412 + 1;
                        i16++;
                        i14++;
                        i12 = i413 + 1;
                    }
                    c3372dV1.a = i15;
                    c3372dV0.a = i4;
                }
                enumC2107Tt1 = enumC2107Tt3;
            }
            if (i36 == Integer.MIN_VALUE) {
                i17 = 14;
            } else {
                if (i36 < i || i36 > i2) {
                    i4 = -1;
                } else {
                    i17 = i36;
                }
                if (i4 <= 0) {
                    i4 = i34;
                }
                EnumC2107Tt1 enumC2107Tt4 = EnumC2107Tt1.d;
                if (i4 <= iE) {
                    i5 = (i4 - i35) + 1;
                    i6 = i5;
                    d = 0.0d;
                    d2 = 0.0d;
                    while (i6 < i4) {
                        d49 = fArrM[i6];
                        int i312 = i5;
                        double d516 = fArrN[i6];
                        d50 = fArrM2[i6 - 1];
                        if (d49 < d50) {
                            d52 = d50;
                            d51 = d49;
                        } else {
                            d51 = d50;
                            d52 = d51;
                        }
                        double d517 = ((double) fArrM2[i6]) - d51;
                        d53 = d516 - d49;
                        dAbs13 = Math.abs(d52 - d516);
                        if (dAbs13 > d53) {
                            d53 = dAbs13;
                        }
                        dAbs14 = Math.abs(d52 - d49);
                        if (dAbs14 > d53) {
                            d53 = dAbs14;
                        }
                        d += d517;
                        d2 += d53;
                        i6++;
                        i5 = i312;
                    }
                    int i313 = i5;
                    i7 = (i4 - i36) + 1;
                    d3 = 0.0d;
                    d4 = 0.0d;
                    i8 = i7;
                    while (i8 < i4) {
                        int i414 = i7;
                        int i415 = i8;
                        d45 = fArrM[i8];
                        double d518 = fArrN[i415];
                        d46 = fArrM2[i415 - 1];
                        if (d45 < d46) {
                            d47 = d45;
                        } else {
                            d47 = d46;
                        }
                        double d519 = ((double) fArrM2[i415]) - d47;
                        d48 = d518 - d45;
                        dAbs11 = Math.abs(d46 - d518);
                        if (dAbs11 > d48) {
                            d48 = dAbs11;
                        }
                        dAbs12 = Math.abs(d46 - d45);
                        if (dAbs12 > d48) {
                            d48 = dAbs12;
                        }
                        d3 += d519;
                        d4 += d48;
                        i8 = i415 + 1;
                        i7 = i414;
                    }
                    int i416 = i7;
                    i9 = (i4 - i37) + 1;
                    d5 = 0.0d;
                    d6 = 0.0d;
                    i11 = i9;
                    while (i11 < i4) {
                        int i417 = i9;
                        int i418 = i11;
                        d40 = fArrM[i11];
                        double d5110 = fArrN[i418];
                        d41 = fArrM2[i418 - 1];
                        if (d40 < d41) {
                            d43 = d41;
                            d42 = d40;
                        } else {
                            d42 = d41;
                            d43 = d42;
                        }
                        double d5111 = ((double) fArrM2[i418]) - d42;
                        d44 = d5110 - d40;
                        dAbs9 = Math.abs(d43 - d5110);
                        if (dAbs9 > d44) {
                            d44 = dAbs9;
                        }
                        dAbs10 = Math.abs(d43 - d40);
                        if (dAbs10 > d44) {
                            d44 = dAbs10;
                        }
                        d5 += d5111;
                        d6 += d44;
                        i11 = i418 + 1;
                        i9 = i417;
                    }
                    i12 = i9;
                    i13 = i4;
                    i14 = i416;
                    d7 = d6;
                    d8 = d4;
                    d9 = d2;
                    d10 = d;
                    d11 = d3;
                    d12 = d5;
                    i15 = i34;
                    i16 = i313;
                    while (i13 <= iE) {
                        int i419 = i13;
                        int i4110 = i12;
                        d13 = fArrM[i419];
                        double d616 = fArrN[i419];
                        d14 = fArrM2[i419 - 1];
                        if (d13 < d14) {
                            d16 = d14;
                            d15 = d13;
                        } else {
                            d15 = d14;
                            d16 = d15;
                        }
                        double d617 = ((double) fArrM2[i419]) - d15;
                        d17 = d616 - d13;
                        dAbs = Math.abs(d16 - d616);
                        if (dAbs > d17) {
                            d17 = dAbs;
                        }
                        dAbs2 = Math.abs(d16 - d13);
                        if (dAbs2 > d17) {
                            d17 = dAbs2;
                        }
                        d18 = d10 + d617;
                        d19 = d11 + d617;
                        d20 = d12 + d617;
                        d21 = d9 + d17;
                        d22 = d8 + d17;
                        d23 = d7 + d17;
                        if (-1.0E-8d < d21) {
                            d24 = ((d18 / d21) * 4.0d) + 0.0d;
                        } else {
                            d24 = ((d18 / d21) * 4.0d) + 0.0d;
                        }
                        if (-1.0E-8d < d22) {
                            d24 = ((d19 / d22) * 2.0d) + d24;
                        } else {
                            d24 = ((d19 / d22) * 2.0d) + d24;
                        }
                        if (-1.0E-8d < d23) {
                            d24 = (d20 / d23) + d24;
                        } else {
                            d24 = (d20 / d23) + d24;
                        }
                        d25 = fArrM[i16];
                        double d618 = fArrN[i16];
                        d26 = fArrM2[i16 - 1];
                        if (d25 < d26) {
                            d28 = d26;
                            d27 = d25;
                        } else {
                            d27 = d26;
                            d28 = d27;
                        }
                        double d619 = ((double) fArrM2[i16]) - d27;
                        d29 = d618 - d25;
                        dAbs3 = Math.abs(d28 - d618);
                        if (dAbs3 > d29) {
                            d29 = dAbs3;
                        }
                        dAbs4 = Math.abs(d28 - d25);
                        if (dAbs4 > d29) {
                            d29 = dAbs4;
                        }
                        d10 = d18 - d619;
                        d9 = d21 - d29;
                        d30 = fArrM[i14];
                        double d6110 = fArrN[i14];
                        d31 = fArrM2[i14 - 1];
                        if (d30 < d31) {
                            d33 = d31;
                            d32 = d30;
                        } else {
                            d32 = d31;
                            d33 = d32;
                        }
                        double d6111 = ((double) fArrM2[i14]) - d32;
                        d34 = d6110 - d30;
                        dAbs5 = Math.abs(d33 - d6110);
                        if (dAbs5 > d34) {
                            d34 = dAbs5;
                        }
                        dAbs6 = Math.abs(d33 - d30);
                        if (dAbs6 > d34) {
                            d34 = dAbs6;
                        }
                        d11 = d19 - d6111;
                        d8 = d22 - d34;
                        d35 = fArrM[i4110];
                        double d6112 = fArrN[i4110];
                        d36 = fArrM2[i4110 - 1];
                        if (d35 < d36) {
                            d38 = d36;
                            d37 = d35;
                        } else {
                            d37 = d36;
                            d38 = d37;
                        }
                        double d6113 = ((double) fArrM2[i4110]) - d37;
                        d39 = d6112 - d35;
                        dAbs7 = Math.abs(d38 - d6112);
                        if (dAbs7 > d39) {
                            d39 = dAbs7;
                        }
                        dAbs8 = Math.abs(d38 - d35);
                        if (dAbs8 > d39) {
                            d39 = dAbs8;
                        }
                        d12 = d20 - d6113;
                        d7 = d23 - d39;
                        dArr[i15] = (d24 / 7.0d) * 100.0d;
                        i15++;
                        i13 = i419 + 1;
                        i16++;
                        i14++;
                        i12 = i4110 + 1;
                    }
                    c3372dV1.a = i15;
                    c3372dV0.a = i4;
                }
                enumC2107Tt1 = enumC2107Tt4;
            }
            if (i37 == Integer.MIN_VALUE) {
                i18 = 28;
            } else {
                if (i37 < i || i37 > i2) {
                    i4 = -1;
                } else {
                    i18 = i37;
                }
                if (i4 <= 0) {
                    i4 = i34;
                }
                EnumC2107Tt1 enumC2107Tt5 = EnumC2107Tt1.d;
                if (i4 <= iE) {
                    i5 = (i4 - i35) + 1;
                    i6 = i5;
                    d = 0.0d;
                    d2 = 0.0d;
                    while (i6 < i4) {
                        d49 = fArrM[i6];
                        int i314 = i5;
                        double d5112 = fArrN[i6];
                        d50 = fArrM2[i6 - 1];
                        if (d49 < d50) {
                            d52 = d50;
                            d51 = d49;
                        } else {
                            d51 = d50;
                            d52 = d51;
                        }
                        double d5113 = ((double) fArrM2[i6]) - d51;
                        d53 = d5112 - d49;
                        dAbs13 = Math.abs(d52 - d5112);
                        if (dAbs13 > d53) {
                            d53 = dAbs13;
                        }
                        dAbs14 = Math.abs(d52 - d49);
                        if (dAbs14 > d53) {
                            d53 = dAbs14;
                        }
                        d += d5113;
                        d2 += d53;
                        i6++;
                        i5 = i314;
                    }
                    int i315 = i5;
                    i7 = (i4 - i36) + 1;
                    d3 = 0.0d;
                    d4 = 0.0d;
                    i8 = i7;
                    while (i8 < i4) {
                        int i4111 = i7;
                        int i4112 = i8;
                        d45 = fArrM[i8];
                        double d5114 = fArrN[i4112];
                        d46 = fArrM2[i4112 - 1];
                        if (d45 < d46) {
                            d47 = d45;
                        } else {
                            d47 = d46;
                        }
                        double d5115 = ((double) fArrM2[i4112]) - d47;
                        d48 = d5114 - d45;
                        dAbs11 = Math.abs(d46 - d5114);
                        if (dAbs11 > d48) {
                            d48 = dAbs11;
                        }
                        dAbs12 = Math.abs(d46 - d45);
                        if (dAbs12 > d48) {
                            d48 = dAbs12;
                        }
                        d3 += d5115;
                        d4 += d48;
                        i8 = i4112 + 1;
                        i7 = i4111;
                    }
                    int i4113 = i7;
                    i9 = (i4 - i37) + 1;
                    d5 = 0.0d;
                    d6 = 0.0d;
                    i11 = i9;
                    while (i11 < i4) {
                        int i4114 = i9;
                        int i4115 = i11;
                        d40 = fArrM[i11];
                        double d5116 = fArrN[i4115];
                        d41 = fArrM2[i4115 - 1];
                        if (d40 < d41) {
                            d43 = d41;
                            d42 = d40;
                        } else {
                            d42 = d41;
                            d43 = d42;
                        }
                        double d5117 = ((double) fArrM2[i4115]) - d42;
                        d44 = d5116 - d40;
                        dAbs9 = Math.abs(d43 - d5116);
                        if (dAbs9 > d44) {
                            d44 = dAbs9;
                        }
                        dAbs10 = Math.abs(d43 - d40);
                        if (dAbs10 > d44) {
                            d44 = dAbs10;
                        }
                        d5 += d5117;
                        d6 += d44;
                        i11 = i4115 + 1;
                        i9 = i4114;
                    }
                    i12 = i9;
                    i13 = i4;
                    i14 = i4113;
                    d7 = d6;
                    d8 = d4;
                    d9 = d2;
                    d10 = d;
                    d11 = d3;
                    d12 = d5;
                    i15 = i34;
                    i16 = i315;
                    while (i13 <= iE) {
                        int i4116 = i13;
                        int i4117 = i12;
                        d13 = fArrM[i4116];
                        double d6114 = fArrN[i4116];
                        d14 = fArrM2[i4116 - 1];
                        if (d13 < d14) {
                            d16 = d14;
                            d15 = d13;
                        } else {
                            d15 = d14;
                            d16 = d15;
                        }
                        double d6115 = ((double) fArrM2[i4116]) - d15;
                        d17 = d6114 - d13;
                        dAbs = Math.abs(d16 - d6114);
                        if (dAbs > d17) {
                            d17 = dAbs;
                        }
                        dAbs2 = Math.abs(d16 - d13);
                        if (dAbs2 > d17) {
                            d17 = dAbs2;
                        }
                        d18 = d10 + d6115;
                        d19 = d11 + d6115;
                        d20 = d12 + d6115;
                        d21 = d9 + d17;
                        d22 = d8 + d17;
                        d23 = d7 + d17;
                        if (-1.0E-8d < d21) {
                            d24 = ((d18 / d21) * 4.0d) + 0.0d;
                        } else {
                            d24 = ((d18 / d21) * 4.0d) + 0.0d;
                        }
                        if (-1.0E-8d < d22) {
                            d24 = ((d19 / d22) * 2.0d) + d24;
                        } else {
                            d24 = ((d19 / d22) * 2.0d) + d24;
                        }
                        if (-1.0E-8d < d23) {
                            d24 = (d20 / d23) + d24;
                        } else {
                            d24 = (d20 / d23) + d24;
                        }
                        d25 = fArrM[i16];
                        double d6116 = fArrN[i16];
                        d26 = fArrM2[i16 - 1];
                        if (d25 < d26) {
                            d28 = d26;
                            d27 = d25;
                        } else {
                            d27 = d26;
                            d28 = d27;
                        }
                        double d6117 = ((double) fArrM2[i16]) - d27;
                        d29 = d6116 - d25;
                        dAbs3 = Math.abs(d28 - d6116);
                        if (dAbs3 > d29) {
                            d29 = dAbs3;
                        }
                        dAbs4 = Math.abs(d28 - d25);
                        if (dAbs4 > d29) {
                            d29 = dAbs4;
                        }
                        d10 = d18 - d6117;
                        d9 = d21 - d29;
                        d30 = fArrM[i14];
                        double d6118 = fArrN[i14];
                        d31 = fArrM2[i14 - 1];
                        if (d30 < d31) {
                            d33 = d31;
                            d32 = d30;
                        } else {
                            d32 = d31;
                            d33 = d32;
                        }
                        double d6119 = ((double) fArrM2[i14]) - d32;
                        d34 = d6118 - d30;
                        dAbs5 = Math.abs(d33 - d6118);
                        if (dAbs5 > d34) {
                            d34 = dAbs5;
                        }
                        dAbs6 = Math.abs(d33 - d30);
                        if (dAbs6 > d34) {
                            d34 = dAbs6;
                        }
                        d11 = d19 - d6119;
                        d8 = d22 - d34;
                        d35 = fArrM[i4117];
                        double d61110 = fArrN[i4117];
                        d36 = fArrM2[i4117 - 1];
                        if (d35 < d36) {
                            d38 = d36;
                            d37 = d35;
                        } else {
                            d37 = d36;
                            d38 = d37;
                        }
                        double d61111 = ((double) fArrM2[i4117]) - d37;
                        d39 = d61110 - d35;
                        dAbs7 = Math.abs(d38 - d61110);
                        if (dAbs7 > d39) {
                            d39 = dAbs7;
                        }
                        dAbs8 = Math.abs(d38 - d35);
                        if (dAbs8 > d39) {
                            d39 = dAbs8;
                        }
                        d12 = d20 - d61111;
                        d7 = d23 - d39;
                        dArr[i15] = (d24 / 7.0d) * 100.0d;
                        i15++;
                        i13 = i4116 + 1;
                        i16++;
                        i14++;
                        i12 = i4117 + 1;
                    }
                    c3372dV1.a = i15;
                    c3372dV0.a = i4;
                }
                enumC2107Tt1 = enumC2107Tt5;
            }
            if ((i3 > i17 ? i3 : i17) <= i18) {
                i3 = i18;
            } else if (i3 <= i17) {
                i3 = i17;
            }
            if (i3 == Integer.MIN_VALUE) {
                i3 = 30;
            } else {
                if (i3 < i33 || i3 > 100000) {
                    i19 = 1;
                    i20 = -1;
                }
                i4 = i20 + i19;
                if (i4 <= 0) {
                    i4 = i34;
                }
                EnumC2107Tt1 enumC2107Tt6 = EnumC2107Tt1.d;
                if (i4 <= iE) {
                    i5 = (i4 - i35) + 1;
                    i6 = i5;
                    d = 0.0d;
                    d2 = 0.0d;
                    while (i6 < i4) {
                        d49 = fArrM[i6];
                        int i316 = i5;
                        double d5118 = fArrN[i6];
                        d50 = fArrM2[i6 - 1];
                        if (d49 < d50) {
                            d52 = d50;
                            d51 = d49;
                        } else {
                            d51 = d50;
                            d52 = d51;
                        }
                        double d5119 = ((double) fArrM2[i6]) - d51;
                        d53 = d5118 - d49;
                        dAbs13 = Math.abs(d52 - d5118);
                        if (dAbs13 > d53) {
                            d53 = dAbs13;
                        }
                        dAbs14 = Math.abs(d52 - d49);
                        if (dAbs14 > d53) {
                            d53 = dAbs14;
                        }
                        d += d5119;
                        d2 += d53;
                        i6++;
                        i5 = i316;
                    }
                    int i317 = i5;
                    i7 = (i4 - i36) + 1;
                    d3 = 0.0d;
                    d4 = 0.0d;
                    i8 = i7;
                    while (i8 < i4) {
                        int i4118 = i7;
                        int i4119 = i8;
                        d45 = fArrM[i8];
                        double d51110 = fArrN[i4119];
                        d46 = fArrM2[i4119 - 1];
                        if (d45 < d46) {
                            d47 = d45;
                        } else {
                            d47 = d46;
                        }
                        double d51111 = ((double) fArrM2[i4119]) - d47;
                        d48 = d51110 - d45;
                        dAbs11 = Math.abs(d46 - d51110);
                        if (dAbs11 > d48) {
                            d48 = dAbs11;
                        }
                        dAbs12 = Math.abs(d46 - d45);
                        if (dAbs12 > d48) {
                            d48 = dAbs12;
                        }
                        d3 += d51111;
                        d4 += d48;
                        i8 = i4119 + 1;
                        i7 = i4118;
                    }
                    int i41110 = i7;
                    i9 = (i4 - i37) + 1;
                    d5 = 0.0d;
                    d6 = 0.0d;
                    i11 = i9;
                    while (i11 < i4) {
                        int i41111 = i9;
                        int i41112 = i11;
                        d40 = fArrM[i11];
                        double d51112 = fArrN[i41112];
                        d41 = fArrM2[i41112 - 1];
                        if (d40 < d41) {
                            d43 = d41;
                            d42 = d40;
                        } else {
                            d42 = d41;
                            d43 = d42;
                        }
                        double d51113 = ((double) fArrM2[i41112]) - d42;
                        d44 = d51112 - d40;
                        dAbs9 = Math.abs(d43 - d51112);
                        if (dAbs9 > d44) {
                            d44 = dAbs9;
                        }
                        dAbs10 = Math.abs(d43 - d40);
                        if (dAbs10 > d44) {
                            d44 = dAbs10;
                        }
                        d5 += d51113;
                        d6 += d44;
                        i11 = i41112 + 1;
                        i9 = i41111;
                    }
                    i12 = i9;
                    i13 = i4;
                    i14 = i41110;
                    d7 = d6;
                    d8 = d4;
                    d9 = d2;
                    d10 = d;
                    d11 = d3;
                    d12 = d5;
                    i15 = i34;
                    i16 = i317;
                    while (i13 <= iE) {
                        int i41113 = i13;
                        int i41114 = i12;
                        d13 = fArrM[i41113];
                        double d61112 = fArrN[i41113];
                        d14 = fArrM2[i41113 - 1];
                        if (d13 < d14) {
                            d16 = d14;
                            d15 = d13;
                        } else {
                            d15 = d14;
                            d16 = d15;
                        }
                        double d61113 = ((double) fArrM2[i41113]) - d15;
                        d17 = d61112 - d13;
                        dAbs = Math.abs(d16 - d61112);
                        if (dAbs > d17) {
                            d17 = dAbs;
                        }
                        dAbs2 = Math.abs(d16 - d13);
                        if (dAbs2 > d17) {
                            d17 = dAbs2;
                        }
                        d18 = d10 + d61113;
                        d19 = d11 + d61113;
                        d20 = d12 + d61113;
                        d21 = d9 + d17;
                        d22 = d8 + d17;
                        d23 = d7 + d17;
                        if (-1.0E-8d < d21) {
                            d24 = ((d18 / d21) * 4.0d) + 0.0d;
                        } else {
                            d24 = ((d18 / d21) * 4.0d) + 0.0d;
                        }
                        if (-1.0E-8d < d22) {
                            d24 = ((d19 / d22) * 2.0d) + d24;
                        } else {
                            d24 = ((d19 / d22) * 2.0d) + d24;
                        }
                        if (-1.0E-8d < d23) {
                            d24 = (d20 / d23) + d24;
                        } else {
                            d24 = (d20 / d23) + d24;
                        }
                        d25 = fArrM[i16];
                        double d61114 = fArrN[i16];
                        d26 = fArrM2[i16 - 1];
                        if (d25 < d26) {
                            d28 = d26;
                            d27 = d25;
                        } else {
                            d27 = d26;
                            d28 = d27;
                        }
                        double d61115 = ((double) fArrM2[i16]) - d27;
                        d29 = d61114 - d25;
                        dAbs3 = Math.abs(d28 - d61114);
                        if (dAbs3 > d29) {
                            d29 = dAbs3;
                        }
                        dAbs4 = Math.abs(d28 - d25);
                        if (dAbs4 > d29) {
                            d29 = dAbs4;
                        }
                        d10 = d18 - d61115;
                        d9 = d21 - d29;
                        d30 = fArrM[i14];
                        double d61116 = fArrN[i14];
                        d31 = fArrM2[i14 - 1];
                        if (d30 < d31) {
                            d33 = d31;
                            d32 = d30;
                        } else {
                            d32 = d31;
                            d33 = d32;
                        }
                        double d61117 = ((double) fArrM2[i14]) - d32;
                        d34 = d61116 - d30;
                        dAbs5 = Math.abs(d33 - d61116);
                        if (dAbs5 > d34) {
                            d34 = dAbs5;
                        }
                        dAbs6 = Math.abs(d33 - d30);
                        if (dAbs6 > d34) {
                            d34 = dAbs6;
                        }
                        d11 = d19 - d61117;
                        d8 = d22 - d34;
                        d35 = fArrM[i41114];
                        double d61118 = fArrN[i41114];
                        d36 = fArrM2[i41114 - 1];
                        if (d35 < d36) {
                            d38 = d36;
                            d37 = d35;
                        } else {
                            d37 = d36;
                            d38 = d37;
                        }
                        double d61119 = ((double) fArrM2[i41114]) - d37;
                        d39 = d61118 - d35;
                        dAbs7 = Math.abs(d38 - d61118);
                        if (dAbs7 > d39) {
                            d39 = dAbs7;
                        }
                        dAbs8 = Math.abs(d38 - d35);
                        if (dAbs8 > d39) {
                            d39 = dAbs8;
                        }
                        d12 = d20 - d61119;
                        d7 = d23 - d39;
                        dArr[i15] = (d24 / 7.0d) * 100.0d;
                        i15++;
                        i13 = i41113 + 1;
                        i16++;
                        i14++;
                        i12 = i41114 + 1;
                    }
                    c3372dV1.a = i15;
                    c3372dV0.a = i4;
                }
                enumC2107Tt1 = enumC2107Tt6;
            }
            i19 = 1;
            i20 = i3 - 1;
            i4 = i20 + i19;
            if (i4 <= 0) {
                i4 = i34;
            }
            EnumC2107Tt1 enumC2107Tt7 = EnumC2107Tt1.d;
            if (i4 <= iE) {
                i5 = (i4 - i35) + 1;
                i6 = i5;
                d = 0.0d;
                d2 = 0.0d;
                while (i6 < i4) {
                    d49 = fArrM[i6];
                    int i318 = i5;
                    double d51114 = fArrN[i6];
                    d50 = fArrM2[i6 - 1];
                    if (d49 < d50) {
                        d52 = d50;
                        d51 = d49;
                    } else {
                        d51 = d50;
                        d52 = d51;
                    }
                    double d51115 = ((double) fArrM2[i6]) - d51;
                    d53 = d51114 - d49;
                    dAbs13 = Math.abs(d52 - d51114);
                    if (dAbs13 > d53) {
                        d53 = dAbs13;
                    }
                    dAbs14 = Math.abs(d52 - d49);
                    if (dAbs14 > d53) {
                        d53 = dAbs14;
                    }
                    d += d51115;
                    d2 += d53;
                    i6++;
                    i5 = i318;
                }
                int i319 = i5;
                i7 = (i4 - i36) + 1;
                d3 = 0.0d;
                d4 = 0.0d;
                i8 = i7;
                while (i8 < i4) {
                    int i41115 = i7;
                    int i41116 = i8;
                    d45 = fArrM[i8];
                    double d51116 = fArrN[i41116];
                    d46 = fArrM2[i41116 - 1];
                    if (d45 < d46) {
                        d47 = d45;
                    } else {
                        d47 = d46;
                    }
                    double d51117 = ((double) fArrM2[i41116]) - d47;
                    d48 = d51116 - d45;
                    dAbs11 = Math.abs(d46 - d51116);
                    if (dAbs11 > d48) {
                        d48 = dAbs11;
                    }
                    dAbs12 = Math.abs(d46 - d45);
                    if (dAbs12 > d48) {
                        d48 = dAbs12;
                    }
                    d3 += d51117;
                    d4 += d48;
                    i8 = i41116 + 1;
                    i7 = i41115;
                }
                int i41117 = i7;
                i9 = (i4 - i37) + 1;
                d5 = 0.0d;
                d6 = 0.0d;
                i11 = i9;
                while (i11 < i4) {
                    int i41118 = i9;
                    int i41119 = i11;
                    d40 = fArrM[i11];
                    double d51118 = fArrN[i41119];
                    d41 = fArrM2[i41119 - 1];
                    if (d40 < d41) {
                        d43 = d41;
                        d42 = d40;
                    } else {
                        d42 = d41;
                        d43 = d42;
                    }
                    double d51119 = ((double) fArrM2[i41119]) - d42;
                    d44 = d51118 - d40;
                    dAbs9 = Math.abs(d43 - d51118);
                    if (dAbs9 > d44) {
                        d44 = dAbs9;
                    }
                    dAbs10 = Math.abs(d43 - d40);
                    if (dAbs10 > d44) {
                        d44 = dAbs10;
                    }
                    d5 += d51119;
                    d6 += d44;
                    i11 = i41119 + 1;
                    i9 = i41118;
                }
                i12 = i9;
                i13 = i4;
                i14 = i41117;
                d7 = d6;
                d8 = d4;
                d9 = d2;
                d10 = d;
                d11 = d3;
                d12 = d5;
                i15 = i34;
                i16 = i319;
                while (i13 <= iE) {
                    int i411110 = i13;
                    int i411111 = i12;
                    d13 = fArrM[i411110];
                    double d611110 = fArrN[i411110];
                    d14 = fArrM2[i411110 - 1];
                    if (d13 < d14) {
                        d16 = d14;
                        d15 = d13;
                    } else {
                        d15 = d14;
                        d16 = d15;
                    }
                    double d611111 = ((double) fArrM2[i411110]) - d15;
                    d17 = d611110 - d13;
                    dAbs = Math.abs(d16 - d611110);
                    if (dAbs > d17) {
                        d17 = dAbs;
                    }
                    dAbs2 = Math.abs(d16 - d13);
                    if (dAbs2 > d17) {
                        d17 = dAbs2;
                    }
                    d18 = d10 + d611111;
                    d19 = d11 + d611111;
                    d20 = d12 + d611111;
                    d21 = d9 + d17;
                    d22 = d8 + d17;
                    d23 = d7 + d17;
                    if (-1.0E-8d < d21) {
                        d24 = ((d18 / d21) * 4.0d) + 0.0d;
                    } else {
                        d24 = ((d18 / d21) * 4.0d) + 0.0d;
                    }
                    if (-1.0E-8d < d22) {
                        d24 = ((d19 / d22) * 2.0d) + d24;
                    } else {
                        d24 = ((d19 / d22) * 2.0d) + d24;
                    }
                    if (-1.0E-8d < d23) {
                        d24 = (d20 / d23) + d24;
                    } else {
                        d24 = (d20 / d23) + d24;
                    }
                    d25 = fArrM[i16];
                    double d611112 = fArrN[i16];
                    d26 = fArrM2[i16 - 1];
                    if (d25 < d26) {
                        d28 = d26;
                        d27 = d25;
                    } else {
                        d27 = d26;
                        d28 = d27;
                    }
                    double d611113 = ((double) fArrM2[i16]) - d27;
                    d29 = d611112 - d25;
                    dAbs3 = Math.abs(d28 - d611112);
                    if (dAbs3 > d29) {
                        d29 = dAbs3;
                    }
                    dAbs4 = Math.abs(d28 - d25);
                    if (dAbs4 > d29) {
                        d29 = dAbs4;
                    }
                    d10 = d18 - d611113;
                    d9 = d21 - d29;
                    d30 = fArrM[i14];
                    double d611114 = fArrN[i14];
                    d31 = fArrM2[i14 - 1];
                    if (d30 < d31) {
                        d33 = d31;
                        d32 = d30;
                    } else {
                        d32 = d31;
                        d33 = d32;
                    }
                    double d611115 = ((double) fArrM2[i14]) - d32;
                    d34 = d611114 - d30;
                    dAbs5 = Math.abs(d33 - d611114);
                    if (dAbs5 > d34) {
                        d34 = dAbs5;
                    }
                    dAbs6 = Math.abs(d33 - d30);
                    if (dAbs6 > d34) {
                        d34 = dAbs6;
                    }
                    d11 = d19 - d611115;
                    d8 = d22 - d34;
                    d35 = fArrM[i411111];
                    double d611116 = fArrN[i411111];
                    d36 = fArrM2[i411111 - 1];
                    if (d35 < d36) {
                        d38 = d36;
                        d37 = d35;
                    } else {
                        d37 = d36;
                        d38 = d37;
                    }
                    double d611117 = ((double) fArrM2[i411111]) - d37;
                    d39 = d611116 - d35;
                    dAbs7 = Math.abs(d38 - d611116);
                    if (dAbs7 > d39) {
                        d39 = dAbs7;
                    }
                    dAbs8 = Math.abs(d38 - d35);
                    if (dAbs8 > d39) {
                        d39 = dAbs8;
                    }
                    d12 = d20 - d611117;
                    d7 = d23 - d39;
                    dArr[i15] = (d24 / 7.0d) * 100.0d;
                    i15++;
                    i13 = i411110 + 1;
                    i16++;
                    i14++;
                    i12 = i411111 + 1;
                }
                c3372dV1.a = i15;
                c3372dV0.a = i4;
            }
            enumC2107Tt1 = enumC2107Tt7;
        }
        Intrinsics.checkNotNullExpressionValue(enumC2107Tt1, "ultOsc(...)");
        return enumC2107Tt1;
    }
}

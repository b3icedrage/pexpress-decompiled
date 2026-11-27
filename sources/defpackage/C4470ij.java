package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4470ij extends AbstractC6048q0<C5149lj, C4939kj.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4470ij(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull C4939kj aroonIndicatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, aroonIndicatorParamsProvider);
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(aroonIndicatorParamsProvider, "aroonIndicatorParamsProvider");
        this.j = core;
        CR0 cr0 = CR0.ADX;
        this.k = "aroon";
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.k;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        C5149lj c5149lj = (C5149lj) cVar;
        C4939kj.a aVar = (C4939kj.a) interfaceC7722xy0;
        double dP = C1526Mj.p(c5149lj.a);
        double dP2 = C1526Mj.p(c5149lj.b);
        E10.b.b(this, "upValue -> " + dP + ", downValue -> " + dP2);
        if (dP <= 50.0d || dP2 >= 50.0d) {
            return (dP2 <= 50.0d || dP >= 50.0d) ? k(c6257r0) : i(H32.a.PUT_DOWN, aVar);
        }
        return i(H32.a.CALL_UP, aVar);
    }

    @Override // defpackage.AbstractC6048q0
    public final Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        EnumC2107Tt1 enumC2107Tt1;
        int i;
        C5149lj c5149lj = (C5149lj) cVar;
        float[] fArrN = C0957Fb.n(list);
        Intrinsics.checkNotNullParameter(list, "<this>");
        float[] fArrM = C0957Fb.m(list);
        int iE = WE.e(list);
        int i2 = ((C4939kj.a) interfaceC7722xy0).a;
        double[] dArr = c5149lj.b;
        this.j.getClass();
        if (iE < 0 || iE < 0) {
            enumC2107Tt1 = EnumC2107Tt1.g;
        } else {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 14;
            } else if (i2 < 2 || i2 > 100000) {
                enumC2107Tt1 = EnumC2107Tt1.e;
            }
            int i3 = 0;
            int i4 = i2 > 0 ? i2 : 0;
            enumC2107Tt1 = EnumC2107Tt1.d;
            C3372dV0 c3372dV0 = this.h;
            C3372dV0 c3372dV1 = this.i;
            if (i4 > iE) {
                c3372dV0.a = 0;
                c3372dV1.a = 0;
            } else {
                int i5 = i4 - i2;
                double d = 100.0d / ((double) i2);
                double d2 = 0.0d;
                int i6 = i2;
                int i7 = i4;
                int i8 = -1;
                int i9 = -1;
                double d3 = 0.0d;
                while (i7 <= iE) {
                    float[] fArr = fArrM;
                    int i11 = iE;
                    double d4 = fArr[i7];
                    if (i8 < i5) {
                        double d5 = fArr[i5];
                        int i12 = i5;
                        while (true) {
                            i = i12;
                            while (true) {
                                int i13 = i12 + 1;
                                if (i13 > i7) {
                                    break;
                                }
                                double d6 = d5;
                                d5 = fArr[i13];
                                if (d5 <= d6) {
                                    i12 = i13;
                                } else {
                                    i12 = i13;
                                    d5 = d6;
                                }
                            }
                        }
                        i8 = i;
                        d2 = d5;
                    } else if (d4 <= d2) {
                        i8 = i7;
                        d2 = d4;
                    }
                    double d7 = fArrN[i7];
                    if (i9 < i5) {
                        d7 = fArrN[i5];
                        int i14 = i5;
                        int i15 = i14;
                        while (true) {
                            int i16 = i14 + 1;
                            i8 = i8;
                            if (i16 > i7) {
                                break;
                            }
                            double d8 = fArrN[i16];
                            if (d8 >= d7) {
                                d7 = d8;
                                i14 = i16;
                                i15 = i14;
                            } else {
                                i14 = i16;
                            }
                        }
                        i9 = i15;
                    } else {
                        i8 = i8;
                        if (d7 >= d3) {
                            i9 = i7;
                        }
                        c5149lj.a[i3] = ((double) (i6 - (i7 - i9))) * d;
                        dArr[i3] = ((double) (i6 - (i7 - i8))) * d;
                        i3++;
                        i5++;
                        i7++;
                        fArrM = fArr;
                        iE = i11;
                        i8 = i8;
                    }
                    d3 = d7;
                    c5149lj.a[i3] = ((double) (i6 - (i7 - i9))) * d;
                    dArr[i3] = ((double) (i6 - (i7 - i8))) * d;
                    i3++;
                    i5++;
                    i7++;
                    fArrM = fArr;
                    iE = i11;
                    i8 = i8;
                }
                c3372dV0.a = i4;
                c3372dV1.a = i3;
            }
        }
        Intrinsics.checkNotNullExpressionValue(enumC2107Tt1, "aroon(...)");
        return enumC2107Tt1;
    }
}

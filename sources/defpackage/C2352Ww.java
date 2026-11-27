package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2352Ww extends AbstractC6048q0<C6990uV, C2534Yw.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final C2534Yw k;

    @NotNull
    public final String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2352Ww(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull C2534Yw cciIndicatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, cciIndicatorParamsProvider);
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(cciIndicatorParamsProvider, "cciIndicatorParamsProvider");
        this.j = core;
        this.k = cciIndicatorParamsProvider;
        CR0 cr0 = CR0.ADX;
        this.l = "cci";
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
        C2192Uw c2192Uw;
        C2352Ww c2352Ww;
        if (lm instanceof C2192Uw) {
            c2192Uw = (C2192Uw) lm;
            int i = c2192Uw.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2192Uw.i = i - Integer.MIN_VALUE;
            } else {
                c2192Uw = new C2192Uw(this, lm);
            }
        } else {
            c2192Uw = new C2192Uw(this, lm);
        }
        C2192Uw c2192Uw2 = c2192Uw;
        Object objO = c2192Uw2.g;
        MN mn = MN.d;
        int i2 = c2192Uw2.i;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            if (i10.g) {
                C6610sg0 c6610sg0D = this.k.d();
                c2192Uw2.d = this;
                c2192Uw2.e = i10;
                c2192Uw2.i = 2;
                objO = C4466ii.o(c6610sg0D, c2192Uw2);
                if (objO != mn) {
                    c2352Ww = this;
                }
            } else {
                c2192Uw2.i = 1;
                Object objE = AbstractC6048q0.e(this, i10, c2192Uw2);
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
        i10 = c2192Uw2.e;
        c2352Ww = c2192Uw2.d;
        C1795Pt1.b(objO);
        C2534Yw.a aVar = (C2534Yw.a) objO;
        C6990uV c6990uV = new C6990uV(new double[aVar.a * 2]);
        C1676Og c1676Og = new C1676Og(aVar, 1);
        C2270Vw c2270Vw = new C2270Vw(3, null);
        c2192Uw2.d = null;
        c2192Uw2.e = null;
        c2192Uw2.i = 3;
        Object objN = c2352Ww.n(i10, aVar, c6990uV, c1676Og, c2270Vw, c2192Uw2);
        return objN == mn ? mn : objN;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        C2534Yw.a aVar = (C2534Yw.a) interfaceC7722xy0;
        double dP = C1526Mj.p(((C6990uV) cVar).a);
        E10.b.b(this, "real: " + dP);
        if (dP < 0.0d) {
            return i(H32.a.CALL_UP, aVar);
        }
        return dP > 0.0d ? i(H32.a.PUT_DOWN, aVar) : k(c6257r0);
    }

    @Override // defpackage.AbstractC6048q0
    public final Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        EnumC2107Tt1 enumC2107Tt1;
        int i;
        float[] fArrN = C0957Fb.n(list);
        Intrinsics.checkNotNullParameter(list, "<this>");
        float[] fArrM = C0957Fb.m(list);
        float[] fArrM2 = C0957Fb.m(list);
        int iE = WE.e(list);
        int i2 = ((C2534Yw.a) interfaceC7722xy0).a;
        double[] dArr = ((C6990uV) cVar).a;
        this.j.getClass();
        if (iE < 0 || iE < 0) {
            enumC2107Tt1 = EnumC2107Tt1.g;
        } else {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 14;
            } else if (i2 < 2 || i2 > 100000) {
                enumC2107Tt1 = EnumC2107Tt1.e;
            }
            int i3 = i2 - 1;
            int i4 = i3 > 0 ? i3 : 0;
            enumC2107Tt1 = EnumC2107Tt1.d;
            C3372dV0 c3372dV0 = this.h;
            C3372dV0 c3372dV1 = this.i;
            if (i4 > iE) {
                c3372dV0.a = 0;
                c3372dV1.a = 0;
            } else if (i2 <= 0) {
                enumC2107Tt1 = EnumC2107Tt1.h;
            } else {
                double[] dArr2 = new double[i2];
                int i5 = i4 - i3;
                if (i2 > 1) {
                    i = 0;
                    while (i5 < i4) {
                        dArr2[i] = ((fArrN[i5] + fArrM[i5]) + fArrM2[i5]) / 3.0f;
                        i5++;
                        i++;
                        fArrN = fArrN;
                        dArr = dArr;
                        if (i > i3) {
                            i = 0;
                        }
                    }
                } else {
                    i = 0;
                }
                double[] dArr3 = dArr;
                float[] fArr = fArrN;
                int i6 = 0;
                do {
                    int i7 = i6;
                    double d = ((fArr[i5] + fArrM[i5]) + fArrM2[i5]) / 3.0f;
                    dArr2[i] = d;
                    double d2 = 0.0d;
                    for (int i8 = 0; i8 < i2; i8++) {
                        d2 += dArr2[i8];
                    }
                    double d3 = i2;
                    double d4 = d2 / d3;
                    double dAbs = 0.0d;
                    for (int i9 = 0; i9 < i2; i9++) {
                        dAbs = Math.abs(dArr2[i9] - d4) + dAbs;
                    }
                    double d5 = d - d4;
                    if (d5 == 0.0d || dAbs == 0.0d) {
                        i6 = i7 + 1;
                        dArr3[i7] = 0.0d;
                    } else {
                        dArr3[i7] = d5 / ((dAbs / d3) * 0.015d);
                        i6 = i7 + 1;
                    }
                    i++;
                    if (i > i3) {
                        i = 0;
                    }
                    i5++;
                } while (i5 <= iE);
                c3372dV1.a = i6;
                c3372dV0.a = i4;
            }
        }
        Intrinsics.checkNotNullExpressionValue(enumC2107Tt1, "cci(...)");
        return enumC2107Tt1;
    }
}

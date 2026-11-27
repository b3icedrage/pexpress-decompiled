package defpackage;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3443dp extends AbstractC6048q0<C4283hp, C3863fp.a> {

    @NotNull
    public final C3556eN j;

    @NotNull
    public final InterfaceC4209hU1 k;

    @NotNull
    public final C3863fp l;

    @NotNull
    public final String m;
    public float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3443dp(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull C3556eN core, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull C3863fp indicatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, indicatorParamsProvider);
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(indicatorParamsProvider, "indicatorParamsProvider");
        this.j = core;
        this.k = subscribeToValueUpdatesUseCase;
        this.l = indicatorParamsProvider;
        CR0 cr0 = CR0.ADX;
        this.m = "bb";
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC6048q0, defpackage.E10
    @Nullable
    public final Object b(@NotNull I10 i10, @NotNull LM lm) {
        C2815ap c2815ap;
        C3443dp c3443dp;
        if (lm instanceof C2815ap) {
            c2815ap = (C2815ap) lm;
            int i = c2815ap.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2815ap.i = i - Integer.MIN_VALUE;
            } else {
                c2815ap = new C2815ap(this, lm);
            }
        } else {
            c2815ap = new C2815ap(this, lm);
        }
        Object objO = c2815ap.g;
        MN mn = MN.d;
        int i2 = c2815ap.i;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            if (i10.g) {
                C6610sg0 c6610sg0D = this.l.d();
                c2815ap.d = this;
                c2815ap.e = i10;
                c2815ap.i = 2;
                objO = C4466ii.o(c6610sg0D, c2815ap);
                if (objO != mn) {
                    c3443dp = this;
                }
            } else {
                c2815ap.i = 1;
                Object objE = AbstractC6048q0.e(this, i10, c2815ap);
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
        i10 = c2815ap.e;
        c3443dp = c2815ap.d;
        C1795Pt1.b(objO);
        C3863fp.a aVar = (C3863fp.a) objO;
        int i3 = aVar.a * 2;
        C4283hp c4283hp = new C4283hp(new double[i3], new double[i3], new double[i3]);
        c2815ap.d = null;
        c2815ap.e = null;
        c2815ap.i = 3;
        Object objP = c3443dp.p(i10, aVar, c4283hp, c2815ap);
        return objP == mn ? mn : objP;
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        C4283hp c4283hp = (C4283hp) cVar;
        C3863fp.a aVar = (C3863fp.a) interfaceC7722xy0;
        double dP = C1526Mj.p(c4283hp.a);
        double dP2 = C1526Mj.p(c4283hp.c);
        double dP3 = C1526Mj.p(c4283hp.b);
        E10.b.b(this, "last price: " + this.n);
        E10.b.b(this, "lower output: " + dP);
        E10.b.b(this, "middle output: " + dP2);
        E10.b.b(this, "upper output: " + dP3);
        double d = (double) this.n;
        if (d < dP2) {
            return i(H32.a.CALL_UP, aVar);
        }
        return d > dP2 ? i(H32.a.PUT_DOWN, aVar) : k(c6257r0);
    }

    @Override // defpackage.AbstractC6048q0
    public final /* bridge */ /* synthetic */ Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        return q(list, (C3863fp.a) interfaceC7722xy0, (C4283hp) cVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object p(I10 i10, C3863fp.a aVar, C4283hp c4283hp, LM lm) {
        C3234cp c3234cp;
        C3443dp c3443dp;
        I10 i11;
        C3863fp.a aVar2;
        C3027bp1 c3027bp1;
        C4283hp c4283hp2;
        C3443dp c3443dp2;
        H32.a aVar3;
        Object objK;
        if (lm instanceof C3234cp) {
            c3234cp = (C3234cp) lm;
            int i = c3234cp.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3234cp.l = i - Integer.MIN_VALUE;
            } else {
                c3234cp = new C3234cp(this, lm);
            }
        } else {
            c3234cp = new C3234cp(this, lm);
        }
        Object objQ = c3234cp.j;
        MN mn = MN.d;
        int i2 = c3234cp.l;
        if (i2 == 0) {
            C3027bp1 c3027bp1B = C4564j.b(objQ);
            int i3 = aVar.a * 2;
            c3234cp.d = this;
            c3234cp.e = i10;
            c3234cp.g = aVar;
            c3234cp.h = c4283hp;
            c3234cp.i = c3027bp1B;
            c3234cp.l = 1;
            Object objA = this.k.a(i10, i3, c3234cp);
            if (objA != mn) {
                c3443dp = this;
                i11 = i10;
                aVar2 = aVar;
                c3027bp1 = c3027bp1B;
                objQ = objA;
                c4283hp2 = c4283hp;
            }
            return mn;
        }
        if (i2 == 1) {
            C3027bp1 c3027bp2 = c3234cp.i;
            C4283hp c4283hp3 = c3234cp.h;
            C3863fp.a aVar4 = c3234cp.g;
            I10 i12 = c3234cp.e;
            C3443dp c3443dp3 = c3234cp.d;
            C1795Pt1.b(objQ);
            c3027bp1 = c3027bp2;
            c4283hp2 = c4283hp3;
            aVar2 = aVar4;
            i11 = i12;
            c3443dp = c3443dp3;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objQ);
                return objQ;
            }
            c3443dp2 = c3234cp.d;
            C1795Pt1.b(objQ);
        }
        aVar3 = (H32.a) objQ;
        if (aVar3 != null) {
            return P10.a(aVar3);
        }
        c3234cp.d = null;
        c3234cp.l = 3;
        objK = c3443dp2.k(c3234cp);
        if (objK != mn) {
            return mn;
        }
        return objK;
        C3735fC1 c3735fC1 = new C3735fC1(new C3025bp((InterfaceC6396rf0) objQ, null, c3027bp1, c3443dp, i11, aVar2, c4283hp2));
        c3234cp.d = c3443dp;
        c3234cp.e = null;
        c3234cp.g = null;
        c3234cp.h = null;
        c3234cp.i = null;
        c3234cp.l = 2;
        objQ = C4466ii.q(c3735fC1, c3234cp);
        if (objQ != mn) {
            c3443dp2 = c3443dp;
            aVar3 = (H32.a) objQ;
            if (aVar3 != null) {
                return P10.a(aVar3);
            }
            c3234cp.d = null;
            c3234cp.l = 3;
            objK = c3443dp2.k(c3234cp);
            if (objK != mn) {
                return objK;
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    @Nullable
    public final EnumC2107Tt1 q(@NotNull List list, @NotNull C3863fp.a aVar, @NotNull C4283hp c4283hp) {
        EnumC2107Tt1 enumC2107Tt1;
        double d;
        C3372dV0 c3372dV0;
        double[] dArr;
        EnumC2107Tt1 enumC2107Tt1F;
        int i;
        double[] dArr2;
        int i2;
        float[] fArrM = C0957Fb.m(list);
        Intrinsics.checkNotNullParameter(fArrM, "<this>");
        if (fArrM.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        Intrinsics.checkNotNullParameter(fArrM, "<this>");
        boolean z = true;
        this.n = fArrM[fArrM.length - 1];
        int iE = WE.e(list);
        Intrinsics.checkNotNullParameter(fArrM, "<this>");
        int length = fArrM.length;
        for (int i3 = 0; i3 < length; i3++) {
            fArrM[i3] = fArrM[i3] * 1000.0f;
        }
        int i4 = aVar.a;
        double[] dArr3 = c4283hp.b;
        this.j.getClass();
        EnumC2107Tt1 enumC2107Tt2 = EnumC2107Tt1.g;
        if (iE < 0 || iE < 0) {
            enumC2107Tt1 = enumC2107Tt2;
        } else {
            EnumC2107Tt1 enumC2107Tt3 = EnumC2107Tt1.e;
            if (i4 == Integer.MIN_VALUE) {
                i4 = 5;
            } else if (i4 < 2 || i4 > 100000) {
                enumC2107Tt1 = enumC2107Tt3;
            }
            int i5 = i4;
            double d2 = aVar.b;
            if (d2 == -4.0E37d) {
                d = 2.0d;
            } else if (d2 < -3.0E37d || d2 > 3.0E37d) {
                enumC2107Tt1 = enumC2107Tt3;
            } else {
                d = d2;
            }
            if (d2 == -4.0E37d) {
                d2 = 2.0d;
            } else if (d2 < -3.0E37d || d2 > 3.0E37d) {
                enumC2107Tt1 = enumC2107Tt3;
            }
            EnumC2107Tt1 enumC2107Tt4 = EnumC2107Tt1.d;
            C3372dV0 c3372dV1 = this.h;
            C3372dV0 c3372dV2 = this.i;
            double[] dArr4 = c4283hp.c;
            if (iE < 0 || iE < 0) {
                c3372dV0 = c3372dV1;
                dArr = dArr3;
                enumC2107Tt1F = enumC2107Tt2;
            } else {
                if (i5 == Integer.MIN_VALUE) {
                    i2 = 30;
                } else if (i5 < 1 || i5 > 100000) {
                    c3372dV0 = c3372dV1;
                    dArr = dArr3;
                    enumC2107Tt1F = enumC2107Tt3;
                } else {
                    i2 = i5;
                }
                if (i2 == 1) {
                    int i6 = iE + 1;
                    c3372dV2.a = i6;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < i6) {
                        dArr4[i7] = fArrM[i8];
                        i7++;
                        i8++;
                        z = z;
                        dArr3 = dArr3;
                    }
                    dArr = dArr3;
                    c3372dV1.a = 0;
                    c3372dV0 = c3372dV1;
                    enumC2107Tt1F = enumC2107Tt4;
                } else {
                    c3372dV0 = c3372dV1;
                    dArr = dArr3;
                    enumC2107Tt1F = C3556eN.f(iE, fArrM, i2, c3372dV0, c3372dV2, dArr4);
                }
            }
            if (enumC2107Tt1F != enumC2107Tt4 || (i = c3372dV2.a) == 0) {
                c3372dV2.a = 0;
                enumC2107Tt1 = enumC2107Tt1F;
            } else {
                int i9 = c3372dV0.a;
                int i10 = (i9 + 1) - i5;
                double d3 = 0.0d;
                for (int i11 = i10; i11 < i9; i11++) {
                    double d4 = fArrM[i11];
                    d3 = (d4 * d4) + d3;
                }
                int i12 = i10;
                int i13 = 0;
                while (true) {
                    dArr2 = c4283hp.a;
                    if (i13 >= i) {
                        break;
                    }
                    double d5 = fArrM[i9];
                    double d6 = (d5 * d5) + d3;
                    EnumC2107Tt1 enumC2107Tt5 = enumC2107Tt4;
                    double d7 = d6 / ((double) i5);
                    double d8 = fArrM[i12];
                    double d9 = d6 - (d8 * d8);
                    double d10 = dArr4[i13];
                    double d11 = d7 - (d10 * d10);
                    if (d11 >= 1.0E-8d) {
                        dArr2[i13] = Math.sqrt(d11);
                    } else {
                        dArr2[i13] = 0.0d;
                    }
                    i13++;
                    i12++;
                    i9++;
                    d3 = d9;
                    enumC2107Tt4 = enumC2107Tt5;
                }
                EnumC2107Tt1 enumC2107Tt6 = enumC2107Tt4;
                if (d == d2) {
                    if (d == 1.0d) {
                        for (int i14 = 0; i14 < c3372dV2.a; i14++) {
                            double d12 = dArr2[i14];
                            double d13 = dArr4[i14];
                            dArr[i14] = d13 + d12;
                            dArr2[i14] = d13 - d12;
                        }
                    } else {
                        for (int i15 = 0; i15 < c3372dV2.a; i15++) {
                            double d14 = dArr2[i15] * d;
                            double d15 = dArr4[i15];
                            dArr[i15] = d15 + d14;
                            dArr2[i15] = d15 - d14;
                        }
                    }
                } else if (d == 1.0d) {
                    for (int i16 = 0; i16 < c3372dV2.a; i16++) {
                        double d16 = dArr2[i16];
                        double d17 = dArr4[i16];
                        dArr[i16] = d17 + d16;
                        dArr2[i16] = d17 - (d16 * d2);
                    }
                } else if (d2 == 1.0d) {
                    for (int i17 = 0; i17 < c3372dV2.a; i17++) {
                        double d18 = dArr2[i17];
                        double d19 = dArr4[i17];
                        dArr2[i17] = d19 - d18;
                        dArr[i17] = (d18 * d) + d19;
                    }
                } else {
                    for (int i18 = 0; i18 < c3372dV2.a; i18++) {
                        double d20 = dArr2[i18];
                        double d21 = dArr4[i18];
                        dArr[i18] = (d20 * d) + d21;
                        dArr2[i18] = d21 - (d20 * d2);
                    }
                }
                enumC2107Tt1 = enumC2107Tt6;
            }
        }
        Intrinsics.checkNotNullExpressionValue(enumC2107Tt1, "bbands(...)");
        return enumC2107Tt1;
    }
}

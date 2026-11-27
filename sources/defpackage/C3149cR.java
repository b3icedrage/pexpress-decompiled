package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3149cR {

    @NotNull
    public final VQ a;

    @NotNull
    public final AbstractC7004uZ1 b;

    @NotNull
    public final MR1 c;

    @NotNull
    public final InterfaceC0565Aa0 d;

    public C3149cR(@NotNull VQ currentStartAmountProvider, @NotNull AbstractC7004uZ1 timeSelectionsProvider, @NotNull MR1 strategySelectionUseCase, @NotNull InterfaceC0565Aa0 experimentsProviderApi) {
        Intrinsics.checkNotNullParameter(currentStartAmountProvider, "currentStartAmountProvider");
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        Intrinsics.checkNotNullParameter(strategySelectionUseCase, "strategySelectionUseCase");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        this.a = currentStartAmountProvider;
        this.b = timeSelectionsProvider;
        this.c = strategySelectionUseCase;
        this.d = experimentsProviderApi;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(EnumC2644a42 enumC2644a42, int i, int i2, C3279d22 c3279d22, LM lm) {
        ZQ zq;
        EnumC2644a42 enumC2644a43;
        int i3;
        int i4;
        Object objB;
        C3149cR c3149cR;
        double dH;
        EnumC2644a42 enumC2644a44;
        C5475nF1 client;
        C3149cR c3149cR2;
        int i5;
        int i6;
        EnumC4200hR1 enumC4200hR1;
        int iOrdinal;
        AbstractC5422n1 strategyCalculator;
        int iOrdinal2;
        AbstractC5422n1 c6747tK;
        if (lm instanceof ZQ) {
            zq = (ZQ) lm;
            int i7 = zq.m;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zq.m = i7 - Integer.MIN_VALUE;
            } else {
                zq = new ZQ(this, lm);
            }
        } else {
            zq = new ZQ(this, lm);
        }
        Object obj = zq.k;
        MN mn = MN.d;
        int i8 = zq.m;
        if (i8 == 0) {
            C1795Pt1.b(obj);
            zq.d = this;
            enumC2644a43 = enumC2644a42;
            zq.e = enumC2644a43;
            i3 = i;
            zq.h = i3;
            i4 = i2;
            zq.i = i4;
            zq.m = 1;
            objB = b(c3279d22, zq);
            if (objB != mn) {
                c3149cR = this;
            }
            return mn;
        }
        if (i8 == 1) {
            int i9 = zq.i;
            int i10 = zq.h;
            EnumC2644a42 enumC2644a45 = zq.e;
            c3149cR = zq.d;
            C1795Pt1.b(obj);
            objB = obj;
            enumC2644a43 = enumC2644a45;
            i4 = i9;
            i3 = i10;
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            double d = zq.j;
            i4 = zq.i;
            i5 = zq.h;
            C5475nF1 c5475nF1 = zq.g;
            EnumC2644a42 enumC2644a46 = zq.e;
            c3149cR2 = zq.d;
            C1795Pt1.b(obj);
            enumC2644a44 = enumC2644a46;
            dH = d;
            client = c5475nF1;
        }
        i6 = i4;
        enumC4200hR1 = (EnumC4200hR1) obj;
        iOrdinal = enumC2644a44.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                c3149cR2.getClass();
                iOrdinal2 = enumC4200hR1.ordinal();
                if (iOrdinal2 == 0) {
                    c6747tK = new C6747tK(i5, i6, dH, client);
                } else {
                    if (iOrdinal2 == 1 && iOrdinal2 != 2) {
                        throw new C6489s51();
                    }
                    c6747tK = new C2832au1(i5, i6, dH, client);
                }
            } else if (iOrdinal != 2) {
                c6747tK = new X91(i5, i6, dH, client);
            } else if (iOrdinal != 3) {
                Intrinsics.checkNotNullParameter(client, "client");
                C6084q9 c6084q9 = new C6084q9(i5, i6, dH, client);
                c6084q9.l = (c6084q9.m() * ((double) 2)) + ((double) i5);
                c6747tK = c6084q9;
            } else {
                if (iOrdinal == 4) {
                    throw new C6489s51();
                }
                strategyCalculator = new C1905Re0(i5, client);
            }
            strategyCalculator = c6747tK;
        } else {
            strategyCalculator = new C1905Re0(i5, client);
        }
        client.getClass();
        Intrinsics.checkNotNullParameter(strategyCalculator, "strategyCalculator");
        client.d = strategyCalculator;
        return client;
        dH = C7644xc.h((Number) objB);
        C5475nF1 c5475nF2 = new C5475nF1();
        c5475nF2.d = C7122v60.i;
        InterfaceC0565Aa0 interfaceC0565Aa0 = c3149cR.d;
        zq.d = c3149cR;
        zq.e = enumC2644a43;
        zq.g = c5475nF2;
        zq.h = i3;
        zq.i = i4;
        zq.j = dH;
        zq.m = 2;
        Enum enumA = C4668jR1.a(interfaceC0565Aa0, zq);
        if (enumA != mn) {
            enumC2644a44 = enumC2644a43;
            obj = enumA;
            client = c5475nF2;
            c3149cR2 = c3149cR;
            i5 = i3;
            i6 = i4;
            enumC4200hR1 = (EnumC4200hR1) obj;
            iOrdinal = enumC2644a44.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    c3149cR2.getClass();
                    iOrdinal2 = enumC4200hR1.ordinal();
                    if (iOrdinal2 == 0) {
                        if (iOrdinal2 == 1) {
                        }
                        c6747tK = new C2832au1(i5, i6, dH, client);
                    } else {
                        c6747tK = new C6747tK(i5, i6, dH, client);
                    }
                } else if (iOrdinal != 2) {
                    c6747tK = new X91(i5, i6, dH, client);
                } else if (iOrdinal != 3) {
                    Intrinsics.checkNotNullParameter(client, "client");
                    C6084q9 c6084q10 = new C6084q9(i5, i6, dH, client);
                    c6084q10.l = (c6084q10.m() * ((double) 2)) + ((double) i5);
                    c6747tK = c6084q10;
                } else {
                    if (iOrdinal == 4) {
                        throw new C6489s51();
                    }
                    strategyCalculator = new C1905Re0(i5, client);
                }
                strategyCalculator = c6747tK;
            } else {
                strategyCalculator = new C1905Re0(i5, client);
            }
            client.getClass();
            Intrinsics.checkNotNullParameter(strategyCalculator, "strategyCalculator");
            client.d = strategyCalculator;
            return client;
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(C3279d22 c3279d22, LM lm) {
        C2716aR c2716aR;
        if (lm instanceof C2716aR) {
            c2716aR = (C2716aR) lm;
            int i = c2716aR.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2716aR.h = i - Integer.MIN_VALUE;
            } else {
                c2716aR = new C2716aR(this, lm);
            }
        } else {
            c2716aR = new C2716aR(this, lm);
        }
        Object objA = c2716aR.e;
        MN mn = MN.d;
        int i2 = c2716aR.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c2716aR.d = c3279d22;
            c2716aR.h = 1;
            objA = this.b.a(c2716aR);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3279d22 = c2716aR.d;
            C1795Pt1.b(objA);
        }
        Integer num = ((C1709Or) objA).c ? c3279d22.g : c3279d22.f;
        if (num != null) {
            return new Integer(num.intValue());
        }
        throw new IllegalStateException("Percent value for asset should be set");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object c(@NotNull C3279d22 c3279d22, @NotNull LM lm) {
        C2940bR c2940bR;
        C3149cR c3149cR;
        C3279d22 c3279d23;
        C3149cR c3149cR2;
        EnumC2644a42 enumC2644a42;
        C3279d22 c3279d24;
        int iLongValue;
        Object objB;
        int i;
        Object objA;
        if (lm instanceof C2940bR) {
            c2940bR = (C2940bR) lm;
            int i2 = c2940bR.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2940bR.l = i2 - Integer.MIN_VALUE;
            } else {
                c2940bR = new C2940bR(this, lm);
            }
        } else {
            c2940bR = new C2940bR(this, lm);
        }
        C2940bR c2940bR2 = c2940bR;
        Object objO = c2940bR2.j;
        MN mn = MN.d;
        int i3 = c2940bR2.l;
        if (i3 == 0) {
            C1795Pt1.b(objO);
            c2940bR2.d = this;
            c2940bR2.e = c3279d22;
            c2940bR2.g = this;
            c2940bR2.l = 1;
            objO = C4466ii.o(this.c.k(), c2940bR2);
            if (objO != mn) {
                c3149cR = this;
                c3279d23 = c3279d22;
                c3149cR2 = c3149cR;
            }
            return mn;
        }
        if (i3 == 1) {
            c3149cR2 = (C3149cR) c2940bR2.g;
            c3279d23 = (C3279d22) c2940bR2.e;
            c3149cR = (C3149cR) c2940bR2.d;
            C1795Pt1.b(objO);
        } else {
            if (i3 == 2) {
                EnumC2644a42 enumC2644a43 = c2940bR2.h;
                C3149cR c3149cR3 = (C3149cR) c2940bR2.g;
                c3279d24 = (C3279d22) c2940bR2.e;
                c3149cR = (C3149cR) c2940bR2.d;
                C1795Pt1.b(objO);
                enumC2644a42 = enumC2644a43;
                c3149cR2 = c3149cR3;
                iLongValue = (int) ((Number) objO).longValue();
                VQ vq = c3149cR.a;
                c2940bR2.d = c3279d24;
                c2940bR2.e = c3149cR2;
                c2940bR2.g = enumC2644a42;
                c2940bR2.h = null;
                c2940bR2.i = iLongValue;
                c2940bR2.l = 3;
                objB = vq.b(c2940bR2);
                if (objB != mn) {
                    i = iLongValue;
                    objO = objB;
                }
                return mn;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objO);
                return objO;
            }
            int i4 = c2940bR2.i;
            enumC2644a42 = (EnumC2644a42) c2940bR2.g;
            C3149cR c3149cR4 = (C3149cR) c2940bR2.e;
            c3279d24 = (C3279d22) c2940bR2.d;
            C1795Pt1.b(objO);
            i = i4;
            c3149cR2 = c3149cR4;
        }
        C3279d22 c3279d25 = c3279d24;
        int iLongValue2 = (int) ((Number) objO).longValue();
        c2940bR2.d = null;
        c2940bR2.e = null;
        c2940bR2.g = null;
        c2940bR2.l = 4;
        objA = c3149cR2.a(enumC2644a42, i, iLongValue2, c3279d25, c2940bR2);
        if (objA != mn) {
            return mn;
        }
        return objA;
        EnumC2644a42 enumC2644a44 = (EnumC2644a42) objO;
        VQ vq2 = c3149cR.a;
        c2940bR2.d = c3149cR;
        c2940bR2.e = c3279d23;
        c2940bR2.g = c3149cR2;
        c2940bR2.h = enumC2644a44;
        c2940bR2.l = 2;
        Object objC = vq2.c((EnumC4164hF1) vq2.b.l().d.getValue(), c2940bR2);
        if (objC != mn) {
            C3279d22 c3279d26 = c3279d23;
            enumC2644a42 = enumC2644a44;
            objO = objC;
            c3279d24 = c3279d26;
            iLongValue = (int) ((Number) objO).longValue();
            VQ vq3 = c3149cR.a;
            c2940bR2.d = c3279d24;
            c2940bR2.e = c3149cR2;
            c2940bR2.g = enumC2644a42;
            c2940bR2.h = null;
            c2940bR2.i = iLongValue;
            c2940bR2.l = 3;
            objB = vq3.b(c2940bR2);
            if (objB != mn) {
                i = iLongValue;
                objO = objB;
                C3279d22 c3279d27 = c3279d24;
                int iLongValue3 = (int) ((Number) objO).longValue();
                c2940bR2.d = null;
                c2940bR2.e = null;
                c2940bR2.g = null;
                c2940bR2.l = 4;
                objA = c3149cR2.a(enumC2644a42, i, iLongValue3, c3279d27, c2940bR2);
                if (objA != mn) {
                    return objA;
                }
            }
        }
        return mn;
    }
}

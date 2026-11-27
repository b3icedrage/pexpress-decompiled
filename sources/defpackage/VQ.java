package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class VQ {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final O3 b;

    @NotNull
    public final AbstractC2327Wn1 c;

    @NotNull
    public final AbstractC6366rX d;

    @NotNull
    public final U22 e;

    @NotNull
    public final OM f;

    public VQ(@NotNull C4923kf appData, @NotNull O3 accountModeSelectionUseCase, @NotNull AbstractC2327Wn1 realAmountUseCaseApi, @NotNull AbstractC6366rX demoAmountUseCaseApi, @NotNull U22 tradingDefaultsProvider, @NotNull OM convertCurrency) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(realAmountUseCaseApi, "realAmountUseCaseApi");
        Intrinsics.checkNotNullParameter(demoAmountUseCaseApi, "demoAmountUseCaseApi");
        Intrinsics.checkNotNullParameter(tradingDefaultsProvider, "tradingDefaultsProvider");
        Intrinsics.checkNotNullParameter(convertCurrency, "convertCurrency");
        this.a = appData;
        this.b = accountModeSelectionUseCase;
        this.c = realAmountUseCaseApi;
        this.d = demoAmountUseCaseApi;
        this.e = tradingDefaultsProvider;
        this.f = convertCurrency;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(LM lm) {
        SQ sq;
        VQ vq;
        EnumC4164hF1 enumC4164hF1;
        VQ vq2;
        double d;
        int iOrdinal;
        C4923kf c4923kf;
        C6945uG c6945uG;
        String str;
        String str2;
        double dDoubleValue;
        EnumC4164hF1 enumC4164hF2;
        VQ vq3;
        String lowerCase;
        C6945uG c6945uG2;
        double d2;
        Double d3;
        double dDoubleValue2;
        if (lm instanceof SQ) {
            sq = (SQ) lm;
            int i = sq.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                sq.j = i - Integer.MIN_VALUE;
            } else {
                sq = new SQ(this, lm);
            }
        } else {
            sq = new SQ(this, lm);
        }
        SQ sq2 = sq;
        Object objO = sq2.h;
        MN mn = MN.d;
        int i2 = sq2.j;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<EnumC4164hF1> interfaceC6396rf0K = this.b.k();
            sq2.d = this;
            sq2.j = 1;
            objO = C4466ii.o(interfaceC6396rf0K, sq2);
            if (objO != mn) {
                vq = this;
            }
            return mn;
        }
        if (i2 == 1) {
            vq = sq2.d;
            C1795Pt1.b(objO);
        } else {
            if (i2 == 2) {
                EnumC4164hF1 enumC4164hF3 = sq2.e;
                VQ vq4 = sq2.d;
                C1795Pt1.b(objO);
                enumC4164hF1 = enumC4164hF3;
                vq2 = vq4;
                d = ((FF) objO).k;
                vq2.getClass();
                iOrdinal = enumC4164hF1.ordinal();
                c4923kf = vq2.a;
                if (iOrdinal != 0) {
                    c6945uG = (C6945uG) c4923kf.k.getValue();
                    if (c6945uG != null) {
                        str = c6945uG.h;
                    } else {
                        str = null;
                    }
                } else {
                    if (iOrdinal == 1) {
                        throw new C6489s51();
                    }
                    c6945uG2 = (C6945uG) c4923kf.k.getValue();
                    if (c6945uG2 != null) {
                        str = c6945uG2.g;
                    } else {
                        str = null;
                    }
                }
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (lowerCase == null) {
                        str2 = "usd";
                    } else {
                        str2 = lowerCase;
                    }
                } else {
                    str2 = "usd";
                }
                if (str2.equals("usd")) {
                    dDoubleValue = d;
                    U22 u22 = vq2.e;
                    sq2.d = null;
                    sq2.e = null;
                    sq2.g = dDoubleValue;
                    sq2.j = 4;
                    objO = u22.a(enumC4164hF1, sq2);
                    if (objO != mn) {
                        d2 = dDoubleValue;
                    }
                } else {
                    sq2.d = vq2;
                    sq2.e = enumC4164hF1;
                    sq2.g = d;
                    sq2.j = 3;
                    objO = vq2.f.a("usd", d, str2, sq2);
                    if (objO != mn) {
                        dDoubleValue = d;
                        enumC4164hF2 = enumC4164hF1;
                        vq3 = vq2;
                        d3 = (Double) objO;
                        if (d3 != null) {
                            dDoubleValue = d3.doubleValue();
                        }
                        enumC4164hF1 = enumC4164hF2;
                        vq2 = vq3;
                        U22 u23 = vq2.e;
                        sq2.d = null;
                        sq2.e = null;
                        sq2.g = dDoubleValue;
                        sq2.j = 4;
                        objO = u23.a(enumC4164hF1, sq2);
                        if (objO != mn) {
                            d2 = dDoubleValue;
                        }
                    }
                }
                return mn;
            }
            if (i2 == 3) {
                dDoubleValue = sq2.g;
                enumC4164hF2 = sq2.e;
                vq3 = sq2.d;
                C1795Pt1.b(objO);
                d3 = (Double) objO;
                if (d3 != null) {
                    dDoubleValue = d3.doubleValue();
                }
                enumC4164hF1 = enumC4164hF2;
                vq2 = vq3;
                U22 u24 = vq2.e;
                sq2.d = null;
                sq2.e = null;
                sq2.g = dDoubleValue;
                sq2.j = 4;
                objO = u24.a(enumC4164hF1, sq2);
                if (objO != mn) {
                    d2 = dDoubleValue;
                }
                return mn;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d2 = sq2.g;
            C1795Pt1.b(objO);
        }
        dDoubleValue2 = ((Number) objO).doubleValue();
        if (d2 < dDoubleValue2) {
            d2 = dDoubleValue2;
        }
        return new Long((long) d2);
        EnumC4164hF1 enumC4164hF4 = (EnumC4164hF1) objO;
        GP1 gp1 = vq.a.b;
        sq2.d = vq;
        sq2.e = enumC4164hF4;
        sq2.j = 2;
        Object objA = C7236vf0.a(gp1, sq2);
        if (objA != mn) {
            enumC4164hF1 = enumC4164hF4;
            vq2 = vq;
            objO = objA;
            d = ((FF) objO).k;
            vq2.getClass();
            iOrdinal = enumC4164hF1.ordinal();
            c4923kf = vq2.a;
            if (iOrdinal != 0) {
                c6945uG = (C6945uG) c4923kf.k.getValue();
                if (c6945uG != null) {
                    str = c6945uG.h;
                } else {
                    str = null;
                }
            } else {
                if (iOrdinal == 1) {
                    throw new C6489s51();
                }
                c6945uG2 = (C6945uG) c4923kf.k.getValue();
                if (c6945uG2 != null) {
                    str = c6945uG2.g;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase == null) {
                    str2 = "usd";
                } else {
                    str2 = lowerCase;
                }
            } else {
                str2 = "usd";
            }
            if (str2.equals("usd")) {
                dDoubleValue = d;
                U22 u25 = vq2.e;
                sq2.d = null;
                sq2.e = null;
                sq2.g = dDoubleValue;
                sq2.j = 4;
                objO = u25.a(enumC4164hF1, sq2);
                if (objO != mn) {
                    d2 = dDoubleValue;
                    dDoubleValue2 = ((Number) objO).doubleValue();
                    if (d2 < dDoubleValue2) {
                        d2 = dDoubleValue2;
                    }
                    return new Long((long) d2);
                }
            } else {
                sq2.d = vq2;
                sq2.e = enumC4164hF1;
                sq2.g = d;
                sq2.j = 3;
                objO = vq2.f.a("usd", d, str2, sq2);
                if (objO != mn) {
                    dDoubleValue = d;
                    enumC4164hF2 = enumC4164hF1;
                    vq3 = vq2;
                    d3 = (Double) objO;
                    if (d3 != null) {
                        dDoubleValue = d3.doubleValue();
                    }
                    enumC4164hF1 = enumC4164hF2;
                    vq2 = vq3;
                    U22 u26 = vq2.e;
                    sq2.d = null;
                    sq2.e = null;
                    sq2.g = dDoubleValue;
                    sq2.j = 4;
                    objO = u26.a(enumC4164hF1, sq2);
                    if (objO != mn) {
                        d2 = dDoubleValue;
                        dDoubleValue2 = ((Number) objO).doubleValue();
                        if (d2 < dDoubleValue2) {
                            d2 = dDoubleValue2;
                        }
                        return new Long((long) d2);
                    }
                }
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull LM lm) {
        TQ tq;
        VQ vq;
        if (lm instanceof TQ) {
            tq = (TQ) lm;
            int i = tq.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                tq.h = i - Integer.MIN_VALUE;
            } else {
                tq = new TQ(this, lm);
            }
        } else {
            tq = new TQ(this, lm);
        }
        Object objO = tq.e;
        MN mn = MN.d;
        int i2 = tq.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<EnumC4164hF1> interfaceC6396rf0K = this.b.k();
            tq.d = this;
            tq.h = 1;
            objO = C4466ii.o(interfaceC6396rf0K, tq);
            if (objO == mn) {
                return mn;
            }
            vq = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vq = tq.d;
            C1795Pt1.b(objO);
        }
        long j = 1000;
        if (objO != EnumC4164hF1.g ? ((MF) vq.a.I.getValue()) != null : ((MF) vq.a.H.getValue()) != null) {
            j = 0;
        }
        return new Long(j);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull EnumC4164hF1 enumC4164hF1, @NotNull LM lm) {
        UQ uq;
        VQ vq;
        Long l;
        VQ vq2;
        long jLongValue;
        C6945uG c6945uG;
        Double dValueOf;
        Long l2;
        long jLongValue2;
        double d;
        if (lm instanceof UQ) {
            uq = (UQ) lm;
            int i = uq.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                uq.i = i - Integer.MIN_VALUE;
            } else {
                uq = new UQ(this, lm);
            }
        } else {
            uq = new UQ(this, lm);
        }
        Object objO = uq.g;
        MN mn = MN.d;
        int i2 = uq.i;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            if (enumC4164hF1 == EnumC4164hF1.g) {
                InterfaceC6396rf0<Long> interfaceC6396rf0K = this.d.k();
                uq.d = this;
                uq.e = enumC4164hF1;
                uq.i = 1;
                objO = C4466ii.o(interfaceC6396rf0K, uq);
                if (objO != mn) {
                    vq = this;
                    l = (Long) objO;
                }
            } else {
                InterfaceC6396rf0<Long> interfaceC6396rf0K2 = this.c.k();
                uq.d = this;
                uq.e = enumC4164hF1;
                uq.i = 2;
                objO = C4466ii.o(interfaceC6396rf0K2, uq);
                if (objO != mn) {
                    vq = this;
                    l = (Long) objO;
                }
            }
            return mn;
        }
        if (i2 == 1) {
            enumC4164hF1 = uq.e;
            vq = uq.d;
            C1795Pt1.b(objO);
            l = (Long) objO;
        } else if (i2 == 2) {
            enumC4164hF1 = uq.e;
            vq = uq.d;
            C1795Pt1.b(objO);
            l = (Long) objO;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enumC4164hF1 = uq.e;
            vq2 = uq.d;
            C1795Pt1.b(objO);
        }
        vq = vq2;
        jLongValue = ((Number) objO).longValue();
        c6945uG = (C6945uG) vq.a.k.getValue();
        if (c6945uG == null) {
            dValueOf = null;
        } else {
            if (enumC4164hF1 == EnumC4164hF1.g) {
                d = c6945uG.k;
            } else {
                d = c6945uG.j;
            }
            if (d == 0.0d) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(d);
            }
        }
        l2 = dValueOf != null ? new Long((long) dValueOf.doubleValue()) : null;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
            if (jLongValue > jLongValue2) {
                jLongValue = jLongValue2;
            }
        }
        return new Long(jLongValue);
        if (l == null) {
            uq.d = vq;
            uq.e = enumC4164hF1;
            uq.i = 3;
            objO = vq.a(uq);
            if (objO != mn) {
                vq2 = vq;
                vq = vq2;
                jLongValue = ((Number) objO).longValue();
            }
            return mn;
        }
        jLongValue = l.longValue();
        c6945uG = (C6945uG) vq.a.k.getValue();
        if (c6945uG == null) {
            dValueOf = null;
        } else {
            if (enumC4164hF1 == EnumC4164hF1.g) {
                d = c6945uG.k;
            } else {
                d = c6945uG.j;
            }
            if (d == 0.0d) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(d);
            }
        }
        if (dValueOf != null) {
        }
        if (l2 != null) {
            jLongValue2 = l2.longValue();
            if (jLongValue > jLongValue2) {
                jLongValue = jLongValue2;
            }
        }
        return new Long(jLongValue);
    }
}

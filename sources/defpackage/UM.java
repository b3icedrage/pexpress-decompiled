package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class UM implements OM {

    @NotNull
    public final InterfaceC7816yQ a;

    @NotNull
    public final EQ b;

    @NotNull
    public final PM c;

    @Nullable
    public NF d;

    @Nullable
    public Long e;

    public UM(@NotNull InterfaceC7816yQ currencyRepository, @NotNull EQ currencySignProvider) {
        Intrinsics.checkNotNullParameter(currencyRepository, "currencyRepository");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        PM elapsedMs = new PM();
        Intrinsics.checkNotNullParameter(currencyRepository, "currencyRepository");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        Intrinsics.checkNotNullParameter(elapsedMs, "elapsedMs");
        this.a = currencyRepository;
        this.b = currencySignProvider;
        this.c = elapsedMs;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.OM
    @Nullable
    public final Object a(@NotNull String currencyCode, double d, @NotNull String currencyCode2, @NotNull LM lm) {
        RM rm;
        if (lm instanceof RM) {
            rm = (RM) lm;
            int i = rm.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                rm.j = i - Integer.MIN_VALUE;
            } else {
                rm = new RM(this, lm);
            }
        } else {
            rm = new RM(this, lm);
        }
        Object objD = rm.h;
        Object obj = MN.d;
        int i2 = rm.j;
        if (i2 == 0) {
            C1795Pt1.b(objD);
            rm.d = currencyCode;
            rm.e = currencyCode2;
            rm.g = d;
            rm.j = 1;
            objD = d(rm);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d = rm.g;
            currencyCode2 = rm.e;
            currencyCode = rm.d;
            C1795Pt1.b(objD);
        }
        NF nf = (NF) objD;
        nf.getClass();
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Locale locale = Locale.ROOT;
        String lowerCase = currencyCode.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Map<String, Double> map = nf.b;
        Double d2 = map.get(lowerCase);
        if (d2 == null) {
            return null;
        }
        double dDoubleValue = d2.doubleValue();
        Intrinsics.checkNotNullParameter(currencyCode2, "currencyCode");
        String lowerCase2 = currencyCode2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        Double d3 = map.get(lowerCase2);
        if (d3 == null) {
            return null;
        }
        double dDoubleValue2 = (d3.doubleValue() * d) / dDoubleValue;
        double d4 = 1.0d;
        for (int i3 = 0; i3 < 2; i3++) {
            d4 *= (double) 10;
        }
        return new Double(Math.rint(dDoubleValue2 * d4) / d4);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.OM
    @Nullable
    public final Object b(@Nullable Double d, @NotNull LM lm) {
        SM sm;
        UM um;
        if (lm instanceof SM) {
            sm = (SM) lm;
            int i = sm.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                sm.i = i - Integer.MIN_VALUE;
            } else {
                sm = new SM(this, lm);
            }
        } else {
            sm = new SM(this, lm);
        }
        SM sm2 = sm;
        Object objA = sm2.g;
        MN mn = MN.d;
        int i2 = sm2.i;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            if (d == null) {
                return null;
            }
            sm2.d = this;
            sm2.e = d;
            sm2.i = 1;
            objA = this.b.a(false, sm2);
            if (objA != mn) {
                um = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objA);
            return objA;
        }
        d = sm2.e;
        um = sm2.d;
        C1795Pt1.b(objA);
        double dDoubleValue = d.doubleValue();
        sm2.d = null;
        sm2.e = null;
        sm2.i = 2;
        Object objC = um.c((String) objA, dDoubleValue, "usd", sm2);
        return objC == mn ? mn : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.OM
    @Nullable
    public final Object c(@NotNull String currencyCode, double d, @NotNull String currencyCode2, @NotNull LM lm) {
        QM qm;
        if (lm instanceof QM) {
            qm = (QM) lm;
            int i = qm.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                qm.j = i - Integer.MIN_VALUE;
            } else {
                qm = new QM(this, lm);
            }
        } else {
            qm = new QM(this, lm);
        }
        Object objD = qm.h;
        Object obj = MN.d;
        int i2 = qm.j;
        if (i2 == 0) {
            C1795Pt1.b(objD);
            qm.d = currencyCode;
            qm.e = currencyCode2;
            qm.g = d;
            qm.j = 1;
            objD = d(qm);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d = qm.g;
            currencyCode2 = qm.e;
            currencyCode = qm.d;
            C1795Pt1.b(objD);
        }
        NF nf = (NF) objD;
        nf.getClass();
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        LinkedHashMap linkedHashMap = nf.a;
        Locale locale = Locale.ROOT;
        String lowerCase = currencyCode.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Double d2 = (Double) linkedHashMap.get(lowerCase);
        if (d2 == null) {
            return null;
        }
        double dDoubleValue = d2.doubleValue();
        Intrinsics.checkNotNullParameter(currencyCode2, "currencyCode");
        String lowerCase2 = currencyCode2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        Double d3 = (Double) linkedHashMap.get(lowerCase2);
        if (d3 == null) {
            return null;
        }
        double dDoubleValue2 = (d3.doubleValue() * d) / dDoubleValue;
        double d4 = 1.0d;
        for (int i3 = 0; i3 < 2; i3++) {
            d4 *= (double) 10;
        }
        return new Double(Math.rint(dDoubleValue2 * d4) / d4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(LM lm) {
        TM tm;
        UM um;
        if (lm instanceof TM) {
            tm = (TM) lm;
            int i = tm.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                tm.h = i - Integer.MIN_VALUE;
            } else {
                tm = new TM(this, lm);
            }
        } else {
            tm = new TM(this, lm);
        }
        Object objA = tm.e;
        MN mn = MN.d;
        int i2 = tm.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            NF nf = this.d;
            if (nf != null) {
                return nf;
            }
            Long l = this.e;
            if (l != null && ((Number) this.c.invoke()).longValue() - l.longValue() < 30000) {
                return new NF(PW0.c(), PW0.c());
            }
            tm.d = this;
            tm.h = 1;
            objA = this.a.a(tm);
            if (objA == mn) {
                return mn;
            }
            um = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            um = tm.d;
            C1795Pt1.b(objA);
        }
        NF nf2 = (NF) CommonResultKt.b((CommonResult) objA);
        if (nf2 == null) {
            um.e = (Long) um.c.invoke();
            return new NF(PW0.c(), PW0.c());
        }
        um.e = null;
        um.d = nf2;
        return nf2;
    }
}

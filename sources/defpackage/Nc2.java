package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Nc2 implements Lc2 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final U22 b;

    @NotNull
    public final O3 c;

    public Nc2(@NotNull C4923kf appDataRepository, @NotNull U22 tradingDefaultsProvider, @NotNull O3 accountModeSelectionUseCase) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(tradingDefaultsProvider, "tradingDefaultsProvider");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        this.a = appDataRepository;
        this.b = tradingDefaultsProvider;
        this.c = accountModeSelectionUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.Lc2
    @Nullable
    public final Object a(double d, @NotNull LM lm) {
        Mc2 mc2;
        Nc2 nc2;
        double d2;
        double d3;
        double dDoubleValue;
        if (lm instanceof Mc2) {
            mc2 = (Mc2) lm;
            int i = mc2.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                mc2.j = i - Integer.MIN_VALUE;
            } else {
                mc2 = new Mc2(this, lm);
            }
        } else {
            mc2 = new Mc2(this, lm);
        }
        Object objA = mc2.h;
        MN mn = MN.d;
        int i2 = mc2.j;
        if (i2 != 0) {
            if (i2 == 1) {
                d = mc2.e;
                nc2 = mc2.d;
                C1795Pt1.b(objA);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d3 = mc2.g;
                d2 = mc2.e;
                C1795Pt1.b(objA);
            }
            dDoubleValue = ((Number) objA).doubleValue();
            if (d2 > dDoubleValue) {
                d3 = dDoubleValue;
            } else if (d2 >= d3) {
                d3 = d2;
            }
            return new Double(d3);
        }
        C1795Pt1.b(objA);
        EnumC4164hF1 enumC4164hF1 = (EnumC4164hF1) this.c.l().d.getValue();
        EnumC4164hF1 enumC4164hF2 = EnumC4164hF1.h;
        double d4 = 0.0d;
        C4923kf c4923kf = this.a;
        if (enumC4164hF1 == enumC4164hF2) {
            C6945uG c6945uG = (C6945uG) c4923kf.k.getValue();
            if (c6945uG != null) {
                d4 = c6945uG.j;
            }
        } else {
            C6945uG c6945uG2 = (C6945uG) c4923kf.k.getValue();
            if (c6945uG2 != null) {
                d4 = c6945uG2.k;
            }
        }
        if (d4 <= d) {
            d = d4;
        }
        mc2.d = this;
        mc2.e = d;
        mc2.j = 1;
        objA = this.b.a(null, mc2);
        if (objA != mn) {
            nc2 = this;
        }
        return mn;
        double dDoubleValue2 = ((Number) objA).doubleValue();
        U22 u22 = nc2.b;
        mc2.d = null;
        mc2.e = d;
        mc2.g = dDoubleValue2;
        mc2.j = 2;
        objA = u22.d(mc2);
        if (objA != mn) {
            d2 = d;
            d3 = dDoubleValue2;
            dDoubleValue = ((Number) objA).doubleValue();
            if (d2 > dDoubleValue) {
                d3 = dDoubleValue;
            } else if (d2 >= d3) {
                d3 = d2;
            }
            return new Double(d3);
        }
        return mn;
    }

    @Override // defpackage.Lc2
    public final double b(double d) {
        if (d > 9.99999999E8d) {
            return 9.99999999E8d;
        }
        if (d < 1.0d) {
            return 1.0d;
        }
        return d;
    }
}

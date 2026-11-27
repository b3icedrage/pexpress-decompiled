package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6712t82 {
    public final double a;
    public final int b;
    public final double c;

    public C6712t82(double d, int i, double d2) {
        this.a = d;
        this.b = i;
        this.c = d2;
    }

    @NotNull
    public String toString() {
        StringBuilder sbB = C6495s7.b("AmountChangedCalculationParams(assetPercent = ", C3476e.t(this.a), ", previousAmount = ");
        sbB.append(this.b);
        sbB.append(", overallProfit = ");
        sbB.append(this.c);
        sbB.append(")");
        return sbB.toString();
    }
}

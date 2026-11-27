package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class S9 extends C6712t82 {
    public final double d;

    public S9(double d, int i, double d2, double d3) {
        super(d, i, d3);
        this.d = d2;
    }

    @Override // defpackage.C6712t82
    @NotNull
    public final String toString() {
        StringBuilder sbB = C6495s7.b("AmountChangedCalculationParams(assetPercent = ", C3476e.t(this.a), ", previousAmount = ");
        sbB.append(this.b);
        sbB.append(", profitChange = ");
        sbB.append(this.d);
        sbB.append(", overallProfit = ");
        sbB.append(this.c);
        sbB.append(")");
        return sbB.toString();
    }
}

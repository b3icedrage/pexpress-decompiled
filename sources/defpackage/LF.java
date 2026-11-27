package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class LF {
    public final int a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;
    public final int d;
    public final int e;

    public LF(int i, int i2, int i3, String code, String symbol) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.a = i;
        this.b = code;
        this.c = symbol;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LF)) {
            return false;
        }
        LF lf = (LF) obj;
        return this.a == lf.a && Intrinsics.a(this.b, lf.b) && Intrinsics.a(this.c, lf.c) && this.d == lf.d && this.e == lf.e && Double.compare(0.0d, 0.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(0.0d) + EF0.a(-1, C2983be.a(C2983be.a(EF0.a(this.e, EF0.a(this.d, C1039Gc0.b(C1039Gc0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), false, 31), false, 31), 961);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonCurrency(id=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", symbol=");
        sb.append(this.c);
        sb.append(", recommendOptimalDepositValue=");
        sb.append(this.d);
        sb.append(", recommendAggressiveDepositValue=");
        return SK.b(sb, this.e, ", validForRegistration=false, defaultForRegistration=false, orderAtRegistration=-1, currencyInfo=null, defaultDemoBalance=0.0)");
    }
}

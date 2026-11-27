package defpackage;

import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7606xQ {

    @NotNull
    public final String a;
    public final double b;
    public final int c;

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    public C7606xQ() {
        this(null, 0.0d, 31);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7606xQ)) {
            return false;
        }
        C7606xQ c7606xQ = (C7606xQ) obj;
        return Intrinsics.a(this.a, c7606xQ.a) && Double.compare(this.b, c7606xQ.b) == 0 && this.c == c7606xQ.c && Intrinsics.a(this.d, c7606xQ.d) && Intrinsics.a(this.e, c7606xQ.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + C1039Gc0.b(EF0.a(this.c, ID.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CurrencyNumberWithColor(currencyCode=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", color=");
        sb.append(this.c);
        sb.append(", sign=");
        sb.append(this.d);
        sb.append(", profitPercent=");
        return C5807oq.b(sb, this.e, ")");
    }

    public /* synthetic */ C7606xQ(String str, double d, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, R.color.robotCurrentInvestmentNotPositiveProfitText, "", "");
    }

    public C7606xQ(@NotNull String currencyCode, double d, int i, @NotNull String sign, @NotNull String profitPercent) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(profitPercent, "profitPercent");
        this.a = currencyCode;
        this.b = d;
        this.c = i;
        this.d = sign;
        this.e = profitPercent;
    }
}

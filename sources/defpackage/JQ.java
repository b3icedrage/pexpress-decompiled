package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class JQ {
    public final long a;
    public final long b;
    public final int c;

    @NotNull
    public final String d;

    @NotNull
    public final H32.a e;

    @NotNull
    public final String f;
    public double g;
    public double h;
    public double i;

    @NotNull
    public String j;
    public long k;
    public final long l;

    public /* synthetic */ JQ(long j, long j2, int i, String str, H32.a aVar, String str2, double d) {
        this(j, j2, i, str, aVar, str2, d, Double.NaN, Double.NaN, "", -1L);
    }

    public static JQ a(JQ jq, double d) {
        long j = jq.a;
        long j2 = jq.b;
        int i = jq.c;
        String priceSign = jq.d;
        H32.a direction = jq.e;
        String tradingId = jq.f;
        double d2 = jq.g;
        double d3 = jq.h;
        String assetId = jq.j;
        long j3 = jq.k;
        jq.getClass();
        Intrinsics.checkNotNullParameter(priceSign, "priceSign");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(tradingId, "tradingId");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        return new JQ(j, j2, i, priceSign, direction, tradingId, d2, d3, d, assetId, j3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JQ)) {
            return false;
        }
        JQ jq = (JQ) obj;
        return this.a == jq.a && this.b == jq.b && this.c == jq.c && Intrinsics.a(this.d, jq.d) && this.e == jq.e && Intrinsics.a(this.f, jq.f) && Double.compare(this.g, jq.g) == 0 && Double.compare(this.h, jq.h) == 0 && Double.compare(this.i, jq.i) == 0 && Intrinsics.a(this.j, jq.j) && this.k == jq.k;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + C1039Gc0.b(ID.a(this.i, ID.a(this.h, ID.a(this.g, C1039Gc0.b((this.e.hashCode() + C1039Gc0.b(EF0.a(this.c, C5491nL.a(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f), 31), 31), 31), 31, this.j);
    }

    @NotNull
    public final String toString() {
        return "CurrentBet(startTimeMillis=" + this.a + ", endTimeMillis=" + this.b + ", priceValue=" + this.c + ", priceSign=" + this.d + ", direction=" + this.e + ", tradingId=" + this.f + ", betValueStart=" + this.g + ", betValueEnd=" + this.h + ", resultProfit=" + this.i + ", assetId=" + this.j + ", lastCandleId=" + this.k + ")";
    }

    public JQ(long j, long j2, int i, @NotNull String priceSign, @NotNull H32.a direction, @NotNull String tradingId, double d, double d2, double d3, @NotNull String assetId, long j3) {
        Intrinsics.checkNotNullParameter(priceSign, "priceSign");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(tradingId, "tradingId");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = priceSign;
        this.e = direction;
        this.f = tradingId;
        this.g = d;
        this.h = d2;
        this.i = d3;
        this.j = assetId;
        this.k = j3;
        b.a aVar = b.e;
        this.l = c.h(j2 - j, R40.MILLISECONDS);
    }
}

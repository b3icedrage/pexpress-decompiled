package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3279d22 {

    @Nullable
    public final Integer a;

    @Nullable
    public final Integer b;

    @NotNull
    public final String c;
    public final boolean d;
    public final boolean e;

    @Nullable
    public final Integer f;

    @Nullable
    public final Integer g;

    @NotNull
    public final String h;
    public final int i;
    public final double j;
    public final double k;

    @NotNull
    public final String l;

    @Nullable
    public final Double m;

    @Nullable
    public final Long n;

    @Nullable
    public final Integer o;

    @Nullable
    public final Integer p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public boolean v;
    public final boolean w;

    public C3279d22(@Nullable Integer num, @Nullable Integer num2, @NotNull String title, boolean z, boolean z2, @Nullable Integer num3, @Nullable Integer num4, @NotNull String imageUrl, int i, double d, double d2, @NotNull String symbol, @Nullable Double d3, @Nullable Long l, @Nullable Integer num5, @Nullable Integer num6, int i2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.a = num;
        this.b = num2;
        this.c = title;
        this.d = z;
        this.e = z2;
        this.f = num3;
        this.g = num4;
        this.h = imageUrl;
        this.i = i;
        this.j = d;
        this.k = d2;
        this.l = symbol;
        this.m = d3;
        this.n = l;
        this.o = num5;
        this.p = num6;
        this.q = i2;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        this.u = z6;
        this.v = z7;
        this.w = z8;
    }

    public static C3279d22 a(C3279d22 c3279d22, boolean z, boolean z2) {
        Double d = c3279d22.m;
        Long l = c3279d22.n;
        boolean z3 = c3279d22.r;
        boolean z4 = c3279d22.s;
        boolean z5 = c3279d22.t;
        String title = c3279d22.c;
        Intrinsics.checkNotNullParameter(title, "title");
        String imageUrl = c3279d22.h;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        String symbol = c3279d22.l;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new C3279d22(c3279d22.a, c3279d22.b, title, c3279d22.d, c3279d22.e, c3279d22.f, c3279d22.g, imageUrl, c3279d22.i, c3279d22.j, c3279d22.k, symbol, d, l, c3279d22.o, c3279d22.p, c3279d22.q, z3, z4, z5, z, z2, c3279d22.w);
    }

    @Nullable
    public final String b() {
        if (!this.e) {
            return null;
        }
        return this.g + "%";
    }

    @Nullable
    public final String c() {
        if (!this.d) {
            return null;
        }
        return this.f + "%";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3279d22)) {
            return false;
        }
        C3279d22 c3279d22 = (C3279d22) obj;
        return Intrinsics.a(this.a, c3279d22.a) && Intrinsics.a(this.b, c3279d22.b) && Intrinsics.a(this.c, c3279d22.c) && this.d == c3279d22.d && this.e == c3279d22.e && Intrinsics.a(this.f, c3279d22.f) && Intrinsics.a(this.g, c3279d22.g) && Intrinsics.a(this.h, c3279d22.h) && this.i == c3279d22.i && Double.compare(this.j, c3279d22.j) == 0 && Double.compare(this.k, c3279d22.k) == 0 && Intrinsics.a(this.l, c3279d22.l) && Intrinsics.a(this.m, c3279d22.m) && Intrinsics.a(this.n, c3279d22.n) && Intrinsics.a(this.o, c3279d22.o) && Intrinsics.a(this.p, c3279d22.p) && this.q == c3279d22.q && this.r == c3279d22.r && this.s == c3279d22.s && this.t == c3279d22.t && this.u == c3279d22.u && this.v == c3279d22.v && this.w == c3279d22.w;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iA = C2983be.a(C2983be.a(C1039Gc0.b((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.c), this.d, 31), this.e, 31);
        Integer num3 = this.f;
        int iHashCode2 = (iA + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.g;
        int iB = C1039Gc0.b(ID.a(this.k, ID.a(this.j, EF0.a(this.i, C1039Gc0.b((iHashCode2 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.h), 31), 31), 31), 961, this.l);
        Double d = this.m;
        int iHashCode3 = (iB + (d == null ? 0 : d.hashCode())) * 31;
        Long l = this.n;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num5 = this.o;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.p;
        return Boolean.hashCode(this.w) + C2983be.a(C2983be.a(C2983be.a(C2983be.a(C2983be.a(EF0.a(this.q, (iHashCode5 + (num6 != null ? num6.hashCode() : 0)) * 31, 31), this.r, 31), this.s, 31), this.t, 31), this.u, 31), this.v, 31);
    }

    @NotNull
    public final String toString() {
        boolean z = this.v;
        StringBuilder sb = new StringBuilder("TradingAsset(id=");
        sb.append(this.a);
        sb.append(", binaryId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", isActive=");
        sb.append(this.d);
        sb.append(", isBinaryActive=");
        sb.append(this.e);
        sb.append(", percents=");
        sb.append(this.f);
        sb.append(", binaryPercents=");
        sb.append(this.g);
        sb.append(", imageUrl=");
        sb.append(this.h);
        sb.append(", thumbnailId=");
        sb.append(this.i);
        sb.append(", minBet=");
        sb.append(this.j);
        sb.append(", maxBet=");
        sb.append(this.k);
        sb.append(", symbol=");
        sb.append(this.l);
        sb.append(", mode=null, rate=");
        sb.append(this.m);
        sb.append(", strikeTime=");
        sb.append(this.n);
        sb.append(", expirationCount=");
        sb.append(this.o);
        sb.append(", expirationStep=");
        sb.append(this.p);
        sb.append(", purchaseTime=");
        sb.append(this.q);
        sb.append(", validOneMinute=");
        sb.append(this.r);
        sb.append(", validFiveMinute=");
        sb.append(this.s);
        sb.append(", validFifteenMinutes=");
        sb.append(this.t);
        sb.append(", isDisabled=");
        sb.append(this.u);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append(", isSupportedByIndicatorsBackend=");
        return C2983be.b(sb, this.w, ")");
    }

    public /* synthetic */ C3279d22(Integer num, Integer num2, String str, boolean z, boolean z2, Integer num3, Integer num4, String str2, int i, double d, double d2, String str3, Integer num5, Integer num6, int i2, boolean z3, boolean z4, boolean z5, boolean z6, int i3) {
        this(num, num2, str, z, z2, (i3 & 32) != 0 ? null : num3, (i3 & 64) != 0 ? null : num4, str2, i, d, d2, str3, null, null, (i3 & 32768) != 0 ? null : num5, (i3 & 65536) != 0 ? null : num6, (i3 & 131072) != 0 ? 30 : i2, (i3 & 262144) != 0 ? false : z3, (i3 & 524288) != 0 ? false : z4, (i3 & 1048576) != 0 ? false : z5, false, false, z6);
    }
}

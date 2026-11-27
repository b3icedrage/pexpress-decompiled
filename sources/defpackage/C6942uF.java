package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6942uF {

    @Nullable
    public final Integer a;

    @Nullable
    public final Integer b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final boolean i;

    @Nullable
    public final Integer j;
    public final boolean k;
    public final int l;

    @NotNull
    public final String m;
    public final boolean n;

    @Nullable
    public final Integer o;

    @NotNull
    public final List<e> p;

    @NotNull
    public final List<e> q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    @NotNull
    public final C5863p60 u;

    @Nullable
    public final a v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: uF$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] g;

        static {
            a aVar = new a("Crypto", 0);
            d = aVar;
            a aVar2 = new a("Other", 1);
            e = aVar2;
            a[] aVarArr = {aVar, aVar2};
            g = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) g.clone();
        }
    }

    public C6942uF() {
        throw null;
    }

    public C6942uF(Integer num, String name, String symbol, int i, boolean z, Integer num2, boolean z2, Integer num3, boolean z3, boolean z4, boolean z5, a aVar) {
        C5653o60 binarySchedule = C5653o60.d;
        C5863p60 amounts = PW0.c();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter("", "image");
        Intrinsics.checkNotNullParameter(binarySchedule, "schedule");
        Intrinsics.checkNotNullParameter(binarySchedule, "binarySchedule");
        Intrinsics.checkNotNullParameter(amounts, "amounts");
        this.a = num;
        this.b = num;
        this.c = name;
        this.d = symbol;
        this.e = i;
        this.f = true;
        this.g = 2;
        this.h = 100;
        this.i = z;
        this.j = num2;
        this.k = true;
        this.l = 30;
        this.m = "";
        this.n = z2;
        this.o = num3;
        this.p = binarySchedule;
        this.q = binarySchedule;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        this.u = amounts;
        this.v = aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6942uF)) {
            return false;
        }
        C6942uF c6942uF = (C6942uF) obj;
        return Intrinsics.a(this.a, c6942uF.a) && Intrinsics.a(this.b, c6942uF.b) && Intrinsics.a(this.c, c6942uF.c) && Intrinsics.a(this.d, c6942uF.d) && this.e == c6942uF.e && this.f == c6942uF.f && this.g == c6942uF.g && this.h == c6942uF.h && this.i == c6942uF.i && Intrinsics.a(this.j, c6942uF.j) && this.k == c6942uF.k && this.l == c6942uF.l && Intrinsics.a(this.m, c6942uF.m) && this.n == c6942uF.n && Intrinsics.a(this.o, c6942uF.o) && Intrinsics.a(this.p, c6942uF.p) && Intrinsics.a(this.q, c6942uF.q) && this.r == c6942uF.r && this.s == c6942uF.s && this.t == c6942uF.t && Intrinsics.a(this.u, c6942uF.u) && this.v == c6942uF.v;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iA = C2983be.a(EF0.a(this.h, EF0.a(0, EF0.a(this.g, C2983be.a(EF0.a(this.e, C1039Gc0.b(C1039Gc0.b((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.c), 31, this.d), 31), this.f, 31), 31), 31), 31), this.i, 31);
        Integer num3 = this.j;
        int iA2 = C2983be.a(C1039Gc0.b(EF0.a(0, EF0.a(0, EF0.a(this.l, EF0.a(0, EF0.a(0, C2983be.a((iA + (num3 == null ? 0 : num3.hashCode())) * 923521, this.k, 31), 31), 31), 31), 31), 31), 31, this.m), this.n, 31);
        Integer num4 = this.o;
        int iHashCode2 = Boolean.hashCode(this.t) + C2983be.a(C2983be.a(EF0.a(0, C5491nL.b(C5491nL.b((iA2 + (num4 == null ? 0 : num4.hashCode())) * 961, 31, this.p), 31, this.q), 31), this.r, 31), this.s, 31);
        this.u.getClass();
        int i = iHashCode2 * 961;
        a aVar = this.v;
        return Boolean.hashCode(false) + ((i + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "CommonAsset(id=" + this.a + ", baseId=" + this.b + ", name=" + this.c + ", symbol=" + this.d + ", isActive=" + this.e + ", isVisible=" + this.f + ", modeId=" + this.g + ", minProfit=0, maxProfit=" + this.h + ", isValid=" + this.i + ", profit=" + this.j + ", mode=null, rate=null, strikeTime=null, isSupportedByIndicators=" + this.k + ", expirationStep=0, expirationCount=0, purchaseTime=" + this.l + ", minBet=0, maxBet=0, image=" + this.m + ", isBinaryValid=" + this.n + ", binaryProfit=" + this.o + ", binaryId=null, schedule=" + this.p + ", binarySchedule=" + this.q + ", binaryActive=0, validOneMinute=" + this.r + ", validFiveMinute=" + this.s + ", validFifteenMinutes=" + this.t + ", amounts=" + this.u + ", group=" + this.v + ", hasInvalidName=false)";
    }
}

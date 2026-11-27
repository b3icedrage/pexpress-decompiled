package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class FF {

    @NotNull
    public final String A;

    @Nullable
    public final String B;

    @NotNull
    public final Object C;
    public final boolean D;
    public final boolean E;

    @NotNull
    public final String F;

    @NotNull
    public final List<Integer> G;

    @Nullable
    public final String H;
    public final boolean I;
    public final boolean J;
    public final int K;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    @NotNull
    public final String e;

    @NotNull
    public final String f;

    @NotNull
    public final String g;

    @Nullable
    public final String h;

    @NotNull
    public final String i;
    public final int j;
    public final int k;

    @NotNull
    public final String l;

    @NotNull
    public final String m;

    @NotNull
    public final String n;

    @Nullable
    public final String o;

    @Nullable
    public final String p;

    @NotNull
    public final Object q;

    @NotNull
    public final Object r;
    public final boolean s;

    @Nullable
    public final String t;

    @Nullable
    public final String u;

    @Nullable
    public final String v;

    @NotNull
    public final Map<C6141qR1, Integer> w;

    @NotNull
    public final Map<C6141qR1, Integer> x;

    @NotNull
    public final Map<String, Integer> y;

    @NotNull
    public final C7362wF z;

    public FF(boolean z, boolean z2, boolean z3, boolean z4, @NotNull String affiliateId, @NotNull String country, @NotNull String domain, @Nullable String str, @NotNull String loginUrl, int i, int i2, @NotNull String lastAppVersion, @NotNull String minAppVersion, @NotNull String lastStubVersion, @Nullable String str2, @Nullable String str3, @NotNull List<C5686oG> serversList, @NotNull List<LF> currencies, boolean z5, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull Map<C6141qR1, Integer> strategiesAmounts, @NotNull Map<C6141qR1, Integer> doubleStrategiesAmounts, @NotNull Map<String, Integer> recommendedDeposit, @NotNull C7362wF accountTransitionEvent, @NotNull String jivoKey, @Nullable String str7, @NotNull List<C4818k80> events, boolean z6, boolean z7, @NotNull String affiliateIdGetProfit, @NotNull List<Integer> filterAssetId, @Nullable String str8, boolean z8, boolean z9, int i3) {
        Intrinsics.checkNotNullParameter(affiliateId, "affiliateId");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(loginUrl, "loginUrl");
        Intrinsics.checkNotNullParameter(lastAppVersion, "lastAppVersion");
        Intrinsics.checkNotNullParameter(minAppVersion, "minAppVersion");
        Intrinsics.checkNotNullParameter(lastStubVersion, "lastStubVersion");
        Intrinsics.checkNotNullParameter(serversList, "serversList");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(strategiesAmounts, "strategiesAmounts");
        Intrinsics.checkNotNullParameter(doubleStrategiesAmounts, "doubleStrategiesAmounts");
        Intrinsics.checkNotNullParameter(recommendedDeposit, "recommendedDeposit");
        Intrinsics.checkNotNullParameter(accountTransitionEvent, "accountTransitionEvent");
        Intrinsics.checkNotNullParameter(jivoKey, "jivoKey");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(affiliateIdGetProfit, "affiliateIdGetProfit");
        Intrinsics.checkNotNullParameter(filterAssetId, "filterAssetId");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = affiliateId;
        this.f = country;
        this.g = domain;
        this.h = str;
        this.i = loginUrl;
        this.j = i;
        this.k = i2;
        this.l = lastAppVersion;
        this.m = minAppVersion;
        this.n = lastStubVersion;
        this.o = str2;
        this.p = str3;
        this.q = serversList;
        this.r = currencies;
        this.s = z5;
        this.t = str4;
        this.u = str5;
        this.v = str6;
        this.w = strategiesAmounts;
        this.x = doubleStrategiesAmounts;
        this.y = recommendedDeposit;
        this.z = accountTransitionEvent;
        this.A = jivoKey;
        this.B = str7;
        this.C = events;
        this.D = z6;
        this.E = z7;
        this.F = affiliateIdGetProfit;
        this.G = filterAssetId;
        this.H = str8;
        this.I = z8;
        this.J = z9;
        this.K = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FF)) {
            return false;
        }
        FF ff = (FF) obj;
        return this.a == ff.a && this.b == ff.b && this.c == ff.c && this.d == ff.d && this.e.equals(ff.e) && this.f.equals(ff.f) && this.g.equals(ff.g) && Intrinsics.a(this.h, ff.h) && this.i.equals(ff.i) && this.j == ff.j && this.k == ff.k && this.l.equals(ff.l) && this.m.equals(ff.m) && this.n.equals(ff.n) && Intrinsics.a(this.o, ff.o) && Intrinsics.a(this.p, ff.p) && Intrinsics.a(this.q, ff.q) && Intrinsics.a(this.r, ff.r) && this.s == ff.s && Intrinsics.a(this.t, ff.t) && Intrinsics.a(this.u, ff.u) && Intrinsics.a(this.v, ff.v) && Intrinsics.a(this.w, ff.w) && Intrinsics.a(this.x, ff.x) && this.y.equals(ff.y) && this.z.equals(ff.z) && this.A.equals(ff.A) && Intrinsics.a(this.B, ff.B) && Intrinsics.a(this.C, ff.C) && this.D == ff.D && this.E == ff.E && this.F.equals(ff.F) && Intrinsics.a(this.G, ff.G) && Intrinsics.a(this.H, ff.H) && this.I == ff.I && this.J == ff.J && this.K == ff.K;
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C2983be.a(C2983be.a(C2983be.a(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iB2 = C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(EF0.a(this.k, EF0.a(this.j, C1039Gc0.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31), 31), 31, this.l), 31, this.m), 31, this.n);
        String str2 = this.o;
        int iHashCode = (iB2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p;
        int iA = C2983be.a((this.r.hashCode() + ((this.q.hashCode() + ((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31, this.s, 31);
        String str4 = this.t;
        int iHashCode2 = (iA + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.u;
        int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.v;
        int iB3 = C1039Gc0.b(C2983be.a((this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((iHashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31)) * 31)) * 31, this.z.a, 31), 31, this.A);
        String str7 = this.B;
        int iB4 = C5491nL.b(C1039Gc0.b(C2983be.a(C2983be.a((this.C.hashCode() + ((iB3 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31, this.D, 31), this.E, 31), 31, this.F), 31, this.G);
        String str8 = this.H;
        return Integer.hashCode(this.K) + C2983be.a(C2983be.a((iB4 + (str8 != null ? str8.hashCode() : 0)) * 31, this.I, 31), this.J, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonConfig(isShow=");
        sb.append(this.a);
        sb.append(", chatIsShow=");
        sb.append(this.b);
        sb.append(", isShownStub=");
        sb.append(this.c);
        sb.append(", isVpn=");
        sb.append(this.d);
        sb.append(", affiliateId=");
        sb.append(this.e);
        sb.append(", country=");
        sb.append(this.f);
        sb.append(", domain=");
        sb.append(this.g);
        sb.append(", cookiesDomain=");
        sb.append(this.h);
        sb.append(", loginUrl=");
        sb.append(this.i);
        sb.append(", maxEarnDemo=");
        sb.append(this.j);
        sb.append(", initBet=");
        sb.append(this.k);
        sb.append(", lastAppVersion=");
        sb.append(this.l);
        sb.append(", minAppVersion=");
        sb.append(this.m);
        sb.append(", lastStubVersion=");
        sb.append(this.n);
        sb.append(", platformPackageName=");
        sb.append(this.o);
        sb.append(", platformAppLink=");
        sb.append(this.p);
        sb.append(", serversList=");
        sb.append(this.q);
        sb.append(", currencies=");
        sb.append(this.r);
        sb.append(", showNotOurUserFragment=");
        sb.append(this.s);
        sb.append(", depositUrl=");
        sb.append(this.t);
        sb.append(", depositUrlLite=");
        sb.append(this.u);
        sb.append(", withdrawUrl=");
        sb.append(this.v);
        sb.append(", strategiesAmounts=");
        sb.append(this.w);
        sb.append(", doubleStrategiesAmounts=");
        sb.append(this.x);
        sb.append(", recommendedDeposit=");
        sb.append(this.y);
        sb.append(", accountTransitionEvent=");
        sb.append(this.z);
        sb.append(", jivoKey=");
        sb.append(this.A);
        sb.append(", captchaSiteKey=");
        sb.append(this.B);
        sb.append(", events=");
        sb.append(this.C);
        sb.append(", isShowCryptoAssets=");
        sb.append(this.D);
        sb.append(", isShowCryptoPaymentMethods=");
        sb.append(this.E);
        sb.append(", affiliateIdGetProfit=");
        sb.append(this.F);
        sb.append(", filterAssetId=");
        sb.append(this.G);
        sb.append(", supportEmail=");
        sb.append(this.H);
        sb.append(", isAmplitudeEnable=");
        sb.append(this.I);
        sb.append(", isCryptoDemoTradesEnabled=");
        sb.append(this.J);
        sb.append(", cryptoDemoTradesThreshold=");
        return SK.b(sb, this.K, ")");
    }
}

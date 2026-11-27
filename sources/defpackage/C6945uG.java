package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6945uG {
    public final long a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    @NotNull
    public String f;

    @NotNull
    public final String g;

    @NotNull
    public final String h;

    @NotNull
    public final String i;
    public double j;
    public double k;
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;

    @NotNull
    public final String p;

    @NotNull
    public final List<String> q;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6945uG(long j, String str, String str2, String str3, String str4, String str5, double d, double d2, boolean z, boolean z2, String str6, ArrayList arrayList, int i) {
        String str7;
        String str8 = (i & 16) != 0 ? "$" : str4;
        if ((i & 64) != 0) {
            String upperCase = "usd".toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            str7 = upperCase;
        } else {
            str7 = str5;
        }
        String upperCase2 = "usd".toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        this(j, str, str2, str3, str8, "$", str7, upperCase2, upperCase2, d, d2, 0L, 0L, z, z2, str6, (i & 131072) != 0 ? C5653o60.d : arrayList);
    }

    public static C6945uG a(C6945uG c6945uG, String str, String str2, String str3, double d, double d2, long j, long j2, int i) {
        long j3 = c6945uG.a;
        String email = c6945uG.b;
        String nickname = (i & 4) != 0 ? c6945uG.c : str;
        String country = c6945uG.d;
        String currencySign = c6945uG.e;
        String demoCurrencySign = (i & 32) != 0 ? c6945uG.f : str2;
        String currencyCode = c6945uG.g;
        String demoCurrencyCode = (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c6945uG.h : str3;
        String recommendedDepositCurrencyCode = c6945uG.i;
        double d3 = (i & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c6945uG.j : d;
        double d4 = (i & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? c6945uG.k : d2;
        long j4 = (i & 2048) != 0 ? c6945uG.l : j;
        long j5 = (i & 4096) != 0 ? c6945uG.m : j2;
        boolean z = c6945uG.n;
        c6945uG.getClass();
        boolean z2 = c6945uG.o;
        String avatarUrl = c6945uG.p;
        List<String> serversList = c6945uG.q;
        c6945uG.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currencySign, "currencySign");
        Intrinsics.checkNotNullParameter(demoCurrencySign, "demoCurrencySign");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(demoCurrencyCode, "demoCurrencyCode");
        Intrinsics.checkNotNullParameter(recommendedDepositCurrencyCode, "recommendedDepositCurrencyCode");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(serversList, "serversList");
        String str4 = demoCurrencyCode;
        return new C6945uG(j3, email, nickname, country, currencySign, demoCurrencySign, currencyCode, str4, recommendedDepositCurrencyCode, d3, d4, j4, j5, z, z2, avatarUrl, serversList);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6945uG)) {
            return false;
        }
        C6945uG c6945uG = (C6945uG) obj;
        return this.a == c6945uG.a && Intrinsics.a(this.b, c6945uG.b) && Intrinsics.a(this.c, c6945uG.c) && Intrinsics.a(this.d, c6945uG.d) && Intrinsics.a(this.e, c6945uG.e) && Intrinsics.a(this.f, c6945uG.f) && Intrinsics.a(this.g, c6945uG.g) && Intrinsics.a(this.h, c6945uG.h) && Intrinsics.a(this.i, c6945uG.i) && Double.compare(this.j, c6945uG.j) == 0 && Double.compare(this.k, c6945uG.k) == 0 && this.l == c6945uG.l && this.m == c6945uG.m && this.n == c6945uG.n && this.o == c6945uG.o && Intrinsics.a(this.p, c6945uG.p) && Intrinsics.a(this.q, c6945uG.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + C1039Gc0.b(C2983be.a(C5491nL.a(C2983be.a(C5491nL.a(C5491nL.a(ID.a(this.k, ID.a(this.j, C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31), 31, this.l), 31, this.m), this.n, 31), 31, 0L), this.o, 31), 31, this.p);
    }

    @NotNull
    public final String toString() {
        String str = this.f;
        double d = this.j;
        double d2 = this.k;
        StringBuilder sb = new StringBuilder("CommonUser(id=");
        sb.append(this.a);
        sb.append(", email=");
        sb.append(this.b);
        sb.append(", nickname=");
        sb.append(this.c);
        sb.append(", country=");
        sb.append(this.d);
        sb.append(", currencySign=");
        C5896pG.b(sb, this.e, ", demoCurrencySign=", str, ", currencyCode=");
        sb.append(this.g);
        sb.append(", demoCurrencyCode=");
        sb.append(this.h);
        sb.append(", recommendedDepositCurrencyCode=");
        sb.append(this.i);
        sb.append(", realBalance=");
        sb.append(d);
        sb.append(", demoBalance=");
        sb.append(d2);
        sb.append(", realBalanceId=");
        sb.append(this.l);
        sb.append(", demoBalanceId=");
        sb.append(this.m);
        sb.append(", emailConfirm=");
        sb.append(this.n);
        sb.append(", registerTime=0, isVerified=");
        sb.append(this.o);
        sb.append(", avatarUrl=");
        sb.append(this.p);
        sb.append(", serversList=");
        sb.append(this.q);
        sb.append(")");
        return sb.toString();
    }

    public C6945uG(long j, @NotNull String email, @NotNull String nickname, @NotNull String country, @NotNull String currencySign, @NotNull String demoCurrencySign, @NotNull String currencyCode, @NotNull String demoCurrencyCode, @NotNull String recommendedDepositCurrencyCode, double d, double d2, long j2, long j3, boolean z, boolean z2, @NotNull String avatarUrl, @NotNull List serversList) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currencySign, "currencySign");
        Intrinsics.checkNotNullParameter(demoCurrencySign, "demoCurrencySign");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(demoCurrencyCode, "demoCurrencyCode");
        Intrinsics.checkNotNullParameter(recommendedDepositCurrencyCode, "recommendedDepositCurrencyCode");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(serversList, "serversList");
        this.a = j;
        this.b = email;
        this.c = nickname;
        this.d = country;
        this.e = currencySign;
        this.f = demoCurrencySign;
        this.g = currencyCode;
        this.h = demoCurrencyCode;
        this.i = recommendedDepositCurrencyCode;
        this.j = d;
        this.k = d2;
        this.l = j2;
        this.m = j3;
        this.n = z;
        this.o = z2;
        this.p = avatarUrl;
        this.q = serversList;
    }
}

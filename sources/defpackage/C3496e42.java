package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3496e42 {

    @NotNull
    public final EnumC2644a42 a;
    public final int b;

    @Nullable
    public final EnumC5511nR1 c;
    public final int d;
    public final int e;

    @NotNull
    public final EnumC7290vu1 f;
    public final int g;
    public final int h;
    public final int i;

    @NotNull
    public final String j;
    public final int k;
    public final boolean l;
    public final boolean m;

    @NotNull
    public final String n;

    @NotNull
    public final String o;

    @Nullable
    public final Integer p;

    public C3496e42(@NotNull EnumC2644a42 modelStrategy, int i, @Nullable EnumC5511nR1 enumC5511nR1, int i2, int i3, @NotNull EnumC7290vu1 riskLevel, int i4, int i5, int i6, @NotNull String recommendedBalanceAmount, int i7, boolean z, boolean z2, @NotNull String smallIllustrationUrl, @NotNull String bigIllustrationUrl, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(modelStrategy, "modelStrategy");
        Intrinsics.checkNotNullParameter(riskLevel, "riskLevel");
        Intrinsics.checkNotNullParameter(recommendedBalanceAmount, "recommendedBalanceAmount");
        Intrinsics.checkNotNullParameter(smallIllustrationUrl, "smallIllustrationUrl");
        Intrinsics.checkNotNullParameter(bigIllustrationUrl, "bigIllustrationUrl");
        this.a = modelStrategy;
        this.b = i;
        this.c = enumC5511nR1;
        this.d = i2;
        this.e = i3;
        this.f = riskLevel;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = recommendedBalanceAmount;
        this.k = i7;
        this.l = z;
        this.m = z2;
        this.n = smallIllustrationUrl;
        this.o = bigIllustrationUrl;
        this.p = num;
    }

    public static C3496e42 a(C3496e42 c3496e42, EnumC5511nR1 enumC5511nR1, int i, String str, boolean z, boolean z2, int i2) {
        EnumC5511nR1 enumC5511nR2 = (i2 & 4) != 0 ? c3496e42.c : enumC5511nR1;
        int i3 = (i2 & 16) != 0 ? c3496e42.e : i;
        String recommendedBalanceAmount = (i2 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c3496e42.j : str;
        boolean z3 = (i2 & 2048) != 0 ? c3496e42.l : z;
        boolean z4 = (i2 & 4096) != 0 ? c3496e42.m : z2;
        EnumC2644a42 modelStrategy = c3496e42.a;
        Intrinsics.checkNotNullParameter(modelStrategy, "modelStrategy");
        EnumC7290vu1 riskLevel = c3496e42.f;
        Intrinsics.checkNotNullParameter(riskLevel, "riskLevel");
        Intrinsics.checkNotNullParameter(recommendedBalanceAmount, "recommendedBalanceAmount");
        String smallIllustrationUrl = c3496e42.n;
        Intrinsics.checkNotNullParameter(smallIllustrationUrl, "smallIllustrationUrl");
        String bigIllustrationUrl = c3496e42.o;
        Intrinsics.checkNotNullParameter(bigIllustrationUrl, "bigIllustrationUrl");
        return new C3496e42(modelStrategy, c3496e42.b, enumC5511nR2, c3496e42.d, i3, riskLevel, c3496e42.g, c3496e42.h, c3496e42.i, recommendedBalanceAmount, c3496e42.k, z3, z4, smallIllustrationUrl, bigIllustrationUrl, c3496e42.p);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3496e42)) {
            return false;
        }
        C3496e42 c3496e42 = (C3496e42) obj;
        return this.a == c3496e42.a && this.b == c3496e42.b && this.c == c3496e42.c && this.d == c3496e42.d && this.e == c3496e42.e && this.f == c3496e42.f && this.g == c3496e42.g && this.h == c3496e42.h && this.i == c3496e42.i && Intrinsics.a(this.j, c3496e42.j) && this.k == c3496e42.k && this.l == c3496e42.l && this.m == c3496e42.m && Intrinsics.a(this.n, c3496e42.n) && Intrinsics.a(this.o, c3496e42.o) && Intrinsics.a(this.p, c3496e42.p);
    }

    public final int hashCode() {
        int iA = EF0.a(this.b, this.a.hashCode() * 31, 31);
        EnumC5511nR1 enumC5511nR1 = this.c;
        int iB = C1039Gc0.b(C1039Gc0.b(C2983be.a(C2983be.a(EF0.a(this.k, C1039Gc0.b(EF0.a(this.i, EF0.a(this.h, EF0.a(this.g, (this.f.hashCode() + EF0.a(this.e, EF0.a(this.d, (iA + (enumC5511nR1 == null ? 0 : enumC5511nR1.hashCode())) * 31, 31), 31)) * 31, 31), 31), 31), 31, this.j), 31), this.l, 31), this.m, 31), 31, this.n), 31, this.o);
        Integer num = this.p;
        return iB + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "TradingStrategyUi(modelStrategy=" + this.a + ", titleTextRes=" + this.b + ", strategyAvailability=" + this.c + ", profitabilityTextRes=" + this.d + ", descriptionTextRes=" + this.e + ", riskLevel=" + this.f + ", recommendedBalanceAtLeastTextRes=" + this.g + ", atLeastTextRes=" + this.h + ", recommendedBalanceSecondTextRes=" + this.i + ", recommendedBalanceAmount=" + this.j + ", smallIllustrationBackgroundRes=" + this.k + ", isBlocked=" + this.l + ", isSelected=" + this.m + ", smallIllustrationUrl=" + this.n + ", bigIllustrationUrl=" + this.o + ", titleTextResForInvestment=" + this.p + ")";
    }

    public /* synthetic */ C3496e42(EnumC2644a42 enumC2644a42, int i, EnumC5511nR1 enumC5511nR1, int i2, EnumC7290vu1 enumC7290vu1, int i3, String str, String str2, int i4) {
        this(enumC2644a42, i, enumC5511nR1, R.string.average_per_trade_text, i2, enumC7290vu1, R.string.recommended_balance_at_least_text, R.string.minimum_balance_text, R.string.minimum_balance_text, "-1$", i3, false, false, str, str2, (i4 & 32768) != 0 ? null : Integer.valueOf(R.string.fixed_text));
    }
}

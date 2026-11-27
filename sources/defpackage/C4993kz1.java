package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4993kz1 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final Integer d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final Double g;

    @Nullable
    public final String h;

    @Nullable
    public final Double i;

    @Nullable
    public final String j;
    public final long k;

    public C4993kz1(@NotNull String sessionId, @NotNull String accountType, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable Double d, @Nullable String str4, @Nullable Double d2, @Nullable String str5, long j) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.a = sessionId;
        this.b = accountType;
        this.c = str;
        this.d = num;
        this.e = str2;
        this.f = str3;
        this.g = d;
        this.h = str4;
        this.i = d2;
        this.j = str5;
        this.k = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4993kz1)) {
            return false;
        }
        C4993kz1 c4993kz1 = (C4993kz1) obj;
        return Intrinsics.a(this.a, c4993kz1.a) && Intrinsics.a(this.b, c4993kz1.b) && Intrinsics.a(this.c, c4993kz1.c) && Intrinsics.a(this.d, c4993kz1.d) && Intrinsics.a(this.e, c4993kz1.e) && Intrinsics.a(this.f, c4993kz1.f) && Intrinsics.a(this.g, c4993kz1.g) && Intrinsics.a(this.h, c4993kz1.h) && Intrinsics.a(this.i, c4993kz1.i) && Intrinsics.a(this.j, c4993kz1.j) && this.k == c4993kz1.k;
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.g;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d2 = this.i;
        int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str5 = this.j;
        return Long.hashCode(this.k) + ((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RobotSessionContext(sessionId=");
        sb.append(this.a);
        sb.append(", accountType=");
        sb.append(this.b);
        sb.append(", asset=");
        sb.append(this.c);
        sb.append(", timeframeS=");
        sb.append(this.d);
        sb.append(", strategyId=");
        sb.append(this.e);
        sb.append(", indicatorId=");
        sb.append(this.f);
        sb.append(", startAmount=");
        sb.append(this.g);
        sb.append(", amountCurrency=");
        sb.append(this.h);
        sb.append(", startBalance=");
        sb.append(this.i);
        sb.append(", balanceCurrency=");
        sb.append(this.j);
        sb.append(", startedAtEpochMs=");
        return C0681Bn.c(sb, this.k, ")");
    }
}

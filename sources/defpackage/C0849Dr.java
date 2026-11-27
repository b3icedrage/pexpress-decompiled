package defpackage;

import com.api.core.backend.domain.models.responseModels.AccountType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0849Dr extends AbstractC7783yF {
    public final long a;

    @NotNull
    public final InterfaceC2441Xr b;
    public final double c;

    @Nullable
    public final Double d;

    @Nullable
    public final Double e;

    @Nullable
    public final Double f;

    @Nullable
    public final AccountType g;

    public C0849Dr(long j, @NotNull InterfaceC2441Xr result, double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable AccountType accountType) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.a = j;
        this.b = result;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = accountType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0849Dr)) {
            return false;
        }
        C0849Dr c0849Dr = (C0849Dr) obj;
        return this.a == c0849Dr.a && Intrinsics.a(this.b, c0849Dr.b) && Double.compare(this.c, c0849Dr.c) == 0 && Intrinsics.a(this.d, c0849Dr.d) && Intrinsics.a(this.e, c0849Dr.e) && Intrinsics.a(this.f, c0849Dr.f) && this.g == c0849Dr.g;
    }

    public final int hashCode() {
        int iA = ID.a(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
        Double d = this.d;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        AccountType accountType = this.g;
        return iHashCode3 + (accountType != null ? accountType.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "BetClosedResponse(id=" + this.a + ", result=" + this.b + ", balanceChange=" + this.c + ", openPrice=" + this.d + ", closePrice=" + this.e + ", amount=" + this.f + ", accountType=" + this.g + ")";
    }
}

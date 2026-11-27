package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2337Wr extends AbstractC7783yF {
    public final long a;
    public final long b;
    public final long c;
    public final double d;

    @NotNull
    public final String e;
    public final double f;

    public C2337Wr(long j, long j2, long j3, double d, @NotNull String assetId, double d2) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = d;
        this.e = assetId;
        this.f = d2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2337Wr)) {
            return false;
        }
        C2337Wr c2337Wr = (C2337Wr) obj;
        return this.a == c2337Wr.a && this.b == c2337Wr.b && this.c == c2337Wr.c && Double.compare(this.d, c2337Wr.d) == 0 && Intrinsics.a(this.e, c2337Wr.e) && Double.compare(this.f, c2337Wr.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + C1039Gc0.b(ID.a(this.d, C5491nL.a(C5491nL.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    @NotNull
    public final String toString() {
        return "BetOpenedResponse(id=" + this.a + ", startTimeSeconds=" + this.b + ", expirationTimeSeconds=" + this.c + ", amount=" + this.d + ", assetId=" + this.e + ", strikeValue=" + this.f + ")";
    }
}

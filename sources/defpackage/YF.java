package defpackage;

import com.api.core.backend.domain.models.requestModels.GetCandlesToTimestampRequestApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class YF implements GetCandlesToTimestampRequestApi {

    @NotNull
    public final String a;
    public final int b;
    public final long c;
    public final long d;
    public final int e;

    public YF(int i, int i2, long j, long j2, String assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        this.a = assetId;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YF)) {
            return false;
        }
        YF yf = (YF) obj;
        return Intrinsics.a(this.a, yf.a) && this.b == yf.b && this.c == yf.c && this.d == yf.d && this.e == yf.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + C5491nL.a(EF0.a(1, C5491nL.a(EF0.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonGetCandlesToTimestampRequest(assetId=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", to=");
        sb.append(this.c);
        sb.append(", count=1, from=");
        sb.append(this.d);
        sb.append(", offset=");
        return SK.b(sb, this.e, ")");
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4189hO {

    @NotNull
    public final String a;
    public final long b;

    @NotNull
    public final String c;

    public C4189hO(long j, @NotNull String title, @NotNull String percent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(percent, "percent");
        this.a = title;
        this.b = j;
        this.c = percent;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4189hO)) {
            return false;
        }
        C4189hO c4189hO = (C4189hO) obj;
        return Intrinsics.a(this.a, c4189hO.a) && this.b == c4189hO.b && Intrinsics.a(this.c, c4189hO.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C5491nL.a(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Coupon(title=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", percent=");
        return C5807oq.b(sb, this.c, ")");
    }
}

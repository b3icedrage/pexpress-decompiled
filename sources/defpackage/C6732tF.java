package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6732tF {
    public long a;

    @NotNull
    public String b;

    @NotNull
    public String c;

    @NotNull
    public String d;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6732tF)) {
            return false;
        }
        C6732tF c6732tF = (C6732tF) obj;
        return this.a == c6732tF.a && this.b.equals(c6732tF.b) && Intrinsics.a(this.c, c6732tF.c) && Intrinsics.a(this.d, c6732tF.d);
    }

    public final int hashCode() {
        return Integer.hashCode(1) + C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonAddUserRequest(userId=");
        sb.append(this.a);
        sb.append(", country=");
        sb.append(this.b);
        sb.append(", currency=");
        sb.append(this.c);
        sb.append(", email=");
        return C5807oq.b(sb, this.d, ", isMobile=1)");
    }
}

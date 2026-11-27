package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AF {
    public long a;

    @NotNull
    public String b;

    @NotNull
    public String c;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AF)) {
            return false;
        }
        AF af = (AF) obj;
        return this.a == af.a && Intrinsics.a(this.b, af.b) && Intrinsics.a(this.c, af.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C1039Gc0.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonChangeUserDataRequest(userId=");
        sb.append(this.a);
        sb.append(", nickname=");
        sb.append(this.b);
        sb.append(", email=");
        return C5807oq.b(sb, this.c, ")");
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7549x72 {
    public final long a;
    public final long b;

    @NotNull
    public final String c;

    public C7549x72(long j, long j2, @NotNull String insight) {
        Intrinsics.checkNotNullParameter(insight, "insight");
        this.a = j;
        this.b = j2;
        this.c = insight;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7549x72)) {
            return false;
        }
        C7549x72 c7549x72 = (C7549x72) obj;
        return this.a == c7549x72.a && this.b == c7549x72.b && Intrinsics.a(this.c, c7549x72.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C5491nL.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TypingInfo(agentId=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", insight=");
        return C1039Gc0.e(sb, this.c, ')');
    }
}

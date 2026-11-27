package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2177Ur {
    public final long a;

    public C2177Ur(long j) {
        this.a = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2177Ur) && this.a == ((C2177Ur) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return "BetInfo(startTime=" + this.a + ")";
    }
}

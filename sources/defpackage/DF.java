package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class DF {

    @NotNull
    public final String a;
    public final long b;

    public DF(@NotNull String id, long j) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.a = id;
        this.b = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DF)) {
            return false;
        }
        DF df = (DF) obj;
        return Intrinsics.a(this.a, df.a) && this.b == df.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CommonClosedDeal(id=" + this.a + ", userId=" + this.b + ")";
    }
}

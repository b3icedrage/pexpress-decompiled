package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4008gX1 {

    @NotNull
    public final String a;
    public final int b;

    public C4008gX1(@NotNull String title, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.a = title;
        this.b = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4008gX1)) {
            return false;
        }
        C4008gX1 c4008gX1 = (C4008gX1) obj;
        return Intrinsics.a(this.a, c4008gX1.a) && this.b == c4008gX1.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "TabItem(title=" + this.a + ", position=" + this.b + ")";
    }
}

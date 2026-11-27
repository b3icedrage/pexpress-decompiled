package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1945Rr1 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public C1945Rr1(@NotNull String oldValue, @NotNull String newValue) {
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        this.a = oldValue;
        this.b = newValue;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1945Rr1)) {
            return false;
        }
        C1945Rr1 c1945Rr1 = (C1945Rr1) obj;
        return Intrinsics.a(this.a, c1945Rr1.a) && Intrinsics.a(this.b, c1945Rr1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplacementPair(oldValue=");
        sb.append(this.a);
        sb.append(", newValue=");
        return C5807oq.b(sb, this.b, ")");
    }
}

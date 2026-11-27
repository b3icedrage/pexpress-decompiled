package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3172cY1 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public C3172cY1(@NotNull String name, @NotNull String message) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = name;
        this.b = message;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3172cY1)) {
            return false;
        }
        C3172cY1 c3172cY1 = (C3172cY1) obj;
        return Intrinsics.a(this.a, c3172cY1.a) && Intrinsics.a(this.b, c3172cY1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextMessageArgs(name=");
        sb.append(this.a);
        sb.append(", message=");
        return C1039Gc0.e(sb, this.b, ')');
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class IF {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public IF(@NotNull String code, @NotNull String name) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = code;
        this.b = name;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IF)) {
            return false;
        }
        IF r5 = (IF) obj;
        return Intrinsics.a(this.a, r5.a) && Intrinsics.a(this.b, r5.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonCountry(code=");
        sb.append(this.a);
        sb.append(", name=");
        return C5807oq.b(sb, this.b, ")");
    }
}

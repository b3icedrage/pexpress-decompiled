package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6080q8 {

    @NotNull
    public final String a;
    public final boolean b;

    @NotNull
    public final Map<String, Object> c;

    public C6080q8(@NotNull Map data, @NotNull String message, boolean z) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = message;
        this.b = z;
        this.c = data;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6080q8)) {
            return false;
        }
        C6080q8 c6080q8 = (C6080q8) obj;
        return Intrinsics.a(this.a, c6080q8.a) && this.b == c6080q8.b && Intrinsics.a(this.c, c6080q8.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C2983be.a(this.a.hashCode() * 31, this.b, 31);
    }

    @NotNull
    public final String toString() {
        return "AfBreadcrumb(message=" + this.a + ", isWarning=" + this.b + ", data=" + this.c + ")";
    }
}

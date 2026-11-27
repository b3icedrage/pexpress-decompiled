package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class XT {
    public final long a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    public XT(long j, @NotNull String name, @NotNull String title, @NotNull String photo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(photo, "photo");
        this.a = j;
        this.b = name;
        this.c = title;
        this.d = photo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XT)) {
            return false;
        }
        XT xt = (XT) obj;
        return this.a == xt.a && Intrinsics.a(this.b, xt.b) && Intrinsics.a(this.c, xt.c) && Intrinsics.a(this.d, xt.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + C1039Gc0.b(C1039Gc0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DbAgent(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", photo=");
        return C1039Gc0.e(sb, this.d, ')');
    }
}

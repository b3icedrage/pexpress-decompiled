package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1027Fy0 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final List<C3471dy0> c;

    public C1027Fy0(@NotNull String name, @NotNull String color, @NotNull List<C3471dy0> fields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.a = name;
        this.b = color;
        this.c = fields;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1027Fy0)) {
            return false;
        }
        C1027Fy0 c1027Fy0 = (C1027Fy0) obj;
        return Intrinsics.a(this.a, c1027Fy0.a) && Intrinsics.a(this.b, c1027Fy0.b) && Intrinsics.a(this.c, c1027Fy0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        return "IndicatorParamsWithConstraints(name=" + this.a + ", color=" + this.b + ", fields=" + this.c + ")";
    }
}

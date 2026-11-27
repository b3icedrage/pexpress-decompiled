package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7725xz0 {

    @NotNull
    public final String a;

    @NotNull
    public final CR0 b;

    @NotNull
    public final List<C1027Fy0> c;

    public C7725xz0(@NotNull String name, @NotNull CR0 key, @NotNull List<C1027Fy0> paramsWithConstraints) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(paramsWithConstraints, "paramsWithConstraints");
        this.a = name;
        this.b = key;
        this.c = paramsWithConstraints;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7725xz0)) {
            return false;
        }
        C7725xz0 c7725xz0 = (C7725xz0) obj;
        return Intrinsics.a(this.a, c7725xz0.a) && this.b == c7725xz0.b && Intrinsics.a(this.c, c7725xz0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "IndicatorsManualConfigWithConstraints(name=" + this.a + ", key=" + this.b + ", paramsWithConstraints=" + this.c + ")";
    }
}

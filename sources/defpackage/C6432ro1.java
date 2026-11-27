package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ro1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6432ro1 implements OM1 {
    public final LM1 a;

    public C6432ro1(@NotNull LM1 size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.a = size;
    }

    @Override // defpackage.OM1
    @Nullable
    public final Object a(@NotNull C5170lo1 c5170lo1) {
        return this.a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6432ro1) {
            return Intrinsics.a(this.a, ((C6432ro1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "RealSizeResolver(size=" + this.a + ')';
    }
}

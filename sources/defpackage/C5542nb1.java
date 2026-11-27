package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5542nb1 implements InterfaceC7774yC {

    @NotNull
    public final Class<?> d;

    public C5542nb1(@NotNull Class<?> jClass, @NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.d = jClass;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C5542nb1) {
            return Intrinsics.a(this.d, ((C5542nb1) obj).d);
        }
        return false;
    }

    @Override // defpackage.InterfaceC7774yC
    @NotNull
    public final Class<?> h() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.d + " (Kotlin reflection is not available)";
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: si1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6619si1 {

    @NotNull
    public final String a;

    public C6619si1(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.a = id;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6619si1) && Intrinsics.a(this.a, ((C6619si1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("ProfileState(id="), this.a, ')');
    }
}

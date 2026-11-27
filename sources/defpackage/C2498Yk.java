package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2498Yk<T> {

    @NotNull
    public final String a;

    public C2498Yk(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        if (name.length() == 0) {
            throw new IllegalStateException("Name can't be blank");
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2498Yk.class == obj.getClass() && Intrinsics.a(this.a, ((C2498Yk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AttributeKey: " + this.a;
    }
}

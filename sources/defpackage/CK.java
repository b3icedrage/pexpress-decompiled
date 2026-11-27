package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CK<T> {
    public final T a;

    public CK(T t) {
        this.a = t;
    }

    @NotNull
    public abstract AbstractC4649jL0 a(@NotNull S01 s01);

    public T b() {
        return this.a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        T tB = b();
        CK ck = obj instanceof CK ? (CK) obj : null;
        return Intrinsics.a(tB, ck != null ? ck.b() : null);
    }

    public final int hashCode() {
        T tB = b();
        if (tB != null) {
            return tB.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return String.valueOf(b());
    }
}

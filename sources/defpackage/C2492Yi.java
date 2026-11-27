package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2492Yi<T> {
    public final T a;
    public final T b;

    public C2492Yi(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2492Yi)) {
            return false;
        }
        C2492Yi c2492Yi = (C2492Yi) obj;
        return Intrinsics.a(this.a, c2492Yi.a) && Intrinsics.a(this.b, c2492Yi.b);
    }

    public final int hashCode() {
        T t = this.a;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.b;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ApproximationBounds(lower=" + this.a + ", upper=" + this.b + ')';
    }
}

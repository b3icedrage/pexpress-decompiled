package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Eo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0919Eo0<T> {

    @Nullable
    public final T a;
    public final T b;

    public C0919Eo0(@Nullable T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0919Eo0)) {
            return false;
        }
        C0919Eo0 c0919Eo0 = (C0919Eo0) obj;
        return Intrinsics.a(this.a, c0919Eo0.a) && Intrinsics.a(this.b, c0919Eo0.b);
    }

    public final int hashCode() {
        T t = this.a;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.b;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "History(previous=" + this.a + ", current=" + this.b + ")";
    }
}

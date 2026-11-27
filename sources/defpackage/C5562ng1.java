package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ng1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5562ng1 {

    @NotNull
    public final String a;

    @Nullable
    public final Long b;

    public C5562ng1(@NotNull String key, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.a = key;
        this.b = l;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5562ng1)) {
            return false;
        }
        C5562ng1 c5562ng1 = (C5562ng1) obj;
        return Intrinsics.a(this.a, c5562ng1.a) && Intrinsics.a(this.b, c5562ng1.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}

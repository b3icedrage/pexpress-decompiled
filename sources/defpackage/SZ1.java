package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class SZ1 {

    @NotNull
    public static final SZ1 c = new SZ1(Float.NaN, -1);
    public final long a;
    public final float b;

    public SZ1(float f, long j) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SZ1)) {
            return false;
        }
        SZ1 sz1 = (SZ1) obj;
        return this.a == sz1.a && Float.compare(this.b, sz1.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return "TimestampEntry(x=" + this.a + ", y=" + this.b + ")";
    }
}

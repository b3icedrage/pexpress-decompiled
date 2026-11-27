package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class BF {
    public final long a;
    public final long b;
    public final float c;
    public final float d;
    public final float e;

    public BF(long j, long j2, float f, float f2, float f3) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BF)) {
            return false;
        }
        BF bf = (BF) obj;
        return this.a == bf.a && this.b == bf.b && Float.compare(this.c, bf.c) == 0 && Float.compare(this.d, bf.d) == 0 && Float.compare(this.e, bf.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ((Float.hashCode(this.d) + ((Float.hashCode(this.c) + C5491nL.a(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "CommonChartEntriesHistoryPoint(candleId=" + this.a + ", time=" + this.b + ", closeValue=" + this.c + ", maxValue=" + this.d + ", minValue=" + this.e + ")";
    }
}

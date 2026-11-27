package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4944kk0 implements Comparable<C4944kk0> {
    public final int d;
    public final int e;
    public final int g;

    @NotNull
    public final EnumC7461wi2 h;
    public final int i;
    public final int j;

    @NotNull
    public final EnumC3064c11 k;
    public final int l;
    public final long m;

    static {
        C6564sT.a(0L);
    }

    public C4944kk0(int i, int i2, int i3, @NotNull EnumC7461wi2 dayOfWeek, int i4, int i5, @NotNull EnumC3064c11 month, int i6, long j) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(month, "month");
        this.d = i;
        this.e = i2;
        this.g = i3;
        this.h = dayOfWeek;
        this.i = i4;
        this.j = i5;
        this.k = month;
        this.l = i6;
        this.m = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C4944kk0 c4944kk0) {
        C4944kk0 other = c4944kk0;
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.f(this.m, other.m);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4944kk0)) {
            return false;
        }
        C4944kk0 c4944kk0 = (C4944kk0) obj;
        return this.d == c4944kk0.d && this.e == c4944kk0.e && this.g == c4944kk0.g && this.h == c4944kk0.h && this.i == c4944kk0.i && this.j == c4944kk0.j && this.k == c4944kk0.k && this.l == c4944kk0.l && this.m == c4944kk0.m;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + EF0.a(this.l, (this.k.hashCode() + EF0.a(this.j, EF0.a(this.i, (this.h.hashCode() + EF0.a(this.g, EF0.a(this.e, Integer.hashCode(this.d) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "GMTDate(seconds=" + this.d + ", minutes=" + this.e + ", hours=" + this.g + ", dayOfWeek=" + this.h + ", dayOfMonth=" + this.i + ", dayOfYear=" + this.j + ", month=" + this.k + ", year=" + this.l + ", timestamp=" + this.m + ')';
    }
}

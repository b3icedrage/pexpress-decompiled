package kotlin.time;

import defpackage.R40;
import defpackage.S40;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static final long a(long j) {
        if (j < 0) {
            b.e.getClass();
            return b.h;
        }
        b.e.getClass();
        return b.g;
    }

    public static final long b(long j, long j2, R40 r40) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return c.h(j3, r40);
        }
        R40 r41 = R40.MILLISECONDS;
        if (r40.compareTo(r41) >= 0) {
            return b.t(a(j3));
        }
        long jB = S40.b(1L, r41, r40);
        long j4 = (j / jB) - (j2 / jB);
        long j5 = (j % jB) - (j2 % jB);
        b.a aVar = b.e;
        return b.p(c.h(j4, r41), c.h(j5, r40));
    }

    public static final long c(long j, long j2, @NotNull R40 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? a(j) : b(j, j2, unit);
        }
        if (j != j2) {
            return b.t(a(j2));
        }
        b.e.getClass();
        return 0L;
    }
}

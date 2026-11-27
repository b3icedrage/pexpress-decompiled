package kotlin.ranges;

import defpackage.C1332Jw;
import defpackage.C5796om1;
import defpackage.InterfaceC6309rE;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
public class f extends C5796om1 {
    public static double b(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + JwtParser.SEPARATOR_CHAR);
    }

    public static int c(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(C1332Jw.a(i2, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        if (i < 0) {
            return 0;
        }
        return i > i2 ? i2 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(int i, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof InterfaceC6309rE) {
            return ((Number) g(Integer.valueOf(i), (InterfaceC6309rE) range)).intValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + JwtParser.SEPARATOR_CHAR);
        }
        int i2 = range.d;
        if (i < Integer.valueOf(i2).intValue()) {
            return Integer.valueOf(i2).intValue();
        }
        int i3 = range.e;
        return i > Integer.valueOf(i3).intValue() ? Integer.valueOf(i3).intValue() : i;
    }

    public static long e(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + JwtParser.SEPARATOR_CHAR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long f(long j, @NotNull e range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof InterfaceC6309rE) {
            return ((Number) g(Long.valueOf(j), (InterfaceC6309rE) range)).longValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + JwtParser.SEPARATOR_CHAR);
        }
        long j2 = range.d;
        if (j < Long.valueOf(j2).longValue()) {
            return Long.valueOf(j2).longValue();
        }
        long j3 = range.e;
        return j > Long.valueOf(j3).longValue() ? Long.valueOf(j3).longValue() : j;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T g(@NotNull T t, @NotNull InterfaceC6309rE<T> range) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + JwtParser.SEPARATOR_CHAR);
        }
        if (!range.c() || range.c()) {
            return (!range.c() || range.c()) ? t : range.d();
        }
        return range.b();
    }

    @NotNull
    public static c h(int i, @NotNull IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        C5796om1.a(i > 0, Integer.valueOf(i));
        c.a aVar = c.h;
        int i2 = intRange.d;
        if (intRange.g <= 0) {
            i = -i;
        }
        aVar.getClass();
        return new c(i2, intRange.e, i);
    }

    @NotNull
    public static IntRange i(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new IntRange(i, i2 - 1, 1);
        }
        IntRange.INSTANCE.getClass();
        return IntRange.j;
    }
}

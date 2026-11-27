package kotlin.time;

import defpackage.CB0;
import defpackage.DB0;
import defpackage.KS1;
import defpackage.P40;
import defpackage.R40;
import defpackage.S40;
import io.jsonwebtoken.JwtParser;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final long a(String str) {
        R40 r40;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        b.e.getClass();
        char cCharAt2 = str.charAt(0);
        int i = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z = (i > 0) && StringsKt.T(str, '-');
        if (length <= i) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i) != 'P') {
            throw new IllegalArgumentException();
        }
        int i2 = i + 1;
        if (i2 == length) {
            throw new IllegalArgumentException();
        }
        R40 r41 = null;
        long jP = 0;
        boolean z2 = false;
        while (i2 < length) {
            if (str.charAt(i2) != 'T') {
                int i3 = i2;
                while (i3 < str.length() && (('0' <= (cCharAt = str.charAt(i3)) && cCharAt < ':') || StringsKt.D("+-.", cCharAt))) {
                    i3++;
                }
                String strSubstring = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i2;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i4 = length2 + 1;
                if (z2) {
                    if (cCharAt3 == 'H') {
                        r40 = R40.HOURS;
                    } else if (cCharAt3 == 'M') {
                        r40 = R40.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        r40 = R40.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    r40 = R40.DAYS;
                }
                if (r41 != null && r41.compareTo(r40) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iF = StringsKt.F(JwtParser.SEPARATOR_CHAR, 0, 6, strSubstring);
                if (r40 != R40.SECONDS || iF <= 0) {
                    jP = b.p(jP, h(e(strSubstring), r40));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    long jP2 = b.p(jP, h(e(strSubstring2), r40));
                    String strSubstring3 = strSubstring.substring(iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    jP = b.p(jP2, f(Double.parseDouble(strSubstring3), r40));
                }
                r41 = r40;
                i2 = i4;
            } else {
                if (z2 || (i2 = i2 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z2 = true;
            }
        }
        return z ? b.t(jP) : jP;
    }

    public static final long b(long j) {
        long j2 = (j << 1) + 1;
        b.a aVar = b.e;
        int i = P40.a;
        return j2;
    }

    public static final long c(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? b(kotlin.ranges.f.e(j, -4611686018427387903L, 4611686018427387903L)) : d(j * ((long) 1000000));
    }

    public static final long d(long j) {
        long j2 = j << 1;
        b.a aVar = b.e;
        int i = P40.a;
        return j2;
    }

    public static final long e(String str) {
        int length = str.length();
        int i = (length <= 0 || !StringsKt.D("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            Iterable intRange = new IntRange(i, StringsKt.E(str), 1);
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator<Integer> it = intRange.iterator();
                while (true) {
                    if (((DB0) it).g) {
                        char cCharAt = str.charAt(((CB0) it).b());
                        if ('0' > cCharAt || cCharAt >= ':') {
                        }
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return kotlin.text.d.o(str, "+", false) ? Long.parseLong(KS1.y(1, str)) : Long.parseLong(str);
    }

    public static final long f(double d, @NotNull R40 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dA = S40.a(d, unit, R40.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        long jRound = Math.round(dA);
        if (-4611686018426999999L <= jRound && jRound < 4611686018427000000L) {
            return d(jRound);
        }
        double dA2 = S40.a(d, unit, R40.MILLISECONDS);
        if (Double.isNaN(dA2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return c(Math.round(dA2));
    }

    public static final long g(int i, @NotNull R40 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(R40.SECONDS) <= 0 ? d(S40.c(i, unit, R40.NANOSECONDS)) : h(i, unit);
    }

    public static final long h(long j, @NotNull R40 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        R40 r40 = R40.NANOSECONDS;
        long jC = S40.c(4611686018426999999L, r40, unit);
        return ((-jC) > j || j > jC) ? b(kotlin.ranges.f.e(S40.b(j, unit, R40.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : d(S40.c(j, unit, r40));
    }
}

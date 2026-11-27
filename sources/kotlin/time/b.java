package kotlin.time;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import defpackage.P40;
import defpackage.R40;
import defpackage.S40;
import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparable<b> {

    @NotNull
    public static final a e = new a(null);
    public static final long g;
    public static final long h;
    public final long d;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i = P40.a;
        g = c.b(4611686018427387903L);
        h = c.b(-4611686018427387903L);
    }

    public /* synthetic */ b(long j) {
        this.d = j;
    }

    public static final long b(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return c.b(kotlin.ranges.f.e(j5, -4611686018427387903L, 4611686018427387903L));
        }
        return c.d((j5 * j3) + (j2 - (j4 * j3)));
    }

    public static final void e(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append(JwtParser.SEPARATOR_CHAR);
            String strL = StringsKt.L(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strL.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strL.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strL, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strL, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static int f(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.f(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return o(j) ? -i : i;
    }

    public static final long i(long j) {
        if ((((int) j) & 1) == 0) {
            return c.d((j >> 1) / ((long) 2));
        }
        if (n(j)) {
            return q(Integer.signum(2), j);
        }
        long j2 = j >> 1;
        long j3 = 2;
        long j4 = j2 / j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return c.b(j4);
        }
        long j5 = 1000000;
        return c.d((j4 * j5) + (((j2 - (j4 * j3)) * j5) / j3));
    }

    public static final boolean k(long j, long j2) {
        return j == j2;
    }

    public static final long l(long j) {
        return ((((int) j) & 1) != 1 || n(j)) ? r(j, R40.MILLISECONDS) : j >> 1;
    }

    public static final int m(long j) {
        if (n(j)) {
            return 0;
        }
        return (((int) j) & 1) == 1 ? (int) (((j >> 1) % ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)) * ((long) 1000000)) : (int) ((j >> 1) % ((long) 1000000000));
    }

    public static final boolean n(long j) {
        return j == g || j == h;
    }

    public static final boolean o(long j) {
        return j < 0;
    }

    public static final long p(long j, long j2) {
        if (n(j)) {
            if (!n(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (n(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? b(j >> 1, j2 >> 1) : b(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        if (i == 0) {
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? c.b(j3 / ((long) 1000000)) : c.d(j3);
        }
        return c.c(j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cb, code lost:
    
        return kotlin.time.b.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        return kotlin.time.b.h;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long q(int r20, long r21) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.b.q(int, long):long");
    }

    public static final long r(long j, @NotNull R40 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == g) {
            return Long.MAX_VALUE;
        }
        if (j == h) {
            return Long.MIN_VALUE;
        }
        return S40.b(j >> 1, (((int) j) & 1) == 0 ? R40.NANOSECONDS : R40.MILLISECONDS, unit);
    }

    @NotNull
    public static String s(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == g) {
            return "Infinity";
        }
        if (j == h) {
            return "-Infinity";
        }
        boolean zO = o(j);
        StringBuilder sb = new StringBuilder();
        if (zO) {
            sb.append('-');
        }
        if (o(j)) {
            j = t(j);
        }
        long jR = r(j, R40.DAYS);
        int i = 0;
        int iR = n(j) ? 0 : (int) (r(j, R40.HOURS) % ((long) 24));
        int iR2 = n(j) ? 0 : (int) (r(j, R40.MINUTES) % ((long) 60));
        int iR3 = n(j) ? 0 : (int) (r(j, R40.SECONDS) % ((long) 60));
        int iM = m(j);
        boolean z = jR != 0;
        boolean z2 = iR != 0;
        boolean z3 = iR2 != 0;
        boolean z4 = (iR3 == 0 && iM == 0) ? false : true;
        if (z) {
            sb.append(jR);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iR);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iR2);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iR3 != 0 || z || z2 || z3) {
                e(sb, iR3, iM, 9, "s", false);
            } else if (iM >= 1000000) {
                e(sb, iM / 1000000, iM % 1000000, 6, "ms", false);
            } else if (iM >= 1000) {
                e(sb, iM / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, iM % CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, 3, "us", false);
            } else {
                sb.append(iM);
                sb.append("ns");
            }
            i = i4;
        }
        if (zO && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long t(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = P40.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        return f(this.d, bVar.d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.d == ((b) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d);
    }

    @NotNull
    public final String toString() {
        return s(this.d);
    }
}

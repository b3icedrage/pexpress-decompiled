package kotlin.text;

import defpackage.C4352i82;
import defpackage.G72;
import defpackage.M72;
import defpackage.S72;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    public static final byte a(@NotNull String str) {
        G72 g72;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        M72 m72C = c(str);
        if (m72C != null) {
            int i = m72C.d;
            if (Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0) {
                g72 = null;
            } else {
                g72 = new G72((byte) i);
            }
        } else {
            g72 = null;
        }
        if (g72 != null) {
            return g72.d;
        }
        StringsKt__StringNumberConversionsKt.e(str);
        throw null;
    }

    public static final int b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        M72 m72C = c(str);
        if (m72C != null) {
            return m72C.d;
        }
        StringsKt__StringNumberConversionsKt.e(str);
        throw null;
    }

    @Nullable
    public static final M72 c(@NotNull String str) {
        int i;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.e(cCharAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i = 1;
        }
        M72.a aVar = M72.e;
        int i3 = 119304647;
        int i4 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i5 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                if (i4 != i3) {
                    return null;
                }
                i4 = (int) ((((long) (-1)) & 4294967295L) / (((long) 10) & 4294967295L));
                if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i6 = i2 * 10;
            int i7 = i6 + iDigit;
            if (Integer.compare(i7 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i7;
            i3 = 119304647;
        }
        return new M72(i2);
    }

    public static final long d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        S72 s72E = e(str);
        if (s72E != null) {
            return s72E.d;
        }
        StringsKt__StringNumberConversionsKt.e(str);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00aa A[SYNTHETIC] */
    @Nullable
    public static final S72 e(@NotNull String str) {
        int i;
        long j;
        int i2 = 1;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i3 = 10;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (Intrinsics.e(cCharAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i = 1;
        }
        long j2 = 10;
        S72.a aVar = S72.e;
        long j3 = 0;
        long j4 = 512409557603043100L;
        while (i < length) {
            int i4 = i2;
            int iDigit = Character.digit((int) str.charAt(i), i3);
            if (iDigit < 0) {
                return null;
            }
            int i5 = length;
            long j5 = j3 ^ Long.MIN_VALUE;
            int i6 = i;
            if (Long.compare(j5, j4 ^ Long.MIN_VALUE) > 0) {
                if (j4 != 512409557603043100L) {
                    return null;
                }
                if (j2 < 0) {
                    if (Long.MAX_VALUE < (j2 ^ Long.MIN_VALUE)) {
                        j4 = 0;
                    } else {
                        j = 1;
                    }
                    if (Long.compare(j5, j4 ^ Long.MIN_VALUE) > 0) {
                        return null;
                    }
                } else {
                    long j6 = (Long.MAX_VALUE / j2) << i4;
                    j = j6 + ((long) ((((-1) - (j6 * j2)) ^ Long.MIN_VALUE) >= (j2 ^ Long.MIN_VALUE) ? i4 : 0));
                }
                j4 = j;
                if (Long.compare(j5, j4 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j7 = j3 * j2;
            M72.a aVar2 = M72.e;
            long j8 = (((long) iDigit) & 4294967295L) + j7;
            if (Long.compare(j8 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i = i6 + 1;
            j3 = j8;
            i2 = i4;
            length = i5;
            i3 = 10;
        }
        return new S72(j3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    public static final short f(@NotNull String str) {
        C4352i82 c4352i82;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        M72 m72C = c(str);
        if (m72C != null) {
            int i = m72C.d;
            if (Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0) {
                c4352i82 = null;
            } else {
                c4352i82 = new C4352i82((short) i);
            }
        } else {
            c4352i82 = null;
        }
        if (c4352i82 != null) {
            return c4352i82.d;
        }
        StringsKt__StringNumberConversionsKt.e(str);
        throw null;
    }
}

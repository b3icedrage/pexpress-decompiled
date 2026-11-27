package defpackage;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3267d {

    @NotNull
    public static final byte[] a;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        a = bytes;
    }

    public static final boolean a(@NotNull C7782yE1 segment, int i, @NotNull byte[] bytes, int i2) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i3 = segment.c;
        byte[] bArr = segment.a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                segment = segment.f;
                Intrinsics.checkNotNull(segment);
                bArr = segment.a;
                i = segment.b;
                i3 = segment.c;
            }
            if (bArr[i] != bytes[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    @NotNull
    public static final String b(@NotNull C1481Lu c1481Lu, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(c1481Lu, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (c1481Lu.v(j2) == 13) {
                String strM0 = c1481Lu.M0(j2, Charsets.UTF_8);
                c1481Lu.r(2L);
                return strM0;
            }
        }
        c1481Lu.getClass();
        String strM1 = c1481Lu.M0(j, Charsets.UTF_8);
        c1481Lu.r(1L);
        return strM1;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a5 A[LOOP:0: B:8:0x0023->B:48:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4 A[SYNTHETIC] */
    public static final int c(@NotNull C1481Lu c1481Lu, @NotNull C4437ia1 options, boolean z) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        C7782yE1 c7782yE1;
        byte[] bArr2;
        int i4;
        Intrinsics.checkNotNullParameter(c1481Lu, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        C7782yE1 c7782yE2 = c1481Lu.d;
        if (c7782yE2 == null) {
            return z ? -2 : -1;
        }
        int i5 = c7782yE2.b;
        int i6 = c7782yE2.c;
        int[] iArr = options.g;
        byte[] bArr3 = c7782yE2.a;
        C7782yE1 c7782yE3 = c7782yE2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (c7782yE3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr3[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            c7782yE3 = c7782yE3.f;
                            Intrinsics.checkNotNull(c7782yE3);
                            i3 = c7782yE3.b;
                            i2 = c7782yE3.c;
                            bArr = c7782yE3.a;
                            if (c7782yE3 == c7782yE2) {
                                c7782yE3 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        byte[] bArr4 = bArr;
                        i8 = -i;
                        i5 = i3;
                        i6 = i2;
                        bArr3 = bArr4;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i16 = (i10 * (-1)) + i11;
            while (true) {
                int i17 = i5 + 1;
                int i18 = i11 + 1;
                if ((bArr3[i5] & 255) == iArr[i11]) {
                    boolean z2 = i18 == i16;
                    if (i17 == i6) {
                        Intrinsics.checkNotNull(c7782yE3);
                        C7782yE1 c7782yE4 = c7782yE3.f;
                        Intrinsics.checkNotNull(c7782yE4);
                        i4 = c7782yE4.b;
                        int i19 = c7782yE4.c;
                        bArr2 = c7782yE4.a;
                        if (c7782yE4 != c7782yE2) {
                            c7782yE1 = c7782yE4;
                            i6 = i19;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            i6 = i19;
                            c7782yE1 = null;
                        }
                    } else {
                        c7782yE1 = c7782yE3;
                        bArr2 = bArr3;
                        i4 = i17;
                    }
                    if (z2) {
                        i = iArr[i18];
                        int i20 = i4;
                        i2 = i6;
                        i3 = i20;
                        byte[] bArr5 = bArr2;
                        c7782yE3 = c7782yE1;
                        bArr = bArr5;
                        break;
                    }
                    i5 = i4;
                    bArr3 = bArr2;
                    c7782yE3 = c7782yE1;
                    i11 = i18;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            byte[] bArr6 = bArr;
            i8 = -i;
            i5 = i3;
            i6 = i2;
            bArr3 = bArr6;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}

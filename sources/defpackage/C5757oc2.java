package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: renamed from: oc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5757oc2 {
    public static final a a;

    /* JADX INFO: renamed from: oc2$a */
    public static abstract class a {
        public abstract int a(String str, byte[] bArr, int i, int i2);

        public abstract int b(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: renamed from: oc2$b */
    public static final class b extends a {
        @Override // defpackage.C5757oc2.a
        public final int a(String str, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char cCharAt;
            int length = str.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
                bArr[i4] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char cCharAt2 = str.charAt(i6);
                if (cCharAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) cCharAt2;
                    i7++;
                } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                    i7 += 2;
                    bArr[i8] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new c(i6, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                        }
                        int i9 = i6 + 1;
                        if (i9 != str.length()) {
                            char cCharAt3 = str.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i7 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i6 = i9;
                            } else {
                                i6 = i9;
                            }
                        }
                        throw new c(i6 - 1, length);
                    }
                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i11 = i7 + 2;
                    bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    i7 += 3;
                    bArr[i11] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                }
                i6++;
            }
            return i7;
        }

        @Override // defpackage.C5757oc2.a
        public final int b(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    i = i3;
                } else if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b < -62) {
                        return -1;
                    }
                    i += 2;
                    if (bArr[i3] > -65) {
                        return -1;
                    }
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return C5757oc2.a(bArr, i3, i2);
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 > -65) {
                        return -1;
                    }
                    if (b == -32 && b2 < -96) {
                        return -1;
                    }
                    if (b == -19 && b2 >= -96) {
                        return -1;
                    }
                    i += 3;
                    if (bArr[i4] > -65) {
                        return -1;
                    }
                } else {
                    if (i3 >= i2 - 2) {
                        return C5757oc2.a(bArr, i3, i2);
                    }
                    int i5 = i + 2;
                    byte b3 = bArr[i3];
                    if (b3 > -65) {
                        return -1;
                    }
                    if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i6 = i + 3;
                    if (bArr[i5] > -65) {
                        return -1;
                    }
                    i += 4;
                    if (bArr[i6] > -65) {
                        return -1;
                    }
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: oc2$c */
    public static class c extends IllegalArgumentException {
        public c(int i, int i2) {
            super(C4564j.c(i, i2, "Unpaired surrogate at index ", " of "));
        }
    }

    /* JADX INFO: renamed from: oc2$d */
    public static final class d extends a {
        public static int c(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                a aVar = C5757oc2.a;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i2 == 1) {
                return C5757oc2.c(i, C4356i92.g(bArr, j));
            }
            if (i2 == 2) {
                return C5757oc2.d(i, C4356i92.g(bArr, j), C4356i92.g(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // defpackage.C5757oc2.a
        public final int a(String str, byte[] bArr, int i, int i2) {
            long j;
            long j2;
            long j3;
            int i3;
            char cCharAt;
            long j4 = i;
            long j5 = ((long) i2) + j4;
            int length = str.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                    break;
                }
                C4356i92.k(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 < 128 && j4 < j5) {
                    C4356i92.k(bArr, j4, (byte) cCharAt2);
                    j3 = j5;
                    j2 = j;
                    j4 += j;
                } else if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                    j2 = j;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        j3 = j5;
                        if (j4 > j3 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new c(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                C4356i92.k(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                C4356i92.k(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                long j6 = j4 + 3;
                                C4356i92.k(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                j4 += 4;
                                C4356i92.k(bArr, j6, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new c(i4 - 1, length);
                    }
                    C4356i92.k(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    j3 = j5;
                    C4356i92.k(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j4 += 3;
                    C4356i92.k(bArr, j7, (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                } else {
                    j2 = j;
                    long j8 = j4 + j2;
                    C4356i92.k(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                    j4 += 2;
                    C4356i92.k(bArr, j8, (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j3 = j5;
                }
                i4++;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        @Override // defpackage.C5757oc2.a
        public final int b(byte[] bArr, int i, int i2) {
            int i3;
            if ((i | i2 | (bArr.length - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long j = i;
            int i4 = (int) (((long) i2) - j);
            if (i4 >= 16) {
                long j2 = j;
                i3 = 0;
                while (true) {
                    if (i3 >= i4) {
                        i3 = i4;
                        break;
                    }
                    long j3 = j2 + 1;
                    if (C4356i92.g(bArr, j2) < 0) {
                        break;
                    }
                    i3++;
                    j2 = j3;
                }
            } else {
                i3 = 0;
            }
            int i5 = i4 - i3;
            long j4 = j + ((long) i3);
            while (true) {
                byte bG = 0;
                while (i5 > 0) {
                    long j5 = j4 + 1;
                    bG = C4356i92.g(bArr, j4);
                    if (bG < 0) {
                        j4 = j5;
                        break;
                    }
                    i5--;
                    j4 = j5;
                }
                if (i5 == 0) {
                    return 0;
                }
                int i6 = i5 - 1;
                if (bG < -32) {
                    if (i6 == 0) {
                        return bG;
                    }
                    i5 -= 2;
                    if (bG < -62) {
                        return -1;
                    }
                    long j6 = j4 + 1;
                    if (C4356i92.g(bArr, j4) > -65) {
                        return -1;
                    }
                    j4 = j6;
                } else if (bG < -16) {
                    if (i6 < 2) {
                        return c(j4, bArr, bG, i6);
                    }
                    i5 -= 3;
                    long j7 = j4 + 1;
                    byte bG2 = C4356i92.g(bArr, j4);
                    if (bG2 > -65) {
                        return -1;
                    }
                    if (bG == -32 && bG2 < -96) {
                        return -1;
                    }
                    if (bG == -19 && bG2 >= -96) {
                        return -1;
                    }
                    j4 += 2;
                    if (C4356i92.g(bArr, j7) > -65) {
                        return -1;
                    }
                } else {
                    if (i6 < 3) {
                        return c(j4, bArr, bG, i6);
                    }
                    i5 -= 4;
                    long j8 = j4 + 1;
                    byte bG3 = C4356i92.g(bArr, j4);
                    if (bG3 > -65) {
                        return -1;
                    }
                    if ((((bG3 + 112) + (bG << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j9 = 2 + j4;
                    if (C4356i92.g(bArr, j8) > -65) {
                        return -1;
                    }
                    j4 += 3;
                    if (C4356i92.g(bArr, j9) > -65) {
                        return -1;
                    }
                }
            }
        }
    }

    static {
        a = (C4356i92.e && C4356i92.d && !C1970Sa.a()) ? new d() : new b();
    }

    public static int a(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i3 == 1) {
            return c(b2, bArr[i]);
        }
        if (i3 == 2) {
            return d(b2, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new c(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static int c(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}

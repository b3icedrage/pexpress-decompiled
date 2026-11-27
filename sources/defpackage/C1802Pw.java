package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1802Pw implements Serializable, Comparable<C1802Pw> {

    @NotNull
    public static final C1802Pw h = new C1802Pw(new byte[0]);

    @NotNull
    public final byte[] d;
    public transient int e;

    @Nullable
    public transient String g;

    /* JADX INFO: renamed from: Pw$a */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:66:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:68:0x00eb A[RETURN] */
        @Nullable
        public static C1802Pw a(@NotNull String str) {
            char c;
            int i;
            char cCharAt;
            char c2 = 'A';
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bArr = C2848b.a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            int length = str.length();
            while (true) {
                c = '\t';
                if (length <= 0 || !((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                    break;
                }
                length--;
            }
            int i2 = (int) ((((long) length) * 6) / 8);
            byte[] bArrCopyOf = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i3 >= length) {
                    int i7 = i4 % 4;
                    if (i7 != 1) {
                        if (i7 == 2) {
                            bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                            i6 = 1 + i6;
                        } else if (i7 == 3) {
                            int i8 = i5 << 6;
                            int i9 = 1 + i6;
                            bArrCopyOf[i6] = (byte) (i8 >> 16);
                            i6 += 2;
                            bArrCopyOf[i9] = (byte) (i8 >> 8);
                        }
                        if (i6 != i2) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                        }
                    }
                    if (bArrCopyOf != null) {
                        return new C1802Pw(bArrCopyOf);
                    }
                    return null;
                }
                char cCharAt2 = str.charAt(i3);
                char c3 = c2;
                if (c2 <= cCharAt2 && cCharAt2 < '[') {
                    i = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i = cCharAt2 + 4;
                } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                    i = 62;
                } else {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != c) {
                            break;
                        }
                    } else {
                        i = 63;
                    }
                    i3++;
                    c2 = c3;
                    c = '\t';
                }
                int i10 = i | (i5 << 6);
                i4++;
                if (i4 % 4 == 0) {
                    bArrCopyOf[i6] = (byte) (i10 >> 16);
                    int i11 = i6 + 2;
                    bArrCopyOf[i6 + 1] = (byte) (i10 >> 8);
                    i6 += 3;
                    bArrCopyOf[i11] = (byte) i10;
                }
                i5 = i10;
                i3++;
                c2 = c3;
                c = '\t';
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new C1802Pw(bArrCopyOf);
            }
            return null;
        }

        @NotNull
        public static C1802Pw b(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (C3476e.a(str.charAt(i2 + 1)) + (C3476e.a(str.charAt(i2)) << 4));
            }
            return new C1802Pw(bArr);
        }

        @NotNull
        public static C1802Pw c(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            C1802Pw c1802Pw = new C1802Pw(bytes);
            c1802Pw.g = str;
            return c1802Pw;
        }

        @NotNull
        public static C1802Pw d(int i, @NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            C1481Lu.b bVar = C5417n.a;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            if (i == C5417n.b) {
                i = bArr.length;
            }
            C5417n.b(bArr.length, 0, i);
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            C1137Hj.a(i, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
            return new C1802Pw(bArrCopyOfRange);
        }
    }

    public C1802Pw(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.d = data;
    }

    @NotNull
    public String b() {
        byte[] map = C2848b.a;
        byte[] bArr = this.d;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr2[i2] = map[(b & 255) >> 2];
            bArr2[i2 + 1] = map[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = map[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = map[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr2[i2] = map[(b4 & 255) >> 2];
            bArr2[i2 + 1] = map[(b4 & 3) << 4];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr2[i2] = map[(b5 & 255) >> 2];
            bArr2[i2 + 1] = map[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr2[i2 + 2] = map[(b6 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        return new String(bArr2, Charsets.UTF_8);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1802Pw c1802Pw) {
        C1802Pw other = c1802Pw;
        Intrinsics.checkNotNullParameter(other, "other");
        int iF = f();
        int iF2 = other.f();
        int iMin = Math.min(iF, iF2);
        for (int i = 0; i < iMin; i++) {
            int iL = l(i) & 255;
            int iL2 = other.l(i) & 255;
            if (iL != iL2) {
                return iL < iL2 ? -1 : 1;
            }
        }
        if (iF == iF2) {
            return 0;
        }
        return iF < iF2 ? -1 : 1;
    }

    @NotNull
    public C1802Pw e(@NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.d, 0, f());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new C1802Pw(bArrDigest);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1802Pw) {
            C1802Pw c1802Pw = (C1802Pw) obj;
            int iF = c1802Pw.f();
            byte[] bArr = this.d;
            if (iF == bArr.length && c1802Pw.n(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.d.length;
    }

    public int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.d);
        this.e = iHashCode;
        return iHashCode;
    }

    @NotNull
    public String i() {
        byte[] bArr = this.d;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = C3476e.d;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    @NotNull
    public byte[] k() {
        return this.d;
    }

    public byte l(int i) {
        return this.d[i];
    }

    public boolean m(int i, @NotNull C1802Pw other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.n(0, this.d, 0, i);
    }

    public boolean n(int i, @NotNull byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.d;
        return i <= bArr.length - i3 && i2 >= 0 && i2 <= other.length - i3 && C5417n.a(i, i2, i3, bArr, other);
    }

    @NotNull
    public C1802Pw o() {
        int i = 0;
        while (true) {
            byte[] bArr = this.d;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C1802Pw(bArrCopyOf);
            }
            i++;
        }
    }

    @NotNull
    public byte[] p() {
        byte[] bArr = this.d;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @NotNull
    public final String q() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        byte[] bArrK = k();
        Intrinsics.checkNotNullParameter(bArrK, "<this>");
        String str2 = new String(bArrK, Charsets.UTF_8);
        this.g = str2;
        return str2;
    }

    public void r(@NotNull C1481Lu buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.c1(this.d, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:182:0x01c3 A[EDGE_INSN: B:182:0x01c3->B:183:0x01c4 BREAK  A[LOOP:0: B:7:0x000e->B:253:0x000e]] */
    @NotNull
    public String toString() {
        C1802Pw c1802Pw;
        byte b;
        int i;
        byte[] bArr = this.d;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 < length) {
                byte b2 = bArr[i2];
                if (b2 < 0) {
                    if ((b2 >> 5) != -2) {
                        if ((b2 >> 4) != -2) {
                            if ((b2 >> 3) != -2) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i5 = i2 + 3;
                            if (length > i5) {
                                byte b3 = bArr[i2 + 1];
                                if ((b3 & 192) != 128) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                byte b4 = bArr[i2 + 2];
                                if ((b4 & 192) != 128) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                byte b5 = bArr[i5];
                                if ((b5 & 192) != 128) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                                if (i6 <= 1114111) {
                                    if (55296 <= i6 && i6 < 57344) {
                                        if (i4 == 64) {
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    }
                                    if (i6 >= 65536) {
                                        int i7 = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 < 32) || (127 <= i6 && i6 < 160))) || i6 == 65533) {
                                            i3 = -1;
                                            break;
                                        }
                                        i3 += i6 < 65536 ? 1 : 2;
                                        Unit unit = Unit.a;
                                        i2 += 4;
                                        i4 = i7;
                                    } else {
                                        if (i4 == 64) {
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    }
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            int i8 = i2 + 2;
                            if (length > i8) {
                                byte b6 = bArr[i2 + 1];
                                if ((b6 & 192) != 128) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                byte b7 = bArr[i8];
                                if ((b7 & 192) != 128) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                int i9 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                                if (i9 >= 2048) {
                                    if (55296 <= i9 && i9 < 57344) {
                                        if (i4 == 64) {
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    }
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i9 < 65536 ? 1 : 2;
                                    Unit unit2 = Unit.a;
                                    i2 += 3;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        }
                    } else {
                        int i10 = i2 + 1;
                        if (length > i10) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i11 = (b8 ^ 3968) ^ (b2 << 6);
                            if (i11 >= 128) {
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i11 < 65536 ? 1 : 2;
                                Unit unit3 = Unit.a;
                                i2 += 2;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i12 = i4 + 1;
                    if (i4 == 64) {
                        break;
                    }
                    if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                        i3 += b2 < 65536 ? 1 : 2;
                        i2++;
                        while (true) {
                            i4 = i12;
                            if (i2 < length && (b = bArr[i2]) >= 0) {
                                i2++;
                                i12 = i4 + 1;
                                if (i4 == 64) {
                                    break loop0;
                                }
                                if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                    i3 += b < 65536 ? 1 : 2;
                                }
                            }
                        }
                    }
                    i3 = -1;
                    break;
                }
            } else {
                break;
            }
        }
        if (i3 != -1) {
            String strQ = q();
            String strSubstring = strQ.substring(0, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strM = d.m(d.m(d.m(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strQ.length()) {
                return C1742Pc.d(']', "[text=", strM);
            }
            return "[size=" + bArr.length + " text=" + strM + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + i() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        C1481Lu.b bVar = C5417n.a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int iF = 64 == C5417n.b ? f() : 64;
        if (iF > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (iF < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iF == bArr.length) {
            c1802Pw = this;
        } else {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            C1137Hj.a(iF, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, iF);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
            c1802Pw = new C1802Pw(bArrCopyOfRange);
        }
        sb.append(c1802Pw.i());
        sb.append("…]");
        return sb.toString();
    }
}

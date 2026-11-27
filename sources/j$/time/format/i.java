package j$.time.format;

import j$.time.DateTimeException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
class i implements f {
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    final Enum a;
    final int b;
    final int c;
    private final x d;
    final int e;

    /* JADX WARN: Multi-variable type inference failed */
    i(j$.time.temporal.r rVar, int i, int i2, x xVar) {
        this.a = (Enum) rVar;
        this.b = i;
        this.c = i2;
        this.d = xVar;
        this.e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected i(j$.time.temporal.r rVar, int i, int i2, x xVar, int i3) {
        this.a = (Enum) rVar;
        this.b = i;
        this.c = i2;
        this.d = xVar;
        this.e = i3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.r, java.lang.Enum] */
    i c() {
        return this.e == -1 ? this : new i(this.a, this.b, this.c, this.d, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.r, java.lang.Enum] */
    i d(int i) {
        int i2 = this.e + i;
        return new i(this.a, this.b, this.c, this.d, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.r, java.lang.Enum, java.lang.Object] */
    @Override // j$.time.format.f
    public boolean p(r rVar, StringBuilder sb) {
        ?? r0 = this.a;
        Long lE = rVar.e(r0);
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        u uVarB = rVar.b();
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new DateTimeException("Field " + ((Object) r0) + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i);
        }
        uVarB.getClass();
        int i2 = this.b;
        x xVar = this.d;
        if (jLongValue >= 0) {
            int i3 = c.a[xVar.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jLongValue >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = c.a[xVar.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new DateTimeException("Field " + ((Object) r0) + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    boolean b(p pVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == x.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.f
    public int r(p pVar, CharSequence charSequence, int i) {
        int i2;
        boolean z;
        boolean z2;
        BigInteger bigIntegerAdd;
        long j;
        int i3;
        long j2;
        boolean z3;
        int length = charSequence.length();
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        pVar.f().getClass();
        boolean z4 = true;
        int i4 = this.c;
        x xVar = this.d;
        int i5 = this.b;
        int i6 = 0;
        if (cCharAt == '+') {
            boolean zK = pVar.k();
            boolean z5 = i5 == i4;
            int iOrdinal = xVar.ordinal();
            if (iOrdinal == 0 ? zK : !(iOrdinal == 1 || iOrdinal == 4 || (!zK && !z5))) {
                return ~i;
            }
            i2 = i + 1;
            z2 = true;
            z = false;
        } else {
            pVar.f().getClass();
            if (cCharAt == '-') {
                boolean zK2 = pVar.k();
                boolean z6 = i5 == i4;
                int iOrdinal2 = xVar.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (zK2 || z6)) {
                    return ~i;
                }
                i2 = i + 1;
                z = true;
                z2 = false;
            } else {
                if (xVar == x.ALWAYS && pVar.k()) {
                    return ~i;
                }
                i2 = i;
                z = false;
                z2 = false;
            }
        }
        int i7 = (pVar.k() || b(pVar)) ? i5 : 1;
        int i8 = i2 + i7;
        if (i8 > length) {
            return ~i2;
        }
        if (!pVar.k() && !b(pVar)) {
            i4 = 9;
        }
        int i9 = this.e;
        int iMax = Math.max(i9, 0) + i4;
        while (true) {
            bigIntegerAdd = null;
            if (i6 >= 2) {
                j = 0;
                i3 = i2;
                j2 = 0;
                break;
            }
            int iMin = Math.min(iMax + i2, length);
            int i10 = i2;
            long j3 = 0;
            while (true) {
                if (i10 >= iMin) {
                    z3 = z4;
                    j = 0;
                    break;
                }
                int i11 = i10 + 1;
                z3 = z4;
                j = 0;
                int iA = pVar.f().a(charSequence.charAt(i10));
                if (iA < 0) {
                    if (i10 >= i8) {
                        break;
                    }
                    return ~i2;
                }
                if (i11 - i2 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j3);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(iA));
                } else {
                    j3 = (j3 * 10) + ((long) iA);
                }
                i10 = i11;
                z4 = z3;
            }
            if (i9 <= 0 || i6 != 0) {
                i3 = i10;
                j2 = j3;
                break;
            }
            iMax = Math.max(i7, (i10 - i2) - i9);
            i6++;
            z4 = z3;
        }
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && pVar.k()) {
                    return ~(i2 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j2 == j && pVar.k()) {
                    return ~(i2 - 1);
                }
                j2 = -j2;
            }
        } else if (xVar == x.EXCEEDS_PAD && pVar.k()) {
            int i12 = i3 - i2;
            if (z2) {
                if (i12 <= i5) {
                    return ~(i2 - 1);
                }
            } else if (i12 > i5) {
                return ~i2;
            }
        }
        ?? r3 = this.a;
        if (bigIntegerDivide != null) {
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i3--;
            }
            return pVar.n(r3, bigIntegerDivide.longValue(), i2, i3);
        }
        return pVar.n(r3, j2, i2, i3);
    }

    public String toString() {
        Enum r0 = this.a;
        int i = this.c;
        x xVar = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && xVar == x.NORMAL) {
            return "Value(" + r0 + ")";
        }
        if (i2 == i && xVar == x.NOT_NEGATIVE) {
            return "Value(" + r0 + "," + i2 + ")";
        }
        return "Value(" + r0 + "," + i2 + "," + i + "," + xVar + ")";
    }
}

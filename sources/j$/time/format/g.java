package j$.time.format;

import io.jsonwebtoken.JwtParser;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class g extends i {
    private final boolean g;

    g(j$.time.temporal.r rVar, int i, int i2, boolean z, int i3) {
        super(rVar, i, i2, x.NOT_NEGATIVE, i3);
        this.g = z;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.i
    final i c() {
        if (this.e == -1) {
            return this;
        }
        return new g(this.a, this.b, this.c, this.g, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.i
    final i d(int i) {
        return new g(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i
    final boolean b(p pVar) {
        return pVar.k() && this.b == this.c && !this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.i, j$.time.format.f
    public final boolean p(r rVar, StringBuilder sb) {
        ?? r0 = this.a;
        Long lE = rVar.e(r0);
        if (lE == null) {
            return false;
        }
        u uVarB = rVar.b();
        long jLongValue = lE.longValue();
        j$.time.temporal.v vVarA = r0.A();
        vVarA.b(jLongValue, r0);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(vVarA.e());
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(vVarA.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            uVarB.getClass();
            if (z) {
                sb.append(JwtParser.SEPARATOR_CHAR);
            }
            sb.append(strSubstring);
            return true;
        }
        if (i <= 0) {
            return true;
        }
        if (z) {
            uVarB.getClass();
            sb.append(JwtParser.SEPARATOR_CHAR);
        }
        for (int i2 = 0; i2 < i; i2++) {
            uVarB.getClass();
            sb.append('0');
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.i, j$.time.format.f
    public final int r(p pVar, CharSequence charSequence, int i) {
        int i2 = (pVar.k() || b(pVar)) ? this.b : 0;
        int i3 = (pVar.k() || b(pVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                char cCharAt = charSequence.charAt(i);
                pVar.f().getClass();
                if (cCharAt == '.') {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int iMin = Math.min(i3 + i4, length);
            int i6 = 0;
            int i7 = i4;
            while (i7 < iMin) {
                int i8 = i7 + 1;
                int iA = pVar.f().a(charSequence.charAt(i7));
                if (iA < 0) {
                    if (i8 >= i5) {
                        break;
                    }
                    return ~i4;
                }
                i6 = (i6 * 10) + iA;
                i7 = i8;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i6).movePointLeft(i7 - i4);
            ?? r5 = this.a;
            j$.time.temporal.v vVarA = r5.A();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(vVarA.e());
            return pVar.n(r5, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(vVarA.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i7);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}

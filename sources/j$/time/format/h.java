package j$.time.format;

import io.jsonwebtoken.JwtParser;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: classes2.dex */
final class h implements f {
    @Override // j$.time.format.f
    public final boolean p(r rVar, StringBuilder sb) {
        boolean z;
        Long lE = rVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessorD = rVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = temporalAccessorD.d(aVar) ? Long.valueOf(rVar.d().f(aVar)) : null;
        int i = 0;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int iW = aVar.W(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jFloorDiv = Math.floorDiv(j, 315569520000L) + 1;
            LocalDateTime localDateTimeA0 = LocalDateTime.a0(Math.floorMod(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jFloorDiv > 0) {
                sb.append('+');
                sb.append(jFloorDiv);
            }
            sb.append(localDateTimeA0);
            if (localDateTimeA0.Q() == 0) {
                sb.append(":00");
            }
            z = true;
        } else {
            long j2 = jLongValue + 62167219200L;
            z = true;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime localDateTimeA1 = LocalDateTime.a0(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeA1);
            if (localDateTimeA1.Q() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeA1.R() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iW > 0) {
            sb.append(JwtParser.SEPARATOR_CHAR);
            int i2 = 100000000;
            while (true) {
                if (iW <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iW / i2;
                sb.append((char) (i3 + 48));
                iW -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return z;
    }

    @Override // j$.time.format.f
    public final int r(p pVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
        dateTimeFormatterBuilder.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder.i(aVar, 2);
        dateTimeFormatterBuilder.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder.i(aVar2, 2);
        dateTimeFormatterBuilder.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder.i(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        dateTimeFormatterBuilder.b(aVar4);
        dateTimeFormatterBuilder.e('Z');
        e eVarE = dateTimeFormatterBuilder.toFormatter().e();
        p pVarC = pVar.c();
        int iR = eVarE.r(pVarC, charSequence, i);
        if (iR < 0) {
            return iR;
        }
        long jLongValue = pVarC.i(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = pVarC.i(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = pVarC.i(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = pVarC.i(aVar).intValue();
        int iIntValue4 = pVarC.i(aVar2).intValue();
        Long lI = pVarC.i(aVar3);
        Long lI2 = pVarC.i(aVar4);
        int i4 = 0;
        int iIntValue5 = lI != null ? lI.intValue() : 0;
        int iIntValue6 = lI2 != null ? lI2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i3 = iIntValue5;
            i2 = 0;
            i4 = 1;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            pVar.o();
            i2 = iIntValue3;
            i3 = 59;
        } else {
            i2 = iIntValue3;
            i3 = iIntValue5;
        }
        try {
            return pVar.n(aVar4, iIntValue6, i, pVar.n(j$.time.temporal.a.INSTANT_SECONDS, LocalDateTime.Y(((int) jLongValue) % 10000, iIntValue, iIntValue2, i2, iIntValue4, i3).c0(i4).V(ZoneOffset.UTC) + Math.multiplyExact(jLongValue / 10000, 315569520000L), i, iR));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}

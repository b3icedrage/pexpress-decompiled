package io.sentry.vendor.gson.internal.bind.util;

import defpackage.BX;
import defpackage.C1742Pc;
import io.jsonwebtoken.JwtParser;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final TimeZone a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static void b(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f6 A[Catch: IllegalArgumentException -> 0x00d5, NumberFormatException -> 0x00d8, IndexOutOfBoundsException -> 0x00db, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00d5, IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:46:0x00bb, B:63:0x00f0, B:65:0x00f6, B:91:0x01a8, B:73:0x0108, B:74:0x0123, B:75:0x0124, B:79:0x0141, B:81:0x014e, B:84:0x0157, B:86:0x0176, B:89:0x0185, B:90:0x01a7, B:78:0x0130, B:93:0x01d9, B:94:0x01e0, B:50:0x00cb, B:51:0x00ce, B:45:0x00b6), top: B:105:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:69:0x0101  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0130 A[Catch: IllegalArgumentException -> 0x00d5, NumberFormatException -> 0x00d8, IndexOutOfBoundsException -> 0x00db, TryCatch #2 {IllegalArgumentException -> 0x00d5, IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:46:0x00bb, B:63:0x00f0, B:65:0x00f6, B:91:0x01a8, B:73:0x0108, B:74:0x0123, B:75:0x0124, B:79:0x0141, B:81:0x014e, B:84:0x0157, B:86:0x0176, B:89:0x0185, B:90:0x01a7, B:78:0x0130, B:93:0x01d9, B:94:0x01e0, B:50:0x00cb, B:51:0x00ce, B:45:0x00b6), top: B:105:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d9 A[Catch: IllegalArgumentException -> 0x00d5, NumberFormatException -> 0x00d8, IndexOutOfBoundsException -> 0x00db, TryCatch #2 {IllegalArgumentException -> 0x00d5, IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:46:0x00bb, B:63:0x00f0, B:65:0x00f6, B:91:0x01a8, B:73:0x0108, B:74:0x0123, B:75:0x0124, B:79:0x0141, B:81:0x014e, B:84:0x0157, B:86:0x0176, B:89:0x0185, B:90:0x01a7, B:78:0x0130, B:93:0x01d9, B:94:0x01e0, B:50:0x00cb, B:51:0x00ce, B:45:0x00b6), top: B:105:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x01f9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x0130, please report this as an issue */
    public static Date c(String str, ParsePosition parsePosition) throws ParseException {
        String strD;
        String message;
        int i;
        int iD;
        int i2;
        int iD2;
        char cCharAt;
        TimeZone timeZone;
        String strSubstring;
        int length;
        String str2;
        String id;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iD3 = d(index, i3, str);
            if (a(str, i3, '-')) {
                i3 = index + 5;
            }
            int i4 = i3 + 2;
            int iD4 = d(i3, i4, str);
            if (a(str, i4, '-')) {
                i4 = i3 + 3;
            }
            int i5 = i4 + 2;
            int iD5 = d(i4, i5, str);
            boolean zA = a(str, i5, 'T');
            if (!zA && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iD3, iD4 - 1, iD5);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i6 = i4 + 5;
                int iD6 = d(i4 + 3, i6, str);
                if (a(str, i6, ':')) {
                    i6 = i4 + 6;
                }
                int i7 = i6 + 2;
                int iD7 = d(i6, i7, str);
                if (a(str, i7, ':')) {
                    i7 = i6 + 3;
                }
                if (str.length() <= i7 || (cCharAt2 = str.charAt(i7)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i5 = i7;
                    i = iD6;
                    i2 = iD7;
                    iD = 0;
                } else {
                    int i8 = i7 + 2;
                    iD2 = d(i7, i8, str);
                    if (iD2 > 59 && iD2 < 63) {
                        iD2 = 59;
                    }
                    if (a(str, i8, JwtParser.SEPARATOR_CHAR)) {
                        int i9 = i7 + 3;
                        int length2 = i7 + 4;
                        while (true) {
                            if (length2 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt3 = str.charAt(length2);
                            if (cCharAt3 < '0' || cCharAt3 > '9') {
                                break;
                                break;
                            }
                            length2++;
                        }
                        int iMin = Math.min(length2, i7 + 6);
                        iD = d(i9, iMin, str);
                        int i10 = iMin - i9;
                        if (i10 == 1) {
                            iD *= 100;
                        } else if (i10 == 2) {
                            iD *= 10;
                        }
                        i = iD6;
                        i5 = length2;
                        i2 = iD7;
                    } else {
                        i = iD6;
                        i5 = i8;
                        i2 = iD7;
                        iD = 0;
                    }
                }
                if (str.length() > i5) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i5);
                timeZone = a;
                if (cCharAt == 'Z') {
                    length = i5 + 1;
                } else {
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i5);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i5 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                        str2 = "GMT" + strSubstring;
                        timeZone = DesugarTimeZone.getTimeZone(str2);
                        id = timeZone.getID();
                        if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iD3);
                gregorianCalendar2.set(2, iD4 - 1);
                gregorianCalendar2.set(5, iD5);
                gregorianCalendar2.set(11, i);
                gregorianCalendar2.set(12, i2);
                gregorianCalendar2.set(13, iD2);
                gregorianCalendar2.set(14, iD);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i = 0;
            iD = 0;
            i2 = 0;
            iD2 = 0;
            if (str.length() > i5) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i5);
            timeZone = a;
            if (cCharAt == 'Z') {
                length = i5 + 1;
            } else {
                if (cCharAt == '+') {
                }
                strSubstring = str.substring(i5);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i5 + strSubstring.length();
                if (!"+0000".equals(strSubstring)) {
                    str2 = "GMT" + strSubstring;
                    timeZone = DesugarTimeZone.getTimeZone(str2);
                    id = timeZone.getID();
                    if (!id.equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iD3);
            gregorianCalendar3.set(2, iD4 - 1);
            gregorianCalendar3.set(5, iD5);
            gregorianCalendar3.set(11, i);
            gregorianCalendar3.set(12, i2);
            gregorianCalendar3.set(13, iD2);
            gregorianCalendar3.set(14, iD);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e) {
            e = e;
            if (str == null) {
                strD = null;
            } else {
                strD = C1742Pc.d('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(BX.c("Failed to parse date [", strD, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            if (str == null) {
                strD = null;
            } else {
                strD = C1742Pc.d('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException(BX.c("Failed to parse date [", strD, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e3) {
            e = e3;
            if (str == null) {
                strD = null;
            } else {
                strD = C1742Pc.d('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException(BX.c("Failed to parse date [", strD, "]: ", message), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    public static int d(int i, int i2, String str) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}

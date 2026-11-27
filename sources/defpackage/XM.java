package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class XM {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    @NotNull
    public final String a;

    @NotNull
    public final String b;
    public final long c;

    @NotNull
    public final String d;

    @NotNull
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public static final class a {
        public static int a(boolean z, String str, int i, int i2) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
        public static long b(int i, String str) {
            int iA = a(false, str, 0, i);
            Matcher matcher = XM.m.matcher(str);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int iG = -1;
            int i5 = -1;
            int i6 = -1;
            while (iA < i) {
                int iA2 = a(true, str, iA + 1, i);
                matcher.region(iA, iA2);
                if (i3 == -1 && matcher.usePattern(XM.m).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i3 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i5 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i6 = Integer.parseInt(strGroup3);
                } else if (i4 == -1 && matcher.usePattern(XM.l).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i4 = Integer.parseInt(strGroup4);
                } else if (iG == -1) {
                    Pattern pattern = XM.k;
                    if (matcher.usePattern(pattern).matches()) {
                        String strGroup5 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        String strG = C4564j.g(locale, "US", strGroup5, locale, "this as java.lang.String).toLowerCase(locale)");
                        String strPattern = pattern.pattern();
                        Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                        iG = StringsKt.G(strPattern, strG, 0, false, 6) / 4;
                    } else if (i2 != -1 && matcher.usePattern(XM.j).matches()) {
                        String strGroup6 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                        i2 = Integer.parseInt(strGroup6);
                    }
                } else if (i2 != -1) {
                }
                iA = a(false, str, iA2 + 1, i);
            }
            if (70 <= i2 && i2 < 100) {
                i2 += 1900;
            }
            if (i2 >= 0 && i2 < 70) {
                i2 += CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
            }
            if (i2 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iG == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i4 || i4 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i3 < 0 || i3 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i5 < 0 || i5 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i6 < 0 || i6 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C6806tc2.e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i2);
            gregorianCalendar.set(2, iG - 1);
            gregorianCalendar.set(5, i4);
            gregorianCalendar.set(11, i3);
            gregorianCalendar.set(12, i5);
            gregorianCalendar.set(13, i6);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public XM(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof XM)) {
            return false;
        }
        XM xm = (XM) obj;
        return Intrinsics.a(xm.a, this.a) && Intrinsics.a(xm.b, this.b) && xm.c == this.c && Intrinsics.a(xm.d, this.d) && Intrinsics.a(xm.e, this.e) && xm.f == this.f && xm.g == this.g && xm.h == this.h && xm.i == this.i;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Boolean.hashCode(this.i) + C2983be.a(C2983be.a(C2983be.a(C1039Gc0.b(C1039Gc0.b(C5491nL.a(C1039Gc0.b(C1039Gc0.b(527, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31), this.h, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j2 = this.c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                Date date = new Date(j2);
                QT.a aVar = QT.a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String str = QT.a.get().format(date);
                Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }
}

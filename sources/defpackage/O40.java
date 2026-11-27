package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class O40 {
    public static final Pattern b = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);
    public final long a;

    public O40(long j) {
        this.a = j;
    }

    public static O40 a(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(C1039Gc0.d("String value [", str, "] is not in the expected format."));
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(3);
        double dDoubleValue = Double.valueOf(strGroup).doubleValue();
        if (strGroup2.equalsIgnoreCase("milli") || strGroup2.equalsIgnoreCase("millisecond") || strGroup2.length() == 0) {
            return new O40((long) dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("second") || strGroup2.equalsIgnoreCase("seconde")) {
            return new O40((long) (dDoubleValue * 1000.0d));
        }
        if (strGroup2.equalsIgnoreCase("minute")) {
            return new O40((long) (dDoubleValue * 60000.0d));
        }
        if (strGroup2.equalsIgnoreCase("hour")) {
            return new O40((long) (dDoubleValue * 3600000.0d));
        }
        if (strGroup2.equalsIgnoreCase("day")) {
            return new O40((long) (dDoubleValue * 8.64E7d));
        }
        throw new IllegalStateException("Unexpected ".concat(strGroup2));
    }

    public final String toString() {
        long j = this.a;
        if (j >= 1000) {
            if (j < 60000) {
                return C0681Bn.c(new StringBuilder(), j / 1000, " seconds");
            }
            return j < 3600000 ? C0681Bn.c(new StringBuilder(), j / 60000, " minutes") : C0681Bn.c(new StringBuilder(), j / 3600000, " hours");
        }
        return j + " milliseconds";
    }
}

package defpackage;

import android.os.LocaleList;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class OR0 {
    public static final OR0 b = new OR0(new QR0(b.a(new Locale[0])));
    public final QR0 a;

    public static class a {
        public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(@NonNull Locale locale, @NonNull Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (locale.getLanguage().equals(locale2.getLanguage())) {
                Locale[] localeArr = a;
                for (Locale locale3 : localeArr) {
                    if (locale3.equals(locale)) {
                        return false;
                    }
                }
                for (Locale locale4 : localeArr) {
                    if (locale4.equals(locale2)) {
                        return false;
                    }
                }
                String strC = C3663es0.c(C3663es0.a(C3663es0.b(locale)));
                if (!strC.isEmpty()) {
                    return strC.equals(C3663es0.c(C3663es0.a(C3663es0.b(locale2))));
                }
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public OR0(QR0 qr0) {
        this.a = qr0;
    }

    @NonNull
    public static OR0 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = a.a(strArrSplit[i]);
        }
        return new OR0(new QR0(b.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OR0) {
            return this.a.equals(((OR0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @NonNull
    public final String toString() {
        return this.a.a.toString();
    }
}

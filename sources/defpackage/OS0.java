package defpackage;

import android.os.Build;
import android.util.Log;
import io.sentry.android.core.b0;

/* JADX INFO: loaded from: classes.dex */
public final class OS0 {
    public static void a(String str, String str2, Object obj) {
        if (Log.isLoggable(c(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String strC = c(str);
        if (Log.isLoggable(strC, 6)) {
            b0.d(strC, str2, exc);
        }
    }

    public static String c(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }
}

package defpackage;

import io.sentry.android.core.b0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BK0 {
    public final HashMap a = new HashMap();
    public final int b = 64;
    public final int c;

    public BK0(int i) {
        this.c = i;
    }

    public final synchronized void a(Map<String, String> map) {
        String strTrim;
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                int i2 = this.c;
                String strTrim2 = key.trim();
                if (strTrim2.length() > i2) {
                    strTrim2 = strTrim2.substring(0, i2);
                }
                if (this.a.size() < this.b || this.a.containsKey(strTrim2)) {
                    String value = entry.getValue();
                    HashMap map2 = this.a;
                    if (value == null) {
                        strTrim = "";
                    } else {
                        int i3 = this.c;
                        strTrim = value.trim();
                        if (strTrim.length() > i3) {
                            strTrim = strTrim.substring(0, i3);
                        }
                    }
                    map2.put(strTrim2, strTrim);
                } else {
                    i++;
                }
            }
            if (i > 0) {
                b0.f("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

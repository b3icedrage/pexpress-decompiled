package defpackage;

import android.util.Log;
import io.sentry.android.core.b0;
import io.sentry.instrumentation.file.f;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class YZ0 {
    public static final Charset b = Charset.forName("UTF-8");
    public final C4448id0 a;

    public YZ0(C4448id0 c4448id0) {
        this.a = c4448id0;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static void d(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public final Map<String, String> b(String str, boolean z) {
        C4448id0 c4448id0 = this.a;
        File fileB = z ? c4448id0.b(str, "internal-keys") : c4448id0.b(str, "keys");
        if (!fileB.exists() || fileB.length() == 0) {
            d(fileB);
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStreamA = null;
        try {
            fileInputStreamA = f.a.a(fileB, new FileInputStream(fileB));
            return a(C7155vG.j(fileInputStreamA));
        } catch (Exception e) {
            b0.f("FirebaseCrashlytics", "Error deserializing user metadata.", e);
            d(fileB);
            return Collections.EMPTY_MAP;
        } finally {
            C7155vG.a(fileInputStreamA, "Failed to close user metadata file.");
        }
    }

    public final String c(String str) throws Throwable {
        FileInputStream fileInputStreamA;
        File fileB = this.a.b(str, "user-data");
        FileInputStream fileInputStream = null;
        if (!fileB.exists() || fileB.length() == 0) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            d(fileB);
            return null;
        }
        try {
            fileInputStreamA = f.a.a(fileB, new FileInputStream(fileB));
            try {
                try {
                    JSONObject jSONObject = new JSONObject(C7155vG.j(fileInputStreamA));
                    String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    C7155vG.a(fileInputStreamA, "Failed to close user metadata file.");
                    return strOptString;
                } catch (Exception e) {
                    e = e;
                    b0.f("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    d(fileB);
                    C7155vG.a(fileInputStreamA, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStreamA;
                C7155vG.a(fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStreamA = null;
        } catch (Throwable th2) {
            th = th2;
            C7155vG.a(fileInputStream, "Failed to close user metadata file.");
            throw th;
        }
    }
}

package defpackage;

import android.util.Log;
import io.sentry.android.core.b0;
import io.sentry.instrumentation.file.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: ux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7087ux {
    public final Serializable a;

    public C7087ux(C3156cT0 c3156cT0) {
        this.a = c3156cT0;
    }

    public /* synthetic */ void a(Object obj) {
        Intrinsics.checkNotNullExpressionValue(((C3156cT0) this.a).invoke(obj), "invoke(...)");
    }

    public JSONObject b() {
        FileInputStream fileInputStreamA;
        Throwable th;
        Exception e;
        JSONObject jSONObject;
        Log.isLoggable("FirebaseCrashlytics", 3);
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = (File) this.a;
                try {
                    if (file.exists()) {
                        fileInputStreamA = f.a.a(file, new FileInputStream(file));
                        try {
                            try {
                                jSONObject = new JSONObject(C7155vG.j(fileInputStreamA));
                                fileInputStream = fileInputStreamA;
                            } catch (Exception e2) {
                                e = e2;
                                b0.d("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                                C7155vG.a(fileInputStreamA, "Error while closing settings cache file.");
                                return null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            C7155vG.a(fileInputStreamA, "Error while closing settings cache file.");
                            throw th;
                        }
                    } else {
                        Log.isLoggable("FirebaseCrashlytics", 2);
                        jSONObject = null;
                    }
                    C7155vG.a(fileInputStream, "Error while closing settings cache file.");
                    return jSONObject;
                } catch (Exception e3) {
                    e = e3;
                    fileInputStreamA = null;
                    b0.d("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    C7155vG.a(fileInputStreamA, "Error while closing settings cache file.");
                    return null;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th3) {
            fileInputStreamA = null;
            th = th3;
            C7155vG.a(fileInputStreamA, "Error while closing settings cache file.");
            throw th;
        }
    }

    public C7087ux(C4448id0 c4448id0) {
        this.a = new File(c4448id0.b, "com.crashlytics.settings.json");
    }
}

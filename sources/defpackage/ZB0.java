package defpackage;

import io.sentry.android.core.b0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ZB0 {
    public final Object a;

    public /* synthetic */ ZB0(Object obj) {
        this.a = obj;
    }

    public C6326rJ1 a(JSONObject jSONObject) {
        DJ1 gj1;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            b0.d("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            gj1 = new VV();
        } else {
            gj1 = new GJ1();
        }
        return gj1.a((C3481e1) this.a, jSONObject);
    }
}

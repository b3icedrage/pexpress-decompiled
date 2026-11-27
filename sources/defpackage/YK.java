package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class YK implements J71, C2943bS.b {
    public final Object d;

    public /* synthetic */ YK(Object obj) {
        this.d = obj;
    }

    public static void a(C0613Aq0 c0613Aq0, FJ1 fj1) {
        String str = fj1.a;
        if (str != null) {
            c0613Aq0.c("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        c0613Aq0.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c0613Aq0.c("X-CRASHLYTICS-API-CLIENT-VERSION", "18.3.5");
        c0613Aq0.c("Accept", "application/json");
        String str2 = fj1.b;
        if (str2 != null) {
            c0613Aq0.c("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = fj1.c;
        if (str3 != null) {
            c0613Aq0.c("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = fj1.d;
        if (str4 != null) {
            c0613Aq0.c("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String strC = fj1.e.c();
        if (strC != null) {
            c0613Aq0.c("X-CRASHLYTICS-INSTALLATION-ID", strC);
        }
    }

    public static HashMap b(FJ1 fj1) {
        HashMap map = new HashMap();
        map.put("build_version", fj1.h);
        map.put("display_version", fj1.g);
        map.put(Payload.SOURCE, Integer.toString(fj1.i));
        String str = fj1.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject c(C4968kr0 c4968kr0) {
        Log.isLoggable("FirebaseCrashlytics", 2);
        int i = c4968kr0.a;
        String str = (String) this.d;
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            b0.d("FirebaseCrashlytics", "Settings request failed; (status: " + i + ") from " + str, null);
            return null;
        }
        String str2 = c4968kr0.b;
        try {
            return new JSONObject(str2);
        } catch (Exception e) {
            b0.f("FirebaseCrashlytics", "Failed to parse settings JSON from " + str, e);
            b0.f("FirebaseCrashlytics", "Settings response " + str2, null);
            return null;
        }
    }

    @Override // defpackage.J71
    public Object e() {
        Class cls = (Class) this.d;
        try {
            return AbstractC3516e92.a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override // defpackage.C2943bS.b
    public Iterable r(Object obj) {
        Collection<AbstractC4649jL0> collectionA = ((FC) obj).p().a();
        Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionA.iterator();
        while (it.hasNext()) {
            InterfaceC5044lD interfaceC5044lDC = ((AbstractC4649jL0) it.next()).V0().c();
            FC fcF = null;
            InterfaceC5044lD interfaceC5044lDA = interfaceC5044lDC != null ? interfaceC5044lDC.U0() : null;
            FC fc = interfaceC5044lDA instanceof FC ? (FC) interfaceC5044lDA : null;
            if (fc != null && (fcF = ((C5693oI0) this.d).f(fc)) == null) {
                fcF = fc;
            }
            if (fcF != null) {
                arrayList.add(fcF);
            }
        }
        return arrayList;
    }

    public YK(String str, C7279vr c7279vr) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.d = str;
    }
}

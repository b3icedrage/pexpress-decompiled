package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.android.core.b0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0780Cu implements InterfaceC7846ya, InterfaceC1014Fu, J71 {
    public Object d;

    @NonNull
    public static String a(@NonNull String str, @NonNull Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // defpackage.InterfaceC1014Fu
    public void b(InterfaceC0858Du interfaceC0858Du) {
        this.d = interfaceC0858Du;
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // defpackage.InterfaceC7846ya
    public void c(@NonNull String str, @NonNull Bundle bundle) {
        InterfaceC0858Du interfaceC0858Du = (InterfaceC0858Du) this.d;
        if (interfaceC0858Du != null) {
            try {
                interfaceC0858Du.a("$A$:" + a(str, bundle));
            } catch (JSONException unused) {
                b0.f("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // defpackage.J71
    public Object e() {
        Type type = (Type) this.d;
        if (!(type instanceof ParameterizedType)) {
            throw new C2911bH0("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new C2911bH0("Invalid EnumSet type: " + type.toString());
    }
}

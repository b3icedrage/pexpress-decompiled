package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ue0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7022ue0 {
    public final C0574Ad0 a;
    public final Executor b;
    public final C5059lI c;
    public final C5059lI d;
    public final a e;
    public final C7161vI f;
    public final b g;
    public final InterfaceC2400Xd0 h;

    public C7022ue0(InterfaceC2400Xd0 interfaceC2400Xd0, C0574Ad0 c0574Ad0, Executor executor, C5059lI c5059lI, C5059lI c5059lI2, C5059lI c5059lI3, a aVar, C7161vI c7161vI, b bVar) {
        this.h = interfaceC2400Xd0;
        this.a = c0574Ad0;
        this.b = executor;
        this.c = c5059lI;
        this.d = c5059lI2;
        this.e = aVar;
        this.f = c7161vI;
        this.g = bVar;
    }

    public static ArrayList b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    @NonNull
    public final HashMap a() {
        String string;
        C0577Ae0 c0577Ae0;
        C7161vI c7161vI = this.f;
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(C7161vI.b(c7161vI.c));
        hashSet.addAll(C7161vI.b(c7161vI.d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            C5272mI c5272mIA = C7161vI.a(c7161vI.c);
            String string2 = null;
            if (c5272mIA == null) {
                string = null;
            } else {
                try {
                    string = c5272mIA.b.getString(str);
                } catch (JSONException unused) {
                    string = null;
                }
            }
            if (string != null) {
                C5272mI c5272mIA2 = C7161vI.a(c7161vI.c);
                if (c5272mIA2 != null) {
                    synchronized (c7161vI.a) {
                        try {
                            Iterator it = c7161vI.a.iterator();
                            while (it.hasNext()) {
                                c7161vI.b.execute(new RunnableC6951uI((BiConsumer) it.next(), str, c5272mIA2, 0));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                c0577Ae0 = new C0577Ae0(string, 2);
            } else {
                C5272mI c5272mIA3 = C7161vI.a(c7161vI.d);
                if (c5272mIA3 != null) {
                    try {
                        string2 = c5272mIA3.b.getString(str);
                    } catch (JSONException unused2) {
                    }
                }
                if (string2 != null) {
                    c0577Ae0 = new C0577Ae0(string2, 1);
                } else {
                    b0.e("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
                    c0577Ae0 = new C0577Ae0("", 0);
                }
            }
            map.put(str, c0577Ae0);
        }
        return map;
    }
}

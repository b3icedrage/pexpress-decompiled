package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.JsonReader;
import com.api.core.BaseFragment;
import io.sentry.android.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z0 implements C6342rP.a, a.InterfaceC0383a {
    public static C0667Bi0 b(String str, BaseFragment baseFragment, boolean z, int i) {
        Intrinsics.checkNotNull(str);
        return new C0667Bi0(baseFragment, z, i);
    }

    public static String c(String str, String str2) {
        return str + str2;
    }

    public static void e(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    @Override // io.sentry.android.core.util.a.InterfaceC0383a
    public Object a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i != 0) {
                return context.getString(i);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.C6342rP.a
    public Object d(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null libraryName");
                    }
                    break;
                    break;
                case "arch":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null arch");
                    }
                    break;
                    break;
                case "buildId":
                    strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildId");
                    }
                    break;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strC = strNextString == null ? " arch" : "";
        if (strNextString2 == null) {
            strC = strC.concat(" libraryName");
        }
        if (strNextString3 == null) {
            strC = c(strC, " buildId");
        }
        if (strC.isEmpty()) {
            return new C2429Xn(strNextString, strNextString2, strNextString3);
        }
        throw new IllegalStateException("Missing required properties:".concat(strC));
    }
}

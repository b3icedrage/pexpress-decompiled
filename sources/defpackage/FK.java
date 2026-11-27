package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.internal.gtm.zzuq;
import io.sentry.android.core.util.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FK implements C6342rP.a, InterfaceC1608Nj0, a.InterfaceC0383a {
    public static int b(int i, int i2, int i3) {
        return zzuq.zzD(i) + i2 + i3;
    }

    public static String c(Object obj, String str) {
        return str + obj;
    }

    @Override // io.sentry.android.core.util.a.InterfaceC0383a
    public Object a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        return ((C5241m80) obj).b;
    }

    @Override // defpackage.C6342rP.a
    public Object d(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Long lValueOf = null;
        Long lValueOf2 = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null name");
                    }
                    str = strNextString;
                    break;
                    break;
                case "size":
                    lValueOf2 = Long.valueOf(jsonReader.nextLong());
                    break;
                case "uuid":
                    str2 = new String(Base64.decode(jsonReader.nextString(), 2), AbstractC5713oP.a);
                    break;
                case "baseAddress":
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strC = lValueOf == null ? " baseAddress" : "";
        if (lValueOf2 == null) {
            strC = strC.concat(" size");
        }
        if (str == null) {
            strC = Z0.c(strC, " name");
        }
        if (strC.isEmpty()) {
            return new C4748jo(lValueOf.longValue(), lValueOf2.longValue(), str, str2);
        }
        throw new IllegalStateException("Missing required properties:".concat(strC));
    }
}

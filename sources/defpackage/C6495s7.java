package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.perf.FirebasePerfRegistrar;
import io.sentry.ILogger;
import io.sentry.android.core.TombstoneIntegration;
import io.sentry.android.core.cache.a;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: s7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6495s7 implements InterfaceC1608Nj0, C6342rP.a, InterfaceC5056lH, a.C0380a.InterfaceC0381a {
    public final /* synthetic */ int d;

    public /* synthetic */ C6495s7(int i) {
        this.d = i;
    }

    public static StringBuilder b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void e(HashMap map, String str, C6319rH0 c6319rH0, String str2, ILogger iLogger) {
        Object obj = map.get(str);
        c6319rH0.c(str2);
        c6319rH0.g(iLogger, obj);
    }

    @Override // io.sentry.android.core.cache.a.C0380a.InterfaceC0381a
    public Long a(Object obj) {
        return Long.valueOf(((TombstoneIntegration.a) obj).d);
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        long jCurrentTimeMillis;
        switch (this.d) {
            case 1:
                return Boolean.valueOf(((C6960uL.a) obj).b);
            default:
                AbstractC7844yZ0 abstractC7844yZ0 = (AbstractC7844yZ0) obj;
                abstractC7844yZ0.getClass();
                if (abstractC7844yZ0 instanceof L8) {
                    jCurrentTimeMillis = ((L8) abstractC7844yZ0).a.g;
                } else if (abstractC7844yZ0 instanceof TD) {
                    jCurrentTimeMillis = ((TD) abstractC7844yZ0).a.g;
                } else if (abstractC7844yZ0 instanceof LF1) {
                    jCurrentTimeMillis = ((LF1) abstractC7844yZ0).a.b;
                } else {
                    jCurrentTimeMillis = abstractC7844yZ0 instanceof C8059za2 ? ((C8059za2) abstractC7844yZ0).a.e : System.currentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                }
                return Long.valueOf(jCurrentTimeMillis);
        }
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        return FirebasePerfRegistrar.providesFirebasePerformance(c1480Lt1);
    }

    @Override // defpackage.C6342rP.a
    public Object d(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        byte[] bArrDecode = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null filename");
                }
            } else if (strNextName.equals("contents")) {
                bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                if (bArrDecode == null) {
                    throw new NullPointerException("Null contents");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " filename" : "";
        if (bArrDecode == null) {
            strConcat = strConcat.concat(" contents");
        }
        if (strConcat.isEmpty()) {
            return new C2812ao(strNextString, bArrDecode);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }
}

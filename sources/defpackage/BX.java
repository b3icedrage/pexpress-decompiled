package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BX implements InterfaceC1608Nj0 {
    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static String b(C2251Vp1 c2251Vp1, Class cls, StringBuilder sb) {
        sb.append(c2251Vp1.b(cls));
        return sb.toString();
    }

    public static String c(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "SUCCESS";
            case 2:
                return "BAD_REQUEST";
            case 3:
                return Payload.RESPONSE_TIMEOUT;
            case 4:
                return "PAYLOAD_TOO_LARGE";
            case 5:
                return "TOO_MANY_REQUESTS";
            case 6:
                return "FAILED";
            default:
                return "null";
        }
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        return ((C2980bd0) obj).g;
    }
}

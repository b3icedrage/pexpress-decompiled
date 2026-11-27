package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EK1 {
    public static final /* synthetic */ IJ0<Object>[] z;

    @NotNull
    public final C6749tK1 a;

    @NotNull
    public final C6749tK1 b;

    @NotNull
    public final C6749tK1 c;

    @NotNull
    public final C6749tK1 d;

    @NotNull
    public final C6749tK1 e;

    @NotNull
    public final C6749tK1 f;

    @NotNull
    public final C6749tK1 g;

    @NotNull
    public final C6749tK1 h;

    @NotNull
    public final C6749tK1 i;

    @NotNull
    public final C6749tK1 j;

    @NotNull
    public final C6749tK1 k;

    @NotNull
    public final C6749tK1 l;

    @NotNull
    public final C6749tK1 m;

    @NotNull
    public final C6749tK1 n;

    @NotNull
    public final C6749tK1 o;

    @NotNull
    public final C6749tK1 p;

    @NotNull
    public final C6749tK1 q;

    @NotNull
    public final C6749tK1 r;

    @NotNull
    public final C6749tK1 s;

    @NotNull
    public final C6749tK1 t;

    @NotNull
    public final C6749tK1 u;

    @NotNull
    public final C6749tK1 v;

    @NotNull
    public final C6749tK1 w;

    @NotNull
    public final C6749tK1 x;

    @NotNull
    public final C6749tK1 y;

    static {
        C3068c21 c3068c21 = new C3068c21(EK1.class, "deviceId", "getDeviceId()Ljava/lang/String;");
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        z = new IJ0[]{c2251Vp1.e(c3068c21), C0681Bn.b(EK1.class, "clientId", "getClientId()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "path", "getPath()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "startOnInitialization", "getStartOnInitialization()Z", c2251Vp1), C0681Bn.b(EK1.class, "chatserverHost", "getChatserverHost()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "apiHost", "getApiHost()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "filesHost", "getFilesHost()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "host", "getHost()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "port", "getPort()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "siteId", "getSiteId()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "widgetId", "getWidgetId()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "userToken", "getUserToken()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "pushToken", "getPushToken()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "doNotShowPings", "getDoNotShowPings()Z", c2251Vp1), C0681Bn.b(EK1.class, "lastReadMsgId", "getLastReadMsgId()J", c2251Vp1), C0681Bn.b(EK1.class, "lastUnreadMsgId", "getLastUnreadMsgId()J", c2251Vp1), C0681Bn.b(EK1.class, "lastAckMsgId", "getLastAckMsgId()J", c2251Vp1), C0681Bn.b(EK1.class, "inAppNotificationEnabled", "getInAppNotificationEnabled()Z", c2251Vp1), C0681Bn.b(EK1.class, "nightModePreference", "getNightModePreference()Z", c2251Vp1), C0681Bn.b(EK1.class, "clientMessage", "getClientMessage()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "contactInfo", "getContactInfo()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "hasSentContactInfo", "getHasSentContactInfo()Z", c2251Vp1), C0681Bn.b(EK1.class, "blacklistedTime", "getBlacklistedTime()J", c2251Vp1), C0681Bn.b(EK1.class, "sanctionedTime", "getSanctionedTime()J", c2251Vp1), C0681Bn.b(EK1.class, "hasSentPushToken", "getHasSentPushToken()Z", c2251Vp1), C0681Bn.b(EK1.class, "customData", "getCustomData()Ljava/lang/String;", c2251Vp1), C0681Bn.b(EK1.class, "hasSentCustomData", "getHasSentCustomData()Z", c2251Vp1), C0681Bn.b(EK1.class, "chatId", "getChatId()Ljava/lang/String;", c2251Vp1)};
    }

    public EK1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences preferences = context.getSharedPreferences("com.jivosite.sdk.session", 0);
        Intrinsics.checkNotNullExpressionValue(preferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.a = new C6749tK1(preferences, "deviceId", "");
        this.b = new C6749tK1(preferences, "clientId", "");
        this.c = new C6749tK1(preferences, "path", "");
        Boolean START_ON_INITIALIZATION = Boolean.TRUE;
        Intrinsics.checkNotNullExpressionValue(START_ON_INITIALIZATION, "START_ON_INITIALIZATION");
        this.d = new C6749tK1(preferences, "startOnInitialization", START_ON_INITIALIZATION);
        this.e = new C6749tK1(preferences, "chatserverHost", "");
        this.f = new C6749tK1(preferences, "apiHost", "");
        this.g = new C6749tK1(preferences, "filesHost", "");
        this.h = new C6749tK1(preferences, "host", "");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter("port", AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.i = new C6749tK1(preferences, "siteId", "");
        this.j = new C6749tK1(preferences, "widgetId", "");
        this.k = new C6749tK1(preferences, "userToken", "");
        this.l = new C6749tK1(preferences, "pushToken", "");
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter("doNotShowPings", AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.m = new C6749tK1(preferences, "lastReadMsgId", 0L);
        this.n = new C6749tK1(preferences, "lastUnreadMsgId", 0L);
        this.o = new C6749tK1(preferences, "lastMsgAckId", 0L);
        this.p = new C6749tK1(preferences, "notification", START_ON_INITIALIZATION);
        C6749tK1 c6749tK1 = new C6749tK1(preferences, "nightMode", bool);
        EY0 ey0 = new EY0();
        Boolean bool2 = (Boolean) c6749tK1.a(z[18], this);
        bool2.getClass();
        ey0.k(bool2);
        ey0.l(ey0, new DK1());
        this.q = new C6749tK1(preferences, "clientMessage", "");
        this.r = new C6749tK1(preferences, "contactInfo", "");
        this.s = new C6749tK1(preferences, "hasSentContactInfo", bool);
        this.t = new C6749tK1(preferences, "blacklistedTime", -1L);
        this.u = new C6749tK1(preferences, "sanctionedTime", -1L);
        this.v = new C6749tK1(preferences, "hasSentPushToken", bool);
        this.w = new C6749tK1(preferences, "customData", "");
        this.x = new C6749tK1(preferences, "hasSentCustomData", bool);
        this.y = new C6749tK1(preferences, "chatID", "");
    }

    public final long a() {
        return ((Number) this.t.a(z[22], this)).longValue();
    }

    public final boolean b() {
        return ((Boolean) this.s.a(z[21], this)).booleanValue();
    }

    public final long c() {
        return ((Number) this.u.a(z[23], this)).longValue();
    }

    @NotNull
    public final String d() {
        return (String) this.i.a(z[9], this);
    }

    @NotNull
    public final String e() {
        return (String) this.j.a(z[10], this);
    }

    public final void f(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.y.b(z[27], str);
    }

    public final void g(boolean z2) {
        this.v.b(z[24], Boolean.valueOf(z2));
    }

    public final void h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.l.b(z[12], str);
    }
}

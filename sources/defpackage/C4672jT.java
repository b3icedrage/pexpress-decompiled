package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@XH1
public final class C4672jT {

    @NotNull
    public static final b Companion = new b();

    @NotNull
    public static final RJ0<Object>[] o = {null, null, null, null, new C6976uQ0(C6144qS1.a, TG0.a), null, null, null, null, null, null, null, null, null};

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final C1800Pv0 d;

    @NotNull
    public final Map<String, JsonElement> e;

    @NotNull
    public final JsonElement f;

    @NotNull
    public final C4996l00 g;

    @NotNull
    public final String h;

    @NotNull
    public final String i;

    @NotNull
    public final String j;

    @NotNull
    public final String k;

    @NotNull
    public final String l;
    public final long m;

    @NotNull
    public final String n;

    /* JADX INFO: renamed from: jT$a */
    public /* synthetic */ class a implements InterfaceC0829Dk0<C4672jT> {

        @NotNull
        public static final a a;

        @NotNull
        public static final C6188qf1 b;

        static {
            a aVar = new a();
            a = aVar;
            C6188qf1 c6188qf1 = new C6188qf1("com.pexpress.events.api.model.DataWithInfoAndProperties", aVar, 14);
            c6188qf1.l("event_id");
            c6188qf1.l("event_type");
            c6188qf1.l("tracker_id");
            c6188qf1.l("identity");
            c6188qf1.l("user_properties");
            c6188qf1.l("event_properties");
            c6188qf1.l("device");
            c6188qf1.l("language");
            c6188qf1.l("platform");
            c6188qf1.l("app_name");
            c6188qf1.l("current_app_version");
            c6188qf1.l("sdk_version");
            c6188qf1.l("session_id");
            c6188qf1.l("utc_time");
            b = c6188qf1;
        }

        @Override // defpackage.RJ0
        public final void a(C3783fS1 encoder, Object obj) {
            C4672jT value = (C4672jT) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C6188qf1 c6188qf1 = b;
            GH ghC = encoder.c(c6188qf1);
            ghC.w(c6188qf1, 0, value.a);
            ghC.w(c6188qf1, 1, value.b);
            ghC.w(c6188qf1, 2, value.c);
            ghC.n(c6188qf1, 3, C1800Pv0.a.a, value.d);
            ghC.n(c6188qf1, 4, C4672jT.o[4], value.e);
            ghC.n(c6188qf1, 5, TG0.a, value.f);
            ghC.n(c6188qf1, 6, C4996l00.a.a, value.g);
            ghC.w(c6188qf1, 7, value.h);
            ghC.w(c6188qf1, 8, value.i);
            ghC.w(c6188qf1, 9, value.j);
            ghC.w(c6188qf1, 10, value.k);
            ghC.w(c6188qf1, 11, value.l);
            ghC.j(c6188qf1, 12, value.m);
            ghC.w(c6188qf1, 13, value.n);
            ghC.b(c6188qf1);
        }

        @Override // defpackage.InterfaceC0829Dk0
        @NotNull
        public final RJ0<?>[] b() {
            RJ0<?> rj0 = C4672jT.o[4];
            C6144qS1 c6144qS1 = C6144qS1.a;
            return new RJ0[]{c6144qS1, c6144qS1, c6144qS1, C1800Pv0.a.a, rj0, TG0.a, C4996l00.a.a, c6144qS1, c6144qS1, c6144qS1, c6144qS1, c6144qS1, GT0.a, c6144qS1};
        }

        @Override // defpackage.RJ0
        @NotNull
        public final MH1 c() {
            return b;
        }

        @Override // defpackage.RJ0
        public final Object d(InterfaceC7828yU decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C6188qf1 c6188qf1 = b;
            EH ehC = decoder.c(c6188qf1);
            RJ0<Object>[] rj0Arr = C4672jT.o;
            C4996l00 c4996l00 = null;
            int i = 0;
            String strN = null;
            String strN2 = null;
            String strN3 = null;
            C1800Pv0 c1800Pv0 = null;
            Map map = null;
            JsonElement jsonElement = null;
            String strN4 = null;
            String strN5 = null;
            String strN6 = null;
            String strN7 = null;
            String strN8 = null;
            String strN9 = null;
            long jD = 0;
            boolean z = true;
            while (z) {
                int iH = ehC.h(c6188qf1);
                switch (iH) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strN = ehC.n(c6188qf1, 0);
                        i |= 1;
                        break;
                    case 1:
                        strN2 = ehC.n(c6188qf1, 1);
                        i |= 2;
                        break;
                    case 2:
                        strN3 = ehC.n(c6188qf1, 2);
                        i |= 4;
                        break;
                    case 3:
                        c1800Pv0 = (C1800Pv0) ehC.r(c6188qf1, 3, C1800Pv0.a.a, c1800Pv0);
                        i |= 8;
                        break;
                    case 4:
                        map = (Map) ehC.r(c6188qf1, 4, rj0Arr[4], map);
                        i |= 16;
                        break;
                    case 5:
                        jsonElement = (JsonElement) ehC.r(c6188qf1, 5, TG0.a, jsonElement);
                        i |= 32;
                        break;
                    case 6:
                        c4996l00 = (C4996l00) ehC.r(c6188qf1, 6, C4996l00.a.a, c4996l00);
                        i |= 64;
                        break;
                    case 7:
                        strN4 = ehC.n(c6188qf1, 7);
                        i |= UserVerificationMethods.USER_VERIFY_PATTERN;
                        break;
                    case 8:
                        strN5 = ehC.n(c6188qf1, 8);
                        i |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                        break;
                    case 9:
                        strN6 = ehC.n(c6188qf1, 9);
                        i |= UserVerificationMethods.USER_VERIFY_NONE;
                        break;
                    case 10:
                        strN7 = ehC.n(c6188qf1, 10);
                        i |= UserVerificationMethods.USER_VERIFY_ALL;
                        break;
                    case 11:
                        strN8 = ehC.n(c6188qf1, 11);
                        i |= 2048;
                        break;
                    case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        jD = ehC.D(c6188qf1, 12);
                        i |= 4096;
                        break;
                    case 13:
                        strN9 = ehC.n(c6188qf1, 13);
                        i |= 8192;
                        break;
                    default:
                        throw new L82(iH);
                }
            }
            ehC.b(c6188qf1);
            return new C4672jT(i, strN, strN2, strN3, c1800Pv0, map, jsonElement, c4996l00, strN4, strN5, strN6, strN7, strN8, jD, strN9);
        }
    }

    /* JADX INFO: renamed from: jT$b */
    public static final class b {
        @NotNull
        public final RJ0<C4672jT> serializer() {
            return a.a;
        }
    }

    public C4672jT(int i, String str, String str2, String str3, C1800Pv0 c1800Pv0, Map map, JsonElement jsonElement, C4996l00 c4996l00, String str4, String str5, String str6, String str7, String str8, long j, String str9) {
        if (16383 != (i & 16383)) {
            C3787fU.m(i, 16383, a.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c1800Pv0;
        this.e = map;
        this.f = jsonElement;
        this.g = c4996l00;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = j;
        this.n = str9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4672jT)) {
            return false;
        }
        C4672jT c4672jT = (C4672jT) obj;
        return Intrinsics.a(this.a, c4672jT.a) && Intrinsics.a(this.b, c4672jT.b) && Intrinsics.a(this.c, c4672jT.c) && Intrinsics.a(this.d, c4672jT.d) && Intrinsics.a(this.e, c4672jT.e) && Intrinsics.a(this.f, c4672jT.f) && Intrinsics.a(this.g, c4672jT.g) && Intrinsics.a(this.h, c4672jT.h) && Intrinsics.a(this.i, c4672jT.i) && Intrinsics.a(this.j, c4672jT.j) && Intrinsics.a(this.k, c4672jT.k) && Intrinsics.a(this.l, c4672jT.l) && this.m == c4672jT.m && Intrinsics.a(this.n, c4672jT.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + C5491nL.a(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DataWithInfoAndProperties(eventId=");
        sb.append(this.a);
        sb.append(", eventType=");
        sb.append(this.b);
        sb.append(", trackerId=");
        sb.append(this.c);
        sb.append(", identity=");
        sb.append(this.d);
        sb.append(", properties=");
        sb.append(this.e);
        sb.append(", eventProperties=");
        sb.append(this.f);
        sb.append(", deviceInfo=");
        sb.append(this.g);
        sb.append(", language=");
        sb.append(this.h);
        sb.append(", platform=");
        sb.append(this.i);
        sb.append(", appName=");
        sb.append(this.j);
        sb.append(", currentAppVersion=");
        sb.append(this.k);
        sb.append(", currentLibraryVersion=");
        sb.append(this.l);
        sb.append(", sessionId=");
        sb.append(this.m);
        sb.append(", utcTime=");
        return C5807oq.b(sb, this.n, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4672jT(@NotNull String eventId, @NotNull String eventType, @NotNull String trackerId, @NotNull C1800Pv0 identity, @NotNull Map<String, ? extends JsonElement> properties, @NotNull JsonElement eventProperties, @NotNull C4996l00 deviceInfo, @NotNull String language, @NotNull String platform, @NotNull String appName, @NotNull String currentAppVersion, @NotNull String currentLibraryVersion, long j, @NotNull String utcTime) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(trackerId, "trackerId");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(eventProperties, "eventProperties");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(currentAppVersion, "currentAppVersion");
        Intrinsics.checkNotNullParameter(currentLibraryVersion, "currentLibraryVersion");
        Intrinsics.checkNotNullParameter(utcTime, "utcTime");
        this.a = eventId;
        this.b = eventType;
        this.c = trackerId;
        this.d = identity;
        this.e = properties;
        this.f = eventProperties;
        this.g = deviceInfo;
        this.h = language;
        this.i = platform;
        this.j = appName;
        this.k = currentAppVersion;
        this.l = currentLibraryVersion;
        this.m = j;
        this.n = utcTime;
    }
}

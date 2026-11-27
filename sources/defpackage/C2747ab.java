package defpackage;

import android.location.Location;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2747ab implements InterfaceC5978pf1 {

    @NotNull
    public static final Set<String> g;
    public C3595ea d;
    public C2971bb e;

    /* JADX INFO: renamed from: ab$a */
    public static final class a {
    }

    static {
        String[] elements = {"", "9774d56d682e549c", "unknown", "000000000000000", "Android", "DEFACE", "00000000-0000-0000-0000-000000000000"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        g = C1526Mj.H(elements);
    }

    @Override // defpackage.InterfaceC5978pf1
    public final void a(@NotNull C3595ea amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        e(amplitude);
        MI mi = amplitude.a;
        Intrinsics.c(mi, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        this.e = new C2971bb(mi.a, mi.j, mi.i.a("adid"));
        i(mi);
    }

    @Override // defpackage.InterfaceC5978pf1
    public final void e(@NotNull C3595ea c3595ea) {
        Intrinsics.checkNotNullParameter(c3595ea, "<set-?>");
        this.d = c3595ea;
    }

    @Override // defpackage.InterfaceC5978pf1
    @Nullable
    public final C0612Aq g(@NotNull C0612Aq event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MI mi = h().a;
        Intrinsics.c(mi, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        if (event.c == null) {
            event.c = Long.valueOf(System.currentTimeMillis());
            Unit unit = Unit.a;
        }
        if (event.f == null) {
            event.f = UUID.randomUUID().toString();
            Unit unit2 = Unit.a;
        }
        if (event.B == null) {
            event.B = "amplitude-analytics-android/1.19.2";
            Unit unit3 = Unit.a;
        }
        if (event.a == null) {
            event.a = h().b.a;
            Unit unit4 = Unit.a;
        }
        if (event.b == null) {
            event.b = h().b.b;
            Unit unit5 = Unit.a;
        }
        R02 r02 = mi.i;
        if (r02.a("version_name")) {
            C2971bb c2971bb = this.e;
            if (c2971bb == null) {
                Intrinsics.l("contextProvider");
                throw null;
            }
            C2971bb.a aVarB = c2971bb.b();
            Intrinsics.checkNotNull(aVarB);
            event.j = aVarB.c;
        }
        if (r02.a("os_name")) {
            C2971bb c2971bb2 = this.e;
            if (c2971bb2 == null) {
                Intrinsics.l("contextProvider");
                throw null;
            }
            C2971bb.a aVarB2 = c2971bb2.b();
            Intrinsics.checkNotNull(aVarB2);
            event.l = aVarB2.d;
        }
        if (r02.a("os_version")) {
            C2971bb c2971bb3 = this.e;
            if (c2971bb3 == null) {
                Intrinsics.l("contextProvider");
                throw null;
            }
            C2971bb.a aVarB3 = c2971bb3.b();
            Intrinsics.checkNotNull(aVarB3);
            event.m = aVarB3.e;
        }
        if (r02.a("device_brand")) {
            C2971bb c2971bb4 = this.e;
            if (c2971bb4 == null) {
                Intrinsics.l("contextProvider");
                throw null;
            }
            C2971bb.a aVarB4 = c2971bb4.b();
            Intrinsics.checkNotNull(aVarB4);
            event.n = aVarB4.f;
        }
        if (r02.a("device_manufacturer")) {
            C2971bb c2971bb5 = this.e;
            if (c2971bb5 == null) {
                Intrinsics.l("contextProvider");
                throw null;
            }
            C2971bb.a aVarB5 = c2971bb5.b();
            Intrinsics.checkNotNull(aVarB5);
            event.o = aVarB5.g;
        }
        if (r02.a(Payload.DEVICE_MODEL)) {
            C2971bb c2971bb6 = this.e;
            if (c2971bb6 == null) {
                Intrinsics.l("contextProvider");
                throw null;
            }
            C2971bb.a aVarB6 = c2971bb6.b();
            Intrinsics.checkNotNull(aVarB6);
            event.p = aVarB6.h;
        }
        if (r02.a("carrier")) {
            C2971bb c2971bb7 = this.e;
            if (c2971bb7 == null) {
                Intrinsics.l("contextProvider");
                throw null;
            }
            C2971bb.a aVarB7 = c2971bb7.b();
            Intrinsics.checkNotNull(aVarB7);
            event.q = aVarB7.i;
        }
        if (r02.a("ip_address") && event.C == null) {
            event.C = "$remote";
            Unit unit6 = Unit.a;
        }
        if (r02.a("country") && event.C != "$remote") {
            C2971bb c2971bb8 = this.e;
            if (c2971bb8 == null) {
                Intrinsics.l("contextProvider");
                throw null;
            }
            C2971bb.a aVarB8 = c2971bb8.b();
            Intrinsics.checkNotNull(aVarB8);
            event.r = aVarB8.b;
        }
        if (r02.a("language")) {
            C2971bb c2971bb9 = this.e;
            if (c2971bb9 == null) {
                Intrinsics.l("contextProvider");
                throw null;
            }
            C2971bb.a aVarB9 = c2971bb9.b();
            Intrinsics.checkNotNull(aVarB9);
            event.A = aVarB9.j;
        }
        if (r02.a("platform")) {
            event.k = "Android";
        }
        if (r02.a("lat_lng")) {
            C2971bb c2971bb10 = this.e;
            if (c2971bb10 == null) {
                Intrinsics.l("contextProvider");
                throw null;
            }
            Location locationC = c2971bb10.c();
            if (locationC != null) {
                event.g = Double.valueOf(locationC.getLatitude());
                event.h = Double.valueOf(locationC.getLongitude());
            }
        }
        if (r02.a("adid")) {
            C2971bb c2971bb11 = this.e;
            if (c2971bb11 == null) {
                Intrinsics.l("contextProvider");
                throw null;
            }
            C2971bb.a aVarB10 = c2971bb11.b();
            Intrinsics.checkNotNull(aVarB10);
            String str = aVarB10.a;
            if (str != null) {
                event.x = str;
            }
        }
        if (r02.a("app_set_id")) {
            C2971bb c2971bb12 = this.e;
            if (c2971bb12 == null) {
                Intrinsics.l("contextProvider");
                throw null;
            }
            C2971bb.a aVarB11 = c2971bb12.b();
            Intrinsics.checkNotNull(aVarB11);
            String str2 = aVarB11.k;
            if (str2 != null) {
                event.y = str2;
            }
        }
        if (event.L == null) {
            h().a.getClass();
        }
        if (event.D == null) {
            h().a.getClass();
        }
        if (event.E == null) {
            h().a.getClass();
        }
        return event;
    }

    @Override // defpackage.InterfaceC5978pf1
    @NotNull
    public final InterfaceC5978pf1.a getType() {
        return InterfaceC5978pf1.a.d;
    }

    @NotNull
    public final C3595ea h() {
        C3595ea c3595ea = this.d;
        if (c3595ea != null) {
            return c3595ea;
        }
        Intrinsics.l("amplitude");
        throw null;
    }

    public final void i(@NotNull MI configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        String str = configuration.r;
        if (str != null) {
            j(str);
            return;
        }
        String deviceId = h().b.b;
        if (deviceId != null) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            if (((deviceId.length() == 0 || g.contains(deviceId)) ? false : true) && !d.h(deviceId, "S", false)) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        sb.append(string);
        sb.append('R');
        j(sb.toString());
    }

    public void j(@NotNull String str) {
        throw null;
    }
}

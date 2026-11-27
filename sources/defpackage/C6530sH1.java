package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.feature.telemetry.exceptions.RobotTelemetryException;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6530sH1 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final C5698oK b;

    @NotNull
    public final O3 c;

    @NotNull
    public final ConcurrentHashMap<String, a> d;

    @NotNull
    public final C1790Ps e;

    @NotNull
    public final C6295r91 f;

    @NotNull
    public final C4059gl g;
    public volatile boolean h;

    @NotNull
    public final ConcurrentHashMap<String, InterfaceC2347Wu0> i;

    @Nullable
    public volatile InterfaceC4302hv0 j;

    @Nullable
    public volatile String k;

    /* JADX INFO: renamed from: sH1$a */
    public static final class a {
        public final long a;
        public final int b;

        public a(int i, long j) {
            this.a = j;
            this.b = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        @NotNull
        public final String toString() {
            return "OkFilterCrumb(emittedAt=" + this.a + ", suppressed=" + this.b + ")";
        }
    }

    public C6530sH1(@NotNull C4923kf appData, @NotNull C5698oK connectionStatus, @NotNull O3 accountModeSelection) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(connectionStatus, "connectionStatus");
        Intrinsics.checkNotNullParameter(accountModeSelection, "accountModeSelection");
        this.a = appData;
        this.b = connectionStatus;
        this.c = accountModeSelection;
        this.d = new ConcurrentHashMap<>();
        this.e = new C1790Ps();
        this.f = new C6295r91();
        this.g = new C4059gl();
        this.i = new ConcurrentHashMap<>();
    }

    public static void D(InterfaceC1015Fu0 interfaceC1015Fu0, long j, String str, String str2, String str3) {
        if (str != null) {
            interfaceC1015Fu0.b("bet.last_error_code", StringsKt.X(str, ':'));
        }
        if (str2 != null) {
            interfaceC1015Fu0.b("ws_state_at_start", str2);
        }
        if (str3 != null) {
            interfaceC1015Fu0.b("ws_state", str3);
        }
        interfaceC1015Fu0.n("elapsed_ms", String.valueOf(j));
        if (str == null) {
            str = DevicePublicKeyStringDef.NONE;
        }
        interfaceC1015Fu0.n("last_error", str);
    }

    public static void F(final long j, @NotNull final String trigger, @Nullable final String str, @Nullable final String str2) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        LJ1 lj1 = LJ1.Asset;
        WF1.a("setup", "setup.action_blocked", NG1.WARNING, PW0.e(new Pair("action", "start"), new Pair("reason", "assets_not_loaded"), new Pair("trigger", trigger), new Pair("gated_ms", Long.valueOf(j)), new Pair("ws_state", str), new Pair("account", str2)));
        QF1.a(new RobotTelemetryException.SetupActionBlocked("start:assets_not_loaded"), new MD1() { // from class: oH1
            @Override // defpackage.MD1
            public final void e(InterfaceC1015Fu0 scope) {
                Intrinsics.checkNotNullParameter(scope, "scope");
                scope.m(WE.f("setup-action-blocked", "start", "assets_not_loaded"));
                scope.b("setup.action", "start");
                scope.b("setup.block_trigger", trigger);
                String str3 = str;
                if (str3 == null) {
                    str3 = "null";
                }
                scope.b("ws_state", str3);
                String str4 = str2;
                scope.b("setup.account", str4 != null ? str4 : "null");
                scope.n("gated_ms", String.valueOf(j));
                scope.h(NG1.WARNING);
            }
        });
    }

    public static Map G(El2 el2) {
        return PW0.e(new Pair("error_class", el2.a), new Pair("error_message", el2.b), new Pair("handshake_status", el2.c), new Pair("lifetime_ms", el2.d), new Pair("after_self_close", Boolean.valueOf(el2.e)));
    }

    public static void H(@NotNull Z22 event) {
        NG1 ng1;
        Intrinsics.checkNotNullParameter(event, "event");
        if ((event instanceof W32) || (event instanceof X32)) {
            ng1 = NG1.ERROR;
        } else {
            ng1 = ((event instanceof C6931uB0) || (event instanceof Y32) || (event instanceof C3912g32) || (event instanceof C4332i32)) ? NG1.WARNING : NG1.INFO;
        }
        C5315mW0 builder = new C5315mW0();
        Intrinsics.checkNotNullParameter(builder, "builder");
        WF1.a("robot", "trading.event:" + C2017Sp1.a.b(event.getClass()).f(), ng1, builder.c());
        if (event instanceof X32) {
            Unit unit = Unit.a;
            return;
        }
        if (event instanceof W32) {
            Intrinsics.checkNotNullParameter("network", "reason");
            Intrinsics.checkNotNullExpressionValue(QF1.a(new RobotTelemetryException.WsTradingStopped("WS trading stopped: network", null), new C4564j(7)), "captureException(...)");
        } else if ((event instanceof C6931uB0) || (event instanceof Y32) || (event instanceof C3912g32) || (event instanceof C4332i32) || (event instanceof TX0) || (event instanceof NT0)) {
            Unit unit2 = Unit.a;
        } else {
            Unit unit3 = Unit.a;
        }
    }

    public static void T(@NotNull String url, @NotNull String errorClass) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(errorClass, "errorClass");
        WF1.a("ws", "ws.endpoint_failed", NG1.INFO, PW0.e(new Pair(ImagesContract.URL, url), new Pair("error_class", errorClass)));
    }

    public static void d(@NotNull C2099Tr error, @NotNull String requestId) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        boolean z = error instanceof C7141vB0;
        if (z) {
            str = "insufficient_funds";
        } else if (error instanceof C4918kd2) {
            str = "verification_required";
        } else if (error instanceof RP0) {
            str = "limit_open_trades";
        } else if (error instanceof SX0) {
            str = "max_demo_trades";
        } else if (error instanceof C1271Jb1) {
            str = "pair_unavailable";
        } else if (error instanceof C7993zF) {
            str = "cant_get_response";
        } else if (error instanceof C0868Dx0) {
            str = "incorrect_min_amount";
        } else {
            str = error instanceof C0790Cx0 ? "incorrect_max_amount" : "other";
        }
        Double d = null;
        if (z) {
            str2 = "server_response";
        } else {
            str2 = error instanceof C7993zF ? "client_timeout" : null;
        }
        if (error instanceof C0868Dx0) {
            d = ((C0868Dx0) error).c;
        } else if (error instanceof C0790Cx0) {
            d = ((C0790Cx0) error).c;
        }
        C5315mW0 builder = new C5315mW0();
        builder.put("request_id", requestId);
        builder.put("type", str);
        builder.put("status", error.b);
        if (str2 != null) {
            builder.put(Payload.SOURCE, str2);
        }
        if (d != null) {
            builder.put("attempted_amount", d);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        WF1.a("bet", "bet.failed", NG1.WARNING, builder.c());
    }

    public static void h(C6530sH1 c6530sH1, String str, String str2, Map map) {
        NG1 ng1 = NG1.INFO;
        c6530sH1.getClass();
        WF1.a(str, str2, ng1, map);
    }

    public static void i(@NotNull Throwable error, @NotNull final Map extra) {
        String string;
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(extra, "extra");
        String strF = C2017Sp1.a.b(error.getClass()).f();
        if (strF == null) {
            strF = "Throwable";
        }
        Object obj = extra.get("server_code");
        if (obj == null || (string = obj.toString()) == null) {
            Object obj2 = extra.get("fingerprint_hint");
            string = obj2 != null ? obj2.toString() : null;
        }
        Object obj3 = extra.get("phase");
        final String string2 = obj3 != null ? obj3.toString() : null;
        CQ0 cq0B = VE.b();
        cq0B.add(strF);
        if (string != null) {
            cq0B.add(string);
        }
        if (string2 != null) {
            cq0B.add(string2);
        }
        final CQ0 cq0A = VE.a(cq0B);
        String strConcat = "backend.exception:".concat(strF);
        final NG1 ng1 = NG1.ERROR;
        WF1.a("backend", strConcat, ng1, PW0.g(OW0.b(new Pair("error_class", strF)), extra));
        if (Intrinsics.a(extra.get("level"), "warning")) {
            ng1 = NG1.WARNING;
        }
        QF1.a(error, new MD1() { // from class: lH1
            @Override // defpackage.MD1
            public final void e(InterfaceC1015Fu0 scope) {
                String string3;
                Intrinsics.checkNotNullParameter(scope, "scope");
                scope.h(ng1);
                Map map = extra;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null || (string3 = value.toString()) == null) {
                        string3 = "null";
                    }
                    scope.n(str, string3);
                }
                String str2 = string2;
                if (str2 != null) {
                    scope.b("phase", str2);
                }
                Object obj4 = map.get("attempt");
                if (obj4 != null) {
                    scope.b("attempt", obj4.toString());
                }
                scope.m(cq0A);
            }
        });
    }

    public static void j(@NotNull Throwable throwable, @NotNull C4025gc1 ctx) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        String type = ctx.a;
        Intrinsics.checkNotNullParameter(type, "type");
        StringBuilder sb = new StringBuilder("Parse failed: ");
        sb.append(type);
        sb.append(" at ");
        C5896pG.b(sb, "?", " ", "?", " (");
        QF1.a(new RobotTelemetryException.JsonParseException(SK.b(sb, ctx.b, "b)"), throwable), new C6861tr1(ctx));
    }

    public static void l(@NotNull String title, @NotNull EnumC5633o10 severity) {
        NG1 ng1;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(severity, "severity");
        int iOrdinal = severity.ordinal();
        if (iOrdinal == 0) {
            ng1 = NG1.INFO;
        } else if (iOrdinal == 1) {
            ng1 = NG1.WARNING;
        } else {
            if (iOrdinal != 2) {
                throw new C6489s51();
            }
            ng1 = NG1.ERROR;
        }
        WF1.a("dialog", "dialog.shown", ng1, PW0.e(new Pair("title", title), new Pair("severity", severity.name())));
    }

    public static void o(@NotNull String trigger) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        WF1.a("service", "fgs.start_refused", NG1.WARNING, OW0.b(new Pair("trigger", trigger)));
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        QF1.a(new RobotTelemetryException.ForegroundServiceStartRefused("Foreground service start refused: ".concat(trigger), null), new C4242he0(trigger));
    }

    public static String p(String str) {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            objA = Uri.parse(str).getHost();
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        if (objA instanceof C1717Ot1.b) {
            objA = null;
        }
        String str2 = (String) objA;
        if (str2 == null || StringsKt.I(str2)) {
            return null;
        }
        return str2;
    }

    public static void q(int i, @NotNull String method, @NotNull String urlTemplate, long j, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(urlTemplate, "urlTemplate");
        WF1.a("http", "http.failure", (500 > i || i >= 600) ? NG1.WARNING : NG1.ERROR, PW0.e(new Pair("method", method), new Pair(ImagesContract.URL, urlTemplate), new Pair("status", Integer.valueOf(i)), new Pair("latency_ms", Long.valueOf(j)), new Pair("request_id", str2), new Pair("body", str)));
    }

    public static void r(@NotNull String method, @NotNull String urlTemplate, @NotNull Throwable throwable, long j, @Nullable String str) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(urlTemplate, "urlTemplate");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        NG1 ng1 = NG1.WARNING;
        Pair pair = new Pair("method", method);
        Pair pair2 = new Pair(ImagesContract.URL, urlTemplate);
        String strF = C2017Sp1.a.b(throwable.getClass()).f();
        if (strF == null) {
            strF = "Throwable";
        }
        WF1.a("http", "http.io_error", ng1, PW0.e(pair, pair2, new Pair("error", strF), new Pair("latency_ms", Long.valueOf(j)), new Pair("request_id", str)));
    }

    public static boolean s(String str, boolean z) {
        return z && Intrinsics.a(str, "demo");
    }

    public static void v(int i, @NotNull String classOfT, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(classOfT, "typeName");
        Intrinsics.checkNotNullParameter(cause, "cause");
        WF1.a("parse", "parse.swallowed", NG1.WARNING, PW0.e(new Pair("type", classOfT), new Pair("raw_size", Integer.valueOf(i))));
        Intrinsics.checkNotNullParameter(classOfT, "classOfT");
        QF1.a(new RobotTelemetryException.SilentJsonParseException("Silent fromJsonOrNull: " + classOfT + " at ? (" + i + "b)", cause), new C0753Cl(classOfT, 1));
    }

    public static void w(@NotNull String category, @NotNull String message, @NotNull EnumC0936Eu level, @NotNull Map data) {
        NG1 ng1;
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(data, "data");
        int iOrdinal = level.ordinal();
        if (iOrdinal == 0) {
            ng1 = NG1.INFO;
        } else if (iOrdinal == 1) {
            ng1 = NG1.WARNING;
        } else {
            if (iOrdinal != 2) {
                throw new C6489s51();
            }
            ng1 = NG1.ERROR;
        }
        WF1.a(category, message, ng1, data);
    }

    public final void A(@NotNull C4993kz1 ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.k = ctx.b;
        this.h = false;
        QF1.m("robot_session_id", ctx.a);
        QF1.m("robot_account_type", ctx.b);
        QF1.d(new C2779aj(ctx, 1));
        h(this, "robot", "robot.session_started", PW0.e(new Pair("session_id", ctx.a), new Pair("account_type", ctx.b)));
    }

    public final void B(@NotNull AbstractC5082lP1 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        String reason2 = reason.a;
        this.e.getClass();
        Intrinsics.checkNotNullParameter(reason2, "reasonId");
        EnumC1712Os enumC1712Os = C1790Ps.c.contains(reason2) ? EnumC1712Os.g : EnumC1712Os.i;
        C5315mW0 builder = new C5315mW0();
        builder.put("reason", reason2);
        if (reason instanceof AbstractC5082lP1.b) {
            builder.put("site", ((AbstractC5082lP1.b) reason).b);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        WF1.a("wizard", "robot.start_blocked", enumC1712Os.d, builder.c());
        if (enumC1712Os.e) {
            Intrinsics.checkNotNullParameter(reason2, "reason");
            QF1.a(new RobotTelemetryException.RobotStartFailed("Robot start failed: ".concat(reason2), null), new C7049ul(1, reason, enumC1712Os));
        }
    }

    public final void C(String str, EnumC4869kO1 enumC4869kO1, Map<String, ? extends Object> map) {
        InterfaceC4302hv0 interfaceC4302hv0 = this.j;
        if (interfaceC4302hv0 != null) {
            if (interfaceC4302hv0.e()) {
                interfaceC4302hv0 = null;
            }
            if (interfaceC4302hv0 != null) {
                InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC4302hv0.y("ws.event", str);
                String str2 = this.k;
                if (str2 != null) {
                    interfaceC2347Wu0Y.m(str2, "account_type");
                }
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        interfaceC2347Wu0Y.m(value, key);
                    }
                }
                interfaceC2347Wu0Y.A(enumC4869kO1);
            }
        }
    }

    public final void E(@NotNull final LJ1 action, @NotNull final String reason, @NotNull final Map<String, ? extends Object> extra) {
        final EnumC1712Os enumC1712Os;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(extra, "extra");
        C1790Ps c1790Ps = this.e;
        c1790Ps.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (C1790Ps.b.contains(new Pair(action, reason))) {
            enumC1712Os = EnumC1712Os.g;
        } else if (action == LJ1.Start && reason.equals("ws_unavailable")) {
            enumC1712Os = c1790Ps.a.a("ws_unavailable") ? EnumC1712Os.h : EnumC1712Os.g;
        } else {
            enumC1712Os = EnumC1712Os.i;
        }
        NG1 ng1 = enumC1712Os.d;
        String str = action.d;
        WF1.a("setup", "setup.action_blocked", ng1, PW0.g(PW0.e(new Pair("action", str), new Pair("reason", reason)), extra));
        if (enumC1712Os.e) {
            QF1.a(new RobotTelemetryException.SetupActionBlocked(C2629a1.b(str, ":", reason)), new MD1() { // from class: mH1
                @Override // defpackage.MD1
                public final void e(InterfaceC1015Fu0 scope) {
                    String string;
                    Intrinsics.checkNotNullParameter(scope, "scope");
                    LJ1 lj1 = action;
                    scope.m(WE.f("setup-action-blocked", lj1.d, reason));
                    scope.b("setup.action", lj1.d);
                    scope.h(enumC1712Os.d);
                    for (Map.Entry entry : extra.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value == null || (string = value.toString()) == null) {
                            string = "null";
                        }
                        scope.n(str2, string);
                    }
                }
            });
        }
    }

    public final void I(@NotNull String errorClass, int i, boolean z) {
        Intrinsics.checkNotNullParameter(errorClass, "errorClass");
        WF1.a("ws", "ws.auth_error", NG1.WARNING, PW0.e(new Pair("error_class", errorClass), new Pair("code", Integer.valueOf(i)), new Pair("is_real", Boolean.valueOf(z)), new Pair("selected_account", C6772tS0.a(this.c))));
    }

    public final void J(@NotNull Dl2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        boolean z = info.d;
        Integer num = info.a;
        boolean z2 = info.e;
        Long l = info.c;
        int i = info.g;
        if (!z && i < 3) {
            C("closed", EnumC4869kO1.UNAVAILABLE, PW0.e(new Pair("code", num), new Pair("lifetime_ms", l), new Pair("is_real", Boolean.valueOf(z2))));
        }
        WF1.a("ws", "ws.closed", NG1.WARNING, PW0.e(new Pair("code", num), new Pair("reason", info.b), new Pair("lifetime_ms", l), new Pair("self_initiated", Boolean.valueOf(info.d)), new Pair("is_real", Boolean.valueOf(z2)), new Pair("remote_closes_since_report", Integer.valueOf(info.f)), new Pair("loop_streak", Integer.valueOf(i))));
    }

    public final void K(boolean z, @NotNull Bl2 summary) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        QF1.a(new RobotTelemetryException.WsClosedByOther("WS closed by remote: is_real=" + z, null), new C1670Oe(z, summary, C6772tS0.a(this.c), this));
    }

    public final void L(@NotNull String url, @Nullable Long l, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strP = p(url);
        if (strP != null) {
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                QF1.m("ws.host", strP);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                C1795Pt1.a(th);
            }
        }
        C("connected", EnumC4869kO1.OK, PW0.e(new Pair("rtt_ms", l), new Pair("is_real", Boolean.valueOf(z))));
        h(this, "ws", "ws.connected", PW0.e(new Pair(ImagesContract.URL, url), new Pair("host", strP), new Pair("rtt_ms", l), new Pair("is_real", Boolean.valueOf(z))));
    }

    public final void M(int i, boolean z, @NotNull El2 failure) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (!s(C6772tS0.a(this.c), z)) {
            y("connection_failed");
        }
        C("connection_failed", EnumC4869kO1.UNAVAILABLE, PW0.e(new Pair("fail_count", Integer.valueOf(i)), new Pair("is_real", Boolean.valueOf(z)), new Pair("error_class", failure.a)));
        WF1.a("ws", "ws.connection_failed", NG1.WARNING, PW0.g(PW0.e(new Pair("fail_count", Integer.valueOf(i)), new Pair("is_real", Boolean.valueOf(z))), G(failure)));
    }

    public final void N(@NotNull final String reason, final int i, final boolean z, @Nullable final El2 el2) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        C("disconnected", EnumC4869kO1.INTERNAL_ERROR, PW0.e(new Pair("reason", reason), new Pair("fail_count", Integer.valueOf(i)), new Pair("is_real", Boolean.valueOf(z))));
        NG1 ng1 = NG1.WARNING;
        Map mapE = PW0.e(new Pair("reason", reason), new Pair("fail_count", Integer.valueOf(i)), new Pair("is_real", Boolean.valueOf(z)));
        Map mapG = el2 != null ? G(el2) : null;
        if (mapG == null) {
            mapG = PW0.c();
        }
        WF1.a("ws", "ws.disconnected", ng1, PW0.g(mapE, mapG));
        final String strA = C6772tS0.a(this.c);
        if (s(strA, z)) {
            return;
        }
        y(reason);
        Intrinsics.checkNotNullParameter(reason, "reason");
        QF1.a(new RobotTelemetryException.WsRepeatedDisconnects(C5491nL.c("WS repeated disconnects: ", reason), null), new MD1() { // from class: jH1
            @Override // defpackage.MD1
            public final void e(InterfaceC1015Fu0 scope) {
                Intrinsics.checkNotNullParameter(scope, "scope");
                String str = reason;
                scope.m(WE.f("ws-disconnected", str));
                scope.b("ws.reason", str);
                scope.b("ws.is_real", String.valueOf(z));
                scope.b("ws.fail_count", String.valueOf(i));
                El2 el3 = el2;
                if (el3 != null) {
                    scope.b("ws.last_error_class", el3.a);
                    Integer num = el3.c;
                    if (num != null) {
                        scope.b("ws.handshake_status", String.valueOf(num.intValue()));
                    }
                    String str2 = el3.b;
                    if (str2 == null) {
                        str2 = "null";
                    }
                    scope.n("ws.last_error_message", str2);
                }
                C6772tS0.f(scope, strA);
                scope.b("network_available", this.t());
                scope.h(NG1.WARNING);
            }
        });
    }

    public final void O(@NotNull String url, long j) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strP = p(url);
        if (strP == null) {
            strP = url;
        }
        QF1.m("ws.endpoint", strP);
        h(this, "ws", "ws.endpoint_selected", PW0.e(new Pair(ImagesContract.URL, url), new Pair("rtt_ms", Long.valueOf(j))));
    }

    public final void P(final int i, final int i2, final int i3, @Nullable final Boolean bool) {
        final String strA = C6772tS0.a(this.c);
        boolean z = bool != null && s(strA, bool.booleanValue());
        if (!z) {
            y("all_endpoints_failed");
        }
        final String strT = t();
        final NG1 ng1 = (strA.equals("demo") || Intrinsics.a(strT, "true")) ? NG1.WARNING : NG1.ERROR;
        WF1.a("ws", "ws.endpoint_selection_failed", ng1, PW0.e(new Pair("tried_count", Integer.valueOf(i)), new Pair("failed_count", Integer.valueOf(i2)), new Pair("attempts", Integer.valueOf(i3)), new Pair("is_real", bool)));
        if (z) {
            return;
        }
        QF1.a(new RobotTelemetryException.WsAllEndpointsFailed(i2 + "/" + i + " WS endpoints failed", null), new MD1() { // from class: rH1
            @Override // defpackage.MD1
            public final void e(InterfaceC1015Fu0 scope) {
                String string;
                Intrinsics.checkNotNullParameter(scope, "scope");
                String str = strA;
                scope.m(WE.f("ws-all-endpoints-failed", str));
                C6772tS0.f(scope, str);
                scope.b("network_available", strT);
                scope.b("ws.tried_count", String.valueOf(i));
                scope.b("ws.failed_count", String.valueOf(i2));
                scope.b("ws.attempts", String.valueOf(i3));
                Boolean bool2 = bool;
                if (bool2 == null || (string = bool2.toString()) == null) {
                    string = "unknown";
                }
                scope.b("ws.is_real", string);
                scope.h(ng1);
            }
        });
    }

    public final void Q(final long j, final boolean z, final long j2, @NotNull final String idleKind) {
        Intrinsics.checkNotNullParameter(idleKind, "idleKind");
        C("message_timeout", EnumC4869kO1.DEADLINE_EXCEEDED, PW0.e(new Pair("idle_ms", Long.valueOf(j)), new Pair("is_real", Boolean.valueOf(z)), new Pair("idle_kind", idleKind)));
        WF1.a("ws", "ws.message_timeout", NG1.WARNING, PW0.e(new Pair("idle_ms", Long.valueOf(j)), new Pair("raw_idle_ms", Long.valueOf(j2)), new Pair("idle_kind", idleKind), new Pair("is_real", Boolean.valueOf(z))));
        if (Intrinsics.a(idleKind, "stalled")) {
            return;
        }
        final String strA = C6772tS0.a(this.c);
        if (s(strA, z)) {
            return;
        }
        y("message_timeout");
        QF1.a(new RobotTelemetryException.WsMessageTimeout("WS idle: " + j + "ms", null), new MD1() { // from class: fH1
            @Override // defpackage.MD1
            public final void e(InterfaceC1015Fu0 scope) {
                Intrinsics.checkNotNullParameter(scope, "scope");
                scope.m(VE.c("ws-message-timeout"));
                scope.b("ws.is_real", String.valueOf(z));
                scope.b("ws.idle_kind", idleKind);
                long j3 = j2;
                scope.b("ws.idle_capped", String.valueOf(j3 > j));
                scope.n("ws.raw_idle_ms", String.valueOf(j3));
                C6772tS0.f(scope, strA);
                scope.b("network_available", this.t());
                scope.h(NG1.WARNING);
            }
        });
    }

    public final void R(@NotNull String trigger, int i, boolean z) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        C("reconnect_started", EnumC4869kO1.OK, PW0.e(new Pair("trigger", trigger), new Pair("attempt", Integer.valueOf(i)), new Pair("is_real", Boolean.valueOf(z))));
        h(this, "ws", "ws.reconnect_started", PW0.e(new Pair("trigger", trigger), new Pair("attempt", Integer.valueOf(i)), new Pair("is_real", Boolean.valueOf(z))));
    }

    public final void S(long j, int i, boolean z) {
        C("reconnect_succeeded", EnumC4869kO1.OK, PW0.e(new Pair("downtime_ms", Long.valueOf(j)), new Pair("attempt", Integer.valueOf(i)), new Pair("is_real", Boolean.valueOf(z))));
        h(this, "ws", "ws.reconnect_succeeded", PW0.e(new Pair("downtime_ms", Long.valueOf(j)), new Pair("attempt", Integer.valueOf(i)), new Pair("is_real", Boolean.valueOf(z))));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    public final void a(@Nullable InterfaceC2441Xr interfaceC2441Xr, @NotNull String requestId) {
        EnumC4869kO1 enumC4869kO1;
        String strF;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        InterfaceC2347Wu0 interfaceC2347Wu0Remove = this.i.remove(requestId);
        if ((interfaceC2441Xr instanceof InterfaceC2441Xr.e) || (interfaceC2441Xr instanceof InterfaceC2441Xr.b) || Intrinsics.a(interfaceC2441Xr, InterfaceC2441Xr.a.a) || Intrinsics.a(interfaceC2441Xr, InterfaceC2441Xr.d.a)) {
            enumC4869kO1 = EnumC4869kO1.OK;
        } else if (Intrinsics.a(interfaceC2441Xr, InterfaceC2441Xr.c.a)) {
            enumC4869kO1 = EnumC4869kO1.ABORTED;
        } else {
            if (interfaceC2441Xr != null) {
                throw new C6489s51();
            }
            enumC4869kO1 = EnumC4869kO1.CANCELLED;
        }
        if (interfaceC2347Wu0Remove != null) {
            interfaceC2347Wu0Remove.A(enumC4869kO1);
        }
        Pair pair = new Pair("request_id", requestId);
        if (interfaceC2441Xr != null) {
            strF = C2017Sp1.a.b(interfaceC2441Xr.getClass()).f();
            if (strF == null) {
                strF = "null";
            }
        } else {
            strF = "null";
        }
        h(this, "bet", "bet.cycle_finished", PW0.e(pair, new Pair("result", strF)));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    public final void b(@NotNull String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        InterfaceC2347Wu0 interfaceC2347Wu0F = this.j;
        if (interfaceC2347Wu0F == null) {
            interfaceC2347Wu0F = QF1.f();
        } else {
            if (interfaceC2347Wu0F.e()) {
                interfaceC2347Wu0F = null;
            }
            if (interfaceC2347Wu0F == null) {
                interfaceC2347Wu0F = QF1.f();
            }
        }
        if (interfaceC2347Wu0F != null) {
            InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F.y("bet.cycle", "requestId=" + requestId);
            Intrinsics.checkNotNullExpressionValue(interfaceC2347Wu0Y, "startChild(...)");
            interfaceC2347Wu0Y.m(requestId, "request_id");
            this.i.put(requestId, interfaceC2347Wu0Y);
        }
        h(this, "bet", "bet.cycle_started", OW0.b(new Pair("request_id", requestId)));
    }

    public final void c(@NotNull String requestId, final int i, final long j, @NotNull final String kind, @Nullable final String str, @Nullable final String str2, @Nullable final String str3) {
        String str4;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        long j2 = ((long) (i + 20)) * 1000;
        if (j < 0) {
            str4 = "unknown";
        } else if (j < j2 / ((long) 2)) {
            str4 = "early";
        } else {
            str4 = j < (j2 * ((long) 9)) / ((long) 10) ? "mid" : "full";
        }
        WF1.a("bet", "bet.end_timeout", NG1.WARNING, PW0.e(new Pair("request_id", requestId), new Pair("bet_duration_s", Integer.valueOf(i)), new Pair("wait_elapsed_ms", Long.valueOf(j)), new Pair("wait_bucket", str4), new Pair("kind", kind), new Pair("last_error", str), new Pair("ws_state_at_start", str2), new Pair("ws_state", str3)));
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        final String str5 = str4;
        QF1.a(new RobotTelemetryException.BetEndTimeoutException("Bet end timeout: req=" + requestId + ", duration=" + i + "s", null), new MD1() { // from class: pH1
            @Override // defpackage.MD1
            public final void e(InterfaceC1015Fu0 scope) {
                Intrinsics.checkNotNullParameter(scope, "scope");
                scope.b("bet.duration_s", String.valueOf(i));
                scope.b("bet.wait_bucket", str5);
                scope.b("bet.end_kind", kind);
                this.getClass();
                C6530sH1.D(scope, j, str, str2, str3);
                scope.m(VE.c("bet-end-timeout"));
                scope.h(NG1.WARNING);
            }
        });
    }

    public final void e(@NotNull String requestId, @NotNull String asset, double d, @NotNull String currency, @NotNull String direction, @NotNull String accountType) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        h(this, "bet", "bet.placed", PW0.e(new Pair("request_id", requestId), new Pair("asset", asset), new Pair("amount", Double.valueOf(d)), new Pair("currency", currency), new Pair("direction", direction), new Pair("account_type", accountType)));
    }

    public final void f(@NotNull InterfaceC2441Xr result, @NotNull String requestId, long j) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        h(this, "bet", C5491nL.c("bet.result:", C2017Sp1.a.b(result.getClass()).f()), PW0.e(new Pair("request_id", requestId), new Pair("latency_ms", Long.valueOf(j))));
    }

    public final void g(@NotNull String requestId, @NotNull final String name, @NotNull final String kind, final long j, @Nullable final String str, @Nullable final String str2, @Nullable final String str3) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        WF1.a("bet", "bet.start_timeout", NG1.WARNING, PW0.e(new Pair("request_id", requestId), new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, name), new Pair("kind", kind), new Pair("elapsed_ms", Long.valueOf(j)), new Pair("last_error", str), new Pair("ws_state_at_start", str2), new Pair("ws_state", str3)));
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(name, "name");
        QF1.a(new RobotTelemetryException.BetStartTimeoutException(BX.c("Bet start timeout: ", name, ", req=", requestId), null), new MD1() { // from class: qH1
            @Override // defpackage.MD1
            public final void e(InterfaceC1015Fu0 scope) {
                Intrinsics.checkNotNullParameter(scope, "scope");
                scope.b("bet.start_kind", kind);
                this.getClass();
                C6530sH1.D(scope, j, str, str2, str3);
                scope.m(WE.f("bet-start-timeout", name));
                scope.h(NG1.WARNING);
            }
        });
    }

    public final void k(@NotNull String name, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        WF1.a("data", "data.updater_target_missing", NG1.WARNING, PW0.e(new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, name), new Pair("since_ms", Long.valueOf(j))));
        if (this.f.a(name)) {
            Intrinsics.checkNotNullParameter(name, "name");
            QF1.a(new RobotTelemetryException.DataUpdaterTargetMissing("AppData updater target missing: " + name + " after " + j + "ms", null), new BA0(name));
        }
    }

    public final void m(@NotNull final String reason, @NotNull final Map<String, ? extends Object> data) {
        String errorKind;
        Object c3849fl;
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj = data.get("error_kind");
        if (obj == null || (errorKind = obj.toString()) == null) {
            errorKind = "unknown";
        }
        C4059gl c4059gl = this.g;
        c4059gl.getClass();
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(errorKind, "errorKind");
        List listF = WE.f("forced-logout", reason, errorKind);
        if (c4059gl.d.a(CollectionsKt.J(listF, "|", null, null, null, 62))) {
            c3849fl = new C3849fl(Intrinsics.a(reason, "ws_auth_revoked") ? NG1.WARNING : NG1.INFO, listF);
        } else {
            c3849fl = C3639el.a;
        }
        if (c3849fl instanceof C3849fl) {
            final String strA = C6772tS0.a(this.c);
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(errorKind, "errorKind");
            final C3849fl c3849fl2 = (C3849fl) c3849fl;
            QF1.a(new RobotTelemetryException.ForcedLogout(C4694ja0.a("Forced logout: ", reason, " (", errorKind, ")"), null), new MD1() { // from class: gH1
                @Override // defpackage.MD1
                public final void e(InterfaceC1015Fu0 scope) {
                    Intrinsics.checkNotNullParameter(scope, "scope");
                    C3849fl c3849fl3 = c3849fl2;
                    scope.m(c3849fl3.b);
                    scope.b("logout.reason", reason);
                    for (Map.Entry entry : data.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            scope.b(C5491nL.c("logout.", str), value.toString());
                        }
                    }
                    C6772tS0.f(scope, strA);
                    scope.b("network_available", this.t());
                    scope.h(c3849fl3.a);
                }
            });
        }
    }

    public final void n(@NotNull String trigger, int i, long j) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Map mapE = PW0.e(new Pair("trigger", trigger), new Pair("refused_attempts", Integer.valueOf(i)), new Pair("elapsed_ms", Long.valueOf(j)));
        h(this, "service", "fgs.start_recovered", mapE);
        QF1.b("Foreground service start recovered", NG1.INFO, new ZW(trigger, this, j, mapE));
    }

    public final String t() {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            objA = String.valueOf(this.b.a());
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        if (objA instanceof C1717Ot1.b) {
            objA = "unknown";
        }
        return (String) objA;
    }

    public final void u(@NotNull CommonError error, @Nullable String str) {
        Intrinsics.checkNotNullParameter(error, "error");
        String strF = C2017Sp1.a.b(error.getClass()).f();
        if (strF == null) {
            strF = "Other";
        }
        String strB = C2629a1.b(str, "|", strF);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2590Zo1 c2590Zo1 = new C2590Zo1();
        c2590Zo1.d = -1;
        ConcurrentHashMap<String, a> concurrentHashMap = this.d;
        final C4170hH1 c4170hH1 = new C4170hH1(jElapsedRealtime, c2590Zo1);
        concurrentHashMap.compute(strB, new BiFunction() { // from class: iH1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (C6530sH1.a) c4170hH1.invoke(obj, obj2);
            }
        });
        if (c2590Zo1.d < 0) {
            return;
        }
        NG1 ng1 = NG1.WARNING;
        Pair pair = new Pair("label", str);
        Pair pair2 = new Pair("kind", strF);
        Pair pair3 = new Pair("code", Integer.valueOf(error.getCode()));
        int i = c2590Zo1.d;
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 0) {
            numValueOf = null;
        }
        WF1.a("loading", "ok_filter.dropped", ng1, PW0.e(pair, pair2, pair3, new Pair("suppressed_before", numValueOf)));
    }

    public final void x(@NotNull final C7233ve1 report) {
        Intrinsics.checkNotNullParameter(report, "report");
        String str = report.a;
        if (str == null) {
            str = DevicePublicKeyStringDef.NONE;
        }
        QF1.m("platform.host", str);
        String str2 = report.b.d;
        QF1.m("platform.host_source", str2);
        final String probeHost = report.c;
        String strP = p(probeHost);
        if (strP != null) {
            probeHost = strP;
        }
        final String failure = report.f;
        WF1.a("platform", "platform.host_resolved", failure == null ? NG1.INFO : NG1.WARNING, PW0.e(new Pair("host", report.a), new Pair(Payload.SOURCE, str2), new Pair("probe_host", probeHost), new Pair("probe_final_host", report.e), new Pair("failure", failure), new Pair("http_status", report.g), new Pair("latency_ms", Long.valueOf(report.i))));
        if (failure == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(failure, "failure");
        Intrinsics.checkNotNullParameter(probeHost, "probeHost");
        QF1.a(new RobotTelemetryException.PlatformHostProbeFailed(BX.c("Short link ", probeHost, " failed: ", failure), report.h), new MD1() { // from class: eH1
            @Override // defpackage.MD1
            public final void e(InterfaceC1015Fu0 scope) {
                Intrinsics.checkNotNullParameter(scope, "scope");
                String str3 = failure;
                scope.m(WE.f("platform-host-probe-failed", str3));
                scope.b("platform.probe_host", probeHost);
                C7233ve1 c7233ve1 = report;
                scope.b("platform.probe_url_source", c7233ve1.d ? "config" : "default");
                scope.b("platform.probe_failure", str3);
                String str4 = c7233ve1.e;
                if (str4 != null) {
                    scope.b("platform.probe_final_host", str4);
                }
                Integer num = c7233ve1.g;
                if (num != null) {
                    scope.b("platform.probe_http_status", String.valueOf(num.intValue()));
                }
                scope.b("network_available", this.t());
                scope.n("latency_ms", String.valueOf(c7233ve1.i));
            }
        });
    }

    public final void y(String str) {
        if (this.h) {
            return;
        }
        this.h = true;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            QF1.m("ws.first_failure_reason", str);
            Unit unit = Unit.a;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            C1795Pt1.a(th);
        }
    }

    public final void z(@NotNull FI1 reason) {
        EnumC4869kO1 enumC4869kO1;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (!this.i.isEmpty()) {
            Iterator<Map.Entry<String, InterfaceC2347Wu0>> it = this.i.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().A(EnumC4869kO1.CANCELLED);
            }
            this.i.clear();
        }
        boolean z = reason instanceof FI1.i;
        WF1.a("robot", "robot.session_ended", (z || (reason instanceof FI1.f)) ? NG1.INFO : NG1.WARNING, OW0.b(new Pair("reason", reason.a)));
        Intrinsics.checkNotNullParameter(reason, "<this>");
        boolean z2 = reason instanceof FI1.h;
        FI1.h hVar = z2 ? (FI1.h) reason : null;
        if (hVar == null || hVar.c) {
            hVar = null;
        }
        if (hVar != null) {
            String reason2 = hVar.a;
            Throwable th = hVar.b;
            Intrinsics.checkNotNullParameter(reason2, "reason");
            QF1.a(new RobotTelemetryException.RobotStoppedUnexpectedly("Robot stopped: ".concat(reason2), th), new C5481nH1(hVar, this));
        }
        if (z || (reason instanceof FI1.f) || (reason instanceof FI1.d) || (reason instanceof FI1.a) || (reason instanceof FI1.b) || (reason instanceof FI1.e) || (reason instanceof FI1.j)) {
            enumC4869kO1 = EnumC4869kO1.OK;
        } else if (reason instanceof FI1.g) {
            enumC4869kO1 = EnumC4869kO1.ABORTED;
        } else if (reason instanceof FI1.c) {
            enumC4869kO1 = EnumC4869kO1.CANCELLED;
        } else {
            if (!z2) {
                throw new C6489s51();
            }
            enumC4869kO1 = EnumC4869kO1.INTERNAL_ERROR;
        }
        InterfaceC4302hv0 interfaceC4302hv0 = this.j;
        if (interfaceC4302hv0 != null) {
            if (interfaceC4302hv0.e()) {
                interfaceC4302hv0 = null;
            }
            if (interfaceC4302hv0 != null) {
                interfaceC4302hv0.A(enumC4869kO1);
            }
        }
        this.j = null;
        this.k = null;
        QF1.l("robot_account_type");
        QF1.l("robot_session_id");
        QF1.d(new D8(4));
    }
}

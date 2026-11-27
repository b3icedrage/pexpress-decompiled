package defpackage;

import com.api.feature.telemetry.exceptions.RobotTelemetryException;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0831Dl {

    @NotNull
    public static final Set<String> e;

    @NotNull
    public final C4059gl a = new C4059gl();
    public final ConcurrentHashMap.KeySetView<a, Boolean> b = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap.KeySetView<a, Boolean> c = ConcurrentHashMap.newKeySet();

    @NotNull
    public final KW1 d = XO0.b(new C6210ql(0));

    /* JADX INFO: renamed from: Dl$a */
    public final class a implements InterfaceC3220cl {

        @NotNull
        public final String a;

        @NotNull
        public final String b;

        @NotNull
        public final AtomicBoolean c;

        @NotNull
        public final InterfaceC4302hv0 d;
        public boolean e;

        @NotNull
        public final LinkedHashMap f;

        @Nullable
        public InterfaceC2347Wu0 g;

        @Nullable
        public ScheduledFuture<?> h;

        @NotNull
        public final ConcurrentHashMap<String, String> i;
        public final /* synthetic */ C0831Dl j;

        public a(@NotNull C0831Dl c0831Dl, @NotNull String flow, Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(flow, "flow");
            Intrinsics.checkNotNullParameter(data, "data");
            this.j = c0831Dl;
            this.a = flow;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.b = string;
            this.c = new AtomicBoolean(false);
            String strC = Intrinsics.a(flow, "launch") ? "launch.session" : C5491nL.c("auth.", flow);
            C5437n42 c5437n42 = new C5437n42();
            Set<String> set = C0831Dl.e;
            c0831Dl.getClass();
            C2512Yo1 c2512Yo1 = new C2512Yo1();
            QF1.d(new C6629sl(c2512Yo1));
            c5437n42.b = !c2512Yo1.d ? LD1.ON : LD1.OFF;
            c5437n42.h = 300000L;
            c5437n42.i = new C7680xl(this);
            Unit unit = Unit.a;
            InterfaceC4302hv0 interfaceC4302hv0O = QF1.e().o(strC, "auth", c5437n42);
            Intrinsics.checkNotNullExpressionValue(interfaceC4302hv0O, "startTransaction(...)");
            this.d = interfaceC4302hv0O;
            this.f = new LinkedHashMap();
            this.i = new ConcurrentHashMap<>();
            c0831Dl.b.add(this);
            interfaceC4302hv0O.b("auth.flow", flow);
            interfaceC4302hv0O.b("auth.attempt_id", string);
            for (Map.Entry<String, ? extends Object> entry : data.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    b(key, value.toString());
                }
            }
            QF1.d(new C7890yl(this));
            WF1.a("auth", "auth.attempt_started", NG1.INFO, PW0.h(PW0.h(data, new Pair("flow", this.a)), new Pair("attempt_id", this.b)));
        }

        public final void a(final String outcome) {
            Object c3849fl;
            C4059gl c4059gl = this.j.a;
            c4059gl.getClass();
            String flow = this.a;
            Intrinsics.checkNotNullParameter(flow, "flow");
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            if (Intrinsics.a(outcome, "ok") || Intrinsics.a(outcome, "timeout")) {
                c3849fl = C3639el.a;
            } else {
                List listF = WE.f("auth-ws-auth-failed", flow, outcome);
                c3849fl = !c4059gl.a(3, listF) ? C3639el.a : new C3849fl(NG1.WARNING, listF);
            }
            if (c3849fl instanceof C3849fl) {
                Intrinsics.checkNotNullParameter(flow, "flow");
                Intrinsics.checkNotNullParameter(outcome, "outcome");
                final C3849fl c3849fl2 = (C3849fl) c3849fl;
                QF1.a(new RobotTelemetryException.AuthWsAuthFailed(BX.c("Socket auth after ", flow, " failed: ", outcome), null), new MD1() { // from class: Al
                    @Override // defpackage.MD1
                    public final void e(InterfaceC1015Fu0 scope) {
                        Intrinsics.checkNotNullParameter(scope, "scope");
                        C0831Dl.a aVar = this.d;
                        scope.B(aVar.d);
                        C3849fl c3849fl3 = c3849fl2;
                        scope.h(c3849fl3.a);
                        scope.b("ws_auth.outcome", outcome);
                        scope.b("auth.attempt_id", aVar.b);
                        scope.m(c3849fl3.b);
                    }
                });
            }
        }

        @Override // defpackage.InterfaceC3220cl
        public final void b(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.i.put(key, value);
            this.d.b(key, value);
        }

        @Override // defpackage.InterfaceC3220cl
        public final void c(@NotNull EnumC4737jl outcome, @Nullable String str, @Nullable final JX1 failure) {
            EnumC4869kO1 enumC4869kO1;
            Object c3849fl;
            NG1 ng1;
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            boolean z = false;
            if (this.c.compareAndSet(false, true)) {
                InterfaceC4302hv0 interfaceC4302hv0 = this.d;
                String strName = outcome.name();
                Locale locale = Locale.ROOT;
                String lowerCase = strName.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                interfaceC4302hv0.b("auth.result", lowerCase);
                if (str != null) {
                    this.d.b("auth.failed_step", str);
                }
                if (failure != null) {
                    this.d.b("auth.error_code", String.valueOf(failure.a));
                    this.d.b("auth.error_kind", failure.c);
                    this.d.b("auth.error_class", failure.b);
                    this.d.m(failure.d, "error_text");
                    this.d.m(failure.e, "platform_code");
                }
                EnumC4737jl enumC4737jl = EnumC4737jl.e;
                if (outcome == enumC4737jl) {
                    C4059gl c4059gl = this.j.a;
                    c4059gl.getClass();
                    String flow = this.a;
                    Intrinsics.checkNotNullParameter(flow, "flow");
                    boolean zA = Intrinsics.a(flow, "launch");
                    final String step = DevicePublicKeyStringDef.NONE;
                    if (zA || failure == null) {
                        c3849fl = C3639el.a;
                    } else {
                        List listF = WE.f("auth-flow-failed", flow, str == null ? DevicePublicKeyStringDef.NONE : str, failure.c);
                        if (!C4059gl.e.contains(Integer.valueOf(failure.a)) || c4059gl.a(1, listF)) {
                            Intrinsics.checkNotNullParameter(failure, "failure");
                            if (C4059gl.f.contains(Integer.valueOf(failure.a))) {
                                ng1 = NG1.INFO;
                            } else {
                                Intrinsics.checkNotNullParameter(failure, "failure");
                                ng1 = (C4059gl.g.contains(Integer.valueOf(failure.a)) || (failure.f instanceof IOException)) ? NG1.WARNING : NG1.ERROR;
                            }
                            c3849fl = new C3849fl(ng1, listF);
                        } else {
                            c3849fl = C3639el.a;
                        }
                    }
                    if ((c3849fl instanceof C3849fl) && failure != null) {
                        if (str != null) {
                            step = str;
                        }
                        Intrinsics.checkNotNullParameter(flow, "flow");
                        Intrinsics.checkNotNullParameter(step, "step");
                        String kind = failure.c;
                        Intrinsics.checkNotNullParameter(kind, "kind");
                        String errorText = failure.d;
                        Intrinsics.checkNotNullParameter(errorText, "errorText");
                        StringBuilder sb = new StringBuilder("Auth ");
                        sb.append(flow);
                        sb.append(" failed at ");
                        C5896pG.b(sb, step, ": ", kind, " (");
                        final C3849fl c3849fl2 = (C3849fl) c3849fl;
                        QF1.a(new RobotTelemetryException.AuthFlowFailed(C5807oq.b(sb, errorText, ")"), failure.f), new MD1() { // from class: wl
                            @Override // defpackage.MD1
                            public final void e(InterfaceC1015Fu0 scope) {
                                Intrinsics.checkNotNullParameter(scope, "scope");
                                C0831Dl.a aVar = this.d;
                                scope.B(aVar.d);
                                C3849fl c3849fl3 = c3849fl2;
                                scope.h(c3849fl3.a);
                                for (Map.Entry<String, String> entry : aVar.i.entrySet()) {
                                    scope.b(entry.getKey(), entry.getValue());
                                }
                                scope.b("auth.failed_step", step);
                                JX1 jx1 = failure;
                                scope.b("auth.error_code", String.valueOf(jx1.a));
                                scope.b("auth.error_kind", jx1.c);
                                scope.b("auth.error_class", jx1.b);
                                scope.n("error_text", jx1.d);
                                scope.n("platform_code", jx1.e);
                                Map<String, Object> map = jx1.g;
                                if (!map.isEmpty()) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                                        if (entry2.getValue() != null) {
                                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                                        }
                                    }
                                    scope.E(linkedHashMap, "http_exchange");
                                }
                                scope.m(c3849fl3.b);
                            }
                        });
                    }
                }
                C0831Dl c0831Dl = this.j;
                synchronized (this) {
                    try {
                        this.e = outcome == EnumC4737jl.d;
                        String strA = this.d.a();
                        if (strA != null && this.e) {
                            a(strA);
                        }
                        if (this.e && c0831Dl.c.contains(this)) {
                            this.g = this.d.y("auth.step", "ws_auth.confirm");
                            Object value = c0831Dl.d.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            this.h = ((ScheduledExecutorService) value).schedule(new RunnableC0675Bl(this, 0), 15000L, TimeUnit.MILLISECONDS);
                            QF1.d(new C0753Cl(this, 0));
                            z = true;
                        } else {
                            c0831Dl.c.remove(this);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z) {
                    InterfaceC4302hv0 interfaceC4302hv1 = this.d;
                    int iOrdinal = outcome.ordinal();
                    if (iOrdinal == 0) {
                        enumC4869kO1 = EnumC4869kO1.OK;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new C6489s51();
                        }
                        enumC4869kO1 = EnumC4869kO1.CANCELLED;
                    } else if (failure == null) {
                        enumC4869kO1 = EnumC4869kO1.UNKNOWN_ERROR;
                    } else {
                        C0831Dl c0831Dl2 = this.j;
                        c0831Dl2.a.getClass();
                        Intrinsics.checkNotNullParameter(failure, "failure");
                        if (C4059gl.f.contains(Integer.valueOf(failure.a))) {
                            enumC4869kO1 = EnumC4869kO1.INVALID_ARGUMENT;
                        } else {
                            c0831Dl2.a.getClass();
                            Intrinsics.checkNotNullParameter(failure, "failure");
                            enumC4869kO1 = (C4059gl.g.contains(Integer.valueOf(failure.a)) || (failure.f instanceof IOException)) ? EnumC4869kO1.UNAVAILABLE : EnumC4869kO1.INTERNAL_ERROR;
                        }
                    }
                    interfaceC4302hv1.A(enumC4869kO1);
                }
                this.j.b.remove(this);
                QF1.d(new C8100zl(this, 0));
                NG1 ng2 = outcome == enumC4737jl ? NG1.WARNING : NG1.INFO;
                Pair pair = new Pair("flow", this.a);
                Pair pair2 = new Pair("attempt_id", this.b);
                String lowerCase2 = outcome.name().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                Map mapE = PW0.e(pair, pair2, new Pair("result", lowerCase2), new Pair("failed_step", str));
                this.j.getClass();
                WF1.a("auth", "auth.attempt_finished", ng2, PW0.g(mapE, failure == null ? PW0.c() : PW0.e(new Pair("code", Integer.valueOf(failure.a)), new Pair("error_class", failure.b), new Pair("text", failure.d), new Pair("platform_code", failure.e))));
            }
        }

        @Override // defpackage.InterfaceC3220cl
        @NotNull
        public final InterfaceC5790ol d(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            InterfaceC2347Wu0 interfaceC2347Wu0Y = this.d.y("auth.step", name);
            Intrinsics.checkNotNullExpressionValue(interfaceC2347Wu0Y, "startChild(...)");
            boolean zA = Intrinsics.a(name, "ws_auth");
            C0831Dl c0831Dl = this.j;
            if (zA && C0831Dl.e.contains(this.a)) {
                c0831Dl.c.add(this);
            }
            return new b(c0831Dl, this, name, interfaceC2347Wu0Y);
        }

        public final void e() {
            LinkedHashMap linkedHashMap;
            Pair pair;
            String str;
            this.j.c.remove(this);
            Iterator it = WE.f(Boolean.TRUE, Boolean.FALSE).iterator();
            do {
                boolean zHasNext = it.hasNext();
                linkedHashMap = this.f;
                pair = null;
                if (!zHasNext) {
                    break;
                }
                Boolean bool = (Boolean) it.next();
                boolean zBooleanValue = bool.booleanValue();
                String str2 = (String) linkedHashMap.get(bool);
                if (str2 != null) {
                    if (str2.equals("ok")) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        pair = new Pair(zBooleanValue ? "real" : "demo", str2);
                    }
                }
            } while (pair == null);
            if (pair != null) {
                str = pair.d + ":" + pair.e;
            } else {
                str = linkedHashMap.size() < 2 ? "timeout" : "ok";
            }
            InterfaceC4302hv0 interfaceC4302hv0 = this.d;
            interfaceC4302hv0.b("ws_auth.outcome", str);
            if (this.e) {
                a(str);
            }
            InterfaceC2347Wu0 interfaceC2347Wu0 = this.g;
            if (interfaceC2347Wu0 == null) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.h;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            interfaceC2347Wu0.A(Intrinsics.a(str, "ok") ? EnumC4869kO1.OK : EnumC4869kO1.INTERNAL_ERROR);
            interfaceC4302hv0.A(EnumC4869kO1.OK);
        }

        @Override // defpackage.InterfaceC3220cl
        @NotNull
        public final String getId() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: Dl$b */
    public final class b implements InterfaceC5790ol {

        @NotNull
        public final a a;

        @NotNull
        public final String b;

        @NotNull
        public final InterfaceC2347Wu0 c;

        @Nullable
        public final ScheduledFuture<?> d;

        public b(@NotNull C0831Dl c0831Dl, @NotNull a attempt, @NotNull String name, InterfaceC2347Wu0 span) {
            ScheduledFuture<?> scheduledFutureSchedule;
            Intrinsics.checkNotNullParameter(attempt, "attempt");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(span, "span");
            this.a = attempt;
            this.b = name;
            this.c = span;
            if (Intrinsics.a(attempt.a, "launch") || C4269hl.a.contains(name)) {
                scheduledFutureSchedule = null;
            } else {
                Object value = c0831Dl.d.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                scheduledFutureSchedule = ((ScheduledExecutorService) value).schedule(new RunnableC0909El(this, 0), 20000L, TimeUnit.MILLISECONDS);
            }
            this.d = scheduledFutureSchedule;
        }

        @Override // defpackage.InterfaceC5790ol
        public final void a(boolean z) {
            ScheduledFuture<?> scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            InterfaceC2347Wu0 interfaceC2347Wu0 = this.c;
            if (interfaceC2347Wu0.e()) {
                return;
            }
            interfaceC2347Wu0.A(z ? EnumC4869kO1.OK : EnumC4869kO1.INTERNAL_ERROR);
            if (z) {
                return;
            }
            WF1.a("auth", "auth.step_failed", NG1.WARNING, OW0.b(new Pair("step", this.b)));
        }
    }

    static {
        String[] elements = {"register", "login"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        e = C1526Mj.H(elements);
    }

    public final void a(@NotNull JX1 failure) {
        NG1 ng1;
        Object c3849fl;
        Intrinsics.checkNotNullParameter(failure, "failure");
        ConcurrentHashMap.KeySetView<a, Boolean> openAttempts = this.b;
        Intrinsics.checkNotNullExpressionValue(openAttempts, "openAttempts");
        if (openAttempts == null || !openAttempts.isEmpty()) {
            Iterator<a> it = openAttempts.iterator();
            while (it.hasNext()) {
                if (!Intrinsics.a(it.next().a, "launch")) {
                    return;
                }
            }
        }
        C4059gl c4059gl = this.a;
        c4059gl.getClass();
        Intrinsics.checkNotNullParameter(failure, "failure");
        List listF = WE.f("po-refusal", failure.c);
        Intrinsics.checkNotNullParameter(failure, "failure");
        int i = failure.a;
        Integer numValueOf = Integer.valueOf(i);
        Set<Integer> set = C4059gl.f;
        if (c4059gl.a(set.contains(numValueOf) ? 1 : 3, listF)) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            if (set.contains(Integer.valueOf(i))) {
                ng1 = NG1.INFO;
            } else {
                Intrinsics.checkNotNullParameter(failure, "failure");
                ng1 = (C4059gl.g.contains(Integer.valueOf(i)) || (failure.f instanceof IOException)) ? NG1.WARNING : NG1.ERROR;
            }
            c3849fl = new C3849fl(ng1, listF);
        } else {
            c3849fl = C3639el.a;
        }
        if (c3849fl instanceof C3849fl) {
            String kind = failure.c;
            Intrinsics.checkNotNullParameter(kind, "kind");
            String errorText = failure.d;
            Intrinsics.checkNotNullParameter(errorText, "errorText");
            StringBuilder sb = new StringBuilder("PO refused: ");
            sb.append(kind);
            sb.append(" (");
            QF1.a(new RobotTelemetryException.PlatformRefusal(C5807oq.b(sb, errorText, ")"), null), new C7049ul(0, (C3849fl) c3849fl, failure));
        }
    }

    public final void b(@NotNull String name, int i, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data, "data");
        WF1.a("http", "request.retry", NG1.WARNING, PW0.h(PW0.h(data, new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, name)), new Pair("tries", Integer.valueOf(i))));
        ConcurrentHashMap.KeySetView<a, Boolean> openAttempts = this.b;
        Intrinsics.checkNotNullExpressionValue(openAttempts, "openAttempts");
        Iterator<T> it = openAttempts.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(C5491nL.c("retry.", name), String.valueOf(i));
        }
    }

    public final void c(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Map mapE = PW0.e(new Pair("error_class", error.getClass().getName()), new Pair("message", error.getMessage()), new Pair("top_frame", C5027l8.y(error)));
        if (!(error instanceof IOException)) {
            Intrinsics.checkNotNullParameter(error, "error");
            String key = error.getClass().getName() + "@" + C5027l8.y(error);
            C4059gl c4059gl = this.a;
            c4059gl.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            if (c4059gl.b.a(key)) {
                QF1.a(error, new C6419rl(0));
                return;
            }
        }
        WF1.a("http", "http.unexpected_error", NG1.WARNING, mapE);
    }

    public final void d(@NotNull String outcome, boolean z) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        ConcurrentHashMap.KeySetView<a, Boolean> awaitingWsAuth = this.c;
        Intrinsics.checkNotNullExpressionValue(awaitingWsAuth, "awaitingWsAuth");
        for (a aVar : awaitingWsAuth) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            C0831Dl c0831Dl = aVar.j;
            synchronized (aVar) {
                try {
                    if (c0831Dl.c.contains(aVar)) {
                        if (!aVar.f.containsKey(Boolean.valueOf(z))) {
                            aVar.f.put(Boolean.valueOf(z), outcome);
                            aVar.d.b(z ? "ws_auth.real" : "ws_auth.demo", outcome);
                            if (aVar.f.size() == 2) {
                                aVar.e();
                            }
                        }
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

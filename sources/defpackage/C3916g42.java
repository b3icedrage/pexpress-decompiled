package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.feature.telemetry.exceptions.RobotTelemetryException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.android.core.b0;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: g42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3916g42 implements InterfaceC3706f42 {

    @NotNull
    public final C6530sH1 a;

    @NotNull
    public final C0831Dl b;

    @NotNull
    public final BB1 c;

    @NotNull
    public final AtomicBoolean d;

    /* JADX INFO: renamed from: g42$a */
    @InterfaceC3368dU(c = "com.base.feature.telemetry.TradingTelemetryReporterImpl$1", f = "TradingTelemetryReporterImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<Boolean, JM<? super Unit>, Object> {
        public /* synthetic */ boolean d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = C3916g42.this.new a(jm);
            aVar.d = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, JM<? super Unit> jm) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C3916g42.this.d.set(this.d);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: g42$b */
    public static final class b implements InterfaceC3220cl {

        @NotNull
        public final String a;

        public b() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.a = string;
        }

        @Override // defpackage.InterfaceC3220cl
        public final void b(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
        }

        @Override // defpackage.InterfaceC3220cl
        public final void c(@NotNull EnumC4737jl outcome, @Nullable String str, @Nullable JX1 jx1) {
            Intrinsics.checkNotNullParameter(outcome, "outcome");
        }

        @Override // defpackage.InterfaceC3220cl
        @NotNull
        public final InterfaceC5790ol d(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return c.a;
        }

        @Override // defpackage.InterfaceC3220cl
        @NotNull
        public final String getId() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: g42$d */
    public final class d implements InterfaceC3220cl {

        @NotNull
        public final C0831Dl.a a;

        @NotNull
        public final String b;
        public final /* synthetic */ C3916g42 c;

        public d(@NotNull C3916g42 c3916g42, C0831Dl.a delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.c = c3916g42;
            this.a = delegate;
            this.b = delegate.b;
        }

        @Override // defpackage.InterfaceC3220cl
        public final void b(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                this.a.b(key, value);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at authAttemptTag/sentry", th);
            }
        }

        @Override // defpackage.InterfaceC3220cl
        public final void c(@NotNull EnumC4737jl outcome, @Nullable String str, @Nullable JX1 jx1) {
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            try {
                this.a.c(outcome, str, jx1);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at authAttemptFinished/sentry", th);
            }
        }

        @Override // defpackage.InterfaceC3220cl
        @NotNull
        public final InterfaceC5790ol d(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            try {
                return new e(this.c, this.a.d(name));
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at authStep/sentry", th);
                return c.a;
            }
        }

        @Override // defpackage.InterfaceC3220cl
        @NotNull
        public final String getId() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: g42$e */
    public final class e implements InterfaceC5790ol {

        @NotNull
        public final InterfaceC5790ol a;

        public e(@NotNull C3916g42 c3916g42, InterfaceC5790ol delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.a = delegate;
        }

        @Override // defpackage.InterfaceC5790ol
        public final void a(boolean z) {
            try {
                this.a.a(z);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at authStepFinished/sentry", th);
            }
        }
    }

    public C3916g42(@NotNull C6530sH1 sentry, @NotNull C0831Dl auth, @NotNull GX1 flagProvider, @NotNull BB1 snapshotProvider) {
        Intrinsics.checkNotNullParameter(sentry, "sentry");
        Intrinsics.checkNotNullParameter(auth, "auth");
        Intrinsics.checkNotNullParameter(flagProvider, "flagProvider");
        Intrinsics.checkNotNullParameter(snapshotProvider, "snapshotProvider");
        this.a = sentry;
        this.b = auth;
        this.c = snapshotProvider;
        this.d = new AtomicBoolean(false);
        C4002gV1 context = C0564Aa.a();
        kotlin.coroutines.e.d.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        C4466ii.v(new EM(context.t(C6266r20.a)), new C4718jg0(flagProvider.c, new a(null)));
    }

    @Override // defpackage.InterfaceC3706f42
    public final void A(@NotNull String url, @Nullable Long l, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.d.get()) {
            try {
                this.a.L(url, l, z);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsConnected/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void B(@NotNull AbstractC5082lP1 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.d.get()) {
            try {
                this.a.B(reason);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at robotStartBlocked/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void C(@NotNull String trigger, int i, boolean z) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (this.d.get()) {
            try {
                this.a.R(trigger, i, z);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsReconnectStarted/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void D(@NotNull LJ1 action, @NotNull String reason, @NotNull Map<String, ? extends Object> extra) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(extra, "extra");
        if (this.d.get()) {
            try {
                this.a.E(action, reason, extra);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at setupActionBlocked/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void E(int i, boolean z, @NotNull El2 failure) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (this.d.get()) {
            try {
                this.a.M(i, z, failure);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsConnectionFailed/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void F(@NotNull String trigger) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (this.d.get()) {
            try {
                this.a.getClass();
                C6530sH1.o(trigger);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at foregroundServiceStartRefused/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void G(@NotNull String name, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cause, "cause");
        if (this.d.get()) {
            try {
                this.a.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(name, "name");
                QF1.a(new RobotTelemetryException.DataUpdaterFailed("AppData updater failed: ".concat(name), cause), new C4849kI(name, cause));
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at dataUpdaterFailed/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void H() {
        Object objA;
        if (this.d.get()) {
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                objA = this.c.a();
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                objA = C1795Pt1.a(th);
            }
            if (C1717Ot1.a(objA) != null) {
                objA = PW0.c();
            }
            final Map startContext = (Map) objA;
            try {
                C6530sH1 c6530sH1 = this.a;
                c6530sH1.getClass();
                Intrinsics.checkNotNullParameter(startContext, "startContext");
                C6530sH1.h(c6530sH1, "ui.action", "robot.start_requested", startContext);
                try {
                    QF1.d(new MD1() { // from class: kH1
                        @Override // defpackage.MD1
                        public final void e(InterfaceC1015Fu0 scope) {
                            Intrinsics.checkNotNullParameter(scope, "scope");
                            scope.E(startContext, "robot_start_context");
                        }
                    });
                    Unit unit = Unit.a;
                } catch (Throwable th2) {
                    C1717Ot1.a aVar3 = C1717Ot1.e;
                    C1795Pt1.a(th2);
                }
            } catch (Throwable th3) {
                b0.f("Telemetry", "telemetry sink failed at robotStartRequested/sentry", th3);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void I(@NotNull String method, @NotNull String urlTemplate, @NotNull Throwable throwable, long j, @Nullable String str) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(urlTemplate, "urlTemplate");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (this.d.get()) {
            try {
                this.a.getClass();
                C6530sH1.r(method, urlTemplate, throwable, j, str);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at httpIoError/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void J(@NotNull String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (this.d.get()) {
            try {
                this.a.b(requestId);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at betCycleStarted/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void K(@NotNull String event, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.d.get()) {
            try {
                C6530sH1 c6530sH1 = this.a;
                c6530sH1.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(data, "data");
                C6530sH1.h(c6530sH1, "ws", "ws." + event, data);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsDiagnostic/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void L(@NotNull String reason, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.d.get()) {
            try {
                this.a.m(reason, data);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at forcedLogout/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void M(@NotNull String category, @NotNull String message, @NotNull EnumC0936Eu level, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.d.get()) {
            try {
                this.a.getClass();
                C6530sH1.w(category, message, level, data);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at breadcrumb/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void N(@NotNull String reason, int i, boolean z, @Nullable El2 el2) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.d.get()) {
            try {
                this.a.N(reason, i, z, el2);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsDisconnected/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void O(long j, int i, boolean z) {
        if (this.d.get()) {
            try {
                this.a.S(j, i, z);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsReconnectSucceeded/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void P(long j, @NotNull String trigger, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (this.d.get()) {
            try {
                this.a.getClass();
                C6530sH1.F(j, trigger, str, str2);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at startGatedOnAssets/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void Q(@NotNull String outcome, boolean z) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (this.d.get()) {
            try {
                this.b.d(outcome, z);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsAuthOutcome/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void R(@NotNull Throwable throwable, @NotNull C4025gc1 ctx) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (this.d.get()) {
            try {
                this.a.getClass();
                C6530sH1.j(throwable, ctx);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at captureParseError/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void S(@NotNull C7233ve1 report) {
        Intrinsics.checkNotNullParameter(report, "report");
        if (this.d.get()) {
            try {
                this.a.x(report);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at platformHostResolved/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void T(long j, boolean z, long j2, @NotNull String idleKind) {
        Intrinsics.checkNotNullParameter(idleKind, "idleKind");
        if (this.d.get()) {
            try {
                this.a.Q(j, z, j2, idleKind);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsMessageTimeout/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void U(int i, @NotNull String method, @NotNull String urlTemplate, long j, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(urlTemplate, "urlTemplate");
        if (this.d.get()) {
            try {
                this.a.getClass();
                C6530sH1.q(i, method, urlTemplate, j, str, str2);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at httpFailure/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void V(boolean z, @NotNull Bl2 summary) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        if (this.d.get()) {
            try {
                this.a.K(z, summary);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsClosedByOther/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void W() {
        if (this.d.get()) {
            try {
                C6530sH1 c6530sH1 = this.a;
                c6530sH1.getClass();
                C5437n42 c5437n42 = new C5437n42();
                c5437n42.g = 300000L;
                c5437n42.h = 600000L;
                c5437n42.b = LD1.ON;
                c6530sH1.j = QF1.e().o("robot.session", "task", c5437n42);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at robotSessionTransactionStarted/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void X(@NotNull String url, long j) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.d.get()) {
            try {
                this.a.O(url, j);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsEndpointSelected/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void Y(@NotNull Throwable error, @NotNull Map<String, ? extends Object> extra) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(extra, "extra");
        if (this.d.get()) {
            try {
                this.a.getClass();
                C6530sH1.i(error, extra);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at captureBackendException/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void Z(@NotNull Z22 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.d.get()) {
            try {
                this.a.getClass();
                C6530sH1.H(event);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at tradingEventReceived/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void a(@NotNull Dl2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        if (this.d.get()) {
            try {
                this.a.J(info);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsClosed/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void b(@Nullable String str, long j) {
        if (this.d.get()) {
            try {
                C6530sH1 c6530sH1 = this.a;
                c6530sH1.getClass();
                C6530sH1.h(c6530sH1, "loading", "first_not_null.done", PW0.e(new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, str), new Pair("took_ms", Long.valueOf(j))));
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at firstNotNullDone/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void c(@NotNull String trigger, int i, long j) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (this.d.get()) {
            try {
                this.a.n(trigger, i, j);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at foregroundServiceStartRecovered/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void d(@NotNull String url, @NotNull String errorClass) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(errorClass, "errorClass");
        if (this.d.get()) {
            try {
                this.a.getClass();
                C6530sH1.T(url, errorClass);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsSingleEndpointFailed/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void e(@NotNull String requestId, @NotNull String asset, double d2, @NotNull String currency, @NotNull String direction, @NotNull String accountType) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        if (this.d.get()) {
            try {
                this.a.e(requestId, asset, d2, currency, direction, accountType);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at betPlaced/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void f(@NotNull C2099Tr error, @NotNull String requestId) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (this.d.get()) {
            try {
                this.a.getClass();
                C6530sH1.d(error, requestId);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at betFailed/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void g(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.d.get()) {
            try {
                this.b.c(error);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at unexpectedRequestError/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void h(int i, @NotNull String typeName, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        Intrinsics.checkNotNullParameter(cause, "cause");
        if (this.d.get()) {
            try {
                this.a.getClass();
                C6530sH1.v(i, typeName, cause);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at parseSwallowed/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void i(@NotNull String name, int i, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.d.get()) {
            try {
                this.b.b(name, i, data);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at requestRetried/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void j(@Nullable InterfaceC2441Xr interfaceC2441Xr, @NotNull String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (this.d.get()) {
            try {
                this.a.a(interfaceC2441Xr, requestId);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at betCycleFinished/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void k(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.d.get()) {
            try {
                C6530sH1 c6530sH1 = this.a;
                c6530sH1.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                C6530sH1.h(c6530sH1, "data", "data.updater_started", OW0.b(new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, name)));
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at dataUpdaterStarted/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void l(@NotNull InterfaceC2441Xr result, @NotNull String requestId, long j) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (this.d.get()) {
            try {
                this.a.f(result, requestId, j);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at betResult/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void m(@Nullable String str, long j) {
        if (this.d.get()) {
            try {
                this.a.getClass();
                WF1.a("loading", "first_not_null.slow", NG1.WARNING, PW0.e(new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, str), new Pair("since_ms", Long.valueOf(j))));
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at firstNotNullSlow/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void n(@NotNull JX1 failure) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (this.d.get()) {
            try {
                this.b.a(failure);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at platformRefusal/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void o(@NotNull String field) {
        Intrinsics.checkNotNullParameter(field, "field");
        if (this.d.get()) {
            try {
                this.a.getClass();
                Intrinsics.checkNotNullParameter(field, "field");
                WF1.a("data", "data.field_still_missing", NG1.WARNING, PW0.e(new Pair("field", field), new Pair("since_ms", 30000L)));
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at appDataFieldStillMissing/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void p(@NotNull FI1 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.d.get()) {
            try {
                this.a.z(reason);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at robotSessionEnded/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void q(@NotNull CommonError error, @Nullable String str) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.d.get()) {
            try {
                this.a.u(error, str);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at okFilterDropped/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void r(@NotNull String title, @NotNull EnumC5633o10 severity) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(severity, "severity");
        if (this.d.get()) {
            try {
                this.a.getClass();
                C6530sH1.l(title, severity);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at dialogShown/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void s(@NotNull C4993kz1 ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (this.d.get()) {
            try {
                this.a.A(ctx);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at robotSessionStarted/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void t(@NotNull String name, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.d.get()) {
            try {
                this.a.k(name, j);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at dataUpdaterTargetMissing/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void u(@NotNull String errorClass, int i, boolean z) {
        Intrinsics.checkNotNullParameter(errorClass, "errorClass");
        if (this.d.get()) {
            try {
                this.a.I(errorClass, i, z);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsAuthError/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void v(@NotNull String requestId, int i, long j, @NotNull String kind, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (this.d.get()) {
            try {
                this.a.c(requestId, i, j, kind, str, str2, str3);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at betEndTimeout/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void w(@NotNull String reason, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.d.get()) {
            try {
                this.a.getClass();
                Intrinsics.checkNotNullParameter(reason, "reason");
                WF1.a("bet", "bet.response_filtered", NG1.INFO, PW0.e(new Pair("reason", reason), new Pair("bet_id", l)));
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at tradingResponseFiltered/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void x(@NotNull String requestId, @NotNull String name, @NotNull String kind, long j, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (this.d.get()) {
            try {
                this.a.g(requestId, name, kind, j, str, str2, str3);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at betStartTimeout/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    public final void y(int i, int i2, int i3, @Nullable Boolean bool) {
        if (this.d.get()) {
            try {
                this.a.P(i, i2, i3, bool);
            } catch (Throwable th) {
                b0.f("Telemetry", "telemetry sink failed at wsEndpointSelectionFailed/sentry", th);
            }
        }
    }

    @Override // defpackage.InterfaceC3706f42
    @NotNull
    public final InterfaceC3220cl z(@NotNull String flow, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(data, "data");
        if (!this.d.get()) {
            return new b();
        }
        try {
            C0831Dl c0831Dl = this.b;
            c0831Dl.getClass();
            Intrinsics.checkNotNullParameter(flow, "flow");
            Intrinsics.checkNotNullParameter(data, "data");
            return new d(this, new C0831Dl.a(c0831Dl, flow, data));
        } catch (Throwable th) {
            b0.f("Telemetry", "telemetry sink failed at authAttemptStarted/sentry", th);
            return new b();
        }
    }

    /* JADX INFO: renamed from: g42$c */
    public static final class c implements InterfaceC5790ol {

        @NotNull
        public static final c a = new c();

        @Override // defpackage.InterfaceC5790ol
        public final void a(boolean z) {
        }
    }
}

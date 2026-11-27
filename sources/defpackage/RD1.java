package defpackage;

import io.sentry.hints.n;
import io.sentry.logger.b;
import io.sentry.logger.e;
import io.sentry.protocol.B;
import io.sentry.protocol.F;
import io.sentry.protocol.m;
import io.sentry.protocol.u;
import io.sentry.transport.l;
import io.sentry.util.g;
import io.sentry.util.p;
import io.sentry.util.w;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class RD1 implements InterfaceC1171Hu0 {

    @NotNull
    public final InterfaceC1015Fu0 a;

    @NotNull
    public final InterfaceC1015Fu0 b;

    @NotNull
    public final KD1 c;

    @NotNull
    public final JH d;

    @NotNull
    public final C5050lF e;

    @NotNull
    public final e f;

    public RD1(@NotNull InterfaceC1015Fu0 interfaceC1015Fu0, @NotNull InterfaceC1015Fu0 interfaceC1015Fu1, @NotNull KD1 kd1) {
        this.e = new C5050lF(interfaceC1015Fu1, interfaceC1015Fu0, kd1);
        this.a = interfaceC1015Fu0;
        this.b = interfaceC1015Fu1;
        this.c = kd1;
        C2688aH1 c2688aH1P = p();
        p.b(c2688aH1P, "SentryOptions is required.");
        if (c2688aH1P.getDsn() == null || c2688aH1P.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
        this.d = c2688aH1P.getCompositePerformanceCollector();
        this.f = new e(this);
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void A(@Nullable PD1 pd1, @NotNull MD1 md1) {
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            md1.e(this.e.i(pd1));
        } catch (Throwable th) {
            p().getLogger().d(NG1.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final InterfaceC4302hv0 B(@NotNull C4804k42 c4804k42, @NotNull C5437n42 c5437n42) {
        Double dValueOf;
        c4804k42.m = c5437n42.d;
        boolean zIsEnabled = isEnabled();
        InterfaceC4302hv0 interfaceC4302hv0A = C5440n51.a;
        if (!zIsEnabled) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        } else if (w.a(c4804k42.m, p().getIgnoredSpanOrigins())) {
            p().getLogger().a(NG1.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", c4804k42.m);
        } else if (!p().getInstrumenter().equals(c4804k42.p)) {
            p().getLogger().a(NG1.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", c4804k42.p, p().getInstrumenter());
        } else if (p().isTracingEnabled()) {
            C2171Up c2171Up = c4804k42.q;
            if (c2171Up == null || (dValueOf = c2171Up.d) == null) {
                Double d = this.e.y().c.d;
                dValueOf = Double.valueOf(d == null ? 0.0d : d.doubleValue());
            }
            L02 l02A = p().getInternalTracesSampler().a(new C6935uC1(c4804k42, dValueOf));
            c4804k42.a(l02A);
            InterfaceC2451Xu0 spanFactory = p().getSpanFactory();
            Boolean bool = l02A.a;
            if (bool.booleanValue() && p().isContinuousProfilingEnabled()) {
                EnumC5147li1 profileLifecycle = p().getProfileLifecycle();
                EnumC5147li1 enumC5147li1 = EnumC5147li1.TRACE;
                if (profileLifecycle == enumC5147li1) {
                    if (c4804k42.s.equals(u.e)) {
                        p().getContinuousProfiler().b(enumC5147li1, p().getInternalTracesSampler());
                    }
                }
            }
            interfaceC4302hv0A = spanFactory.a(c4804k42, this, c5437n42, this.d);
            if (bool.booleanValue() && l02A.d.booleanValue()) {
                InterfaceC4550iv0 transactionProfiler = p().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.b(interfaceC4302hv0A);
                } else if (c5437n42.e) {
                    transactionProfiler.b(interfaceC4302hv0A);
                }
            }
        } else {
            p().getLogger().a(NG1.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        }
        if (LD1.ON == c5437n42.b) {
            interfaceC4302hv0A.n();
        }
        return interfaceC4302hv0A;
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final InterfaceC1171Hu0 C(@NotNull String str) {
        return new RD1(this.a.clone(), this.b.clone(), this.c);
    }

    @NotNull
    public final InterfaceC1015Fu0 D(@NotNull InterfaceC1015Fu0 interfaceC1015Fu0, @Nullable MD1 md1) {
        if (md1 != null) {
            try {
                InterfaceC1015Fu0 interfaceC1015Fu0F = interfaceC1015Fu0.clone();
                md1.e(interfaceC1015Fu0F);
                return interfaceC1015Fu0F;
            } catch (Throwable th) {
                p().getLogger().d(NG1.ERROR, "Error in the 'ScopeCallback' callback.", th);
            }
        }
        return interfaceC1015Fu0;
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void a(boolean z) {
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (OB0 ob0 : p().getIntegrations()) {
                if (ob0 instanceof Closeable) {
                    try {
                        ((Closeable) ob0).close();
                    } catch (Throwable th) {
                        p().getLogger().a(NG1.WARNING, "Failed to close the integration {}.", ob0, th);
                    }
                }
            }
            for (N80 n80 : p().getEventProcessors()) {
                if (n80 instanceof Closeable) {
                    try {
                        ((Closeable) n80).close();
                    } catch (Throwable th2) {
                        p().getLogger().a(NG1.WARNING, "Failed to close the event processor {}.", n80, th2);
                    }
                }
            }
            boolean zIsEnabled = isEnabled();
            C5050lF c5050lF = this.e;
            if (zIsEnabled) {
                try {
                    c5050lF.i(null).clear();
                } catch (Throwable th3) {
                    p().getLogger().d(NG1.ERROR, "Error in the 'configureScope' callback.", th3);
                }
            } else {
                p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            PD1 pd1 = PD1.ISOLATION;
            if (isEnabled()) {
                try {
                    c5050lF.i(pd1).clear();
                } catch (Throwable th4) {
                    p().getLogger().d(NG1.ERROR, "Error in the 'configureScope' callback.", th4);
                }
            } else {
                p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            p().getBackpressureMonitor().close();
            p().getTransactionProfiler().close();
            p().getContinuousProfiler().a(true);
            p().getCompositePerformanceCollector().close();
            p().getConnectionStatusProvider().close();
            InterfaceC1405Ku0 executorService = p().getExecutorService();
            if (z) {
                try {
                    executorService.submit(new RunnableC4140h80(1, this, executorService));
                } catch (RejectedExecutionException e) {
                    p().getLogger().d(NG1.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e);
                    executorService.a(p().getShutdownTimeoutMillis());
                }
            } else {
                executorService.a(p().getShutdownTimeoutMillis());
            }
            PD1 pd2 = PD1.CURRENT;
            if (isEnabled()) {
                try {
                    c5050lF.i(pd2).A().a(z);
                } catch (Throwable th5) {
                    p().getLogger().d(NG1.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            PD1 pd3 = PD1.ISOLATION;
            if (isEnabled()) {
                try {
                    c5050lF.i(pd3).A().a(z);
                } catch (Throwable th6) {
                    p().getLogger().d(NG1.ERROR, "Error in the 'configureScope' callback.", th6);
                }
            } else {
                p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            PD1 pd4 = PD1.GLOBAL;
            if (!isEnabled()) {
                p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                c5050lF.i(pd4).A().a(z);
            } catch (Throwable th7) {
                p().getLogger().d(NG1.ERROR, "Error in the 'configureScope' callback.", th7);
            }
        } catch (Throwable th8) {
            p().getLogger().d(NG1.ERROR, "Error while closing the Scopes.", th8);
        }
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void b(@Nullable String str, @Nullable String str2) {
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str2 == null) {
            p().getLogger().a(NG1.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            this.e.b(str, str2);
        }
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void c(@Nullable F f) {
        if (isEnabled()) {
            this.e.c(f);
        } else {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        }
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void d(long j) {
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.e.A().d(j);
        } catch (Throwable th) {
            p().getLogger().d(NG1.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // defpackage.InterfaceC1171Hu0
    @Nullable
    public final InterfaceC2347Wu0 e() {
        if (isEnabled()) {
            return this.e.e();
        }
        p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // defpackage.InterfaceC1171Hu0
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1243Is0 clone() {
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new C1551Mr0((RD1) C("scopes clone"));
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void g(@NotNull C0702Bu c0702Bu) {
        l(c0702Bu, new C0841Do0());
    }

    @Override // defpackage.InterfaceC1171Hu0
    @Nullable
    public final l h() {
        return this.e.A().h();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final boolean i() {
        return this.e.A().i();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final boolean isEnabled() {
        return this.e.A().isEnabled();
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u k(@NotNull C3537eG1 c3537eG1, @Nullable C0841Do0 c0841Do0) {
        u uVar = u.e;
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return uVar;
        }
        try {
            u uVarK = this.e.A().k(c3537eG1, c0841Do0);
            return uVarK != null ? uVarK : uVar;
        } catch (Throwable th) {
            p().getLogger().d(NG1.ERROR, "Error while capturing envelope.", th);
        }
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void l(@NotNull C0702Bu c0702Bu, @Nullable C0841Do0 c0841Do0) {
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (c0702Bu == null) {
            p().getLogger().a(NG1.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.e.l(c0702Bu, c0841Do0);
        }
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u m(@NotNull C1445Lh1 c1445Lh1) {
        p.b(c1445Lh1, "profilingContinuousData is required");
        u uVar = u.e;
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return uVar;
        }
        try {
            return this.e.A().m(c1445Lh1);
        } catch (Throwable th) {
            p().getLogger().d(NG1.ERROR, "Error while capturing profile chunk with id: " + c1445Lh1.g, th);
            return uVar;
        }
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u n(@NotNull String str, @NotNull NG1 ng1, @NotNull MD1 md1) {
        C5050lF c5050lF = this.e;
        u uVarF = u.e;
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            p().getLogger().a(NG1.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                InterfaceC1015Fu0 interfaceC1015Fu0D = D(c5050lF, md1);
                InterfaceC1327Ju0 interfaceC1327Ju0A = c5050lF.A();
                interfaceC1327Ju0A.getClass();
                EG1 eg1 = new EG1();
                m mVar = new m();
                mVar.d = str;
                eg1.u = mVar;
                eg1.y = ng1;
                uVarF = interfaceC1327Ju0A.f(eg1, interfaceC1015Fu0D, null);
            } catch (Throwable th) {
                p().getLogger().d(NG1.ERROR, "Error while capturing message: ".concat(str), th);
            }
        }
        c5050lF.J(uVarF);
        return uVarF;
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final C2688aH1 p() {
        return this.e.a.m;
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u q(@NotNull Throwable th, @Nullable C0841Do0 c0841Do0, @NotNull MD1 md1) {
        C5050lF c5050lF = this.e;
        u uVarF = u.e;
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th == null) {
            p().getLogger().a(NG1.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                EG1 eg1 = new EG1(th);
                c5050lF.a(eg1);
                uVarF = c5050lF.A().f(eg1, D(c5050lF, md1), c0841Do0);
            } catch (Throwable th2) {
                p().getLogger().d(NG1.ERROR, "Error while capturing exception: " + th.getMessage(), th2);
            }
        }
        c5050lF.J(uVarF);
        return uVarF;
    }

    @Override // defpackage.InterfaceC1171Hu0
    @Nullable
    public final InterfaceC4302hv0 r() {
        if (isEnabled()) {
            return this.e.r();
        }
        p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void removeTag(@Nullable String str) {
        if (isEnabled()) {
            this.e.removeTag(str);
        } else {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'removeTag' call is a no-op.", new Object[0]);
        }
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void s() {
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        C5050lF c5050lF = this.e;
        CI1 ci1S = c5050lF.s();
        if (ci1S != null) {
            c5050lF.A().g(ci1S, g.a(new n()));
        }
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void t() {
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        C5050lF c5050lF = this.e;
        KD1.d dVarT = c5050lF.t();
        if (dVarT == null) {
            p().getLogger().a(NG1.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        CI1 ci1 = dVarT.a;
        if (ci1 != null) {
            c5050lF.A().g(ci1, g.a(new n()));
        }
        c5050lF.A().g(dVarT.b, g.a(new io.sentry.hints.p()));
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final b u() {
        return this.f;
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u v(@NotNull C2912bH1 c2912bH1, @Nullable C0841Do0 c0841Do0) {
        InterfaceC1015Fu0 interfaceC1015Fu0 = this.e;
        u uVar = u.e;
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return uVar;
        }
        try {
            return interfaceC1015Fu0.A().c(c2912bH1, interfaceC1015Fu0, c0841Do0);
        } catch (Throwable th) {
            p().getLogger().d(NG1.ERROR, "Error while capturing replay", th);
            return uVar;
        }
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u w(@NotNull EG1 eg1, @Nullable C0841Do0 c0841Do0) {
        C5050lF c5050lF = this.e;
        u uVarF = u.e;
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return uVarF;
        }
        try {
            c5050lF.a(eg1);
            uVarF = c5050lF.A().f(eg1, c5050lF, c0841Do0);
            c5050lF.J(uVarF);
            return uVarF;
        } catch (Throwable th) {
            p().getLogger().d(NG1.ERROR, "Error while capturing event with id: " + eg1.d, th);
            return uVarF;
        }
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u x(@NotNull B b, @Nullable H02 h02, @Nullable C0841Do0 c0841Do0, @Nullable C1136Hi1 c1136Hi1) {
        B b2;
        u uVar = u.e;
        if (!isEnabled()) {
            p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return uVar;
        }
        if (b.v == null) {
            p().getLogger().a(NG1.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", b.d);
            return uVar;
        }
        Boolean bool = Boolean.TRUE;
        C3561eO1 c3561eO1J = b.e.j();
        L02 l02 = c3561eO1J == null ? null : c3561eO1J.h;
        if (!bool.equals(Boolean.valueOf(l02 != null ? l02.a.booleanValue() : false))) {
            p().getLogger().a(NG1.DEBUG, "Transaction %s was dropped due to sampling decision.", b.d);
            int iA = p().getBackpressureMonitor().a();
            ArrayList arrayList = b.w;
            if (iA > 0) {
                io.sentry.clientreport.g clientReportRecorder = p().getClientReportRecorder();
                io.sentry.clientreport.e eVar = io.sentry.clientreport.e.BACKPRESSURE;
                clientReportRecorder.a(eVar, EnumC5932pS.Transaction);
                p().getClientReportRecorder().e(eVar, EnumC5932pS.Span, arrayList.size() + 1);
                return uVar;
            }
            io.sentry.clientreport.g clientReportRecorder2 = p().getClientReportRecorder();
            io.sentry.clientreport.e eVar2 = io.sentry.clientreport.e.SAMPLE_RATE;
            clientReportRecorder2.a(eVar2, EnumC5932pS.Transaction);
            p().getClientReportRecorder().e(eVar2, EnumC5932pS.Span, arrayList.size() + 1);
            return uVar;
        }
        InterfaceC1015Fu0 interfaceC1015Fu0 = this.e;
        try {
            b2 = b;
            try {
                return interfaceC1015Fu0.A().e(b2, h02, interfaceC1015Fu0, c0841Do0, c1136Hi1);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                p().getLogger().d(NG1.ERROR, "Error while capturing transaction with id: " + b2.d, th2);
                return uVar;
            }
        } catch (Throwable th3) {
            th = th3;
            b2 = b;
        }
    }
}

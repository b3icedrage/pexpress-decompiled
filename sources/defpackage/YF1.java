package defpackage;

import io.sentry.ILogger;
import io.sentry.android.core.C;
import io.sentry.clientreport.g;
import io.sentry.hints.f;
import io.sentry.hints.r;
import io.sentry.logger.c;
import io.sentry.logger.h;
import io.sentry.metrics.b;
import io.sentry.protocol.B;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.C4522d;
import io.sentry.protocol.C4525g;
import io.sentry.protocol.G;
import io.sentry.protocol.m;
import io.sentry.protocol.u;
import io.sentry.transport.e;
import io.sentry.transport.l;
import io.sentry.util.k;
import io.sentry.util.p;
import io.sentry.util.t;
import io.sentry.util.v;
import io.sentry.util.z;
import io.sentry.vendor.a;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class YF1 implements InterfaceC1327Ju0 {

    @NotNull
    public final C2688aH1 b;

    @NotNull
    public final e c;

    @NotNull
    public final c e;

    @NotNull
    public final b f;

    @NotNull
    public final a d = new a();
    public boolean a = true;

    public static final class a implements Comparator<C0702Bu> {
        @Override // java.util.Comparator
        public final int compare(@NotNull C0702Bu c0702Bu, @NotNull C0702Bu c0702Bu2) {
            return c0702Bu.e().compareTo(c0702Bu2.e());
        }
    }

    public YF1(@NotNull C2688aH1 c2688aH1) {
        this.b = c2688aH1;
        InterfaceC4770jv0 transportFactory = c2688aH1.getTransportFactory();
        if (transportFactory instanceof C5650o51) {
            transportFactory = new C3787fU();
            c2688aH1.setTransportFactory(transportFactory);
        }
        C5012l40 c5012l40RetrieveParsedDsn = c2688aH1.retrieveParsedDsn();
        String sentryClientName = c2688aH1.getSentryClientName();
        URI uri = c5012l40RetrieveParsedDsn.c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        StringBuilder sbB = C6495s7.b("Sentry sentry_version=7,sentry_client=", sentryClientName, ",sentry_key=");
        sbB.append(c5012l40RetrieveParsedDsn.b);
        String str = c5012l40RetrieveParsedDsn.a;
        sbB.append((str == null || str.length() <= 0) ? "" : ",sentry_secret=".concat(str));
        String string2 = sbB.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        this.c = transportFactory.b(c2688aH1, new C7705xs1(string, map));
        if (c2688aH1.getLogs().a) {
            this.e = c2688aH1.getLogs().b.a(c2688aH1, this);
        } else {
            this.e = h.d;
        }
        if (c2688aH1.getMetrics().a) {
            this.f = c2688aH1.getMetrics().b.a(c2688aH1, this);
        } else {
            this.f = io.sentry.metrics.e.d;
        }
    }

    @Nullable
    public static ArrayList q(@NotNull C0841Do0 c0841Do0) {
        ArrayList arrayList = new ArrayList(c0841Do0.b);
        C2234Vk c2234Vk = c0841Do0.d;
        if (c2234Vk != null) {
            arrayList.add(c2234Vk);
        }
        C2234Vk c2234Vk2 = c0841Do0.e;
        if (c2234Vk2 != null) {
            arrayList.add(c2234Vk2);
        }
        C2234Vk c2234Vk3 = c0841Do0.f;
        if (c2234Vk3 != null) {
            arrayList.add(c2234Vk3);
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1327Ju0
    public final void a(boolean z) {
        long shutdownTimeoutMillis;
        C2688aH1 c2688aH1 = this.b;
        c2688aH1.getLogger().a(NG1.INFO, "Closing SentryClient.", new Object[0]);
        if (z) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = c2688aH1.getShutdownTimeoutMillis();
            } catch (IOException e) {
                c2688aH1.getLogger().d(NG1.WARNING, "Failed to close the connection to the Sentry Server.", e);
            }
        }
        d(shutdownTimeoutMillis);
        this.e.a(z);
        this.f.a(z);
        this.c.a(z);
        for (N80 n80 : c2688aH1.getEventProcessors()) {
            if (n80 instanceof Closeable) {
                try {
                    ((Closeable) n80).close();
                } catch (IOException e2) {
                    c2688aH1.getLogger().a(NG1.WARNING, "Failed to close the event processor {}.", n80, e2);
                }
            }
        }
        this.a = false;
    }

    @Override // defpackage.InterfaceC1327Ju0
    public final void b(@Nullable PG1 pg1, @Nullable InterfaceC1015Fu0 interfaceC1015Fu0) {
        PG1 pg1T = t(pg1, interfaceC1015Fu0.N());
        if (pg1T == null) {
            return;
        }
        C2688aH1 c2688aH1 = this.b;
        PG1 pg1T2 = t(pg1T, c2688aH1.getEventProcessors());
        if (pg1T2 == null) {
            return;
        }
        c2688aH1.getLogs().getClass();
        this.e.b(pg1T2);
    }

    @Override // defpackage.InterfaceC1327Ju0
    @NotNull
    public final u c(@NotNull C2912bH1 c2912bH1, @Nullable InterfaceC1015Fu0 interfaceC1015Fu0, @Nullable C0841Do0 c0841Do0) {
        p.b(c2912bH1, "SessionReplay is required.");
        if (w(c2912bH1, c0841Do0)) {
            if (c2912bH1.h == null) {
                c2912bH1.h = interfaceC1015Fu0.d();
            }
            if (c2912bH1.m == null) {
                c2912bH1.m = interfaceC1015Fu0.getUser();
            }
            if (c2912bH1.i == null) {
                c2912bH1.i = new HashMap(new HashMap(interfaceC1015Fu0.getTags()));
            } else {
                for (Map.Entry<String, String> entry : interfaceC1015Fu0.getTags().entrySet()) {
                    if (!c2912bH1.i.containsKey(entry.getKey())) {
                        c2912bH1.i.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            C4521c c4521c = c2912bH1.e;
            for (Map.Entry<String, Object> entry2 : new C4521c(interfaceC1015Fu0.H()).d.entrySet()) {
                if (!c4521c.a(entry2.getKey())) {
                    c4521c.l(entry2.getKey(), entry2.getValue());
                }
            }
            InterfaceC2347Wu0 interfaceC2347Wu0E = interfaceC1015Fu0.e();
            if (c4521c.j() == null) {
                if (interfaceC2347Wu0E == null) {
                    c4521c.x(C4804k42.b(interfaceC1015Fu0.y()));
                } else {
                    c4521c.x(interfaceC2347Wu0E.w());
                }
            }
        }
        C2688aH1 c2688aH1 = this.b;
        c2688aH1.getLogger().a(NG1.DEBUG, "Capturing session replay: %s", c2912bH1.d);
        u uVar = u.e;
        u uVar2 = c2912bH1.d;
        if (uVar2 != null) {
            uVar = uVar2;
        }
        for (N80 n80 : c2688aH1.getEventProcessors()) {
            try {
                c2912bH1 = n80.c(c2912bH1, c0841Do0);
            } catch (Throwable th) {
                c2688aH1.getLogger().c(NG1.ERROR, th, "An exception occurred while processing replay event by processor: %s", n80.getClass().getName());
            }
            if (c2912bH1 == null) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Replay event was dropped by a processor: %s", n80.getClass().getName());
                c2688aH1.getClientReportRecorder().a(io.sentry.clientreport.e.EVENT_PROCESSOR, EnumC5932pS.Replay);
                break;
            }
        }
        if (c2912bH1 != null) {
            c2688aH1.getBeforeSendReplay();
        }
        if (c2912bH1 == null) {
            return u.e;
        }
        try {
            C3537eG1 c3537eG1P = p(c2912bH1, c0841Do0.g, r(interfaceC1015Fu0, c0841Do0, c2912bH1, null), io.sentry.hints.c.class.isInstance(c0841Do0.b("sentry:typeCheckHint")));
            c0841Do0.a();
            this.c.I0(c3537eG1P, c0841Do0);
            return uVar;
        } catch (IOException e) {
            c2688aH1.getLogger().c(NG1.WARNING, e, "Capturing event %s failed.", uVar);
            return u.e;
        }
    }

    @Override // defpackage.InterfaceC1327Ju0
    public final void d(long j) {
        this.e.d(j);
        this.f.d(j);
        this.c.d(j);
    }

    @Override // defpackage.InterfaceC1327Ju0
    @NotNull
    public final u e(@NotNull B b, @Nullable H02 h02, @Nullable InterfaceC1015Fu0 interfaceC1015Fu0, @Nullable C0841Do0 c0841Do0, @Nullable C1136Hi1 c1136Hi1) {
        Throwable th;
        if (c0841Do0 == null) {
            c0841Do0 = new C0841Do0();
        }
        if (w(b, c0841Do0)) {
            c0841Do0.b.addAll(interfaceC1015Fu0.F());
        }
        C2688aH1 c2688aH1 = this.b;
        c2688aH1.getLogger().a(NG1.DEBUG, "Capturing transaction: %s", b.d);
        List<C7018ud0> ignoredTransactions = c2688aH1.getIgnoredTransactions();
        String str = b.t;
        if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<C7018ud0> it = ignoredTransactions.iterator();
            while (it.hasNext()) {
                if (it.next().a.equalsIgnoreCase(str)) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "Transaction was dropped as transaction name %s is ignored", b.t);
                    g clientReportRecorder = c2688aH1.getClientReportRecorder();
                    io.sentry.clientreport.e eVar = io.sentry.clientreport.e.EVENT_PROCESSOR;
                    clientReportRecorder.a(eVar, EnumC5932pS.Transaction);
                    c2688aH1.getClientReportRecorder().e(eVar, EnumC5932pS.Span, b.w.size() + 1);
                    return u.e;
                }
            }
            Iterator<C7018ud0> it2 = ignoredTransactions.iterator();
            while (it2.hasNext()) {
                Pattern pattern = it2.next().b;
                if (pattern == null ? false : pattern.matcher(str).matches()) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "Transaction was dropped as transaction name %s is ignored", b.t);
                    g clientReportRecorder2 = c2688aH1.getClientReportRecorder();
                    io.sentry.clientreport.e eVar2 = io.sentry.clientreport.e.EVENT_PROCESSOR;
                    clientReportRecorder2.a(eVar2, EnumC5932pS.Transaction);
                    c2688aH1.getClientReportRecorder().e(eVar2, EnumC5932pS.Span, b.w.size() + 1);
                    return u.e;
                }
            }
        }
        u uVar = u.e;
        u uVar2 = b.d;
        if (uVar2 == null) {
            uVar2 = uVar;
        }
        if (w(b, c0841Do0)) {
            j(b, interfaceC1015Fu0);
            b = u(b, c0841Do0, interfaceC1015Fu0.N());
            if (b == null) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (b != null) {
            b = u(b, c0841Do0, c2688aH1.getEventProcessors());
        }
        B b2 = b;
        if (b2 == null) {
            c2688aH1.getLogger().a(NG1.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return uVar;
        }
        ArrayList arrayList = b2.w;
        int size = arrayList.size();
        c2688aH1.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i = size - size2;
            c2688aH1.getLogger().a(NG1.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
            c2688aH1.getClientReportRecorder().e(io.sentry.clientreport.e.BEFORE_SEND, EnumC5932pS.Span, i);
        }
        try {
            ArrayList arrayListQ = q(c0841Do0);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayListQ.iterator();
            while (it3.hasNext()) {
                try {
                    try {
                        ((C2234Vk) it3.next()).getClass();
                    } catch (io.sentry.exception.b e) {
                        e = e;
                        th = e;
                        c2688aH1.getLogger().c(NG1.WARNING, th, "Capturing transaction %s failed.", uVar2);
                        return u.e;
                    } catch (IOException e2) {
                        e = e2;
                        th = e;
                        c2688aH1.getLogger().c(NG1.WARNING, th, "Capturing transaction %s failed.", uVar2);
                        return u.e;
                    }
                } catch (io.sentry.exception.b e3) {
                    e = e3;
                } catch (IOException e4) {
                    e = e4;
                }
            }
            try {
                C3537eG1 c3537eG1L = l(b2, arrayList2, null, h02, c1136Hi1);
                c0841Do0.a();
                return c3537eG1L != null ? v(c3537eG1L, c0841Do0) : uVar2;
            } catch (io.sentry.exception.b e5) {
                e = e5;
                th = e;
                c2688aH1.getLogger().c(NG1.WARNING, th, "Capturing transaction %s failed.", uVar2);
                return u.e;
            } catch (IOException e6) {
                e = e6;
                th = e;
                c2688aH1.getLogger().c(NG1.WARNING, th, "Capturing transaction %s failed.", uVar2);
                return u.e;
            }
        } catch (io.sentry.exception.b | IOException e7) {
            e = e7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0249  */
    /* JADX WARN: Code duplicated, block: B:123:0x024f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0251  */
    /* JADX WARN: Code duplicated, block: B:125:0x025b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0268  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:179:0x032d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0338  */
    /* JADX WARN: Code duplicated, block: B:212:0x0398  */
    /* JADX WARN: Code duplicated, block: B:213:0x03a7  */
    @Override // defpackage.InterfaceC1327Ju0
    @NotNull
    public final u f(@NotNull EG1 eg1, @Nullable InterfaceC1015Fu0 interfaceC1015Fu0, @Nullable C0841Do0 c0841Do0) {
        CI1 ci1L;
        CI1 ci1;
        EG1 eg2;
        boolean z;
        String str;
        InterfaceC4302hv0 interfaceC4302hv0R;
        Object objB;
        u uVar;
        C4525g c4525gG;
        if (c0841Do0 == null) {
            c0841Do0 = new C0841Do0();
        }
        if (w(eg1, c0841Do0) && interfaceC1015Fu0 != null) {
            c0841Do0.b.addAll(interfaceC1015Fu0.F());
        }
        C2688aH1 c2688aH1 = this.b;
        ILogger logger = c2688aH1.getLogger();
        NG1 ng1 = NG1.DEBUG;
        logger.a(ng1, "Capturing event: %s", eg1.d);
        Throwable thA = eg1.a();
        if (thA != null && c2688aH1.getIgnoredExceptionsForType().contains(thA.getClass())) {
            c2688aH1.getLogger().a(ng1, "Event was dropped as the exception %s is ignored", thA.getClass());
            c2688aH1.getClientReportRecorder().a(io.sentry.clientreport.e.EVENT_PROCESSOR, EnumC5932pS.Error);
            return u.e;
        }
        List<C7018ud0> ignoredErrors = c2688aH1.getIgnoredErrors();
        if (ignoredErrors != null && !ignoredErrors.isEmpty()) {
            HashSet<String> hashSet = new HashSet();
            m mVar = eg1.u;
            if (mVar != null) {
                String str2 = mVar.e;
                if (str2 != null) {
                    hashSet.add(str2);
                }
                String str3 = mVar.d;
                if (str3 != null) {
                    hashSet.add(str3);
                }
            }
            Throwable thA2 = eg1.a();
            if (thA2 != null) {
                hashSet.add(thA2.toString());
            }
            Iterator<C7018ud0> it = ignoredErrors.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(it.next().a)) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", eg1.u);
                    c2688aH1.getClientReportRecorder().a(io.sentry.clientreport.e.EVENT_PROCESSOR, EnumC5932pS.Error);
                    return u.e;
                }
            }
            for (C7018ud0 c7018ud0 : ignoredErrors) {
                for (String str4 : hashSet) {
                    Pattern pattern = c7018ud0.b;
                    if (pattern == null ? false : pattern.matcher(str4).matches()) {
                        c2688aH1.getLogger().a(NG1.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", eg1.u);
                        c2688aH1.getClientReportRecorder().a(io.sentry.clientreport.e.EVENT_PROCESSOR, EnumC5932pS.Error);
                        return u.e;
                    }
                }
            }
        }
        if (w(eg1, c0841Do0)) {
            if (interfaceC1015Fu0 != null) {
                j(eg1, interfaceC1015Fu0);
                if (eg1.z == null) {
                    eg1.z = interfaceC1015Fu0.O();
                }
                if (eg1.A == null) {
                    eg1.g(interfaceC1015Fu0.K());
                }
                if (interfaceC1015Fu0.getLevel() != null) {
                    eg1.y = interfaceC1015Fu0.getLevel();
                }
                InterfaceC2347Wu0 interfaceC2347Wu0E = interfaceC1015Fu0.e();
                C4521c c4521c = eg1.e;
                if (c4521c.j() == null) {
                    if (interfaceC2347Wu0E == null) {
                        c4521c.x(C4804k42.b(interfaceC1015Fu0.y()));
                    } else {
                        c4521c.x(interfaceC2347Wu0E.w());
                    }
                }
                if (c4521c.f() == null && (c4525gG = interfaceC1015Fu0.g()) != null) {
                    c4521c.r(c4525gG);
                }
                eg1 = s(eg1, c0841Do0, interfaceC1015Fu0.N());
            }
            if (eg1 == null) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Event was dropped by applyScope", new Object[0]);
                return u.e;
            }
        }
        EG1 eg1S = s(eg1, c0841Do0, c2688aH1.getEventProcessors());
        if (eg1S != null) {
            C2688aH1.c beforeSend = c2688aH1.getBeforeSend();
            if (beforeSend != null) {
                try {
                    eg1S = ((C6634sm0) beforeSend).b(eg1S, c0841Do0);
                } catch (Throwable th) {
                    c2688aH1.getLogger().d(NG1.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th);
                    eg1S = null;
                }
            }
            if (eg1S == null) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                c2688aH1.getClientReportRecorder().a(io.sentry.clientreport.e.BEFORE_SEND, EnumC5932pS.Error);
            }
        }
        if (eg1S != null) {
            try {
                if (c2688aH1.isEnableEventSizeLimiting() && !io.sentry.util.e.a(eg1S, c2688aH1)) {
                    c2688aH1.getLogger().a(NG1.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", eg1S.d, Long.valueOf(C2688aH1.MAX_EVENT_SIZE_BYTES));
                    c2688aH1.getOnOversizedEvent();
                    List<C0702Bu> list = eg1S.q;
                    if (list != null && !list.isEmpty()) {
                        eg1S.q = null;
                        c2688aH1.getLogger().a(NG1.DEBUG, "Removed breadcrumbs to reduce size of event %s", eg1S.d);
                    }
                    if (!io.sentry.util.e.a(eg1S, c2688aH1)) {
                        io.sentry.util.e.b(eg1S, c2688aH1);
                        if (!io.sentry.util.e.a(eg1S, c2688aH1)) {
                            c2688aH1.getLogger().a(NG1.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", eg1S.d);
                        }
                    }
                }
            } catch (Throwable th2) {
                c2688aH1.getLogger().d(NG1.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th2);
            }
        }
        if (eg1S == null) {
            return u.e;
        }
        CI1 ci1L2 = interfaceC1015Fu0 != null ? interfaceC1015Fu0.L(new C1039Gc0(7)) : null;
        if (ci1L2 == null) {
            if (!io.sentry.util.g.d(c0841Do0)) {
                ci1L = null;
            } else if (interfaceC1015Fu0 != null) {
                ci1L = interfaceC1015Fu0.L(new XF1(this, eg1S, c0841Do0));
            } else {
                c2688aH1.getLogger().a(NG1.INFO, "Scope is null on client.captureEvent", new Object[0]);
                ci1L = null;
            }
            ci1 = ci1L;
        } else if (ci1L2.k != CI1.b.Ok) {
            ci1 = null;
        } else {
            if (!io.sentry.util.g.d(c0841Do0)) {
                ci1L = null;
            } else if (interfaceC1015Fu0 != null) {
                ci1L = interfaceC1015Fu0.L(new XF1(this, eg1S, c0841Do0));
            } else {
                c2688aH1.getLogger().a(NG1.INFO, "Scope is null on client.captureEvent", new Object[0]);
                ci1L = null;
            }
            ci1 = ci1L;
        }
        t tVarA = c2688aH1.getSampleRate() == null ? null : v.a();
        if (c2688aH1.getSampleRate() == null || tVarA == null || c2688aH1.getSampleRate().doubleValue() >= tVarA.c()) {
            eg2 = eg1S;
        } else {
            c2688aH1.getLogger().a(NG1.DEBUG, "Event %s was dropped due to sampling decision.", eg1S.d);
            c2688aH1.getClientReportRecorder().a(io.sentry.clientreport.e.SAMPLE_RATE, EnumC5932pS.Error);
            eg2 = null;
        }
        if (ci1 != null) {
            if (ci1L2 != null) {
                CI1.b bVar = ci1.k;
                CI1.b bVar2 = CI1.b.Crashed;
                z = (bVar == bVar2 && ci1L2.k != bVar2) || (ci1.g.get() > 0 && ci1L2.g.get() <= 0);
            }
        }
        if (eg2 == null && !z) {
            c2688aH1.getLogger().a(NG1.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return u.e;
        }
        u uVarV = u.e;
        if (eg2 != null && (uVar = eg2.d) != null) {
            uVarV = uVar;
        }
        boolean zIsInstance = io.sentry.hints.c.class.isInstance(c0841Do0.b("sentry:typeCheckHint"));
        boolean z2 = io.sentry.hints.e.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) && !io.sentry.hints.b.class.isInstance(c0841Do0.b("sentry:typeCheckHint"));
        if (eg2 != null && !zIsInstance && !z2) {
            if (eg2.f()) {
                c2688aH1.getReplayController().f(Boolean.valueOf(eg2.e() != null));
            } else if (eg2.e() != null) {
                c2688aH1.getReplayController().f(Boolean.valueOf(eg2.e() != null));
            }
        }
        if (eg2 != null) {
            try {
                str = eg2.z;
            } catch (io.sentry.exception.b | IOException e) {
                e = e;
                c2688aH1.getLogger().c(NG1.WARNING, e, "Capturing event %s failed.", uVarV);
                uVarV = u.e;
                if (interfaceC1015Fu0 != null) {
                    objB = c0841Do0.b("sentry:typeCheckHint");
                    if (objB instanceof f) {
                        ((f) objB).h(interfaceC4302hv0R.s());
                        interfaceC4302hv0R.f(EnumC4869kO1.ABORTED, false, c0841Do0);
                    } else {
                        interfaceC4302hv0R.f(EnumC4869kO1.ABORTED, false, null);
                    }
                }
                return uVarV;
            }
        } else {
            str = null;
        }
        try {
            C3537eG1 c3537eG1L = l(eg2, eg2 != null ? q(c0841Do0) : null, ci1, r(interfaceC1015Fu0, c0841Do0, eg2, str), null);
            c0841Do0.a();
            if (c3537eG1L != null) {
                uVarV = v(c3537eG1L, c0841Do0);
            }
        } catch (io.sentry.exception.b e2) {
            e = e2;
            c2688aH1.getLogger().c(NG1.WARNING, e, "Capturing event %s failed.", uVarV);
            uVarV = u.e;
        } catch (IOException e3) {
            e = e3;
            c2688aH1.getLogger().c(NG1.WARNING, e, "Capturing event %s failed.", uVarV);
            uVarV = u.e;
        }
        if (interfaceC1015Fu0 != null && (interfaceC4302hv0R = interfaceC1015Fu0.r()) != null && r.class.isInstance(c0841Do0.b("sentry:typeCheckHint"))) {
            objB = c0841Do0.b("sentry:typeCheckHint");
            if (objB instanceof f) {
                ((f) objB).h(interfaceC4302hv0R.s());
                interfaceC4302hv0R.f(EnumC4869kO1.ABORTED, false, c0841Do0);
            } else {
                interfaceC4302hv0R.f(EnumC4869kO1.ABORTED, false, null);
            }
        }
        return uVarV;
    }

    @Override // defpackage.InterfaceC1327Ju0
    public final void g(@NotNull CI1 ci1, @Nullable C0841Do0 c0841Do0) {
        p.b(ci1, "Session is required.");
        C2688aH1 c2688aH1 = this.b;
        String str = ci1.q;
        if (str == null || str.isEmpty()) {
            c2688aH1.getLogger().a(NG1.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            InterfaceC1560Mu0 serializer = c2688aH1.getSerializer();
            io.sentry.protocol.r sdkVersion = c2688aH1.getSdkVersion();
            p.b(serializer, "Serializer is required.");
            k(new C3537eG1(null, sdkVersion, CG1.d(serializer, ci1)), c0841Do0);
        } catch (IOException e) {
            c2688aH1.getLogger().d(NG1.ERROR, "Failed to capture session.", e);
        }
    }

    @Override // defpackage.InterfaceC1327Ju0
    @Nullable
    public final l h() {
        return this.c.h();
    }

    @Override // defpackage.InterfaceC1327Ju0
    public final boolean i() {
        return this.c.i();
    }

    @Override // defpackage.InterfaceC1327Ju0
    public final boolean isEnabled() {
        return this.a;
    }

    @NotNull
    public final void j(@NotNull VF1 vf1, @Nullable InterfaceC1015Fu0 interfaceC1015Fu0) {
        if (interfaceC1015Fu0 != null) {
            if (vf1.h == null) {
                vf1.h = interfaceC1015Fu0.d();
            }
            if (vf1.m == null) {
                vf1.m = interfaceC1015Fu0.getUser();
            }
            if (vf1.i == null) {
                vf1.i = new HashMap(new HashMap(interfaceC1015Fu0.getTags()));
            } else {
                for (Map.Entry<String, String> entry : interfaceC1015Fu0.getTags().entrySet()) {
                    if (!vf1.i.containsKey(entry.getKey())) {
                        vf1.i.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (vf1.q == null) {
                vf1.q = new ArrayList(new ArrayList(interfaceC1015Fu0.x()));
            } else {
                Queue<C0702Bu> queueX = interfaceC1015Fu0.x();
                List<C0702Bu> list = vf1.q;
                if (list != null && !queueX.isEmpty()) {
                    list.addAll(queueX);
                    Collections.sort(list, this.d);
                }
            }
            if (vf1.s == null) {
                vf1.s = new HashMap(new HashMap(interfaceC1015Fu0.getExtras()));
            } else {
                for (Map.Entry<String, Object> entry2 : interfaceC1015Fu0.getExtras().entrySet()) {
                    if (!vf1.s.containsKey(entry2.getKey())) {
                        vf1.s.put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C4521c c4521c = vf1.e;
            for (Map.Entry<String, Object> entry3 : new C4521c(interfaceC1015Fu0.H()).d.entrySet()) {
                if (!c4521c.a(entry3.getKey())) {
                    c4521c.l(entry3.getKey(), entry3.getValue());
                }
            }
        }
    }

    @Override // defpackage.InterfaceC1327Ju0
    @NotNull
    public final u k(@NotNull C3537eG1 c3537eG1, @Nullable C0841Do0 c0841Do0) {
        try {
            c0841Do0.a();
            return v(c3537eG1, c0841Do0);
        } catch (IOException e) {
            this.b.getLogger().d(NG1.ERROR, "Failed to capture envelope.", e);
            return u.e;
        }
    }

    @Nullable
    public final C3537eG1 l(@Nullable VF1 vf1, @Nullable ArrayList arrayList, @Nullable CI1 ci1, @Nullable H02 h02, @Nullable final C1136Hi1 c1136Hi1) {
        u uVar;
        ArrayList arrayList2 = new ArrayList();
        C2688aH1 c2688aH1 = this.b;
        if (vf1 != null) {
            InterfaceC1560Mu0 serializer = c2688aH1.getSerializer();
            Charset charset = CG1.d;
            p.b(serializer, "ISerializer is required.");
            final CG1.a aVar = new CG1.a(new CallableC2950bU0(1, serializer, vf1));
            arrayList2.add(new CG1(new DG1(MG1.resolve(vf1), new Callable() { // from class: tG1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Integer.valueOf(aVar.a().length);
                }
            }, "application/json", null, null), new ME0(aVar, 1)));
            uVar = vf1.d;
        } else {
            uVar = null;
        }
        if (ci1 != null) {
            arrayList2.add(CG1.d(c2688aH1.getSerializer(), ci1));
        }
        if (c1136Hi1 != null) {
            final long maxTraceFileSize = c2688aH1.getMaxTraceFileSize();
            final InterfaceC1560Mu0 serializer2 = c2688aH1.getSerializer();
            Charset charset2 = CG1.d;
            final File file = c1136Hi1.d;
            final CG1.a aVar2 = new CG1.a(new Callable() { // from class: pG1
                @Override // java.util.concurrent.Callable
                public final Object call() throws io.sentry.exception.b {
                    InterfaceC1560Mu0 interfaceC1560Mu0 = serializer2;
                    File file2 = file;
                    if (!file2.exists()) {
                        throw new io.sentry.exception.b(C1039Gc0.d("Dropping profiling trace data, because the file '", file2.getName(), "' doesn't exists"));
                    }
                    try {
                        String str = new String(a.a(io.sentry.util.f.b(file2.getPath(), maxTraceFileSize)), "US-ASCII");
                        if (str.isEmpty()) {
                            throw new io.sentry.exception.b("Profiling trace file is empty");
                        }
                        C1136Hi1 c1136Hi2 = c1136Hi1;
                        c1136Hi2.F = str;
                        try {
                            c1136Hi2.p = c1136Hi2.e.call();
                        } catch (Throwable unused) {
                        }
                        try {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, CG1.d));
                                    try {
                                        interfaceC1560Mu0.b(c1136Hi2, bufferedWriter);
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        bufferedWriter.close();
                                        byteArrayOutputStream.close();
                                        file2.delete();
                                        return byteArray;
                                    } catch (Throwable th) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } catch (IOException e) {
                                throw new io.sentry.exception.b("Failed to serialize profiling trace data\n" + e.getMessage());
                            }
                        } catch (Throwable th5) {
                            file2.delete();
                            throw th5;
                        }
                    } catch (UnsupportedEncodingException e2) {
                        throw new AssertionError(e2);
                    }
                }
            });
            arrayList2.add(new CG1(new DG1(MG1.Profile, new Callable() { // from class: qG1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Integer.valueOf(aVar2.a().length);
                }
            }, "application-json", file.getName(), null), (Callable<byte[]>) new Callable() { // from class: sG1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return aVar2.a();
                }
            }));
            if (uVar == null) {
                uVar = new u(c1136Hi1.A);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final C2234Vk c2234Vk = (C2234Vk) it.next();
                final InterfaceC1560Mu0 serializer3 = c2688aH1.getSerializer();
                final ILogger logger = c2688aH1.getLogger();
                final long maxAttachmentSize = c2688aH1.getMaxAttachmentSize();
                Charset charset3 = CG1.d;
                final CG1.a aVar3 = new CG1.a(new Callable() { // from class: mG1
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws io.sentry.exception.b {
                        byte[] bArr;
                        byte[] byteArray;
                        InterfaceC1560Mu0 interfaceC1560Mu0 = serializer3;
                        C2234Vk c2234Vk2 = c2234Vk;
                        byte[] bArr2 = c2234Vk2.a;
                        long j = maxAttachmentSize;
                        String str = c2234Vk2.d;
                        if (bArr2 != null) {
                            CG1.a(bArr2.length, j, str);
                            return bArr2;
                        }
                        G g = c2234Vk2.b;
                        if (g != null) {
                            Charset charset4 = k.a;
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, k.a));
                                    try {
                                        interfaceC1560Mu0.b(g, bufferedWriter);
                                        byteArray = byteArrayOutputStream.toByteArray();
                                        bufferedWriter.close();
                                        byteArrayOutputStream.close();
                                    } catch (Throwable th) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } catch (Throwable th5) {
                                logger.d(NG1.ERROR, "Could not serialize serializable", th5);
                                byteArray = null;
                            }
                            if (byteArray != null) {
                                CG1.a(byteArray.length, j, str);
                                return byteArray;
                            }
                        } else {
                            CallableC7578xG1 callableC7578xG1 = c2234Vk2.c;
                            if (callableC7578xG1 != null && (bArr = (byte[]) callableC7578xG1.call()) != null) {
                                CG1.a(bArr.length, j, str);
                                return bArr;
                            }
                        }
                        throw new io.sentry.exception.b(C1039Gc0.d("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                    }
                });
                arrayList2.add(new CG1(new DG1(MG1.Attachment, new Callable() { // from class: nG1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Integer.valueOf(aVar3.a().length);
                    }
                }, c2234Vk.e, c2234Vk.d, c2234Vk.f), (Callable<byte[]>) new Callable() { // from class: oG1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return aVar3.a();
                    }
                }));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new C3537eG1(new C3747fG1(uVar, c2688aH1.getSdkVersion(), h02), arrayList2);
    }

    @Override // defpackage.InterfaceC1327Ju0
    @NotNull
    public final u m(@NotNull C1445Lh1 c1445Lh1) {
        p.b(c1445Lh1, "profileChunk is required.");
        C2688aH1 c2688aH1 = this.b;
        c2688aH1.getLogger().a(NG1.DEBUG, "Capturing profile chunk: %s", c1445Lh1.g);
        u uVar = c1445Lh1.g;
        C4522d c4522dA = C4522d.a(c1445Lh1.d, c2688aH1);
        if (c4522dA != null) {
            c1445Lh1.d = c4522dA;
        }
        try {
            return v(new C3537eG1(new C3747fG1(uVar, c2688aH1.getSdkVersion(), null), Collections.singletonList(CG1.c(c1445Lh1, c2688aH1.getSerializer(), c2688aH1.getProfilerConverter()))), null);
        } catch (io.sentry.exception.b | IOException e) {
            c2688aH1.getLogger().c(NG1.WARNING, e, "Capturing profile chunk %s failed.", uVar);
            return u.e;
        }
    }

    @NotNull
    public final C3537eG1 n(@NotNull final RG1 rg1) {
        ArrayList arrayList = new ArrayList();
        C2688aH1 c2688aH1 = this.b;
        final InterfaceC1560Mu0 serializer = c2688aH1.getSerializer();
        Charset charset = CG1.d;
        p.b(serializer, "ISerializer is required.");
        final CG1.a aVar = new CG1.a(new Callable() { // from class: jG1
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                InterfaceC1560Mu0 interfaceC1560Mu0 = serializer;
                RG1 rg2 = rg1;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, CG1.d));
                    try {
                        interfaceC1560Mu0.b(rg2, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        });
        arrayList.add(new CG1(new DG1(MG1.Log, (Callable<Integer>) new Callable() { // from class: kG1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(rg1.d.size())), (Callable<byte[]>) new Callable() { // from class: lG1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        }));
        return new C3537eG1(new C3747fG1(null, c2688aH1.getSdkVersion(), null), arrayList);
    }

    @NotNull
    public final C3537eG1 o(@NotNull VG1 vg1) {
        ArrayList arrayList = new ArrayList();
        C2688aH1 c2688aH1 = this.b;
        InterfaceC1560Mu0 serializer = c2688aH1.getSerializer();
        Charset charset = CG1.d;
        p.b(serializer, "ISerializer is required.");
        final CG1.a aVar = new CG1.a(new CallableC7578xG1(0, serializer, vg1));
        arrayList.add(new CG1(new DG1(MG1.TraceMetric, new CallableC4393iM(aVar, 1), "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(vg1.d.size())), (Callable<byte[]>) new Callable() { // from class: yG1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        }));
        return new C3537eG1(new C3747fG1(null, c2688aH1.getSdkVersion(), null), arrayList);
    }

    @NotNull
    public final C3537eG1 p(@NotNull final C2912bH1 c2912bH1, @Nullable final C2257Vr1 c2257Vr1, @Nullable H02 h02, final boolean z) {
        ArrayList arrayList = new ArrayList();
        C2688aH1 c2688aH1 = this.b;
        final InterfaceC1560Mu0 serializer = c2688aH1.getSerializer();
        final ILogger logger = c2688aH1.getLogger();
        Charset charset = CG1.d;
        final File file = c2912bH1.t;
        final CG1.a aVar = new CG1.a(new Callable() { // from class: gG1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC1560Mu0 interfaceC1560Mu0 = serializer;
                C2912bH1 c2912bH2 = c2912bH1;
                File file2 = file;
                ILogger iLogger = logger;
                boolean z2 = z;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, CG1.d));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            interfaceC1560Mu0.b(c2912bH2, bufferedWriter);
                            linkedHashMap.put(MG1.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            C2257Vr1 c2257Vr2 = c2257Vr1;
                            if (c2257Vr2 != null) {
                                interfaceC1560Mu0.b(c2257Vr2, bufferedWriter);
                                linkedHashMap.put(MG1.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrB = io.sentry.util.f.b(file2.getPath(), 10485760L);
                                if (bArrB.length > 0) {
                                    linkedHashMap.put(MG1.ReplayVideo.getItemType(), bArrB);
                                }
                            }
                            byte[] bArrJ = CG1.j(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 != null) {
                                if (z2) {
                                    io.sentry.util.f.a(file2.getParentFile());
                                    return bArrJ;
                                }
                                file2.delete();
                            }
                            return bArrJ;
                        } catch (Throwable th) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        iLogger.d(NG1.ERROR, "Could not serialize replay recording", th5);
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z2) {
                                io.sentry.util.f.a(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new CG1(new DG1(MG1.ReplayVideo, new Callable() { // from class: rG1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, null, null, null), (Callable<byte[]>) new Callable() { // from class: wG1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        }));
        return new C3537eG1(new C3747fG1(c2912bH1.d, c2688aH1.getSessionReplay().l, h02), arrayList);
    }

    @Nullable
    public final H02 r(@Nullable InterfaceC1015Fu0 interfaceC1015Fu0, @NotNull C0841Do0 c0841Do0, @Nullable VF1 vf1, @Nullable String str) {
        boolean zIsInstance = io.sentry.hints.c.class.isInstance(c0841Do0.b("sentry:typeCheckHint"));
        C2688aH1 c2688aH1 = this.b;
        if (zIsInstance) {
            if (vf1 != null) {
                C2171Up c2171Up = new C2171Up(c2688aH1.getLogger());
                C4521c c4521c = vf1.e;
                C3561eO1 c3561eO1J = c4521c.j();
                c2171Up.d("sentry-trace_id", c3561eO1J != null ? c3561eO1J.d.toString() : null);
                c2171Up.d("sentry-public_key", c2688aH1.retrieveParsedDsn().b);
                c2171Up.d("sentry-release", vf1.j);
                c2171Up.d("sentry-environment", vf1.k);
                c2171Up.d("sentry-transaction", str);
                if (c2171Up.f) {
                    c2171Up.c = null;
                }
                c2171Up.d("sentry-sampled", null);
                if (c2171Up.f) {
                    c2171Up.d = null;
                }
                Object objC = c4521c.c("replay_id");
                if (objC != null && !objC.toString().equals(u.e.toString())) {
                    c2171Up.d("sentry-replay_id", objC.toString());
                    c4521c.n("replay_id");
                }
                c2171Up.f = false;
                return c2171Up.f();
            }
        } else if (interfaceC1015Fu0 != null) {
            InterfaceC4302hv0 interfaceC4302hv0R = interfaceC1015Fu0.r();
            return interfaceC4302hv0R != null ? interfaceC4302hv0R.c() : interfaceC1015Fu0.M(new z(interfaceC1015Fu0, c2688aH1)).c.f();
        }
        return null;
    }

    @Nullable
    public final EG1 s(@NotNull EG1 eg1, @NotNull C0841Do0 c0841Do0, @NotNull List<N80> list) {
        C2688aH1 c2688aH1 = this.b;
        for (N80 n80 : list) {
            try {
                boolean z = n80 instanceof InterfaceC1155Hp;
                boolean zIsInstance = io.sentry.hints.c.class.isInstance(c0841Do0.b("sentry:typeCheckHint"));
                if (zIsInstance && z) {
                    ((C) n80).f(eg1, c0841Do0);
                } else if (!zIsInstance && !z) {
                    eg1 = n80.f(eg1, c0841Do0);
                }
            } catch (Throwable th) {
                c2688aH1.getLogger().c(NG1.ERROR, th, "An exception occurred while processing event by processor: %s", n80.getClass().getName());
            }
            if (eg1 == null) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Event was dropped by a processor: %s", n80.getClass().getName());
                c2688aH1.getClientReportRecorder().a(io.sentry.clientreport.e.EVENT_PROCESSOR, EnumC5932pS.Error);
                break;
            }
        }
        return eg1;
    }

    @Nullable
    public final PG1 t(@NotNull PG1 pg1, @NotNull List<N80> list) {
        C2688aH1 c2688aH1 = this.b;
        for (N80 n80 : list) {
            try {
                pg1 = n80.k(pg1);
            } catch (Throwable th) {
                c2688aH1.getLogger().c(NG1.ERROR, th, "An exception occurred while processing log event by processor: %s", n80.getClass().getName());
            }
            if (pg1 == null) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Log event was dropped by a processor: %s", n80.getClass().getName());
                c2688aH1.getClientReportRecorder().a(io.sentry.clientreport.e.EVENT_PROCESSOR, EnumC5932pS.LogItem);
                break;
            }
        }
        return pg1;
    }

    @Nullable
    public final B u(@NotNull B b, @NotNull C0841Do0 c0841Do0, @NotNull List<N80> list) {
        C2688aH1 c2688aH1 = this.b;
        for (N80 n80 : list) {
            int size = b.w.size();
            try {
                b = n80.g(b, c0841Do0);
            } catch (Throwable th) {
                c2688aH1.getLogger().c(NG1.ERROR, th, "An exception occurred while processing transaction by processor: %s", n80.getClass().getName());
            }
            int size2 = b == null ? 0 : b.w.size();
            if (b == null) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Transaction was dropped by a processor: %s", n80.getClass().getName());
                g clientReportRecorder = c2688aH1.getClientReportRecorder();
                io.sentry.clientreport.e eVar = io.sentry.clientreport.e.EVENT_PROCESSOR;
                clientReportRecorder.a(eVar, EnumC5932pS.Transaction);
                c2688aH1.getClientReportRecorder().e(eVar, EnumC5932pS.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i = size - size2;
                c2688aH1.getLogger().a(NG1.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), n80.getClass().getName());
                c2688aH1.getClientReportRecorder().e(io.sentry.clientreport.e.EVENT_PROCESSOR, EnumC5932pS.Span, i);
            }
        }
        return b;
    }

    @NotNull
    public final u v(@NotNull C3537eG1 c3537eG1, @Nullable C0841Do0 c0841Do0) {
        C2688aH1 c2688aH1 = this.b;
        c2688aH1.getBeforeEnvelopeCallback();
        LG1.d().c(c2688aH1.getLogger());
        e eVar = this.c;
        if (c0841Do0 == null) {
            eVar.getClass();
            eVar.I0(c3537eG1, new C0841Do0());
        } else {
            eVar.I0(c3537eG1, c0841Do0);
        }
        u uVar = c3537eG1.a.d;
        return uVar != null ? uVar : u.e;
    }

    public final boolean w(@NotNull VF1 vf1, @NotNull C0841Do0 c0841Do0) {
        if (io.sentry.util.g.d(c0841Do0)) {
            return true;
        }
        this.b.getLogger().a(NG1.DEBUG, "Event was cached so not applying scope: %s", vf1.d);
        return false;
    }
}

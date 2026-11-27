package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C1589Ne;
import defpackage.C2688aH1;
import defpackage.C3027bp1;
import defpackage.C3080c51;
import defpackage.C3121cH1;
import defpackage.C6621sj;
import defpackage.C6795ta;
import defpackage.EnumC5932pS;
import defpackage.InterfaceC1405Ku0;
import defpackage.InterfaceC2101Tr1;
import defpackage.InterfaceC2179Ur1;
import defpackage.InterfaceC4761js0;
import defpackage.KW1;
import defpackage.LG1;
import defpackage.ML0;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.QX0;
import defpackage.R51;
import defpackage.RunnableC3377dX;
import defpackage.RunnableC3446dq;
import defpackage.SD1;
import defpackage.XO0;
import io.sentry.android.replay.capture.A;
import io.sentry.android.replay.capture.D;
import io.sentry.util.C4527a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0003:\u0002\u0007\b¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "LOB0;", "Ljava/io/Closeable;", "", "LUr1;", "Ljs0$b;", "Lio/sentry/transport/l$b;", R51.PUSH_ADDITIONAL_DATA_KEY, "b", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayIntegration implements OB0, Closeable, InterfaceC2179Ur1, InterfaceC4761js0.b, io.sentry.transport.l.b {
    public static final /* synthetic */ int v = 0;

    @NotNull
    public final Context d;

    @NotNull
    public final io.sentry.transport.c e;

    @NotNull
    public volatile InterfaceC4761js0.a g;
    public C2688aH1 h;

    @Nullable
    public SD1 i;

    @Nullable
    public g j;

    @Nullable
    public io.sentry.android.replay.gestures.a k;

    @NotNull
    public final KW1 l;

    @NotNull
    public final KW1 m;

    @NotNull
    public final KW1 n;

    @NotNull
    public final AtomicBoolean o;

    @NotNull
    public final AtomicBoolean p;

    @Nullable
    public A q;

    @NotNull
    public InterfaceC2101Tr1 r;

    @NotNull
    public final io.sentry.android.replay.util.e s;

    @NotNull
    public final C4527a t;

    @NotNull
    public final p u;

    public static final class a implements io.sentry.hints.c {
        @Override // io.sentry.hints.c
        public final boolean b() {
            return false;
        }
    }

    public static final class b implements ThreadFactory {
        public int d;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(@NotNull Runnable r) {
            Intrinsics.checkNotNullParameter(r, "r");
            StringBuilder sb = new StringBuilder("SentryReplayIntegration-");
            int i = this.d;
            this.d = i + 1;
            sb.append(i);
            Thread thread = new Thread(r, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public static final class c extends ML0 implements Function1<Date, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Date date) {
            Date newTimestamp = date;
            Intrinsics.checkNotNullParameter(newTimestamp, "newTimestamp");
            ReplayIntegration replayIntegration = ReplayIntegration.this;
            A a = replayIntegration.q;
            if (a != null) {
                Integer numValueOf = Integer.valueOf(a.j());
                Intrinsics.checkNotNull(numValueOf);
                a.i(numValueOf.intValue() + 1);
            }
            A a2 = replayIntegration.q;
            if (a2 != null) {
                a2.h(newTimestamp);
            }
            return Unit.a;
        }
    }

    public static final class d extends ML0 implements Function2<k, Long, Unit> {
        public final /* synthetic */ Bitmap d;
        public final /* synthetic */ C3027bp1<String> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Bitmap bitmap, C3027bp1<String> c3027bp1) {
            super(2);
            this.d = bitmap;
            this.e = c3027bp1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(k kVar, Long l) throws IOException {
            k onScreenshotRecorded = kVar;
            long jLongValue = l.longValue();
            Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
            Bitmap bitmap = this.d;
            String str = this.e.d;
            onScreenshotRecorded.getClass();
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            if (onScreenshotRecorded.g() != null && !bitmap.isRecycled()) {
                File fileG = onScreenshotRecorded.g();
                if (fileG != null) {
                    fileG.mkdirs();
                }
                File file = new File(onScreenshotRecorded.g(), jLongValue + ".jpg");
                file.createNewFile();
                synchronized (bitmap) {
                    if (!bitmap.isRecycled()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, onScreenshotRecorded.d.getSessionReplay().f.screenshotQuality, fileOutputStream);
                            fileOutputStream.flush();
                            Unit unit = Unit.a;
                            fileOutputStream.close();
                            onScreenshotRecorded.c(file, jLongValue, str);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C6621sj.b(fileOutputStream, th);
                                throw th2;
                            }
                        }
                    }
                }
            }
            return Unit.a;
        }
    }

    static {
        LG1.d().b("maven:io.sentry:sentry-android-replay", "8.35.0");
    }

    public ReplayIntegration(@NotNull Context context) {
        io.sentry.transport.c dateProvider = io.sentry.transport.c.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.d = context;
        this.e = dateProvider;
        this.g = InterfaceC4761js0.a.UNKNOWN;
        this.l = XO0.b(m.d);
        this.m = XO0.b(o.d);
        this.n = XO0.b(new n(this));
        this.o = new AtomicBoolean(false);
        this.p = new AtomicBoolean(false);
        C3080c51 c3080c51 = C3080c51.a;
        Intrinsics.checkNotNullExpressionValue(c3080c51, "getInstance(...)");
        this.r = c3080c51;
        this.s = new io.sentry.android.replay.util.e();
        this.t = new C4527a();
        p pVar = new p();
        pVar.a = q.INITIAL;
        this.u = pVar;
    }

    public final void A(@NotNull Bitmap bitmap) {
        SD1 sd1;
        SD1 sd2;
        io.sentry.transport.l lVarH;
        io.sentry.transport.l lVarH2;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        C3027bp1 c3027bp1 = new C3027bp1();
        SD1 sd3 = this.i;
        if (sd3 != null) {
            sd3.A(null, new C6795ta(c3027bp1));
        }
        A a2 = this.q;
        if (a2 != null) {
            a2.k(new d(bitmap, c3027bp1));
        }
        if (this.q instanceof D) {
            if (this.g == InterfaceC4761js0.a.DISCONNECTED || !(((sd1 = this.i) == null || (lVarH2 = sd1.h()) == null || !lVarH2.f(EnumC5932pS.All)) && ((sd2 = this.i) == null || (lVarH = sd2.h()) == null || !lVarH.f(EnumC5932pS.Replay)))) {
                D();
            }
        }
    }

    public final void C(int i, int i2) {
        g gVar;
        if (this.o.get() && v()) {
            C2688aH1 c2688aH1 = this.h;
            if (c2688aH1 == null) {
                Intrinsics.l("options");
                throw null;
            }
            if (c2688aH1.getSessionReplay().k) {
                Context context = this.d;
                C2688aH1 c2688aH2 = this.h;
                if (c2688aH2 == null) {
                    Intrinsics.l("options");
                    throw null;
                }
                C3121cH1 sessionReplay = c2688aH2.getSessionReplay();
                Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(sessionReplay, "sessionReplay");
                float f = i2;
                int iB = QX0.b((f / context.getResources().getDisplayMetrics().density) * sessionReplay.f.sizeScale);
                int i3 = iB % 16;
                int iMax = i3 <= 8 ? Math.max(16, iB - i3) : iB + (16 - i3);
                float f2 = i;
                float f3 = f2 / context.getResources().getDisplayMetrics().density;
                C3121cH1.a aVar = sessionReplay.f;
                int iB2 = QX0.b(f3 * aVar.sizeScale);
                int i4 = iB2 % 16;
                int iMax2 = i4 <= 8 ? Math.max(16, iB2 - i4) : iB2 + (16 - i4);
                u config = new u(iMax2, iMax, iMax2 / f2, iMax / f, sessionReplay.g, aVar.bitRate);
                Intrinsics.checkNotNullParameter(config, "config");
                if (this.o.get() && v()) {
                    A a2 = this.q;
                    if (a2 != null) {
                        a2.m(config);
                    }
                    g gVar2 = this.j;
                    if (gVar2 != null) {
                        gVar2.m(config);
                    }
                    if (this.u.a != q.PAUSED || (gVar = this.j) == null) {
                        return;
                    }
                    gVar.b();
                }
            }
        }
    }

    public final void D() {
        p pVar = this.u;
        C4527a.C0404a c0404aA = this.t.a();
        try {
            if (this.o.get()) {
                q qVar = q.PAUSED;
                if (pVar.a(qVar)) {
                    g gVar = this.j;
                    if (gVar != null) {
                        gVar.b();
                    }
                    A a2 = this.q;
                    if (a2 != null) {
                        a2.b();
                    }
                    Intrinsics.checkNotNullParameter(qVar, "<set-?>");
                    pVar.a = qVar;
                    Unit unit = Unit.a;
                    c0404aA.close();
                    return;
                }
            }
            c0404aA.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }

    public final void G() {
        SD1 sd1;
        SD1 sd2;
        io.sentry.transport.l lVarH;
        io.sentry.transport.l lVarH2;
        C4527a.C0404a c0404aA = this.t.a();
        try {
            if (this.o.get()) {
                p pVar = this.u;
                q qVar = q.RESUMED;
                if (pVar.a(qVar)) {
                    if (!this.p.get() && this.g != InterfaceC4761js0.a.DISCONNECTED && (((sd1 = this.i) == null || (lVarH2 = sd1.h()) == null || !lVarH2.f(EnumC5932pS.All)) && ((sd2 = this.i) == null || (lVarH = sd2.h()) == null || !lVarH.f(EnumC5932pS.Replay)))) {
                        p pVar2 = this.u;
                        pVar2.getClass();
                        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
                        pVar2.a = qVar;
                        A a2 = this.q;
                        if (a2 != null) {
                            a2.e();
                        }
                        g gVar = this.j;
                        if (gVar != null) {
                            gVar.e();
                            Unit unit = Unit.a;
                        }
                        c0404aA.close();
                        return;
                    }
                    c0404aA.close();
                    return;
                }
            }
            c0404aA.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC2179Ur1
    public final void b() {
        this.p.set(true);
        D();
    }

    @Override // defpackage.InterfaceC4761js0.b
    public final void c(@NotNull InterfaceC4761js0.a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.g = status;
        if (this.q instanceof D) {
            if (status == InterfaceC4761js0.a.DISCONNECTED) {
                D();
            } else {
                G();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.transport.l lVarH;
        p pVar = this.u;
        C4527a.C0404a c0404aA = this.t.a();
        try {
            if (this.o.get()) {
                q qVar = q.CLOSED;
                if (pVar.a(qVar)) {
                    C2688aH1 c2688aH1 = this.h;
                    if (c2688aH1 == null) {
                        Intrinsics.l("options");
                        throw null;
                    }
                    c2688aH1.getConnectionStatusProvider().G0(this);
                    SD1 sd1 = this.i;
                    if (sd1 != null && (lVarH = sd1.h()) != null) {
                        lVarH.h.remove(this);
                    }
                    stop();
                    g gVar = this.j;
                    if (gVar != null) {
                        gVar.close();
                    }
                    this.j = null;
                    ((s) this.m.getValue()).close();
                    ((io.sentry.android.replay.util.h) this.n.getValue()).shutdown();
                    Intrinsics.checkNotNullParameter(qVar, "<set-?>");
                    pVar.a = qVar;
                    Unit unit = Unit.a;
                    c0404aA.close();
                    return;
                }
            }
            c0404aA.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC2179Ur1
    public final void e() {
        this.p.set(false);
        G();
    }

    @Override // defpackage.InterfaceC2179Ur1
    public final void f(@Nullable Boolean bool) {
        if (this.o.get() && v()) {
            io.sentry.protocol.u uVar = io.sentry.protocol.u.e;
            A a2 = this.q;
            if (uVar.equals(a2 != null ? a2.f() : null)) {
                C2688aH1 c2688aH1 = this.h;
                if (c2688aH1 != null) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    Intrinsics.l("options");
                    throw null;
                }
            }
            A a3 = this.q;
            if (a3 != null) {
                a3.c(bool.equals(Boolean.TRUE), new c());
            }
            A a4 = this.q;
            this.q = a4 != null ? a4.g() : null;
        }
    }

    @Override // defpackage.InterfaceC2179Ur1
    public final void g(@NotNull io.sentry.android.replay.a converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.r = converter;
    }

    @Override // defpackage.InterfaceC2179Ur1
    @NotNull
    public final io.sentry.protocol.u k() {
        io.sentry.protocol.u uVarF;
        A a2 = this.q;
        if (a2 != null && (uVarF = a2.f()) != null) {
            return uVarF;
        }
        io.sentry.protocol.u EMPTY_ID = io.sentry.protocol.u.e;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    @Override // io.sentry.transport.l.b
    public final void l(@NotNull io.sentry.transport.l rateLimiter) {
        Intrinsics.checkNotNullParameter(rateLimiter, "rateLimiter");
        if (this.q instanceof D) {
            if (rateLimiter.f(EnumC5932pS.All) || rateLimiter.f(EnumC5932pS.Replay)) {
                D();
            } else {
                G();
            }
        }
    }

    @Override // defpackage.InterfaceC2179Ur1
    public final void p() {
        A wVar;
        p pVar = this.u;
        C4527a.C0404a c0404aA = this.t.a();
        try {
            if (!this.o.get()) {
                c0404aA.close();
                return;
            }
            q qVar = q.STARTED;
            if (!pVar.a(qVar)) {
                C2688aH1 c2688aH1 = this.h;
                if (c2688aH1 == null) {
                    Intrinsics.l("options");
                    throw null;
                }
                c2688aH1.getLogger().a(NG1.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                c0404aA.close();
                return;
            }
            io.sentry.util.t tVar = (io.sentry.util.t) this.l.getValue();
            C2688aH1 c2688aH2 = this.h;
            if (c2688aH2 == null) {
                Intrinsics.l("options");
                throw null;
            }
            Double d2 = c2688aH2.getSessionReplay().d;
            Intrinsics.checkNotNullParameter(tVar, "<this>");
            boolean z = true;
            boolean z2 = d2 != null && d2.doubleValue() >= tVar.c();
            if (!z2) {
                C2688aH1 c2688aH3 = this.h;
                if (c2688aH3 == null) {
                    Intrinsics.l("options");
                    throw null;
                }
                Double d3 = c2688aH3.getSessionReplay().e;
                if (d3 == null || d3.doubleValue() <= 0.0d) {
                    z = false;
                }
                if (!z) {
                    C2688aH1 c2688aH4 = this.h;
                    if (c2688aH4 == null) {
                        Intrinsics.l("options");
                        throw null;
                    }
                    c2688aH4.getLogger().a(NG1.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    c0404aA.close();
                    return;
                }
            }
            Intrinsics.checkNotNullParameter(qVar, "<set-?>");
            pVar.a = qVar;
            if (z2) {
                C2688aH1 c2688aH5 = this.h;
                if (c2688aH5 == null) {
                    Intrinsics.l("options");
                    throw null;
                }
                wVar = new D(c2688aH5, this.i, this.e, (io.sentry.android.replay.util.h) this.n.getValue());
            } else {
                C2688aH1 c2688aH6 = this.h;
                if (c2688aH6 == null) {
                    Intrinsics.l("options");
                    throw null;
                }
                wVar = new io.sentry.android.replay.capture.w(c2688aH6, this.i, this.e, (io.sentry.util.t) this.l.getValue(), (io.sentry.android.replay.util.h) this.n.getValue());
            }
            this.q = wVar;
            g gVar = this.j;
            if (gVar != null) {
                gVar.start();
            }
            A a2 = this.q;
            if (a2 != null) {
                a2.a(0, new io.sentry.protocol.u(), null);
            }
            if (this.j instanceof f) {
                s.b bVar = ((s) this.m.getValue()).g;
                g gVar2 = this.j;
                Intrinsics.c(gVar2, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                bVar.add((f) gVar2);
            }
            ((s) this.m.getValue()).g.add(this.k);
            Unit unit = Unit.a;
            c0404aA.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC2179Ur1
    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final InterfaceC2101Tr1 getR() {
        return this.r;
    }

    @Override // defpackage.InterfaceC2179Ur1
    public final void stop() {
        p pVar = this.u;
        C4527a.C0404a c0404aA = this.t.a();
        try {
            if (this.o.get()) {
                q qVar = q.STOPPED;
                if (pVar.a(qVar)) {
                    if (this.j instanceof f) {
                        s.b bVar = ((s) this.m.getValue()).g;
                        g gVar = this.j;
                        Intrinsics.c(gVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                        bVar.remove((f) gVar);
                    }
                    ((s) this.m.getValue()).g.remove(this.k);
                    g gVar2 = this.j;
                    if (gVar2 != null) {
                        gVar2.reset();
                    }
                    g gVar3 = this.j;
                    if (gVar3 != null) {
                        gVar3.stop();
                    }
                    io.sentry.android.replay.gestures.a aVar = this.k;
                    if (aVar != null) {
                        aVar.a();
                    }
                    A a2 = this.q;
                    if (a2 != null) {
                        a2.stop();
                    }
                    this.q = null;
                    Intrinsics.checkNotNullParameter(qVar, "<set-?>");
                    pVar.a = qVar;
                    Unit unit = Unit.a;
                    c0404aA.close();
                    return;
                }
            }
            c0404aA.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 options) {
        Double d2;
        SD1 scopes = SD1.a;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(options, "options");
        this.h = options;
        if (Build.VERSION.SDK_INT < 26) {
            options.getLogger().a(NG1.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        Double d3 = options.getSessionReplay().d;
        if ((d3 == null || d3.doubleValue() <= 0.0d) && ((d2 = options.getSessionReplay().e) == null || d2.doubleValue() <= 0.0d)) {
            options.getLogger().a(NG1.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.i = scopes;
        this.j = new x(options, this, this, this.s, (io.sentry.android.replay.util.h) this.n.getValue());
        this.k = new io.sentry.android.replay.gestures.a(options, this);
        this.o.set(true);
        options.getConnectionStatusProvider().o0(this);
        io.sentry.transport.l lVarH = scopes.h();
        if (lVarH != null) {
            lVarH.h.add(this);
        }
        io.sentry.util.j.a("Replay");
        C2688aH1 c2688aH1 = this.h;
        if (c2688aH1 == null) {
            Intrinsics.l("options");
            throw null;
        }
        InterfaceC1405Ku0 executorService = c2688aH1.getExecutorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "getExecutorService(...)");
        C2688aH1 options2 = this.h;
        if (options2 == null) {
            Intrinsics.l("options");
            throw null;
        }
        RunnableC3446dq task = new RunnableC3446dq(this, 4);
        Intrinsics.checkNotNullParameter(executorService, "<this>");
        Intrinsics.checkNotNullParameter(options2, "options");
        Intrinsics.checkNotNullParameter("ReplayIntegration.finalize_previous_replay", "taskName");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            executorService.submit(new RunnableC3377dX(2, task, options2));
        } catch (Throwable th) {
            options2.getLogger().d(NG1.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th);
        }
    }

    public final void u(String str) {
        File[] fileArrListFiles;
        C2688aH1 c2688aH1 = this.h;
        if (c2688aH1 == null) {
            Intrinsics.l("options");
            throw null;
        }
        String cacheDirPath = c2688aH1.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        Intrinsics.checkNotNull(fileArrListFiles);
        for (File file : fileArrListFiles) {
            String name = file.getName();
            Intrinsics.checkNotNull(name);
            if (kotlin.text.d.o(name, "replay_", false)) {
                String string = k().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (!StringsKt.C(name, string, false) && (StringsKt.I(str) || !StringsKt.C(name, str, false))) {
                    io.sentry.util.f.a(file);
                }
            }
        }
    }

    public final boolean v() {
        return this.u.a.compareTo(q.STARTED) >= 0 && this.u.a.compareTo(q.STOPPED) < 0;
    }
}

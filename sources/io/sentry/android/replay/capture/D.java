package io.sentry.android.replay.capture;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C2688aH1;
import defpackage.C2779aj;
import defpackage.C2912bH1;
import defpackage.C4564j;
import defpackage.IJ0;
import defpackage.ML0;
import defpackage.NG1;
import defpackage.SD1;
import io.sentry.android.replay.ReplayIntegration;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class D extends AbstractC4515a {

    @NotNull
    public final C2688aH1 r;

    @Nullable
    public final SD1 s;

    @NotNull
    public final io.sentry.transport.c t;

    public static final class a extends ML0 implements Function1<A.b, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(A.b bVar) {
            A.b segment = bVar;
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof A.b.a) {
                A.b.a aVar = (A.b.a) segment;
                D d = D.this;
                A.b.a.a(aVar, d.s);
                d.i(d.j() + 1);
                d.h(aVar.a.y);
            }
            return Unit.a;
        }
    }

    public static final class b extends ML0 implements Function1<A.b, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(A.b bVar) {
            A.b segment = bVar;
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof A.b.a) {
                D d = D.this;
                A.b.a.a((A.b.a) segment, d.s);
                d.i(d.j() + 1);
            }
            return Unit.a;
        }
    }

    public static final class c extends ML0 implements Function1<A.b, Unit> {
        public final /* synthetic */ File e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file) {
            super(1);
            this.e = file;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(A.b bVar) {
            A.b segment = bVar;
            Intrinsics.checkNotNullParameter(segment, "segment");
            boolean z = segment instanceof A.b.a;
            D d = D.this;
            if (z) {
                A.b.a.a((A.b.a) segment, d.s);
            }
            d.i(-1);
            io.sentry.util.f.a(this.e);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(@NotNull C2688aH1 options, @Nullable SD1 sd1, @NotNull io.sentry.transport.c dateProvider, @NotNull io.sentry.android.replay.util.h executor) {
        super(options, sd1, dateProvider, executor);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.r = options;
        this.s = sd1;
        this.t = dateProvider;
    }

    @Override // io.sentry.android.replay.capture.AbstractC4515a, io.sentry.android.replay.capture.A
    public final void a(int i, @NotNull io.sentry.protocol.u replayId, @Nullable C2912bH1.b bVar) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        super.a(i, replayId, bVar);
        SD1 sd1 = this.s;
        if (sd1 != null) {
            sd1.A(null, new C2779aj(this, 2));
        }
    }

    @Override // io.sentry.android.replay.capture.AbstractC4515a, io.sentry.android.replay.capture.A
    public final void b() {
        o("pause", new b());
    }

    @Override // io.sentry.android.replay.capture.A
    public final void c(boolean z, @NotNull ReplayIntegration.c onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        C2688aH1 c2688aH1 = this.r;
        if (c2688aH1.getSessionReplay().m) {
            c2688aH1.getLogger().a(NG1.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        this.g.set(z);
    }

    @Override // io.sentry.android.replay.capture.A
    @NotNull
    public final A g() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.A
    public final void k(@NotNull final ReplayIntegration.d store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final io.sentry.android.replay.u uVarN = n();
        this.t.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.d.submit(new io.sentry.android.replay.util.i(new Runnable() { // from class: io.sentry.android.replay.capture.C
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                D d = this.d;
                io.sentry.android.replay.k kVar = d.h;
                if (kVar != null) {
                    store.invoke(kVar, Long.valueOf(jCurrentTimeMillis));
                }
                IJ0<Object> property = AbstractC4515a.q[1];
                o oVar = d.j;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(property, "property");
                Date date = oVar.a.get();
                C2688aH1 c2688aH1 = d.r;
                if (date == null) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                    return;
                }
                if (d.g.get()) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                    return;
                }
                io.sentry.android.replay.u uVar = uVarN;
                if (uVar == null) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
                    return;
                }
                d.t.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - date.getTime() >= c2688aH1.getSessionReplay().i) {
                    A.b bVarL = AbstractC4515a.l(d, c2688aH1.getSessionReplay().i, date, d.f(), d.j(), uVar.b, uVar.a, uVar.e, uVar.f);
                    if (bVarL instanceof A.b.a) {
                        A.b.a aVar = (A.b.a) bVarL;
                        A.b.a.a(aVar, d.s);
                        d.i(d.j() + 1);
                        d.h(aVar.a.y);
                    }
                }
                if (jCurrentTimeMillis2 - d.k.get() >= c2688aH1.getSessionReplay().j) {
                    c2688aH1.getReplayController().stop();
                    c2688aH1.getLogger().a(NG1.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                }
            }
        }, "SessionCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.AbstractC4515a, io.sentry.android.replay.capture.A
    public final void m(@NotNull io.sentry.android.replay.u recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        o("onConfigurationChanged", new a());
        super.m(recorderConfig);
    }

    public final void o(String str, final Function1<? super A.b, Unit> function1) {
        final io.sentry.android.replay.u uVarN = n();
        if (uVarN == null) {
            this.r.getLogger().a(NG1.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        this.t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IJ0<Object> property = AbstractC4515a.q[1];
        o oVar = this.j;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        final Date date = oVar.a.get();
        if (date == null) {
            return;
        }
        final long time = jCurrentTimeMillis - date.getTime();
        final io.sentry.protocol.u uVarF = f();
        this.d.submit(new io.sentry.android.replay.util.i(new Runnable(time, date, uVarF, uVarN, function1) { // from class: io.sentry.android.replay.capture.B
            public final /* synthetic */ long e;
            public final /* synthetic */ Date g;
            public final /* synthetic */ io.sentry.protocol.u h;
            public final /* synthetic */ io.sentry.android.replay.u i;
            public final /* synthetic */ ML0 j;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.j = (ML0) function1;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [ML0, kotlin.jvm.functions.Function1] */
            @Override // java.lang.Runnable
            public final void run() {
                D d = this.d;
                int iJ = d.j();
                io.sentry.android.replay.u uVar = this.i;
                this.j.invoke(AbstractC4515a.l(d, this.e, this.g, this.h, iJ, uVar.b, uVar.a, uVar.e, uVar.f));
            }
        }, "SessionCaptureStrategy.".concat(str)));
    }

    @Override // io.sentry.android.replay.capture.AbstractC4515a, io.sentry.android.replay.capture.A
    public final void stop() {
        io.sentry.android.replay.k kVar = this.h;
        o("stop", new c(kVar != null ? kVar.g() : null));
        SD1 sd1 = this.s;
        if (sd1 != null) {
            sd1.A(null, new C4564j(9));
        }
        super.stop();
    }
}

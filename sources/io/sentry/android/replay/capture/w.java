package io.sentry.android.replay.capture;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C1589Ne;
import defpackage.C2512Yo1;
import defpackage.C2688aH1;
import defpackage.C2904bF;
import defpackage.C2912bH1;
import defpackage.C7225vc1;
import defpackage.IJ0;
import defpackage.JO;
import defpackage.ML0;
import defpackage.N7;
import defpackage.NG1;
import defpackage.SD1;
import defpackage.WE;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.util.C4527a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class w extends AbstractC4515a {

    @NotNull
    public final C2688aH1 r;

    @Nullable
    public final SD1 s;

    @NotNull
    public final io.sentry.transport.c t;

    @NotNull
    public final io.sentry.util.t u;

    @NotNull
    public final ArrayList v;

    public static final class a extends ML0 implements Function1<A.b, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(A.b bVar) {
            A.b segment = bVar;
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof A.b.a) {
                w wVar = w.this;
                wVar.v.add(segment);
                wVar.i(wVar.j() + 1);
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
                w wVar = w.this;
                wVar.v.add(segment);
                wVar.i(wVar.j() + 1);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NotNull C2688aH1 options, @Nullable SD1 sd1, @NotNull io.sentry.transport.c dateProvider, @NotNull io.sentry.util.t random, @NotNull io.sentry.android.replay.util.h executor) {
        super(options, sd1, dateProvider, executor);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.r = options;
        this.s = sd1;
        this.t = dateProvider;
        this.u = random;
        this.v = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.AbstractC4515a, io.sentry.android.replay.capture.A
    public final void b() {
        o("pause", new b());
    }

    @Override // io.sentry.android.replay.capture.A
    public final void c(boolean z, @NotNull ReplayIntegration.c onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        C2688aH1 c2688aH1 = this.r;
        Double d = c2688aH1.getSessionReplay().e;
        io.sentry.util.t tVar = this.u;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        if (!(d != null && d.doubleValue() >= tVar.c())) {
            c2688aH1.getLogger().a(NG1.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        SD1 sd1 = this.s;
        if (sd1 != null) {
            sd1.A(null, new u(this));
        }
        if (!z) {
            o("capture_replay", new v(this, onSegmentSent));
        } else {
            this.g.set(true);
            c2688aH1.getLogger().a(NG1.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.AbstractC4515a, io.sentry.android.replay.capture.A
    public final void d(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.d(event);
        this.t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.r.getSessionReplay().h;
        ConcurrentLinkedDeque events = this.p;
        Intrinsics.checkNotNullParameter(events, "events");
        Iterator it = events.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            if (((io.sentry.rrweb.b) it.next()).e < jCurrentTimeMillis) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.A
    @NotNull
    public final A g() {
        boolean z = this.g.get();
        C2688aH1 c2688aH1 = this.r;
        if (z) {
            c2688aH1.getLogger().a(NG1.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        D d = new D(c2688aH1, this.s, this.t, this.d);
        io.sentry.android.replay.u uVarN = n();
        IJ0<Object> property = AbstractC4515a.q[0];
        m mVar = d.i;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        io.sentry.android.replay.u andSet = mVar.a.getAndSet(uVarN);
        if (!Intrinsics.a(andSet, uVarN)) {
            C7225vc1 c7225vc1 = new C7225vc1(andSet, uVarN, mVar.c, 1);
            AbstractC4515a abstractC4515a = mVar.b;
            if (abstractC4515a.a.getThreadChecker().c()) {
                ((ScheduledExecutorService) abstractC4515a.e.getValue()).submit(new io.sentry.android.replay.util.i(new l(c7225vc1), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    c7225vc1.invoke();
                } catch (Throwable th) {
                    abstractC4515a.a.getLogger().d(NG1.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }
        }
        d.a(j(), f(), C2912bH1.b.BUFFER);
        return d;
    }

    @Override // io.sentry.android.replay.capture.A
    public final void k(@NotNull final ReplayIntegration.d store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.t.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.d.submit(new io.sentry.android.replay.util.i(new Runnable() { // from class: io.sentry.android.replay.capture.t
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                w wVar = this.d;
                io.sentry.android.replay.k kVar = wVar.h;
                if (kVar != null) {
                    store.invoke(kVar, Long.valueOf(jCurrentTimeMillis));
                }
                wVar.t.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - wVar.r.getSessionReplay().h;
                io.sentry.android.replay.k kVar2 = wVar.h;
                String strL = kVar2 != null ? kVar2.l(jCurrentTimeMillis2) : null;
                IJ0<Object> property = AbstractC4515a.q[2];
                r rVar = wVar.l;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(property, "property");
                String andSet = rVar.a.getAndSet(strL);
                if (!Intrinsics.a(andSet, strL)) {
                    q qVar = new q(andSet, strL, rVar.c);
                    AbstractC4515a abstractC4515a = rVar.b;
                    if (abstractC4515a.a.getThreadChecker().c()) {
                        ((ScheduledExecutorService) abstractC4515a.e.getValue()).submit(new io.sentry.android.replay.util.i(new p(qVar), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            qVar.invoke();
                        } catch (Throwable th) {
                            abstractC4515a.a.getLogger().d(NG1.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                        }
                    }
                }
                ArrayList arrayList = wVar.v;
                C2512Yo1 c2512Yo1 = new C2512Yo1();
                C2904bF.r(arrayList, new x(jCurrentTimeMillis2, wVar, c2512Yo1));
                if (c2512Yo1.d) {
                    int i = 0;
                    for (Object obj : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            WE.l();
                            throw null;
                        }
                        A.b.a aVar = (A.b.a) obj;
                        aVar.a.x = i;
                        List<? extends io.sentry.rrweb.b> list = aVar.b.e;
                        if (list != null) {
                            for (io.sentry.rrweb.b bVar : list) {
                                if (bVar instanceof io.sentry.rrweb.j) {
                                    ((io.sentry.rrweb.j) bVar).h = i;
                                }
                            }
                        }
                        i = i2;
                    }
                }
            }
        }, "BufferCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.AbstractC4515a, io.sentry.android.replay.capture.A
    public final void m(@NotNull io.sentry.android.replay.u recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        o("configuration_changed", new a());
        super.m(recorderConfig);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    public final void o(String str, final Function1<? super A.b, Unit> function1) {
        final Date dateI;
        final io.sentry.android.replay.u uVarN = n();
        C2688aH1 c2688aH1 = this.r;
        if (uVarN == null) {
            c2688aH1.getLogger().a(NG1.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long j = c2688aH1.getSessionReplay().h;
        this.t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        io.sentry.android.replay.k kVar = this.h;
        if (kVar != null) {
            C4527a.C0404a c0404aA = kVar.j.a();
            try {
                io.sentry.android.replay.l lVar = (io.sentry.android.replay.l) CollectionsKt.firstOrNull(kVar.m);
                Long lValueOf = lVar != null ? Long.valueOf(lVar.b) : null;
                c0404aA.close();
                if (lValueOf == null || (dateI = N7.i(lValueOf.longValue())) == null) {
                    dateI = N7.i(jCurrentTimeMillis - j);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C1589Ne.l(c0404aA, th);
                    throw th2;
                }
            }
        } else {
            dateI = N7.i(jCurrentTimeMillis - j);
        }
        Intrinsics.checkNotNull(dateI);
        final long time = jCurrentTimeMillis - dateI.getTime();
        final io.sentry.protocol.u uVarF = f();
        this.d.submit(new io.sentry.android.replay.util.i(new Runnable(time, dateI, uVarF, uVarN, function1) { // from class: io.sentry.android.replay.capture.s
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
                w wVar = this.d;
                int iJ = wVar.j();
                io.sentry.android.replay.u uVar = this.i;
                this.j.invoke(AbstractC4515a.l(wVar, this.e, this.g, this.h, iJ, uVar.b, uVar.a, uVar.e, uVar.f));
            }
        }, "BufferCaptureStrategy.".concat(str)));
    }

    @Override // io.sentry.android.replay.capture.AbstractC4515a, io.sentry.android.replay.capture.A
    public final void stop() {
        io.sentry.android.replay.k kVar = this.h;
        this.d.submit(new io.sentry.android.replay.util.i(new JO(2, kVar != null ? kVar.g() : null, this), "BufferCaptureStrategy.stop"));
        super.stop();
    }
}

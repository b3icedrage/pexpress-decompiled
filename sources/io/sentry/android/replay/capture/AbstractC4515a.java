package io.sentry.android.replay.capture;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C0681Bn;
import defpackage.C2017Sp1;
import defpackage.C2251Vp1;
import defpackage.C2688aH1;
import defpackage.C2904bF;
import defpackage.C2912bH1;
import defpackage.C3068c21;
import defpackage.C6254qz;
import defpackage.C7225vc1;
import defpackage.IJ0;
import defpackage.KW1;
import defpackage.N7;
import defpackage.NG1;
import defpackage.SD1;
import defpackage.VE;
import defpackage.XE;
import defpackage.XO0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public abstract class AbstractC4515a implements A {
    public static final /* synthetic */ IJ0<Object>[] q;

    @NotNull
    public final C2688aH1 a;

    @Nullable
    public final SD1 b;

    @NotNull
    public final io.sentry.transport.c c;

    @NotNull
    public final io.sentry.android.replay.util.h d;

    @NotNull
    public final KW1 e;

    @NotNull
    public final io.sentry.android.replay.gestures.b f;

    @NotNull
    public final AtomicBoolean g;

    @Nullable
    public io.sentry.android.replay.k h;

    @NotNull
    public final m i;

    @NotNull
    public final o j;

    @NotNull
    public final AtomicLong k;

    @NotNull
    public final r l;

    @NotNull
    public final e m;

    @NotNull
    public final h n;

    @NotNull
    public final k o;

    @NotNull
    public final ConcurrentLinkedDeque p;

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$a, reason: collision with other inner class name */
    public static final class ThreadFactoryC0387a implements ThreadFactory {
        public int d;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(@NotNull Runnable r) {
            Intrinsics.checkNotNullParameter(r, "r");
            StringBuilder sb = new StringBuilder("SentryReplayPersister-");
            int i = this.d;
            this.d = i + 1;
            sb.append(i);
            Thread thread = new Thread(r, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    static {
        C3068c21 c3068c21 = new C3068c21(AbstractC4515a.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;");
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        q = new IJ0[]{c2251Vp1.e(c3068c21), C0681Bn.b(AbstractC4515a.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", c2251Vp1), C0681Bn.b(AbstractC4515a.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", c2251Vp1), C0681Bn.b(AbstractC4515a.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", c2251Vp1), C0681Bn.b(AbstractC4515a.class, "currentSegment", "getCurrentSegment()I", c2251Vp1), C0681Bn.b(AbstractC4515a.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", c2251Vp1)};
    }

    public AbstractC4515a(@NotNull C2688aH1 options, @Nullable SD1 sd1, @NotNull io.sentry.transport.c dateProvider, @NotNull io.sentry.android.replay.util.h replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.a = options;
        this.b = sd1;
        this.c = dateProvider;
        this.d = replayExecutor;
        this.e = XO0.b(new C4516b(this));
        this.f = new io.sentry.android.replay.gestures.b(dateProvider);
        this.g = new AtomicBoolean(false);
        this.i = new m(this, this);
        this.j = new o(this, this);
        this.k = new AtomicLong();
        this.l = new r(this, this);
        this.m = new e(io.sentry.protocol.u.e, this, this);
        this.n = new h(this, this);
        this.o = new k(this, this);
        this.p = new ConcurrentLinkedDeque();
    }

    public static A.b l(AbstractC4515a abstractC4515a, long j, Date currentSegmentTimestamp, io.sentry.protocol.u replayId, int i, int i2, int i3, int i4, int i5) {
        k kVar = abstractC4515a.o;
        IJ0<Object>[] ij0Arr = q;
        IJ0<Object> property = ij0Arr[5];
        kVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        C2912bH1.b replayType = kVar.a.get();
        io.sentry.android.replay.k kVar2 = abstractC4515a.h;
        r rVar = abstractC4515a.l;
        IJ0<Object> property2 = ij0Arr[2];
        rVar.getClass();
        Intrinsics.checkNotNullParameter(property2, "property");
        String str = rVar.a.get();
        ConcurrentLinkedDeque events = abstractC4515a.p;
        abstractC4515a.getClass();
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return A.a.a(abstractC4515a.b, abstractC4515a.a, j, currentSegmentTimestamp, replayId, i, i2, i3, replayType, kVar2, i4, i5, str, null, events);
    }

    @Override // io.sentry.android.replay.capture.A
    public void a(int i, @NotNull io.sentry.protocol.u replayId, @Nullable C2912bH1.b bVar) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        this.h = new io.sentry.android.replay.k(this.a, replayId);
        Intrinsics.checkNotNullParameter(replayId, "<set-?>");
        IJ0<Object>[] ij0Arr = q;
        IJ0<Object> property = ij0Arr[3];
        e eVar = this.m;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        io.sentry.protocol.u andSet = eVar.a.getAndSet(replayId);
        if (!Intrinsics.a(andSet, replayId)) {
            C4518d c4518d = new C4518d(andSet, replayId, eVar.c);
            AbstractC4515a abstractC4515a = eVar.b;
            if (abstractC4515a.a.getThreadChecker().c()) {
                ((ScheduledExecutorService) abstractC4515a.e.getValue()).submit(new io.sentry.android.replay.util.i(new RunnableC4517c(c4518d), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    c4518d.invoke();
                } catch (Throwable th) {
                    abstractC4515a.a.getLogger().d(NG1.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }
        }
        i(i);
        if (bVar == null) {
            bVar = this instanceof D ? C2912bH1.b.SESSION : C2912bH1.b.BUFFER;
        }
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        IJ0<Object> property2 = ij0Arr[5];
        k kVar = this.o;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(property2, "property");
        C2912bH1.b andSet2 = kVar.a.getAndSet(bVar);
        if (!Intrinsics.a(andSet2, bVar)) {
            j jVar = new j(andSet2, bVar, kVar.c);
            AbstractC4515a abstractC4515a2 = kVar.b;
            if (abstractC4515a2.a.getThreadChecker().c()) {
                ((ScheduledExecutorService) abstractC4515a2.e.getValue()).submit(new io.sentry.android.replay.util.i(new i(jVar), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    jVar.invoke();
                } catch (Throwable th2) {
                    abstractC4515a2.a.getLogger().d(NG1.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }
        }
        h(N7.h());
        AtomicLong atomicLong = this.k;
        this.c.getClass();
        atomicLong.set(System.currentTimeMillis());
    }

    @Override // io.sentry.android.replay.capture.A
    public void b() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:54:0x018c  */
    /* JADX WARN: Code duplicated, block: B:58:0x01cf  */
    @Override // io.sentry.android.replay.capture.A
    public void d(@NotNull MotionEvent event) {
        int pointerId;
        int iFindPointerIndex;
        List listC;
        int pointerId2;
        int iFindPointerIndex2;
        Intrinsics.checkNotNullParameter(event, "event");
        io.sentry.android.replay.u recorderConfig = n();
        if (recorderConfig != null) {
            io.sentry.android.replay.gestures.b bVar = this.f;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
            int actionMasked = event.getActionMasked();
            LinkedHashMap<Integer, ArrayList<io.sentry.rrweb.f.b>> linkedHashMap = bVar.b;
            float f = recorderConfig.d;
            float f2 = recorderConfig.c;
            int i = 10;
            int i2 = -1;
            io.sentry.transport.c cVar = bVar.a;
            if (actionMasked == 0) {
                pointerId = event.getPointerId(event.getActionIndex());
                iFindPointerIndex = event.findPointerIndex(pointerId);
                if (iFindPointerIndex != -1) {
                    listC = null;
                } else {
                    linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList<>(10));
                    io.sentry.rrweb.e eVar = new io.sentry.rrweb.e();
                    cVar.getClass();
                    eVar.e = System.currentTimeMillis();
                    eVar.j = event.getX(iFindPointerIndex) * f2;
                    eVar.k = event.getY(iFindPointerIndex) * f;
                    eVar.i = 0;
                    eVar.m = pointerId;
                    eVar.h = io.sentry.rrweb.e.b.TouchStart;
                    listC = VE.c(eVar);
                }
            } else if (actionMasked == 1) {
                pointerId2 = event.getPointerId(event.getActionIndex());
                iFindPointerIndex2 = event.findPointerIndex(pointerId2);
                if (iFindPointerIndex2 != -1) {
                    listC = null;
                } else {
                    linkedHashMap.remove(Integer.valueOf(pointerId2));
                    io.sentry.rrweb.e eVar2 = new io.sentry.rrweb.e();
                    cVar.getClass();
                    eVar2.e = System.currentTimeMillis();
                    eVar2.j = event.getX(iFindPointerIndex2) * f2;
                    eVar2.k = event.getY(iFindPointerIndex2) * f;
                    eVar2.i = 0;
                    eVar2.m = pointerId2;
                    eVar2.h = io.sentry.rrweb.e.b.TouchEnd;
                    listC = VE.c(eVar2);
                }
            } else if (actionMasked == 2) {
                cVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = bVar.d;
                long j2 = 0;
                if (j == 0 || j + ((long) 50) <= jCurrentTimeMillis) {
                    bVar.d = jCurrentTimeMillis;
                    Set<Integer> setKeySet = linkedHashMap.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                    for (Integer num : setKeySet) {
                        Intrinsics.checkNotNull(num);
                        int iFindPointerIndex3 = event.findPointerIndex(num.intValue());
                        if (iFindPointerIndex3 != i2) {
                            if (bVar.c == 0) {
                                bVar.c = jCurrentTimeMillis;
                            }
                            ArrayList<io.sentry.rrweb.f.b> arrayList = linkedHashMap.get(num);
                            Intrinsics.checkNotNull(arrayList);
                            io.sentry.rrweb.f.b bVar2 = new io.sentry.rrweb.f.b();
                            bVar2.e = event.getX(iFindPointerIndex3) * f2;
                            bVar2.g = event.getY(iFindPointerIndex3) * f;
                            bVar2.d = 0;
                            bVar2.h = jCurrentTimeMillis - bVar.c;
                            arrayList.add(bVar2);
                        }
                        i2 = -1;
                    }
                    long j3 = jCurrentTimeMillis - bVar.c;
                    if (j3 > 500) {
                        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                        for (Map.Entry<Integer, ArrayList<io.sentry.rrweb.f.b>> entry : linkedHashMap.entrySet()) {
                            int iIntValue = entry.getKey().intValue();
                            ArrayList<io.sentry.rrweb.f.b> value = entry.getValue();
                            if (!value.isEmpty()) {
                                io.sentry.rrweb.f fVar = new io.sentry.rrweb.f();
                                fVar.e = jCurrentTimeMillis;
                                ArrayList arrayList3 = new ArrayList(XE.m(value, i));
                                for (Iterator it = value.iterator(); it.hasNext(); it = it) {
                                    io.sentry.rrweb.f.b bVar3 = (io.sentry.rrweb.f.b) it.next();
                                    bVar3.h -= j3;
                                    arrayList3.add(bVar3);
                                }
                                fVar.i = arrayList3;
                                fVar.h = iIntValue;
                                arrayList2.add(fVar);
                                ArrayList<io.sentry.rrweb.f.b> arrayList4 = linkedHashMap.get(Integer.valueOf(iIntValue));
                                Intrinsics.checkNotNull(arrayList4);
                                arrayList4.clear();
                                i = 10;
                            }
                            j2 = 0;
                        }
                        bVar.c = j2;
                        listC = arrayList2;
                    } else {
                        listC = null;
                    }
                } else {
                    listC = null;
                }
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    pointerId = event.getPointerId(event.getActionIndex());
                    iFindPointerIndex = event.findPointerIndex(pointerId);
                    if (iFindPointerIndex != -1) {
                        linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList<>(10));
                        io.sentry.rrweb.e eVar3 = new io.sentry.rrweb.e();
                        cVar.getClass();
                        eVar3.e = System.currentTimeMillis();
                        eVar3.j = event.getX(iFindPointerIndex) * f2;
                        eVar3.k = event.getY(iFindPointerIndex) * f;
                        eVar3.i = 0;
                        eVar3.m = pointerId;
                        eVar3.h = io.sentry.rrweb.e.b.TouchStart;
                        listC = VE.c(eVar3);
                    }
                } else if (actionMasked == 6) {
                    pointerId2 = event.getPointerId(event.getActionIndex());
                    iFindPointerIndex2 = event.findPointerIndex(pointerId2);
                    if (iFindPointerIndex2 != -1) {
                        linkedHashMap.remove(Integer.valueOf(pointerId2));
                        io.sentry.rrweb.e eVar4 = new io.sentry.rrweb.e();
                        cVar.getClass();
                        eVar4.e = System.currentTimeMillis();
                        eVar4.j = event.getX(iFindPointerIndex2) * f2;
                        eVar4.k = event.getY(iFindPointerIndex2) * f;
                        eVar4.i = 0;
                        eVar4.m = pointerId2;
                        eVar4.h = io.sentry.rrweb.e.b.TouchEnd;
                        listC = VE.c(eVar4);
                    }
                }
                listC = null;
            } else {
                linkedHashMap.clear();
                io.sentry.rrweb.e eVar5 = new io.sentry.rrweb.e();
                cVar.getClass();
                eVar5.e = System.currentTimeMillis();
                eVar5.j = event.getX() * f2;
                eVar5.k = event.getY() * f;
                eVar5.i = 0;
                eVar5.m = 0;
                eVar5.h = io.sentry.rrweb.e.b.TouchCancel;
                listC = VE.c(eVar5);
            }
            if (listC != null) {
                C2904bF.o(this.p, listC);
            }
        }
    }

    @Override // io.sentry.android.replay.capture.A
    public final void e() {
        h(N7.h());
    }

    @Override // io.sentry.android.replay.capture.A
    @NotNull
    public final io.sentry.protocol.u f() {
        IJ0<Object> property = q[3];
        e eVar = this.m;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        return eVar.a.get();
    }

    @Override // io.sentry.android.replay.capture.A
    public final void h(@Nullable Date date) {
        IJ0<Object> property = q[1];
        o oVar = this.j;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        Date andSet = oVar.a.getAndSet(date);
        if (Intrinsics.a(andSet, date)) {
            return;
        }
        C6254qz c6254qz = new C6254qz(andSet, date, oVar.c, 1);
        AbstractC4515a abstractC4515a = oVar.b;
        if (abstractC4515a.a.getThreadChecker().c()) {
            ((ScheduledExecutorService) abstractC4515a.e.getValue()).submit(new io.sentry.android.replay.util.i(new n(c6254qz), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            c6254qz.invoke();
        } catch (Throwable th) {
            abstractC4515a.a.getLogger().d(NG1.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    @Override // io.sentry.android.replay.capture.A
    public final void i(int i) {
        IJ0<Object> property = q[4];
        Integer numValueOf = Integer.valueOf(i);
        h hVar = this.n;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        Integer andSet = hVar.a.getAndSet(numValueOf);
        if (Intrinsics.a(andSet, numValueOf)) {
            return;
        }
        g gVar = new g(andSet, numValueOf, hVar.c);
        AbstractC4515a abstractC4515a = hVar.b;
        if (abstractC4515a.a.getThreadChecker().c()) {
            ((ScheduledExecutorService) abstractC4515a.e.getValue()).submit(new io.sentry.android.replay.util.i(new f(gVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            gVar.invoke();
        } catch (Throwable th) {
            abstractC4515a.a.getLogger().d(NG1.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    @Override // io.sentry.android.replay.capture.A
    public final int j() {
        IJ0<Object> property = q[4];
        h hVar = this.n;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        return hVar.a.get().intValue();
    }

    @Override // io.sentry.android.replay.capture.A
    public void m(@NotNull io.sentry.android.replay.u recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        IJ0<Object> property = q[0];
        m mVar = this.i;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        io.sentry.android.replay.u andSet = mVar.a.getAndSet(recorderConfig);
        if (Intrinsics.a(andSet, recorderConfig)) {
            return;
        }
        C7225vc1 c7225vc1 = new C7225vc1(andSet, recorderConfig, mVar.c, 1);
        AbstractC4515a abstractC4515a = mVar.b;
        if (abstractC4515a.a.getThreadChecker().c()) {
            ((ScheduledExecutorService) abstractC4515a.e.getValue()).submit(new io.sentry.android.replay.util.i(new l(c7225vc1), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            c7225vc1.invoke();
        } catch (Throwable th) {
            abstractC4515a.a.getLogger().d(NG1.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    @Nullable
    public final io.sentry.android.replay.u n() {
        IJ0<Object> property = q[0];
        m mVar = this.i;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        return mVar.a.get();
    }

    @Override // io.sentry.android.replay.capture.A
    public void stop() {
        io.sentry.android.replay.k kVar = this.h;
        if (kVar != null) {
            kVar.close();
        }
        this.k.set(0L);
        h(null);
        io.sentry.protocol.u EMPTY_ID = io.sentry.protocol.u.e;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        Intrinsics.checkNotNullParameter(EMPTY_ID, "<set-?>");
        IJ0<Object> property = q[3];
        e eVar = this.m;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        io.sentry.protocol.u andSet = eVar.a.getAndSet(EMPTY_ID);
        if (Intrinsics.a(andSet, EMPTY_ID)) {
            return;
        }
        C4518d c4518d = new C4518d(andSet, EMPTY_ID, eVar.c);
        AbstractC4515a abstractC4515a = eVar.b;
        if (abstractC4515a.a.getThreadChecker().c()) {
            ((ScheduledExecutorService) abstractC4515a.e.getValue()).submit(new io.sentry.android.replay.util.i(new RunnableC4517c(c4518d), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            c4518d.invoke();
        } catch (Throwable th) {
            abstractC4515a.a.getLogger().d(NG1.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }
}

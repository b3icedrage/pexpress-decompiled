package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.MotionEvent;
import android.view.Surface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import defpackage.C0702Bu;
import defpackage.C0841Do0;
import defpackage.C1589Ne;
import defpackage.C2257Vr1;
import defpackage.C2688aH1;
import defpackage.C2912bH1;
import defpackage.C3027bp1;
import defpackage.C3121cH1;
import defpackage.C4191hO1;
import defpackage.C5653o60;
import defpackage.C5796om1;
import defpackage.EnumC4161hE1;
import defpackage.F62;
import defpackage.InterfaceC1171Hu0;
import defpackage.N7;
import defpackage.NG1;
import defpackage.SD1;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.util.C4527a;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface A {

    public static final class a {
        /* JADX WARN: Code duplicated, block: B:138:0x0369  */
        /* JADX WARN: Code duplicated, block: B:159:0x03c5  */
        /* JADX WARN: Code duplicated, block: B:244:0x021f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:88:0x020e  */
        /* JADX WARN: Code duplicated, block: B:91:0x0217 A[LOOP:2: B:45:0x0163->B:91:0x0217, LOOP_END] */
        /* JADX WARN: Type inference failed for: r5v2, types: [fO0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v50, types: [T, o60] */
        @NotNull
        public static b a(@Nullable SD1 sd1, @NotNull C2688aH1 options, long j, @NotNull Date currentSegmentTimestamp, @NotNull io.sentry.protocol.u replayId, int i, int i2, int i3, @NotNull C2912bH1.b replayType, @Nullable io.sentry.android.replay.k kVar, int i4, int i5, @Nullable String str, @Nullable List list, @NotNull Deque events) {
            C4527a.C0404a c0404a;
            String str2;
            kotlin.ranges.e eVar;
            int i6;
            Object obj;
            long j2;
            int i7;
            Object obj2;
            List list2;
            C4527a.C0404a c0404aA;
            List<C0702Bu> list3;
            boolean z;
            io.sentry.rrweb.b bVarA;
            Object obj3;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            Intrinsics.checkNotNullParameter(replayType, "replayType");
            Intrinsics.checkNotNullParameter(events, "events");
            if (kVar != null) {
                long jMin = Math.min(j, 300000L);
                long time = currentSegmentTimestamp.getTime();
                File videoFile = new File(kVar.g(), i + ".mp4");
                Intrinsics.checkNotNullParameter(videoFile, "videoFile");
                long jConvert = 0;
                if (videoFile.exists() && videoFile.length() > 0) {
                    videoFile.delete();
                }
                C4527a c4527a = kVar.j;
                C4527a.C0404a c0404aA2 = c4527a.a();
                ArrayList arrayList = kVar.m;
                try {
                    List arrayList2 = arrayList.isEmpty() ? new ArrayList() : CollectionsKt.f0(arrayList);
                    c0404aA2.close();
                    boolean zIsEmpty = arrayList2.isEmpty();
                    io.sentry.android.replay.d dVar = null;
                    C2688aH1 c2688aH1 = kVar.d;
                    if (zIsEmpty) {
                        c2688aH1.getLogger().a(NG1.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                        str2 = "events";
                    } else {
                        C4527a c4527a2 = kVar.h;
                        C4527a.C0404a c0404aA3 = c4527a2.a();
                        try {
                            str2 = "events";
                            c0404a = c0404aA3;
                            try {
                                io.sentry.android.replay.video.e eVar2 = new io.sentry.android.replay.video.e(c2688aH1, new io.sentry.android.replay.video.a(videoFile, i3, i2, i4, i5));
                                MediaFormat mediaFormat = (MediaFormat) eVar2.e.getValue();
                                MediaCodec mediaCodec = eVar2.d;
                                mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                                eVar2.h = mediaCodec.createInputSurface();
                                mediaCodec.start();
                                eVar2.a(false);
                                c0404a.close();
                                kVar.k = eVar2;
                                long j3 = ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) / ((long) i4);
                                Object objFirstOrNull = CollectionsKt.firstOrNull(arrayList2);
                                long j4 = time + jMin;
                                if (j4 <= Long.MIN_VALUE) {
                                    kotlin.ranges.e.i.getClass();
                                    eVar = kotlin.ranges.e.j;
                                } else {
                                    eVar = new kotlin.ranges.e(time, j4 - 1);
                                }
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                C5796om1.a(j3 > 0, Long.valueOf(j3));
                                kotlin.ranges.d.a aVar = kotlin.ranges.d.h;
                                long j5 = eVar.d;
                                long j6 = eVar.g > 0 ? j3 : -j3;
                                aVar.getClass();
                                long j7 = new kotlin.ranges.d(j5, eVar.e, j6).e;
                                if ((j6 > 0 && j5 <= j7) || (j6 < 0 && j7 <= j5)) {
                                    Object obj4 = objFirstOrNull;
                                    int i8 = 0;
                                    while (true) {
                                        Iterator it = arrayList2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj = obj4;
                                                io.sentry.android.replay.l lVar = (io.sentry.android.replay.l) it.next();
                                                long j8 = j5 + j3;
                                                j2 = j7;
                                                i7 = i8;
                                                long j9 = lVar.b;
                                                if (j5 <= j9 && j9 <= j8) {
                                                    obj2 = lVar;
                                                    break;
                                                }
                                                if (j9 <= j8) {
                                                    i8 = i7;
                                                    obj4 = obj;
                                                    j7 = j2;
                                                }
                                            } else {
                                                obj = obj4;
                                                j2 = j7;
                                                i7 = i8;
                                            }
                                            obj2 = obj;
                                            break;
                                        }
                                        io.sentry.android.replay.l lVar2 = (io.sentry.android.replay.l) obj2;
                                        if (lVar2 != null) {
                                            try {
                                                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(lVar2.a.getAbsolutePath());
                                                C4527a.C0404a c0404aA4 = c4527a2.a();
                                                try {
                                                    io.sentry.android.replay.video.e eVar3 = kVar.k;
                                                    if (eVar3 != null) {
                                                        Intrinsics.checkNotNull(bitmapDecodeFile);
                                                        eVar3.b(bitmapDecodeFile);
                                                        Unit unit = Unit.a;
                                                    }
                                                    c0404aA4.close();
                                                    bitmapDecodeFile.recycle();
                                                    int i9 = i7 + 1;
                                                    Object obj5 = obj2;
                                                    i8 = i9;
                                                    obj4 = obj5;
                                                    list2 = arrayList2;
                                                    if (j5 != j2) {
                                                        i6 = i8;
                                                        break;
                                                    }
                                                    j5 += j6;
                                                    arrayList2 = list2;
                                                    j7 = j2;
                                                } catch (Throwable th) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        C1589Ne.l(c0404aA4, th);
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                c2688aH1.getLogger().d(NG1.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th3);
                                                if (obj2 != null) {
                                                    kVar.f(((io.sentry.android.replay.l) obj2).a);
                                                    c0404aA = c4527a.a();
                                                    try {
                                                        F62.a(arrayList).remove(obj2);
                                                        c0404aA.close();
                                                        list2 = arrayList2;
                                                        list2.remove(obj2);
                                                        i8 = i7;
                                                        obj4 = null;
                                                    } catch (Throwable th4) {
                                                        try {
                                                            throw th4;
                                                        } catch (Throwable th5) {
                                                            C1589Ne.l(c0404aA, th4);
                                                            throw th5;
                                                        }
                                                    }
                                                } else {
                                                    list2 = arrayList2;
                                                    obj4 = obj2;
                                                    i8 = i7;
                                                }
                                            }
                                        }
                                        if (obj2 != null) {
                                            kVar.f(((io.sentry.android.replay.l) obj2).a);
                                            c0404aA = c4527a.a();
                                            F62.a(arrayList).remove(obj2);
                                            c0404aA.close();
                                            list2 = arrayList2;
                                            list2.remove(obj2);
                                            i8 = i7;
                                            obj4 = null;
                                        } else {
                                            list2 = arrayList2;
                                            obj4 = obj2;
                                            i8 = i7;
                                        }
                                        if (j5 != j2) {
                                            i6 = i8;
                                            break;
                                        }
                                        j5 += j6;
                                        arrayList2 = list2;
                                        j7 = j2;
                                    }
                                } else {
                                    i6 = 0;
                                }
                                if (i6 == 0) {
                                    c2688aH1.getLogger().a(NG1.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                                    kVar.f(videoFile);
                                    dVar = null;
                                } else {
                                    C4527a.C0404a c0404aA5 = c4527a2.a();
                                    try {
                                        io.sentry.android.replay.video.e eVar4 = kVar.k;
                                        if (eVar4 != null) {
                                            eVar4.c();
                                        }
                                        io.sentry.android.replay.video.e eVar5 = kVar.k;
                                        if (eVar5 != null) {
                                            io.sentry.android.replay.video.b bVar = eVar5.g;
                                            if (bVar.e != 0) {
                                                jConvert = TimeUnit.MILLISECONDS.convert(bVar.f + bVar.a, TimeUnit.MICROSECONDS);
                                            }
                                        }
                                        long j10 = jConvert;
                                        kVar.k = null;
                                        Unit unit2 = Unit.a;
                                        c0404aA5.close();
                                        kVar.l(j4);
                                        dVar = new io.sentry.android.replay.d(videoFile, i6, j10);
                                    } catch (Throwable th6) {
                                        try {
                                            throw th6;
                                        } catch (Throwable th7) {
                                            C1589Ne.l(c0404aA5, th6);
                                            throw th7;
                                        }
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                Throwable th9 = th;
                                try {
                                    throw th9;
                                } catch (Throwable th10) {
                                    C1589Ne.l(c0404a, th9);
                                    throw th10;
                                }
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            c0404a = c0404aA3;
                        }
                    }
                    if (dVar != null) {
                        if (list == null) {
                            C3027bp1 c3027bp1 = new C3027bp1();
                            c3027bp1.d = C5653o60.d;
                            if (sd1 != null) {
                                sd1.A(null, new C4191hO1(c3027bp1, 2));
                            }
                            list3 = (List) c3027bp1.d;
                        } else {
                            list3 = list;
                        }
                        long time2 = currentSegmentTimestamp.getTime();
                        long j11 = dVar.c;
                        Date dateI = N7.i(time2 + j11);
                        Intrinsics.checkNotNullExpressionValue(dateI, "getDateTime(...)");
                        C2912bH1 c2912bH1 = new C2912bH1();
                        c2912bH1.d = replayId;
                        c2912bH1.w = replayId;
                        c2912bH1.x = i;
                        c2912bH1.y = dateI;
                        c2912bH1.z = currentSegmentTimestamp;
                        c2912bH1.v = replayType;
                        File file = dVar.a;
                        c2912bH1.t = file;
                        ArrayList arrayList3 = new ArrayList();
                        io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
                        gVar.e = currentSegmentTimestamp.getTime();
                        gVar.h = i2;
                        gVar.i = i3;
                        arrayList3.add(gVar);
                        io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
                        jVar.e = currentSegmentTimestamp.getTime();
                        jVar.h = i;
                        jVar.j = j11;
                        jVar.o = dVar.b;
                        jVar.i = file.length();
                        jVar.q = i4;
                        jVar.m = i2;
                        jVar.n = i3;
                        jVar.r = 0;
                        jVar.s = 0;
                        arrayList3.add(jVar);
                        LinkedList linkedList = new LinkedList();
                        C0702Bu c0702Bu = null;
                        for (C0702Bu c0702Bu2 : list3) {
                            if (c0702Bu == null || !Intrinsics.a(c0702Bu.k, "network.event")) {
                                z = false;
                            } else {
                                ConcurrentHashMap concurrentHashMap = c0702Bu.j;
                                Intrinsics.checkNotNullExpressionValue(concurrentHashMap, "getData(...)");
                                Object obj6 = concurrentHashMap.get("action");
                                if (obj6 == null) {
                                    obj6 = null;
                                }
                                if (Intrinsics.a(obj6, "NETWORK_AVAILABLE") && Intrinsics.a(c0702Bu2.k, "network.event") && c0702Bu2.j.containsKey("network_type") && c0702Bu2.e().getTime() + 5000 >= currentSegmentTimestamp.getTime()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if ((c0702Bu2.e().getTime() >= currentSegmentTimestamp.getTime() || z) && c0702Bu2.e().getTime() < dateI.getTime() && (bVarA = options.getReplayController().getR().a(c0702Bu2)) != null) {
                                arrayList3.add(bVarA);
                                io.sentry.rrweb.a aVar2 = bVarA instanceof io.sentry.rrweb.a ? (io.sentry.rrweb.a) bVarA : null;
                                if (Intrinsics.a(aVar2 != null ? aVar2.j : null, "navigation")) {
                                    io.sentry.rrweb.a aVar3 = (io.sentry.rrweb.a) bVarA;
                                    ConcurrentHashMap concurrentHashMap2 = aVar3.m;
                                    if (concurrentHashMap2 != null) {
                                        Intrinsics.checkNotNull(concurrentHashMap2);
                                        obj3 = concurrentHashMap2.get("to");
                                        if (obj3 == null) {
                                            obj3 = null;
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 instanceof String) {
                                        ConcurrentHashMap concurrentHashMap3 = aVar3.m;
                                        Intrinsics.checkNotNull(concurrentHashMap3);
                                        Object obj7 = concurrentHashMap3.get("to");
                                        Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                                        linkedList.add((String) obj7);
                                    }
                                }
                            }
                            c0702Bu = c0702Bu2;
                        }
                        if (str != null && !Intrinsics.a(CollectionsKt.firstOrNull(linkedList), str)) {
                            linkedList.addFirst(str);
                        }
                        long time3 = dateI.getTime();
                        y yVar = new y(currentSegmentTimestamp, arrayList3);
                        Intrinsics.checkNotNullParameter(events, str2);
                        Iterator it2 = events.iterator();
                        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
                        while (it2.hasNext()) {
                            io.sentry.rrweb.b bVar2 = (io.sentry.rrweb.b) it2.next();
                            if (bVar2.e < time3) {
                                Intrinsics.checkNotNull(bVar2);
                                yVar.invoke(bVar2);
                                it2.remove();
                            }
                        }
                        if (i == 0) {
                            io.sentry.rrweb.h hVar = new io.sentry.rrweb.h();
                            HashMap map = hVar.h;
                            io.sentry.protocol.r sdkVersion = options.getSdkVersion();
                            if (sdkVersion != null) {
                                map.put("nativeSdkName", sdkVersion.d);
                                map.put("nativeSdkVersion", sdkVersion.e);
                            }
                            C3121cH1 sessionReplay = options.getSessionReplay();
                            map.put("errorSampleRate", sessionReplay.e);
                            map.put("sessionSampleRate", sessionReplay.d);
                            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) sessionReplay.a;
                            map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.ImageView")));
                            map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.TextView")));
                            map.put("quality", sessionReplay.f.serializedName());
                            map.put("maskedViewClasses", copyOnWriteArraySet);
                            map.put("unmaskedViewClasses", (CopyOnWriteArraySet) sessionReplay.b);
                            map.put("screenshotStrategy", sessionReplay.n == EnumC4161hE1.PIXEL_COPY ? "pixelCopy" : "canvas");
                            map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.o.isEmpty()));
                            if (!sessionReplay.o.isEmpty()) {
                                map.put("networkDetailAllowUrls", sessionReplay.o);
                                map.put("networkRequestHeaders", sessionReplay.r);
                                map.put("networkResponseHeaders", sessionReplay.s);
                                map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.q));
                                if (!sessionReplay.p.isEmpty()) {
                                    map.put("networkDetailDenyUrls", sessionReplay.p);
                                }
                            }
                            arrayList3.add(hVar);
                        }
                        C2257Vr1 c2257Vr1 = new C2257Vr1();
                        c2257Vr1.d = Integer.valueOf(i);
                        c2257Vr1.e = CollectionsKt.Z(arrayList3, new z());
                        c2912bH1.A = linkedList;
                        return new b.a(c2912bH1, c2257Vr1);
                    }
                } catch (Throwable th12) {
                    try {
                        throw th12;
                    } catch (Throwable th13) {
                        C1589Ne.l(c0404aA2, th12);
                        throw th13;
                    }
                }
            }
            return b.C0386b.a;
        }
    }

    @StabilityInferred(parameters = 1)
    public static abstract class b {

        @StabilityInferred(parameters = 0)
        public static final class a extends b {

            @NotNull
            public final C2912bH1 a;

            @NotNull
            public final C2257Vr1 b;

            public a(@NotNull C2912bH1 replay, @NotNull C2257Vr1 recording) {
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                this.a = replay;
                this.b = recording;
            }

            public static void a(a aVar, InterfaceC1171Hu0 interfaceC1171Hu0) {
                C0841Do0 hint = new C0841Do0();
                aVar.getClass();
                Intrinsics.checkNotNullParameter(hint, "hint");
                if (interfaceC1171Hu0 != null) {
                    hint.g = aVar.b;
                    Unit unit = Unit.a;
                    interfaceC1171Hu0.v(aVar.a, hint);
                }
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.a(this.a, aVar.a) && Intrinsics.a(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "Created(replay=" + this.a + ", recording=" + this.b + ')';
            }
        }

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.A$b$b, reason: collision with other inner class name */
        @StabilityInferred(parameters = 1)
        public static final class C0386b extends b {

            @NotNull
            public static final C0386b a = new C0386b();
        }
    }

    void a(int i, @NotNull io.sentry.protocol.u uVar, @Nullable C2912bH1.b bVar);

    void b();

    void c(boolean z, @NotNull ReplayIntegration.c cVar);

    void d(@NotNull MotionEvent motionEvent);

    void e();

    @NotNull
    io.sentry.protocol.u f();

    @NotNull
    A g();

    void h(@Nullable Date date);

    void i(int i);

    int j();

    void k(@NotNull ReplayIntegration.d dVar);

    void m(@NotNull io.sentry.android.replay.u uVar);

    void stop();
}

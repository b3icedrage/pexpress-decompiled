package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import defpackage.C2432Xo;
import defpackage.C6180qd1;
import defpackage.InterfaceC1405Ku0;
import defpackage.N7;
import defpackage.NG1;
import defpackage.RunnableC2214Vd0;
import defpackage.WG1;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.android.core.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4508t {

    @NotNull
    public final File b;
    public final int c;

    @Nullable
    public String f;

    @NotNull
    public final io.sentry.android.core.internal.util.v g;

    @Nullable
    public final io.sentry.util.l.a<InterfaceC1405Ku0> l;

    @NotNull
    public final ILogger m;
    public long a = 0;

    @Nullable
    public Future<?> d = null;

    @Nullable
    public File e = null;

    @NotNull
    public final ArrayDeque<io.sentry.profilemeasurements.b> h = new ArrayDeque<>();

    @NotNull
    public final ArrayDeque<io.sentry.profilemeasurements.b> i = new ArrayDeque<>();

    @NotNull
    public final ArrayDeque<io.sentry.profilemeasurements.b> j = new ArrayDeque<>();

    @NotNull
    public final HashMap k = new HashMap();
    public volatile boolean n = false;

    @NotNull
    public final C4527a o = new C4527a();

    /* JADX INFO: renamed from: io.sentry.android.core.t$a */
    public class a implements io.sentry.android.core.internal.util.v.a {
        public float a = 0.0f;

        public a() {
        }

        @Override // io.sentry.android.core.internal.util.v.a
        public final void d(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
            long jI = new WG1().i();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime());
            C4508t c4508t = C4508t.this;
            long j5 = jElapsedRealtimeNanos - c4508t.a;
            if (j5 < 0) {
                return;
            }
            if (z2) {
                c4508t.j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Long.valueOf(j3), jI));
            } else if (z) {
                c4508t.i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Long.valueOf(j3), jI));
            }
            if (f != this.a) {
                this.a = f;
                c4508t.h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Float.valueOf(f), jI));
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.core.t$b */
    public static class b {
        public final long a;
        public final long b;

        @NotNull
        public final File c;

        @NotNull
        public final HashMap d;
        public final boolean e;

        public b(long j, long j2, boolean z, @NotNull File file, @NotNull HashMap map) {
            this.a = j;
            this.c = file;
            this.b = j2;
            this.d = map;
            this.e = z;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.core.t$c */
    public static class c {
        public final long a;
        public final long b;

        @NotNull
        public final Date c;

        public c(long j, long j2, @NotNull Date date) {
            this.a = j;
            this.b = j2;
            this.c = date;
        }
    }

    public C4508t(@NotNull String str, int i, @NotNull io.sentry.android.core.internal.util.v vVar, @Nullable io.sentry.util.l.a<InterfaceC1405Ku0> aVar, @NotNull ILogger iLogger) {
        io.sentry.util.p.b(str, "TracesFilesDirPath is required");
        this.b = new File(str);
        this.c = i;
        io.sentry.util.p.b(iLogger, "Logger is required");
        this.m = iLogger;
        this.l = aVar;
        io.sentry.util.p.b(vVar, "SentryFrameMetricsCollector is required");
        this.g = vVar;
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public final b a(@Nullable List list, boolean z) {
        C4527a.C0404a c0404aA = this.o.a();
        try {
            if (!this.n) {
                this.m.a(NG1.WARNING, "Profiler not running", new Object[0]);
                c0404aA.close();
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } catch (Throwable th) {
                try {
                    this.m.d(NG1.ERROR, "Error while stopping profiling: ", th);
                } catch (Throwable th2) {
                    this.n = false;
                    throw th2;
                }
            }
            this.n = false;
            this.g.a(this.f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.e == null) {
                this.m.a(NG1.ERROR, "Trace file does not exists", new Object[0]);
                c0404aA.close();
                return null;
            }
            if (!this.i.isEmpty()) {
                this.k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.i));
            }
            if (!this.j.isEmpty()) {
                this.k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.j));
            }
            if (!this.h.isEmpty()) {
                this.k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.h));
            }
            b(list);
            Future<?> future = this.d;
            if (future != null) {
                future.cancel(true);
                this.d = null;
            }
            b bVar = new b(jElapsedRealtimeNanos, elapsedCpuTime, z, this.e, this.k);
            c0404aA.close();
            return bVar;
        } catch (Throwable th3) {
            try {
                c0404aA.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public final void b(@Nullable List<C6180qd1> list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    for (C6180qd1 c6180qd1 : list) {
                        long j = c6180qd1.d;
                        long j2 = j + jElapsedRealtimeNanos;
                        Double d = c6180qd1.a;
                        Long l = c6180qd1.b;
                        Long l2 = c6180qd1.c;
                        if (d != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j2), d, j));
                        }
                        if (l != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j2), l, j));
                        }
                        if (l2 != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j2), l2, j));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public final c c() {
        String strH;
        C4527a.C0404a c0404aA = this.o.a();
        try {
            int i = this.c;
            if (i == 0) {
                this.m.a(NG1.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
                c0404aA.close();
                return null;
            }
            if (this.n) {
                this.m.a(NG1.WARNING, "Profiling has already started...", new Object[0]);
                c0404aA.close();
                return null;
            }
            this.e = new File(this.b, C2432Xo.h().concat(".trace"));
            this.k.clear();
            this.h.clear();
            this.i.clear();
            this.j.clear();
            io.sentry.android.core.internal.util.v vVar = this.g;
            a aVar = new a();
            if (vVar.k) {
                strH = C2432Xo.h();
                vVar.j.put(strH, aVar);
                vVar.b();
            } else {
                strH = null;
            }
            this.f = strH;
            try {
                io.sentry.util.l.a<InterfaceC1405Ku0> aVar2 = this.l;
                if (aVar2 != null) {
                    this.d = aVar2.b().c(new RunnableC2214Vd0(this, 4), 30000L);
                }
            } catch (RejectedExecutionException e) {
                this.m.d(NG1.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
            }
            this.a = SystemClock.elapsedRealtimeNanos();
            Date dateH = N7.h();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.e.getPath(), 3000000, this.c);
                this.n = true;
                c cVar = new c(this.a, elapsedCpuTime, dateH);
                c0404aA.close();
                return cVar;
            } catch (Throwable th) {
                a(null, false);
                this.m.d(NG1.ERROR, "Unable to start a profile: ", th);
                this.n = false;
                c0404aA.close();
                return null;
            }
        } catch (Throwable th2) {
            try {
                c0404aA.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}

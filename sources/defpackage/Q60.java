package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class Q60 {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final C4376iG0 a;
    public final C6561sS b;
    public final SU0 c;
    public final b d;
    public final C6657st1 e;
    public final a f;
    public final T6 g;

    public static class a {
        public final c a;
        public final C5751ob0.c b = C5751ob0.a(150, new C0129a());
        public int c;

        /* JADX INFO: renamed from: Q60$a$a, reason: collision with other inner class name */
        public class C0129a implements C5751ob0.b<RunnableC6777tU<?>> {
            public C0129a() {
            }

            @Override // defpackage.C5751ob0.b
            public final RunnableC6777tU<?> a() {
                a aVar = a.this;
                return new RunnableC6777tU<>(aVar.a, aVar.b);
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }
    }

    public static class b {
        public final ExecutorServiceC2238Vl0 a;
        public final ExecutorServiceC2238Vl0 b;
        public final ExecutorServiceC2238Vl0 c;
        public final ExecutorServiceC2238Vl0 d;
        public final Q60 e;
        public final Q60 f;
        public final C5751ob0.c g = C5751ob0.a(150, new a());

        public class a implements C5751ob0.b<U60<?>> {
            public a() {
            }

            @Override // defpackage.C5751ob0.b
            public final U60<?> a() {
                b bVar = b.this;
                return new U60<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        public b(ExecutorServiceC2238Vl0 executorServiceC2238Vl0, ExecutorServiceC2238Vl0 executorServiceC2238Vl1, ExecutorServiceC2238Vl0 executorServiceC2238Vl2, ExecutorServiceC2238Vl0 executorServiceC2238Vl3, Q60 q60, Q60 q61) {
            this.a = executorServiceC2238Vl0;
            this.b = executorServiceC2238Vl1;
            this.c = executorServiceC2238Vl2;
            this.d = executorServiceC2238Vl3;
            this.e = q60;
            this.f = q61;
        }
    }

    public static class c {
        public final NK0 a;
        public volatile Z10 b;

        public c(NK0 nk0) {
            this.a = nk0;
        }

        public final Z10 a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            File cacheDir = ((Context) ((ZB0) this.a.d).a).getCacheDir();
                            C4116h20 c4116h20 = null;
                            File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                            if (file != null && (file.isDirectory() || file.mkdirs())) {
                                c4116h20 = new C4116h20(file);
                            }
                            this.b = c4116h20;
                        }
                        if (this.b == null) {
                            this.b = new C5189lv();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.b;
        }
    }

    public class d {
        public final U60<?> a;
        public final DM1 b;

        public d(DM1 dm1, U60 u60) {
            this.b = dm1;
            this.a = u60;
        }
    }

    public Q60(SU0 su0, NK0 nk0, ExecutorServiceC2238Vl0 executorServiceC2238Vl0, ExecutorServiceC2238Vl0 executorServiceC2238Vl1, ExecutorServiceC2238Vl0 executorServiceC2238Vl2, ExecutorServiceC2238Vl0 executorServiceC2238Vl3) throws Throwable {
        this.c = su0;
        c cVar = new c(nk0);
        T6 t6 = new T6();
        this.g = t6;
        synchronized (this) {
            try {
                synchronized (t6) {
                    try {
                        try {
                            t6.d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.b = new C6561sS();
                this.a = new C4376iG0();
                this.d = new b(executorServiceC2238Vl0, executorServiceC2238Vl1, executorServiceC2238Vl2, executorServiceC2238Vl3, this, this);
                this.f = new a(cVar);
                this.e = new C6657st1();
                su0.d = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void e(InterfaceC3667et1 interfaceC3667et1) {
        if (!(interfaceC3667et1 instanceof W60)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((W60) interfaceC3667et1).e();
    }

    public final d a(C2082Tl0 c2082Tl0, Object obj, InterfaceC3129cK0 interfaceC3129cK0, int i, int i2, Class cls, Class cls2, EnumC7035uh1 enumC7035uh1, AbstractC2634a20 abstractC2634a20, C6667sx c6667sx, boolean z, boolean z2, C4227ha1 c4227ha1, boolean z3, boolean z4, boolean z5, DM1 dm1, Executor executor) {
        long jElapsedRealtimeNanos;
        if (h) {
            int i3 = C6562sS0.a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.b.getClass();
        V60 v60 = new V60(obj, interfaceC3129cK0, i, i2, c6667sx, cls, cls2, c4227ha1);
        synchronized (this) {
            try {
                W60<?> w60B = b(v60, z3, jElapsedRealtimeNanos);
                if (w60B == null) {
                    return f(c2082Tl0, obj, interfaceC3129cK0, i, i2, cls, cls2, enumC7035uh1, abstractC2634a20, c6667sx, z, z2, c4227ha1, z3, z4, z5, dm1, executor, v60, jElapsedRealtimeNanos);
                }
                dm1.h(w60B, CS.i, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0092 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.W60<?> b(defpackage.V60 r7, boolean r8, long r9) throws java.lang.Throwable {
        /*
            r6 = this;
            r9 = 0
            if (r8 != 0) goto L6
            r5 = r6
            goto L8c
        L6:
            T6 r8 = r6.g
            monitor-enter(r8)
            java.util.HashMap r10 = r8.b     // Catch: java.lang.Throwable -> L94
            java.lang.Object r10 = r10.get(r7)     // Catch: java.lang.Throwable -> L94
            T6$a r10 = (T6.a) r10     // Catch: java.lang.Throwable -> L94
            if (r10 != 0) goto L16
            monitor-exit(r8)
            r0 = r9
            goto L28
        L16:
            java.lang.Object r0 = r10.get()     // Catch: java.lang.Throwable -> L94
            W60 r0 = (defpackage.W60) r0     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L27
            r8.b(r10)     // Catch: java.lang.Throwable -> L22
            goto L27
        L22:
            r0 = move-exception
            r7 = r0
            r5 = r6
            goto L97
        L27:
            monitor-exit(r8)
        L28:
            if (r0 == 0) goto L2d
            r0.a()
        L2d:
            if (r0 == 0) goto L3c
            boolean r8 = defpackage.Q60.h
            if (r8 == 0) goto L3b
            int r8 = defpackage.C6562sS0.a
            android.os.SystemClock.elapsedRealtimeNanos()
            java.util.Objects.toString(r7)
        L3b:
            return r0
        L3c:
            SU0 r10 = r6.c
            monitor-enter(r10)
            java.util.LinkedHashMap r8 = r10.a     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r8 = r8.remove(r7)     // Catch: java.lang.Throwable -> L8d
            QU0$a r8 = (QU0.a) r8     // Catch: java.lang.Throwable -> L8d
            if (r8 != 0) goto L4c
            monitor-exit(r10)
            r8 = r9
            goto L57
        L4c:
            long r0 = r10.c     // Catch: java.lang.Throwable -> L8d
            int r2 = r8.b     // Catch: java.lang.Throwable -> L8d
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L8d
            long r0 = r0 - r2
            r10.c = r0     // Catch: java.lang.Throwable -> L8d
            Y r8 = r8.a     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r10)
        L57:
            r1 = r8
            et1 r1 = (defpackage.InterfaceC3667et1) r1
            if (r1 != 0) goto L60
            r5 = r6
            r4 = r7
            r1 = r9
            goto L73
        L60:
            boolean r8 = r1 instanceof defpackage.W60
            if (r8 == 0) goto L69
            W60 r1 = (defpackage.W60) r1
            r5 = r6
            r4 = r7
            goto L73
        L69:
            W60 r0 = new W60
            r2 = 1
            r3 = 1
            r5 = r6
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
        L73:
            if (r1 == 0) goto L7d
            r1.a()
            T6 r7 = r5.g
            r7.a(r4, r1)
        L7d:
            if (r1 == 0) goto L8c
            boolean r7 = defpackage.Q60.h
            if (r7 == 0) goto L8b
            int r7 = defpackage.C6562sS0.a
            android.os.SystemClock.elapsedRealtimeNanos()
            java.util.Objects.toString(r4)
        L8b:
            return r1
        L8c:
            return r9
        L8d:
            r0 = move-exception
            r5 = r6
        L8f:
            r7 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L92
            throw r7
        L92:
            r0 = move-exception
            goto L8f
        L94:
            r0 = move-exception
            r5 = r6
        L96:
            r7 = r0
        L97:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L99
            throw r7
        L99:
            r0 = move-exception
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q60.b(V60, boolean, long):W60");
    }

    public final synchronized void c(U60 u60, V60 v60, W60 w60) {
        if (w60 != null) {
            try {
                if (w60.d) {
                    this.g.a(v60, w60);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C4376iG0 c4376iG0 = this.a;
        c4376iG0.getClass();
        HashMap map = (HashMap) (u60.r ? c4376iG0.e : c4376iG0.d);
        if (u60.equals(map.get(v60))) {
            map.remove(v60);
        }
    }

    public final void d(V60 v60, W60 w60) {
        T6 t6 = this.g;
        synchronized (t6) {
            T6.a aVar = (T6.a) t6.b.remove(v60);
            if (aVar != null) {
                aVar.c = null;
                aVar.clear();
            }
        }
        if (w60.d) {
            this.c.d(v60, w60);
        } else {
            this.e.a(w60, false);
        }
    }

    public final d f(C2082Tl0 c2082Tl0, Object obj, InterfaceC3129cK0 interfaceC3129cK0, int i, int i2, Class cls, Class cls2, EnumC7035uh1 enumC7035uh1, AbstractC2634a20 abstractC2634a20, C6667sx c6667sx, boolean z, boolean z2, C4227ha1 c4227ha1, boolean z3, boolean z4, boolean z5, DM1 dm1, Executor executor, V60 v60, long j) {
        Executor executor2;
        C4376iG0 c4376iG0 = this.a;
        U60 u60 = (U60) ((HashMap) (z5 ? c4376iG0.e : c4376iG0.d)).get(v60);
        if (u60 != null) {
            u60.a(dm1, executor);
            if (h) {
                int i3 = C6562sS0.a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(v60);
            }
            return new d(dm1, u60);
        }
        U60 u61 = (U60) this.d.g.a();
        synchronized (u61) {
            u61.o = v60;
            u61.p = z3;
            u61.q = z4;
            u61.r = z5;
        }
        a aVar = this.f;
        RunnableC6777tU<R> runnableC6777tU = (RunnableC6777tU) aVar.b.a();
        int i4 = aVar.c;
        aVar.c = i4 + 1;
        C6567sU<R> c6567sU = runnableC6777tU.d;
        c6567sU.c = c2082Tl0;
        c6567sU.d = obj;
        c6567sU.n = interfaceC3129cK0;
        c6567sU.e = i;
        c6567sU.f = i2;
        c6567sU.p = abstractC2634a20;
        c6567sU.g = cls;
        c6567sU.h = runnableC6777tU.h;
        c6567sU.k = cls2;
        c6567sU.o = enumC7035uh1;
        c6567sU.i = c4227ha1;
        c6567sU.j = c6667sx;
        c6567sU.q = z;
        c6567sU.r = z2;
        runnableC6777tU.l = c2082Tl0;
        runnableC6777tU.m = interfaceC3129cK0;
        runnableC6777tU.n = enumC7035uh1;
        runnableC6777tU.o = v60;
        runnableC6777tU.p = i;
        runnableC6777tU.q = i2;
        runnableC6777tU.r = abstractC2634a20;
        runnableC6777tU.x = z5;
        runnableC6777tU.s = c4227ha1;
        runnableC6777tU.t = u61;
        runnableC6777tU.u = i4;
        runnableC6777tU.w = RunnableC6777tU.d.d;
        runnableC6777tU.y = obj;
        C4376iG0 c4376iG1 = this.a;
        c4376iG1.getClass();
        ((HashMap) (u61.r ? c4376iG1.e : c4376iG1.d)).put(v60, u61);
        u61.a(dm1, executor);
        synchronized (u61) {
            u61.y = runnableC6777tU;
            RunnableC6777tU.e eVarN = runnableC6777tU.n(RunnableC6777tU.e.d);
            if (eVarN == RunnableC6777tU.e.e || eVarN == RunnableC6777tU.e.g) {
                executor2 = u61.k;
            } else {
                executor2 = u61.q ? u61.m : u61.l;
            }
            executor2.execute(runnableC6777tU);
        }
        if (h) {
            int i5 = C6562sS0.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(v60);
        }
        return new d(dm1, u61);
    }
}

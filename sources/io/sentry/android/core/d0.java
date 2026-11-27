package io.sentry.android.core;

import android.view.Choreographer;
import defpackage.AbstractC3118cG1;
import defpackage.C2432Xo;
import defpackage.C5017l51;
import defpackage.C5440n51;
import defpackage.InterfaceC2347Wu0;
import defpackage.InterfaceC4302hv0;
import defpackage.InterfaceC5820ou0;
import defpackage.PF0;
import defpackage.WG1;
import io.sentry.util.C4527a;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements InterfaceC5820ou0, io.sentry.android.core.internal.util.v.a {
    public static final long h = TimeUnit.SECONDS.toNanos(1);
    public static final WG1 i = new WG1(new Date(0), 0);
    public final boolean a;

    @NotNull
    public final io.sentry.android.core.internal.util.v c;

    @Nullable
    public volatile String d;

    @NotNull
    public final C4527a b = new C4527a();

    @NotNull
    public final TreeSet e = new TreeSet(new PF0(1));

    @NotNull
    public final ConcurrentSkipListSet<a> f = new ConcurrentSkipListSet<>();
    public long g = 16666666;

    public static class a implements Comparable<a> {
        public final long d;
        public final long e;
        public final long g;
        public final long h;
        public final boolean i;
        public final boolean j;
        public final long k;

        public a(long j) {
            this(j, j, 0L, 0L, false, false, 0L);
        }

        @Override // java.lang.Comparable
        public final int compareTo(@NotNull a aVar) {
            return Long.compare(this.e, aVar.e);
        }

        public a(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5) {
            this.d = j;
            this.e = j2;
            this.g = j3;
            this.h = j4;
            this.i = z;
            this.j = z2;
            this.k = j5;
        }
    }

    public d0(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull io.sentry.android.core.internal.util.v vVar) {
        this.c = vVar;
        this.a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static long f(@NotNull AbstractC3118cG1 abstractC3118cG1) {
        if (abstractC3118cG1 instanceof WG1) {
            return abstractC3118cG1.e(i);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - abstractC3118cG1.i());
    }

    /* JADX WARN: Code duplicated, block: B:91:0x017c  */
    @Override // defpackage.InterfaceC5820ou0
    public final void b(@NotNull InterfaceC2347Wu0 interfaceC2347Wu0) throws Throwable {
        C4527a.C0404a c0404a;
        Throwable th;
        AbstractC3118cG1 abstractC3118cG1X;
        TreeSet treeSet;
        int i2;
        ConcurrentSkipListSet<a> concurrentSkipListSet;
        int i3;
        int i4;
        long j;
        long j2;
        long j3;
        long jLongValue;
        Field field;
        TreeSet treeSet2;
        Iterator<a> it;
        ConcurrentSkipListSet<a> concurrentSkipListSet2;
        if (!this.a || (interfaceC2347Wu0 instanceof C5017l51) || (interfaceC2347Wu0 instanceof C5440n51)) {
            return;
        }
        C4527a c4527a = this.b;
        C4527a.C0404a c0404aA = c4527a.a();
        TreeSet treeSet3 = this.e;
        try {
            if (!treeSet3.contains(interfaceC2347Wu0)) {
                c0404aA.close();
                return;
            }
            c0404aA.close();
            C4527a.C0404a c0404aA2 = c4527a.a();
            try {
                boolean zRemove = treeSet3.remove(interfaceC2347Wu0);
                ConcurrentSkipListSet<a> concurrentSkipListSet3 = this.f;
                if (zRemove && (abstractC3118cG1X = interfaceC2347Wu0.x()) != null) {
                    long jF = f(interfaceC2347Wu0.B());
                    long jF2 = f(abstractC3118cG1X);
                    long j4 = jF2 - jF;
                    if (j4 <= 0) {
                        c0404aA2.close();
                        treeSet = treeSet3;
                        concurrentSkipListSet = concurrentSkipListSet3;
                    } else {
                        long j5 = this.g;
                        if (concurrentSkipListSet3.isEmpty()) {
                            c0404a = c0404aA2;
                            treeSet = treeSet3;
                            i2 = 1;
                            concurrentSkipListSet = concurrentSkipListSet3;
                            i3 = 0;
                            i4 = 0;
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                        } else {
                            i2 = 1;
                            Iterator<a> it2 = concurrentSkipListSet3.tailSet(new a(jF)).iterator();
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                            i3 = 0;
                            i4 = 0;
                            while (it2.hasNext()) {
                                a next = it2.next();
                                long j6 = next.d;
                                if (j6 > jF2) {
                                    break;
                                }
                                long j7 = next.h;
                                long j8 = next.k;
                                long j9 = next.e;
                                if (j6 < jF || j9 > jF2) {
                                    if ((jF > j6 && jF < j9) || (jF2 > j6 && jF2 < j9)) {
                                        c0404a = c0404aA2;
                                        treeSet2 = treeSet3;
                                        it = it2;
                                        concurrentSkipListSet2 = concurrentSkipListSet3;
                                        try {
                                            long jMin = Math.min(j7 - Math.max(0L, Math.max(0L, jF - j6) - j8), j4);
                                            long jMin2 = Math.min(jF2, j9) - Math.max(jF, next.d);
                                            int i5 = io.sentry.android.core.internal.util.v.t;
                                            boolean z = jMin2 > j8;
                                            j += jMin2;
                                            if (jMin2 > io.sentry.android.core.internal.util.v.s) {
                                                j3 += jMin;
                                                i4++;
                                            } else if (z) {
                                                j2 += jMin;
                                                i3++;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                    c0404aA2 = c0404a;
                                    treeSet3 = treeSet2;
                                    concurrentSkipListSet3 = concurrentSkipListSet2;
                                    it2 = it;
                                    j5 = j8;
                                } else {
                                    try {
                                        long j10 = next.g;
                                        boolean z2 = next.i;
                                        j += j10;
                                        if (next.j) {
                                            j3 += j7;
                                            i4++;
                                        } else if (z2) {
                                            j2 += j7;
                                            i3++;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c0404a = c0404aA2;
                                    }
                                }
                                c0404a = c0404aA2;
                                treeSet2 = treeSet3;
                                it = it2;
                                concurrentSkipListSet2 = concurrentSkipListSet3;
                                c0404aA2 = c0404a;
                                treeSet3 = treeSet2;
                                concurrentSkipListSet3 = concurrentSkipListSet2;
                                it2 = it;
                                j5 = j8;
                                th = th2;
                                th = th;
                                try {
                                    c0404a.close();
                                    throw th;
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                    throw th;
                                }
                            }
                            c0404a = c0404aA2;
                            treeSet = treeSet3;
                            concurrentSkipListSet = concurrentSkipListSet3;
                            j5 = j5;
                        }
                        int iCeil = i3 + i4;
                        io.sentry.android.core.internal.util.v vVar = this.c;
                        Choreographer choreographer = vVar.n;
                        if (choreographer == null || (field = vVar.o) == null) {
                            jLongValue = -1;
                        } else {
                            try {
                                Long l = (Long) field.get(choreographer);
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                            } catch (IllegalAccessException unused) {
                            }
                        }
                        if (jLongValue != -1) {
                            long jMax = Math.max(0L, jF2 - jLongValue);
                            if ((jMax > j5 ? i2 : 0) != 0) {
                                int i6 = jMax > io.sentry.android.core.internal.util.v.s ? i2 : 0;
                                long jMax2 = Math.max(0L, jMax - j5);
                                j += jMax;
                                if (i6 != 0) {
                                    j3 += jMax2;
                                    i4++;
                                } else {
                                    j2 += jMax2;
                                    i3++;
                                }
                            } else {
                                i2 = 0;
                            }
                            long j11 = j4 - j;
                            iCeil = iCeil + i2 + (j11 > 0 ? (int) Math.ceil(j11 / j5) : 0);
                        }
                        double d = (j2 + j3) / 1.0E9d;
                        interfaceC2347Wu0.m(Integer.valueOf(iCeil), "frames.total");
                        interfaceC2347Wu0.m(Integer.valueOf(i3), "frames.slow");
                        interfaceC2347Wu0.m(Integer.valueOf(i4), "frames.frozen");
                        interfaceC2347Wu0.m(Double.valueOf(d), "frames.delay");
                        if (interfaceC2347Wu0 instanceof InterfaceC4302hv0) {
                            interfaceC2347Wu0.h(Integer.valueOf(iCeil), "frames_total");
                            interfaceC2347Wu0.h(Integer.valueOf(i3), "frames_slow");
                            interfaceC2347Wu0.h(Integer.valueOf(i4), "frames_frozen");
                            interfaceC2347Wu0.h(Double.valueOf(d), "frames_delay");
                        }
                        c0404a.close();
                    }
                } else {
                    c0404aA2.close();
                    treeSet = treeSet3;
                    concurrentSkipListSet = concurrentSkipListSet3;
                }
                C4527a.C0404a c0404aA3 = c4527a.a();
                try {
                    if (treeSet.isEmpty()) {
                        clear();
                    } else {
                        concurrentSkipListSet.headSet(new a(f(((InterfaceC2347Wu0) treeSet.first()).B()))).clear();
                    }
                    c0404aA3.close();
                } catch (Throwable th5) {
                    try {
                        c0404aA3.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                c0404a = c0404aA2;
            }
        } catch (Throwable th8) {
            try {
                c0404aA.close();
                throw th8;
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
                throw th8;
            }
        }
    }

    @Override // defpackage.InterfaceC5820ou0
    public final void clear() {
        C4527a.C0404a c0404aA = this.b.a();
        try {
            if (this.d != null) {
                this.c.a(this.d);
                this.d = null;
            }
            this.f.clear();
            this.e.clear();
            c0404aA.close();
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.internal.util.v.a
    public final void d(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        ConcurrentSkipListSet<a> concurrentSkipListSet = this.f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j5 = (long) (h / ((double) f));
        this.g = j5;
        if (z || z2) {
            concurrentSkipListSet.add(new a(j, j2, j3, j4, z, z2, j5));
        }
    }

    @Override // defpackage.InterfaceC5820ou0
    public final void e(@NotNull InterfaceC2347Wu0 interfaceC2347Wu0) {
        String str;
        if (!this.a || (interfaceC2347Wu0 instanceof C5017l51) || (interfaceC2347Wu0 instanceof C5440n51)) {
            return;
        }
        C4527a.C0404a c0404aA = this.b.a();
        try {
            this.e.add(interfaceC2347Wu0);
            if (this.d == null) {
                io.sentry.android.core.internal.util.v vVar = this.c;
                if (vVar.k) {
                    String strH = C2432Xo.h();
                    vVar.j.put(strH, this);
                    vVar.b();
                    str = strH;
                } else {
                    str = null;
                }
                this.d = str;
            }
            c0404aA.close();
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

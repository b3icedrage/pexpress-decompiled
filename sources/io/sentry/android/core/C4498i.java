package io.sentry.android.core;

import defpackage.AbstractC3118cG1;
import defpackage.C1445Lh1;
import defpackage.C2688aH1;
import defpackage.C3290d51;
import defpackage.EnumC5147li1;
import defpackage.EnumC5932pS;
import defpackage.InterfaceC1171Hu0;
import defpackage.InterfaceC1405Ku0;
import defpackage.InterfaceC4761js0;
import defpackage.InterfaceC5394ms0;
import defpackage.JH;
import defpackage.K02;
import defpackage.NG1;
import defpackage.QF1;
import defpackage.RunnableC3848fk2;
import defpackage.VU;
import defpackage.WG1;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.android.core.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4498i implements InterfaceC5394ms0, io.sentry.transport.l.b {
    public final C4527a A;

    @NotNull
    public final ILogger d;

    @Nullable
    public final String e;
    public final int g;

    @NotNull
    public final io.sentry.util.l.a<InterfaceC1405Ku0> h;

    @NotNull
    public final E i;

    @NotNull
    public final io.sentry.android.core.internal.util.v k;

    @Nullable
    public InterfaceC1171Hu0 n;

    @Nullable
    public Future<?> o;

    @Nullable
    public JH p;

    @NotNull
    public io.sentry.protocol.u r;

    @NotNull
    public io.sentry.protocol.u s;

    @NotNull
    public final AtomicBoolean t;

    @NotNull
    public AbstractC3118cG1 u;
    public volatile boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public final C4527a z;
    public boolean j = false;

    @Nullable
    public C4508t l = null;
    public boolean m = false;

    @NotNull
    public final ArrayList q = new ArrayList();

    /* JADX INFO: renamed from: io.sentry.android.core.i$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5147li1.values().length];
            a = iArr;
            try {
                iArr[EnumC5147li1.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC5147li1.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C4498i(@NotNull E e, @NotNull io.sentry.android.core.internal.util.v vVar, @NotNull ILogger iLogger, @Nullable String str, int i, @NotNull io.sentry.util.l.a<InterfaceC1405Ku0> aVar) {
        io.sentry.protocol.u uVar = io.sentry.protocol.u.e;
        this.r = uVar;
        this.s = uVar;
        this.t = new AtomicBoolean(false);
        this.u = new WG1();
        this.v = true;
        this.w = false;
        this.x = false;
        this.y = 0;
        this.z = new C4527a();
        this.A = new C4527a();
        this.d = iLogger;
        this.k = vVar;
        this.i = e;
        this.e = str;
        this.g = i;
        this.h = aVar;
    }

    @Override // defpackage.InterfaceC5394ms0
    public final void a(boolean z) {
        C4527a.C0404a c0404aA = this.z.a();
        try {
            this.y = 0;
            this.w = true;
            if (z) {
                h(false);
                this.t.set(true);
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

    @Override // defpackage.InterfaceC5394ms0
    public final void b(@NotNull EnumC5147li1 enumC5147li1, @NotNull K02 k02) {
        C4527a.C0404a c0404aA = this.z.a();
        try {
            if (this.v) {
                double dC = io.sentry.util.v.a().c();
                Double profileSessionSampleRate = k02.a.getProfileSessionSampleRate();
                this.x = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dC;
                this.v = false;
            }
            if (!this.x) {
                this.d.a(NG1.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                c0404aA.close();
                return;
            }
            int i = a.a[enumC5147li1.ordinal()];
            if (i == 1) {
                if (this.y < 0) {
                    this.y = 0;
                }
                this.y++;
            } else if (i == 2 && this.m) {
                this.d.a(NG1.DEBUG, "Profiler is already running.", new Object[0]);
                c0404aA.close();
                return;
            }
            if (!this.m) {
                this.d.a(NG1.DEBUG, "Started Profiler.", new Object[0]);
                g();
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

    @Override // defpackage.InterfaceC5394ms0
    public final void c(@NotNull EnumC5147li1 enumC5147li1) {
        C4527a.C0404a c0404aA = this.z.a();
        try {
            int i = a.a[enumC5147li1.ordinal()];
            if (i == 1) {
                int i2 = this.y - 1;
                this.y = i2;
                if (i2 > 0) {
                    c0404aA.close();
                    return;
                } else {
                    if (i2 < 0) {
                        this.y = 0;
                    }
                    this.w = true;
                }
            } else if (i == 2) {
                this.w = true;
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

    @Override // defpackage.InterfaceC5394ms0
    public final void d() {
        this.v = true;
    }

    @Override // defpackage.InterfaceC5394ms0
    @NotNull
    public final io.sentry.protocol.u e() {
        return this.r;
    }

    public final void f() {
        InterfaceC1171Hu0 interfaceC1171Hu0 = this.n;
        if ((interfaceC1171Hu0 == null || interfaceC1171Hu0 == C3290d51.b) && QF1.e() != C3290d51.b) {
            this.n = QF1.e();
            this.p = QF1.e().p().getCompositePerformanceCollector();
            io.sentry.transport.l lVarH = this.n.h();
            if (lVarH != null) {
                lVarH.h.add(this);
            }
        }
    }

    public final void g() {
        f();
        this.i.getClass();
        boolean z = this.j;
        ILogger iLogger = this.d;
        if (!z) {
            this.j = true;
            String str = this.e;
            if (str == null) {
                iLogger.a(NG1.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i = this.g;
                if (i <= 0) {
                    iLogger.a(NG1.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                } else {
                    this.l = new C4508t(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i, this.k, null, this.d);
                }
            }
        }
        if (this.l == null) {
            return;
        }
        InterfaceC1171Hu0 interfaceC1171Hu0 = this.n;
        if (interfaceC1171Hu0 != null) {
            io.sentry.transport.l lVarH = interfaceC1171Hu0.h();
            if (lVarH != null && (lVarH.f(EnumC5932pS.All) || lVarH.f(EnumC5932pS.ProfileChunkUi))) {
                iLogger.a(NG1.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                h(false);
                return;
            } else {
                if (this.n.p().getConnectionStatusProvider().J0() == InterfaceC4761js0.a.DISCONNECTED) {
                    iLogger.a(NG1.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    h(false);
                    return;
                }
                this.u = this.n.p().getDateProvider().now();
            }
        } else {
            this.u = new WG1();
        }
        if (this.l.c() == null) {
            return;
        }
        this.m = true;
        io.sentry.protocol.u uVar = this.r;
        io.sentry.protocol.u uVar2 = io.sentry.protocol.u.e;
        if (uVar.equals(uVar2)) {
            this.r = new io.sentry.protocol.u();
        }
        if (this.s.equals(uVar2)) {
            this.s = new io.sentry.protocol.u();
        }
        JH jh = this.p;
        if (jh != null) {
            jh.b(this.s.toString());
        }
        try {
            this.o = this.h.b().c(new RunnableC3848fk2(this, 1), 60000L);
        } catch (RejectedExecutionException e) {
            iLogger.d(NG1.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
            this.w = true;
        }
    }

    public final void h(boolean z) {
        f();
        C4527a.C0404a c0404aA = this.z.a();
        try {
            Future<?> future = this.o;
            if (future != null) {
                future.cancel(true);
            }
            if (this.l != null && this.m) {
                this.i.getClass();
                JH jh = this.p;
                C4508t.b bVarA = this.l.a(jh != null ? jh.c(this.s.toString()) : null, false);
                ILogger iLogger = this.d;
                if (bVarA == null) {
                    iLogger.a(NG1.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    C4527a.C0404a c0404aA2 = this.A.a();
                    try {
                        this.q.add(new C1445Lh1.a(this.r, this.s, bVarA.d, bVarA.c, this.u));
                        c0404aA2.close();
                    } catch (Throwable th) {
                        try {
                            c0404aA2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                this.m = false;
                this.s = io.sentry.protocol.u.e;
                InterfaceC1171Hu0 interfaceC1171Hu0 = this.n;
                if (interfaceC1171Hu0 != null) {
                    C2688aH1 c2688aH1P = interfaceC1171Hu0.p();
                    try {
                        c2688aH1P.getExecutorService().submit(new VU(this, c2688aH1P, interfaceC1171Hu0, 2));
                    } catch (Throwable th3) {
                        c2688aH1P.getLogger().d(NG1.DEBUG, "Failed to send profile chunks.", th3);
                    }
                }
                if (!z || this.w) {
                    this.r = io.sentry.protocol.u.e;
                    iLogger.a(NG1.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    iLogger.a(NG1.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    g();
                }
                c0404aA.close();
                return;
            }
            io.sentry.protocol.u uVar = io.sentry.protocol.u.e;
            this.r = uVar;
            this.s = uVar;
            c0404aA.close();
        } catch (Throwable th4) {
            try {
                c0404aA.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @Override // io.sentry.transport.l.b
    public final void l(@NotNull io.sentry.transport.l lVar) {
        if (lVar.f(EnumC5932pS.All) || lVar.f(EnumC5932pS.ProfileChunkUi)) {
            this.d.a(NG1.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            h(false);
        }
    }
}

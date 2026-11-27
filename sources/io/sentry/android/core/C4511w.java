package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import defpackage.C1136Hi1;
import defpackage.C1214Ii1;
import defpackage.C2688aH1;
import defpackage.C6180qd1;
import defpackage.C7581xH1;
import defpackage.InterfaceC1405Ku0;
import defpackage.InterfaceC4302hv0;
import defpackage.InterfaceC4550iv0;
import defpackage.N7;
import defpackage.NG1;
import defpackage.QF1;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.android.core.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4511w implements InterfaceC4550iv0 {

    @NotNull
    public final Context d;

    @NotNull
    public final ILogger e;

    @Nullable
    public final String g;
    public final boolean h;
    public final int i;

    @NotNull
    public final io.sentry.util.l.a<InterfaceC1405Ku0> j;

    @NotNull
    public final E k;

    @NotNull
    public final io.sentry.android.core.internal.util.v n;

    @Nullable
    public volatile C1214Ii1 o;
    public long q;
    public long r;

    @NotNull
    public Date s;
    public boolean l = false;

    @NotNull
    public final AtomicBoolean m = new AtomicBoolean(false);

    @Nullable
    public volatile C4508t p = null;

    @NotNull
    public final C4527a t = new C4527a();

    public C4511w(@NotNull Context context, @NotNull E e, @NotNull io.sentry.android.core.internal.util.v vVar, @NotNull ILogger iLogger, @Nullable String str, boolean z, int i, @NotNull io.sentry.util.l.a<InterfaceC1405Ku0> aVar) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext != null ? applicationContext : context;
        io.sentry.util.p.b(iLogger, "ILogger is required");
        this.e = iLogger;
        this.n = vVar;
        io.sentry.util.p.b(e, "The BuildInfoProvider is required.");
        this.k = e;
        this.g = str;
        this.h = z;
        this.i = i;
        this.j = aVar;
        this.s = N7.h();
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public final C1136Hi1 a(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @Nullable List<C6180qd1> list, @NotNull C2688aH1 c2688aH1) {
        this.k.getClass();
        int i = Build.VERSION.SDK_INT;
        if (this.p != null) {
            C4527a.C0404a c0404aA = this.t.a();
            try {
                C1214Ii1 c1214Ii1 = this.o;
                if (c1214Ii1 == null || !c1214Ii1.d.equals(str2)) {
                    this.e.a(NG1.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                    c0404aA.close();
                    return null;
                }
                this.o = null;
                c0404aA.close();
                this.e.a(NG1.DEBUG, "Transaction %s (%s) finished.", str, str3);
                C4508t.b bVarA = this.p.a(list, false);
                this.m.set(false);
                if (bVarA != null) {
                    long j = bVarA.a - this.q;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(c1214Ii1);
                    long j2 = bVarA.a;
                    long j3 = this.q;
                    long j4 = bVarA.b;
                    long j5 = this.r;
                    if (c1214Ii1.i == null) {
                        c1214Ii1.i = Long.valueOf(j2 - j3);
                        c1214Ii1.h = Long.valueOf(c1214Ii1.h.longValue() - j3);
                        c1214Ii1.k = Long.valueOf(j4 - j5);
                        c1214Ii1.j = Long.valueOf(c1214Ii1.j.longValue() - j5);
                    }
                    Long l = c2688aH1 instanceof SentryAndroidOptions ? J.c(this.d, (SentryAndroidOptions) c2688aH1).h : null;
                    String string = l != null ? Long.toString(l.longValue()) : "0";
                    String[] strArr = Build.SUPPORTED_ABIS;
                    File file = bVarA.c;
                    Date date = this.s;
                    String string2 = Long.toString(j);
                    this.k.getClass();
                    String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                    CallableC4510v callableC4510v = new CallableC4510v();
                    this.k.getClass();
                    String str5 = Build.MANUFACTURER;
                    this.k.getClass();
                    String str6 = Build.MODEL;
                    this.k.getClass();
                    return new C1136Hi1(file, date, arrayList, str, str2, str3, string2, i, str4, callableC4510v, str5, str6, Build.VERSION.RELEASE, this.k.a(), string, c2688aH1.getProguardUuid(), c2688aH1.getRelease(), c2688aH1.getEnvironment(), (bVarA.e || z) ? "timeout" : "normal", bVarA.d);
                }
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC4550iv0
    public final void b(@NotNull InterfaceC4302hv0 interfaceC4302hv0) {
        if (this.m.get() && this.o == null) {
            C4527a.C0404a c0404aA = this.t.a();
            try {
                if (this.m.get() && this.o == null) {
                    this.o = new C1214Ii1(interfaceC4302hv0, Long.valueOf(this.q), Long.valueOf(this.r));
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

    @Override // defpackage.InterfaceC4550iv0
    @Nullable
    public final C1136Hi1 c(@NotNull C7581xH1 c7581xH1, @Nullable List list, @NotNull C2688aH1 c2688aH1) {
        return a(c7581xH1.e, c7581xH1.a.toString(), c7581xH1.b.c.d.toString(), false, list, c2688aH1);
    }

    @Override // defpackage.InterfaceC4550iv0
    public final void close() {
        C4511w c4511w;
        C1214Ii1 c1214Ii1 = this.o;
        if (c1214Ii1 != null) {
            c4511w = this;
            c4511w.a(c1214Ii1.g, c1214Ii1.d, c1214Ii1.e, true, null, QF1.e().p());
        } else {
            c4511w = this;
        }
        c4511w.m.set(false);
        if (c4511w.p != null) {
            C4508t c4508t = c4511w.p;
            C4527a.C0404a c0404aA = c4508t.o.a();
            try {
                Future<?> future = c4508t.d;
                if (future != null) {
                    future.cancel(true);
                    c4508t.d = null;
                }
                if (c4508t.n) {
                    c4508t.a(null, true);
                }
                c0404aA.close();
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC4550iv0
    public final boolean isRunning() {
        return this.m.get();
    }

    @Override // defpackage.InterfaceC4550iv0
    public final void start() {
        C4508t.c cVarC;
        this.k.getClass();
        if (this.m.getAndSet(true)) {
            return;
        }
        if (!this.l) {
            this.l = true;
            if (this.h) {
                String str = this.g;
                if (str == null) {
                    this.e.a(NG1.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                } else {
                    int i = this.i;
                    if (i <= 0) {
                        this.e.a(NG1.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                    } else {
                        this.p = new C4508t(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.i, this.n, this.j, this.e);
                    }
                }
            } else {
                this.e.a(NG1.INFO, "Profiling is disabled in options.", new Object[0]);
            }
        }
        if (this.p != null && (cVarC = this.p.c()) != null) {
            this.q = cVarC.a;
            this.r = cVarC.b;
            this.s = cVarC.c;
            this.e.a(NG1.DEBUG, "Profiler started.", new Object[0]);
            return;
        }
        if (this.p != null && this.p.n) {
            this.e.a(NG1.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            return;
        }
        C4527a.C0404a c0404aA = this.t.a();
        try {
            this.o = null;
            c0404aA.close();
            this.m.set(false);
        } catch (Throwable th) {
            try {
                c0404aA.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}

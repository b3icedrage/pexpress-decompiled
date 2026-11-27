package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import defpackage.C2688aH1;
import defpackage.CH0;
import defpackage.HG1;
import defpackage.K02;
import defpackage.L02;
import defpackage.NG1;
import defpackage.RF1;
import defpackage.TG;
import io.sentry.util.C4527a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryPerformanceProvider extends K {
    public static final long i = SystemClock.uptimeMillis();
    public static final /* synthetic */ int j = 0;

    @Nullable
    public Application e;

    @NotNull
    public final C4502m g;

    @NotNull
    public final E h;

    public SentryPerformanceProvider() {
        new C4527a();
        C4502m c4502m = new C4502m();
        this.g = c4502m;
        this.h = new E(c4502m);
    }

    public final void a(@NotNull Context context, @NotNull RF1 rf1, @NotNull io.sentry.android.core.performance.h hVar) {
        boolean z = rf1.m;
        C4502m c4502m = this.g;
        if (!z) {
            c4502m.a(NG1.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        C4498i c4498i = new C4498i(this.h, new io.sentry.android.core.internal.util.v(context.getApplicationContext(), c4502m, this.h), c4502m, rf1.i, rf1.l, new TG(new HG1()));
        hVar.m = null;
        hVar.n = c4498i;
        c4502m.a(NG1.DEBUG, "App start continuous profiling started.", new Object[0]);
        C2688aH1 c2688aH1Empty = C2688aH1.empty();
        c2688aH1Empty.setProfileSessionSampleRate(Double.valueOf(rf1.m ? 1.0d : 0.0d));
        c4498i.b(rf1.p, new K02(c2688aH1Empty));
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    public final void b(@NotNull Context context, @NotNull RF1 rf1, @NotNull io.sentry.android.core.performance.h hVar) {
        boolean z = rf1.g;
        L02 l02 = new L02(Boolean.valueOf(z), rf1.h, null, Boolean.valueOf(rf1.d), rf1.e);
        hVar.o = l02;
        boolean zBooleanValue = l02.d.booleanValue();
        C4502m c4502m = this.g;
        if (!zBooleanValue || !z) {
            c4502m.a(NG1.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        HG1 hg1 = new HG1();
        C4511w c4511w = new C4511w(context, this.h, new io.sentry.android.core.internal.util.v(context, c4502m, this.h), c4502m, rf1.i, rf1.j, rf1.l, new TG(hg1));
        hVar.n = null;
        hVar.m = c4511w;
        c4502m.a(NG1.DEBUG, "App start profiling started.", new Object[0]);
        c4511w.start();
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NotNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        io.sentry.android.core.performance.h.e(this);
        io.sentry.android.core.performance.h hVarC = io.sentry.android.core.performance.h.c();
        Context context = getContext();
        hVarC.i.f(i);
        this.h.getClass();
        hVarC.h.f(Process.getStartUptimeMillis());
        if (context instanceof Application) {
            this.e = (Application) context;
        }
        Application application = this.e;
        if (application != null) {
            hVarC.h(application);
        }
        Context context2 = getContext();
        C4502m c4502m = this.g;
        if (context2 == null) {
            c4502m.a(NG1.FATAL, "App. Context from ContentProvider is null", new Object[0]);
        } else {
            File file = new File(new File(context2.getCacheDir(), "sentry"), "app_start_profiling_config");
            if (file.exists() && file.canRead()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                    try {
                        RF1 rf1 = (RF1) new CH0(C2688aH1.empty()).d(bufferedReader, RF1.class);
                        if (rf1 == null) {
                            c4502m.a(NG1.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                        } else if (rf1.k && rf1.o) {
                            a(context2, rf1, hVarC);
                        } else if (!rf1.j) {
                            c4502m.a(NG1.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                        } else if (rf1.n) {
                            b(context2, rf1, hVarC);
                        }
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e) {
                    c4502m.d(NG1.ERROR, "App start profiling config file not found. ", e);
                } catch (Throwable th3) {
                    c4502m.d(NG1.ERROR, "Error reading app start profiling config file. ", th3);
                }
            }
        }
        io.sentry.android.core.performance.h.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        C4527a.C0404a c0404aA = io.sentry.android.core.performance.h.v.a();
        try {
            C4511w c4511w = io.sentry.android.core.performance.h.c().m;
            if (c4511w != null) {
                c4511w.close();
            }
            C4498i c4498i = io.sentry.android.core.performance.h.c().n;
            if (c4498i != null) {
                c4498i.a(true);
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

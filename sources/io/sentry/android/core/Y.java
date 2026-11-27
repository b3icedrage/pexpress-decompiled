package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import defpackage.C2688aH1;
import defpackage.NG1;
import defpackage.PD1;
import defpackage.QF1;
import defpackage.YG1;
import io.sentry.util.C4527a;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y implements QF1.a {
    public final /* synthetic */ C4502m d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ QF1.a g;

    public /* synthetic */ Y(QF1.a aVar, Context context, C4502m c4502m) {
        this.d = c4502m;
        this.e = context;
        this.g = aVar;
    }

    @Override // QF1.a
    public final void a(C2688aH1 c2688aH1) {
        C4502m c4502m = this.d;
        Context context = this.e;
        QF1.a aVar = this.g;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c2688aH1;
        boolean zA = io.sentry.util.m.a(sentryAndroidOptions, "timber.log.Timber");
        boolean z = io.sentry.util.m.a(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && io.sentry.util.m.a(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
        boolean z2 = zA && io.sentry.util.m.a(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean zA2 = io.sentry.util.m.a(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        boolean zA3 = io.sentry.util.m.a(sentryAndroidOptions, "io.sentry.android.distribution.DistributionIntegration");
        E e = new E(c4502m);
        boolean z3 = z;
        io.sentry.util.m mVar = new io.sentry.util.m();
        C4494e c4494e = new C4494e(mVar, sentryAndroidOptions);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        sentryAndroidOptions.setLogger(c4502m);
        sentryAndroidOptions.setFatalLogger(new C4501l());
        sentryAndroidOptions.setDefaultScopeType(PD1.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(YG1.OFF);
        sentryAndroidOptions.setDateProvider(new a0());
        sentryAndroidOptions.getLogs().b = new C4504o();
        sentryAndroidOptions.getMetrics().b = new r();
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.v(applicationContext, c4502m, e));
        S.a(applicationContext, e, sentryAndroidOptions);
        sentryAndroidOptions.setCacheDirPath(new File(applicationContext.getCacheDir(), "sentry").getAbsolutePath());
        io.sentry.android.core.anr.f.a.set(true);
        PackageInfo packageInfoC = F.c(applicationContext, e);
        if (packageInfoC != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(packageInfoC.packageName + "@" + packageInfoC.versionName + "+" + F.d(packageInfoC, e));
            }
            String str = packageInfoC.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(N.a(applicationContext));
            } catch (RuntimeException e2) {
                sentryAndroidOptions.getLogger().d(NG1.ERROR, "Could not generate distinct Id.", e2);
            }
        }
        AppState appState = AppState.i;
        if (appState.e == null) {
            C4527a.C0404a c0404aA = appState.d.a();
            try {
                appState.g(sentryAndroidOptions.getLogger());
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
        sentryAndroidOptions.activate();
        C4507s.b(context, sentryAndroidOptions, e, mVar, c4494e, z3, z2, zA2, zA3);
        try {
            aVar.a(sentryAndroidOptions);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th3);
        }
        io.sentry.android.core.performance.h hVarC = io.sentry.android.core.performance.h.c();
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            io.sentry.android.core.performance.i iVar = hVarC.h;
            if (iVar.g == 0) {
                iVar.f(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            hVarC.h((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.i iVar2 = hVarC.i;
        if (iVar2.g == 0) {
            iVar2.f(Z.a);
        }
        C4507s.a(sentryAndroidOptions, context, e, mVar, c4494e, zA2);
        Z.a(sentryAndroidOptions, z3, z2);
    }
}

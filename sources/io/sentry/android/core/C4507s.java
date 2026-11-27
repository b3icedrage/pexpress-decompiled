package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import defpackage.C3080c51;
import defpackage.C4466ii;
import defpackage.C4807k51;
import defpackage.C51;
import defpackage.C6392re0;
import defpackage.C6741tI;
import defpackage.C6861tr1;
import defpackage.C6993uW;
import defpackage.C7005ua;
import defpackage.C7785yF1;
import defpackage.C7995zF1;
import defpackage.InterfaceC4550iv0;
import defpackage.JH;
import defpackage.NG1;
import defpackage.U41;
import defpackage.V41;
import defpackage.VI1;
import defpackage.X41;
import defpackage.YU;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.util.C4527a;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.sentry.android.core.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4507s {
    public static void a(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull E e, @NotNull io.sentry.util.m mVar, @NotNull C4494e c4494e, boolean z) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.g)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.a(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof V41) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.a(context, e, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.m(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.g(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.a(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new I(context, e, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new V(sentryAndroidOptions, c4494e));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, e, z));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C(context, e, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.i) {
            sentryAndroidOptions.setTransportGate(new C4512x(sentryAndroidOptions));
        }
        io.sentry.android.core.performance.h hVarC = io.sentry.android.core.performance.h.c();
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.a(context, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.android.core.internal.debugmeta.a(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof C51) {
            sentryAndroidOptions.setVersionDetector(new C6993uW(sentryAndroidOptions));
        }
        io.sentry.util.l lVar = new io.sentry.util.l(new C6392re0(mVar, sentryAndroidOptions));
        boolean zA = io.sentry.util.m.a(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(lVar));
            if (zA && io.sentry.util.m.a(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zA && io.sentry.util.m.a(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.e.a);
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof C4807k51) {
            sentryAndroidOptions.setSocketTagger(C4509u.a);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new C4505p());
            sentryAndroidOptions.addPerformanceCollector(new C4499j(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.internal.util.v frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.util.p.b(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new d0(sentryAndroidOptions, frameMetricsCollector));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof U41) {
            sentryAndroidOptions.setCompositePerformanceCollector(new YU(sentryAndroidOptions));
        }
        if (z && (sentryAndroidOptions.getReplayController().getR() instanceof C3080c51)) {
            sentryAndroidOptions.getReplayController().g(new io.sentry.android.replay.a(sentryAndroidOptions));
        }
        C4527a.C0404a c0404aA = io.sentry.android.core.performance.h.v.a();
        try {
            InterfaceC4550iv0 interfaceC4550iv0 = hVarC.m;
            C4498i c4498i = hVarC.n;
            hVarC.m = null;
            hVarC.n = null;
            c0404aA.close();
            JH compositePerformanceCollector = sentryAndroidOptions.getCompositePerformanceCollector();
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                sentryAndroidOptions.setContinuousProfiler(X41.d);
                if (c4498i != null) {
                    c4498i.a(true);
                }
                if (interfaceC4550iv0 != null) {
                    sentryAndroidOptions.setTransactionProfiler(interfaceC4550iv0);
                    return;
                }
                io.sentry.android.core.internal.util.v frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.util.p.b(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.setTransactionProfiler(new C4511w(context, e, frameMetricsCollector2, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), new C6741tI(sentryAndroidOptions)));
                return;
            }
            sentryAndroidOptions.setTransactionProfiler(C4466ii.e);
            if (interfaceC4550iv0 != null) {
                interfaceC4550iv0.close();
            }
            if (c4498i == null) {
                io.sentry.android.core.internal.util.v frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.util.p.b(frameMetricsCollector3, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.setContinuousProfiler(new C4498i(e, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), new C7005ua(sentryAndroidOptions)));
            } else {
                sentryAndroidOptions.setContinuousProfiler(c4498i);
                io.sentry.protocol.u uVar = c4498i.s;
                if (!c4498i.m || uVar.equals(io.sentry.protocol.u.e)) {
                    return;
                }
                compositePerformanceCollector.b(uVar.toString());
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

    public static void b(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull E e, @NotNull io.sentry.util.m mVar, @NotNull C4494e c4494e, boolean z, boolean z2, boolean z3, boolean z4) {
        io.sentry.util.l lVar = new io.sentry.util.l(new C6861tr1(sentryAndroidOptions));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C7785yF1(new VI1(sentryAndroidOptions)), lVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(io.sentry.util.m.c("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            sentryAndroidOptions.addIntegration(new TombstoneIntegration(context));
        }
        sentryAndroidOptions.addIntegration(new EnvelopeFileObserverIntegration.OutboxEnvelopeFileObserverIntegration(0));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C7995zF1(new VI1(sentryAndroidOptions)), lVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(i >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context));
        sentryAndroidOptions.addIntegration(new AnrProfilingIntegration());
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, e, c4494e));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, mVar));
            if (z) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().a(NG1.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, e));
        if (z3) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context);
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z4) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().getClass();
    }
}

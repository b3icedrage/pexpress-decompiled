package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import defpackage.C2629a1;
import defpackage.C3121cH1;
import defpackage.EnumC2890bA0;
import defpackage.EnumC4161hE1;
import defpackage.EnumC5147li1;
import defpackage.IG1;
import defpackage.LG1;
import defpackage.NG1;
import io.sentry.ILogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class S {
    public static void a(@NotNull Context context, @NotNull E e, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        List<String> listD;
        List<String> listD2;
        List<String> listD3;
        List<String> listD4;
        io.sentry.util.p.b(sentryAndroidOptions, "The options object is required.");
        try {
            sentryAndroidOptions.getLogger();
            ApplicationInfo applicationInfoA = Build.VERSION.SDK_INT >= 33 ? F.d.a(context) : F.e.a(context);
            Bundle bundle = applicationInfoA != null ? applicationInfoA.metaData : null;
            ILogger logger = sentryAndroidOptions.getLogger();
            if (bundle != null) {
                sentryAndroidOptions.setDebug(b(bundle, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strF = f(bundle, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strF != null) {
                        sentryAndroidOptions.setDiagnosticLevel(NG1.valueOf(strF.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(b(bundle, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setTombstoneEnabled(b(bundle, logger, "io.sentry.tombstone.enable", sentryAndroidOptions.isTombstoneEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(b(bundle, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double dC = c(bundle, logger, "io.sentry.sample-rate");
                    if (dC != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(dC));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(b(bundle, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(e(bundle, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(b(bundle, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                String strF2 = f(bundle, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zB = b(bundle, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zB || (strF2 != null && strF2.isEmpty())) {
                    sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strF2 == null) {
                    sentryAndroidOptions.getLogger().a(NG1.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zB);
                sentryAndroidOptions.setDsn(strF2);
                sentryAndroidOptions.setEnableNdk(b(bundle, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(b(bundle, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                String strF3 = f(bundle, logger, "io.sentry.ndk.sdk-name", sentryAndroidOptions.getNativeSdkName());
                if (strF3 != null) {
                    sentryAndroidOptions.setNativeSdkName(strF3);
                }
                sentryAndroidOptions.setRelease(f(bundle, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setDist(f(bundle, logger, "io.sentry.dist", sentryAndroidOptions.getDist()));
                sentryAndroidOptions.setEnvironment(f(bundle, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(e(bundle, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) e(bundle, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(b(bundle, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(b(bundle, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(b(bundle, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(b(bundle, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(b(bundle, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(b(bundle, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(b(bundle, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(b(bundle, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(b(bundle, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(b(bundle, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(b(bundle, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                if (b(bundle, logger, "io.sentry.auto-init", true)) {
                    sentryAndroidOptions.setInitPriority(EnumC2890bA0.LOW);
                }
                sentryAndroidOptions.setForceInit(b(bundle, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(b(bundle, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                sentryAndroidOptions.setCollectExternalStorageContext(b(bundle, logger, "io.sentry.external-storage-context", sentryAndroidOptions.isCollectExternalStorageContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double dC2 = c(bundle, logger, "io.sentry.traces.sample-rate");
                    if (dC2 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dC2));
                    }
                }
                sentryAndroidOptions.setTraceSampling(b(bundle, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(b(bundle, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(b(bundle, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double dC3 = c(bundle, logger, "io.sentry.traces.profiling.sample-rate");
                    if (dC3 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dC3));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double dC4 = c(bundle, logger, "io.sentry.traces.profiling.session-sample-rate");
                    if (dC4 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dC4));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String strF4 = f(bundle, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
                if (strF4 != null) {
                    sentryAndroidOptions.setProfileLifecycle(EnumC5147li1.valueOf(strF4.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(b(bundle, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(b(bundle, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(b(bundle, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jE = e(bundle, logger, "io.sentry.traces.idle-timeout", -1L);
                if (jE != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jE));
                }
                List<String> listD5 = d(bundle, logger, "io.sentry.traces.trace-propagation-targets");
                if (bundle.containsKey("io.sentry.traces.trace-propagation-targets") && listD5 == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (listD5 != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listD5);
                }
                sentryAndroidOptions.setEnableFramesTracking(b(bundle, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(f(bundle, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                io.sentry.protocol.r sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new io.sentry.protocol.r("", "");
                }
                String strG = g(bundle, logger, "io.sentry.sdk.name", sdkVersion.a());
                io.sentry.util.p.b(strG, "name is required.");
                sdkVersion.d = strG;
                String strG2 = g(bundle, logger, "io.sentry.sdk.version", sdkVersion.b());
                io.sentry.util.p.b(strG2, "version is required.");
                sdkVersion.e = strG2;
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(b(bundle, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List<String> listD6 = d(bundle, logger, "io.sentry.gradle-plugin-integrations");
                if (listD6 != null) {
                    Iterator<String> it = listD6.iterator();
                    while (it.hasNext()) {
                        LG1.d().a(it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(b(bundle, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(b(bundle, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(b(bundle, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(b(bundle, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(b(bundle, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(b(bundle, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(e(bundle, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().m() == null) {
                    double dC5 = c(bundle, logger, "io.sentry.session-replay.session-sample-rate");
                    if (dC5 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().v(Double.valueOf(dC5));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().l() == null) {
                    double dC6 = c(bundle, logger, "io.sentry.session-replay.on-error-sample-rate");
                    if (dC6 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().u(Double.valueOf(dC6));
                    }
                }
                sentryAndroidOptions.getSessionReplay().f(b(bundle, logger, "io.sentry.session-replay.mask-all-text", true));
                sentryAndroidOptions.getSessionReplay().e(b(bundle, logger, "io.sentry.session-replay.mask-all-images", true));
                sentryAndroidOptions.getSessionReplay().o(b(bundle, logger, "io.sentry.session-replay.debug", false));
                String strF5 = f(bundle, logger, "io.sentry.session-replay.screenshot-strategy", null);
                if (strF5 != null) {
                    if ("canvas".equals(strF5.toLowerCase(Locale.ROOT))) {
                        sentryAndroidOptions.getSessionReplay().n = EnumC4161hE1.CANVAS;
                    } else {
                        sentryAndroidOptions.getSessionReplay().n = EnumC4161hE1.PIXEL_COPY;
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().h().isEmpty() && (listD4 = d(bundle, logger, "io.sentry.session-replay.network-detail-allow-urls")) != null && !listD4.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> it2 = listD4.iterator();
                    while (it2.hasNext()) {
                        String strTrim = it2.next().trim();
                        if (!strTrim.isEmpty()) {
                            arrayList.add(strTrim);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().q(arrayList);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().i().isEmpty() && (listD3 = d(bundle, logger, "io.sentry.session-replay.network-detail-deny-urls")) != null && !listD3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it3 = listD3.iterator();
                    while (it3.hasNext()) {
                        String strTrim2 = it3.next().trim();
                        if (!strTrim2.isEmpty()) {
                            arrayList2.add(strTrim2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().r(arrayList2);
                    }
                }
                sentryAndroidOptions.getSessionReplay().p(b(bundle, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().n()));
                if (sentryAndroidOptions.getSessionReplay().j().size() == C3121cH1.t.size() && (listD2 = d(bundle, logger, "io.sentry.session-replay.network-request-headers")) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<String> it4 = listD2.iterator();
                    while (it4.hasNext()) {
                        String strTrim3 = it4.next().trim();
                        if (!strTrim3.isEmpty()) {
                            arrayList3.add(strTrim3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().s(arrayList3);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().k().size() == C3121cH1.t.size() && (listD = d(bundle, logger, "io.sentry.session-replay.network-response-headers")) != null && !listD.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<String> it5 = listD.iterator();
                    while (it5.hasNext()) {
                        String strTrim4 = it5.next().trim();
                        if (!strTrim4.isEmpty()) {
                            arrayList4.add(strTrim4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().t(arrayList4);
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(d(bundle, logger, "io.sentry.ignored-errors"));
                List<String> listD7 = d(bundle, logger, "io.sentry.in-app-includes");
                if (listD7 != null && !listD7.isEmpty()) {
                    Iterator<String> it6 = listD7.iterator();
                    while (it6.hasNext()) {
                        sentryAndroidOptions.addInAppInclude(it6.next());
                    }
                }
                List<String> listD8 = d(bundle, logger, "io.sentry.in-app-excludes");
                if (listD8 != null && !listD8.isEmpty()) {
                    Iterator<String> it7 = listD8.iterator();
                    while (it7.hasNext()) {
                        sentryAndroidOptions.addInAppExclude(it7.next());
                    }
                }
                sentryAndroidOptions.getLogs().b(b(bundle, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().a()));
                sentryAndroidOptions.getMetrics().b(b(bundle, logger, "io.sentry.metrics.enabled", sentryAndroidOptions.getMetrics().a()));
                IG1 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.h(b(bundle, logger, "io.sentry.feedback.is-name-required", feedbackOptions.b()));
                feedbackOptions.k(b(bundle, logger, "io.sentry.feedback.show-name", feedbackOptions.e()));
                feedbackOptions.g(b(bundle, logger, "io.sentry.feedback.is-email-required", feedbackOptions.a()));
                feedbackOptions.j(b(bundle, logger, "io.sentry.feedback.show-email", feedbackOptions.d()));
                feedbackOptions.l(b(bundle, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.f()));
                feedbackOptions.i(b(bundle, logger, "io.sentry.feedback.show-branding", feedbackOptions.c()));
                sentryAndroidOptions.setEnableSpotlight(b(bundle, logger, "io.sentry.spotlight.enable", sentryAndroidOptions.isEnableSpotlight()));
                String strF6 = f(bundle, logger, "io.sentry.spotlight.url", null);
                if (strF6 != null) {
                    sentryAndroidOptions.setSpotlightConnectionUrl(strF6);
                }
                sentryAndroidOptions.getScreenshot().f(b(bundle, logger, "io.sentry.screenshot.mask-all-text", false));
                sentryAndroidOptions.getScreenshot().e(b(bundle, logger, "io.sentry.screenshot.mask-all-images", false));
                if (sentryAndroidOptions.getAnrProfilingSampleRate() == null) {
                    double dC7 = c(bundle, logger, "io.sentry.anr.profiling.sample-rate");
                    if (dC7 != -1.0d) {
                        sentryAndroidOptions.setAnrProfilingSampleRate(Double.valueOf(dC7));
                    }
                }
                sentryAndroidOptions.setEnableAnrFingerprinting(b(bundle, logger, "io.sentry.anr.enable-fingerprinting", sentryAndroidOptions.isEnableAnrFingerprinting()));
            }
            sentryAndroidOptions.getLogger().a(NG1.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(NG1.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    public static boolean b(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        iLogger.a(NG1.DEBUG, str + " read: " + z2, new Object[0]);
        return z2;
    }

    public static double c(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        iLogger.a(NG1.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
        return dDoubleValue;
    }

    @Nullable
    public static List<String> d(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str) {
        String string = bundle.getString(str);
        iLogger.a(NG1.DEBUG, C2629a1.b(str, " read: ", string), new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    public static long e(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        iLogger.a(NG1.DEBUG, str + " read: " + j2, new Object[0]);
        return j2;
    }

    @Nullable
    public static String f(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, @Nullable String str2) {
        String string = bundle.getString(str, str2);
        iLogger.a(NG1.DEBUG, C2629a1.b(str, " read: ", string), new Object[0]);
        return string;
    }

    @NotNull
    public static String g(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, @NotNull String str2) {
        String string = bundle.getString(str, str2);
        iLogger.a(NG1.DEBUG, C2629a1.b(str, " read: ", string), new Object[0]);
        return string;
    }
}

package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import io.sentry.ILogger;
import io.sentry.ShutdownHookIntegration;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.protocol.r;
import io.sentry.protocol.u;
import io.sentry.util.C4527a;
import io.sentry.util.x;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2688aH1 {
    static final NG1 DEFAULT_DIAGNOSTIC_LEVEL = NG1.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";

    @NotNull
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    public static final long MAX_EVENT_SIZE_BYTES = 1048576;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;

    @NotNull
    private io.sentry.backpressure.b backpressureMonitor;

    @Nullable
    private a beforeBreadcrumb;

    @Nullable
    private b beforeEnvelopeCallback;

    @Nullable
    private c beforeSend;

    @Nullable
    private c beforeSendFeedback;

    @Nullable
    private d beforeSendReplay;

    @Nullable
    private e beforeSendTransaction;

    @NotNull
    private final Set<String> bundleIds;

    @Nullable
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;

    @NotNull
    io.sentry.clientreport.g clientReportRecorder;

    @NotNull
    private JH compositePerformanceCollector;

    @NotNull
    private InterfaceC4761js0 connectionStatusProvider;
    private int connectionTimeoutMillis;

    @NotNull
    private final List<String> contextTags;

    @NotNull
    private InterfaceC5394ms0 continuousProfiler;

    @Nullable
    private f cron;

    @NotNull
    private final io.sentry.util.l<InterfaceC3328dG1> dateProvider;
    private long deadlineTimeout;
    private boolean debug;

    @NotNull
    private io.sentry.internal.debugmeta.a debugMetaLoader;

    @NotNull
    private PD1 defaultScopeType;

    @NotNull
    private final List<String> defaultTracePropagationTargets;

    @NotNull
    private NG1 diagnosticLevel;

    @Nullable
    private String dist;

    @Nullable
    private String distinctId;

    @NotNull
    private g distribution;

    @NotNull
    private InterfaceC8124zs0 distributionController;

    @Nullable
    private String dsn;

    @Nullable
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDatabaseTransactionTracing;
    private boolean enableDeduplication;
    private boolean enableEventSizeLimiting;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;

    @NotNull
    private io.sentry.cache.f envelopeDiskCache;

    @NotNull
    private final io.sentry.util.l<InterfaceC0697Bs0> envelopeReader;

    @Nullable
    private String environment;

    @NotNull
    private final List<N80> eventProcessors;

    @NotNull
    private InterfaceC1405Ku0 executorService;

    @NotNull
    private final C7847ya0 experimental;

    @NotNull
    private ILogger fatalLogger;

    @NotNull
    private IG1 feedbackOptions;
    private long flushTimeoutMillis;
    private boolean forceInit;

    @NotNull
    private C6203qj0 fullyDisplayedReporter;

    @NotNull
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;

    @Nullable
    private Boolean globalHubMode;

    @Nullable
    private Long idleTimeout;

    @Nullable
    private List<C7018ud0> ignoredCheckIns;

    @Nullable
    private List<C7018ud0> ignoredErrors;

    @NotNull
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;

    @Nullable
    private List<C7018ud0> ignoredSpanOrigins;

    @Nullable
    private List<C7018ud0> ignoredTransactions;

    @NotNull
    private final List<String> inAppExcludes;

    @NotNull
    private final List<String> inAppIncludes;

    @NotNull
    private EnumC2890bA0 initPriority;

    @NotNull
    private EnumC6511sB0 instrumenter;

    @NotNull
    private final List<OB0> integrations;

    @Nullable
    private volatile K02 internalTracesSampler;

    @NotNull
    protected final C4527a lock;

    @NotNull
    private ILogger logger;

    @NotNull
    private h logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;

    @NotNull
    private n maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;

    @NotNull
    private i metrics;

    @NotNull
    private io.sentry.internal.modules.b modulesLoader;

    @NotNull
    private final List<InterfaceC1093Gu0> observers;

    @Nullable
    private j onDiscard;

    @Nullable
    private k onOversizedEvent;

    @NotNull
    private YG1 openTelemetryMode;

    @NotNull
    private final List<InterfaceC4089gu0> optionsObservers;

    @NotNull
    private final io.sentry.util.l<C5012l40> parsedDsn;

    @NotNull
    private final List<InterfaceC5610nu0> performanceCollectors;
    private boolean printUncaughtStackTrace;

    @NotNull
    private EnumC5147li1 profileLifecycle;

    @Nullable
    private Double profileSessionSampleRate;

    @NotNull
    private InterfaceC6869tu0 profilerConverter;

    @Nullable
    private Double profilesSampleRate;

    @Nullable
    private l profilesSampler;

    @Nullable
    private String profilingTracesDirPath;
    private int profilingTracesHz;

    @Nullable
    private String proguardUuid;
    private boolean propagateTraceparent;

    @Nullable
    private m proxy;
    private int readTimeoutMillis;

    @Nullable
    private String release;

    @NotNull
    private InterfaceC2179Ur1 replayController;

    @Nullable
    private Double sampleRate;

    @Nullable
    private r sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;

    @Nullable
    private String sentryClientName;

    @NotNull
    private final io.sentry.util.l<InterfaceC1560Mu0> serializer;

    @Nullable
    private String serverName;
    private long sessionFlushTimeoutMillis;

    @NotNull
    private C3121cH1 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;

    @NotNull
    private InterfaceC2265Vu0 socketTagger;

    @NotNull
    private InterfaceC2451Xu0 spanFactory;

    @Nullable
    private String spotlightConnectionUrl;

    @NotNull
    private final AtomicBoolean spotlightIntegrationLoaded;

    @Nullable
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;

    @NotNull
    private final Map<String, String> tags;

    @NotNull
    private io.sentry.util.thread.a threadChecker;
    private boolean traceOptionsRequests;

    @Nullable
    private List<String> tracePropagationTargets;
    private boolean traceSampling;

    @Nullable
    private Double tracesSampleRate;

    @Nullable
    private o tracesSampler;

    @NotNull
    private InterfaceC4550iv0 transactionProfiler;

    @NotNull
    private InterfaceC4770jv0 transportFactory;

    @NotNull
    private io.sentry.transport.f transportGate;

    @NotNull
    private InterfaceC6033pv0 versionDetector;

    @NotNull
    private final List<io.sentry.internal.viewhierarchy.a> viewHierarchyExporters;

    /* JADX INFO: renamed from: aH1$a */
    public interface a {
        @Nullable
        C0702Bu a(@NotNull C0702Bu c0702Bu, @NotNull C0841Do0 c0841Do0);
    }

    /* JADX INFO: renamed from: aH1$b */
    public interface b {
    }

    /* JADX INFO: renamed from: aH1$c */
    public interface c {
    }

    /* JADX INFO: renamed from: aH1$d */
    public interface d {
    }

    /* JADX INFO: renamed from: aH1$e */
    public interface e {
    }

    /* JADX INFO: renamed from: aH1$f */
    public static final class f {

        @Nullable
        public Long a;

        @Nullable
        public Long b;

        @Nullable
        public String c;

        @Nullable
        public Long d;

        @Nullable
        public Long e;
    }

    /* JADX INFO: renamed from: aH1$g */
    public static final class g {
        public String a = "";
        public String b = "";
        public String c = "";

        @Nullable
        public String d = null;

        @Nullable
        public ArrayList e = null;
    }

    /* JADX INFO: renamed from: aH1$h */
    public static final class h {
        public boolean a;

        @NotNull
        public io.sentry.logger.d b;

        public final boolean a() {
            return this.a;
        }

        public final void b(boolean z) {
            this.a = z;
        }
    }

    /* JADX INFO: renamed from: aH1$i */
    public static final class i {
        public boolean a;

        @NotNull
        public io.sentry.metrics.c b;

        public final boolean a() {
            return this.a;
        }

        public final void b(boolean z) {
            this.a = z;
        }
    }

    /* JADX INFO: renamed from: aH1$j */
    public interface j {
    }

    /* JADX INFO: renamed from: aH1$k */
    public interface k {
    }

    /* JADX INFO: renamed from: aH1$l */
    public interface l {
    }

    /* JADX INFO: renamed from: aH1$m */
    public static final class m {

        @Nullable
        public String a;

        @Nullable
        public String b;

        @Nullable
        public String c;

        @Nullable
        public String d;
    }

    /* JADX INFO: renamed from: aH1$n */
    public enum n {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    /* JADX INFO: renamed from: aH1$o */
    public interface o {
    }

    public C2688aH1() {
        this(false);
    }

    private void addPackageInfo() {
        LG1.d().b("maven:io.sentry:sentry", "8.35.0");
    }

    @NotNull
    private r createSdkVersion() {
        r rVar = new r("sentry.java", "8.35.0");
        rVar.e = "8.35.0";
        return rVar;
    }

    @NotNull
    public static C2688aH1 empty() {
        return new C2688aH1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C5012l40 lambda$new$0() {
        return new C5012l40(this.dsn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC1560Mu0 lambda$new$1() {
        return new CH0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC0697Bs0 lambda$new$2() {
        return new C6916u70(this.serializer.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3328dG1 lambda$new$3() {
        return new UF1();
    }

    private /* synthetic */ void lambda$new$4(u uVar, IG1.a aVar) {
        this.logger.a(NG1.WARNING, "showDialog() can only be called in Android.", new Object[0]);
    }

    public void activate() {
        if (this.executorService instanceof C4339i51) {
            HG1 hg1 = new HG1(this);
            this.executorService = hg1;
            hg1.b();
        }
        if (this.spotlightIntegrationLoaded.compareAndSet(false, true)) {
            try {
                this.integrations.add((OB0) Class.forName("io.sentry.spotlight.SpotlightIntegration").getConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (Throwable unused) {
            }
        }
    }

    public void addBundleId(@Nullable String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(@NotNull String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(@NotNull N80 n80) {
        this.eventProcessors.add(n80);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new C7018ud0(str));
    }

    public void addIgnoredError(@NotNull String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new C7018ud0(str));
    }

    public void addIgnoredExceptionForType(@NotNull Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new C7018ud0(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new C7018ud0(str));
    }

    public void addInAppExclude(@NotNull String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(@NotNull String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(@NotNull OB0 ob0) {
        this.integrations.add(ob0);
    }

    public void addOptionsObserver(@NotNull InterfaceC4089gu0 interfaceC4089gu0) {
        this.optionsObservers.add(interfaceC4089gu0);
    }

    public void addPerformanceCollector(@NotNull InterfaceC5610nu0 interfaceC5610nu0) {
        this.performanceCollectors.add(interfaceC5610nu0);
    }

    public void addScopeObserver(@NotNull InterfaceC1093Gu0 interfaceC1093Gu0) {
        this.observers.add(interfaceC1093Gu0);
    }

    public boolean containsIgnoredExceptionForType(@NotNull Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    @Nullable
    public io.sentry.cache.m findPersistingScopeObserver() {
        for (InterfaceC1093Gu0 interfaceC1093Gu0 : this.observers) {
            if (interfaceC1093Gu0 instanceof io.sentry.cache.m) {
                return (io.sentry.cache.m) interfaceC1093Gu0;
            }
        }
        return null;
    }

    @NotNull
    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    @Nullable
    public a getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    @Nullable
    public b getBeforeEnvelopeCallback() {
        return null;
    }

    @Nullable
    public c getBeforeSend() {
        return this.beforeSend;
    }

    @Nullable
    public c getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    @Nullable
    public d getBeforeSendReplay() {
        return null;
    }

    @Nullable
    public e getBeforeSendTransaction() {
        return null;
    }

    @NotNull
    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    @Nullable
    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    @Nullable
    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    @NotNull
    public io.sentry.clientreport.g getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    @NotNull
    public JH getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    @NotNull
    public InterfaceC4761js0 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    @NotNull
    public List<String> getContextTags() {
        return this.contextTags;
    }

    @NotNull
    public InterfaceC5394ms0 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    @Nullable
    public f getCron() {
        return this.cron;
    }

    @NotNull
    public InterfaceC3328dG1 getDateProvider() {
        return this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    @NotNull
    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    @NotNull
    public PD1 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    @NotNull
    public NG1 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    @Nullable
    public String getDist() {
        return this.dist;
    }

    @Nullable
    public String getDistinctId() {
        return this.distinctId;
    }

    @NotNull
    public g getDistribution() {
        return this.distribution;
    }

    @NotNull
    public InterfaceC8124zs0 getDistributionController() {
        return this.distributionController;
    }

    @Nullable
    public String getDsn() {
        return this.dsn;
    }

    @NotNull
    public io.sentry.cache.f getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    @NotNull
    public InterfaceC0697Bs0 getEnvelopeReader() {
        return this.envelopeReader.a();
    }

    @Nullable
    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    @NotNull
    public List<N80> getEventProcessors() {
        return this.eventProcessors;
    }

    @NotNull
    public InterfaceC1405Ku0 getExecutorService() {
        return this.executorService;
    }

    @NotNull
    public C7847ya0 getExperimental() {
        return this.experimental;
    }

    @NotNull
    public ILogger getFatalLogger() {
        return this.fatalLogger;
    }

    @NotNull
    public IG1 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    @NotNull
    public C6203qj0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    @Nullable
    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    @Nullable
    public List<C7018ud0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    @Nullable
    public List<C7018ud0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    @NotNull
    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    @Nullable
    public List<C7018ud0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    @Nullable
    public List<C7018ud0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    @NotNull
    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    @NotNull
    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    @NotNull
    public EnumC2890bA0 getInitPriority() {
        return this.initPriority;
    }

    @NotNull
    public EnumC6511sB0 getInstrumenter() {
        return this.instrumenter;
    }

    @NotNull
    public List<OB0> getIntegrations() {
        return this.integrations;
    }

    @NotNull
    public K02 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            C4527a.C0404a c0404aA = this.lock.a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new K02(this);
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
        return this.internalTracesSampler;
    }

    @NotNull
    public ILogger getLogger() {
        return this.logger;
    }

    @NotNull
    public h getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxFeatureFlags() {
        return this.maxFeatureFlags;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    @NotNull
    public n getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    @NotNull
    public i getMetrics() {
        return this.metrics;
    }

    @NotNull
    public io.sentry.internal.modules.b getModulesLoader() {
        return this.modulesLoader;
    }

    @Nullable
    public j getOnDiscard() {
        return null;
    }

    @Nullable
    public k getOnOversizedEvent() {
        return null;
    }

    @NotNull
    public YG1 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    @NotNull
    public List<InterfaceC4089gu0> getOptionsObservers() {
        return this.optionsObservers;
    }

    @Nullable
    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    @NotNull
    public List<InterfaceC5610nu0> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    @NotNull
    public EnumC5147li1 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    @Nullable
    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    @NotNull
    public InterfaceC6869tu0 getProfilerConverter() {
        return this.profilerConverter;
    }

    @Nullable
    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    @Nullable
    public l getProfilesSampler() {
        return null;
    }

    @Nullable
    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    @Nullable
    public String getProguardUuid() {
        return this.proguardUuid;
    }

    @Nullable
    public m getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Nullable
    public String getRelease() {
        return this.release;
    }

    @NotNull
    public InterfaceC2179Ur1 getReplayController() {
        return this.replayController;
    }

    @Nullable
    public Double getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public List<InterfaceC1093Gu0> getScopeObservers() {
        return this.observers;
    }

    @Nullable
    public r getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public String getSentryClientName() {
        return this.sentryClientName;
    }

    @NotNull
    public InterfaceC1560Mu0 getSerializer() {
        return this.serializer.a();
    }

    @Nullable
    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    @NotNull
    public C3121cH1 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    @NotNull
    public InterfaceC2265Vu0 getSocketTagger() {
        return this.socketTagger;
    }

    @NotNull
    public InterfaceC2451Xu0 getSpanFactory() {
        return this.spanFactory;
    }

    @Nullable
    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    public Map<String, String> getTags() {
        return this.tags;
    }

    @NotNull
    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    @NotNull
    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    @Nullable
    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    @Nullable
    public o getTracesSampler() {
        return this.tracesSampler;
    }

    @NotNull
    public InterfaceC4550iv0 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    @NotNull
    public InterfaceC4770jv0 getTransportFactory() {
        return this.transportFactory;
    }

    @NotNull
    public io.sentry.transport.f getTransportGate() {
        return this.transportGate;
    }

    @NotNull
    public InterfaceC6033pv0 getVersionDetector() {
        return this.versionDetector;
    }

    @NotNull
    public final List<io.sentry.internal.viewhierarchy.a> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d2;
        return this.profilesSampleRate == null && (d2 = this.profileSessionSampleRate) != null && d2.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDatabaseTransactionTracing() {
        return this.enableDatabaseTransactionTracing;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableEventSizeLimiting() {
        return this.enableEventSizeLimiting;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    @Nullable
    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d2 = this.profilesSampleRate;
        return d2 != null && d2.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        return (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(@NotNull C2287Wa0 c2287Wa0) {
        String str = c2287Wa0.a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = c2287Wa0.b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = c2287Wa0.c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = c2287Wa0.d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = c2287Wa0.e;
        if (str5 != null) {
            setServerName(str5);
        }
        m mVar = c2287Wa0.n;
        if (mVar != null) {
            setProxy(mVar);
        }
        Boolean bool = c2287Wa0.f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = c2287Wa0.y;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Double d2 = c2287Wa0.i;
        if (d2 != null) {
            setSampleRate(d2);
        }
        Double d3 = c2287Wa0.j;
        if (d3 != null) {
            setTracesSampleRate(d3);
        }
        Double d4 = c2287Wa0.k;
        if (d4 != null) {
            setProfilesSampleRate(d4);
        }
        Boolean bool3 = c2287Wa0.g;
        if (bool3 != null) {
            setDebug(bool3.booleanValue());
        }
        Boolean bool4 = c2287Wa0.h;
        if (bool4 != null) {
            setEnableDeduplication(bool4.booleanValue());
        }
        Boolean bool5 = c2287Wa0.z;
        if (bool5 != null) {
            setSendClientReports(bool5.booleanValue());
        }
        Boolean bool6 = c2287Wa0.O;
        if (bool6 != null) {
            setForceInit(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(c2287Wa0.m).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(c2287Wa0.p).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(c2287Wa0.o).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(c2287Wa0.w).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (c2287Wa0.q != null) {
            setTracePropagationTargets(new ArrayList(c2287Wa0.q));
        }
        Iterator it4 = new ArrayList(c2287Wa0.r).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = c2287Wa0.s;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l2 = c2287Wa0.t;
        if (l2 != null) {
            setIdleTimeout(l2);
        }
        Long l3 = c2287Wa0.u;
        if (l3 != null) {
            setShutdownTimeoutMillis(l3.longValue());
        }
        Long l4 = c2287Wa0.v;
        if (l4 != null) {
            setSessionFlushTimeoutMillis(l4.longValue());
        }
        Iterator it5 = c2287Wa0.A.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = c2287Wa0.B;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = c2287Wa0.C;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = c2287Wa0.J;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (c2287Wa0.H != null) {
            setIgnoredCheckIns(new ArrayList(c2287Wa0.H));
        }
        if (c2287Wa0.I != null) {
            setIgnoredTransactions(new ArrayList(c2287Wa0.I));
        }
        if (c2287Wa0.x != null) {
            setIgnoredErrors(new ArrayList(c2287Wa0.x));
        }
        Boolean bool10 = c2287Wa0.L;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        Boolean bool11 = c2287Wa0.M;
        if (bool11 != null) {
            setEnableDatabaseTransactionTracing(bool11.booleanValue());
        }
        n nVar = c2287Wa0.l;
        if (nVar != null) {
            setMaxRequestBodySize(nVar);
        }
        Boolean bool12 = c2287Wa0.K;
        if (bool12 != null) {
            setSendDefaultPii(bool12.booleanValue());
        }
        Boolean bool13 = c2287Wa0.P;
        if (bool13 != null) {
            setCaptureOpenTelemetryEvents(bool13.booleanValue());
        }
        Boolean bool14 = c2287Wa0.D;
        if (bool14 != null) {
            setEnableSpotlight(bool14.booleanValue());
        }
        String str7 = c2287Wa0.G;
        if (str7 != null) {
            setSpotlightConnectionUrl(str7);
        }
        Boolean bool15 = c2287Wa0.N;
        if (bool15 != null) {
            setGlobalHubMode(bool15);
        }
        if (c2287Wa0.T != null) {
            if (getCron() == null) {
                setCron(c2287Wa0.T);
            } else {
                if (c2287Wa0.T.a != null) {
                    getCron().a = c2287Wa0.T.a;
                }
                if (c2287Wa0.T.b != null) {
                    getCron().b = c2287Wa0.T.b;
                }
                if (c2287Wa0.T.c != null) {
                    getCron().c = c2287Wa0.T.c;
                }
                if (c2287Wa0.T.d != null) {
                    getCron().d = c2287Wa0.T.d;
                }
                if (c2287Wa0.T.e != null) {
                    getCron().e = c2287Wa0.T.e;
                }
            }
        }
        if (c2287Wa0.E != null) {
            getLogs().a = c2287Wa0.E.booleanValue();
        }
        if (c2287Wa0.F != null) {
            getMetrics().a = c2287Wa0.F.booleanValue();
        }
        Double d5 = c2287Wa0.Q;
        if (d5 != null) {
            setProfileSessionSampleRate(d5);
        }
        String str8 = c2287Wa0.R;
        if (str8 != null) {
            setProfilingTracesDirPath(str8);
        }
        EnumC5147li1 enumC5147li1 = c2287Wa0.S;
        if (enumC5147li1 != null) {
            setProfileLifecycle(enumC5147li1);
        }
    }

    @NotNull
    public C5012l40 retrieveParsedDsn() {
        return this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBackpressureMonitor(@NotNull io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(@Nullable a aVar) {
        this.beforeBreadcrumb = aVar;
    }

    public void setBeforeSend(@Nullable c cVar) {
        this.beforeSend = cVar;
    }

    public void setBeforeSendFeedback(@Nullable c cVar) {
        this.beforeSendFeedback = cVar;
    }

    public void setCacheDirPath(@Nullable String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z) {
        this.captureOpenTelemetryEvents = z;
    }

    public void setCompositePerformanceCollector(@NotNull JH jh) {
        this.compositePerformanceCollector = jh;
    }

    public void setConnectionStatusProvider(@NotNull InterfaceC4761js0 interfaceC4761js0) {
        this.connectionStatusProvider = interfaceC4761js0;
    }

    public void setConnectionTimeoutMillis(int i2) {
        this.connectionTimeoutMillis = i2;
    }

    public void setContinuousProfiler(@Nullable InterfaceC5394ms0 interfaceC5394ms0) {
        if (this.continuousProfiler != X41.d || interfaceC5394ms0 == null) {
            return;
        }
        this.continuousProfiler = interfaceC5394ms0;
    }

    public void setCron(@Nullable f fVar) {
        this.cron = fVar;
    }

    public void setDateProvider(@NotNull InterfaceC3328dG1 interfaceC3328dG1) {
        this.dateProvider.c(interfaceC3328dG1);
    }

    public void setDeadlineTimeout(long j2) {
        this.deadlineTimeout = j2;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDebugMetaLoader(@Nullable io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.a;
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(@NotNull PD1 pd1) {
        this.defaultScopeType = pd1;
    }

    public void setDiagnosticLevel(@Nullable NG1 ng1) {
        if (ng1 == null) {
            ng1 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = ng1;
    }

    public void setDist(@Nullable String str) {
        this.dist = str;
    }

    public void setDistinctId(@Nullable String str) {
        this.distinctId = str;
    }

    public void setDistribution(@NotNull g gVar) {
        if (gVar == null) {
            gVar = new g();
        }
        this.distribution = gVar;
    }

    public void setDistributionController(@Nullable InterfaceC8124zs0 interfaceC8124zs0) {
        if (interfaceC8124zs0 == null) {
            interfaceC8124zs0 = C1874Qu.a;
        }
        this.distributionController = interfaceC8124zs0;
    }

    public void setDsn(@Nullable String str) {
        String string = null;
        this.dsn = str != null ? str.trim() : null;
        this.parsedDsn.b();
        String str2 = this.dsn;
        ILogger iLogger = this.logger;
        Charset charset = x.a;
        if (str2 != null && !str2.isEmpty()) {
            try {
                string = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(x.a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e2) {
                iLogger.d(NG1.INFO, "SHA-1 isn't available to calculate the hash.", e2);
            } catch (Throwable th) {
                iLogger.a(NG1.INFO, "string: %s could not calculate its hash", th, str2);
            }
        }
        this.dsnHash = string;
    }

    public void setEnableAppStartProfiling(boolean z) {
        this.enableAppStartProfiling = z;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableBackpressureHandling(boolean z) {
        this.enableBackpressureHandling = z;
    }

    public void setEnableDatabaseTransactionTracing(boolean z) {
        this.enableDatabaseTransactionTracing = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableEventSizeLimiting(boolean z) {
        this.enableEventSizeLimiting = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnablePrettySerializationOutput(boolean z) {
        this.enablePrettySerializationOutput = z;
    }

    public void setEnableScopePersistence(boolean z) {
        this.enableScopePersistence = z;
    }

    public void setEnableScreenTracking(boolean z) {
        this.enableScreenTracking = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableSpotlight(boolean z) {
        this.enableSpotlight = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.enableTimeToFullDisplayTracing = z;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.enableUserInteractionBreadcrumbs = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.enableUserInteractionTracing = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setEnvelopeDiskCache(@Nullable io.sentry.cache.f fVar) {
        if (fVar == null) {
            fVar = io.sentry.transport.g.d;
        }
        this.envelopeDiskCache = fVar;
    }

    public void setEnvelopeReader(@Nullable InterfaceC0697Bs0 interfaceC0697Bs0) {
        io.sentry.util.l<InterfaceC0697Bs0> lVar = this.envelopeReader;
        if (interfaceC0697Bs0 == null) {
            interfaceC0697Bs0 = Y41.a;
        }
        lVar.c(interfaceC0697Bs0);
    }

    public void setEnvironment(@Nullable String str) {
        this.environment = str;
    }

    public void setExecutorService(@NotNull InterfaceC1405Ku0 interfaceC1405Ku0) {
        if (interfaceC1405Ku0 != null) {
            this.executorService = interfaceC1405Ku0;
        }
    }

    public void setFatalLogger(@Nullable ILogger iLogger) {
        if (iLogger == null) {
            iLogger = C2647a51.a;
        }
        this.fatalLogger = iLogger;
    }

    public void setFeedbackOptions(@NotNull IG1 ig1) {
        this.feedbackOptions = ig1;
    }

    public void setFlushTimeoutMillis(long j2) {
        this.flushTimeoutMillis = j2;
    }

    public void setForceInit(boolean z) {
        this.forceInit = z;
    }

    public void setFullyDisplayedReporter(@NotNull C6203qj0 c6203qj0) {
        this.fullyDisplayedReporter = c6203qj0;
    }

    public void setGestureTargetLocators(@NotNull List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(@Nullable Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(@Nullable Long l2) {
        this.idleTimeout = l2;
    }

    public void setIgnoredCheckIns(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new C7018ud0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new C7018ud0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new C7018ud0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new C7018ud0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(@NotNull EnumC2890bA0 enumC2890bA0) {
        this.initPriority = enumC2890bA0;
    }

    @Deprecated
    public void setInstrumenter(@NotNull EnumC6511sB0 enumC6511sB0) {
        this.instrumenter = enumC6511sB0;
    }

    public void setLogger(@Nullable ILogger iLogger) {
        this.logger = iLogger == null ? C2647a51.a : new Q00(this, iLogger);
    }

    public void setLogs(@NotNull h hVar) {
        this.logs = hVar;
    }

    public void setMaxAttachmentSize(long j2) {
        this.maxAttachmentSize = j2;
    }

    public void setMaxBreadcrumbs(int i2) {
        this.maxBreadcrumbs = i2;
    }

    public void setMaxCacheItems(int i2) {
        this.maxCacheItems = i2;
    }

    public void setMaxDepth(int i2) {
        this.maxDepth = i2;
    }

    public void setMaxFeatureFlags(int i2) {
        this.maxFeatureFlags = i2;
    }

    public void setMaxQueueSize(int i2) {
        if (i2 > 0) {
            this.maxQueueSize = i2;
        }
    }

    public void setMaxRequestBodySize(@NotNull n nVar) {
        this.maxRequestBodySize = nVar;
    }

    public void setMaxSpans(int i2) {
        this.maxSpans = i2;
    }

    public void setMaxTraceFileSize(long j2) {
        this.maxTraceFileSize = j2;
    }

    public void setMetrics(@NotNull i iVar) {
        this.metrics = iVar;
    }

    public void setModulesLoader(@Nullable io.sentry.internal.modules.b bVar) {
        if (bVar == null) {
            bVar = io.sentry.internal.modules.e.a;
        }
        this.modulesLoader = bVar;
    }

    public void setOpenTelemetryMode(@NotNull YG1 yg1) {
        this.openTelemetryMode = yg1;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfileLifecycle(@NotNull EnumC5147li1 enumC5147li1) {
        this.profileLifecycle = enumC5147li1;
        if (enumC5147li1 != EnumC5147li1.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.a(NG1.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(@Nullable Double d2) {
        if (io.sentry.util.u.c(d2, true)) {
            this.profileSessionSampleRate = d2;
            return;
        }
        throw new IllegalArgumentException("The value " + d2 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilerConverter(@NotNull InterfaceC6869tu0 interfaceC6869tu0) {
        this.profilerConverter = interfaceC6869tu0;
    }

    public void setProfilesSampleRate(@Nullable Double d2) {
        if (io.sentry.util.u.c(d2, true)) {
            this.profilesSampleRate = d2;
            return;
        }
        throw new IllegalArgumentException("The value " + d2 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilingTracesDirPath(@Nullable String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i2) {
        this.profilingTracesHz = i2;
    }

    public void setProguardUuid(@Nullable String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z) {
        this.propagateTraceparent = z;
    }

    public void setProxy(@Nullable m mVar) {
        this.proxy = mVar;
    }

    public void setReadTimeoutMillis(int i2) {
        this.readTimeoutMillis = i2;
    }

    public void setRelease(@Nullable String str) {
        this.release = str;
    }

    public void setReplayController(@Nullable InterfaceC2179Ur1 interfaceC2179Ur1) {
        if (interfaceC2179Ur1 == null) {
            interfaceC2179Ur1 = C0648Bc.d;
        }
        this.replayController = interfaceC2179Ur1;
    }

    public void setSampleRate(@Nullable Double d2) {
        if (io.sentry.util.u.c(d2, true)) {
            this.sampleRate = d2;
            return;
        }
        throw new IllegalArgumentException("The value " + d2 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(@Nullable r rVar) {
        r rVar2 = getSessionReplay().l;
        r rVar3 = this.sdkVersion;
        if (rVar3 != null && rVar2 != null && rVar3.equals(rVar2)) {
            getSessionReplay().l = rVar;
        }
        this.sdkVersion = rVar;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new io.sentry.clientreport.d(this);
        } else {
            this.clientReportRecorder = new io.sentry.clientreport.h();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSendModules(boolean z) {
        this.sendModules = z;
    }

    public void setSentryClientName(@Nullable String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(@Nullable InterfaceC1560Mu0 interfaceC1560Mu0) {
        io.sentry.util.l<InterfaceC1560Mu0> lVar = this.serializer;
        if (interfaceC1560Mu0 == null) {
            interfaceC1560Mu0 = C4597j51.a;
        }
        lVar.c(interfaceC1560Mu0);
    }

    public void setServerName(@Nullable String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j2) {
        this.sessionFlushTimeoutMillis = j2;
    }

    public void setSessionReplay(@NotNull C3121cH1 c3121cH1) {
        this.sessionReplay = c3121cH1;
    }

    public void setSessionTrackingIntervalMillis(long j2) {
        this.sessionTrackingIntervalMillis = j2;
    }

    public void setShutdownTimeoutMillis(long j2) {
        this.shutdownTimeoutMillis = j2;
    }

    public void setSocketTagger(@Nullable InterfaceC2265Vu0 interfaceC2265Vu0) {
        if (interfaceC2265Vu0 == null) {
            interfaceC2265Vu0 = C4807k51.a;
        }
        this.socketTagger = interfaceC2265Vu0;
    }

    public void setSpanFactory(@NotNull InterfaceC2451Xu0 interfaceC2451Xu0) {
        this.spanFactory = interfaceC2451Xu0;
    }

    public void setSpotlightConnectionUrl(@Nullable String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z) {
        this.startProfilerOnAppStart = z;
    }

    public void setTag(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(@NotNull io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTraceOptionsRequests(boolean z) {
        this.traceOptionsRequests = z;
    }

    public void setTracePropagationTargets(@Nullable List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(@Nullable Double d2) {
        if (io.sentry.util.u.c(d2, true)) {
            this.tracesSampleRate = d2;
            return;
        }
        throw new IllegalArgumentException("The value " + d2 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(@Nullable o oVar) {
        this.tracesSampler = oVar;
    }

    public void setTransactionProfiler(@Nullable InterfaceC4550iv0 interfaceC4550iv0) {
        if (this.transactionProfiler != C4466ii.e || interfaceC4550iv0 == null) {
            return;
        }
        this.transactionProfiler = interfaceC4550iv0;
    }

    public void setTransportFactory(@Nullable InterfaceC4770jv0 interfaceC4770jv0) {
        if (interfaceC4770jv0 == null) {
            interfaceC4770jv0 = C5650o51.d;
        }
        this.transportFactory = interfaceC4770jv0;
    }

    public void setTransportGate(@Nullable io.sentry.transport.f fVar) {
        if (fVar == null) {
            fVar = io.sentry.transport.i.a;
        }
        this.transportGate = fVar;
    }

    public void setVersionDetector(@NotNull InterfaceC6033pv0 interfaceC6033pv0) {
        this.versionDetector = interfaceC6033pv0;
    }

    public void setViewHierarchyExporters(@NotNull List<io.sentry.internal.viewhierarchy.a> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x028d  */
    private C2688aH1(boolean z) {
        InterfaceC2451Xu0 c2955bW;
        Class clsC;
        this.eventProcessors = new CopyOnWriteArrayList();
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        this.ignoredErrors = null;
        this.integrations = new CopyOnWriteArrayList();
        this.bundleIds = new CopyOnWriteArraySet();
        this.parsedDsn = new io.sentry.util.l<>(new io.sentry.util.l.a() { // from class: ZG1
            @Override // io.sentry.util.l.a
            public final Object b() {
                return this.d.lambda$new$0();
            }
        });
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        C2647a51 c2647a51 = C2647a51.a;
        this.logger = c2647a51;
        this.fatalLogger = c2647a51;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new io.sentry.util.l<>(new C5480nH0(this));
        this.envelopeReader = new io.sentry.util.l<>(new C6629sl(this));
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.maxFeatureFlags = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C5650o51.d;
        this.transportGate = io.sentry.transport.i.a;
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C4339i51.a;
        this.spotlightIntegrationLoaded = new AtomicBoolean(false);
        this.connectionTimeoutMillis = 30000;
        this.readTimeoutMillis = 30000;
        this.envelopeDiskCache = io.sentry.transport.g.d;
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.enableEventSizeLimiting = false;
        this.maxSpans = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = n.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C4466ii.e;
        this.continuousProfiler = X41.d;
        this.profilerConverter = C2871b51.a;
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.clientreport.d(this);
        this.modulesLoader = io.sentry.internal.modules.e.a;
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.a;
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = EnumC6511sB0.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.a;
        this.traceOptionsRequests = true;
        this.enableDatabaseTransactionTracing = false;
        this.dateProvider = new io.sentry.util.l<>(new SI0());
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = U41.a;
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = C6203qj0.b;
        this.connectionStatusProvider = new V41();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.c.d;
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = C5230m51.a;
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = C0648Bc.d;
        this.distributionController = C1874Qu.a;
        this.enableScreenTracking = true;
        this.defaultScopeType = PD1.ISOLATION;
        this.initPriority = EnumC2890bA0.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new C4527a();
        this.openTelemetryMode = YG1.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = C51.a;
        this.profileLifecycle = EnumC5147li1.MANUAL;
        this.startProfilerOnAppStart = false;
        this.deadlineTimeout = 30000L;
        h hVar = new h();
        hVar.a = false;
        hVar.b = new io.sentry.logger.a();
        this.logs = hVar;
        i iVar = new i();
        iVar.a = true;
        iVar.b = new io.sentry.metrics.a();
        this.metrics = iVar;
        this.socketTagger = C4807k51.a;
        this.distribution = new g();
        r rVarCreateSdkVersion = createSdkVersion();
        this.experimental = new C7847ya0();
        C3121cH1 c3121cH1 = new C3121cH1();
        c3121cH1.c = false;
        c3121cH1.f = C3121cH1.a.MEDIUM;
        c3121cH1.g = 1;
        c3121cH1.h = 30000L;
        c3121cH1.i = 5000L;
        c3121cH1.j = 3600000L;
        c3121cH1.k = true;
        c3121cH1.m = false;
        c3121cH1.n = EnumC4161hE1.PIXEL_COPY;
        List<String> list = Collections.EMPTY_LIST;
        c3121cH1.o = list;
        c3121cH1.p = list;
        c3121cH1.q = true;
        List<String> list2 = C3121cH1.t;
        c3121cH1.r = list2;
        c3121cH1.s = list2;
        if (!z) {
            ((CopyOnWriteArraySet) c3121cH1.a).add("android.widget.TextView");
            ((CopyOnWriteArraySet) c3121cH1.a).add("android.widget.ImageView");
            ((CopyOnWriteArraySet) c3121cH1.a).add("android.webkit.WebView");
            ((CopyOnWriteArraySet) c3121cH1.a).add("android.widget.VideoView");
            ((CopyOnWriteArraySet) c3121cH1.a).add("androidx.camera.view.PreviewView");
            ((CopyOnWriteArraySet) c3121cH1.a).add("androidx.media3.ui.PlayerView");
            ((CopyOnWriteArraySet) c3121cH1.a).add("com.google.android.exoplayer2.ui.PlayerView");
            ((CopyOnWriteArraySet) c3121cH1.a).add("com.google.android.exoplayer2.ui.StyledPlayerView");
            c3121cH1.l = rVarCreateSdkVersion;
        }
        this.sessionReplay = c3121cH1;
        IG1 ig1 = new IG1();
        ig1.a = false;
        ig1.b = true;
        ig1.c = false;
        ig1.d = true;
        ig1.e = true;
        ig1.f = true;
        this.feedbackOptions = ig1;
        if (z) {
            return;
        }
        if (io.sentry.util.r.a || !io.sentry.util.m.b("io.sentry.opentelemetry.OtelSpanFactory", c2647a51) || (clsC = io.sentry.util.m.c("io.sentry.opentelemetry.OtelSpanFactory", c2647a51)) == null) {
            c2955bW = new C2955bW();
        } else {
            try {
                Object objNewInstance = clsC.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance == null || !(objNewInstance instanceof InterfaceC2451Xu0)) {
                    c2955bW = new C2955bW();
                } else {
                    c2955bW = (InterfaceC2451Xu0) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        setSpanFactory(c2955bW);
        this.integrations.add(new UncaughtExceptionHandlerIntegration());
        this.integrations.add(new ShutdownHookIntegration());
        this.eventProcessors.add(new RV0(this));
        this.eventProcessors.add(new N40(this));
        if (!io.sentry.util.r.a) {
            this.eventProcessors.add(new C3331dH1());
        }
        setSentryClientName("sentry.java/8.35.0");
        setSdkVersion(rVarCreateSdkVersion);
        addPackageInfo();
    }

    public void setBeforeEnvelopeCallback(@Nullable b bVar) {
    }

    public void setBeforeSendReplay(@Nullable d dVar) {
    }

    public void setBeforeSendTransaction(@Nullable e eVar) {
    }

    public void setOnDiscard(@Nullable j jVar) {
    }

    public void setOnOversizedEvent(@Nullable k kVar) {
    }

    public void setProfilesSampler(@Nullable l lVar) {
    }
}

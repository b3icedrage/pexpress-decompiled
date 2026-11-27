package defpackage;

import com.appsflyer.sdk_base.BuildConfig;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.Y;
import io.sentry.cache.e;
import io.sentry.cache.f;
import io.sentry.config.d;
import io.sentry.config.h;
import io.sentry.internal.modules.b;
import io.sentry.internal.modules.c;
import io.sentry.protocol.F;
import io.sentry.protocol.u;
import io.sentry.transport.g;
import io.sentry.util.C4527a;
import io.sentry.util.C4528b;
import io.sentry.util.i;
import io.sentry.util.m;
import io.sentry.util.r;
import io.sentry.util.w;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class QF1 {

    @NotNull
    public static volatile InterfaceC1249Iu0 a = C3709f51.a;

    @NotNull
    public static volatile InterfaceC1171Hu0 b = C3290d51.b;

    @NotNull
    public static final KD1 c = new KD1(C2688aH1.empty());
    public static volatile boolean d = false;
    public static final Charset e = Charset.forName("UTF-8");
    public static final long f = System.currentTimeMillis();
    public static final C4527a g = new C4527a();

    public interface a<T extends C2688aH1> {
        void a(@NotNull T t);
    }

    @NotNull
    public static u a(@NotNull Throwable th, @NotNull MD1 md1) {
        return e().z(th, md1);
    }

    @NotNull
    public static u b(@NotNull String str, @NotNull NG1 ng1, @NotNull MD1 md1) {
        return e().n(str, ng1, md1);
    }

    public static void c() {
        C4527a.C0404a c0404aA = g.a();
        try {
            InterfaceC1171Hu0 interfaceC1171Hu0E = e();
            b = C3290d51.b;
            a.close();
            interfaceC1171Hu0E.a(false);
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

    public static void d(@NotNull MD1 md1) {
        e().A(null, md1);
    }

    @NotNull
    public static InterfaceC1171Hu0 e() {
        if (d) {
            return b;
        }
        InterfaceC1171Hu0 interfaceC1171Hu0 = a.get();
        if (interfaceC1171Hu0 != null && !interfaceC1171Hu0.j()) {
            return interfaceC1171Hu0;
        }
        InterfaceC1171Hu0 interfaceC1171Hu0C = b.C("getCurrentScopes");
        a.a(interfaceC1171Hu0C);
        return interfaceC1171Hu0C;
    }

    @Nullable
    public static InterfaceC2347Wu0 f() {
        return (d && r.a) ? e().r() : e().e();
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.Collection] */
    public static void g(@NotNull C3043bv c3043bv, @NotNull Y y) {
        int i = 1;
        int i2 = 0;
        C2688aH1 c2688aH1 = (C2688aH1) SentryAndroidOptions.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        try {
            y.a(c2688aH1);
        } catch (Throwable th) {
            c2688aH1.getLogger().d(NG1.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        C4527a.C0404a c0404aA = g.a();
        try {
            if (!c2688aH1.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && r.a) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(c2688aH1.getClass().getName()));
            }
            if (k(c2688aH1)) {
                Boolean boolIsGlobalHubMode = c2688aH1.isGlobalHubMode();
                boolean zBooleanValue = boolIsGlobalHubMode != null ? boolIsGlobalHubMode.booleanValue() : true;
                c2688aH1.getLogger().a(NG1.INFO, "GlobalHubMode: '%s'", String.valueOf(zBooleanValue));
                d = zBooleanValue;
                if (c2688aH1.getFatalLogger() instanceof C2647a51) {
                    c2688aH1.setFatalLogger(new C6561sS());
                }
                KD1 kd1 = c;
                if (i.b(kd1.m, c2688aH1, j())) {
                    if (j()) {
                        c2688aH1.getLogger().a(NG1.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    c2688aH1.activate();
                    e().a(true);
                    kd1.m = c2688aH1;
                    ?? r3 = kd1.h;
                    kd1.h = KD1.a(c2688aH1.getMaxBreadcrumbs());
                    Iterator it = r3.iterator();
                    while (it.hasNext()) {
                        kd1.l((C0702Bu) it.next(), null);
                    }
                    b = new RD1(new KD1(c2688aH1), new KD1(c2688aH1), kd1);
                    if (c2688aH1.isDebug() && (c2688aH1.getLogger() instanceof C2647a51)) {
                        c2688aH1.setLogger(new C6561sS());
                    }
                    i(c2688aH1);
                    a.a(b);
                    h(c2688aH1);
                    kd1.v = new YF1(c2688aH1);
                    if (c2688aH1.getExecutorService().isClosed()) {
                        c2688aH1.setExecutorService(new HG1(c2688aH1));
                        c2688aH1.getExecutorService().b();
                    }
                    try {
                        c2688aH1.getExecutorService().submit(new PF1(c2688aH1, i2));
                    } catch (RejectedExecutionException e2) {
                        c2688aH1.getLogger().d(NG1.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e2);
                    }
                    try {
                        c2688aH1.getExecutorService().submit(new RunnableC7313w11(c2688aH1));
                    } catch (Throwable th2) {
                        c2688aH1.getLogger().d(NG1.DEBUG, "Failed to move previous session.", th2);
                    }
                    for (OB0 ob0 : c2688aH1.getIntegrations()) {
                        try {
                            ob0.t(c2688aH1);
                        } catch (Throwable th3) {
                            c2688aH1.getLogger().d(NG1.WARNING, "Failed to register the integration " + ob0.getClass().getName(), th3);
                        }
                    }
                    try {
                        c2688aH1.getExecutorService().submit(new RunnableC2214Vd0(c2688aH1, 2));
                    } catch (Throwable th4) {
                        c2688aH1.getLogger().d(NG1.DEBUG, "Failed to notify options observers.", th4);
                    }
                    try {
                        c2688aH1.getExecutorService().submit(new RunnableC4045gh1(c2688aH1));
                    } catch (Throwable th5) {
                        c2688aH1.getLogger().d(NG1.DEBUG, "Failed to finalize previous session.", th5);
                    }
                    try {
                        c2688aH1.getExecutorService().submit(new RunnableC2136Ud0(c2688aH1, i));
                    } catch (Throwable th6) {
                        c2688aH1.getLogger().d(NG1.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th6);
                    }
                    ILogger logger = c2688aH1.getLogger();
                    NG1 ng1 = NG1.DEBUG;
                    logger.a(ng1, "Using openTelemetryMode %s", c2688aH1.getOpenTelemetryMode());
                    c2688aH1.getLogger().a(ng1, "Using span factory %s", c2688aH1.getSpanFactory().getClass().getName());
                    c2688aH1.getLogger().a(ng1, "Using scopes storage %s", a.getClass().getName());
                } else {
                    c2688aH1.getLogger().a(NG1.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
            }
            c0404aA.close();
        } catch (Throwable th7) {
            try {
                c0404aA.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    public static void h(@NotNull C2688aH1 c2688aH1) {
        f eVar;
        int i = 2;
        ILogger logger = c2688aH1.getLogger();
        NG1 ng1 = NG1.INFO;
        logger.a(ng1, "Initializing SDK with DSN: '%s'", c2688aH1.getDsn());
        String outboxPath = c2688aH1.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.a(ng1, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = c2688aH1.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (c2688aH1.getEnvelopeDiskCache() instanceof g) {
                int i2 = e.n;
                String cacheDirPath2 = c2688aH1.getCacheDirPath();
                int maxCacheItems = c2688aH1.getMaxCacheItems();
                if (cacheDirPath2 == null) {
                    c2688aH1.getLogger().a(NG1.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                    eVar = g.d;
                } else {
                    eVar = new e(c2688aH1, cacheDirPath2, maxCacheItems);
                }
                c2688aH1.setEnvelopeDiskCache(eVar);
            }
        }
        String profilingTracesDirPath = c2688aH1.getProfilingTracesDirPath();
        if ((c2688aH1.isProfilingEnabled() || c2688aH1.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                c2688aH1.getExecutorService().submit(new RunnableC3128cK(file, i));
            } catch (RejectedExecutionException e2) {
                c2688aH1.getLogger().d(NG1.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e2);
            }
        }
        b modulesLoader = c2688aH1.getModulesLoader();
        if (!c2688aH1.isSendModules()) {
            c2688aH1.setModulesLoader(io.sentry.internal.modules.e.a);
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            c2688aH1.setModulesLoader(new io.sentry.internal.modules.a(Arrays.asList(new c(c2688aH1.getLogger()), new io.sentry.internal.modules.f(c2688aH1.getLogger())), c2688aH1.getLogger()));
        }
        if (c2688aH1.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            c2688aH1.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(c2688aH1.getLogger()));
        }
        List<Properties> listA = c2688aH1.getDebugMetaLoader().a();
        if (listA != null) {
            if (c2688aH1.getBundleIds().isEmpty()) {
                Iterator<Properties> it = listA.iterator();
                while (it.hasNext()) {
                    String property = it.next().getProperty("io.sentry.bundle-ids");
                    c2688aH1.getLogger().a(NG1.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(",", -1)) {
                            c2688aH1.addBundleId(str);
                        }
                    }
                }
            }
            if (c2688aH1.getProguardUuid() == null) {
                Iterator<Properties> it2 = listA.iterator();
                while (it2.hasNext()) {
                    String property2 = it2.next().getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        c2688aH1.getLogger().a(NG1.DEBUG, "Proguard UUID found: %s", property2);
                        c2688aH1.setProguardUuid(property2);
                        break;
                    }
                }
            }
            for (Properties properties : listA) {
                String property3 = properties.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = properties.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = "unknown";
                    }
                    c2688aH1.getLogger().a(NG1.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    LG1.d().b(property3, property4);
                    break;
                }
            }
            for (Properties properties2 : listA) {
                String property5 = properties2.getProperty("io.sentry.distribution.org-slug");
                String property6 = properties2.getProperty("io.sentry.distribution.project-slug");
                String property7 = properties2.getProperty("io.sentry.distribution.auth-token");
                String property8 = properties2.getProperty("io.sentry.distribution.build-configuration");
                String property9 = properties2.getProperty("io.sentry.distribution.install-groups-override");
                if (property5 != null || property6 != null || property7 != null || property8 != null || property9 != null) {
                    C2688aH1.g distribution = c2688aH1.getDistribution();
                    if (property5 != null && !property5.isEmpty() && distribution.b.isEmpty()) {
                        c2688aH1.getLogger().a(NG1.DEBUG, "Distribution org slug found: %s", property5);
                        distribution.b = property5;
                    }
                    if (property6 != null && !property6.isEmpty() && distribution.c.isEmpty()) {
                        c2688aH1.getLogger().a(NG1.DEBUG, "Distribution project slug found: %s", property6);
                        distribution.c = property6;
                    }
                    if (property7 != null && !property7.isEmpty() && distribution.a.isEmpty()) {
                        c2688aH1.getLogger().a(NG1.DEBUG, "Distribution org auth token found", new Object[0]);
                        distribution.a = property7;
                    }
                    if (property8 != null && !property8.isEmpty() && distribution.d == null) {
                        c2688aH1.getLogger().a(NG1.DEBUG, "Distribution build configuration found: %s", property8);
                        distribution.d = property8;
                    }
                    if (property9 != null && !property9.isEmpty() && distribution.e == null) {
                        String[] strArrSplit = property9.split(",", -1);
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strTrim = str2.trim();
                            if (!strTrim.isEmpty()) {
                                arrayList.add(strTrim);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            c2688aH1.getLogger().a(NG1.DEBUG, "Distribution install groups override found: %s", arrayList);
                            distribution.e = arrayList;
                            break;
                        }
                        break;
                    }
                    break;
                    break;
                    break;
                }
            }
        }
        if (c2688aH1.getThreadChecker() instanceof io.sentry.util.thread.b) {
            c2688aH1.setThreadChecker(io.sentry.util.thread.c.b);
        }
        if (c2688aH1.getPerformanceCollectors().isEmpty()) {
            c2688aH1.addPerformanceCollector(new C7781yE0());
        }
        if (c2688aH1.isEnableBackpressureHandling() && !r.a) {
            if (c2688aH1.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                c2688aH1.setBackpressureMonitor(new io.sentry.backpressure.a(c2688aH1));
            }
            c2688aH1.getBackpressureMonitor().start();
        }
        if (!r.a && c2688aH1.isContinuousProfilingEnabled() && (c2688aH1.getContinuousProfiler() instanceof X41)) {
            try {
                InterfaceC5394ms0 interfaceC5394ms0A = io.sentry.profiling.c.a(c2688aH1.getLogger(), i.a(c2688aH1), c2688aH1.getProfilingTracesHz(), c2688aH1.getExecutorService());
                if (interfaceC5394ms0A instanceof X41) {
                    c2688aH1.getLogger().a(NG1.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
                } else {
                    c2688aH1.setContinuousProfiler(interfaceC5394ms0A);
                    c2688aH1.getLogger().a(NG1.INFO, "Successfully loaded profiler", new Object[0]);
                }
            } catch (Exception e3) {
                c2688aH1.getLogger().d(NG1.ERROR, "Failed to create default profiling traces directory", e3);
            }
            c2688aH1.getContinuousProfiler();
        } else {
            c2688aH1.getContinuousProfiler();
        }
        if (!r.a && c2688aH1.isContinuousProfilingEnabled() && (c2688aH1.getProfilerConverter() instanceof C2871b51)) {
            InterfaceC6869tu0 interfaceC6869tu0A = C2871b51.a;
            ILogger logger2 = c.m.getLogger();
            try {
                Iterator it3 = ServiceLoader.load(io.sentry.profiling.b.class).iterator();
                io.sentry.profiling.b bVar = (io.sentry.profiling.b) (it3.hasNext() ? it3.next() : null);
                if (bVar != null) {
                    logger2.a(NG1.DEBUG, "Loaded profile converter from provider: %s", bVar.getClass().getName());
                    interfaceC6869tu0A = bVar.a();
                } else {
                    logger2.a(NG1.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
                }
            } catch (Throwable th) {
                logger2.d(NG1.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th);
            }
            if (interfaceC6869tu0A instanceof C2871b51) {
                c2688aH1.getLogger().a(NG1.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
            } else {
                c2688aH1.setProfilerConverter(interfaceC6869tu0A);
                c2688aH1.getLogger().a(NG1.INFO, "Successfully loaded profile converter", new Object[0]);
            }
            c2688aH1.getProfilerConverter();
        } else {
            c2688aH1.getProfilerConverter();
        }
        c2688aH1.getLogger().a(NG1.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(c2688aH1.isContinuousProfilingEnabled()), c2688aH1.getProfileLifecycle());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    public static void i(C2688aH1 c2688aH1) {
        InterfaceC1249Iu0 uv;
        Class clsC;
        List list;
        boolean z = r.a;
        C2647a51 c2647a51 = C2647a51.a;
        if (!z) {
            if (YG1.AUTO.equals(c2688aH1.getOpenTelemetryMode())) {
                if (m.b("io.sentry.opentelemetry.agent.AgentMarker", c2647a51)) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    c2688aH1.setOpenTelemetryMode(YG1.AGENT);
                } else if (m.b("io.sentry.opentelemetry.agent.AgentlessMarker", c2647a51)) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    c2688aH1.setOpenTelemetryMode(YG1.AGENTLESS);
                } else if (m.b("io.sentry.opentelemetry.agent.AgentlessSpringMarker", c2647a51)) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    c2688aH1.setOpenTelemetryMode(YG1.AGENTLESS_SPRING);
                }
            }
        }
        YG1 yg1 = YG1.OFF;
        if (yg1 == c2688aH1.getOpenTelemetryMode()) {
            c2688aH1.setSpanFactory(new C2955bW());
        }
        a.close();
        if (yg1 == c2688aH1.getOpenTelemetryMode()) {
            a = new UV();
        } else {
            if (z || !m.b("io.sentry.opentelemetry.OtelContextScopesStorage", c2647a51) || (clsC = m.c("io.sentry.opentelemetry.OtelContextScopesStorage", c2647a51)) == null) {
                uv = new UV();
            } else {
                try {
                    Object objNewInstance = clsC.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (objNewInstance == null || !(objNewInstance instanceof InterfaceC1249Iu0)) {
                        uv = new UV();
                    } else {
                        uv = (InterfaceC1249Iu0) objNewInstance;
                    }
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            a = uv;
        }
        if (r.a) {
            return;
        }
        YG1 openTelemetryMode = c2688aH1.getOpenTelemetryMode();
        if (YG1.OFF.equals(openTelemetryMode)) {
            list = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap concurrentHashMap = w.a;
            ArrayList arrayList = new ArrayList();
            YG1 yg2 = YG1.AGENT;
            if (yg2 == openTelemetryMode || YG1.AGENTLESS_SPRING == openTelemetryMode) {
                arrayList.add("auto.http.spring_jakarta.webmvc");
                arrayList.add("auto.http.spring.webmvc");
                arrayList.add("auto.http.spring7.webmvc");
                arrayList.add("auto.spring_jakarta.webflux");
                arrayList.add("auto.spring.webflux");
                arrayList.add("auto.spring7.webflux");
                arrayList.add("auto.db.jdbc");
                arrayList.add("auto.http.spring_jakarta.webclient");
                arrayList.add("auto.http.spring.webclient");
                arrayList.add("auto.http.spring7.webclient");
                arrayList.add("auto.http.spring_jakarta.restclient");
                arrayList.add("auto.http.spring.restclient");
                arrayList.add("auto.http.spring7.restclient");
                arrayList.add("auto.http.spring_jakarta.resttemplate");
                arrayList.add("auto.http.spring.resttemplate");
                arrayList.add("auto.http.spring7.resttemplate");
                arrayList.add("auto.http.openfeign");
                arrayList.add("auto.http.ktor-client");
            }
            if (yg2 == openTelemetryMode) {
                arrayList.add("auto.graphql.graphql");
                arrayList.add("auto.graphql.graphql22");
            }
            list = arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c2688aH1.addIgnoredSpanOrigin((String) it.next());
        }
    }

    public static boolean j() {
        return e().isEnabled();
    }

    public static boolean k(@NotNull C2688aH1 c2688aH1) {
        Properties properties;
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        Properties propertiesA;
        Properties propertiesA2;
        if (c2688aH1.isEnableExternalConfiguration()) {
            C6561sS c6561sS = new C6561sS();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new h("sentry.", System.getProperties()));
            arrayList.add(new d());
            String property = System.getProperty("sentry.properties.file");
            if (property != null && (propertiesA2 = new io.sentry.config.e(property, c6561sS, true).a()) != null) {
                arrayList.add(new io.sentry.config.g(propertiesA2));
            }
            String str = System.getenv("SENTRY_PROPERTIES_FILE");
            if (str != null && (propertiesA = new io.sentry.config.e(str, c6561sS, true).a()) != null) {
                arrayList.add(new io.sentry.config.g(propertiesA));
            }
            Double dValueOf4 = null;
            try {
                InputStream resourceAsStream = C4528b.a(io.sentry.config.b.class.getClassLoader()).getResourceAsStream("sentry.properties");
                if (resourceAsStream != null) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                        try {
                            properties = new Properties();
                            properties.load(bufferedInputStream);
                            bufferedInputStream.close();
                            resourceAsStream.close();
                        } catch (Throwable th) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } else {
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                    properties = null;
                }
            } catch (IOException e2) {
                c6561sS.c(NG1.ERROR, e2, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
            }
            if (properties != null) {
                arrayList.add(new io.sentry.config.g(properties));
            }
            Properties propertiesA3 = new io.sentry.config.e("sentry.properties", c6561sS, false).a();
            if (propertiesA3 != null) {
                arrayList.add(new io.sentry.config.g(propertiesA3));
            }
            io.sentry.config.c cVar = new io.sentry.config.c(arrayList);
            ILogger logger = c2688aH1.getLogger();
            C2287Wa0 c2287Wa0 = new C2287Wa0();
            c2287Wa0.a = cVar.a("dsn");
            c2287Wa0.b = cVar.a("environment");
            c2287Wa0.c = cVar.a(BuildConfig.BUILD_TYPE);
            c2287Wa0.d = cVar.a("dist");
            c2287Wa0.e = cVar.a("servername");
            c2287Wa0.f = cVar.b("uncaught.handler.enabled");
            c2287Wa0.y = cVar.b("uncaught.handler.print-stacktrace");
            String strA = cVar.a("sample-rate");
            if (strA != null) {
                try {
                    dValueOf = Double.valueOf(strA);
                } catch (NumberFormatException unused) {
                    dValueOf = null;
                }
            } else {
                dValueOf = null;
            }
            c2287Wa0.i = dValueOf;
            String strA2 = cVar.a("traces-sample-rate");
            if (strA2 != null) {
                try {
                    dValueOf2 = Double.valueOf(strA2);
                } catch (NumberFormatException unused2) {
                    dValueOf2 = null;
                }
            } else {
                dValueOf2 = null;
            }
            c2287Wa0.j = dValueOf2;
            String strA3 = cVar.a("profiles-sample-rate");
            if (strA3 != null) {
                try {
                    dValueOf3 = Double.valueOf(strA3);
                } catch (NumberFormatException unused3) {
                    dValueOf3 = null;
                }
            } else {
                dValueOf3 = null;
            }
            c2287Wa0.k = dValueOf3;
            c2287Wa0.g = cVar.b("debug");
            c2287Wa0.h = cVar.b("enable-deduplication");
            c2287Wa0.z = cVar.b("send-client-reports");
            c2287Wa0.O = cVar.b("force-init");
            String strA4 = cVar.a("max-request-body-size");
            if (strA4 != null) {
                c2287Wa0.l = C2688aH1.n.valueOf(strA4.toUpperCase(Locale.ROOT));
            }
            for (Map.Entry entry : ((ConcurrentHashMap) cVar.d()).entrySet()) {
                c2287Wa0.m.put((String) entry.getKey(), (String) entry.getValue());
            }
            String strA5 = cVar.a("proxy.host");
            String strA6 = cVar.a("proxy.user");
            String strA7 = cVar.a("proxy.pass");
            String strA8 = cVar.a("proxy.port");
            if (strA8 == null) {
                strA8 = "80";
            }
            if (strA5 != null) {
                C2688aH1.m mVar = new C2688aH1.m();
                mVar.a = strA5;
                mVar.b = strA8;
                mVar.c = strA6;
                mVar.d = strA7;
                c2287Wa0.n = mVar;
            }
            Iterator<String> it = cVar.e("in-app-includes").iterator();
            while (it.hasNext()) {
                c2287Wa0.p.add(it.next());
            }
            Iterator<String> it2 = cVar.e("in-app-excludes").iterator();
            while (it2.hasNext()) {
                c2287Wa0.o.add(it2.next());
            }
            List<String> listE = cVar.a("trace-propagation-targets") != null ? cVar.e("trace-propagation-targets") : null;
            if (listE == null && cVar.a("tracing-origins") != null) {
                listE = cVar.e("tracing-origins");
            }
            if (listE != null) {
                for (String str2 : listE) {
                    if (c2287Wa0.q == null) {
                        c2287Wa0.q = new CopyOnWriteArrayList();
                    }
                    if (!str2.isEmpty()) {
                        c2287Wa0.q.add(str2);
                    }
                }
            }
            Iterator<String> it3 = cVar.e("context-tags").iterator();
            while (it3.hasNext()) {
                c2287Wa0.r.add(it3.next());
            }
            c2287Wa0.s = cVar.a("proguard-uuid");
            Iterator<String> it4 = cVar.e("bundle-ids").iterator();
            while (it4.hasNext()) {
                c2287Wa0.A.add(it4.next());
            }
            c2287Wa0.t = cVar.c("idle-timeout");
            c2287Wa0.u = cVar.c("shutdown-timeout-millis");
            c2287Wa0.v = cVar.c("session-flush-timeout-millis");
            String strA9 = cVar.a("ignored-errors");
            c2287Wa0.x = strA9 != null ? Arrays.asList(strA9.split(",")) : null;
            c2287Wa0.B = cVar.b("enabled");
            c2287Wa0.C = cVar.b("enable-pretty-serialization-output");
            c2287Wa0.J = cVar.b("send-modules");
            c2287Wa0.K = cVar.b("send-default-pii");
            String strA10 = cVar.a("ignored-checkins");
            c2287Wa0.H = strA10 != null ? Arrays.asList(strA10.split(",")) : null;
            String strA11 = cVar.a("ignored-transactions");
            c2287Wa0.I = strA11 != null ? Arrays.asList(strA11.split(",")) : null;
            c2287Wa0.L = cVar.b("enable-backpressure-handling");
            c2287Wa0.M = cVar.b("enable-database-transaction-tracing");
            c2287Wa0.N = cVar.b("global-hub-mode");
            c2287Wa0.P = cVar.b("capture-open-telemetry-events");
            c2287Wa0.E = cVar.b("logs.enabled");
            c2287Wa0.F = cVar.b("metrics.enabled");
            for (String str3 : cVar.e("ignored-exceptions-for-type")) {
                try {
                    Class<?> cls = Class.forName(str3);
                    if (Throwable.class.isAssignableFrom(cls)) {
                        c2287Wa0.w.add(cls);
                    } else {
                        logger.a(NG1.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str3, str3);
                    }
                } catch (ClassNotFoundException unused4) {
                    logger.a(NG1.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str3, str3);
                }
            }
            Long lC = cVar.c("cron.default-checkin-margin");
            Long lC2 = cVar.c("cron.default-max-runtime");
            String strA12 = cVar.a("cron.default-timezone");
            Long lC3 = cVar.c("cron.default-failure-issue-threshold");
            Long lC4 = cVar.c("cron.default-recovery-threshold");
            if (lC != null || lC2 != null || strA12 != null || lC3 != null || lC4 != null) {
                C2688aH1.f fVar = new C2688aH1.f();
                fVar.a = lC;
                fVar.b = lC2;
                fVar.c = strA12;
                fVar.d = lC3;
                fVar.e = lC4;
                c2287Wa0.T = fVar;
            }
            c2287Wa0.D = cVar.b("enable-spotlight");
            c2287Wa0.G = cVar.a("spotlight-connection-url");
            String strA13 = cVar.a("profile-session-sample-rate");
            if (strA13 != null) {
                try {
                    dValueOf4 = Double.valueOf(strA13);
                } catch (NumberFormatException unused5) {
                }
            }
            c2287Wa0.Q = dValueOf4;
            c2287Wa0.R = cVar.a("profiling-traces-dir-path");
            String strA14 = cVar.a("profile-lifecycle");
            if (strA14 != null && !strA14.isEmpty()) {
                c2287Wa0.S = EnumC5147li1.valueOf(strA14.toUpperCase());
            }
            c2688aH1.merge(c2287Wa0);
        }
        String dsn = c2688aH1.getDsn();
        if (!c2688aH1.isEnabled() || (dsn != null && dsn.isEmpty())) {
            c();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        c2688aH1.retrieveParsedDsn();
        return true;
    }

    public static void l(@Nullable String str) {
        e().removeTag(str);
    }

    public static void m(@Nullable String str, @Nullable String str2) {
        e().b(str, str2);
    }

    public static void n(@Nullable F f2) {
        e().c(f2);
    }
}

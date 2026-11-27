package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import defpackage.C2688aH1;
import defpackage.C2692aJ;
import defpackage.C2745aa1;
import defpackage.C2872b52;
import defpackage.C2916bJ;
import defpackage.C3335dJ;
import defpackage.C3544eJ;
import defpackage.C3980gO0;
import defpackage.C5367mk0;
import defpackage.C5577nk0;
import defpackage.C5760od1;
import defpackage.C5787ok0;
import defpackage.C5997pk0;
import defpackage.C6170qb;
import defpackage.C6207qk0;
import defpackage.C6416rk0;
import defpackage.C6589sb;
import defpackage.C8002zI;
import defpackage.Cc2;
import defpackage.EnumC1134Hi;
import defpackage.KO;
import defpackage.LO;
import defpackage.MO;
import defpackage.QZ1;
import defpackage.RunnableC6836tk0;
import defpackage.VU;
import defpackage.WU;
import defpackage.Y60;
import defpackage.ZY0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private EnumC1134Hi applicationProcessState;
    private final C8002zI configResolver;
    private final C3980gO0<LO> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final C3980gO0<ScheduledExecutorService> gaugeManagerExecutor;
    private C6207qk0 gaugeMetadataManager;
    private final C3980gO0<ZY0> memoryGaugeCollector;
    private String sessionId;
    private final C2872b52 transportManager;
    private static final C6170qb logger = C6170qb.d();
    private static final GaugeManager instance = new GaugeManager();

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new C3980gO0(new C5367mk0()), C2872b52.w, C8002zI.e(), null, new C3980gO0(new C5577nk0(0)), new C3980gO0(new C5787ok0()));
    }

    private static void collectGaugeMetricOnce(LO lo, ZY0 zy0, QZ1 qz1) {
        synchronized (lo) {
            try {
                lo.b.schedule(new KO(0, lo, qz1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                LO.g.f("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
        synchronized (zy0) {
            try {
                zy0.a.schedule(new RunnableC6836tk0(2, zy0, qz1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                ZY0.f.f("Unable to collect Memory Metric: " + e2.getMessage());
            }
        }
    }

    private long getCpuGaugeCollectionFrequencyMs(EnumC1134Hi enumC1134Hi) {
        C2916bJ c2916bJ;
        long jLongValue;
        C2692aJ c2692aJ;
        int iOrdinal = enumC1134Hi.ordinal();
        if (iOrdinal == 1) {
            C8002zI c8002zI = this.configResolver;
            c8002zI.getClass();
            synchronized (C2916bJ.class) {
                try {
                    if (C2916bJ.e == null) {
                        C2916bJ.e = new C2916bJ();
                    }
                    c2916bJ = C2916bJ.e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C2745aa1<Long> c2745aa1J = c8002zI.j(c2916bJ);
            if (c2745aa1J.b() && C8002zI.n(c2745aa1J.a().longValue())) {
                jLongValue = c2745aa1J.a().longValue();
            } else {
                C2745aa1<Long> c2745aa1 = c8002zI.a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (c2745aa1.b() && C8002zI.n(c2745aa1.a().longValue())) {
                    c8002zI.c.e("com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs", c2745aa1.a().longValue());
                    jLongValue = c2745aa1.a().longValue();
                } else {
                    C2745aa1<Long> c2745aa1C = c8002zI.c(c2916bJ);
                    jLongValue = (c2745aa1C.b() && C8002zI.n(c2745aa1C.a().longValue())) ? c2745aa1C.a().longValue() : 100L;
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            C8002zI c8002zI2 = this.configResolver;
            c8002zI2.getClass();
            synchronized (C2692aJ.class) {
                try {
                    if (C2692aJ.e == null) {
                        C2692aJ.e = new C2692aJ();
                    }
                    c2692aJ = C2692aJ.e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C2745aa1<Long> c2745aa1J2 = c8002zI2.j(c2692aJ);
            if (c2745aa1J2.b() && C8002zI.n(c2745aa1J2.a().longValue())) {
                jLongValue = c2745aa1J2.a().longValue();
            } else {
                C2745aa1<Long> c2745aa2 = c8002zI2.a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (c2745aa2.b() && C8002zI.n(c2745aa2.a().longValue())) {
                    c8002zI2.c.e("com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs", c2745aa2.a().longValue());
                    jLongValue = c2745aa2.a().longValue();
                } else {
                    C2745aa1<Long> c2745aa1C2 = c8002zI2.c(c2692aJ);
                    jLongValue = (c2745aa1C2.b() && C8002zI.n(c2745aa1C2.a().longValue())) ? c2745aa1C2.a().longValue() : 0L;
                }
            }
        }
        C6170qb c6170qb = LO.g;
        return jLongValue <= 0 ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    private C5997pk0 getGaugeMetadata() {
        C5997pk0.a aVarB = C5997pk0.B();
        int iB = Cc2.b(this.gaugeMetadataManager.c.totalMem / 1024);
        aVarB.p();
        C5997pk0.y((C5997pk0) aVarB.e, iB);
        int iB2 = Cc2.b(this.gaugeMetadataManager.a.maxMemory() / 1024);
        aVarB.p();
        C5997pk0.w((C5997pk0) aVarB.e, iB2);
        int iB3 = Cc2.b((((long) this.gaugeMetadataManager.b.getMemoryClass()) * C2688aH1.MAX_EVENT_SIZE_BYTES) / 1024);
        aVarB.p();
        C5997pk0.x((C5997pk0) aVarB.e, iB3);
        return aVarB.n();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(EnumC1134Hi enumC1134Hi) {
        C3544eJ c3544eJ;
        long jLongValue;
        C3335dJ c3335dJ;
        int iOrdinal = enumC1134Hi.ordinal();
        if (iOrdinal == 1) {
            C8002zI c8002zI = this.configResolver;
            c8002zI.getClass();
            synchronized (C3544eJ.class) {
                try {
                    if (C3544eJ.e == null) {
                        C3544eJ.e = new C3544eJ();
                    }
                    c3544eJ = C3544eJ.e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C2745aa1<Long> c2745aa1J = c8002zI.j(c3544eJ);
            if (c2745aa1J.b() && C8002zI.n(c2745aa1J.a().longValue())) {
                jLongValue = c2745aa1J.a().longValue();
            } else {
                C2745aa1<Long> c2745aa1 = c8002zI.a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (c2745aa1.b() && C8002zI.n(c2745aa1.a().longValue())) {
                    c8002zI.c.e("com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs", c2745aa1.a().longValue());
                    jLongValue = c2745aa1.a().longValue();
                } else {
                    C2745aa1<Long> c2745aa1C = c8002zI.c(c3544eJ);
                    jLongValue = (c2745aa1C.b() && C8002zI.n(c2745aa1C.a().longValue())) ? c2745aa1C.a().longValue() : 100L;
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            C8002zI c8002zI2 = this.configResolver;
            c8002zI2.getClass();
            synchronized (C3335dJ.class) {
                try {
                    if (C3335dJ.e == null) {
                        C3335dJ.e = new C3335dJ();
                    }
                    c3335dJ = C3335dJ.e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C2745aa1<Long> c2745aa1J2 = c8002zI2.j(c3335dJ);
            if (c2745aa1J2.b() && C8002zI.n(c2745aa1J2.a().longValue())) {
                jLongValue = c2745aa1J2.a().longValue();
            } else {
                C2745aa1<Long> c2745aa2 = c8002zI2.a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (c2745aa2.b() && C8002zI.n(c2745aa2.a().longValue())) {
                    c8002zI2.c.e("com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs", c2745aa2.a().longValue());
                    jLongValue = c2745aa2.a().longValue();
                } else {
                    C2745aa1<Long> c2745aa1C2 = c8002zI2.c(c3335dJ);
                    jLongValue = (c2745aa1C2.b() && C8002zI.n(c2745aa1C2.a().longValue())) ? c2745aa1C2.a().longValue() : 0L;
                }
            }
        }
        C6170qb c6170qb = ZY0.f;
        return jLongValue <= 0 ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LO lambda$new$0() {
        return new LO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ZY0 lambda$new$1() {
        return new ZY0();
    }

    private boolean startCollectingCpuMetrics(long j, QZ1 qz1) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a();
            return false;
        }
        LO lo = this.cpuGaugeCollector.get();
        long j2 = lo.d;
        if (j2 == INVALID_GAUGE_COLLECTION_FREQUENCY || j2 == 0 || j <= 0) {
            return true;
        }
        ScheduledFuture scheduledFuture = lo.e;
        if (scheduledFuture == null) {
            lo.a(j, qz1);
            return true;
        }
        if (lo.f == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            lo.e = null;
            lo.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        lo.a(j, qz1);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, QZ1 qz1) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a();
            return false;
        }
        ZY0 zy0 = this.memoryGaugeCollector.get();
        C6170qb c6170qb = ZY0.f;
        if (j <= 0) {
            zy0.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = zy0.d;
        if (scheduledFuture == null) {
            zy0.a(j, qz1);
            return true;
        }
        if (zy0.e == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            zy0.d = null;
            zy0.e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        zy0.a(j, qz1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, EnumC1134Hi enumC1134Hi) {
        C6416rk0.a aVarG = C6416rk0.G();
        while (!this.cpuGaugeCollector.get().a.isEmpty()) {
            MO moPoll = this.cpuGaugeCollector.get().a.poll();
            aVarG.p();
            C6416rk0.z((C6416rk0) aVarG.e, moPoll);
        }
        while (!this.memoryGaugeCollector.get().b.isEmpty()) {
            C6589sb c6589sbPoll = this.memoryGaugeCollector.get().b.poll();
            aVarG.p();
            C6416rk0.x((C6416rk0) aVarG.e, c6589sbPoll);
        }
        aVarG.p();
        C6416rk0.w((C6416rk0) aVarG.e, str);
        C2872b52 c2872b52 = this.transportManager;
        c2872b52.m.execute(new Y60(c2872b52, aVarG.n(), enumC1134Hi, 1));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new C6207qk0(context);
    }

    public boolean logGaugeMetadata(String str, EnumC1134Hi enumC1134Hi) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        C6416rk0.a aVarG = C6416rk0.G();
        aVarG.p();
        C6416rk0.w((C6416rk0) aVarG.e, str);
        C5997pk0 gaugeMetadata = getGaugeMetadata();
        aVarG.p();
        C6416rk0.y((C6416rk0) aVarG.e, gaugeMetadata);
        C6416rk0 c6416rk0N = aVarG.n();
        C2872b52 c2872b52 = this.transportManager;
        c2872b52.m.execute(new Y60(c2872b52, c6416rk0N, enumC1134Hi, 1));
        return true;
    }

    public void startCollectingGauges(C5760od1 c5760od1, EnumC1134Hi enumC1134Hi) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(enumC1134Hi, c5760od1.e);
        if (jStartCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = c5760od1.d;
        this.sessionId = str;
        this.applicationProcessState = enumC1134Hi;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new WU(this, str, enumC1134Hi, 1), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.f("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        EnumC1134Hi enumC1134Hi = this.applicationProcessState;
        LO lo = this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = lo.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            lo.e = null;
            lo.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        ZY0 zy0 = this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = zy0.d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            zy0.d = null;
            zy0.e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new VU(this, str, enumC1134Hi, 1), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = EnumC1134Hi.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(C3980gO0<ScheduledExecutorService> c3980gO0, C2872b52 c2872b52, C8002zI c8002zI, C6207qk0 c6207qk0, C3980gO0<LO> c3980gO1, C3980gO0<ZY0> c3980gO2) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = EnumC1134Hi.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = c3980gO0;
        this.transportManager = c2872b52;
        this.configResolver = c8002zI;
        this.gaugeMetadataManager = c6207qk0;
        this.cpuGaugeCollector = c3980gO1;
        this.memoryGaugeCollector = c3980gO2;
    }

    private long startCollectingGauges(EnumC1134Hi enumC1134Hi, QZ1 qz1) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(enumC1134Hi);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, qz1)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(enumC1134Hi);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, qz1)) {
            return cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }

    public void collectGaugeMetricOnce(QZ1 qz1) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), qz1);
    }
}

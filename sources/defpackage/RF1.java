package defpackage;

import io.sentry.ILogger;
import io.sentry.util.v;
import io.sentry.vendor.gson.stream.b;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class RF1 implements BH0 {
    public boolean d;

    @Nullable
    public Double e;
    public boolean g;

    @Nullable
    public Double h;

    @Nullable
    public String i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;

    @NotNull
    public EnumC5147li1 p;

    @Nullable
    public ConcurrentHashMap q;

    public static final class a implements KG0<RF1> {
        @Override // defpackage.KG0
        @NotNull
        public final RF1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            RF1 rf1 = new RF1();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "is_enable_app_start_profiling":
                        Boolean boolH0 = q71.H0();
                        if (boolH0 != null) {
                            rf1.n = boolH0.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "trace_sampled":
                        Boolean boolH1 = q71.H0();
                        if (boolH1 != null) {
                            rf1.g = boolH1.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profiling_traces_dir_path":
                        String strE0 = q71.e0();
                        if (strE0 != null) {
                            rf1.i = strE0;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_continuous_profiling_enabled":
                        Boolean boolH2 = q71.H0();
                        if (boolH2 != null) {
                            rf1.k = boolH2.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_profiling_enabled":
                        Boolean boolH3 = q71.H0();
                        if (boolH3 != null) {
                            rf1.j = boolH3.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_start_profiler_on_app_start":
                        Boolean boolH4 = q71.H0();
                        if (boolH4 != null) {
                            rf1.o = boolH4.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_sampled":
                        Boolean boolH5 = q71.H0();
                        if (boolH5 != null) {
                            rf1.d = boolH5.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_lifecycle":
                        String strE1 = q71.e0();
                        if (strE1 != null) {
                            try {
                                rf1.p = EnumC5147li1.valueOf(strE1);
                            } catch (IllegalArgumentException unused) {
                                iLogger.a(NG1.ERROR, "Error when deserializing ProfileLifecycle: ".concat(strE1), new Object[0]);
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "continuous_profile_sampled":
                        Boolean boolH6 = q71.H0();
                        if (boolH6 != null) {
                            rf1.m = boolH6.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profiling_traces_hz":
                        Integer numK = q71.K();
                        if (numK != null) {
                            rf1.l = numK.intValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "trace_sample_rate":
                        Double dU0 = q71.u0();
                        if (dU0 != null) {
                            rf1.h = dU0;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_sample_rate":
                        Double dU1 = q71.u0();
                        if (dU1 != null) {
                            rf1.e = dU1;
                            break;
                        } else {
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            rf1.q = concurrentHashMap;
            q71.B0();
            return rf1;
        }
    }

    public RF1() {
        this.g = false;
        this.h = null;
        this.d = false;
        this.e = null;
        this.m = false;
        this.i = null;
        this.j = false;
        this.k = false;
        this.p = EnumC5147li1.MANUAL;
        this.l = 0;
        this.n = true;
        this.o = false;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("profile_sampled");
        c6319rH0.g(iLogger, Boolean.valueOf(this.d));
        c6319rH0.c("profile_sample_rate");
        c6319rH0.g(iLogger, this.e);
        c6319rH0.c("continuous_profile_sampled");
        c6319rH0.g(iLogger, Boolean.valueOf(this.m));
        c6319rH0.c("trace_sampled");
        c6319rH0.g(iLogger, Boolean.valueOf(this.g));
        c6319rH0.c("trace_sample_rate");
        c6319rH0.g(iLogger, this.h);
        c6319rH0.c("profiling_traces_dir_path");
        c6319rH0.g(iLogger, this.i);
        c6319rH0.c("is_profiling_enabled");
        c6319rH0.g(iLogger, Boolean.valueOf(this.j));
        c6319rH0.c("is_continuous_profiling_enabled");
        c6319rH0.g(iLogger, Boolean.valueOf(this.k));
        c6319rH0.c("profile_lifecycle");
        c6319rH0.g(iLogger, this.p.name());
        c6319rH0.c("profiling_traces_hz");
        c6319rH0.g(iLogger, Integer.valueOf(this.l));
        c6319rH0.c("is_enable_app_start_profiling");
        c6319rH0.g(iLogger, Boolean.valueOf(this.n));
        c6319rH0.c("is_start_profiler_on_app_start");
        c6319rH0.g(iLogger, Boolean.valueOf(this.o));
        ConcurrentHashMap concurrentHashMap = this.q;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.q, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public RF1(@NotNull C2688aH1 c2688aH1, @NotNull L02 l02) {
        this.g = l02.a.booleanValue();
        this.h = l02.b;
        this.d = l02.d.booleanValue();
        this.e = l02.e;
        K02 internalTracesSampler = c2688aH1.getInternalTracesSampler();
        double dC = v.a().c();
        Double profileSessionSampleRate = internalTracesSampler.a.getProfileSessionSampleRate();
        this.m = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dC;
        this.i = c2688aH1.getProfilingTracesDirPath();
        this.j = c2688aH1.isProfilingEnabled();
        this.k = c2688aH1.isContinuousProfilingEnabled();
        this.p = c2688aH1.getProfileLifecycle();
        this.l = c2688aH1.getProfilingTracesHz();
        this.n = c2688aH1.isEnableAppStartProfiling();
        this.o = c2688aH1.isStartProfilerOnAppStart();
    }
}

package defpackage;

import com.appsflyer.sdk_base.BuildConfig;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import io.sentry.util.x;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class CI1 implements BH0 {

    @NotNull
    public final Date d;

    @Nullable
    public Date e;

    @NotNull
    public final AtomicInteger g;

    @Nullable
    public final String h;

    @Nullable
    public final String i;

    @Nullable
    public Boolean j;

    @NotNull
    public b k;

    @Nullable
    public Long l;

    @Nullable
    public Double m;

    @Nullable
    public final String n;

    @Nullable
    public String o;

    @Nullable
    public final String p;

    @NotNull
    public final String q;

    @Nullable
    public String r;

    @NotNull
    public final C4527a s = new C4527a();

    @Nullable
    public ConcurrentHashMap t;

    public static final class a implements KG0<CI1> {
        public static IllegalStateException b(String str, ILogger iLogger) {
            String strD = C1039Gc0.d("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strD);
            iLogger.d(NG1.ERROR, strD, illegalStateException);
            return illegalStateException;
        }

        @Override // defpackage.KG0
        @NotNull
        public final CI1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            Integer numK = null;
            ConcurrentHashMap concurrentHashMap = null;
            b bVarValueOf = null;
            Date dateD0 = null;
            Date dateD1 = null;
            String strE0 = null;
            String str = null;
            Boolean boolH0 = null;
            Long lR = null;
            Double dU0 = null;
            String strE1 = null;
            String strE2 = null;
            String strE3 = null;
            String strE4 = null;
            String strE5 = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "duration":
                        dU0 = q71.u0();
                        break;
                    case "started":
                        dateD0 = q71.D0(iLogger);
                        break;
                    case "errors":
                        numK = q71.K();
                        break;
                    case "status":
                        String strB = x.b(q71.e0());
                        if (strB == null) {
                            break;
                        } else {
                            bVarValueOf = b.valueOf(strB);
                            break;
                        }
                        break;
                    case "did":
                        strE0 = q71.e0();
                        break;
                    case "seq":
                        lR = q71.R();
                        break;
                    case "sid":
                        String strE6 = q71.e0();
                        if (strE6 != null && (strE6.length() == 36 || strE6.length() == 32)) {
                            str = strE6;
                            break;
                        } else {
                            iLogger.a(NG1.ERROR, "%s sid is not valid.", strE6);
                            break;
                        }
                        break;
                    case "init":
                        boolH0 = q71.H0();
                        break;
                    case "timestamp":
                        dateD1 = q71.D0(iLogger);
                        break;
                    case "attrs":
                        q71.X0();
                        while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strX1 = q71.x0();
                            strX1.getClass();
                            switch (strX1) {
                                case "environment":
                                    strE3 = q71.e0();
                                    break;
                                case "release":
                                    strE4 = q71.e0();
                                    break;
                                case "ip_address":
                                    strE1 = q71.e0();
                                    break;
                                case "user_agent":
                                    strE2 = q71.e0();
                                    break;
                                default:
                                    q71.I();
                                    break;
                            }
                        }
                        q71.B0();
                        break;
                    case "abnormal_mechanism":
                        strE5 = q71.e0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            if (bVarValueOf == null) {
                throw b("status", iLogger);
            }
            if (dateD0 == null) {
                throw b("started", iLogger);
            }
            if (numK == null) {
                throw b("errors", iLogger);
            }
            if (strE4 == null) {
                throw b(BuildConfig.BUILD_TYPE, iLogger);
            }
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            CI1 ci1 = new CI1(bVarValueOf, dateD0, dateD1, numK.intValue(), strE0, str, boolH0, lR, dU0, strE1, strE2, strE3, strE4, strE5);
            ci1.t = concurrentHashMap2;
            q71.B0();
            return ci1;
        }
    }

    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public CI1(@NotNull b bVar, @NotNull Date date, @Nullable Date date2, int i, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Long l, @Nullable Double d, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull String str6, @Nullable String str7) {
        this.k = bVar;
        this.d = date;
        this.e = date2;
        this.g = new AtomicInteger(i);
        this.h = str;
        this.i = str2;
        this.j = bool;
        this.l = l;
        this.m = d;
        this.n = str3;
        this.o = str4;
        this.p = str5;
        this.q = str6;
        this.r = str7;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CI1 clone() {
        return new CI1(this.k, this.d, this.e, this.g.get(), this.h, this.i, this.j, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final void b(@Nullable Date date) {
        C4527a.C0404a c0404aA = this.s.a();
        try {
            this.j = null;
            if (this.k == b.Ok) {
                this.k = b.Exited;
            }
            if (date != null) {
                this.e = date;
            } else {
                this.e = N7.h();
            }
            Date date2 = this.e;
            if (date2 != null) {
                this.m = Double.valueOf(Math.abs(date2.getTime() - this.d.getTime()) / 1000.0d);
                long time = this.e.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.l = Long.valueOf(time);
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

    @Nullable
    public final Date c() {
        Date date = this.d;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public final boolean d(@Nullable b bVar, @Nullable String str, boolean z, @Nullable String str2) {
        boolean z2;
        C4527a.C0404a c0404aA = this.s.a();
        boolean z3 = true;
        if (bVar != null) {
            try {
                this.k = bVar;
                z2 = true;
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            z2 = false;
        }
        if (str != null) {
            this.o = str;
            z2 = true;
        }
        if (z) {
            this.g.addAndGet(1);
            z2 = true;
        }
        if (str2 != null) {
            this.r = str2;
        } else {
            z3 = z2;
        }
        if (z3) {
            this.j = null;
            Date dateH = N7.h();
            this.e = dateH;
            if (dateH != null) {
                long time = dateH.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.l = Long.valueOf(time);
            }
        }
        c0404aA.close();
        return z3;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        String str = this.i;
        if (str != null) {
            c6319rH0.c("sid");
            c6319rH0.j(str);
        }
        String str2 = this.h;
        if (str2 != null) {
            c6319rH0.c("did");
            c6319rH0.j(str2);
        }
        if (this.j != null) {
            c6319rH0.c("init");
            c6319rH0.h(this.j);
        }
        c6319rH0.c("started");
        c6319rH0.g(iLogger, this.d);
        c6319rH0.c("status");
        c6319rH0.g(iLogger, this.k.name().toLowerCase(Locale.ROOT));
        if (this.l != null) {
            c6319rH0.c("seq");
            c6319rH0.i(this.l);
        }
        c6319rH0.c("errors");
        c6319rH0.f(this.g.intValue());
        if (this.m != null) {
            c6319rH0.c("duration");
            c6319rH0.i(this.m);
        }
        if (this.e != null) {
            c6319rH0.c("timestamp");
            c6319rH0.g(iLogger, this.e);
        }
        if (this.r != null) {
            c6319rH0.c("abnormal_mechanism");
            c6319rH0.g(iLogger, this.r);
        }
        c6319rH0.c("attrs");
        c6319rH0.a();
        c6319rH0.c(BuildConfig.BUILD_TYPE);
        c6319rH0.g(iLogger, this.q);
        String str3 = this.p;
        if (str3 != null) {
            c6319rH0.c("environment");
            c6319rH0.g(iLogger, str3);
        }
        String str4 = this.n;
        if (str4 != null) {
            c6319rH0.c("ip_address");
            c6319rH0.g(iLogger, str4);
        }
        if (this.o != null) {
            c6319rH0.c("user_agent");
            c6319rH0.g(iLogger, this.o);
        }
        c6319rH0.b();
        ConcurrentHashMap concurrentHashMap = this.t;
        if (concurrentHashMap != null) {
            for (String str5 : concurrentHashMap.keySet()) {
                C4564j.h(this.t, str5, c6319rH0, str5, iLogger);
            }
        }
        c6319rH0.b();
    }
}

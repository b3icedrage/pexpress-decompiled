package defpackage;

import com.appsflyer.sdk_base.BuildConfig;
import com.google.android.gms.common.Scopes;
import io.sentry.ILogger;
import io.sentry.protocol.C4522d;
import io.sentry.protocol.r;
import io.sentry.protocol.u;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Lh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1445Lh1 implements BH0 {

    @Nullable
    public C4522d d;

    @NotNull
    public u e;

    @NotNull
    public u g;

    @Nullable
    public r h;

    @NotNull
    public final AbstractMap i;

    @NotNull
    public String j;

    @NotNull
    public String k;

    @Nullable
    public String l;

    @NotNull
    public String m;
    public double n;

    @Nullable
    public final File o;

    @Nullable
    public String p;

    @Nullable
    public io.sentry.protocol.profiling.a q;

    @Nullable
    public ConcurrentHashMap r;

    /* JADX INFO: renamed from: Lh1$a */
    public static final class a {

        @NotNull
        public final u a;

        @NotNull
        public final u b;

        @NotNull
        public final ConcurrentHashMap c;

        @NotNull
        public final File d;
        public final double e;

        @NotNull
        public final String f = "android";

        public a(@NotNull u uVar, @NotNull u uVar2, @NotNull HashMap map, @NotNull File file, @NotNull AbstractC3118cG1 abstractC3118cG1) {
            this.a = uVar;
            this.b = uVar2;
            this.c = new ConcurrentHashMap(map);
            this.d = file;
            this.e = abstractC3118cG1.i() / 1.0E9d;
        }
    }

    /* JADX INFO: renamed from: Lh1$b */
    public static final class b implements KG0<C1445Lh1> {
        @Override // defpackage.KG0
        @NotNull
        public final C1445Lh1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            C1445Lh1 c1445Lh1 = new C1445Lh1();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "debug_meta":
                        C4522d c4522d = (C4522d) q71.H(iLogger, new C4522d.a());
                        if (c4522d == null) {
                            break;
                        } else {
                            c1445Lh1.d = c4522d;
                            break;
                        }
                        break;
                    case "measurements":
                        HashMap mapD1 = q71.d1(iLogger, new io.sentry.profilemeasurements.a.C0398a());
                        if (mapD1 == null) {
                            break;
                        } else {
                            c1445Lh1.i.putAll(mapD1);
                            break;
                        }
                        break;
                    case "profile":
                        io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) q71.H(iLogger, new io.sentry.protocol.profiling.a.C0400a());
                        if (aVar == null) {
                            break;
                        } else {
                            c1445Lh1.q = aVar;
                            break;
                        }
                        break;
                    case "environment":
                        String strE0 = q71.e0();
                        if (strE0 == null) {
                            break;
                        } else {
                            c1445Lh1.l = strE0;
                            break;
                        }
                        break;
                    case "timestamp":
                        Double dU0 = q71.u0();
                        if (dU0 == null) {
                            break;
                        } else {
                            c1445Lh1.n = dU0.doubleValue();
                            break;
                        }
                        break;
                    case "profiler_id":
                        u uVar = (u) q71.H(iLogger, new u.a());
                        if (uVar == null) {
                            break;
                        } else {
                            c1445Lh1.e = uVar;
                            break;
                        }
                        break;
                    case "version":
                        String strE1 = q71.e0();
                        if (strE1 == null) {
                            break;
                        } else {
                            c1445Lh1.m = strE1;
                            break;
                        }
                        break;
                    case "release":
                        String strE2 = q71.e0();
                        if (strE2 == null) {
                            break;
                        } else {
                            c1445Lh1.k = strE2;
                            break;
                        }
                        break;
                    case "client_sdk":
                        r rVar = (r) q71.H(iLogger, new r.a());
                        if (rVar == null) {
                            break;
                        } else {
                            c1445Lh1.h = rVar;
                            break;
                        }
                        break;
                    case "platform":
                        String strE3 = q71.e0();
                        if (strE3 == null) {
                            break;
                        } else {
                            c1445Lh1.j = strE3;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        String strE4 = q71.e0();
                        if (strE4 == null) {
                            break;
                        } else {
                            c1445Lh1.p = strE4;
                            break;
                        }
                        break;
                    case "chunk_id":
                        u uVar2 = (u) q71.H(iLogger, new u.a());
                        if (uVar2 == null) {
                            break;
                        } else {
                            c1445Lh1.g = uVar2;
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
            c1445Lh1.r = concurrentHashMap;
            q71.B0();
            return c1445Lh1;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1445Lh1() {
        u uVar = u.e;
        this(uVar, uVar, null, new HashMap(), Double.valueOf(0.0d), "android", C2688aH1.empty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1445Lh1)) {
            return false;
        }
        C1445Lh1 c1445Lh1 = (C1445Lh1) obj;
        return Objects.equals(this.d, c1445Lh1.d) && Objects.equals(this.e, c1445Lh1.e) && Objects.equals(this.g, c1445Lh1.g) && Objects.equals(this.h, c1445Lh1.h) && Objects.equals(this.i, c1445Lh1.i) && Objects.equals(this.j, c1445Lh1.j) && Objects.equals(this.k, c1445Lh1.k) && Objects.equals(this.l, c1445Lh1.l) && Objects.equals(this.m, c1445Lh1.m) && Objects.equals(this.p, c1445Lh1.p) && Objects.equals(this.r, c1445Lh1.r) && Objects.equals(this.q, c1445Lh1.q);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.p, this.q, this.r);
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("debug_meta");
            c6319rH0.g(iLogger, this.d);
        }
        c6319rH0.c("profiler_id");
        c6319rH0.g(iLogger, this.e);
        c6319rH0.c("chunk_id");
        c6319rH0.g(iLogger, this.g);
        if (this.h != null) {
            c6319rH0.c("client_sdk");
            c6319rH0.g(iLogger, this.h);
        }
        AbstractMap abstractMap = this.i;
        if (!abstractMap.isEmpty()) {
            String str = c6319rH0.a.h;
            c6319rH0.d("");
            c6319rH0.c("measurements");
            c6319rH0.g(iLogger, abstractMap);
            c6319rH0.d(str);
        }
        c6319rH0.c("platform");
        c6319rH0.g(iLogger, this.j);
        c6319rH0.c(BuildConfig.BUILD_TYPE);
        c6319rH0.g(iLogger, this.k);
        if (this.l != null) {
            c6319rH0.c("environment");
            c6319rH0.g(iLogger, this.l);
        }
        c6319rH0.c("version");
        c6319rH0.g(iLogger, this.m);
        if (this.p != null) {
            c6319rH0.c("sampled_profile");
            c6319rH0.g(iLogger, this.p);
        }
        c6319rH0.c("timestamp");
        c6319rH0.g(iLogger, BigDecimal.valueOf(this.n).setScale(6, RoundingMode.DOWN));
        if (this.q != null) {
            c6319rH0.c(Scopes.PROFILE);
            c6319rH0.g(iLogger, this.q);
        }
        ConcurrentHashMap concurrentHashMap = this.r;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                C4564j.h(this.r, str2, c6319rH0, str2, iLogger);
            }
        }
        c6319rH0.b();
    }

    public C1445Lh1(@NotNull u uVar, @NotNull u uVar2, @Nullable File file, @NotNull AbstractMap abstractMap, @NotNull Double d, @NotNull String str, @NotNull C2688aH1 c2688aH1) {
        this.p = null;
        this.e = uVar;
        this.g = uVar2;
        this.o = file;
        this.i = abstractMap;
        this.d = null;
        this.h = c2688aH1.getSdkVersion();
        this.k = c2688aH1.getRelease() != null ? c2688aH1.getRelease() : "";
        this.l = c2688aH1.getEnvironment();
        this.j = str;
        this.m = "2";
        this.n = d.doubleValue();
    }
}

package defpackage;

import com.appsflyer.sdk_base.BuildConfig;
import io.sentry.ILogger;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.C4522d;
import io.sentry.protocol.F;
import io.sentry.protocol.o;
import io.sentry.protocol.r;
import io.sentry.protocol.u;
import io.sentry.util.C4529c;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VF1 {

    @Nullable
    public u d;

    @NotNull
    public final C4521c e;

    @Nullable
    public r g;

    @Nullable
    public o h;

    @Nullable
    public AbstractMap i;

    @Nullable
    public String j;

    @Nullable
    public String k;

    @Nullable
    public String l;

    @Nullable
    public F m;

    @Nullable
    public transient Throwable n;

    @Nullable
    public String o;

    @Nullable
    public String p;

    @Nullable
    public List<C0702Bu> q;

    @Nullable
    public C4522d r;

    @Nullable
    public AbstractMap s;

    public static final class a {
        public static boolean a(@NotNull VF1 vf1, @NotNull String str, @NotNull Q71 q71, @NotNull ILogger iLogger) {
            switch (str) {
                case "debug_meta":
                    vf1.r = (C4522d) q71.H(iLogger, new C4522d.a());
                    return true;
                case "server_name":
                    vf1.o = q71.e0();
                    return true;
                case "contexts":
                    vf1.e.m(C4521c.a.b(q71, iLogger));
                    return true;
                case "environment":
                    vf1.k = q71.e0();
                    return true;
                case "breadcrumbs":
                    vf1.q = q71.q0(iLogger, new C0702Bu.a());
                    return true;
                case "sdk":
                    vf1.g = (r) q71.H(iLogger, new r.a());
                    return true;
                case "dist":
                    vf1.p = q71.e0();
                    return true;
                case "tags":
                    vf1.i = C4529c.a((Map) q71.W0());
                    return true;
                case "user":
                    vf1.m = (F) q71.H(iLogger, new F.a());
                    return true;
                case "extra":
                    vf1.s = C4529c.a((Map) q71.W0());
                    return true;
                case "event_id":
                    vf1.d = (u) q71.H(iLogger, new u.a());
                    return true;
                case "release":
                    vf1.j = q71.e0();
                    return true;
                case "request":
                    vf1.h = (o) q71.H(iLogger, new o.a());
                    return true;
                case "platform":
                    vf1.l = q71.e0();
                    return true;
                default:
                    return false;
            }
        }
    }

    public static final class b {
        public static void a(@NotNull VF1 vf1, @NotNull C6319rH0 c6319rH0, @NotNull ILogger iLogger) {
            if (vf1.d != null) {
                c6319rH0.c("event_id");
                c6319rH0.g(iLogger, vf1.d);
            }
            c6319rH0.c("contexts");
            c6319rH0.g(iLogger, vf1.e);
            if (vf1.g != null) {
                c6319rH0.c("sdk");
                c6319rH0.g(iLogger, vf1.g);
            }
            if (vf1.h != null) {
                c6319rH0.c("request");
                c6319rH0.g(iLogger, vf1.h);
            }
            AbstractMap abstractMap = vf1.i;
            if (abstractMap != null && !abstractMap.isEmpty()) {
                c6319rH0.c("tags");
                c6319rH0.g(iLogger, vf1.i);
            }
            if (vf1.j != null) {
                c6319rH0.c(BuildConfig.BUILD_TYPE);
                c6319rH0.j(vf1.j);
            }
            if (vf1.k != null) {
                c6319rH0.c("environment");
                c6319rH0.j(vf1.k);
            }
            if (vf1.l != null) {
                c6319rH0.c("platform");
                c6319rH0.j(vf1.l);
            }
            if (vf1.m != null) {
                c6319rH0.c("user");
                c6319rH0.g(iLogger, vf1.m);
            }
            if (vf1.o != null) {
                c6319rH0.c("server_name");
                c6319rH0.j(vf1.o);
            }
            if (vf1.p != null) {
                c6319rH0.c("dist");
                c6319rH0.j(vf1.p);
            }
            List<C0702Bu> list = vf1.q;
            if (list != null && !list.isEmpty()) {
                c6319rH0.c("breadcrumbs");
                c6319rH0.g(iLogger, vf1.q);
            }
            if (vf1.r != null) {
                c6319rH0.c("debug_meta");
                c6319rH0.g(iLogger, vf1.r);
            }
            AbstractMap abstractMap2 = vf1.s;
            if (abstractMap2 == null || abstractMap2.isEmpty()) {
                return;
            }
            c6319rH0.c("extra");
            c6319rH0.g(iLogger, vf1.s);
        }
    }

    public VF1(@NotNull u uVar) {
        this.e = new C4521c();
        this.d = uVar;
    }

    @Nullable
    public final Throwable a() {
        Throwable th = this.n;
        return th instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th).e : th;
    }

    public final void b(@Nullable String str, @Nullable String str2) {
        if (this.i == null) {
            this.i = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 != null) {
            this.i.put(str, str2);
            return;
        }
        AbstractMap abstractMap = this.i;
        if (abstractMap != null) {
            abstractMap.remove(str);
        }
    }

    public VF1() {
        this(new u());
    }
}

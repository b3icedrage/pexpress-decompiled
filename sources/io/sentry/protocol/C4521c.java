package io.sentry.protocol;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C1522Mh1;
import defpackage.C3561eO1;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import io.sentry.util.C4529c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.protocol.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4521c implements BH0 {

    @NotNull
    public final ConcurrentHashMap<String, Object> d = new ConcurrentHashMap<>();

    @NotNull
    public final C4527a e = new C4527a();

    /* JADX INFO: renamed from: io.sentry.protocol.c$a */
    public static final class a implements KG0<C4521c> {
        @NotNull
        public static C4521c b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            C4521c c4521c = new C4521c();
            q71.X0();
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "device":
                        c4521c.q(C4523e.a.b(q71, iLogger));
                        break;
                    case "spring":
                        q71.X0();
                        C c = new C();
                        ConcurrentHashMap concurrentHashMap = null;
                        while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strX1 = q71.x0();
                            strX1.getClass();
                            if (strX1.equals("active_profiles")) {
                                List list = (List) q71.W0();
                                if (list != null) {
                                    String[] strArr = new String[list.size()];
                                    list.toArray(strArr);
                                    c.d = strArr;
                                }
                            } else {
                                if (concurrentHashMap == null) {
                                    concurrentHashMap = new ConcurrentHashMap();
                                }
                                q71.Q(iLogger, concurrentHashMap, strX1);
                            }
                        }
                        c.e = concurrentHashMap;
                        q71.B0();
                        c4521c.w(c);
                        break;
                    case "response":
                        q71.X0();
                        p pVar = new p();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strX2 = q71.x0();
                            strX2.getClass();
                            switch (strX2) {
                                case "status_code":
                                    pVar.g = q71.K();
                                    break;
                                case "data":
                                    pVar.i = q71.W0();
                                    break;
                                case "headers":
                                    Map map = (Map) q71.W0();
                                    if (map == null) {
                                        break;
                                    } else {
                                        pVar.e = C4529c.a(map);
                                        break;
                                    }
                                    break;
                                case "cookies":
                                    pVar.d = q71.e0();
                                    break;
                                case "body_size":
                                    pVar.h = q71.R();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    q71.Q(iLogger, concurrentHashMap2, strX2);
                                    break;
                            }
                        }
                        pVar.j = concurrentHashMap2;
                        q71.B0();
                        c4521c.u(pVar);
                        break;
                    case "profile":
                        q71.X0();
                        C1522Mh1 c1522Mh1 = new C1522Mh1();
                        ConcurrentHashMap concurrentHashMap3 = null;
                        while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strX3 = q71.x0();
                            strX3.getClass();
                            if (strX3.equals("profiler_id")) {
                                u uVar = (u) q71.H(iLogger, new u.a());
                                if (uVar != null) {
                                    c1522Mh1.d = uVar;
                                }
                            } else {
                                if (concurrentHashMap3 == null) {
                                    concurrentHashMap3 = new ConcurrentHashMap();
                                }
                                q71.Q(iLogger, concurrentHashMap3, strX3);
                            }
                        }
                        c1522Mh1.e = concurrentHashMap3;
                        q71.B0();
                        c4521c.l(Scopes.PROFILE, c1522Mh1);
                        break;
                    case "feedback":
                        c4521c.l("feedback", C4526h.a.b(q71, iLogger));
                        break;
                    case "os":
                        c4521c.t(n.a.b(q71, iLogger));
                        break;
                    case "app":
                        c4521c.o(C4519a.C0399a.b(q71, iLogger));
                        break;
                    case "gpu":
                        c4521c.s(j.a.b(q71, iLogger));
                        break;
                    case "flags":
                        q71.X0();
                        ArrayList arrayList = null;
                        ConcurrentHashMap concurrentHashMap4 = null;
                        while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strX4 = q71.x0();
                            strX4.getClass();
                            if (strX4.equals("values")) {
                                arrayList = q71.q0(iLogger, new C4524f.a());
                            } else {
                                if (concurrentHashMap4 == null) {
                                    concurrentHashMap4 = new ConcurrentHashMap();
                                }
                                q71.Q(iLogger, concurrentHashMap4, strX4);
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        C4525g c4525g = new C4525g(arrayList);
                        c4525g.e = concurrentHashMap4;
                        q71.B0();
                        c4521c.r(c4525g);
                        break;
                    case "trace":
                        c4521c.x(C3561eO1.a.b(q71, iLogger));
                        break;
                    case "browser":
                        q71.X0();
                        C4520b c4520b = new C4520b();
                        ConcurrentHashMap concurrentHashMap5 = null;
                        while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strX5 = q71.x0();
                            strX5.getClass();
                            if (strX5.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                                c4520b.d = q71.e0();
                            } else if (strX5.equals("version")) {
                                c4520b.e = q71.e0();
                            } else {
                                if (concurrentHashMap5 == null) {
                                    concurrentHashMap5 = new ConcurrentHashMap();
                                }
                                q71.Q(iLogger, concurrentHashMap5, strX5);
                            }
                        }
                        c4520b.g = concurrentHashMap5;
                        q71.B0();
                        c4521c.p(c4520b);
                        break;
                    case "runtime":
                        q71.X0();
                        w wVar = new w();
                        ConcurrentHashMap concurrentHashMap6 = null;
                        while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strX6 = q71.x0();
                            strX6.getClass();
                            switch (strX6) {
                                case "raw_description":
                                    wVar.g = q71.e0();
                                    break;
                                case "name":
                                    wVar.d = q71.e0();
                                    break;
                                case "version":
                                    wVar.e = q71.e0();
                                    break;
                                default:
                                    if (concurrentHashMap6 == null) {
                                        concurrentHashMap6 = new ConcurrentHashMap();
                                    }
                                    q71.Q(iLogger, concurrentHashMap6, strX6);
                                    break;
                            }
                        }
                        wVar.h = concurrentHashMap6;
                        q71.B0();
                        c4521c.v(wVar);
                        break;
                    default:
                        Object objW0 = q71.W0();
                        if (objW0 == null) {
                            break;
                        } else {
                            c4521c.l(strX0, objW0);
                            break;
                        }
                        break;
                }
            }
            q71.B0();
            return c4521c;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ C4521c a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    public C4521c() {
    }

    public boolean a(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        return this.d.containsKey(obj);
    }

    @NotNull
    public Set<Map.Entry<String, Object>> b() {
        return this.d.entrySet();
    }

    @Nullable
    public Object c(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.d.get(str);
    }

    @Nullable
    public C4519a d() {
        return (C4519a) y(C4519a.class, Payload.TYPE_APP);
    }

    @Nullable
    public C4523e e() {
        return (C4523e) y(C4523e.class, "device");
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof C4521c)) {
            return false;
        }
        return this.d.equals(((C4521c) obj).d);
    }

    @Nullable
    public C4525g f() {
        return (C4525g) y(C4525g.class, "flags");
    }

    @Nullable
    public n g() {
        return (n) y(n.class, "os");
    }

    @Nullable
    public p h() {
        return (p) y(p.class, Payload.RESPONSE);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Nullable
    public w i() {
        return (w) y(w.class, "runtime");
    }

    @Nullable
    public C3561eO1 j() {
        return (C3561eO1) y(C3561eO1.class, "trace");
    }

    @NotNull
    public Enumeration<String> k() {
        return this.d.keys();
    }

    @Nullable
    public Object l(@Nullable String str, @Nullable Object obj) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = this.d;
        return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
    }

    public void m(@Nullable C4521c c4521c) {
        if (c4521c == null) {
            return;
        }
        this.d.putAll(c4521c.d);
    }

    @Nullable
    public Object n(@Nullable String str) {
        return this.d.remove(str);
    }

    public void o(@NotNull C4519a c4519a) {
        l(Payload.TYPE_APP, c4519a);
    }

    public void p(@NotNull C4520b c4520b) {
        l("browser", c4520b);
    }

    public void q(@NotNull C4523e c4523e) {
        l("device", c4523e);
    }

    public void r(@NotNull C4525g c4525g) {
        l("flags", c4525g);
    }

    public void s(@NotNull j jVar) {
        l("gpu", jVar);
    }

    @Override // defpackage.BH0
    public void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        ArrayList<String> list = Collections.list(k());
        Collections.sort(list);
        for (String str : list) {
            Object objC = c(str);
            if (objC != null) {
                c6319rH0.c(str);
                c6319rH0.g(iLogger, objC);
            }
        }
        c6319rH0.b();
    }

    public void t(@NotNull n nVar) {
        l("os", nVar);
    }

    public void u(@NotNull p pVar) {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            l(Payload.RESPONSE, pVar);
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

    public void v(@NotNull w wVar) {
        l("runtime", wVar);
    }

    public void w(@NotNull C c) {
        l("spring", c);
    }

    public void x(@NotNull C3561eO1 c3561eO1) {
        io.sentry.util.p.b(c3561eO1, "traceContext is required");
        l("trace", c3561eO1);
    }

    @Nullable
    public final Object y(@NotNull Class cls, @NotNull String str) {
        Object objC = c(str);
        if (cls.isInstance(objC)) {
            return cls.cast(objC);
        }
        return null;
    }

    public C4521c(@NotNull C4521c c4521c) {
        for (Map.Entry<String, Object> entry : c4521c.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if (Payload.TYPE_APP.equals(entry.getKey()) && (value instanceof C4519a)) {
                    C4519a c4519a = (C4519a) value;
                    C4519a c4519a2 = new C4519a();
                    c4519a2.k = c4519a.k;
                    c4519a2.d = c4519a.d;
                    c4519a2.i = c4519a.i;
                    c4519a2.e = c4519a.e;
                    c4519a2.j = c4519a.j;
                    c4519a2.h = c4519a.h;
                    c4519a2.g = c4519a.g;
                    c4519a2.l = C4529c.a(c4519a.l);
                    c4519a2.o = c4519a.o;
                    List<String> list = c4519a.m;
                    c4519a2.m = list != null ? new ArrayList(list) : null;
                    c4519a2.n = c4519a.n;
                    c4519a2.p = c4519a.p;
                    c4519a2.q = c4519a.q;
                    c4519a2.r = C4529c.a(c4519a.r);
                    o(c4519a2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof C4520b)) {
                    C4520b c4520b = (C4520b) value;
                    C4520b c4520b2 = new C4520b();
                    c4520b2.d = c4520b.d;
                    c4520b2.e = c4520b.e;
                    c4520b2.g = C4529c.a(c4520b.g);
                    p(c4520b2);
                } else if ("device".equals(entry.getKey()) && (value instanceof C4523e)) {
                    C4523e c4523e = (C4523e) value;
                    C4523e c4523e2 = new C4523e();
                    c4523e2.d = c4523e.d;
                    c4523e2.e = c4523e.e;
                    c4523e2.g = c4523e.g;
                    c4523e2.h = c4523e.h;
                    c4523e2.i = c4523e.i;
                    c4523e2.j = c4523e.j;
                    c4523e2.m = c4523e.m;
                    c4523e2.n = c4523e.n;
                    c4523e2.o = c4523e.o;
                    c4523e2.p = c4523e.p;
                    c4523e2.q = c4523e.q;
                    c4523e2.r = c4523e.r;
                    c4523e2.s = c4523e.s;
                    c4523e2.t = c4523e.t;
                    c4523e2.u = c4523e.u;
                    c4523e2.v = c4523e.v;
                    c4523e2.w = c4523e.w;
                    c4523e2.x = c4523e.x;
                    c4523e2.y = c4523e.y;
                    c4523e2.z = c4523e.z;
                    c4523e2.A = c4523e.A;
                    c4523e2.B = c4523e.B;
                    c4523e2.C = c4523e.C;
                    c4523e2.E = c4523e.E;
                    c4523e2.G = c4523e.G;
                    c4523e2.H = c4523e.H;
                    c4523e2.l = c4523e.l;
                    String[] strArr = c4523e.k;
                    c4523e2.k = strArr != null ? (String[]) strArr.clone() : null;
                    c4523e2.F = c4523e.F;
                    TimeZone timeZone = c4523e.D;
                    c4523e2.D = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    c4523e2.I = c4523e.I;
                    c4523e2.J = c4523e.J;
                    c4523e2.K = c4523e.K;
                    c4523e2.L = c4523e.L;
                    c4523e2.M = C4529c.a(c4523e.M);
                    q(c4523e2);
                } else if ("os".equals(entry.getKey()) && (value instanceof n)) {
                    n nVar = (n) value;
                    n nVar2 = new n();
                    nVar2.d = nVar.d;
                    nVar2.e = nVar.e;
                    nVar2.g = nVar.g;
                    nVar2.h = nVar.h;
                    nVar2.i = nVar.i;
                    nVar2.j = nVar.j;
                    nVar2.k = C4529c.a(nVar.k);
                    t(nVar2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof w)) {
                    w wVar = (w) value;
                    w wVar2 = new w();
                    wVar2.d = wVar.d;
                    wVar2.e = wVar.e;
                    wVar2.g = wVar.g;
                    wVar2.h = C4529c.a(wVar.h);
                    v(wVar2);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof C4526h)) {
                    C4526h c4526h = (C4526h) value;
                    C4526h c4526h2 = new C4526h();
                    c4526h2.d = c4526h.d;
                    c4526h2.e = c4526h.e;
                    c4526h2.g = c4526h.g;
                    c4526h2.h = c4526h.h;
                    c4526h2.i = c4526h.i;
                    c4526h2.j = c4526h.j;
                    c4526h2.k = C4529c.a(c4526h.k);
                    l("feedback", c4526h2);
                } else if ("gpu".equals(entry.getKey()) && (value instanceof j)) {
                    j jVar = (j) value;
                    j jVar2 = new j();
                    jVar2.d = jVar.d;
                    jVar2.e = jVar.e;
                    jVar2.g = jVar.g;
                    jVar2.h = jVar.h;
                    jVar2.i = jVar.i;
                    jVar2.j = jVar.j;
                    jVar2.k = jVar.k;
                    jVar2.l = jVar.l;
                    jVar2.m = jVar.m;
                    jVar2.n = C4529c.a(jVar.n);
                    s(jVar2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof C3561eO1)) {
                    x(new C3561eO1((C3561eO1) value));
                } else if (Scopes.PROFILE.equals(entry.getKey()) && (value instanceof C1522Mh1)) {
                    C1522Mh1 c1522Mh1 = (C1522Mh1) value;
                    C1522Mh1 c1522Mh2 = new C1522Mh1();
                    c1522Mh2.d = c1522Mh1.d;
                    ConcurrentHashMap concurrentHashMapA = C4529c.a(c1522Mh1.e);
                    if (concurrentHashMapA != null) {
                        c1522Mh2.e = concurrentHashMapA;
                    }
                    l(Scopes.PROFILE, c1522Mh2);
                } else if (Payload.RESPONSE.equals(entry.getKey()) && (value instanceof p)) {
                    p pVar = (p) value;
                    p pVar2 = new p();
                    pVar2.d = pVar.d;
                    pVar2.e = C4529c.a(pVar.e);
                    pVar2.j = C4529c.a(pVar.j);
                    pVar2.g = pVar.g;
                    pVar2.h = pVar.h;
                    pVar2.i = pVar.i;
                    u(pVar2);
                } else if ("spring".equals(entry.getKey()) && (value instanceof C)) {
                    C c = (C) value;
                    C c2 = new C();
                    c2.d = c.d;
                    c2.e = C4529c.a(c.e);
                    w(c2);
                } else {
                    l(entry.getKey(), value);
                }
            }
        }
    }
}

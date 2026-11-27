package defpackage;

import io.sentry.ILogger;
import io.sentry.featureflags.d;
import io.sentry.protocol.u;
import io.sentry.util.C4529c;
import io.sentry.util.p;
import io.sentry.util.x;
import io.sentry.vendor.gson.stream.b;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3561eO1 implements BH0 {

    @NotNull
    public final u d;

    @NotNull
    public final C4401iO1 e;

    @Nullable
    public final C4401iO1 g;

    @Nullable
    public transient L02 h;

    @NotNull
    public final String i;

    @Nullable
    public String j;

    @Nullable
    public EnumC4869kO1 k;

    @NotNull
    public ConcurrentHashMap l;

    @Nullable
    public String m;

    @NotNull
    public Map<String, Object> n;

    @Nullable
    public ConcurrentHashMap o;

    @NotNull
    public EnumC6511sB0 p;

    @Nullable
    public C2171Up q;

    @NotNull
    public final d r;

    @NotNull
    public final u s;

    /* JADX INFO: renamed from: eO1$a */
    public static final class a implements KG0<C3561eO1> {
        @NotNull
        public static C3561eO1 b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            u uVar = null;
            C4401iO1 c4401iO1 = null;
            String strB = null;
            ConcurrentHashMap concurrentHashMap = null;
            C4401iO1 c4401iO2 = null;
            String strB2 = null;
            EnumC4869kO1 enumC4869kO1 = null;
            String strB3 = null;
            ConcurrentHashMap concurrentHashMapA = null;
            Map<String, Object> map = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "span_id":
                        c4401iO1 = new C4401iO1(q71.B());
                        break;
                    case "parent_span_id":
                        c4401iO2 = (C4401iO1) q71.H(iLogger, new C4401iO1.a());
                        break;
                    case "description":
                        strB2 = q71.B();
                        break;
                    case "origin":
                        strB3 = q71.B();
                        break;
                    case "status":
                        enumC4869kO1 = (EnumC4869kO1) q71.H(iLogger, new EnumC4869kO1.a());
                        break;
                    case "op":
                        strB = q71.B();
                        break;
                    case "data":
                        map = (Map) q71.W0();
                        break;
                    case "tags":
                        concurrentHashMapA = C4529c.a((Map) q71.W0());
                        break;
                    case "trace_id":
                        uVar = new u(q71.B());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            if (uVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.d(NG1.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (c4401iO1 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                iLogger.d(NG1.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strB == null) {
                strB = "";
            }
            C3561eO1 c3561eO1 = new C3561eO1(uVar, c4401iO1, strB, c4401iO2);
            c3561eO1.j = strB2;
            c3561eO1.k = enumC4869kO1;
            c3561eO1.m = strB3;
            if (concurrentHashMapA != null) {
                c3561eO1.l = concurrentHashMapA;
            }
            if (map != null) {
                c3561eO1.n = map;
            }
            c3561eO1.o = concurrentHashMap;
            q71.B0();
            return c3561eO1;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ C3561eO1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    public C3561eO1(@NotNull u uVar, @NotNull C4401iO1 c4401iO1, @NotNull String str, @Nullable C4401iO1 c4401iO2) {
        this(uVar, c4401iO1, c4401iO2, str, null, null, null, "manual");
    }

    public final void a(@Nullable L02 l02) {
        this.h = l02;
        C2171Up c2171Up = this.q;
        if (c2171Up == null || l02 == null) {
            return;
        }
        Charset charset = x.a;
        Boolean bool = l02.a;
        c2171Up.d("sentry-sampled", bool == null ? null : bool.toString());
        Double d = l02.c;
        if (d != null && c2171Up.f) {
            c2171Up.d = d;
        }
        Double d2 = l02.b;
        if (d2 != null) {
            c2171Up.c = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3561eO1)) {
            return false;
        }
        C3561eO1 c3561eO1 = (C3561eO1) obj;
        return this.d.equals(c3561eO1.d) && this.e.equals(c3561eO1.e) && p.a(this.g, c3561eO1.g) && this.i.equals(c3561eO1.i) && p.a(this.j, c3561eO1.j) && this.k == c3561eO1.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.g, this.i, this.j, this.k});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("trace_id");
        this.d.serialize(c6319rH0, iLogger);
        c6319rH0.c("span_id");
        this.e.serialize(c6319rH0, iLogger);
        C4401iO1 c4401iO1 = this.g;
        if (c4401iO1 != null) {
            c6319rH0.c("parent_span_id");
            c4401iO1.serialize(c6319rH0, iLogger);
        }
        c6319rH0.c("op");
        c6319rH0.j(this.i);
        if (this.j != null) {
            c6319rH0.c("description");
            c6319rH0.j(this.j);
        }
        if (this.k != null) {
            c6319rH0.c("status");
            c6319rH0.g(iLogger, this.k);
        }
        if (this.m != null) {
            c6319rH0.c("origin");
            c6319rH0.g(iLogger, this.m);
        }
        if (!this.l.isEmpty()) {
            c6319rH0.c("tags");
            c6319rH0.g(iLogger, this.l);
        }
        if (!this.n.isEmpty()) {
            c6319rH0.c("data");
            c6319rH0.g(iLogger, this.n);
        }
        ConcurrentHashMap concurrentHashMap = this.o;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.o, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public C3561eO1(@NotNull u uVar, @NotNull C4401iO1 c4401iO1, @Nullable C4401iO1 c4401iO2, @NotNull String str, @Nullable String str2, @Nullable L02 l02, @Nullable EnumC4869kO1 enumC4869kO1, @Nullable String str3) {
        this.l = new ConcurrentHashMap();
        this.m = "manual";
        this.n = new ConcurrentHashMap();
        this.p = EnumC6511sB0.SENTRY;
        this.r = new d();
        this.s = u.e;
        p.b(uVar, "traceId is required");
        this.d = uVar;
        p.b(c4401iO1, "spanId is required");
        this.e = c4401iO1;
        p.b(str, "operation is required");
        this.i = str;
        this.g = c4401iO2;
        this.j = str2;
        this.k = enumC4869kO1;
        this.m = str3;
        a(l02);
        io.sentry.util.thread.a threadChecker = QF1.e().p().getThreadChecker();
        this.n.put("thread.id", String.valueOf(threadChecker.b()));
        this.n.put("thread.name", threadChecker.a());
    }

    public C3561eO1(@NotNull C3561eO1 c3561eO1) {
        this.l = new ConcurrentHashMap();
        this.m = "manual";
        this.n = new ConcurrentHashMap();
        this.p = EnumC6511sB0.SENTRY;
        this.r = new d();
        this.s = u.e;
        this.d = c3561eO1.d;
        this.e = c3561eO1.e;
        this.g = c3561eO1.g;
        a(c3561eO1.h);
        this.i = c3561eO1.i;
        this.j = c3561eO1.j;
        this.k = c3561eO1.k;
        ConcurrentHashMap concurrentHashMapA = C4529c.a(c3561eO1.l);
        if (concurrentHashMapA != null) {
            this.l = concurrentHashMapA;
        }
        ConcurrentHashMap concurrentHashMapA2 = C4529c.a(c3561eO1.o);
        if (concurrentHashMapA2 != null) {
            this.o = concurrentHashMapA2;
        }
        this.q = c3561eO1.q;
        ConcurrentHashMap concurrentHashMapA3 = C4529c.a(c3561eO1.n);
        if (concurrentHashMapA3 != null) {
            this.n = concurrentHashMapA3;
        }
    }
}

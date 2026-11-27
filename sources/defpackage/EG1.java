package defpackage;

import io.sentry.ILogger;
import io.sentry.protocol.A;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.s;
import io.sentry.protocol.u;
import io.sentry.util.C4529c;
import io.sentry.vendor.gson.stream.b;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class EG1 extends VF1 implements BH0 {

    @Nullable
    public List<String> A;

    @Nullable
    public ConcurrentHashMap B;

    @Nullable
    public AbstractMap C;

    @NotNull
    public Date t;

    @Nullable
    public m u;

    @Nullable
    public String v;

    @Nullable
    public H81 w;

    @Nullable
    public H81 x;

    @Nullable
    public NG1 y;

    @Nullable
    public String z;

    public static final class a implements KG0<EG1> {
        @Override // defpackage.KG0
        @NotNull
        public final EG1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            EG1 eg1 = new EG1();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "fingerprint":
                        List<String> list = (List) q71.W0();
                        if (list == null) {
                            break;
                        } else {
                            eg1.A = list;
                            break;
                        }
                        break;
                    case "threads":
                        q71.X0();
                        q71.x0();
                        eg1.w = new H81(q71.q0(iLogger, new A.a()));
                        q71.B0();
                        break;
                    case "logger":
                        eg1.v = q71.e0();
                        break;
                    case "timestamp":
                        Date dateD0 = q71.D0(iLogger);
                        if (dateD0 == null) {
                            break;
                        } else {
                            eg1.t = dateD0;
                            break;
                        }
                        break;
                    case "level":
                        eg1.y = (NG1) q71.H(iLogger, new NG1.a());
                        break;
                    case "message":
                        eg1.u = (m) q71.H(iLogger, new m.a());
                        break;
                    case "modules":
                        eg1.C = C4529c.a((Map) q71.W0());
                        break;
                    case "exception":
                        q71.X0();
                        q71.x0();
                        eg1.x = new H81(q71.q0(iLogger, new s.a()));
                        q71.B0();
                        break;
                    case "transaction":
                        eg1.z = q71.e0();
                        break;
                    default:
                        if (!VF1.a.a(eg1, strX0, q71, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            q71.Q(iLogger, concurrentHashMap, strX0);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            eg1.B = concurrentHashMap;
            q71.B0();
            return eg1;
        }
    }

    public EG1(@Nullable Throwable th) {
        this();
        this.n = th;
    }

    @Nullable
    public final ArrayList c() {
        H81 h81 = this.x;
        if (h81 == null) {
            return null;
        }
        return (ArrayList) h81.a;
    }

    @Nullable
    public final ArrayList d() {
        H81 h81 = this.w;
        if (h81 != null) {
            return (ArrayList) h81.a;
        }
        return null;
    }

    @Nullable
    public final s e() {
        Boolean bool;
        H81 h81 = this.x;
        if (h81 == null) {
            return null;
        }
        for (s sVar : (ArrayList) h81.a) {
            l lVar = sVar.j;
            if (lVar != null && (bool = lVar.h) != null && !bool.booleanValue()) {
                return sVar;
            }
        }
        return null;
    }

    public final boolean f() {
        H81 h81 = this.x;
        return (h81 == null || ((ArrayList) h81.a).isEmpty()) ? false : true;
    }

    public final void g(@Nullable List<String> list) {
        this.A = list != null ? new ArrayList(list) : null;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("timestamp");
        c6319rH0.g(iLogger, this.t);
        if (this.u != null) {
            c6319rH0.c("message");
            c6319rH0.g(iLogger, this.u);
        }
        if (this.v != null) {
            c6319rH0.c("logger");
            c6319rH0.j(this.v);
        }
        H81 h81 = this.w;
        if (h81 != null && !((ArrayList) h81.a).isEmpty()) {
            c6319rH0.c("threads");
            c6319rH0.a();
            c6319rH0.c("values");
            c6319rH0.g(iLogger, (ArrayList) this.w.a);
            c6319rH0.b();
        }
        H81 h82 = this.x;
        if (h82 != null && !((ArrayList) h82.a).isEmpty()) {
            c6319rH0.c("exception");
            c6319rH0.a();
            c6319rH0.c("values");
            c6319rH0.g(iLogger, (ArrayList) this.x.a);
            c6319rH0.b();
        }
        if (this.y != null) {
            c6319rH0.c("level");
            c6319rH0.g(iLogger, this.y);
        }
        if (this.z != null) {
            c6319rH0.c("transaction");
            c6319rH0.j(this.z);
        }
        if (this.A != null) {
            c6319rH0.c("fingerprint");
            c6319rH0.g(iLogger, this.A);
        }
        if (this.C != null) {
            c6319rH0.c("modules");
            c6319rH0.g(iLogger, this.C);
        }
        VF1.b.a(this, c6319rH0, iLogger);
        ConcurrentHashMap concurrentHashMap = this.B;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.B, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public EG1() {
        u uVar = new u();
        Date dateH = N7.h();
        super(uVar);
        this.t = dateH;
    }
}

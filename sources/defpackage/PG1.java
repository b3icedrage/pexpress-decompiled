package defpackage;

import io.sentry.ILogger;
import io.sentry.protocol.u;
import io.sentry.vendor.gson.stream.b;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PG1 implements BH0 {

    @NotNull
    public final u d;

    @Nullable
    public C4401iO1 e;

    @NotNull
    public final Double g;

    @NotNull
    public final String h;

    @NotNull
    public final SG1 i;

    @Nullable
    public Integer j;

    @Nullable
    public Map<String, QG1> k;

    @Nullable
    public HashMap l;

    public static final class a implements KG0<PG1> {
        @Override // defpackage.KG0
        @NotNull
        public final PG1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            u uVar = null;
            Double dU0 = null;
            String strE0 = null;
            HashMap map = null;
            SG1 sg1 = null;
            HashMap mapD1 = null;
            Integer numK = null;
            C4401iO1 c4401iO1 = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "span_id":
                        c4401iO1 = (C4401iO1) q71.H(iLogger, new C4401iO1.a());
                        break;
                    case "severity_number":
                        numK = q71.K();
                        break;
                    case "body":
                        strE0 = q71.e0();
                        break;
                    case "timestamp":
                        dU0 = q71.u0();
                        break;
                    case "level":
                        sg1 = (SG1) q71.H(iLogger, new SG1.a());
                        break;
                    case "attributes":
                        mapD1 = q71.d1(iLogger, new QG1.a());
                        break;
                    case "trace_id":
                        uVar = (u) q71.H(iLogger, new u.a());
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        q71.Q(iLogger, map, strX0);
                        break;
                }
            }
            q71.B0();
            if (uVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.d(NG1.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (dU0 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"timestamp\"");
                iLogger.d(NG1.ERROR, "Missing required field \"timestamp\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strE0 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                iLogger.d(NG1.ERROR, "Missing required field \"body\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (sg1 == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                iLogger.d(NG1.ERROR, "Missing required field \"level\"", illegalStateException4);
                throw illegalStateException4;
            }
            PG1 pg1 = new PG1(uVar, dU0, strE0, sg1);
            pg1.k = mapD1;
            pg1.j = numK;
            pg1.e = c4401iO1;
            pg1.l = map;
            return pg1;
        }
    }

    public PG1(@NotNull u uVar, @NotNull Double d, @NotNull String str, @NotNull SG1 sg1) {
        this.d = uVar;
        this.g = d;
        this.h = str;
        this.i = sg1;
    }

    public final void a(@Nullable String str, @Nullable QG1 qg1) {
        if (this.k == null) {
            this.k = new HashMap();
        }
        this.k.put(str, qg1);
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("timestamp");
        c6319rH0.g(iLogger, N7.d(this.g));
        c6319rH0.c("trace_id");
        c6319rH0.g(iLogger, this.d);
        if (this.e != null) {
            c6319rH0.c("span_id");
            c6319rH0.g(iLogger, this.e);
        }
        c6319rH0.c("body");
        c6319rH0.j(this.h);
        c6319rH0.c("level");
        c6319rH0.g(iLogger, this.i);
        if (this.j != null) {
            c6319rH0.c("severity_number");
            c6319rH0.g(iLogger, this.j);
        }
        if (this.k != null) {
            c6319rH0.c("attributes");
            c6319rH0.g(iLogger, this.k);
        }
        HashMap map = this.l;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.l, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

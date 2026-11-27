package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.ILogger;
import io.sentry.protocol.u;
import io.sentry.vendor.gson.stream.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class UG1 implements BH0 {

    @NotNull
    public u d;

    @Nullable
    public C4401iO1 e;

    @NotNull
    public Double g;

    @NotNull
    public String h;

    @Nullable
    public String i;

    @NotNull
    public String j;

    @NotNull
    public Double k;

    @Nullable
    public Map<String, QG1> l;

    @Nullable
    public HashMap m;

    public static final class a implements KG0<UG1> {
        @Override // defpackage.KG0
        @NotNull
        public final UG1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            u uVar = null;
            Double dU0 = null;
            String strE0 = null;
            HashMap map = null;
            String strE1 = null;
            Double dU1 = null;
            HashMap mapD1 = null;
            C4401iO1 c4401iO1 = null;
            String strE2 = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "span_id":
                        c4401iO1 = (C4401iO1) q71.H(iLogger, new C4401iO1.a());
                        break;
                    case "name":
                        strE1 = q71.e0();
                        break;
                    case "type":
                        strE0 = q71.e0();
                        break;
                    case "unit":
                        strE2 = q71.e0();
                        break;
                    case "timestamp":
                        dU0 = q71.u0();
                        break;
                    case "value":
                        dU1 = q71.u0();
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
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"type\"");
                iLogger.d(NG1.ERROR, "Missing required field \"type\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (strE1 == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                iLogger.d(NG1.ERROR, "Missing required field \"name\"", illegalStateException4);
                throw illegalStateException4;
            }
            if (dU1 == null) {
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"value\"");
                iLogger.d(NG1.ERROR, "Missing required field \"value\"", illegalStateException5);
                throw illegalStateException5;
            }
            UG1 ug1 = new UG1();
            ug1.d = uVar;
            ug1.g = dU0;
            ug1.h = strE1;
            ug1.j = strE0;
            ug1.k = dU1;
            ug1.l = mapD1;
            ug1.e = c4401iO1;
            ug1.i = strE2;
            ug1.m = map;
            return ug1;
        }
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("timestamp");
        c6319rH0.g(iLogger, N7.d(this.g));
        c6319rH0.c("type");
        c6319rH0.j(this.j);
        c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
        c6319rH0.j(this.h);
        c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c6319rH0.i(this.k);
        c6319rH0.c("trace_id");
        c6319rH0.g(iLogger, this.d);
        if (this.e != null) {
            c6319rH0.c("span_id");
            c6319rH0.g(iLogger, this.e);
        }
        if (this.i != null) {
            c6319rH0.c("unit");
            c6319rH0.g(iLogger, this.i);
        }
        if (this.l != null) {
            c6319rH0.c("attributes");
            c6319rH0.g(iLogger, this.l);
        }
        HashMap map = this.m;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.m, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.ILogger;
import io.sentry.util.p;
import io.sentry.vendor.gson.stream.b;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ii1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1214Ii1 implements BH0 {

    @NotNull
    public String d;

    @NotNull
    public String e;

    @NotNull
    public String g;

    @NotNull
    public Long h;

    @Nullable
    public Long i;

    @NotNull
    public Long j;

    @Nullable
    public Long k;

    @Nullable
    public ConcurrentHashMap l;

    /* JADX INFO: renamed from: Ii1$a */
    public static final class a implements KG0<C1214Ii1> {
        @Override // defpackage.KG0
        @NotNull
        public final C1214Ii1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            C1214Ii1 c1214Ii1 = new C1214Ii1();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "relative_start_ns":
                        Long lR = q71.R();
                        if (lR == null) {
                            break;
                        } else {
                            c1214Ii1.h = lR;
                            break;
                        }
                        break;
                    case "relative_end_ns":
                        Long lR2 = q71.R();
                        if (lR2 == null) {
                            break;
                        } else {
                            c1214Ii1.i = lR2;
                            break;
                        }
                        break;
                    case "id":
                        String strE0 = q71.e0();
                        if (strE0 == null) {
                            break;
                        } else {
                            c1214Ii1.d = strE0;
                            break;
                        }
                        break;
                    case "name":
                        String strE1 = q71.e0();
                        if (strE1 == null) {
                            break;
                        } else {
                            c1214Ii1.g = strE1;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strE2 = q71.e0();
                        if (strE2 == null) {
                            break;
                        } else {
                            c1214Ii1.e = strE2;
                            break;
                        }
                        break;
                    case "relative_cpu_end_ms":
                        Long lR3 = q71.R();
                        if (lR3 == null) {
                            break;
                        } else {
                            c1214Ii1.k = lR3;
                            break;
                        }
                        break;
                    case "relative_cpu_start_ms":
                        Long lR4 = q71.R();
                        if (lR4 == null) {
                            break;
                        } else {
                            c1214Ii1.j = lR4;
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
            c1214Ii1.l = concurrentHashMap;
            q71.B0();
            return c1214Ii1;
        }
    }

    public C1214Ii1() {
        this(C5440n51.a, 0L, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1214Ii1.class != obj.getClass()) {
            return false;
        }
        C1214Ii1 c1214Ii1 = (C1214Ii1) obj;
        return this.d.equals(c1214Ii1.d) && this.e.equals(c1214Ii1.e) && this.g.equals(c1214Ii1.g) && this.h.equals(c1214Ii1.h) && this.j.equals(c1214Ii1.j) && p.a(this.k, c1214Ii1.k) && p.a(this.i, c1214Ii1.i) && p.a(this.l, c1214Ii1.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("id");
        c6319rH0.g(iLogger, this.d);
        c6319rH0.c("trace_id");
        c6319rH0.g(iLogger, this.e);
        c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
        c6319rH0.g(iLogger, this.g);
        c6319rH0.c("relative_start_ns");
        c6319rH0.g(iLogger, this.h);
        c6319rH0.c("relative_end_ns");
        c6319rH0.g(iLogger, this.i);
        c6319rH0.c("relative_cpu_start_ms");
        c6319rH0.g(iLogger, this.j);
        c6319rH0.c("relative_cpu_end_ms");
        c6319rH0.g(iLogger, this.k);
        ConcurrentHashMap concurrentHashMap = this.l;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.l, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public C1214Ii1(@NotNull InterfaceC4302hv0 interfaceC4302hv0, @NotNull Long l, @NotNull Long l2) {
        this.d = interfaceC4302hv0.s().toString();
        this.e = interfaceC4302hv0.w().d.toString();
        this.g = interfaceC4302hv0.getName().isEmpty() ? "unknown" : interfaceC4302hv0.getName();
        this.h = l;
        this.j = l2;
    }
}

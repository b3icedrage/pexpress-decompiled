package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.protocol.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4523e implements BH0 {

    @Nullable
    public Float A;

    @Nullable
    public Integer B;

    @Nullable
    public Date C;

    @Nullable
    public TimeZone D;

    @Nullable
    public String E;

    @Nullable
    public String F;

    @Nullable
    public String G;

    @Nullable
    public Float H;

    @Nullable
    public Integer I;

    @Nullable
    public Double J;

    @Nullable
    public String K;

    @Nullable
    public String L;

    @Nullable
    public ConcurrentHashMap M;

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String g;

    @Nullable
    public String h;

    @Nullable
    public String i;

    @Nullable
    public String j;

    @Nullable
    public String[] k;

    @Nullable
    public Float l;

    @Nullable
    public Boolean m;

    @Nullable
    public Boolean n;

    @Nullable
    public b o;

    @Nullable
    public Boolean p;

    @Nullable
    public Long q;

    @Nullable
    public Long r;

    @Nullable
    public Long s;

    @Nullable
    public Boolean t;

    @Nullable
    public Long u;

    @Nullable
    public Long v;

    @Nullable
    public Long w;

    @Nullable
    public Long x;

    @Nullable
    public Integer y;

    @Nullable
    public Integer z;

    /* JADX INFO: renamed from: io.sentry.protocol.e$a */
    public static final class a implements KG0<C4523e> {
        @NotNull
        public static C4523e b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            C4523e c4523e = new C4523e();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "timezone":
                        c4523e.D = q71.a0(iLogger);
                        break;
                    case "boot_time":
                        if (q71.peek() != io.sentry.vendor.gson.stream.b.STRING) {
                            break;
                        } else {
                            c4523e.C = q71.D0(iLogger);
                            break;
                        }
                        break;
                    case "simulator":
                        c4523e.p = q71.H0();
                        break;
                    case "manufacturer":
                        c4523e.e = q71.e0();
                        break;
                    case "processor_count":
                        c4523e.I = q71.K();
                        break;
                    case "orientation":
                        c4523e.o = (b) q71.H(iLogger, new b.a());
                        break;
                    case "battery_temperature":
                        c4523e.H = q71.O0();
                        break;
                    case "family":
                        c4523e.h = q71.e0();
                        break;
                    case "locale":
                        c4523e.F = q71.e0();
                        break;
                    case "online":
                        c4523e.n = q71.H0();
                        break;
                    case "battery_level":
                        c4523e.l = q71.O0();
                        break;
                    case "model_id":
                        c4523e.j = q71.e0();
                        break;
                    case "screen_density":
                        c4523e.A = q71.O0();
                        break;
                    case "screen_dpi":
                        c4523e.B = q71.K();
                        break;
                    case "free_memory":
                        c4523e.r = q71.R();
                        break;
                    case "id":
                        c4523e.E = q71.e0();
                        break;
                    case "name":
                        c4523e.d = q71.e0();
                        break;
                    case "low_memory":
                        c4523e.t = q71.H0();
                        break;
                    case "archs":
                        List list = (List) q71.W0();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            c4523e.k = strArr;
                            break;
                        }
                        break;
                    case "brand":
                        c4523e.g = q71.e0();
                        break;
                    case "model":
                        c4523e.i = q71.e0();
                        break;
                    case "cpu_description":
                        c4523e.K = q71.e0();
                        break;
                    case "processor_frequency":
                        c4523e.J = q71.u0();
                        break;
                    case "connection_type":
                        c4523e.G = q71.e0();
                        break;
                    case "chipset":
                        c4523e.L = q71.e0();
                        break;
                    case "screen_width_pixels":
                        c4523e.y = q71.K();
                        break;
                    case "external_storage_size":
                        c4523e.w = q71.R();
                        break;
                    case "storage_size":
                        c4523e.u = q71.R();
                        break;
                    case "usable_memory":
                        c4523e.s = q71.R();
                        break;
                    case "memory_size":
                        c4523e.q = q71.R();
                        break;
                    case "charging":
                        c4523e.m = q71.H0();
                        break;
                    case "external_free_storage":
                        c4523e.x = q71.R();
                        break;
                    case "free_storage":
                        c4523e.v = q71.R();
                        break;
                    case "screen_height_pixels":
                        c4523e.z = q71.K();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            c4523e.M = concurrentHashMap;
            q71.B0();
            return c4523e;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ C4523e a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    /* JADX INFO: renamed from: io.sentry.protocol.e$b */
    public enum b implements BH0 {
        PORTRAIT,
        LANDSCAPE;

        /* JADX INFO: renamed from: io.sentry.protocol.e$b$a */
        public static final class a implements KG0<b> {
            @Override // defpackage.KG0
            @NotNull
            public final b a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
                return b.valueOf(q71.B().toUpperCase(Locale.ROOT));
            }
        }

        @Override // defpackage.BH0
        public void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
            ((C6319rH0) w71).j(toString().toLowerCase(Locale.ROOT));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4523e.class == obj.getClass()) {
            C4523e c4523e = (C4523e) obj;
            if (io.sentry.util.p.a(this.d, c4523e.d) && io.sentry.util.p.a(this.e, c4523e.e) && io.sentry.util.p.a(this.g, c4523e.g) && io.sentry.util.p.a(this.h, c4523e.h) && io.sentry.util.p.a(this.i, c4523e.i) && io.sentry.util.p.a(this.j, c4523e.j) && Arrays.equals(this.k, c4523e.k) && io.sentry.util.p.a(this.l, c4523e.l) && io.sentry.util.p.a(this.m, c4523e.m) && io.sentry.util.p.a(this.n, c4523e.n) && this.o == c4523e.o && io.sentry.util.p.a(this.p, c4523e.p) && io.sentry.util.p.a(this.q, c4523e.q) && io.sentry.util.p.a(this.r, c4523e.r) && io.sentry.util.p.a(this.s, c4523e.s) && io.sentry.util.p.a(this.t, c4523e.t) && io.sentry.util.p.a(this.u, c4523e.u) && io.sentry.util.p.a(this.v, c4523e.v) && io.sentry.util.p.a(this.w, c4523e.w) && io.sentry.util.p.a(this.x, c4523e.x) && io.sentry.util.p.a(this.y, c4523e.y) && io.sentry.util.p.a(this.z, c4523e.z) && io.sentry.util.p.a(this.A, c4523e.A) && io.sentry.util.p.a(this.B, c4523e.B) && io.sentry.util.p.a(this.C, c4523e.C) && io.sentry.util.p.a(this.E, c4523e.E) && io.sentry.util.p.a(this.F, c4523e.F) && io.sentry.util.p.a(this.G, c4523e.G) && io.sentry.util.p.a(this.H, c4523e.H) && io.sentry.util.p.a(this.I, c4523e.I) && io.sentry.util.p.a(this.J, c4523e.J) && io.sentry.util.p.a(this.K, c4523e.K) && io.sentry.util.p.a(this.L, c4523e.L)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.d, this.e, this.g, this.h, this.i, this.j, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L}) * 31) + Arrays.hashCode(this.k);
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c6319rH0.j(this.d);
        }
        if (this.e != null) {
            c6319rH0.c("manufacturer");
            c6319rH0.j(this.e);
        }
        if (this.g != null) {
            c6319rH0.c("brand");
            c6319rH0.j(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("family");
            c6319rH0.j(this.h);
        }
        if (this.i != null) {
            c6319rH0.c("model");
            c6319rH0.j(this.i);
        }
        if (this.j != null) {
            c6319rH0.c("model_id");
            c6319rH0.j(this.j);
        }
        if (this.k != null) {
            c6319rH0.c("archs");
            c6319rH0.g(iLogger, this.k);
        }
        if (this.l != null) {
            c6319rH0.c("battery_level");
            c6319rH0.i(this.l);
        }
        if (this.m != null) {
            c6319rH0.c("charging");
            c6319rH0.h(this.m);
        }
        if (this.n != null) {
            c6319rH0.c("online");
            c6319rH0.h(this.n);
        }
        if (this.o != null) {
            c6319rH0.c("orientation");
            c6319rH0.g(iLogger, this.o);
        }
        if (this.p != null) {
            c6319rH0.c("simulator");
            c6319rH0.h(this.p);
        }
        if (this.q != null) {
            c6319rH0.c("memory_size");
            c6319rH0.i(this.q);
        }
        if (this.r != null) {
            c6319rH0.c("free_memory");
            c6319rH0.i(this.r);
        }
        if (this.s != null) {
            c6319rH0.c("usable_memory");
            c6319rH0.i(this.s);
        }
        if (this.t != null) {
            c6319rH0.c("low_memory");
            c6319rH0.h(this.t);
        }
        if (this.u != null) {
            c6319rH0.c("storage_size");
            c6319rH0.i(this.u);
        }
        if (this.v != null) {
            c6319rH0.c("free_storage");
            c6319rH0.i(this.v);
        }
        if (this.w != null) {
            c6319rH0.c("external_storage_size");
            c6319rH0.i(this.w);
        }
        if (this.x != null) {
            c6319rH0.c("external_free_storage");
            c6319rH0.i(this.x);
        }
        if (this.y != null) {
            c6319rH0.c("screen_width_pixels");
            c6319rH0.i(this.y);
        }
        if (this.z != null) {
            c6319rH0.c("screen_height_pixels");
            c6319rH0.i(this.z);
        }
        if (this.A != null) {
            c6319rH0.c("screen_density");
            c6319rH0.i(this.A);
        }
        if (this.B != null) {
            c6319rH0.c("screen_dpi");
            c6319rH0.i(this.B);
        }
        if (this.C != null) {
            c6319rH0.c("boot_time");
            c6319rH0.g(iLogger, this.C);
        }
        if (this.D != null) {
            c6319rH0.c("timezone");
            c6319rH0.g(iLogger, this.D);
        }
        if (this.E != null) {
            c6319rH0.c("id");
            c6319rH0.j(this.E);
        }
        if (this.G != null) {
            c6319rH0.c("connection_type");
            c6319rH0.j(this.G);
        }
        if (this.H != null) {
            c6319rH0.c("battery_temperature");
            c6319rH0.i(this.H);
        }
        if (this.F != null) {
            c6319rH0.c("locale");
            c6319rH0.j(this.F);
        }
        if (this.I != null) {
            c6319rH0.c("processor_count");
            c6319rH0.i(this.I);
        }
        if (this.J != null) {
            c6319rH0.c("processor_frequency");
            c6319rH0.i(this.J);
        }
        if (this.K != null) {
            c6319rH0.c("cpu_description");
            c6319rH0.j(this.K);
        }
        if (this.L != null) {
            c6319rH0.c("chipset");
            c6319rH0.j(this.L);
        }
        ConcurrentHashMap concurrentHashMap = this.M;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.M, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

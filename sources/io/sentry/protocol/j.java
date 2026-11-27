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
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public Integer e;

    @Nullable
    public String g;

    @Nullable
    public String h;

    @Nullable
    public Integer i;

    @Nullable
    public String j;

    @Nullable
    public Boolean k;

    @Nullable
    public String l;

    @Nullable
    public String m;

    @Nullable
    public ConcurrentHashMap n;

    public static final class a implements KG0<j> {
        @NotNull
        public static j b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            j jVar = new j();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "npot_support":
                        jVar.m = q71.e0();
                        break;
                    case "vendor_id":
                        jVar.g = q71.e0();
                        break;
                    case "multi_threaded_rendering":
                        jVar.k = q71.H0();
                        break;
                    case "id":
                        jVar.e = q71.K();
                        break;
                    case "name":
                        jVar.d = q71.e0();
                        break;
                    case "vendor_name":
                        jVar.h = q71.e0();
                        break;
                    case "version":
                        jVar.l = q71.e0();
                        break;
                    case "api_type":
                        jVar.j = q71.e0();
                        break;
                    case "memory_size":
                        jVar.i = q71.K();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            jVar.n = concurrentHashMap;
            q71.B0();
            return jVar;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ j a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (io.sentry.util.p.a(this.d, jVar.d) && io.sentry.util.p.a(this.e, jVar.e) && io.sentry.util.p.a(this.g, jVar.g) && io.sentry.util.p.a(this.h, jVar.h) && io.sentry.util.p.a(this.i, jVar.i) && io.sentry.util.p.a(this.j, jVar.j) && io.sentry.util.p.a(this.k, jVar.k) && io.sentry.util.p.a(this.l, jVar.l) && io.sentry.util.p.a(this.m, jVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m});
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
            c6319rH0.c("id");
            c6319rH0.i(this.e);
        }
        if (this.g != null) {
            c6319rH0.c("vendor_id");
            c6319rH0.j(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("vendor_name");
            c6319rH0.j(this.h);
        }
        if (this.i != null) {
            c6319rH0.c("memory_size");
            c6319rH0.i(this.i);
        }
        if (this.j != null) {
            c6319rH0.c("api_type");
            c6319rH0.j(this.j);
        }
        if (this.k != null) {
            c6319rH0.c("multi_threaded_rendering");
            c6319rH0.h(this.k);
        }
        if (this.l != null) {
            c6319rH0.c("version");
            c6319rH0.j(this.l);
        }
        if (this.m != null) {
            c6319rH0.c("npot_support");
            c6319rH0.j(this.m);
        }
        ConcurrentHashMap concurrentHashMap = this.n;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.n, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

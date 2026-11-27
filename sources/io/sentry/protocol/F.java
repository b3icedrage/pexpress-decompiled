package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.C4529c;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String g;

    @Nullable
    public String h;

    @Deprecated
    @Nullable
    public String i;

    @Nullable
    public i j;

    @Nullable
    public ConcurrentHashMap k;

    @Nullable
    public ConcurrentHashMap l;

    public static final class a implements KG0<F> {
        @Override // defpackage.KG0
        @NotNull
        public final F a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            F f = new F();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "username":
                        f.g = q71.e0();
                        break;
                    case "id":
                        f.e = q71.e0();
                        break;
                    case "geo":
                        q71.X0();
                        i iVar = new i();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strX1 = q71.x0();
                            strX1.getClass();
                            switch (strX1) {
                                case "region":
                                    iVar.g = q71.e0();
                                    break;
                                case "city":
                                    iVar.d = q71.e0();
                                    break;
                                case "country_code":
                                    iVar.e = q71.e0();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    q71.Q(iLogger, concurrentHashMap2, strX1);
                                    break;
                            }
                        }
                        iVar.h = concurrentHashMap2;
                        q71.B0();
                        f.j = iVar;
                        break;
                    case "data":
                        f.k = C4529c.a((Map) q71.W0());
                        break;
                    case "name":
                        f.i = q71.e0();
                        break;
                    case "email":
                        f.d = q71.e0();
                        break;
                    case "ip_address":
                        f.h = q71.e0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            f.l = concurrentHashMap;
            q71.B0();
            return f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F.class == obj.getClass()) {
            F f = (F) obj;
            if (io.sentry.util.p.a(this.d, f.d) && io.sentry.util.p.a(this.e, f.e) && io.sentry.util.p.a(this.g, f.g) && io.sentry.util.p.a(this.h, f.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.g, this.h});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("email");
            c6319rH0.j(this.d);
        }
        if (this.e != null) {
            c6319rH0.c("id");
            c6319rH0.j(this.e);
        }
        if (this.g != null) {
            c6319rH0.c("username");
            c6319rH0.j(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("ip_address");
            c6319rH0.j(this.h);
        }
        if (this.i != null) {
            c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c6319rH0.j(this.i);
        }
        if (this.j != null) {
            c6319rH0.c("geo");
            this.j.serialize(c6319rH0, iLogger);
        }
        if (this.k != null) {
            c6319rH0.c("data");
            c6319rH0.g(iLogger, this.k);
        }
        ConcurrentHashMap concurrentHashMap = this.l;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.l, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

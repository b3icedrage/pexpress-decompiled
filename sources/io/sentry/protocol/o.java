package io.sentry.protocol;

import com.google.android.gms.common.internal.ImagesContract;
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
public final class o implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String g;

    @Nullable
    public Object h;

    @Nullable
    public String i;

    @Nullable
    public ConcurrentHashMap j;

    @Nullable
    public ConcurrentHashMap k;

    @Nullable
    public Long l;

    @Nullable
    public ConcurrentHashMap m;

    @Nullable
    public String n;

    @Nullable
    public String o;

    @Nullable
    public ConcurrentHashMap p;

    public static final class a implements KG0<o> {
        @Override // defpackage.KG0
        @NotNull
        public final o a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            o oVar = new o();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "fragment":
                        oVar.n = q71.e0();
                        break;
                    case "method":
                        oVar.e = q71.e0();
                        break;
                    case "env":
                        Map map = (Map) q71.W0();
                        if (map == null) {
                            break;
                        } else {
                            oVar.k = C4529c.a(map);
                            break;
                        }
                        break;
                    case "url":
                        oVar.d = q71.e0();
                        break;
                    case "data":
                        oVar.h = q71.W0();
                        break;
                    case "other":
                        Map map2 = (Map) q71.W0();
                        if (map2 == null) {
                            break;
                        } else {
                            oVar.m = C4529c.a(map2);
                            break;
                        }
                        break;
                    case "headers":
                        Map map3 = (Map) q71.W0();
                        if (map3 == null) {
                            break;
                        } else {
                            oVar.j = C4529c.a(map3);
                            break;
                        }
                        break;
                    case "cookies":
                        oVar.i = q71.e0();
                        break;
                    case "body_size":
                        oVar.l = q71.R();
                        break;
                    case "query_string":
                        oVar.g = q71.e0();
                        break;
                    case "api_target":
                        oVar.o = q71.e0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            oVar.p = concurrentHashMap;
            q71.B0();
            return oVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return io.sentry.util.p.a(this.d, oVar.d) && io.sentry.util.p.a(this.e, oVar.e) && io.sentry.util.p.a(this.g, oVar.g) && io.sentry.util.p.a(this.i, oVar.i) && io.sentry.util.p.a(this.j, oVar.j) && io.sentry.util.p.a(this.k, oVar.k) && io.sentry.util.p.a(this.l, oVar.l) && io.sentry.util.p.a(this.n, oVar.n) && io.sentry.util.p.a(this.o, oVar.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.g, this.i, this.j, this.k, this.l, this.n, this.o});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c(ImagesContract.URL);
            c6319rH0.j(this.d);
        }
        if (this.e != null) {
            c6319rH0.c("method");
            c6319rH0.j(this.e);
        }
        if (this.g != null) {
            c6319rH0.c("query_string");
            c6319rH0.j(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("data");
            c6319rH0.g(iLogger, this.h);
        }
        if (this.i != null) {
            c6319rH0.c("cookies");
            c6319rH0.j(this.i);
        }
        if (this.j != null) {
            c6319rH0.c("headers");
            c6319rH0.g(iLogger, this.j);
        }
        if (this.k != null) {
            c6319rH0.c("env");
            c6319rH0.g(iLogger, this.k);
        }
        if (this.m != null) {
            c6319rH0.c("other");
            c6319rH0.g(iLogger, this.m);
        }
        if (this.n != null) {
            c6319rH0.c("fragment");
            c6319rH0.g(iLogger, this.n);
        }
        if (this.l != null) {
            c6319rH0.c("body_size");
            c6319rH0.g(iLogger, this.l);
        }
        if (this.o != null) {
            c6319rH0.c("api_target");
            c6319rH0.g(iLogger, this.o);
        }
        ConcurrentHashMap concurrentHashMap = this.p;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.p, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

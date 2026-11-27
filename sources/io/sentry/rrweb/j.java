package io.sentry.rrweb;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.p;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends b implements BH0 {

    @NotNull
    public String g;
    public int h;
    public long i;
    public long j;

    @NotNull
    public String k;

    @NotNull
    public String l;
    public int m;
    public int n;
    public int o;

    @NotNull
    public String p;
    public int q;
    public int r;
    public int s;

    @Nullable
    public HashMap t;

    @Nullable
    public ConcurrentHashMap u;

    @Nullable
    public ConcurrentHashMap v;

    public static final class a implements KG0<j> {
        @NotNull
        public static j b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            j jVar = new j();
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("data")) {
                    q71.X0();
                    ConcurrentHashMap concurrentHashMap = null;
                    while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strX1 = q71.x0();
                        strX1.getClass();
                        if (strX1.equals("payload")) {
                            q71.X0();
                            ConcurrentHashMap concurrentHashMap2 = null;
                            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strX2 = q71.x0();
                                strX2.getClass();
                                switch (strX2) {
                                    case "duration":
                                        jVar.j = q71.a1();
                                        break;
                                    case "segmentId":
                                        jVar.h = q71.E0();
                                        break;
                                    case "height":
                                        Integer numK = q71.K();
                                        jVar.m = numK == null ? 0 : numK.intValue();
                                        break;
                                    case "container":
                                        String strE0 = q71.e0();
                                        if (strE0 == null) {
                                            strE0 = "";
                                        }
                                        jVar.l = strE0;
                                        break;
                                    case "frameCount":
                                        Integer numK2 = q71.K();
                                        jVar.o = numK2 == null ? 0 : numK2.intValue();
                                        break;
                                    case "top":
                                        Integer numK3 = q71.K();
                                        jVar.s = numK3 == null ? 0 : numK3.intValue();
                                        break;
                                    case "left":
                                        Integer numK4 = q71.K();
                                        jVar.r = numK4 == null ? 0 : numK4.intValue();
                                        break;
                                    case "size":
                                        Long lR = q71.R();
                                        jVar.i = lR == null ? 0L : lR.longValue();
                                        break;
                                    case "width":
                                        Integer numK5 = q71.K();
                                        jVar.n = numK5 == null ? 0 : numK5.intValue();
                                        break;
                                    case "frameRate":
                                        Integer numK6 = q71.K();
                                        jVar.q = numK6 == null ? 0 : numK6.intValue();
                                        break;
                                    case "encoding":
                                        String strE1 = q71.e0();
                                        if (strE1 == null) {
                                            strE1 = "";
                                        }
                                        jVar.k = strE1;
                                        break;
                                    case "frameRateType":
                                        String strE2 = q71.e0();
                                        if (strE2 == null) {
                                            strE2 = "";
                                        }
                                        jVar.p = strE2;
                                        break;
                                    default:
                                        if (concurrentHashMap2 == null) {
                                            concurrentHashMap2 = new ConcurrentHashMap();
                                        }
                                        q71.Q(iLogger, concurrentHashMap2, strX2);
                                        break;
                                }
                            }
                            jVar.u = concurrentHashMap2;
                            q71.B0();
                        } else if (strX1.equals("tag")) {
                            String strE3 = q71.e0();
                            if (strE3 == null) {
                                strE3 = "";
                            }
                            jVar.g = strE3;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            q71.Q(iLogger, concurrentHashMap, strX1);
                        }
                    }
                    jVar.v = concurrentHashMap;
                    q71.B0();
                } else if (strX0.equals("type")) {
                    c cVar = (c) q71.H(iLogger, new c.a());
                    p.b(cVar, "");
                    jVar.d = cVar;
                } else if (strX0.equals("timestamp")) {
                    jVar.e = q71.a1();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            jVar.t = map;
            q71.B0();
            return jVar;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ j a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    public j() {
        super(c.Custom);
        this.k = "h264";
        this.l = "mp4";
        this.p = "constant";
        this.g = "video";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.h == jVar.h && this.i == jVar.i && this.j == jVar.j && this.m == jVar.m && this.n == jVar.n && this.o == jVar.o && this.q == jVar.q && this.r == jVar.r && this.s == jVar.s && p.a(this.g, jVar.g) && p.a(this.k, jVar.k) && p.a(this.l, jVar.l) && p.a(this.p, jVar.p);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.g, Integer.valueOf(this.h), Long.valueOf(this.i), Long.valueOf(this.j), this.k, this.l, Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), this.p, Integer.valueOf(this.q), Integer.valueOf(this.r), Integer.valueOf(this.s)});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("type");
        c6319rH0.g(iLogger, this.d);
        c6319rH0.c("timestamp");
        c6319rH0.f(this.e);
        c6319rH0.c("data");
        c6319rH0.a();
        c6319rH0.c("tag");
        c6319rH0.j(this.g);
        c6319rH0.c("payload");
        c6319rH0.a();
        c6319rH0.c("segmentId");
        c6319rH0.f(this.h);
        c6319rH0.c("size");
        c6319rH0.f(this.i);
        c6319rH0.c("duration");
        c6319rH0.f(this.j);
        c6319rH0.c("encoding");
        c6319rH0.j(this.k);
        c6319rH0.c("container");
        c6319rH0.j(this.l);
        c6319rH0.c("height");
        c6319rH0.f(this.m);
        c6319rH0.c("width");
        c6319rH0.f(this.n);
        c6319rH0.c("frameCount");
        c6319rH0.f(this.o);
        c6319rH0.c("frameRate");
        c6319rH0.f(this.q);
        c6319rH0.c("frameRateType");
        c6319rH0.j(this.p);
        c6319rH0.c("left");
        c6319rH0.f(this.r);
        c6319rH0.c("top");
        c6319rH0.f(this.s);
        ConcurrentHashMap concurrentHashMap = this.u;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.u, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
        ConcurrentHashMap concurrentHashMap2 = this.v;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                C4564j.h(this.v, str2, c6319rH0, str2, iLogger);
            }
        }
        c6319rH0.b();
        HashMap map = this.t;
        if (map != null) {
            for (String str3 : map.keySet()) {
                C6495s7.e(this.t, str3, c6319rH0, str3, iLogger);
            }
        }
        c6319rH0.b();
    }
}

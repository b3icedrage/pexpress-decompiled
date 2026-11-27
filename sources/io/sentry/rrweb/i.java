package io.sentry.rrweb;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.C4529c;
import io.sentry.util.p;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends b implements BH0 {

    @NotNull
    public String g;

    @Nullable
    public String h;

    @Nullable
    public String i;
    public double j;
    public double k;

    @Nullable
    public ConcurrentHashMap l;

    @Nullable
    public HashMap m;

    @Nullable
    public ConcurrentHashMap n;

    @Nullable
    public ConcurrentHashMap o;

    public static final class a implements KG0<i> {
        @NotNull
        public static i b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            i iVar = new i();
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
                                    case "description":
                                        iVar.i = q71.e0();
                                        break;
                                    case "endTimestamp":
                                        iVar.k = q71.d0();
                                        break;
                                    case "startTimestamp":
                                        iVar.j = q71.d0();
                                        break;
                                    case "op":
                                        iVar.h = q71.e0();
                                        break;
                                    case "data":
                                        ConcurrentHashMap concurrentHashMapA = C4529c.a((Map) q71.W0());
                                        if (concurrentHashMapA == null) {
                                            break;
                                        } else {
                                            iVar.l = concurrentHashMapA;
                                            break;
                                        }
                                        break;
                                    default:
                                        if (concurrentHashMap2 == null) {
                                            concurrentHashMap2 = new ConcurrentHashMap();
                                        }
                                        q71.Q(iLogger, concurrentHashMap2, strX2);
                                        break;
                                }
                            }
                            iVar.n = concurrentHashMap2;
                            q71.B0();
                        } else if (strX1.equals("tag")) {
                            String strE0 = q71.e0();
                            if (strE0 == null) {
                                strE0 = "";
                            }
                            iVar.g = strE0;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            q71.Q(iLogger, concurrentHashMap, strX1);
                        }
                    }
                    iVar.o = concurrentHashMap;
                    q71.B0();
                } else if (strX0.equals("type")) {
                    c cVar = (c) q71.H(iLogger, new c.a());
                    p.b(cVar, "");
                    iVar.d = cVar;
                } else if (strX0.equals("timestamp")) {
                    iVar.e = q71.a1();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            iVar.m = map;
            q71.B0();
            return iVar;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ i a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    public i() {
        super(c.Custom);
        this.g = "performanceSpan";
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
        if (this.h != null) {
            c6319rH0.c("op");
            c6319rH0.j(this.h);
        }
        if (this.i != null) {
            c6319rH0.c("description");
            c6319rH0.j(this.i);
        }
        c6319rH0.c("startTimestamp");
        c6319rH0.g(iLogger, BigDecimal.valueOf(this.j));
        c6319rH0.c("endTimestamp");
        c6319rH0.g(iLogger, BigDecimal.valueOf(this.k));
        if (this.l != null) {
            c6319rH0.c("data");
            c6319rH0.g(iLogger, this.l);
        }
        ConcurrentHashMap concurrentHashMap = this.n;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.n, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
        ConcurrentHashMap concurrentHashMap2 = this.o;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                C4564j.h(this.o, str2, c6319rH0, str2, iLogger);
            }
        }
        c6319rH0.b();
        HashMap map = this.m;
        if (map != null) {
            for (String str3 : map.keySet()) {
                C6495s7.e(this.m, str3, c6319rH0, str3, iLogger);
            }
        }
        c6319rH0.b();
    }
}

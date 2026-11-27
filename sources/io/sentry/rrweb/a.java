package io.sentry.rrweb;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.NG1;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.C4529c;
import io.sentry.util.p;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b implements BH0 {

    @NotNull
    public String g;
    public double h;

    @Nullable
    public String i;

    @Nullable
    public String j;

    @Nullable
    public String k;

    @Nullable
    public NG1 l;

    @Nullable
    public ConcurrentHashMap m;

    @Nullable
    public HashMap n;

    @Nullable
    public ConcurrentHashMap o;

    @Nullable
    public ConcurrentHashMap p;

    /* JADX INFO: renamed from: io.sentry.rrweb.a$a, reason: collision with other inner class name */
    public static final class C0401a implements KG0<a> {
        @NotNull
        public static a b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            a aVar = new a();
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
                                    case "data":
                                        ConcurrentHashMap concurrentHashMapA = C4529c.a((Map) q71.W0());
                                        if (concurrentHashMapA == null) {
                                            break;
                                        } else {
                                            aVar.m = concurrentHashMapA;
                                            break;
                                        }
                                        break;
                                    case "type":
                                        aVar.i = q71.e0();
                                        break;
                                    case "category":
                                        aVar.j = q71.e0();
                                        break;
                                    case "timestamp":
                                        aVar.h = q71.d0();
                                        break;
                                    case "level":
                                        try {
                                            aVar.l = NG1.valueOf(q71.B().toUpperCase(Locale.ROOT));
                                            break;
                                        } catch (Exception e) {
                                            iLogger.c(NG1.DEBUG, e, "Error when deserializing SentryLevel", new Object[0]);
                                            break;
                                        }
                                        break;
                                    case "message":
                                        aVar.k = q71.e0();
                                        break;
                                    default:
                                        if (concurrentHashMap2 == null) {
                                            concurrentHashMap2 = new ConcurrentHashMap();
                                        }
                                        q71.Q(iLogger, concurrentHashMap2, strX2);
                                        break;
                                }
                            }
                            aVar.o = concurrentHashMap2;
                            q71.B0();
                        } else if (strX1.equals("tag")) {
                            String strE0 = q71.e0();
                            if (strE0 == null) {
                                strE0 = "";
                            }
                            aVar.g = strE0;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            q71.Q(iLogger, concurrentHashMap, strX1);
                        }
                    }
                    aVar.p = concurrentHashMap;
                    q71.B0();
                } else if (strX0.equals("type")) {
                    c cVar = (c) q71.H(iLogger, new c.a());
                    p.b(cVar, "");
                    aVar.d = cVar;
                } else if (strX0.equals("timestamp")) {
                    aVar.e = q71.a1();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            aVar.n = map;
            q71.B0();
            return aVar;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ a a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    public a() {
        super(c.Custom);
        this.g = "breadcrumb";
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
        if (this.i != null) {
            c6319rH0.c("type");
            c6319rH0.j(this.i);
        }
        c6319rH0.c("timestamp");
        c6319rH0.g(iLogger, BigDecimal.valueOf(this.h));
        if (this.j != null) {
            c6319rH0.c("category");
            c6319rH0.j(this.j);
        }
        if (this.k != null) {
            c6319rH0.c("message");
            c6319rH0.j(this.k);
        }
        if (this.l != null) {
            c6319rH0.c("level");
            c6319rH0.g(iLogger, this.l);
        }
        if (this.m != null) {
            c6319rH0.c("data");
            c6319rH0.g(iLogger, this.m);
        }
        ConcurrentHashMap concurrentHashMap = this.o;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.o, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
        ConcurrentHashMap concurrentHashMap2 = this.p;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                C4564j.h(this.p, str2, c6319rH0, str2, iLogger);
            }
        }
        c6319rH0.b();
        HashMap map = this.n;
        if (map != null) {
            for (String str3 : map.keySet()) {
                C6495s7.e(this.n, str3, c6319rH0, str3, iLogger);
            }
        }
        c6319rH0.b();
    }
}

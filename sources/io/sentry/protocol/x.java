package io.sentry.protocol;

import defpackage.AbstractC3118cG1;
import defpackage.BH0;
import defpackage.C1039Gc0;
import defpackage.C3352dO1;
import defpackage.C3561eO1;
import defpackage.C4401iO1;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.EnumC4869kO1;
import defpackage.KG0;
import defpackage.NG1;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.C4529c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements BH0 {

    @NotNull
    public final Double d;

    @Nullable
    public final Double e;

    @NotNull
    public final u g;

    @NotNull
    public final C4401iO1 h;

    @Nullable
    public final C4401iO1 i;

    @NotNull
    public final String j;

    @Nullable
    public final String k;

    @Nullable
    public final EnumC4869kO1 l;

    @Nullable
    public final String m;

    @NotNull
    public final Map<String, String> n;

    @Nullable
    public Map<String, Object> o;

    @NotNull
    public final Map<String, k> p;

    @Nullable
    public ConcurrentHashMap q;

    public static final class a implements KG0<x> {
        public static IllegalStateException b(String str, ILogger iLogger) {
            String strD = C1039Gc0.d("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strD);
            iLogger.d(NG1.ERROR, strD, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:7:0x003d  */
        @Override // defpackage.KG0
        @NotNull
        public final x a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            ConcurrentHashMap concurrentHashMap = null;
            Double dValueOf = null;
            Map map = null;
            u uVar = null;
            C4401iO1 c4401iO1 = null;
            HashMap map2 = null;
            String strE0 = null;
            Double dValueOf2 = null;
            C4401iO1 c4401iO2 = null;
            String strE1 = null;
            EnumC4869kO1 enumC4869kO1 = null;
            String strE2 = null;
            Map map3 = null;
            while (true) {
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                if (q71.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (dValueOf == null) {
                        throw b("start_timestamp", iLogger);
                    }
                    if (uVar == null) {
                        throw b("trace_id", iLogger);
                    }
                    if (c4401iO1 == null) {
                        throw b("span_id", iLogger);
                    }
                    if (strE0 == null) {
                        throw b("op", iLogger);
                    }
                    if (map == null) {
                        map = new HashMap();
                    }
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    x xVar = new x(dValueOf, dValueOf2, uVar, c4401iO1, c4401iO2, strE0, strE1, enumC4869kO1, strE2, map, map2, map3);
                    xVar.q = concurrentHashMap2;
                    q71.B0();
                    return xVar;
                }
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "span_id":
                        c4401iO1 = new C4401iO1(q71.B());
                        break;
                    case "parent_span_id":
                        c4401iO2 = (C4401iO1) q71.H(iLogger, new C4401iO1.a());
                        break;
                    case "description":
                        strE1 = q71.e0();
                        break;
                    case "start_timestamp":
                        try {
                            dValueOf = q71.u0();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateD0 = q71.D0(iLogger);
                            dValueOf = dateD0 == null ? null : Double.valueOf(dateD0.getTime() / 1000.0d);
                            break;
                        }
                        break;
                    case "origin":
                        strE2 = q71.e0();
                        break;
                    case "status":
                        enumC4869kO1 = (EnumC4869kO1) q71.H(iLogger, new EnumC4869kO1.a());
                        break;
                    case "measurements":
                        map2 = q71.d1(iLogger, new k.a());
                        break;
                    case "op":
                        strE0 = q71.e0();
                        break;
                    case "data":
                        map3 = (Map) q71.W0();
                        break;
                    case "tags":
                        map = (Map) q71.W0();
                        break;
                    case "timestamp":
                        try {
                            dValueOf2 = q71.u0();
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateD1 = q71.D0(iLogger);
                            dValueOf2 = dateD1 == null ? null : Double.valueOf(dateD1.getTime() / 1000.0d);
                            break;
                        }
                        break;
                    case "trace_id":
                        uVar = new u(q71.B());
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        continue;
                        break;
                }
                concurrentHashMap = concurrentHashMap2;
            }
        }
    }

    public x() {
        throw null;
    }

    public x(@NotNull Double d, @Nullable Double d2, @NotNull u uVar, @NotNull C4401iO1 c4401iO1, @Nullable C4401iO1 c4401iO2, @NotNull String str, @Nullable String str2, @Nullable EnumC4869kO1 enumC4869kO1, @Nullable String str3, @NotNull Map<String, String> map, @NotNull Map<String, k> map2, @Nullable Map<String, Object> map3) {
        this.d = d;
        this.e = d2;
        this.g = uVar;
        this.h = c4401iO1;
        this.i = c4401iO2;
        this.j = str;
        this.k = str2;
        this.l = enumC4869kO1;
        this.m = str3;
        this.n = map;
        this.p = map2;
        this.o = map3;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.d.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        c6319rH0.g(iLogger, bigDecimalValueOf.setScale(6, roundingMode));
        Double d = this.e;
        if (d != null) {
            c6319rH0.c("timestamp");
            c6319rH0.g(iLogger, BigDecimal.valueOf(d.doubleValue()).setScale(6, roundingMode));
        }
        c6319rH0.c("trace_id");
        c6319rH0.g(iLogger, this.g);
        c6319rH0.c("span_id");
        c6319rH0.g(iLogger, this.h);
        C4401iO1 c4401iO1 = this.i;
        if (c4401iO1 != null) {
            c6319rH0.c("parent_span_id");
            c6319rH0.g(iLogger, c4401iO1);
        }
        c6319rH0.c("op");
        c6319rH0.j(this.j);
        String str = this.k;
        if (str != null) {
            c6319rH0.c("description");
            c6319rH0.j(str);
        }
        EnumC4869kO1 enumC4869kO1 = this.l;
        if (enumC4869kO1 != null) {
            c6319rH0.c("status");
            c6319rH0.g(iLogger, enumC4869kO1);
        }
        String str2 = this.m;
        if (str2 != null) {
            c6319rH0.c("origin");
            c6319rH0.g(iLogger, str2);
        }
        Map<String, String> map = this.n;
        if (!map.isEmpty()) {
            c6319rH0.c("tags");
            c6319rH0.g(iLogger, map);
        }
        if (this.o != null) {
            c6319rH0.c("data");
            c6319rH0.g(iLogger, this.o);
        }
        Map<String, k> map2 = this.p;
        if (!map2.isEmpty()) {
            c6319rH0.c("measurements");
            c6319rH0.g(iLogger, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.q;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                C4564j.h(this.q, str3, c6319rH0, str3, iLogger);
            }
        }
        c6319rH0.b();
    }

    public x(@NotNull C3352dO1 c3352dO1) {
        ConcurrentHashMap concurrentHashMap = c3352dO1.k;
        C3561eO1 c3561eO1 = c3352dO1.c;
        this.k = c3561eO1.j;
        this.j = c3561eO1.i;
        this.h = c3561eO1.e;
        this.i = c3561eO1.g;
        this.g = c3561eO1.d;
        this.l = c3561eO1.k;
        this.m = c3561eO1.m;
        ConcurrentHashMap concurrentHashMapA = C4529c.a(c3561eO1.l);
        this.n = concurrentHashMapA == null ? new ConcurrentHashMap() : concurrentHashMapA;
        ConcurrentHashMap concurrentHashMapA2 = C4529c.a(c3352dO1.l);
        this.p = concurrentHashMapA2 == null ? new ConcurrentHashMap() : concurrentHashMapA2;
        AbstractC3118cG1 abstractC3118cG1 = c3352dO1.b;
        this.e = abstractC3118cG1 == null ? null : Double.valueOf(c3352dO1.a.f(abstractC3118cG1) / 1.0E9d);
        this.d = Double.valueOf(c3352dO1.a.i() / 1.0E9d);
        this.o = concurrentHashMap;
        c3561eO1.r.g();
    }
}

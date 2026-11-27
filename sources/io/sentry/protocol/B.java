package io.sentry.protocol;

import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.BH0;
import defpackage.C3352dO1;
import defpackage.C3561eO1;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.C7581xH1;
import defpackage.KG0;
import defpackage.L02;
import defpackage.N7;
import defpackage.Q71;
import defpackage.VF1;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends VF1 implements BH0 {

    @Nullable
    public String t;

    @NotNull
    public Double u;

    @Nullable
    public Double v;

    @NotNull
    public final ArrayList w;

    @NotNull
    public final HashMap x;

    @NotNull
    public D y;

    @Nullable
    public ConcurrentHashMap z;

    public static final class a implements KG0<B> {
        @Override // defpackage.KG0
        @NotNull
        public final B a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            B b = new B(new ArrayList(), new HashMap(), new D(E.CUSTOM.apiName()));
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "start_timestamp":
                        try {
                            Double dU0 = q71.u0();
                            if (dU0 != null) {
                                b.u = dU0;
                            }
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateD0 = q71.D0(iLogger);
                            if (dateD0 != null) {
                                b.u = Double.valueOf(dateD0.getTime() / 1000.0d);
                            }
                            break;
                        }
                        break;
                    case "measurements":
                        HashMap mapD1 = q71.d1(iLogger, new k.a());
                        if (mapD1 != null) {
                            b.x.putAll(mapD1);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "type":
                        q71.B();
                        break;
                    case "timestamp":
                        try {
                            Double dU1 = q71.u0();
                            if (dU1 != null) {
                                b.v = dU1;
                            }
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateD1 = q71.D0(iLogger);
                            if (dateD1 != null) {
                                b.v = Double.valueOf(dateD1.getTime() / 1000.0d);
                            }
                            break;
                        }
                        break;
                    case "spans":
                        ArrayList arrayListQ0 = q71.q0(iLogger, new x.a());
                        if (arrayListQ0 != null) {
                            b.w.addAll(arrayListQ0);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "transaction_info":
                        q71.X0();
                        String strE0 = null;
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strX1 = q71.x0();
                            strX1.getClass();
                            if (strX1.equals(Payload.SOURCE)) {
                                strE0 = q71.e0();
                            } else {
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                q71.Q(iLogger, concurrentHashMap2, strX1);
                            }
                        }
                        D d = new D(strE0);
                        d.e = concurrentHashMap2;
                        q71.B0();
                        b.y = d;
                        break;
                    case "transaction":
                        b.t = q71.e0();
                        break;
                    default:
                        if (VF1.a.a(b, strX0, q71, iLogger)) {
                            break;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            q71.Q(iLogger, concurrentHashMap, strX0);
                            break;
                        }
                        break;
                }
            }
            b.z = concurrentHashMap;
            q71.B0();
            return b;
        }
    }

    public B(@NotNull C7581xH1 c7581xH1) {
        super(c7581xH1.a);
        this.w = new ArrayList();
        this.x = new HashMap();
        C3352dO1 c3352dO1 = c7581xH1.b;
        this.u = Double.valueOf(c3352dO1.a.i() / 1.0E9d);
        this.v = Double.valueOf(c3352dO1.a.f(c3352dO1.b) / 1.0E9d);
        this.t = c7581xH1.e;
        for (C3352dO1 c3352dO2 : c7581xH1.c) {
            Boolean bool = Boolean.TRUE;
            L02 l02 = c3352dO2.c.h;
            if (bool.equals(l02 == null ? null : l02.a)) {
                this.w.add(new x(c3352dO2));
            }
        }
        C4521c c4521c = this.e;
        c4521c.m(c7581xH1.p);
        C3561eO1 c3561eO1 = c3352dO1.c;
        ConcurrentHashMap concurrentHashMap = c3352dO1.k;
        C3561eO1 c3561eO2 = new C3561eO1(c3561eO1.d, c3561eO1.e, c3561eO1.g, c3561eO1.i, c3561eO1.j, c3561eO1.h, c3561eO1.k, c3561eO1.m);
        for (Map.Entry entry : c3561eO1.l.entrySet()) {
            b((String) entry.getKey(), (String) entry.getValue());
        }
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (str != null) {
                    if (value == null) {
                        c3561eO2.n.remove(str);
                    } else {
                        c3561eO2.n.put(str, value);
                    }
                }
            }
        }
        c3561eO1.r.g();
        c4521c.x(c3561eO2);
        this.y = new D(c7581xH1.n.apiName());
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.t != null) {
            c6319rH0.c("transaction");
            c6319rH0.j(this.t);
        }
        c6319rH0.c("start_timestamp");
        c6319rH0.g(iLogger, N7.d(this.u));
        if (this.v != null) {
            c6319rH0.c("timestamp");
            c6319rH0.g(iLogger, N7.d(this.v));
        }
        ArrayList arrayList = this.w;
        if (!arrayList.isEmpty()) {
            c6319rH0.c("spans");
            c6319rH0.g(iLogger, arrayList);
        }
        c6319rH0.c("type");
        c6319rH0.j("transaction");
        HashMap map = this.x;
        if (!map.isEmpty()) {
            c6319rH0.c("measurements");
            c6319rH0.g(iLogger, map);
        }
        c6319rH0.c("transaction_info");
        c6319rH0.g(iLogger, this.y);
        VF1.b.a(this, c6319rH0, iLogger);
        ConcurrentHashMap concurrentHashMap = this.z;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.z, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public B(@NotNull ArrayList arrayList, @NotNull HashMap map, @NotNull D d) {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.w = arrayList2;
        HashMap map2 = new HashMap();
        this.x = map2;
        this.t = "";
        this.u = dValueOf;
        this.v = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.x.putAll(((x) it.next()).p);
        }
        this.y = d;
    }
}

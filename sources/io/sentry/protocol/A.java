package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.OG1;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class A implements BH0 {

    @Nullable
    public Long d;

    @Nullable
    public Integer e;

    @Nullable
    public String g;

    @Nullable
    public String h;

    @Nullable
    public Boolean i;

    @Nullable
    public Boolean j;

    @Nullable
    public Boolean k;

    @Nullable
    public Boolean l;

    @Nullable
    public z m;

    @Nullable
    public Map<String, OG1> n;

    @Nullable
    public ConcurrentHashMap o;

    public static final class a implements KG0<A> {
        @Override // defpackage.KG0
        @NotNull
        public final A a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            A a = new A();
            q71.X0();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "daemon":
                        a.k = q71.H0();
                        break;
                    case "priority":
                        a.e = q71.K();
                        break;
                    case "held_locks":
                        HashMap mapD1 = q71.d1(iLogger, new OG1.a());
                        if (mapD1 == null) {
                            break;
                        } else {
                            a.n = new HashMap(mapD1);
                            break;
                        }
                        break;
                    case "id":
                        a.d = q71.R();
                        break;
                    case "main":
                        a.l = q71.H0();
                        break;
                    case "name":
                        a.g = q71.e0();
                        break;
                    case "state":
                        a.h = q71.e0();
                        break;
                    case "crashed":
                        a.i = q71.H0();
                        break;
                    case "current":
                        a.j = q71.H0();
                        break;
                    case "stacktrace":
                        a.m = (z) q71.H(iLogger, new z.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            a.o = concurrentHashMap;
            q71.B0();
            return a;
        }
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("id");
            c6319rH0.i(this.d);
        }
        if (this.e != null) {
            c6319rH0.c("priority");
            c6319rH0.i(this.e);
        }
        if (this.g != null) {
            c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c6319rH0.j(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("state");
            c6319rH0.j(this.h);
        }
        if (this.i != null) {
            c6319rH0.c("crashed");
            c6319rH0.h(this.i);
        }
        if (this.j != null) {
            c6319rH0.c("current");
            c6319rH0.h(this.j);
        }
        if (this.k != null) {
            c6319rH0.c("daemon");
            c6319rH0.h(this.k);
        }
        if (this.l != null) {
            c6319rH0.c("main");
            c6319rH0.h(this.l);
        }
        if (this.m != null) {
            c6319rH0.c("stacktrace");
            c6319rH0.g(iLogger, this.m);
        }
        if (this.n != null) {
            c6319rH0.c("held_locks");
            c6319rH0.g(iLogger, this.n);
        }
        ConcurrentHashMap concurrentHashMap = this.o;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.o, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

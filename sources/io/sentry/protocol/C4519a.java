package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.C4529c;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.protocol.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4519a implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public Date e;

    @Nullable
    public String g;

    @Nullable
    public String h;

    @Nullable
    public String i;

    @Nullable
    public String j;

    @Nullable
    public String k;

    @Nullable
    public AbstractMap l;

    @Nullable
    public List<String> m;

    @Nullable
    public String n;

    @Nullable
    public Boolean o;

    @Nullable
    public Boolean p;

    @Nullable
    public List<String> q;

    @Nullable
    public ConcurrentHashMap r;

    /* JADX INFO: renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    public static final class C0399a implements KG0<C4519a> {
        @NotNull
        public static C4519a b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            C4519a c4519a = new C4519a();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "split_names":
                        List<String> list = (List) q71.W0();
                        if (list == null) {
                            break;
                        } else {
                            c4519a.q = list;
                            break;
                        }
                        break;
                    case "device_app_hash":
                        c4519a.g = q71.e0();
                        break;
                    case "start_type":
                        c4519a.n = q71.e0();
                        break;
                    case "view_names":
                        List<String> list2 = (List) q71.W0();
                        if (list2 == null) {
                            break;
                        } else {
                            c4519a.m = list2;
                            break;
                        }
                        break;
                    case "app_version":
                        c4519a.j = q71.e0();
                        break;
                    case "in_foreground":
                        c4519a.o = q71.H0();
                        break;
                    case "build_type":
                        c4519a.h = q71.e0();
                        break;
                    case "app_identifier":
                        c4519a.d = q71.e0();
                        break;
                    case "app_start_time":
                        c4519a.e = q71.D0(iLogger);
                        break;
                    case "permissions":
                        c4519a.l = C4529c.a((Map) q71.W0());
                        break;
                    case "app_name":
                        c4519a.i = q71.e0();
                        break;
                    case "app_build":
                        c4519a.k = q71.e0();
                        break;
                    case "is_split_apks":
                        c4519a.p = q71.H0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            c4519a.r = concurrentHashMap;
            q71.B0();
            return c4519a;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ C4519a a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4519a.class != obj.getClass()) {
            return false;
        }
        C4519a c4519a = (C4519a) obj;
        return io.sentry.util.p.a(this.d, c4519a.d) && io.sentry.util.p.a(this.e, c4519a.e) && io.sentry.util.p.a(this.g, c4519a.g) && io.sentry.util.p.a(this.h, c4519a.h) && io.sentry.util.p.a(this.i, c4519a.i) && io.sentry.util.p.a(this.j, c4519a.j) && io.sentry.util.p.a(this.k, c4519a.k) && io.sentry.util.p.a(this.l, c4519a.l) && io.sentry.util.p.a(this.o, c4519a.o) && io.sentry.util.p.a(this.m, c4519a.m) && io.sentry.util.p.a(this.n, c4519a.n) && io.sentry.util.p.a(this.p, c4519a.p) && io.sentry.util.p.a(this.q, c4519a.q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.o, this.m, this.n, this.p, this.q});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("app_identifier");
            c6319rH0.j(this.d);
        }
        if (this.e != null) {
            c6319rH0.c("app_start_time");
            c6319rH0.g(iLogger, this.e);
        }
        if (this.g != null) {
            c6319rH0.c("device_app_hash");
            c6319rH0.j(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("build_type");
            c6319rH0.j(this.h);
        }
        if (this.i != null) {
            c6319rH0.c("app_name");
            c6319rH0.j(this.i);
        }
        if (this.j != null) {
            c6319rH0.c("app_version");
            c6319rH0.j(this.j);
        }
        if (this.k != null) {
            c6319rH0.c("app_build");
            c6319rH0.j(this.k);
        }
        AbstractMap abstractMap = this.l;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            c6319rH0.c("permissions");
            c6319rH0.g(iLogger, this.l);
        }
        if (this.o != null) {
            c6319rH0.c("in_foreground");
            c6319rH0.h(this.o);
        }
        if (this.m != null) {
            c6319rH0.c("view_names");
            c6319rH0.g(iLogger, this.m);
        }
        if (this.n != null) {
            c6319rH0.c("start_type");
            c6319rH0.j(this.n);
        }
        if (this.p != null) {
            c6319rH0.c("is_split_apks");
            c6319rH0.h(this.p);
        }
        List<String> list = this.q;
        if (list != null && !list.isEmpty()) {
            c6319rH0.c("split_names");
            c6319rH0.g(iLogger, this.q);
        }
        ConcurrentHashMap concurrentHashMap = this.r;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.r, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

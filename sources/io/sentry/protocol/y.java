package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.OG1;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements BH0 {

    @Nullable
    public List<String> d;

    @Nullable
    public List<String> e;

    @Nullable
    public Map<String, Object> g;

    @Nullable
    public String h;

    @Nullable
    public String i;

    @Nullable
    public String j;

    @Nullable
    public Integer k;

    @Nullable
    public Integer l;

    @Nullable
    public String m;

    @Nullable
    public String n;

    @Nullable
    public Boolean o;

    @Nullable
    public String p;

    @Nullable
    public Boolean q;

    @Nullable
    public String r;

    @Nullable
    public String s;

    @Nullable
    public String t;

    @Nullable
    public String u;

    @Nullable
    public String v;

    @Nullable
    public String w;

    @Nullable
    public ConcurrentHashMap x;

    @Nullable
    public String y;

    @Nullable
    public OG1 z;

    public static final class a implements KG0<y> {
        @Override // defpackage.KG0
        @NotNull
        public final y a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            y yVar = new y();
            q71.X0();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "post_context":
                        yVar.e = (List) q71.W0();
                        break;
                    case "image_addr":
                        yVar.s = q71.e0();
                        break;
                    case "in_app":
                        yVar.o = q71.H0();
                        break;
                    case "raw_function":
                        yVar.y = q71.e0();
                        break;
                    case "lineno":
                        yVar.k = q71.K();
                        break;
                    case "module":
                        yVar.j = q71.e0();
                        break;
                    case "native":
                        yVar.q = q71.H0();
                        break;
                    case "symbol":
                        yVar.w = q71.e0();
                        break;
                    case "package":
                        yVar.p = q71.e0();
                        break;
                    case "filename":
                        yVar.h = q71.e0();
                        break;
                    case "symbol_addr":
                        yVar.t = q71.e0();
                        break;
                    case "lock":
                        yVar.z = (OG1) q71.H(iLogger, new OG1.a());
                        break;
                    case "vars":
                        yVar.g = (Map) q71.W0();
                        break;
                    case "colno":
                        yVar.l = q71.K();
                        break;
                    case "instruction_addr":
                        yVar.u = q71.e0();
                        break;
                    case "pre_context":
                        yVar.d = (List) q71.W0();
                        break;
                    case "addr_mode":
                        yVar.v = q71.e0();
                        break;
                    case "context_line":
                        yVar.n = q71.e0();
                        break;
                    case "function":
                        yVar.i = q71.e0();
                        break;
                    case "abs_path":
                        yVar.m = q71.e0();
                        break;
                    case "platform":
                        yVar.r = q71.e0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            yVar.x = concurrentHashMap;
            q71.B0();
            return yVar;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return Objects.equals(this.d, yVar.d) && Objects.equals(this.e, yVar.e) && Objects.equals(this.g, yVar.g) && Objects.equals(this.h, yVar.h) && Objects.equals(this.i, yVar.i) && Objects.equals(this.j, yVar.j) && Objects.equals(this.k, yVar.k) && Objects.equals(this.l, yVar.l) && Objects.equals(this.m, yVar.m) && Objects.equals(this.n, yVar.n) && Objects.equals(this.o, yVar.o) && Objects.equals(this.p, yVar.p) && Objects.equals(this.q, yVar.q) && Objects.equals(this.r, yVar.r) && Objects.equals(this.s, yVar.s) && Objects.equals(this.t, yVar.t) && Objects.equals(this.u, yVar.u) && Objects.equals(this.v, yVar.v) && Objects.equals(this.w, yVar.w) && Objects.equals(this.x, yVar.x) && Objects.equals(this.y, yVar.y) && Objects.equals(this.z, yVar.z);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.e, this.g, null, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z);
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.h != null) {
            c6319rH0.c("filename");
            c6319rH0.j(this.h);
        }
        if (this.i != null) {
            c6319rH0.c("function");
            c6319rH0.j(this.i);
        }
        if (this.j != null) {
            c6319rH0.c("module");
            c6319rH0.j(this.j);
        }
        if (this.k != null) {
            c6319rH0.c("lineno");
            c6319rH0.i(this.k);
        }
        if (this.l != null) {
            c6319rH0.c("colno");
            c6319rH0.i(this.l);
        }
        if (this.m != null) {
            c6319rH0.c("abs_path");
            c6319rH0.j(this.m);
        }
        if (this.n != null) {
            c6319rH0.c("context_line");
            c6319rH0.j(this.n);
        }
        if (this.o != null) {
            c6319rH0.c("in_app");
            c6319rH0.h(this.o);
        }
        if (this.p != null) {
            c6319rH0.c("package");
            c6319rH0.j(this.p);
        }
        if (this.q != null) {
            c6319rH0.c("native");
            c6319rH0.h(this.q);
        }
        if (this.r != null) {
            c6319rH0.c("platform");
            c6319rH0.j(this.r);
        }
        if (this.s != null) {
            c6319rH0.c("image_addr");
            c6319rH0.j(this.s);
        }
        if (this.t != null) {
            c6319rH0.c("symbol_addr");
            c6319rH0.j(this.t);
        }
        if (this.u != null) {
            c6319rH0.c("instruction_addr");
            c6319rH0.j(this.u);
        }
        if (this.v != null) {
            c6319rH0.c("addr_mode");
            c6319rH0.j(this.v);
        }
        if (this.y != null) {
            c6319rH0.c("raw_function");
            c6319rH0.j(this.y);
        }
        if (this.w != null) {
            c6319rH0.c("symbol");
            c6319rH0.j(this.w);
        }
        if (this.z != null) {
            c6319rH0.c("lock");
            c6319rH0.g(iLogger, this.z);
        }
        List<String> list = this.d;
        if (list != null && !list.isEmpty()) {
            c6319rH0.c("pre_context");
            c6319rH0.g(iLogger, this.d);
        }
        List<String> list2 = this.e;
        if (list2 != null && !list2.isEmpty()) {
            c6319rH0.c("post_context");
            c6319rH0.g(iLogger, this.e);
        }
        Map<String, Object> map = this.g;
        if (map != null && !map.isEmpty()) {
            c6319rH0.c("vars");
            c6319rH0.g(iLogger, this.g);
        }
        ConcurrentHashMap concurrentHashMap = this.x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.x, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

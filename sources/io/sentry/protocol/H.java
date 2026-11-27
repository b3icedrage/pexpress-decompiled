package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class H implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String g;

    @Nullable
    public String h;

    @Nullable
    public Double i;

    @Nullable
    public Double j;

    @Nullable
    public Double k;

    @Nullable
    public Double l;

    @Nullable
    public String m;

    @Nullable
    public Double n;

    @Nullable
    public List<H> o;

    @Nullable
    public HashMap p;

    public static final class a implements KG0<H> {
        @Override // defpackage.KG0
        @NotNull
        public final H a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            H h = new H();
            q71.X0();
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "rendering_system":
                        h.d = q71.e0();
                        break;
                    case "identifier":
                        h.g = q71.e0();
                        break;
                    case "height":
                        h.j = q71.u0();
                        break;
                    case "x":
                        h.k = q71.u0();
                        break;
                    case "y":
                        h.l = q71.u0();
                        break;
                    case "tag":
                        h.h = q71.e0();
                        break;
                    case "type":
                        h.e = q71.e0();
                        break;
                    case "alpha":
                        h.n = q71.u0();
                        break;
                    case "width":
                        h.i = q71.u0();
                        break;
                    case "children":
                        h.o = q71.q0(iLogger, this);
                        break;
                    case "visibility":
                        h.m = q71.e0();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        q71.Q(iLogger, map, strX0);
                        break;
                }
            }
            q71.B0();
            h.p = map;
            return h;
        }
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("rendering_system");
            c6319rH0.j(this.d);
        }
        if (this.e != null) {
            c6319rH0.c("type");
            c6319rH0.j(this.e);
        }
        if (this.g != null) {
            c6319rH0.c("identifier");
            c6319rH0.j(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("tag");
            c6319rH0.j(this.h);
        }
        if (this.i != null) {
            c6319rH0.c("width");
            c6319rH0.i(this.i);
        }
        if (this.j != null) {
            c6319rH0.c("height");
            c6319rH0.i(this.j);
        }
        if (this.k != null) {
            c6319rH0.c("x");
            c6319rH0.i(this.k);
        }
        if (this.l != null) {
            c6319rH0.c("y");
            c6319rH0.i(this.l);
        }
        if (this.m != null) {
            c6319rH0.c("visibility");
            c6319rH0.j(this.m);
        }
        if (this.n != null) {
            c6319rH0.c("alpha");
            c6319rH0.i(this.n);
        }
        List<H> list = this.o;
        if (list != null && !list.isEmpty()) {
            c6319rH0.c("children");
            c6319rH0.g(iLogger, this.o);
        }
        HashMap map = this.p;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.p, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

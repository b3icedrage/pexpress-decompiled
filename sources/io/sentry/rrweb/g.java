package io.sentry.rrweb;

import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.p;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends b implements BH0 {

    @NotNull
    public String g;
    public int h;
    public int i;

    @Nullable
    public HashMap j;

    public static final class a implements KG0<g> {
        @NotNull
        public static g b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            g gVar = new g();
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("data")) {
                    q71.X0();
                    AbstractMap concurrentHashMap = null;
                    while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strX1 = q71.x0();
                        strX1.getClass();
                        switch (strX1) {
                            case "height":
                                Integer numK = q71.K();
                                gVar.h = numK == null ? 0 : numK.intValue();
                                break;
                            case "href":
                                String strE0 = q71.e0();
                                if (strE0 == null) {
                                    strE0 = "";
                                }
                                gVar.g = strE0;
                                break;
                            case "width":
                                Integer numK2 = q71.K();
                                gVar.i = numK2 == null ? 0 : numK2.intValue();
                                break;
                            default:
                                if (concurrentHashMap == null) {
                                    concurrentHashMap = new ConcurrentHashMap();
                                }
                                q71.Q(iLogger, concurrentHashMap, strX1);
                                break;
                        }
                    }
                    q71.B0();
                } else if (strX0.equals("type")) {
                    c cVar = (c) q71.H(iLogger, new c.a());
                    p.b(cVar, "");
                    gVar.d = cVar;
                } else if (strX0.equals("timestamp")) {
                    gVar.e = q71.a1();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            gVar.j = map;
            q71.B0();
            return gVar;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ g a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    public g() {
        super(c.Meta);
        this.g = "";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        return this.h == gVar.h && this.i == gVar.i && p.a(this.g, gVar.g);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i)});
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
        c6319rH0.c("href");
        c6319rH0.j(this.g);
        c6319rH0.c("height");
        c6319rH0.f(this.h);
        c6319rH0.c("width");
        c6319rH0.f(this.i);
        HashMap map = this.j;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.j, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
        c6319rH0.b();
    }
}

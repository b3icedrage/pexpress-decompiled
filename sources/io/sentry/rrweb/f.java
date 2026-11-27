package io.sentry.rrweb;

import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.p;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d implements BH0 {
    public int h;

    @Nullable
    public List<b> i;

    @Nullable
    public HashMap j;

    @Nullable
    public HashMap k;

    public static final class a implements KG0<f> {
        @NotNull
        public static f b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            f fVar = new f();
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("data")) {
                    q71.X0();
                    HashMap map2 = null;
                    while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strX1 = q71.x0();
                        strX1.getClass();
                        if (strX1.equals("pointerId")) {
                            fVar.h = q71.E0();
                        } else if (strX1.equals("positions")) {
                            fVar.i = q71.q0(iLogger, new b.a());
                        } else if (strX1.equals(Payload.SOURCE)) {
                            d.a aVar = (d.a) q71.H(iLogger, new d.a.C0402a());
                            p.b(aVar, "");
                            fVar.g = aVar;
                        } else {
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            q71.Q(iLogger, map2, strX1);
                        }
                    }
                    fVar.k = map2;
                    q71.B0();
                } else if (strX0.equals("type")) {
                    c cVar = (c) q71.H(iLogger, new c.a());
                    p.b(cVar, "");
                    fVar.d = cVar;
                } else if (strX0.equals("timestamp")) {
                    fVar.e = q71.a1();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            fVar.j = map;
            q71.B0();
            return fVar;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ f a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    public static final class b implements BH0 {
        public int d;
        public float e;
        public float g;
        public long h;

        @Nullable
        public HashMap i;

        public static final class a implements KG0<b> {
            @Override // defpackage.KG0
            @NotNull
            public final b a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
                q71.X0();
                b bVar = new b();
                HashMap map = null;
                while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strX0 = q71.x0();
                    strX0.getClass();
                    switch (strX0) {
                        case "x":
                            bVar.e = q71.c0();
                            break;
                        case "y":
                            bVar.g = q71.c0();
                            break;
                        case "id":
                            bVar.d = q71.E0();
                            break;
                        case "timeOffset":
                            bVar.h = q71.a1();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            q71.Q(iLogger, map, strX0);
                            break;
                    }
                }
                bVar.i = map;
                q71.B0();
                return bVar;
            }
        }

        @Override // defpackage.BH0
        public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
            C6319rH0 c6319rH0 = (C6319rH0) w71;
            c6319rH0.a();
            c6319rH0.c("id");
            c6319rH0.f(this.d);
            c6319rH0.c("x");
            c6319rH0.e(this.e);
            c6319rH0.c("y");
            c6319rH0.e(this.g);
            c6319rH0.c("timeOffset");
            c6319rH0.f(this.h);
            HashMap map = this.i;
            if (map != null) {
                for (String str : map.keySet()) {
                    C6495s7.e(this.i, str, c6319rH0, str, iLogger);
                }
            }
            c6319rH0.b();
        }
    }

    public f() {
        super(d.a.TouchMove);
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
        c6319rH0.c(Payload.SOURCE);
        c6319rH0.g(iLogger, this.g);
        List<b> list = this.i;
        if (list != null && !list.isEmpty()) {
            c6319rH0.c("positions");
            c6319rH0.g(iLogger, this.i);
        }
        c6319rH0.c("pointerId");
        c6319rH0.f(this.h);
        HashMap map = this.k;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.k, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
        HashMap map2 = this.j;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                C6495s7.e(this.j, str2, c6319rH0, str2, iLogger);
            }
        }
        c6319rH0.b();
    }
}

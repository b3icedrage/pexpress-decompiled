package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.C4529c;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String g;

    @Nullable
    public Boolean h;

    @Nullable
    public AbstractMap i;

    @Nullable
    public ConcurrentHashMap j;

    @Nullable
    public Boolean k;

    @Nullable
    public Integer l;

    @Nullable
    public Integer m;

    @Nullable
    public Boolean n;

    @Nullable
    public HashMap o;

    public static final class a implements KG0<l> {
        @Override // defpackage.KG0
        @NotNull
        public final l a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            l lVar = new l();
            q71.X0();
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "description":
                        lVar.e = q71.e0();
                        break;
                    case "exception_id":
                        lVar.l = q71.K();
                        break;
                    case "data":
                        lVar.j = C4529c.a((Map) q71.W0());
                        break;
                    case "meta":
                        lVar.i = C4529c.a((Map) q71.W0());
                        break;
                    case "type":
                        lVar.d = q71.e0();
                        break;
                    case "handled":
                        lVar.h = q71.H0();
                        break;
                    case "synthetic":
                        lVar.k = q71.H0();
                        break;
                    case "is_exception_group":
                        lVar.n = q71.H0();
                        break;
                    case "help_link":
                        lVar.g = q71.e0();
                        break;
                    case "parent_id":
                        lVar.m = q71.K();
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
            lVar.o = map;
            return lVar;
        }
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("type");
            c6319rH0.j(this.d);
        }
        if (this.e != null) {
            c6319rH0.c("description");
            c6319rH0.j(this.e);
        }
        if (this.g != null) {
            c6319rH0.c("help_link");
            c6319rH0.j(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("handled");
            c6319rH0.h(this.h);
        }
        if (this.i != null) {
            c6319rH0.c("meta");
            c6319rH0.g(iLogger, this.i);
        }
        if (this.j != null) {
            c6319rH0.c("data");
            c6319rH0.g(iLogger, this.j);
        }
        if (this.k != null) {
            c6319rH0.c("synthetic");
            c6319rH0.h(this.k);
        }
        if (this.l != null) {
            c6319rH0.c("exception_id");
            c6319rH0.g(iLogger, this.l);
        }
        if (this.m != null) {
            c6319rH0.c("parent_id");
            c6319rH0.g(iLogger, this.m);
        }
        if (this.n != null) {
            c6319rH0.c("is_exception_group");
            c6319rH0.h(this.n);
        }
        HashMap map = this.o;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.o, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

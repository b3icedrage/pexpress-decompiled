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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d implements BH0 {

    @Nullable
    public b h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;

    @Nullable
    public HashMap n;

    @Nullable
    public HashMap o;

    public static final class a implements KG0<e> {
        @NotNull
        public static e b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            e eVar = new e();
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
                        switch (strX1) {
                            case "x":
                                eVar.j = q71.c0();
                                break;
                            case "y":
                                eVar.k = q71.c0();
                                break;
                            case "id":
                                eVar.i = q71.E0();
                                break;
                            case "type":
                                eVar.h = (b) q71.H(iLogger, new b.a());
                                break;
                            case "pointerType":
                                eVar.l = q71.E0();
                                break;
                            case "pointerId":
                                eVar.m = q71.E0();
                                break;
                            default:
                                if (!strX1.equals(Payload.SOURCE)) {
                                    if (map2 == null) {
                                        map2 = new HashMap();
                                    }
                                    q71.Q(iLogger, map2, strX1);
                                    break;
                                } else {
                                    d.a aVar = (d.a) q71.H(iLogger, new d.a.C0402a());
                                    p.b(aVar, "");
                                    eVar.g = aVar;
                                    break;
                                }
                                break;
                        }
                    }
                    eVar.o = map2;
                    q71.B0();
                } else if (strX0.equals("type")) {
                    c cVar = (c) q71.H(iLogger, new c.a());
                    p.b(cVar, "");
                    eVar.d = cVar;
                } else if (strX0.equals("timestamp")) {
                    eVar.e = q71.a1();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            eVar.n = map;
            q71.B0();
            return eVar;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ e a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    public enum b implements BH0 {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        public static final class a implements KG0<b> {
            @Override // defpackage.KG0
            @NotNull
            public final b a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
                return b.values()[q71.E0()];
            }
        }

        @Override // defpackage.BH0
        public void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
            ((C6319rH0) w71).f(ordinal());
        }
    }

    public e() {
        super(d.a.MouseInteraction);
        this.l = 2;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
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
        c6319rH0.c("type");
        c6319rH0.g(iLogger, this.h);
        c6319rH0.c("id");
        c6319rH0.f(this.i);
        c6319rH0.c("x");
        c6319rH0.e(this.j);
        c6319rH0.c("y");
        c6319rH0.e(this.k);
        c6319rH0.c("pointerType");
        c6319rH0.f(this.l);
        c6319rH0.c("pointerId");
        c6319rH0.f(this.m);
        HashMap map = this.o;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.o, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
        HashMap map2 = this.n;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                C6495s7.e(this.n, str2, c6319rH0, str2, iLogger);
            }
        }
        c6319rH0.b();
    }
}

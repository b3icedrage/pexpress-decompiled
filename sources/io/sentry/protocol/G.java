package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements BH0 {

    @Nullable
    public final String d;

    @Nullable
    public final List<H> e;

    @Nullable
    public HashMap g;

    public static final class a implements KG0<G> {
        @Override // defpackage.KG0
        @NotNull
        public final G a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            String strE0 = null;
            ArrayList arrayListQ0 = null;
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("rendering_system")) {
                    strE0 = q71.e0();
                } else if (strX0.equals("windows")) {
                    arrayListQ0 = q71.q0(iLogger, new H.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            q71.B0();
            G g = new G(strE0, arrayListQ0);
            g.g = map;
            return g;
        }
    }

    public G(@Nullable String str, @Nullable List<H> list) {
        this.d = str;
        this.e = list;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        String str = this.d;
        if (str != null) {
            c6319rH0.c("rendering_system");
            c6319rH0.j(str);
        }
        List<H> list = this.e;
        if (list != null) {
            c6319rH0.c("windows");
            c6319rH0.g(iLogger, list);
        }
        HashMap map = this.g;
        if (map != null) {
            for (String str2 : map.keySet()) {
                C6495s7.e(this.g, str2, c6319rH0, str2, iLogger);
            }
        }
        c6319rH0.b();
    }
}

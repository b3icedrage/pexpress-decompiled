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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public Integer e;

    @Nullable
    public Integer g;

    @Nullable
    public Integer h;

    @Nullable
    public HashMap i;

    public static final class a implements KG0<q> {
        @Override // defpackage.KG0
        @NotNull
        public final q a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q qVar = new q();
            q71.X0();
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "sdk_name":
                        qVar.d = q71.e0();
                        break;
                    case "version_patchlevel":
                        qVar.h = q71.K();
                        break;
                    case "version_major":
                        qVar.e = q71.K();
                        break;
                    case "version_minor":
                        qVar.g = q71.K();
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
            qVar.i = map;
            return qVar;
        }
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("sdk_name");
            c6319rH0.j(this.d);
        }
        if (this.e != null) {
            c6319rH0.c("version_major");
            c6319rH0.i(this.e);
        }
        if (this.g != null) {
            c6319rH0.c("version_minor");
            c6319rH0.i(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("version_patchlevel");
            c6319rH0.i(this.h);
        }
        HashMap map = this.i;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.i, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
public final class s implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String g;

    @Nullable
    public Long h;

    @Nullable
    public z i;

    @Nullable
    public l j;

    @Nullable
    public HashMap k;

    public static final class a implements KG0<s> {
        @Override // defpackage.KG0
        @NotNull
        public final s a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            s sVar = new s();
            q71.X0();
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "thread_id":
                        sVar.h = q71.R();
                        break;
                    case "module":
                        sVar.g = q71.e0();
                        break;
                    case "type":
                        sVar.d = q71.e0();
                        break;
                    case "value":
                        sVar.e = q71.e0();
                        break;
                    case "mechanism":
                        sVar.j = (l) q71.H(iLogger, new l.a());
                        break;
                    case "stacktrace":
                        sVar.i = (z) q71.H(iLogger, new z.a());
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
            sVar.k = map;
            return sVar;
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
            c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            c6319rH0.j(this.e);
        }
        if (this.g != null) {
            c6319rH0.c("module");
            c6319rH0.j(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("thread_id");
            c6319rH0.i(this.h);
        }
        if (this.i != null) {
            c6319rH0.c("stacktrace");
            c6319rH0.g(iLogger, this.i);
        }
        if (this.j != null) {
            c6319rH0.c("mechanism");
            c6319rH0.g(iLogger, this.j);
        }
        HashMap map = this.k;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.k, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

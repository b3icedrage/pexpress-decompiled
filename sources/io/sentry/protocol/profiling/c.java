package io.sentry.protocol.profiling;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements BH0 {

    @Nullable
    public String d;
    public int e;

    @Nullable
    public HashMap g;

    public static final class a implements KG0<c> {
        @Override // defpackage.KG0
        @NotNull
        public final c a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            c cVar = new c();
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("priority")) {
                    cVar.e = q71.E0();
                } else if (strX0.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                    cVar.d = q71.e0();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            cVar.g = map;
            q71.B0();
            return cVar;
        }
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c6319rH0.g(iLogger, this.d);
        }
        c6319rH0.c("priority");
        c6319rH0.g(iLogger, Integer.valueOf(this.e));
        HashMap map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.g, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

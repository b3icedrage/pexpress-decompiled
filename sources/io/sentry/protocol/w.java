package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String g;

    @Nullable
    public ConcurrentHashMap h;

    public static final class a implements KG0<w> {
        @Override // defpackage.KG0
        @NotNull
        public final w a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            w wVar = new w();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "raw_description":
                        wVar.g = q71.e0();
                        break;
                    case "name":
                        wVar.d = q71.e0();
                        break;
                    case "version":
                        wVar.e = q71.e0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            wVar.h = concurrentHashMap;
            q71.B0();
            return wVar;
        }
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c6319rH0.j(this.d);
        }
        if (this.e != null) {
            c6319rH0.c("version");
            c6319rH0.j(this.e);
        }
        if (this.g != null) {
            c6319rH0.c("raw_description");
            c6319rH0.j(this.g);
        }
        ConcurrentHashMap concurrentHashMap = this.h;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.h, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

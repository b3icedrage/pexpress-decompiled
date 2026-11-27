package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.NG1;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements BH0 {

    @NotNull
    public final Number d;

    @Nullable
    public final String e;

    @Nullable
    public ConcurrentHashMap g;

    public static final class a implements KG0<k> {
        @Override // defpackage.KG0
        @NotNull
        public final k a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            Number number = null;
            String strE0 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("unit")) {
                    strE0 = q71.e0();
                } else if (strX0.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    number = (Number) q71.W0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    q71.Q(iLogger, concurrentHashMap, strX0);
                }
            }
            q71.B0();
            if (number != null) {
                k kVar = new k(number, strE0);
                kVar.g = concurrentHashMap;
                return kVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.d(NG1.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public k(@NotNull Number number, @Nullable String str) {
        this.d = number;
        this.e = str;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c6319rH0.i(this.d);
        String str = this.e;
        if (str != null) {
            c6319rH0.c("unit");
            c6319rH0.j(str);
        }
        ConcurrentHashMap concurrentHashMap = this.g;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                C4564j.h(this.g, str2, c6319rH0, str2, iLogger);
            }
        }
        c6319rH0.b();
    }
}

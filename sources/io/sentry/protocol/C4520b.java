package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.protocol.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4520b implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public ConcurrentHashMap g;

    /* JADX INFO: renamed from: io.sentry.protocol.b$a */
    public static final class a implements KG0<C4520b> {
        @Override // defpackage.KG0
        @NotNull
        public final C4520b a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            C4520b c4520b = new C4520b();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                    c4520b.d = q71.e0();
                } else if (strX0.equals("version")) {
                    c4520b.e = q71.e0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    q71.Q(iLogger, concurrentHashMap, strX0);
                }
            }
            c4520b.g = concurrentHashMap;
            q71.B0();
            return c4520b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4520b.class == obj.getClass()) {
            C4520b c4520b = (C4520b) obj;
            if (io.sentry.util.p.a(this.d, c4520b.d) && io.sentry.util.p.a(this.e, c4520b.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e});
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
        ConcurrentHashMap concurrentHashMap = this.g;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.g, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

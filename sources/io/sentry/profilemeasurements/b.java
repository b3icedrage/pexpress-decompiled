package io.sentry.profilemeasurements;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.p;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements BH0 {

    @Nullable
    public ConcurrentHashMap d;
    public double e;

    @NotNull
    public String g;
    public double h;

    public static final class a implements KG0<b> {
        @Override // defpackage.KG0
        @NotNull
        public final b a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            Double dValueOf;
            q71.X0();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "elapsed_since_start_ns":
                        String strE0 = q71.e0();
                        if (strE0 == null) {
                            break;
                        } else {
                            bVar.g = strE0;
                            break;
                        }
                        break;
                    case "timestamp":
                        try {
                            dValueOf = q71.u0();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateD0 = q71.D0(iLogger);
                            dValueOf = dateD0 != null ? Double.valueOf(dateD0.getTime() / 1000.0d) : null;
                        }
                        if (dValueOf == null) {
                            break;
                        } else {
                            bVar.e = dValueOf.doubleValue();
                            break;
                        }
                        break;
                    case "value":
                        Double dU0 = q71.u0();
                        if (dU0 == null) {
                            break;
                        } else {
                            bVar.h = dU0.doubleValue();
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            bVar.d = concurrentHashMap;
            q71.B0();
            return bVar;
        }
    }

    public b() {
        this(0L, 0, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return p.a(this.d, bVar.d) && this.g.equals(bVar.g) && this.h == bVar.h && this.e == bVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.g, Double.valueOf(this.h)});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c6319rH0.g(iLogger, Double.valueOf(this.h));
        c6319rH0.c("elapsed_since_start_ns");
        c6319rH0.g(iLogger, this.g);
        c6319rH0.c("timestamp");
        c6319rH0.g(iLogger, BigDecimal.valueOf(this.e).setScale(6, RoundingMode.DOWN));
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.d, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public b(@NotNull Long l, @NotNull Number number, long j) {
        this.g = l.toString();
        this.h = number.doubleValue();
        this.e = j / 1.0E9d;
    }
}

package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.NG1;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.HashMap;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements BH0 {

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    @Nullable
    public HashMap g;

    public static final class a implements KG0<v> {
        @Override // defpackage.KG0
        @NotNull
        public final v a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            String strB = null;
            String strB2 = null;
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                    strB = q71.B();
                } else if (strX0.equals("version")) {
                    strB2 = q71.B();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            q71.B0();
            if (strB == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.d(NG1.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strB2 != null) {
                v vVar = new v(strB, strB2);
                vVar.g = map;
                return vVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            iLogger.d(NG1.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public v(@NotNull String str, @NotNull String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (Objects.equals(this.d, vVar.d) && Objects.equals(this.e, vVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.e);
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
        c6319rH0.j(this.d);
        c6319rH0.c("version");
        c6319rH0.j(this.e);
        HashMap map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.g, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

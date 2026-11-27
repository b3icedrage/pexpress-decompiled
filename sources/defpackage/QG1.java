package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.b;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class QG1 implements BH0 {

    @NotNull
    public final String d;

    @Nullable
    public final Object e;

    @Nullable
    public HashMap g;

    public static final class a implements KG0<QG1> {
        @Override // defpackage.KG0
        @NotNull
        public final QG1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            String strE0 = null;
            Object objW0 = null;
            HashMap map = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("type")) {
                    strE0 = q71.e0();
                } else if (strX0.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    objW0 = q71.W0();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            q71.B0();
            if (strE0 != null) {
                QG1 qg1 = new QG1(strE0, objW0);
                qg1.g = map;
                return qg1;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
            iLogger.d(NG1.ERROR, "Missing required field \"type\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public QG1(@NotNull String str, @Nullable Object obj) {
        this.d = str;
        if (obj == null || !str.equals("string")) {
            this.e = obj;
        } else {
            this.e = obj.toString();
        }
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("type");
        c6319rH0.g(iLogger, this.d);
        c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c6319rH0.g(iLogger, this.e);
        HashMap map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.g, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public QG1(@NotNull TF1 tf1, @Nullable Object obj) {
        this(tf1.apiName(), obj);
    }
}

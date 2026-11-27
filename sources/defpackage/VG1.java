package defpackage;

import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class VG1 implements BH0 {

    @NotNull
    public final List<UG1> d;

    @Nullable
    public HashMap e;

    public static final class a implements KG0<VG1> {
        @Override // defpackage.KG0
        @NotNull
        public final VG1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            ArrayList arrayListQ0 = null;
            HashMap map = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("items")) {
                    arrayListQ0 = q71.q0(iLogger, new UG1.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            q71.B0();
            if (arrayListQ0 != null) {
                VG1 vg1 = new VG1(arrayListQ0);
                vg1.e = map;
                return vg1;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"items\"");
            iLogger.d(NG1.ERROR, "Missing required field \"items\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public VG1(@NotNull List<UG1> list) {
        this.d = list;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("items");
        c6319rH0.g(iLogger, this.d);
        HashMap map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.e, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

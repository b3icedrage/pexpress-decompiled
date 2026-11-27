package io.sentry.protocol.profiling;

import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements BH0 {
    public double d;
    public int e;

    @Nullable
    public String g;

    @Nullable
    public HashMap h;

    public static final class a implements KG0<b> {
        @Override // defpackage.KG0
        @NotNull
        public final b a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            b bVar = new b();
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "thread_id":
                        bVar.g = q71.e0();
                        break;
                    case "timestamp":
                        bVar.d = q71.d0();
                        break;
                    case "stack_id":
                        bVar.e = q71.E0();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        q71.Q(iLogger, map, strX0);
                        break;
                }
            }
            bVar.h = map;
            q71.B0();
            return bVar;
        }
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("timestamp");
        c6319rH0.g(iLogger, BigDecimal.valueOf(this.d).setScale(6, RoundingMode.DOWN));
        c6319rH0.c("stack_id");
        c6319rH0.g(iLogger, Integer.valueOf(this.e));
        if (this.g != null) {
            c6319rH0.c("thread_id");
            c6319rH0.g(iLogger, this.g);
        }
        HashMap map = this.h;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.h, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

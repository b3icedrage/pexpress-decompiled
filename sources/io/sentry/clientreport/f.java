package io.sentry.clientreport;

import defpackage.BH0;
import defpackage.C1039Gc0;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.NG1;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.io.IOException;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements BH0 {

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    @NotNull
    public final Long g;

    @Nullable
    public HashMap h;

    public static final class a implements KG0<f> {
        public static IllegalStateException b(String str, ILogger iLogger) {
            String strD = C1039Gc0.d("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strD);
            iLogger.d(NG1.ERROR, strD, illegalStateException);
            return illegalStateException;
        }

        @Override // defpackage.KG0
        @NotNull
        public final f a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            String strE0 = null;
            String strE1 = null;
            Long lR = null;
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "quantity":
                        lR = q71.R();
                        break;
                    case "reason":
                        strE0 = q71.e0();
                        break;
                    case "category":
                        strE1 = q71.e0();
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
            if (strE0 == null) {
                throw b("reason", iLogger);
            }
            if (strE1 == null) {
                throw b("category", iLogger);
            }
            if (lR == null) {
                throw b("quantity", iLogger);
            }
            f fVar = new f(strE0, strE1, lR);
            fVar.h = map;
            return fVar;
        }
    }

    public f(@NotNull String str, @NotNull String str2, @NotNull Long l) {
        this.d = str;
        this.e = str2;
        this.g = l;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("reason");
        c6319rH0.j(this.d);
        c6319rH0.c("category");
        c6319rH0.j(this.e);
        c6319rH0.c("quantity");
        c6319rH0.i(this.g);
        HashMap map = this.h;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.h, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.d + "', category='" + this.e + "', quantity=" + this.g + '}';
    }
}

package io.sentry.clientreport;

import defpackage.BH0;
import defpackage.C1039Gc0;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.N7;
import defpackage.NG1;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements BH0 {

    @NotNull
    public final Date d;

    @NotNull
    public final ArrayList e;

    @Nullable
    public HashMap g;

    public static final class a implements KG0<b> {
        public static IllegalStateException b(String str, ILogger iLogger) {
            String strD = C1039Gc0.d("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strD);
            iLogger.d(NG1.ERROR, strD, illegalStateException);
            return illegalStateException;
        }

        @Override // defpackage.KG0
        @NotNull
        public final b a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            q71.X0();
            Date dateD0 = null;
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("discarded_events")) {
                    arrayList.addAll(q71.q0(iLogger, new f.a()));
                } else if (strX0.equals("timestamp")) {
                    dateD0 = q71.D0(iLogger);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            q71.B0();
            if (dateD0 == null) {
                throw b("timestamp", iLogger);
            }
            if (arrayList.isEmpty()) {
                throw b("discarded_events", iLogger);
            }
            b bVar = new b(dateD0, arrayList);
            bVar.g = map;
            return bVar;
        }
    }

    public b(@NotNull Date date, @NotNull ArrayList arrayList) {
        this.d = date;
        this.e = arrayList;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("timestamp");
        c6319rH0.j(N7.q(this.d));
        c6319rH0.c("discarded_events");
        c6319rH0.g(iLogger, this.e);
        HashMap map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.g, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

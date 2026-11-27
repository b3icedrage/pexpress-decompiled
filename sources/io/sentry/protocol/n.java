package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String g;

    @Nullable
    public String h;

    @Nullable
    public String i;

    @Nullable
    public Boolean j;

    @Nullable
    public ConcurrentHashMap k;

    public static final class a implements KG0<n> {
        @NotNull
        public static n b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            n nVar = new n();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "rooted":
                        nVar.j = q71.H0();
                        break;
                    case "raw_description":
                        nVar.g = q71.e0();
                        break;
                    case "name":
                        nVar.d = q71.e0();
                        break;
                    case "build":
                        nVar.h = q71.e0();
                        break;
                    case "version":
                        nVar.e = q71.e0();
                        break;
                    case "kernel_version":
                        nVar.i = q71.e0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            nVar.k = concurrentHashMap;
            q71.B0();
            return nVar;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ n a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (io.sentry.util.p.a(this.d, nVar.d) && io.sentry.util.p.a(this.e, nVar.e) && io.sentry.util.p.a(this.g, nVar.g) && io.sentry.util.p.a(this.h, nVar.h) && io.sentry.util.p.a(this.i, nVar.i) && io.sentry.util.p.a(this.j, nVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.g, this.h, this.i, this.j});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
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
        if (this.h != null) {
            c6319rH0.c("build");
            c6319rH0.j(this.h);
        }
        if (this.i != null) {
            c6319rH0.c("kernel_version");
            c6319rH0.j(this.i);
        }
        if (this.j != null) {
            c6319rH0.c("rooted");
            c6319rH0.h(this.j);
        }
        ConcurrentHashMap concurrentHashMap = this.k;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.k, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

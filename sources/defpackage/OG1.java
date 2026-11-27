package defpackage;

import io.sentry.ILogger;
import io.sentry.util.p;
import io.sentry.vendor.gson.stream.b;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OG1 implements BH0 {
    public int d;

    @Nullable
    public String e;

    @Nullable
    public String g;

    @Nullable
    public String h;

    @Nullable
    public Long i;

    @Nullable
    public ConcurrentHashMap j;

    public static final class a implements KG0<OG1> {
        @Override // defpackage.KG0
        @NotNull
        public final OG1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            OG1 og1 = new OG1();
            q71.X0();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "package_name":
                        og1.g = q71.e0();
                        break;
                    case "thread_id":
                        og1.i = q71.R();
                        break;
                    case "address":
                        og1.e = q71.e0();
                        break;
                    case "class_name":
                        og1.h = q71.e0();
                        break;
                    case "type":
                        og1.d = q71.E0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            og1.j = concurrentHashMap;
            q71.B0();
            return og1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OG1.class != obj.getClass()) {
            return false;
        }
        return p.a(this.e, ((OG1) obj).e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("type");
        c6319rH0.f(this.d);
        if (this.e != null) {
            c6319rH0.c("address");
            c6319rH0.j(this.e);
        }
        if (this.g != null) {
            c6319rH0.c("package_name");
            c6319rH0.j(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("class_name");
            c6319rH0.j(this.h);
        }
        if (this.i != null) {
            c6319rH0.c("thread_id");
            c6319rH0.i(this.i);
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.j, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

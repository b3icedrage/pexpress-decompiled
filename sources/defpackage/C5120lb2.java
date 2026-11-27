package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.ILogger;
import io.sentry.protocol.u;
import io.sentry.vendor.gson.stream.b;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5120lb2 implements BH0 {
    public final u d;

    @Nullable
    public final String e;

    @Nullable
    public final String g;

    @Nullable
    public final String h;

    @Nullable
    public HashMap i;

    /* JADX INFO: renamed from: lb2$a */
    public static final class a implements KG0<C5120lb2> {
        @Override // defpackage.KG0
        @NotNull
        public final C5120lb2 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            u uVar = null;
            String strE0 = null;
            String strE1 = null;
            String strE2 = null;
            HashMap map = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "comments":
                        strE2 = q71.e0();
                        break;
                    case "name":
                        strE0 = q71.e0();
                        break;
                    case "email":
                        strE1 = q71.e0();
                        break;
                    case "event_id":
                        uVar = new u(q71.B());
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
            if (uVar != null) {
                C5120lb2 c5120lb2 = new C5120lb2(uVar, strE0, strE1, strE2);
                c5120lb2.i = map;
                return c5120lb2;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            iLogger.d(NG1.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C5120lb2(u uVar, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.d = uVar;
        this.e = str;
        this.g = str2;
        this.h = str3;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("event_id");
        this.d.serialize(c6319rH0, iLogger);
        String str = this.e;
        if (str != null) {
            c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c6319rH0.j(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            c6319rH0.c("email");
            c6319rH0.j(str2);
        }
        String str3 = this.h;
        if (str3 != null) {
            c6319rH0.c("comments");
            c6319rH0.j(str3);
        }
        HashMap map = this.i;
        if (map != null) {
            for (String str4 : map.keySet()) {
                C6495s7.e(this.i, str4, c6319rH0, str4, iLogger);
            }
        }
        c6319rH0.b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeedback{eventId=");
        sb.append(this.d);
        sb.append(", name='");
        sb.append(this.e);
        sb.append("', email='");
        sb.append(this.g);
        sb.append("', comments='");
        return C5807oq.b(sb, this.h, "'}");
    }
}

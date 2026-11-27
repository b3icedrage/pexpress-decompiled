package defpackage;

import io.sentry.ILogger;
import io.sentry.protocol.r;
import io.sentry.protocol.u;
import io.sentry.vendor.gson.stream.b;
import java.util.Date;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3747fG1 implements BH0 {

    @Nullable
    public final u d;

    @Nullable
    public final r e;

    @Nullable
    public final H02 g;

    @Nullable
    public Date h;

    @Nullable
    public HashMap i;

    /* JADX INFO: renamed from: fG1$a */
    public static final class a implements KG0<C3747fG1> {
        @Override // defpackage.KG0
        @NotNull
        public final C3747fG1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            u uVar = null;
            r rVar = null;
            H02 h02 = null;
            Date dateD0 = null;
            HashMap map = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "sdk":
                        rVar = (r) q71.H(iLogger, new r.a());
                        break;
                    case "trace":
                        h02 = (H02) q71.H(iLogger, new H02.a());
                        break;
                    case "event_id":
                        uVar = (u) q71.H(iLogger, new u.a());
                        break;
                    case "sent_at":
                        dateD0 = q71.D0(iLogger);
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        q71.Q(iLogger, map, strX0);
                        break;
                }
            }
            C3747fG1 c3747fG1 = new C3747fG1(uVar, rVar, h02);
            c3747fG1.h = dateD0;
            c3747fG1.i = map;
            q71.B0();
            return c3747fG1;
        }
    }

    public C3747fG1(@Nullable u uVar, @Nullable r rVar, @Nullable H02 h02) {
        this.d = uVar;
        this.e = rVar;
        this.g = h02;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        u uVar = this.d;
        if (uVar != null) {
            c6319rH0.c("event_id");
            c6319rH0.g(iLogger, uVar);
        }
        r rVar = this.e;
        if (rVar != null) {
            c6319rH0.c("sdk");
            c6319rH0.g(iLogger, rVar);
        }
        H02 h02 = this.g;
        if (h02 != null) {
            c6319rH0.c("trace");
            c6319rH0.g(iLogger, h02);
        }
        if (this.h != null) {
            c6319rH0.c("sent_at");
            c6319rH0.g(iLogger, N7.q(this.h));
        }
        HashMap map = this.i;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.i, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public C3747fG1() {
        this(new u(), null, null);
    }
}

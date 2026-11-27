package io.sentry.protocol;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.NG1;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.protocol.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4526h implements BH0 {

    @NotNull
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String g;

    @Nullable
    public u h;

    @Nullable
    public u i;

    @Nullable
    public String j;

    @Nullable
    public AbstractMap k;

    /* JADX INFO: renamed from: io.sentry.protocol.h$a */
    public static final class a implements KG0<C4526h> {
        @NotNull
        public static C4526h b(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            String strE0 = null;
            String strE1 = null;
            String strE2 = null;
            u uVar = null;
            u uVar2 = null;
            String strE3 = null;
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "associated_event_id":
                        uVar = new u(q71.B());
                        break;
                    case "replay_id":
                        uVar2 = new u(q71.B());
                        break;
                    case "url":
                        strE3 = q71.e0();
                        break;
                    case "name":
                        strE2 = q71.e0();
                        break;
                    case "contact_email":
                        strE1 = q71.e0();
                        break;
                    case "message":
                        strE0 = q71.e0();
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
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                iLogger.d(NG1.ERROR, "Missing required field \"message\"", illegalStateException);
                throw illegalStateException;
            }
            C4526h c4526h = new C4526h();
            if (strE0.length() > 4096) {
                c4526h.d = strE0.substring(0, 4096);
            } else {
                c4526h.d = strE0;
            }
            c4526h.e = strE1;
            c4526h.g = strE2;
            c4526h.h = uVar;
            c4526h.i = uVar2;
            c4526h.j = strE3;
            c4526h.k = map;
            return c4526h;
        }

        @Override // defpackage.KG0
        @NotNull
        public final /* bridge */ /* synthetic */ C4526h a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return b(q71, iLogger);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4526h)) {
            return false;
        }
        C4526h c4526h = (C4526h) obj;
        return io.sentry.util.p.a(this.d, c4526h.d) && io.sentry.util.p.a(this.e, c4526h.e) && io.sentry.util.p.a(this.g, c4526h.g) && io.sentry.util.p.a(this.h, c4526h.h) && io.sentry.util.p.a(this.i, c4526h.i) && io.sentry.util.p.a(this.j, c4526h.j) && io.sentry.util.p.a(this.k, c4526h.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.g, this.h, this.i, this.j, this.k});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("message");
        c6319rH0.j(this.d);
        if (this.e != null) {
            c6319rH0.c("contact_email");
            c6319rH0.j(this.e);
        }
        if (this.g != null) {
            c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c6319rH0.j(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("associated_event_id");
            this.h.serialize(c6319rH0, iLogger);
        }
        if (this.i != null) {
            c6319rH0.c("replay_id");
            this.i.serialize(c6319rH0, iLogger);
        }
        if (this.j != null) {
            c6319rH0.c(ImagesContract.URL);
            c6319rH0.j(this.j);
        }
        AbstractMap abstractMap = this.k;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.k.get(str);
                c6319rH0.c(str);
                c6319rH0.g(iLogger, obj);
            }
        }
        c6319rH0.b();
    }

    public final String toString() {
        return "Feedback{message='" + this.d + "', contactEmail='" + this.e + "', name='" + this.g + "', associatedEventId=" + this.h + ", replayId=" + this.i + ", url='" + this.j + "', unknown=" + this.k + '}';
    }
}

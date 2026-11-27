package defpackage;

import io.sentry.ILogger;
import io.sentry.protocol.u;
import io.sentry.util.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2912bH1 extends VF1 implements BH0 {

    @Nullable
    public HashMap D;

    @Nullable
    public File t;
    public int x;

    @Nullable
    public Date z;

    @Nullable
    public u w = new u();

    @NotNull
    public String u = "replay_event";

    @NotNull
    public b v = b.SESSION;

    @Nullable
    public List<String> B = new ArrayList();

    @Nullable
    public List<String> C = new ArrayList();

    @Nullable
    public List<String> A = new ArrayList();

    @NotNull
    public Date y = N7.h();

    /* JADX INFO: renamed from: bH1$a */
    public static final class a implements KG0<C2912bH1> {
        @Override // defpackage.KG0
        @NotNull
        public final C2912bH1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            C2912bH1 c2912bH1 = new C2912bH1();
            q71.X0();
            String strE0 = null;
            b bVar = null;
            Integer numK = null;
            Date dateD0 = null;
            HashMap map = null;
            u uVar = null;
            Date dateD1 = null;
            List<String> list = null;
            List<String> list2 = null;
            List<String> list3 = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "replay_id":
                        uVar = (u) q71.H(iLogger, new u.a());
                        break;
                    case "replay_start_timestamp":
                        dateD1 = q71.D0(iLogger);
                        break;
                    case "type":
                        strE0 = q71.e0();
                        break;
                    case "urls":
                        list = (List) q71.W0();
                        break;
                    case "timestamp":
                        dateD0 = q71.D0(iLogger);
                        break;
                    case "error_ids":
                        list2 = (List) q71.W0();
                        break;
                    case "trace_ids":
                        list3 = (List) q71.W0();
                        break;
                    case "replay_type":
                        bVar = (b) q71.H(iLogger, new b.a());
                        break;
                    case "segment_id":
                        numK = q71.K();
                        break;
                    default:
                        if (!VF1.a.a(c2912bH1, strX0, q71, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            q71.Q(iLogger, map, strX0);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            q71.B0();
            if (strE0 != null) {
                c2912bH1.u = strE0;
            }
            if (bVar != null) {
                c2912bH1.v = bVar;
            }
            if (numK != null) {
                c2912bH1.x = numK.intValue();
            }
            if (dateD0 != null) {
                c2912bH1.y = dateD0;
            }
            c2912bH1.w = uVar;
            c2912bH1.z = dateD1;
            c2912bH1.A = list;
            c2912bH1.B = list2;
            c2912bH1.C = list3;
            c2912bH1.D = map;
            return c2912bH1;
        }
    }

    /* JADX INFO: renamed from: bH1$b */
    public enum b implements BH0 {
        SESSION,
        BUFFER;

        /* JADX INFO: renamed from: bH1$b$a */
        public static final class a implements KG0<b> {
            @Override // defpackage.KG0
            @NotNull
            public final b a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
                return b.valueOf(q71.B().toUpperCase(Locale.ROOT));
            }
        }

        @Override // defpackage.BH0
        public void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
            ((C6319rH0) w71).j(name().toLowerCase(Locale.ROOT));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2912bH1.class == obj.getClass()) {
            C2912bH1 c2912bH1 = (C2912bH1) obj;
            if (this.x == c2912bH1.x && p.a(this.u, c2912bH1.u) && this.v == c2912bH1.v && p.a(this.w, c2912bH1.w) && p.a(this.A, c2912bH1.A) && p.a(this.B, c2912bH1.B) && p.a(this.C, c2912bH1.C)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.u, this.v, this.w, Integer.valueOf(this.x), this.A, this.B, this.C});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("type");
        c6319rH0.j(this.u);
        c6319rH0.c("replay_type");
        c6319rH0.g(iLogger, this.v);
        c6319rH0.c("segment_id");
        c6319rH0.f(this.x);
        c6319rH0.c("timestamp");
        c6319rH0.g(iLogger, this.y);
        if (this.w != null) {
            c6319rH0.c("replay_id");
            c6319rH0.g(iLogger, this.w);
        }
        if (this.z != null) {
            c6319rH0.c("replay_start_timestamp");
            c6319rH0.g(iLogger, this.z);
        }
        if (this.A != null) {
            c6319rH0.c("urls");
            c6319rH0.g(iLogger, this.A);
        }
        if (this.B != null) {
            c6319rH0.c("error_ids");
            c6319rH0.g(iLogger, this.B);
        }
        if (this.C != null) {
            c6319rH0.c("trace_ids");
            c6319rH0.g(iLogger, this.C);
        }
        VF1.b.a(this, c6319rH0, iLogger);
        HashMap map = this.D;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.D, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}

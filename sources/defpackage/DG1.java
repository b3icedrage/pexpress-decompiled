package defpackage;

import io.sentry.ILogger;
import io.sentry.util.p;
import io.sentry.vendor.gson.stream.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DG1 implements BH0 {

    @Nullable
    public final String d;

    @Nullable
    public final Integer e;

    @Nullable
    public final String g;

    @Nullable
    public final String h;

    @NotNull
    public final MG1 i;
    public final int j;

    @Nullable
    public final Callable<Integer> k;

    @Nullable
    public final String l;

    @Nullable
    public HashMap m;

    public static final class a implements KG0<DG1> {
        @Override // defpackage.KG0
        @NotNull
        public final DG1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            HashMap map = null;
            int iE0 = 0;
            MG1 mg1 = null;
            String strE0 = null;
            String strE1 = null;
            String strE2 = null;
            String strE3 = null;
            Integer numK = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "item_count":
                        numK = q71.K();
                        break;
                    case "length":
                        iE0 = q71.E0();
                        break;
                    case "filename":
                        strE1 = q71.e0();
                        break;
                    case "attachment_type":
                        strE2 = q71.e0();
                        break;
                    case "type":
                        mg1 = (MG1) q71.H(iLogger, new MG1.a());
                        break;
                    case "content_type":
                        strE0 = q71.e0();
                        break;
                    case "platform":
                        strE3 = q71.e0();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        q71.Q(iLogger, map, strX0);
                        break;
                }
            }
            if (mg1 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                iLogger.d(NG1.ERROR, "Missing required field \"type\"", illegalStateException);
                throw illegalStateException;
            }
            DG1 dg1 = new DG1(mg1, iE0, strE0, strE1, strE2, strE3, numK);
            dg1.m = map;
            q71.B0();
            return dg1;
        }
    }

    public DG1() {
        throw null;
    }

    public DG1(@NotNull MG1 mg1, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        this.i = mg1;
        this.d = str;
        this.j = i;
        this.g = str2;
        this.k = null;
        this.l = str3;
        this.h = str4;
        this.e = num;
    }

    public final int a() {
        Callable<Integer> callable = this.k;
        if (callable == null) {
            return this.j;
        }
        try {
            return callable.call().intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        String str = this.d;
        if (str != null) {
            c6319rH0.c("content_type");
            c6319rH0.j(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            c6319rH0.c("filename");
            c6319rH0.j(str2);
        }
        c6319rH0.c("type");
        c6319rH0.g(iLogger, this.i);
        String str3 = this.l;
        if (str3 != null) {
            c6319rH0.c("attachment_type");
            c6319rH0.j(str3);
        }
        String str4 = this.h;
        if (str4 != null) {
            c6319rH0.c("platform");
            c6319rH0.j(str4);
        }
        Integer num = this.e;
        if (num != null) {
            c6319rH0.c("item_count");
            c6319rH0.i(num);
        }
        c6319rH0.c("length");
        c6319rH0.f(a());
        HashMap map = this.m;
        if (map != null) {
            for (String str5 : map.keySet()) {
                C6495s7.e(this.m, str5, c6319rH0, str5, iLogger);
            }
        }
        c6319rH0.b();
    }

    public DG1(@NotNull MG1 mg1, @Nullable Callable<Integer> callable, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this(mg1, callable, str, str2, str3, (String) null, (Integer) null);
    }

    public DG1(@NotNull MG1 mg1, @Nullable Callable<Integer> callable, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        p.b(mg1, "type is required");
        this.i = mg1;
        this.d = str;
        this.j = -1;
        this.g = str2;
        this.k = callable;
        this.l = str3;
        this.h = str4;
        this.e = num;
    }
}

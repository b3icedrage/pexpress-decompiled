package defpackage;

import com.appsflyer.sdk_base.BuildConfig;
import io.sentry.ILogger;
import io.sentry.protocol.u;
import io.sentry.vendor.gson.stream.b;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class H02 implements BH0 {

    @NotNull
    public final u d;

    @NotNull
    public final String e;

    @Nullable
    public final String g;

    @Nullable
    public final String h;

    @Nullable
    public final String i;

    @Nullable
    public final String j;

    @Nullable
    public final String k;

    @Nullable
    public final String l;

    @Nullable
    public final String m;

    @Nullable
    public final u n;

    @Nullable
    public ConcurrentHashMap o;

    public static final class a implements KG0<H02> {
        public static IllegalStateException b(String str, ILogger iLogger) {
            String strD = C1039Gc0.d("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strD);
            iLogger.d(NG1.ERROR, strD, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        @Override // defpackage.KG0
        @NotNull
        public final H02 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            ConcurrentHashMap concurrentHashMap = null;
            u uVar = null;
            String strB = null;
            String strE0 = null;
            String strE1 = null;
            String strE2 = null;
            String strE3 = null;
            String strE4 = null;
            String strE5 = null;
            u uVar2 = null;
            String strE6 = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "replay_id":
                        uVar2 = new u(q71.B());
                        break;
                    case "user_id":
                        strE2 = q71.e0();
                        break;
                    case "environment":
                        strE1 = q71.e0();
                        break;
                    case "sample_rand":
                        strE6 = q71.e0();
                        break;
                    case "sample_rate":
                        strE4 = q71.e0();
                        break;
                    case "release":
                        strE0 = q71.e0();
                        break;
                    case "trace_id":
                        uVar = new u(q71.B());
                        break;
                    case "sampled":
                        strE5 = q71.e0();
                        break;
                    case "public_key":
                        strB = q71.B();
                        break;
                    case "transaction":
                        strE3 = q71.e0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            if (uVar == null) {
                throw b("trace_id", iLogger);
            }
            if (strB == null) {
                throw b("public_key", iLogger);
            }
            H02 h02 = new H02(uVar, strB, strE0, strE1, strE2, strE3, strE4, strE5, uVar2, strE6);
            h02.o = concurrentHashMap;
            q71.B0();
            return h02;
        }
    }

    public H02(@NotNull u uVar, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable u uVar2, @Nullable String str8) {
        this.d = uVar;
        this.e = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.m = str7;
        this.n = uVar2;
        this.l = str8;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("trace_id");
        c6319rH0.g(iLogger, this.d);
        c6319rH0.c("public_key");
        c6319rH0.j(this.e);
        String str = this.g;
        if (str != null) {
            c6319rH0.c(BuildConfig.BUILD_TYPE);
            c6319rH0.j(str);
        }
        String str2 = this.h;
        if (str2 != null) {
            c6319rH0.c("environment");
            c6319rH0.j(str2);
        }
        String str3 = this.i;
        if (str3 != null) {
            c6319rH0.c("user_id");
            c6319rH0.j(str3);
        }
        String str4 = this.j;
        if (str4 != null) {
            c6319rH0.c("transaction");
            c6319rH0.j(str4);
        }
        String str5 = this.k;
        if (str5 != null) {
            c6319rH0.c("sample_rate");
            c6319rH0.j(str5);
        }
        String str6 = this.l;
        if (str6 != null) {
            c6319rH0.c("sample_rand");
            c6319rH0.j(str6);
        }
        String str7 = this.m;
        if (str7 != null) {
            c6319rH0.c("sampled");
            c6319rH0.j(str7);
        }
        u uVar = this.n;
        if (uVar != null) {
            c6319rH0.c("replay_id");
            c6319rH0.g(iLogger, uVar);
        }
        ConcurrentHashMap concurrentHashMap = this.o;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                C4564j.h(this.o, str8, c6319rH0, str8, iLogger);
            }
        }
        c6319rH0.b();
    }
}

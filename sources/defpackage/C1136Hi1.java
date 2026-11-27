package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import io.sentry.ILogger;
import io.sentry.protocol.u;
import io.sentry.vendor.gson.stream.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1136Hi1 implements BH0 {

    @NotNull
    public String A;

    @NotNull
    public String B;

    @NotNull
    public String C;

    @NotNull
    public Date D;

    @NotNull
    public final HashMap E;

    @Nullable
    public String F;

    @Nullable
    public ConcurrentHashMap G;

    @NotNull
    public final File d;

    @NotNull
    public final Callable<List<Integer>> e;
    public int g;

    @NotNull
    public String h;

    @NotNull
    public String i;

    @NotNull
    public String j;

    @NotNull
    public String k;

    @NotNull
    public String l;

    @NotNull
    public String m;
    public boolean n;

    @NotNull
    public String o;

    @NotNull
    public List<Integer> p;

    @NotNull
    public String q;

    @NotNull
    public String r;

    @NotNull
    public String s;

    @NotNull
    public final ArrayList t;

    @NotNull
    public String u;

    @NotNull
    public String v;

    @NotNull
    public String w;

    @NotNull
    public String x;

    @NotNull
    public String y;

    @NotNull
    public String z;

    /* JADX INFO: renamed from: Hi1$a */
    public static final class a implements KG0<C1136Hi1> {
        @Override // defpackage.KG0
        @NotNull
        public final C1136Hi1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            C1136Hi1 c1136Hi1 = new C1136Hi1();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "device_manufacturer":
                        String strE0 = q71.e0();
                        if (strE0 == null) {
                            break;
                        } else {
                            c1136Hi1.i = strE0;
                            break;
                        }
                        break;
                    case "android_api_level":
                        Integer numK = q71.K();
                        if (numK == null) {
                            break;
                        } else {
                            c1136Hi1.g = numK.intValue();
                            break;
                        }
                        break;
                    case "build_id":
                        String strE1 = q71.e0();
                        if (strE1 == null) {
                            break;
                        } else {
                            c1136Hi1.s = strE1;
                            break;
                        }
                        break;
                    case "device_locale":
                        String strE2 = q71.e0();
                        if (strE2 == null) {
                            break;
                        } else {
                            c1136Hi1.h = strE2;
                            break;
                        }
                        break;
                    case "profile_id":
                        String strE3 = q71.e0();
                        if (strE3 == null) {
                            break;
                        } else {
                            c1136Hi1.A = strE3;
                            break;
                        }
                        break;
                    case "device_os_build_number":
                        String strE4 = q71.e0();
                        if (strE4 == null) {
                            break;
                        } else {
                            c1136Hi1.k = strE4;
                            break;
                        }
                        break;
                    case "device_model":
                        String strE5 = q71.e0();
                        if (strE5 == null) {
                            break;
                        } else {
                            c1136Hi1.j = strE5;
                            break;
                        }
                        break;
                    case "device_is_emulator":
                        Boolean boolH0 = q71.H0();
                        if (boolH0 == null) {
                            break;
                        } else {
                            c1136Hi1.n = boolH0.booleanValue();
                            break;
                        }
                        break;
                    case "duration_ns":
                        String strE6 = q71.e0();
                        if (strE6 == null) {
                            break;
                        } else {
                            c1136Hi1.v = strE6;
                            break;
                        }
                        break;
                    case "measurements":
                        HashMap mapD1 = q71.d1(iLogger, new io.sentry.profilemeasurements.a.C0398a());
                        if (mapD1 == null) {
                            break;
                        } else {
                            c1136Hi1.E.putAll(mapD1);
                            break;
                        }
                        break;
                    case "device_physical_memory_bytes":
                        String strE7 = q71.e0();
                        if (strE7 == null) {
                            break;
                        } else {
                            c1136Hi1.q = strE7;
                            break;
                        }
                        break;
                    case "device_cpu_frequencies":
                        List<Integer> list = (List) q71.W0();
                        if (list == null) {
                            break;
                        } else {
                            c1136Hi1.p = list;
                            break;
                        }
                        break;
                    case "version_code":
                        String strE8 = q71.e0();
                        if (strE8 == null) {
                            break;
                        } else {
                            c1136Hi1.w = strE8;
                            break;
                        }
                        break;
                    case "version_name":
                        String strE9 = q71.e0();
                        if (strE9 == null) {
                            break;
                        } else {
                            c1136Hi1.x = strE9;
                            break;
                        }
                        break;
                    case "environment":
                        String strE10 = q71.e0();
                        if (strE10 == null) {
                            break;
                        } else {
                            c1136Hi1.B = strE10;
                            break;
                        }
                        break;
                    case "timestamp":
                        Date dateD0 = q71.D0(iLogger);
                        if (dateD0 == null) {
                            break;
                        } else {
                            c1136Hi1.D = dateD0;
                            break;
                        }
                        break;
                    case "transaction_name":
                        String strE11 = q71.e0();
                        if (strE11 == null) {
                            break;
                        } else {
                            c1136Hi1.u = strE11;
                            break;
                        }
                        break;
                    case "device_os_name":
                        String strE12 = q71.e0();
                        if (strE12 == null) {
                            break;
                        } else {
                            c1136Hi1.l = strE12;
                            break;
                        }
                        break;
                    case "architecture":
                        String strE13 = q71.e0();
                        if (strE13 == null) {
                            break;
                        } else {
                            c1136Hi1.o = strE13;
                            break;
                        }
                        break;
                    case "transaction_id":
                        String strE14 = q71.e0();
                        if (strE14 == null) {
                            break;
                        } else {
                            c1136Hi1.y = strE14;
                            break;
                        }
                        break;
                    case "device_os_version":
                        String strE15 = q71.e0();
                        if (strE15 == null) {
                            break;
                        } else {
                            c1136Hi1.m = strE15;
                            break;
                        }
                        break;
                    case "truncation_reason":
                        String strE16 = q71.e0();
                        if (strE16 == null) {
                            break;
                        } else {
                            c1136Hi1.C = strE16;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strE17 = q71.e0();
                        if (strE17 == null) {
                            break;
                        } else {
                            c1136Hi1.z = strE17;
                            break;
                        }
                        break;
                    case "platform":
                        String strE18 = q71.e0();
                        if (strE18 == null) {
                            break;
                        } else {
                            c1136Hi1.r = strE18;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        String strE19 = q71.e0();
                        if (strE19 == null) {
                            break;
                        } else {
                            c1136Hi1.F = strE19;
                            break;
                        }
                        break;
                    case "transactions":
                        ArrayList arrayListQ0 = q71.q0(iLogger, new C1214Ii1.a());
                        if (arrayListQ0 == null) {
                            break;
                        } else {
                            c1136Hi1.t.addAll(arrayListQ0);
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            c1136Hi1.G = concurrentHashMap;
            q71.B0();
            return c1136Hi1;
        }
    }

    public C1136Hi1() {
        File file = new File("dummy");
        Date dateH = N7.h();
        ArrayList arrayList = new ArrayList();
        u uVar = u.e;
        this(file, dateH, arrayList, "", uVar.toString(), new C3561eO1(uVar, C4401iO1.e, "op", null).d.toString(), "0", 0, "", new CallableC1058Gi1(), null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("android_api_level");
        c6319rH0.g(iLogger, Integer.valueOf(this.g));
        c6319rH0.c("device_locale");
        c6319rH0.g(iLogger, this.h);
        c6319rH0.c("device_manufacturer");
        c6319rH0.j(this.i);
        c6319rH0.c(Payload.DEVICE_MODEL);
        c6319rH0.j(this.j);
        c6319rH0.c("device_os_build_number");
        c6319rH0.j(this.k);
        c6319rH0.c("device_os_name");
        c6319rH0.j(this.l);
        c6319rH0.c("device_os_version");
        c6319rH0.j(this.m);
        c6319rH0.c("device_is_emulator");
        c6319rH0.k(this.n);
        c6319rH0.c("architecture");
        c6319rH0.g(iLogger, this.o);
        c6319rH0.c("device_cpu_frequencies");
        c6319rH0.g(iLogger, this.p);
        c6319rH0.c("device_physical_memory_bytes");
        c6319rH0.j(this.q);
        c6319rH0.c("platform");
        c6319rH0.j(this.r);
        c6319rH0.c("build_id");
        c6319rH0.j(this.s);
        c6319rH0.c("transaction_name");
        c6319rH0.j(this.u);
        c6319rH0.c("duration_ns");
        c6319rH0.j(this.v);
        c6319rH0.c("version_name");
        c6319rH0.j(this.x);
        c6319rH0.c("version_code");
        c6319rH0.j(this.w);
        ArrayList arrayList = this.t;
        if (!arrayList.isEmpty()) {
            c6319rH0.c("transactions");
            c6319rH0.g(iLogger, arrayList);
        }
        c6319rH0.c("transaction_id");
        c6319rH0.j(this.y);
        c6319rH0.c("trace_id");
        c6319rH0.j(this.z);
        c6319rH0.c("profile_id");
        c6319rH0.j(this.A);
        c6319rH0.c("environment");
        c6319rH0.j(this.B);
        c6319rH0.c("truncation_reason");
        c6319rH0.j(this.C);
        if (this.F != null) {
            c6319rH0.c("sampled_profile");
            c6319rH0.j(this.F);
        }
        String str = c6319rH0.a.h;
        c6319rH0.d("");
        c6319rH0.c("measurements");
        c6319rH0.g(iLogger, this.E);
        c6319rH0.d(str);
        c6319rH0.c("timestamp");
        c6319rH0.g(iLogger, this.D);
        ConcurrentHashMap concurrentHashMap = this.G;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                C4564j.h(this.G, str2, c6319rH0, str2, iLogger);
            }
        }
        c6319rH0.b();
    }

    public C1136Hi1(@NotNull File file, @NotNull Date date, @NotNull ArrayList arrayList, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull Callable callable, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Boolean bool, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @NotNull String str13, @NotNull HashMap map) {
        this.p = new ArrayList();
        this.F = null;
        this.d = file;
        this.D = date;
        this.o = str5;
        this.e = callable;
        this.g = i;
        this.h = Locale.getDefault().toString();
        this.i = str6 == null ? "" : str6;
        this.j = str7 == null ? "" : str7;
        this.m = str8 != null ? str8 : "";
        this.n = bool != null ? bool.booleanValue() : false;
        this.q = str9 != null ? str9 : "0";
        this.k = "";
        this.l = "android";
        this.r = "android";
        this.s = str10 != null ? str10 : "";
        this.t = arrayList;
        this.u = str.isEmpty() ? "unknown" : str;
        this.v = str4;
        this.w = "";
        this.x = str11 != null ? str11 : "";
        this.y = str2;
        this.z = str3;
        this.A = C2432Xo.h();
        this.B = str12 != null ? str12 : "production";
        this.C = str13;
        if (!str13.equals("normal") && !this.C.equals("timeout") && !this.C.equals("backgrounded")) {
            this.C = "normal";
        }
        this.E = map;
    }
}

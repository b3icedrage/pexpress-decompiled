package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: renamed from: zI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8002zI {
    public static final C6170qb d = C6170qb.d();
    public static volatile C8002zI e;
    public final RemoteConfigManager a = RemoteConfigManager.getInstance();
    public C1099Gw0 b = new C1099Gw0();
    public final C4786k00 c = C4786k00.b();

    public static synchronized C8002zI e() {
        try {
            if (e == null) {
                e = new C8002zI();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static boolean l(long j) {
        return j >= 0;
    }

    public static boolean m(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2.trim().equals("20.3.1")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean n(long j) {
        return j >= 0;
    }

    public static boolean p(float f) {
        return 0.0f <= f && f <= 1.0f;
    }

    public final C2745aa1<Boolean> a(G1 g1) {
        C4786k00 c4786k00 = this.c;
        String strG = g1.g();
        if (strG == null) {
            c4786k00.getClass();
            C4786k00.c.a();
            return new C2745aa1<>();
        }
        if (c4786k00.a == null) {
            c4786k00.c(C4786k00.a());
            if (c4786k00.a == null) {
                return new C2745aa1<>();
            }
        }
        if (!c4786k00.a.contains(strG)) {
            return new C2745aa1<>();
        }
        try {
            return new C2745aa1<>(Boolean.valueOf(c4786k00.a.getBoolean(strG, false)));
        } catch (ClassCastException e2) {
            C4786k00.c.b("Key %s from sharedPreferences has type other than long: %s", strG, e2.getMessage());
            return new C2745aa1<>();
        }
    }

    public final C2745aa1<Float> b(G1 g1) {
        C4786k00 c4786k00 = this.c;
        String strG = g1.g();
        if (strG == null) {
            c4786k00.getClass();
            C4786k00.c.a();
            return new C2745aa1<>();
        }
        if (c4786k00.a == null) {
            c4786k00.c(C4786k00.a());
            if (c4786k00.a == null) {
                return new C2745aa1<>();
            }
        }
        if (!c4786k00.a.contains(strG)) {
            return new C2745aa1<>();
        }
        try {
            return new C2745aa1<>(Float.valueOf(c4786k00.a.getFloat(strG, 0.0f)));
        } catch (ClassCastException e2) {
            C4786k00.c.b("Key %s from sharedPreferences has type other than float: %s", strG, e2.getMessage());
            return new C2745aa1<>();
        }
    }

    public final C2745aa1<Long> c(G1 g1) {
        C4786k00 c4786k00 = this.c;
        String strG = g1.g();
        if (strG == null) {
            c4786k00.getClass();
            C4786k00.c.a();
            return new C2745aa1<>();
        }
        if (c4786k00.a == null) {
            c4786k00.c(C4786k00.a());
            if (c4786k00.a == null) {
                return new C2745aa1<>();
            }
        }
        if (!c4786k00.a.contains(strG)) {
            return new C2745aa1<>();
        }
        try {
            return new C2745aa1<>(Long.valueOf(c4786k00.a.getLong(strG, 0L)));
        } catch (ClassCastException e2) {
            C4786k00.c.b("Key %s from sharedPreferences has type other than long: %s", strG, e2.getMessage());
            return new C2745aa1<>();
        }
    }

    public final C2745aa1<String> d(G1 g1) {
        C4786k00 c4786k00 = this.c;
        String strG = g1.g();
        if (strG == null) {
            c4786k00.getClass();
            C4786k00.c.a();
            return new C2745aa1<>();
        }
        if (c4786k00.a == null) {
            c4786k00.c(C4786k00.a());
            if (c4786k00.a == null) {
                return new C2745aa1<>();
            }
        }
        if (!c4786k00.a.contains(strG)) {
            return new C2745aa1<>();
        }
        try {
            return new C2745aa1<>(c4786k00.a.getString(strG, ""));
        } catch (ClassCastException e2) {
            C4786k00.c.b("Key %s from sharedPreferences has type other than String: %s", strG, e2.getMessage());
            return new C2745aa1<>();
        }
    }

    public final boolean f() {
        RI riW = RI.w();
        C2745aa1<Boolean> c2745aa1H = h(riW);
        if (c2745aa1H.b()) {
            return c2745aa1H.a().booleanValue();
        }
        C2745aa1<Boolean> c2745aa1 = this.a.getBoolean("fpr_experiment_app_start_ttid");
        if (c2745aa1.b()) {
            this.c.g("com.google.firebase.perf.ExperimentTTID", c2745aa1.a().booleanValue());
            return c2745aa1.a().booleanValue();
        }
        C2745aa1<Boolean> c2745aa1A = a(riW);
        if (c2745aa1A.b()) {
            return c2745aa1A.a().booleanValue();
        }
        return false;
    }

    public final Boolean g() {
        PI pi;
        QI qi;
        synchronized (PI.class) {
            try {
                if (PI.e == null) {
                    PI.e = new PI();
                }
                pi = PI.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        C2745aa1<Boolean> c2745aa1H = h(pi);
        if ((c2745aa1H.b() ? c2745aa1H.a() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (QI.class) {
            try {
                if (QI.e == null) {
                    QI.e = new QI();
                }
                qi = QI.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C2745aa1<Boolean> c2745aa1A = a(qi);
        if (c2745aa1A.b()) {
            return c2745aa1A.a();
        }
        C2745aa1<Boolean> c2745aa1H2 = h(qi);
        if (c2745aa1H2.b()) {
            return c2745aa1H2.a();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: ClassCastException -> 0x0034, TryCatch #0 {ClassCastException -> 0x0034, blocks: (B:12:0x001e, B:14:0x0028, B:16:0x002e), top: B:21:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x002e A[Catch: ClassCastException -> 0x0034, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0034, blocks: (B:12:0x001e, B:14:0x0028, B:16:0x002e), top: B:21:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:21:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final C2745aa1<Boolean> h(G1 g1) {
        boolean z;
        C1099Gw0 c1099Gw0 = this.b;
        String strH = g1.h();
        if (strH != null) {
            z = c1099Gw0.a.containsKey(strH);
            if (!z) {
                return new C2745aa1<>();
            }
            try {
                Boolean bool = (Boolean) c1099Gw0.a.get(strH);
                return bool == null ? new C2745aa1<>() : new C2745aa1<>(bool);
            } catch (ClassCastException e2) {
                C1099Gw0.b.b("Metadata key %s contains type other than boolean: %s", strH, e2.getMessage());
                return new C2745aa1<>();
            }
        }
        c1099Gw0.getClass();
        if (!z) {
            return new C2745aa1<>();
        }
        Boolean bool2 = (Boolean) c1099Gw0.a.get(strH);
        if (bool2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: ClassCastException -> 0x0034, TryCatch #0 {ClassCastException -> 0x0034, blocks: (B:12:0x001e, B:14:0x0028, B:16:0x002e), top: B:21:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x002e A[Catch: ClassCastException -> 0x0034, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0034, blocks: (B:12:0x001e, B:14:0x0028, B:16:0x002e), top: B:21:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:21:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final C2745aa1<Float> i(G1 g1) {
        boolean z;
        C1099Gw0 c1099Gw0 = this.b;
        String strH = g1.h();
        if (strH != null) {
            z = c1099Gw0.a.containsKey(strH);
            if (!z) {
                return new C2745aa1<>();
            }
            try {
                Float f = (Float) c1099Gw0.a.get(strH);
                return f == null ? new C2745aa1<>() : new C2745aa1<>(f);
            } catch (ClassCastException e2) {
                C1099Gw0.b.b("Metadata key %s contains type other than float: %s", strH, e2.getMessage());
                return new C2745aa1<>();
            }
        }
        c1099Gw0.getClass();
        if (!z) {
            return new C2745aa1<>();
        }
        Float f2 = (Float) c1099Gw0.a.get(strH);
        if (f2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: ClassCastException -> 0x0036, TryCatch #0 {ClassCastException -> 0x0036, blocks: (B:11:0x001e, B:13:0x0028, B:14:0x002f), top: B:24:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f A[Catch: ClassCastException -> 0x0036, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0036, blocks: (B:11:0x001e, B:13:0x0028, B:14:0x002f), top: B:24:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13, types: [aa1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aa1] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [aa1] */
    public final C2745aa1<Long> j(G1 g1) {
        boolean z;
        Integer num;
        C1099Gw0 c1099Gw0 = this.b;
        ?? H = g1.h();
        if (H != 0) {
            z = c1099Gw0.a.containsKey(H);
            if (z) {
                try {
                    num = (Integer) c1099Gw0.a.get(H);
                    if (num == null) {
                        H = new C2745aa1();
                    } else {
                        H = new C2745aa1(num);
                    }
                } catch (ClassCastException e2) {
                    C1099Gw0.b.b("Metadata key %s contains type other than int: %s", H, e2.getMessage());
                    H = new C2745aa1();
                }
            } else {
                H = new C2745aa1();
            }
            return H.b() ? new C2745aa1<>(Long.valueOf(((Integer) H.a()).intValue())) : new C2745aa1<>();
        }
        c1099Gw0.getClass();
        if (z) {
            H = new C2745aa1();
        } else {
            num = (Integer) c1099Gw0.a.get(H);
            if (num == null) {
                H = new C2745aa1();
            } else {
                H = new C2745aa1(num);
            }
        }
        if (H.b()) {
        }
    }

    public final long k() {
        XI xi;
        synchronized (XI.class) {
            try {
                if (XI.e == null) {
                    XI.e = new XI();
                }
                xi = XI.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.a;
        xi.getClass();
        C2745aa1<Long> c2745aa1 = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (c2745aa1.b() && c2745aa1.a().longValue() > 0) {
            this.c.e("com.google.firebase.perf.TimeLimitSec", c2745aa1.a().longValue());
            return c2745aa1.a().longValue();
        }
        C2745aa1<Long> c2745aa1C = c(xi);
        if (!c2745aa1C.b() || c2745aa1C.a().longValue() <= 0) {
            return 600L;
        }
        return c2745aa1C.a().longValue();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    public final boolean o() {
        ZI zi;
        boolean zBooleanValue;
        boolean z;
        YI yi;
        boolean zM;
        Boolean boolG = g();
        if (boolG == null || boolG.booleanValue()) {
            synchronized (ZI.class) {
                try {
                    if (ZI.e == null) {
                        ZI.e = new ZI();
                    }
                    zi = ZI.e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            zi.getClass();
            C2745aa1<Boolean> c2745aa1 = this.a.getBoolean("fpr_enabled");
            if (!c2745aa1.b()) {
                C2745aa1<Boolean> c2745aa1A = a(zi);
                zBooleanValue = c2745aa1A.b() ? c2745aa1A.a().booleanValue() : true;
            } else if (this.a.isLastFetchFailed()) {
                zBooleanValue = false;
            } else {
                this.c.g("com.google.firebase.perf.SdkEnabled", c2745aa1.a().booleanValue());
                zBooleanValue = c2745aa1.a().booleanValue();
            }
            if (zBooleanValue) {
                synchronized (YI.class) {
                    try {
                        if (YI.e == null) {
                            YI.e = new YI();
                        }
                        yi = YI.e;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                RemoteConfigManager remoteConfigManager = this.a;
                yi.getClass();
                C2745aa1<String> string = remoteConfigManager.getString("fpr_disabled_android_versions");
                if (string.b()) {
                    this.c.f("com.google.firebase.perf.SdkDisabledVersions", string.a());
                    zM = m(string.a());
                } else {
                    C2745aa1<String> c2745aa1D = d(yi);
                    zM = c2745aa1D.b() ? m(c2745aa1D.a()) : m("");
                }
                if (zM) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}

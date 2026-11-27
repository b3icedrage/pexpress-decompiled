package defpackage;

import io.sentry.ILogger;
import io.sentry.protocol.E;
import io.sentry.util.C4527a;
import io.sentry.util.u;
import io.sentry.util.x;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2171Up {
    public static final b i = new b();

    @NotNull
    public final ConcurrentHashMap<String, String> a;

    @NotNull
    public final C4527a b;

    @Nullable
    public Double c;

    @Nullable
    public Double d;

    @Nullable
    public final String e;
    public boolean f;
    public final boolean g;

    @NotNull
    public final ILogger h;

    /* JADX INFO: renamed from: Up$a */
    public static final class a {
        public static final List<String> a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-transaction", "sentry-sample_rate", "sentry-sample_rand", "sentry-sampled", "sentry-replay_id");
    }

    /* JADX INFO: renamed from: Up$b */
    public static class b extends ThreadLocal<DecimalFormat> {
        @Override // java.lang.ThreadLocal
        public final DecimalFormat initialValue() {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
        }
    }

    public C2171Up(@NotNull ILogger iLogger) {
        this(new ConcurrentHashMap(), null, null, null, false, iLogger);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    @NotNull
    public static C2171Up a(@Nullable String str, @NotNull ILogger iLogger) {
        Double d;
        Double dValueOf;
        String strC;
        Double dValueOf2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int i2 = 0;
        z = false;
        if (str != null) {
            try {
                boolean z2 = false;
                dValueOf2 = null;
                dValueOf = null;
                for (String str2 : str.split(",", -1)) {
                    try {
                        if (str2.trim().startsWith("sentry-")) {
                            try {
                                int iIndexOf = str2.indexOf("=");
                                String strTrim = str2.substring(i2, iIndexOf).trim();
                                String strDecode = URLDecoder.decode(strTrim, "UTF-8");
                                String strDecode2 = URLDecoder.decode(str2.substring(iIndexOf + 1).trim(), "UTF-8");
                                try {
                                    if ("sentry-sample_rate".equals(strDecode)) {
                                        if (strDecode2 != null) {
                                            try {
                                                double d2 = Double.parseDouble(strDecode2);
                                                if (u.c(Double.valueOf(d2), false)) {
                                                    dValueOf2 = Double.valueOf(d2);
                                                } else {
                                                    dValueOf2 = null;
                                                }
                                            } catch (NumberFormatException unused) {
                                            }
                                        } else {
                                            dValueOf2 = null;
                                        }
                                        i2 = 0;
                                    } else if (!"sentry-sample_rand".equals(strDecode)) {
                                        i2 = 0;
                                        concurrentHashMap.put(strDecode, strDecode2);
                                    } else if (strDecode2 != null) {
                                        try {
                                            double d3 = Double.parseDouble(strDecode2);
                                            i2 = 0;
                                            i2 = 0;
                                            i2 = 0;
                                            try {
                                                dValueOf = u.c(Double.valueOf(d3), false) ? Double.valueOf(d3) : null;
                                            } catch (NumberFormatException unused2) {
                                            }
                                        } catch (NumberFormatException unused3) {
                                            i2 = 0;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    if (!"sentry-sample_rand".equalsIgnoreCase(strTrim)) {
                                        z2 = true;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    i2 = 0;
                                    iLogger.c(NG1.ERROR, th, "Unable to decode baggage key value pair %s", str2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            arrayList.add(str2.trim());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z = z2;
                        iLogger.c(NG1.ERROR, th, "Unable to decode baggage header %s", str);
                        d = dValueOf2;
                        if (arrayList.isEmpty()) {
                            strC = null;
                        } else {
                            strC = x.c(arrayList);
                        }
                        return new C2171Up(concurrentHashMap, d, dValueOf, strC, z, iLogger);
                    }
                }
                z = z2;
            } catch (Throwable th4) {
                th = th4;
                dValueOf2 = null;
                dValueOf = null;
            }
            d = dValueOf2;
        } else {
            d = null;
            dValueOf = null;
        }
        if (arrayList.isEmpty()) {
            strC = null;
        } else {
            strC = x.c(arrayList);
        }
        return new C2171Up(concurrentHashMap, d, dValueOf, strC, z, iLogger);
    }

    @Nullable
    public static String c(@Nullable Double d) {
        if (u.c(d, false)) {
            return i.get().format(d);
        }
        return null;
    }

    @Nullable
    public final String b(@Nullable String str) {
        return this.a.get(str);
    }

    public final void d(@NotNull String str, @Nullable String str2) {
        if (this.f) {
            ConcurrentHashMap<String, String> concurrentHashMap = this.a;
            if (str2 == null) {
                concurrentHashMap.remove(str);
            } else {
                concurrentHashMap.put(str, str2);
            }
        }
    }

    public final void e(@NotNull io.sentry.protocol.u uVar, @Nullable io.sentry.protocol.u uVar2, @NotNull C2688aH1 c2688aH1, @Nullable L02 l02, @Nullable String str, @Nullable E e) {
        d("sentry-trace_id", uVar.toString());
        d("sentry-public_key", c2688aH1.retrieveParsedDsn().b);
        d("sentry-release", c2688aH1.getRelease());
        d("sentry-environment", c2688aH1.getEnvironment());
        if (e == null || E.URL.equals(e)) {
            str = null;
        }
        d("sentry-transaction", str);
        if (uVar2 != null && !io.sentry.protocol.u.e.equals(uVar2)) {
            d("sentry-replay_id", uVar2.toString());
        }
        Double d = l02 == null ? null : l02.b;
        if (this.f) {
            this.c = d;
        }
        Boolean bool = l02 == null ? null : l02.a;
        d("sentry-sampled", bool == null ? null : bool.toString());
        Double d2 = l02 != null ? l02.c : null;
        if (this.f) {
            this.d = d2;
        }
    }

    @Nullable
    public final H02 f() {
        String strB = b("sentry-trace_id");
        String strB2 = b("sentry-replay_id");
        String strB3 = b("sentry-public_key");
        if (strB == null || strB3 == null) {
            return null;
        }
        H02 h02 = new H02(new io.sentry.protocol.u(strB), strB3, b("sentry-release"), b("sentry-environment"), b("sentry-user_id"), b("sentry-transaction"), c(this.c), b("sentry-sampled"), strB2 != null ? new io.sentry.protocol.u(strB2) : null, c(this.d));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C4527a.C0404a c0404aA = this.b.a();
        try {
            for (Map.Entry<String, String> entry : this.a.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!a.a.contains(key) && value != null) {
                    concurrentHashMap.put(key.replaceFirst("sentry-", ""), value);
                }
            }
            c0404aA.close();
            h02.o = concurrentHashMap;
            return h02;
        } catch (Throwable th) {
            try {
                c0404aA.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public C2171Up(@NotNull ConcurrentHashMap concurrentHashMap, @Nullable Double d, @Nullable Double d2, @Nullable String str, boolean z, @NotNull ILogger iLogger) {
        this.b = new C4527a();
        this.a = concurrentHashMap;
        this.c = d;
        this.d = d2;
        this.h = iLogger;
        this.e = str;
        this.f = true;
        this.g = z;
    }
}

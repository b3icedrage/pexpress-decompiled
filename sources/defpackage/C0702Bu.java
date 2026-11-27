package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import io.sentry.ILogger;
import io.sentry.util.C4529c;
import io.sentry.util.p;
import io.sentry.vendor.gson.stream.b;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0702Bu implements BH0, Comparable<C0702Bu> {

    @Nullable
    public final Long d;

    @Nullable
    public Date e;

    @NotNull
    public final Long g;

    @Nullable
    public String h;

    @Nullable
    public String i;

    @NotNull
    public ConcurrentHashMap j;

    @Nullable
    public String k;

    @Nullable
    public String l;

    @Nullable
    public NG1 m;

    @Nullable
    public ConcurrentHashMap n;

    /* JADX INFO: renamed from: Bu$a */
    public static final class a implements KG0<C0702Bu> {
        @Override // defpackage.KG0
        @NotNull
        public final C0702Bu a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            Date dateH = N7.h();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String strE0 = null;
            String strE1 = null;
            String strE2 = null;
            String strE3 = null;
            NG1 ng1ValueOf = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "origin":
                        strE3 = q71.e0();
                        break;
                    case "data":
                        ConcurrentHashMap concurrentHashMapA = C4529c.a((Map) q71.W0());
                        if (concurrentHashMapA == null) {
                            break;
                        } else {
                            concurrentHashMap = concurrentHashMapA;
                            break;
                        }
                        break;
                    case "type":
                        strE1 = q71.e0();
                        break;
                    case "category":
                        strE2 = q71.e0();
                        break;
                    case "timestamp":
                        Date dateD0 = q71.D0(iLogger);
                        if (dateD0 == null) {
                            break;
                        } else {
                            dateH = dateD0;
                            break;
                        }
                        break;
                    case "level":
                        try {
                            ng1ValueOf = NG1.valueOf(q71.B().toUpperCase(Locale.ROOT));
                            break;
                        } catch (Exception e) {
                            iLogger.c(NG1.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        strE0 = q71.e0();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap2, strX0);
                        break;
                }
            }
            C0702Bu c0702Bu = new C0702Bu(dateH);
            c0702Bu.h = strE0;
            c0702Bu.i = strE1;
            c0702Bu.j = concurrentHashMap;
            c0702Bu.k = strE2;
            c0702Bu.l = strE3;
            c0702Bu.m = ng1ValueOf;
            c0702Bu.n = concurrentHashMap2;
            q71.B0();
            return c0702Bu;
        }
    }

    public C0702Bu(@NotNull Date date) {
        this.j = new ConcurrentHashMap();
        this.g = Long.valueOf(System.nanoTime());
        this.e = date;
        this.d = null;
    }

    public static boolean b(@NotNull C0702Bu c0702Bu, @NotNull C0702Bu c0702Bu2) {
        return c0702Bu.e().getTime() == c0702Bu2.e().getTime() && p.a(c0702Bu.h, c0702Bu2.h) && p.a(c0702Bu.i, c0702Bu2.i) && p.a(c0702Bu.k, c0702Bu2.k) && p.a(c0702Bu.l, c0702Bu2.l) && c0702Bu.m == c0702Bu2.m;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NotNull C0702Bu c0702Bu) {
        return this.g.compareTo(c0702Bu.g);
    }

    @NotNull
    public final Date e() {
        Date date = this.e;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l = this.d;
        if (l == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateI = N7.i(l.longValue());
        this.e = dateI;
        return dateI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0702Bu.class != obj.getClass()) {
            return false;
        }
        C0702Bu c0702Bu = (C0702Bu) obj;
        if ("http".equals(this.i)) {
            return b(this, c0702Bu) && p.a(this.j.get("status_code"), c0702Bu.j.get("status_code")) && p.a(this.j.get(ImagesContract.URL), c0702Bu.j.get(ImagesContract.URL)) && p.a(this.j.get("method"), c0702Bu.j.get("method")) && p.a(this.j.get("http.fragment"), c0702Bu.j.get("http.fragment")) && p.a(this.j.get("http.query"), c0702Bu.j.get("http.query"));
        }
        return b(this, c0702Bu);
    }

    public final void f(@Nullable Object obj, @Nullable String str) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.j.remove(str);
        } else {
            this.j.put(str, obj);
        }
    }

    public final int hashCode() {
        return "http".equals(this.i) ? Arrays.hashCode(new Object[]{Long.valueOf(e().getTime()), this.h, this.i, this.k, this.l, this.m, this.j.get("status_code"), this.j.get(ImagesContract.URL), this.j.get("method"), this.j.get("http.fragment"), this.j.get("http.query")}) : Arrays.hashCode(new Object[]{Long.valueOf(e().getTime()), this.h, this.i, this.k, this.l, this.m});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("timestamp");
        c6319rH0.g(iLogger, e());
        if (this.h != null) {
            c6319rH0.c("message");
            c6319rH0.j(this.h);
        }
        if (this.i != null) {
            c6319rH0.c("type");
            c6319rH0.j(this.i);
        }
        c6319rH0.c("data");
        c6319rH0.g(iLogger, this.j);
        if (this.k != null) {
            c6319rH0.c("category");
            c6319rH0.j(this.k);
        }
        if (this.l != null) {
            c6319rH0.c("origin");
            c6319rH0.j(this.l);
        }
        if (this.m != null) {
            c6319rH0.c("level");
            c6319rH0.g(iLogger, this.m);
        }
        ConcurrentHashMap concurrentHashMap = this.n;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.n, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public C0702Bu(long j) {
        this.j = new ConcurrentHashMap();
        this.g = Long.valueOf(System.nanoTime());
        this.d = Long.valueOf(j);
        this.e = null;
    }

    public C0702Bu(@NotNull C0702Bu c0702Bu) {
        this.j = new ConcurrentHashMap();
        this.g = Long.valueOf(System.nanoTime());
        this.e = c0702Bu.e;
        this.d = c0702Bu.d;
        this.h = c0702Bu.h;
        this.i = c0702Bu.i;
        this.k = c0702Bu.k;
        this.l = c0702Bu.l;
        ConcurrentHashMap concurrentHashMapA = C4529c.a(c0702Bu.j);
        if (concurrentHashMapA != null) {
            this.j = concurrentHashMapA;
        }
        this.n = C4529c.a(c0702Bu.n);
        this.m = c0702Bu.m;
    }

    public C0702Bu() {
        this(System.currentTimeMillis());
    }
}

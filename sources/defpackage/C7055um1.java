package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: um1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7055um1 {
    public final C8002zI a;
    public final float b;
    public final float c;
    public final a d;
    public final a e;

    /* JADX INFO: renamed from: um1$a */
    public static class a {
        public static final long i;
        public C6006pm1 b;
        public final C6006pm1 e;
        public final C6006pm1 f;
        public final long g;
        public final long h;
        public long c = 500;
        public double d = 500;
        public QZ1 a = new QZ1();

        static {
            C6170qb.d();
            i = TimeUnit.SECONDS.toMicros(1L);
        }

        public a(C6006pm1 c6006pm1, C5207m c5207m, C8002zI c8002zI, String str) {
            VI vi;
            long jLongValue;
            UI ui;
            long jLongValue2;
            C3964gJ c3964gJ;
            C4174hJ c4174hJ;
            this.b = c6006pm1;
            long jK = str == "Trace" ? c8002zI.k() : c8002zI.k();
            if (str == "Trace") {
                synchronized (C4174hJ.class) {
                    try {
                        if (C4174hJ.e == null) {
                            C4174hJ.e = new C4174hJ();
                        }
                        c4174hJ = C4174hJ.e;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                RemoteConfigManager remoteConfigManager = c8002zI.a;
                c4174hJ.getClass();
                C2745aa1<Long> c2745aa1 = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
                if (c2745aa1.b() && C8002zI.l(c2745aa1.a().longValue())) {
                    c8002zI.c.e("com.google.firebase.perf.TraceEventCountForeground", c2745aa1.a().longValue());
                    jLongValue = c2745aa1.a().longValue();
                } else {
                    C2745aa1<Long> c2745aa1C = c8002zI.c(c4174hJ);
                    jLongValue = (c2745aa1C.b() && C8002zI.l(c2745aa1C.a().longValue())) ? c2745aa1C.a().longValue() : 300L;
                }
            } else {
                synchronized (VI.class) {
                    try {
                        if (VI.e == null) {
                            VI.e = new VI();
                        }
                        vi = VI.e;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                RemoteConfigManager remoteConfigManager2 = c8002zI.a;
                vi.getClass();
                C2745aa1<Long> c2745aa2 = remoteConfigManager2.getLong("fpr_rl_network_event_count_fg");
                if (c2745aa2.b() && C8002zI.l(c2745aa2.a().longValue())) {
                    c8002zI.c.e("com.google.firebase.perf.NetworkEventCountForeground", c2745aa2.a().longValue());
                    jLongValue = c2745aa2.a().longValue();
                } else {
                    C2745aa1<Long> c2745aa1C2 = c8002zI.c(vi);
                    jLongValue = (c2745aa1C2.b() && C8002zI.l(c2745aa1C2.a().longValue())) ? c2745aa1C2.a().longValue() : 700L;
                }
            }
            long j = jLongValue;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.e = new C6006pm1(j, jK, timeUnit);
            this.g = j;
            long jK2 = str == "Trace" ? c8002zI.k() : c8002zI.k();
            if (str == "Trace") {
                synchronized (C3964gJ.class) {
                    try {
                        if (C3964gJ.e == null) {
                            C3964gJ.e = new C3964gJ();
                        }
                        c3964gJ = C3964gJ.e;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                RemoteConfigManager remoteConfigManager3 = c8002zI.a;
                c3964gJ.getClass();
                C2745aa1<Long> c2745aa3 = remoteConfigManager3.getLong("fpr_rl_trace_event_count_bg");
                if (c2745aa3.b() && C8002zI.l(c2745aa3.a().longValue())) {
                    c8002zI.c.e("com.google.firebase.perf.TraceEventCountBackground", c2745aa3.a().longValue());
                    jLongValue2 = c2745aa3.a().longValue();
                } else {
                    C2745aa1<Long> c2745aa1C3 = c8002zI.c(c3964gJ);
                    jLongValue2 = (c2745aa1C3.b() && C8002zI.l(c2745aa1C3.a().longValue())) ? c2745aa1C3.a().longValue() : 30L;
                }
            } else {
                synchronized (UI.class) {
                    try {
                        if (UI.e == null) {
                            UI.e = new UI();
                        }
                        ui = UI.e;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                RemoteConfigManager remoteConfigManager4 = c8002zI.a;
                ui.getClass();
                C2745aa1<Long> c2745aa4 = remoteConfigManager4.getLong("fpr_rl_network_event_count_bg");
                if (c2745aa4.b() && C8002zI.l(c2745aa4.a().longValue())) {
                    c8002zI.c.e("com.google.firebase.perf.NetworkEventCountBackground", c2745aa4.a().longValue());
                    jLongValue2 = c2745aa4.a().longValue();
                } else {
                    C2745aa1<Long> c2745aa1C4 = c8002zI.c(ui);
                    jLongValue2 = (c2745aa1C4.b() && C8002zI.l(c2745aa1C4.a().longValue())) ? c2745aa1C4.a().longValue() : 70L;
                }
            }
            long j2 = jLongValue2;
            this.f = new C6006pm1(j2, jK2, timeUnit);
            this.h = j2;
        }

        public final synchronized void a(boolean z) {
            try {
                this.b = z ? this.e : this.f;
                this.c = z ? this.g : this.h;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0063 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:9:0x002f, B:14:0x0058, B:16:0x0063, B:19:0x0074, B:21:0x007c, B:10:0x0037, B:11:0x0040, B:12:0x0044, B:13:0x004e), top: B:29:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x007c A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:9:0x002f, B:14:0x0058, B:16:0x0063, B:19:0x0074, B:21:0x007c, B:10:0x0037, B:11:0x0040, B:12:0x0044, B:13:0x004e), top: B:29:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0081 A[DONT_GENERATE] */
        /* JADX WARN: Instruction removed from duplicated block: B:24:0x0081, please report this as an issue */
        public final synchronized boolean b() {
            double d;
            long nanos;
            double seconds;
            double d2;
            double d3;
            try {
                QZ1 qz1 = new QZ1();
                QZ1 qz2 = this.a;
                qz2.getClass();
                double d4 = qz1.e - qz2.e;
                C6006pm1 c6006pm1 = this.b;
                c6006pm1.getClass();
                int[] iArr = C6006pm1.a.a;
                TimeUnit timeUnit = c6006pm1.c;
                int i2 = iArr[timeUnit.ordinal()];
                long j = c6006pm1.b;
                long j2 = c6006pm1.a;
                if (i2 == 1) {
                    d = j2 / j;
                    nanos = TimeUnit.SECONDS.toNanos(1L);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            seconds = j2 / timeUnit.toSeconds(j);
                        } else {
                            d = j2 / j;
                            nanos = TimeUnit.SECONDS.toMillis(1L);
                        }
                        d2 = (d4 * seconds) / i;
                        if (d2 > 0.0d) {
                            this.d = Math.min(this.d + d2, this.c);
                            this.a = qz1;
                        }
                        d3 = this.d;
                        if (d3 >= 1.0d) {
                            return false;
                        }
                        this.d = d3 - 1.0d;
                        return true;
                    }
                    d = j2 / j;
                    nanos = TimeUnit.SECONDS.toMicros(1L);
                }
                seconds = d * nanos;
                d2 = (d4 * seconds) / i;
                if (d2 > 0.0d) {
                    this.d = Math.min(this.d + d2, this.c);
                    this.a = qz1;
                }
                d3 = this.d;
                if (d3 >= 1.0d) {
                    return false;
                }
                this.d = d3 - 1.0d;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C7055um1(@NonNull Context context, C6006pm1 c6006pm1) {
        C5207m c5207m = new C5207m();
        float fNextFloat = new Random().nextFloat();
        float fNextFloat2 = new Random().nextFloat();
        C8002zI c8002zIE = C8002zI.e();
        this.d = null;
        this.e = null;
        boolean z = false;
        if (!(0.0f <= fNextFloat && fNextFloat < 1.0f)) {
            throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0f, 1.0f).");
        }
        if (0.0f <= fNextFloat2 && fNextFloat2 < 1.0f) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0f, 1.0f).");
        }
        this.b = fNextFloat;
        this.c = fNextFloat2;
        this.a = c8002zIE;
        this.d = new a(c6006pm1, c5207m, c8002zIE, "Trace");
        this.e = new a(c6006pm1, c5207m, c8002zIE, "Network");
        Cc2.a(context);
    }

    public static boolean a(XB0.c cVar) {
        return cVar.size() > 0 && ((C5970pd1) cVar.get(0)).z() > 0 && ((C5970pd1) cVar.get(0)).y() == EnumC2918bJ1.GAUGES_AND_SYSTEM_EVENTS;
    }
}

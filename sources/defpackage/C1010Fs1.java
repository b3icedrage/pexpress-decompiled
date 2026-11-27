package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Fs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1010Fs1 {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final Bc2 a;
    public long b;
    public int c;

    public C1010Fs1() {
        if (ED.l == null) {
            Pattern pattern = Bc2.c;
            ED.l = new ED();
        }
        ED ed = ED.l;
        if (Bc2.d == null) {
            Bc2.d = new Bc2(ed);
        }
        this.a = Bc2.d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final synchronized boolean a() {
        boolean z;
        if (this.c != 0) {
            this.a.a.getClass();
            if (System.currentTimeMillis() > this.b) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    public final synchronized void b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.c = 0;
            }
            return;
        }
        this.c++;
        synchronized (this) {
            try {
                if (i == 429 || (i >= 500 && i < 600)) {
                    double dPow = Math.pow(2.0d, this.c);
                    this.a.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), e);
                } else {
                    jMin = d;
                }
                this.a.a.getClass();
                this.b = System.currentTimeMillis() + jMin;
            } catch (Throwable th) {
                throw th;
            }
        }
        return;
        throw th;
    }
}

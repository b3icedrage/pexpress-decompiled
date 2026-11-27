package defpackage;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: sd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6599sd1 {
    public final Rf2 a;
    public final String b;
    public Timer c;
    public boolean d;
    public long e;
    public final C2931bO f;

    /* JADX INFO: renamed from: sd1$a */
    public final class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            byte[] bArrA;
            AbstractC6599sd1 abstractC6599sd1 = AbstractC6599sd1.this;
            synchronized (abstractC6599sd1) {
                try {
                    boolean z = false;
                    if (abstractC6599sd1.e != 0 && abstractC6599sd1.a.e(EnumC5357mh2.g)) {
                        Rf2 rf2 = abstractC6599sd1.a;
                        C2931bO c2931bO = abstractC6599sd1.f;
                        try {
                            long jMax = Math.max(c2931bO.a + 1, 1L);
                            c2931bO.a = jMax;
                            bArrA = C6889u01.a(String.valueOf(jMax));
                        } catch (Throwable unused) {
                            bArrA = null;
                        }
                        rf2.g(abstractC6599sd1.a(bArrA));
                        try {
                            abstractC6599sd1.c.schedule(abstractC6599sd1.new a(), abstractC6599sd1.e);
                            z = true;
                        } catch (RuntimeException unused2) {
                        }
                        abstractC6599sd1.d = z;
                        return;
                    }
                    abstractC6599sd1.d = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AbstractC6599sd1(Rf2 rf2, String str, C2931bO c2931bO) {
        this.a = rf2;
        this.b = str;
        this.f = c2931bO;
    }

    public abstract C6822tg2 a(byte[] bArr);

    public final void b() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.e;
        }
        if (j < 0) {
            j = 0;
        }
        synchronized (this) {
            this.e = j;
        }
        if (j != 0 && this.a.e(EnumC5357mh2.g)) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = new Timer(this.b);
                    }
                    if (!this.d) {
                        try {
                            this.c.schedule(new a(), j);
                            z = true;
                        } catch (RuntimeException unused) {
                            z = false;
                        }
                        this.d = z;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

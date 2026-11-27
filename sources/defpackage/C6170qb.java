package defpackage;

import io.sentry.android.core.b0;
import java.util.Locale;

/* JADX INFO: renamed from: qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6170qb {
    public static volatile C6170qb c;
    public final C6772tS0 a;
    public boolean b = false;

    public C6170qb() {
        C6772tS0 c6772tS0;
        synchronized (C6772tS0.class) {
            try {
                if (C6772tS0.d == null) {
                    C6772tS0.d = new C6772tS0();
                }
                c6772tS0 = C6772tS0.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = c6772tS0;
    }

    public static C6170qb d() {
        if (c == null) {
            synchronized (C6170qb.class) {
                try {
                    if (c == null) {
                        c = new C6170qb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final void a() {
        if (this.b) {
            this.a.getClass();
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            b0.c("FirebasePerformance", str2);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
        }
    }

    public final void f(String str) {
        if (this.b) {
            this.a.getClass();
            b0.e("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            b0.e("FirebasePerformance", str2);
        }
    }
}

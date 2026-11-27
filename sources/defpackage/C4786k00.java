package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: k00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4786k00 {
    public static final C6170qb c = C6170qb.d();
    public static C4786k00 d;
    public volatile SharedPreferences a;
    public final ExecutorService b;

    public C4786k00(ExecutorService executorService) {
        this.b = executorService;
    }

    public static Context a() {
        try {
            C1198Id0.c();
            C1198Id0 c1198Id0C = C1198Id0.c();
            c1198Id0C.a();
            return c1198Id0C.a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static synchronized C4786k00 b() {
        try {
            if (d == null) {
                d = new C4786k00(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public final synchronized void c(Context context) {
        if (this.a == null && context != null) {
            this.b.execute(new RunnableC3538eH(1, this, context));
        }
    }

    public final void d(String str, float f) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putFloat(str, f).apply();
    }

    public final void e(String str, long j) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, j).apply();
    }

    public final void f(String str, String str2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.a.edit().remove(str).apply();
        } else {
            this.a.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putBoolean(str, z).apply();
    }
}

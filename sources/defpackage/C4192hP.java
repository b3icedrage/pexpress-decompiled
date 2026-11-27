package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b0;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: hP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4192hP {
    public final Context a;
    public final C6142qS b;
    public final X81 c;
    public final long d;
    public C4402iP e;
    public C4402iP f;
    public YO g;
    public final C7503wv0 h;
    public final C4448id0 i;
    public final C6585sa j;
    public final C6795ta k;
    public final ExecutorService l;
    public final RO m;
    public final C5080lP n;

    public C4192hP(C1198Id0 c1198Id0, C7503wv0 c7503wv0, C5080lP c5080lP, C6142qS c6142qS, C6585sa c6585sa, C6795ta c6795ta, C4448id0 c4448id0, ExecutorService executorService) {
        this.b = c6142qS;
        c1198Id0.a();
        this.a = c1198Id0.a;
        this.h = c7503wv0;
        this.n = c5080lP;
        this.j = c6585sa;
        this.k = c6795ta;
        this.l = executorService;
        this.i = c4448id0;
        this.m = new RO(executorService);
        this.d = System.currentTimeMillis();
        this.c = new X81();
    }

    public static Task a(final C4192hP c4192hP, EJ1 ej1) {
        Task<Void> taskE;
        CallableC3772fP callableC3772fP;
        Boolean bool = Boolean.TRUE;
        RO ro = c4192hP.m;
        if (!bool.equals(((ThreadLocal) ro.d).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        c4192hP.e.a();
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            try {
                c4192hP.j.b(new InterfaceC0858Du() { // from class: cP
                    @Override // defpackage.InterfaceC0858Du
                    public final void a(String str) {
                        C4192hP c4192hP2 = this.a;
                        long jCurrentTimeMillis = System.currentTimeMillis() - c4192hP2.d;
                        YO yo = c4192hP2.g;
                        yo.getClass();
                        yo.e.a(new ZO(yo, jCurrentTimeMillis, str));
                    }
                });
                C7587xJ1 c7587xJ1 = (C7587xJ1) ej1;
                if (c7587xJ1.b().b.a) {
                    if (!c4192hP.g.d(c7587xJ1)) {
                        b0.f("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    taskE = c4192hP.g.e(c7587xJ1.i.get().getTask());
                    callableC3772fP = new CallableC3772fP(c4192hP);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    taskE = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    callableC3772fP = new CallableC3772fP(c4192hP);
                }
                ro.a(callableC3772fP);
                return taskE;
            } catch (Exception e) {
                b0.d("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                Task taskForException = Tasks.forException(e);
                ro.a(new CallableC3772fP(c4192hP));
                return taskForException;
            }
        } catch (Throwable th) {
            ro.a(new CallableC3772fP(c4192hP));
            throw th;
        }
    }
}

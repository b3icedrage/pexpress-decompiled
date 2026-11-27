package defpackage;

import android.util.Log;
import io.sentry.android.core.b0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7813yP implements Thread.UncaughtExceptionHandler {
    public final TO d;
    public final C7587xJ1 e;
    public final Thread.UncaughtExceptionHandler g;
    public final C5080lP h;
    public final AtomicBoolean i = new AtomicBoolean(false);

    public C7813yP(TO to, C7587xJ1 c7587xJ1, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C5080lP c5080lP) {
        this.d = to;
        this.e = c7587xJ1;
        this.g = uncaughtExceptionHandler;
        this.h = c5080lP;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            b0.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            b0.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.h.b()) {
            return true;
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.g;
        AtomicBoolean atomicBoolean = this.i;
        atomicBoolean.set(true);
        try {
            if (a(thread, th)) {
                this.d.a(this.e, thread, th);
            } else {
                Log.isLoggable("FirebaseCrashlytics", 3);
            }
        } catch (Exception e) {
            b0.d("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
        } finally {
            Log.isLoggable("FirebaseCrashlytics", 3);
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
        }
    }
}

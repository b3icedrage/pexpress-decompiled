package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class TO {
    public final /* synthetic */ YO a;

    public TO(YO yo) {
        this.a = yo;
    }

    public final void a(@NonNull C7587xJ1 c7587xJ1, @NonNull Thread thread, @NonNull Throwable th) {
        YO yo = this.a;
        synchronized (yo) {
            try {
                Objects.toString(th);
                thread.getName();
                Log.isLoggable("FirebaseCrashlytics", 3);
                try {
                    try {
                        Ac2.a(yo.e.b(new VO(yo, System.currentTimeMillis(), th, thread, c7587xJ1)));
                    } catch (TimeoutException unused) {
                        b0.d("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                    }
                } catch (Exception e) {
                    b0.d("FirebaseCrashlytics", "Error handling uncaught exception", e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

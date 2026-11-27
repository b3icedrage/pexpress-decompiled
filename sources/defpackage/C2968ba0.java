package defpackage;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ba0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2968ba0 extends AbstractRunnableC1467Lp {
    public final /* synthetic */ ExecutorService d;

    public C2968ba0(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.d = executorService;
    }

    @Override // defpackage.AbstractRunnableC1467Lp
    public final void a() {
        ExecutorService executorService = this.d;
        try {
            Log.isLoggable("FirebaseCrashlytics", 3);
            executorService.shutdown();
            if (executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                return;
            }
            Log.isLoggable("FirebaseCrashlytics", 3);
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            Log.isLoggable("FirebaseCrashlytics", 3);
            executorService.shutdownNow();
        }
    }
}

package com.google.android.gms.analytics;

import android.util.Log;
import io.sentry.android.core.b0;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
final class zzm extends FutureTask {
    final /* synthetic */ zzn zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzn zznVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.zza = zznVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zza.zza.zzg;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            b0.c("GAv4", "MeasurementExecutor: job failed with ".concat(String.valueOf(th)));
        }
        super.setException(th);
    }
}

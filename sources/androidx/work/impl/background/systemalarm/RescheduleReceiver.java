package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.AS0;
import defpackage.C4736jk2;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = AS0.d("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AS0 as0C = AS0.c();
        Objects.toString(intent);
        as0C.getClass();
        try {
            C4736jk2 c4736jk2B = C4736jk2.b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            c4736jk2B.getClass();
            synchronized (C4736jk2.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = c4736jk2B.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    c4736jk2B.i = pendingResultGoAsync;
                    if (c4736jk2B.h) {
                        pendingResultGoAsync.finish();
                        c4736jk2B.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            AS0.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}

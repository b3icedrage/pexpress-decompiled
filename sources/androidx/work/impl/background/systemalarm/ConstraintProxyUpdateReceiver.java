package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import defpackage.AS0;
import defpackage.C3811fb1;
import defpackage.C4736jk2;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public class a implements Runnable {
        public final /* synthetic */ Intent d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ BroadcastReceiver.PendingResult g;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.d = intent;
            this.e = context;
            this.g = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.g;
            Context context = this.e;
            Intent intent = this.d;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AS0 as0C = AS0.c();
                int i = ConstraintProxyUpdateReceiver.a;
                as0C.getClass();
                C3811fb1.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C3811fb1.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C3811fb1.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C3811fb1.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    static {
        AS0.d("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            C4736jk2.b(context).d.a(new a(intent, context, goAsync()));
        } else {
            AS0.c().getClass();
        }
    }
}

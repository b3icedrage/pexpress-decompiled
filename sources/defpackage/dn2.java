package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dn2 extends BroadcastReceiver {
    public final /* synthetic */ en2 a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Qm2 qm2 = (Qm2) this.a;
        qm2.getClass();
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            qm2.a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        qm2.a.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            qm2.a.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        fn2 fn2Var = qm2.a;
        fn2Var.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        fn2Var.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        fn2Var.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        Gm2 gm2 = new Gm2(intent.getIntExtra("install.status", 0), intent.getIntExtra("error.code", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getStringExtra("package.name"));
        qm2.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", gm2);
        synchronized (qm2) {
            Iterator it = new HashSet(qm2.d).iterator();
            while (it.hasNext()) {
                ((QP1) it.next()).a(gm2);
            }
        }
    }
}

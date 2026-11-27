package defpackage;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class Qj2 extends Binder {
    public final Z60.a b;

    public Qj2(Z60.a aVar) {
        this.b = aVar;
    }

    public final void a(Rj2.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        Z60.this.processIntent(aVar.a).addOnCompleteListener(new ExecutorC4468ii1(), new C7724xz(aVar));
    }
}

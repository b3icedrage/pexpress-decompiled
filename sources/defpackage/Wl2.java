package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class Wl2 implements ServiceConnection {
    public final /* synthetic */ Xl2 a;

    public /* synthetic */ Wl2(Xl2 xl2) {
        this.a = xl2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Xl2 xl2 = this.a;
        xl2.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        xl2.a().post(new Tl2(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Xl2 xl2 = this.a;
        xl2.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        xl2.a().post(new Vl2(this));
    }
}

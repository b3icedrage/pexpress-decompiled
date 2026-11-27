package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class xn2 implements ServiceConnection {
    public final /* synthetic */ yn2 a;

    public /* synthetic */ xn2(yn2 yn2Var) {
        this.a = yn2Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        yn2 yn2Var = this.a;
        yn2Var.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        yn2Var.a().post(new un2(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        yn2 yn2Var = this.a;
        yn2Var.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        yn2Var.a().post(new wn2(this));
    }
}

package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class un2 extends hn2 {
    public final /* synthetic */ IBinder e;
    public final /* synthetic */ xn2 g;

    public un2(xn2 xn2Var, IBinder iBinder) {
        this.g = xn2Var;
        this.e = iBinder;
    }

    @Override // defpackage.hn2
    public final void a() {
        Xm2 rm2;
        xn2 xn2Var = this.g;
        int i = Vm2.b;
        IBinder iBinder = this.e;
        if (iBinder == null) {
            rm2 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            rm2 = iInterfaceQueryLocalInterface instanceof Xm2 ? (Xm2) iInterfaceQueryLocalInterface : new Rm2(iBinder);
        }
        yn2 yn2Var = xn2Var.a;
        yn2Var.m = rm2;
        yn2Var.b.c("linkToDeath", new Object[0]);
        try {
            yn2Var.m.asBinder().linkToDeath(yn2Var.j, 0);
        } catch (RemoteException e) {
            yn2Var.b.b(e, "linkToDeath failed", new Object[0]);
        }
        yn2Var.g = false;
        Iterator it = yn2Var.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        yn2Var.d.clear();
    }
}

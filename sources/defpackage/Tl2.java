package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Tl2 extends AbstractRunnableC7477wm2 {
    public final /* synthetic */ IBinder e;
    public final /* synthetic */ Wl2 g;

    public Tl2(Wl2 wl2, IBinder iBinder) {
        this.g = wl2;
        this.e = iBinder;
    }

    @Override // defpackage.AbstractRunnableC7477wm2
    public final void b() {
        InterfaceC6846tm2 c6426rm2;
        Xl2 xl2 = this.g.a;
        xl2.i.getClass();
        int i = AbstractBinderC6636sm2.b;
        IBinder iBinder = this.e;
        if (iBinder == null) {
            c6426rm2 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            c6426rm2 = iInterfaceQueryLocalInterface instanceof InterfaceC6846tm2 ? (InterfaceC6846tm2) iInterfaceQueryLocalInterface : new C6426rm2(iBinder);
        }
        xl2.n = c6426rm2;
        C7266vm2 c7266vm2 = xl2.b;
        c7266vm2.a("linkToDeath", new Object[0]);
        try {
            xl2.n.asBinder().linkToDeath(xl2.k, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            c7266vm2.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", C7266vm2.b(c7266vm2.a, "linkToDeath failed", objArr), e);
            }
        }
        xl2.g = false;
        Iterator it = xl2.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        xl2.d.clear();
    }
}

package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class ZU implements InterfaceC6118qK {
    public final Context d;
    public final ComponentCallbacks2C1166Hs1.b e;

    public ZU(@NonNull Context context, @NonNull ComponentCallbacks2C1166Hs1.b bVar) {
        this.d = context.getApplicationContext();
        this.e = bVar;
    }

    @Override // defpackage.DP0
    public final void onStart() {
        GM1 gm1A = GM1.a(this.d);
        ComponentCallbacks2C1166Hs1.b bVar = this.e;
        synchronized (gm1A) {
            gm1A.b.add(bVar);
            gm1A.b();
        }
    }

    @Override // defpackage.DP0
    public final void onStop() {
        GM1 gm1A = GM1.a(this.d);
        ComponentCallbacks2C1166Hs1.b bVar = this.e;
        synchronized (gm1A) {
            gm1A.b.remove(bVar);
            if (gm1A.c && gm1A.b.isEmpty()) {
                GM1.c cVar = gm1A.a;
                ((ConnectivityManager) cVar.c.get()).unregisterNetworkCallback(cVar.d);
                gm1A.c = false;
            }
        }
    }

    @Override // defpackage.DP0
    public final void onDestroy() {
    }
}

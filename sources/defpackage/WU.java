package defpackage;

import com.google.firebase.perf.session.gauges.GaugeManager;
import com.onesignal.core.activities.PermissionsActivity;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class WU implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ WU(Object obj, Object obj2, Serializable serializable, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((InterfaceC1649Nx) this.g).b(((UU.b.a) this.e).e, (Throwable) this.h);
                break;
            case 1:
                ((GaugeManager) this.e).lambda$startCollectingGauges$2((String) this.g, (EnumC1134Hi) this.h);
                break;
            default:
                PermissionsActivity.m16onRequestPermissionsResult$lambda0((PermissionsActivity) this.e, (String[]) this.g, (int[]) this.h);
                break;
        }
    }
}

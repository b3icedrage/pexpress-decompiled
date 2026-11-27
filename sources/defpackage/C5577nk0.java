package defpackage;

import com.google.android.gms.common.util.Clock;
import com.google.firebase.perf.session.gauges.GaugeManager;

/* JADX INFO: renamed from: nk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5577nk0 implements InterfaceC1612Nk1 {
    public final /* synthetic */ int a;

    public /* synthetic */ C5577nk0(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC1612Nk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return GaugeManager.lambda$new$0();
            default:
                Clock clock = C6651sr1.j;
                return null;
        }
    }
}

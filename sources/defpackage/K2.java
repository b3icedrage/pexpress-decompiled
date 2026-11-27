package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class K2 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ K2(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new J2((C4923kf) this.b.get(), (M2) ((InterfaceC1454Lk1) this.c).get(), (VK1) ((XK1) this.d).get());
            case 1:
                return new C6136qQ((C4923kf) this.b.get(), (InterfaceC7816yQ) this.c.get(), (InterfaceC1375Kk0) ((C1689Ok0) this.d).get());
            default:
                C6136qQ impl = (C6136qQ) ((K2) this.c).get();
                C4923kf appData = (C4923kf) this.b.get();
                InterfaceC3706f42 telemetry = (InterfaceC3706f42) this.d.get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(telemetry, "telemetry");
                return new FX1(impl, "currencies_updater", new C7946z2(appData, 6), telemetry);
        }
    }

    public K2(C7279vr c7279vr, K2 k2, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = 2;
        this.c = k2;
        this.b = interfaceC1531Mk1;
        this.d = interfaceC1531Mk2;
    }
}

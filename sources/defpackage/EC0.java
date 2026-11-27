package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EC0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public EC0(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.b = interfaceC1531Mk1;
        this.d = ow;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new DC0((C4923kf) this.b.get(), (O3) this.c.get(), (EQ) this.d.get());
            case 1:
                CI impl = (CI) this.b.get();
                C4923kf appData = (C4923kf) this.c.get();
                InterfaceC3706f42 telemetry = (InterfaceC3706f42) this.d.get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(telemetry, "telemetry");
                return new FX1(impl, "config_updater", new WP(appData, 3), telemetry);
            default:
                return new C2275Vx1((C5253mB1) this.b.get(), (InterfaceC3951gE1) ((OW) this.d).get(), (InterfaceC5213m10) this.c.get());
        }
    }

    public EC0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    public EC0(C7279vr c7279vr, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }
}

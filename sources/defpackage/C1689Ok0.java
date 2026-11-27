package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ok0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1689Ok0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1454Lk1 d;

    public /* synthetic */ C1689Ok0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C1611Nk0((L32) this.b.get(), (C4923kf) this.c.get(), (OM) ((VM) this.d).get());
            case 1:
                return new C5913pL1((VK1) ((XK1) this.d).get(), (InterfaceC1547Mq) this.b.get(), (C4923kf) this.c.get());
            case 2:
                return new XV1((Pa2) this.b.get(), (InterfaceC4234hc0) this.c.get(), (InterfaceC4890kV1) ((IT1) this.d).get());
            default:
                C7845yZ1 impl = (C7845yZ1) this.d.get();
                C4923kf appData = (C4923kf) this.b.get();
                InterfaceC3706f42 telemetry = (InterfaceC3706f42) this.c.get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(telemetry, "telemetry");
                return new FX1(impl, "time_updater", new C7121v6(appData, 8), telemetry);
        }
    }

    public C1689Ok0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, XK1 xk1) {
        this.a = 1;
        this.d = xk1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    public C1689Ok0(C7279vr c7279vr, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = 3;
        this.d = interfaceC1454Lk1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }
}

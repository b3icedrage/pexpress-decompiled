package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: Mr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1550Mr implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C1550Mr(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new Lr((InterfaceC3371dV) ((C3320dE) this.b).get(), (InterfaceC8023zP) ((KP) this.c).get());
            case 1:
                return new C3991gS((Map) ((OW) this.b).get(), ((IW0) this.c).a);
            case 2:
                return new C6754tM0((C2750ab2) ((C0742Ch0) this.b).get(), (InterfaceC1442Lg1) this.c.get());
            case 3:
                return new C6845tm1((EK1) ((InterfaceC1454Lk1) this.b).get(), (InterfaceC0836Dm1) ((InterfaceC1454Lk1) this.c).get());
            case 4:
                return new WM1((InterfaceC0715By0) this.b.get(), (C6348rR) ((M4) this.c).get());
            default:
                return new C5103lW1((InterfaceC1442Lg1) this.b.get(), (ZL0) ((C2926bM0) this.c).get());
        }
    }
}

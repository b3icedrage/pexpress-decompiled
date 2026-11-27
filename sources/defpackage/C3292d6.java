package defpackage;

import com.base.feature.activation.screens.common.ActivationFragment;

/* JADX INFO: renamed from: d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3292d6 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C3292d6(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ActivationFragment((Sd2) ((OW) this.b).get(), (InterfaceC3921g6) ((InterfaceC1454Lk1) this.c).get());
            case 1:
                return new C2272Vw1((C5253mB1) this.b.get(), (InterfaceC5213m10) this.c.get());
            case 2:
                return new C6292r82((InterfaceC0715By0) this.b.get(), (C6348rR) ((M4) this.c).get());
            default:
                return new Zf2((C4923kf) this.b.get(), (AbstractC5328ma1) ((InterfaceC1454Lk1) this.c).get());
        }
    }
}

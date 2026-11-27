package defpackage;

import com.impl.feature.launchapp.screens.launchapp.LaunchAppFragmentImpl;

/* JADX INFO: loaded from: classes.dex */
public final class J4 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;

    public /* synthetic */ J4(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new I4((InterfaceC2773ah1) this.b.get(), new C5027l8(), (Pa2) this.c.get(), (AbstractC4595j5) this.d.get(), (AbstractC3917g5) this.e.get());
            default:
                return new LaunchAppFragmentImpl((Sd2) ((OW) this.b).get(), (InterfaceC2394Xb0) ((C2550Zb0) this.c).get(), (InterfaceC5569ni0) ((InterfaceC1454Lk1) this.d).get(), (C2879b71) ((C5038lB) this.e).get());
        }
    }
}

package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: zD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7987zD implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1454Lk1 c;

    public /* synthetic */ C7987zD(int i, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7777yD((InterfaceC1442Lg1) this.b.get(), (Set) ((C4176hJ1) this.c).get());
            case 1:
                return new C0877Ea0((KN) ((C0843Dp) this.b).get(), (InterfaceC4833kC1) ((C0609Ap) this.c).get());
            case 2:
                return new C6370rY0((InterfaceC4430iY0) ((InterfaceC1454Lk1) this.b).get(), (InterfaceC5889pD1) this.c.get());
            default:
                return new C2020Sq1((C4923kf) this.b.get(), (InterfaceC3985gQ) ((C5083lQ) this.c).get());
        }
    }
}

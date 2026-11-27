package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5609nu implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C5609nu(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C5399mu((C4923kf) this.b.get(), new C2726aU0(), (InterfaceC3170cY) this.c.get(), new C3281d30(), new MT0());
            case 1:
                return new LU((C6355rT0) this.b.get(), (Set) ((C4176hJ1) this.c).get(), new C1513Me1());
            default:
                return new I21((C5253mB1) this.b.get(), (InterfaceC3951gE1) ((OW) this.c).get());
        }
    }
}

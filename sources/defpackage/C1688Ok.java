package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: Ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1688Ok implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ C1688Ok(InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C1610Nk((M8) this.b.get());
            case 1:
                return new C8062zb1((InterfaceC5889pD1) this.b.get());
            case 2:
                return new C3358dQ1((EK1) this.b.get());
            default:
                return new C0819Dh((Context) ((C6) this.b).get());
        }
    }
}

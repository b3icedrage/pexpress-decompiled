package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class Z00 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ Z00(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new Y00((ZA1) this.b.get());
            case 1:
                return new C6974uP1((InterfaceC1442Lg1) this.b.get());
            case 2:
                return new C4014gZ1((Context) this.b.get());
            default:
                return new C5551nd2((InterfaceC1442Lg1) this.b.get());
        }
    }
}

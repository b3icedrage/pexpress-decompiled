package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class RQ implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ RQ(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new QQ((RL0) this.b.get());
            case 1:
                return new C4157hD0((InterfaceC1442Lg1) this.b.get());
            case 2:
                return new US1((KQ) this.b.get());
            default:
                return new C6189qf2((Context) this.b.get());
        }
    }
}

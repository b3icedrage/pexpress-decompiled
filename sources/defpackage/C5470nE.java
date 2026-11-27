package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: nE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5470nE implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C5470nE(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C5260mE((InterfaceC1442Lg1) this.b.get());
            case 1:
                return new C1280Je1((Context) this.b.get());
            case 2:
                return new C2431Xn1((InterfaceC1442Lg1) this.b.get());
            default:
                return new C3480e02((ZT1) this.b.get());
        }
    }
}

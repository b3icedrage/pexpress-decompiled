package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: dE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3320dE implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C3320dE(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3110cE((Context) this.b.get());
            case 1:
                return new C3580eV((AbstractC5463nB1) this.b.get());
            case 2:
                return new C6576sX((InterfaceC1442Lg1) this.b.get());
            default:
                return new C3312dB0((AbstractC5463nB1) this.b.get());
        }
    }
}

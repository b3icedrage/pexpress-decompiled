package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class Q3 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ Q3(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new P3((InterfaceC1442Lg1) this.b.get());
            case 1:
                return new C6701t6((C4923kf) this.b.get());
            case 2:
                return new C0949Ey0((InterfaceC1442Lg1) this.b.get());
            default:
                return new C5380mn1((Context) this.b.get());
        }
    }
}

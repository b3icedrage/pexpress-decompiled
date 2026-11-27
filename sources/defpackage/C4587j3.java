package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4587j3 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C4587j3(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4329i3((Context) this.b.get());
            case 1:
                return new C3809fb((Context) this.b.get());
            case 2:
                return new C5258mD0((InterfaceC1442Lg1) this.b.get());
            default:
                return new Y61((InterfaceC1442Lg1) this.b.get());
        }
    }
}

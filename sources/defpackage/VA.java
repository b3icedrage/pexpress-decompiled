package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VA implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ VA(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new UA((C4923kf) this.b.get());
            case 1:
                C4923kf appData = (C4923kf) this.b.get();
                Intrinsics.checkNotNullParameter(appData, "appData");
                return new C6306rD(appData);
            default:
                return new C2277Vy0((InterfaceC1442Lg1) this.b.get());
        }
    }
}

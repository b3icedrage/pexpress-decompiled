package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7037ui implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C7037ui(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C6827ti((InterfaceC1446Li) this.b.get());
            case 1:
                return new J50((InterfaceC1442Lg1) this.b.get());
            case 2:
                return new C3999gU1((InterfaceC7012ub2) this.b.get());
            default:
                AbstractC5328ma1 originProvider = (AbstractC5328ma1) this.b.get();
                Intrinsics.checkNotNullParameter(originProvider, "originProvider");
                return new C7250vi2(originProvider);
        }
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class D11 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ D11(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                JA chartStartTimeProvider = (JA) this.b.get();
                Intrinsics.checkNotNullParameter(chartStartTimeProvider, "chartStartTimeProvider");
                return new C11(chartStartTimeProvider);
            default:
                return new BL1((InterfaceC1442Lg1) this.b.get());
        }
    }
}

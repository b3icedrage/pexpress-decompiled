package defpackage;

import com.base.feature.support.support.screens.common.BottomSheetSupportItemFragment;

/* JADX INFO: renamed from: ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6448ru implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC5331mb0 c;

    public /* synthetic */ C6448ru(int i, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new BottomSheetSupportItemFragment((C4422iV1) this.b.get(), (InterfaceC3371dV) ((C3320dE) this.c).get());
            case 1:
                return new M21((AbstractC5463nB1) this.b.get(), (InterfaceC3951gE1) ((OW) this.c).get());
            default:
                return new C0854Ds1((C7641xb0) ((InterfaceC1454Lk1) this.b).get(), (InterfaceC6444rs1) ((C3523eC) this.c).get());
        }
    }
}

package defpackage;

import com.base.feature.account.screens.common.AccountCommonFragmentBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Z2 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ Z2(int i, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = i;
        this.c = interfaceC1531Mk1;
        this.b = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new AccountCommonFragmentBase((Sd2) ((OW) this.b).get(), (W3) ((InterfaceC1454Lk1) this.c).get());
            case 1:
                C7784yF0 c7784yF0 = (C7784yF0) this.b;
                K8 viewModelProvider = (K8) this.c;
                Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
                FP0 viewLifecycleOwner = c7784yF0.a.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
                return new H8(viewLifecycleOwner, viewModelProvider);
            case 2:
                return new C7611xR1((AbstractC5463nB1) this.c.get(), (InterfaceC3951gE1) ((OW) this.b).get());
            default:
                return new C5559nf2((InterfaceC5979pf2) ((InterfaceC1454Lk1) this.c).get(), (InterfaceC1131Hh) ((C2147Uh) this.b).get());
        }
    }

    public /* synthetic */ Z2(Object obj, InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = obj;
        this.c = interfaceC1454Lk1;
    }
}

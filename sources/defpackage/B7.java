package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class B7 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ B7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new A7((ZT1) ((InterfaceC1531Mk1) this.b).get());
            case 1:
                C7784yF0 c7784yF0 = (C7784yF0) this.b;
                I92 viewModelProvider = I92.a.a;
                Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
                FP0 viewLifecycleOwner = c7784yF0.a.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
                return new F92(viewLifecycleOwner);
            default:
                VK1 showAlertDialogUseCase = (VK1) ((XK1) this.b).get();
                Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
                Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
                return new Nj2(showAlertDialogUseCase);
        }
    }
}

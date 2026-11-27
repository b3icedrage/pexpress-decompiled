package defpackage;

import com.base.feature.bottomsheetdialog.screens.viewpager.ViewPagerBottomSheetFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7994zF0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final InterfaceC5331mb0 c;

    public /* synthetic */ C7994zF0(Object obj, InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = obj;
        this.c = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                C7784yF0 c7784yF0 = (C7784yF0) this.b;
                F8 viewModelProvider = (F8) this.c;
                Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
                FP0 viewLifecycleOwner = c7784yF0.a.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
                return new B8(viewLifecycleOwner, viewModelProvider);
            default:
                return new ViewPagerBottomSheetFragment((AbstractC3405de2) ((InterfaceC1454Lk1) this.b).get(), (InterfaceC3371dV) ((C3320dE) this.c).get());
        }
    }
}

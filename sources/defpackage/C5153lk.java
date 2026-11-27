package defpackage;

import com.impl.core.backend.data_sources.AssetsDataSourceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5153lk implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final InterfaceC1454Lk1 c;

    public /* synthetic */ C5153lk(Object obj, InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = obj;
        this.c = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4943kk((AssetsDataSourceImpl) ((C4265hk) this.b).get(), (InterfaceC4833kC1) ((C0609Ap) this.c).get());
            case 1:
                C7784yF0 c7784yF0 = (C7784yF0) this.b;
                C1343Jz1 viewModelProvider = (C1343Jz1) this.c;
                Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
                FP0 viewLifecycleOwner = c7784yF0.a.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
                return new Ba2(viewLifecycleOwner, viewModelProvider);
            default:
                return new Qa2((C4923kf) ((InterfaceC1531Mk1) this.b).get(), (RL0) this.c.get());
        }
    }
}

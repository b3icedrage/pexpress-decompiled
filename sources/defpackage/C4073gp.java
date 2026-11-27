package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4073gp implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final InterfaceC5331mb0 c;

    public /* synthetic */ C4073gp(Object obj, InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = obj;
        this.c = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3863fp((InterfaceC0715By0) ((InterfaceC1531Mk1) this.b).get(), (C6348rR) ((M4) this.c).get());
            case 1:
                return new C6488s50((InterfaceC0715By0) ((InterfaceC1531Mk1) this.b).get(), (C6348rR) ((M4) this.c).get());
            default:
                C7784yF0 c7784yF0 = (C7784yF0) this.b;
                RD viewModelProvider = (RD) this.c;
                Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
                FP0 viewLifecycleOwner = c7784yF0.a.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
                return new ND(viewLifecycleOwner, viewModelProvider);
        }
    }
}

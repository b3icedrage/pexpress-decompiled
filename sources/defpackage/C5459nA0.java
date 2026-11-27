package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5459nA0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C5459nA0(Object obj, InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = obj;
        this.c = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C5036lA0((Vg2) ((InterfaceC1531Mk1) this.b).get(), (C3836fh2) this.c.get());
            case 1:
                return new C6882ty1((YD1) ((InterfaceC1531Mk1) this.b).get(), (InterfaceC7248vi0) this.c.get(), new C3281d30());
            default:
                C7784yF0 c7784yF0 = (C7784yF0) this.b;
                T5 viewModelProvider = (T5) this.c;
                Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
                FP0 viewLifecycleOwner = c7784yF0.a.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
                return new C4390iL(viewLifecycleOwner, viewModelProvider);
        }
    }
}

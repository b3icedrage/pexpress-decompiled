package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class W5 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ W5(Object obj, InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = obj;
        this.c = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new V5((YX) ((InterfaceC1531Mk1) this.b).get(), (ReporterApi) this.c.get());
            case 1:
                return new C6885tz1((C5253mB1) ((InterfaceC1531Mk1) this.b).get(), (InterfaceC5213m10) this.c.get());
            default:
                C7784yF0 c7784yF0 = (C7784yF0) this.b;
                C1550Mr viewModelProvider = (C1550Mr) this.c;
                Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
                FP0 viewLifecycleOwner = c7784yF0.a.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
                return new C0680Bm1(viewLifecycleOwner, viewModelProvider);
        }
    }
}

package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BF0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final InterfaceC5331mb0 c;

    public /* synthetic */ BF0(Object obj, InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = obj;
        this.c = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                C7784yF0 c7784yF0 = (C7784yF0) this.b;
                C1296Jk viewModelProvider = (C1296Jk) this.c;
                Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
                FP0 viewLifecycleOwner = c7784yF0.a.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
                return new XD(viewLifecycleOwner, viewModelProvider);
            default:
                return new C6666sw1((C4923kf) ((InterfaceC1531Mk1) this.b).get(), (Context) ((C6) this.c).get());
        }
    }
}

package defpackage;

import com.impl.feature.profileandsettings.profile.ProfileFragmentImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class M4 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ M4(Object obj, InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = obj;
        this.c = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new L4((C5253mB1) ((InterfaceC1531Mk1) this.b).get(), (InterfaceC3951gE1) ((OW) this.c).get());
            case 1:
                return new T7((InterfaceC2714aQ0) ((InterfaceC1531Mk1) this.b).get(), (JA) this.c.get());
            case 2:
                return new C6348rR((InterfaceC0565Aa0) ((InterfaceC1531Mk1) this.b).get(), (InterfaceC3655ep1) ((InterfaceC1454Lk1) this.c).get());
            case 3:
                C7784yF0 c7784yF0 = (C7784yF0) this.b;
                C5664o9 viewModelProvider = (C5664o9) this.c;
                Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
                FP0 viewLifecycleOwner = c7784yF0.a.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
                return new Fa2(viewLifecycleOwner, viewModelProvider);
            case 4:
                Sd2 viewModelFactory = (Sd2) ((OW) this.c).get();
                C3110cE clipboardService = (C3110cE) ((C3320dE) this.b).get();
                Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
                Intrinsics.checkNotNullParameter(clipboardService, "clipboardService");
                return new ProfileFragmentImpl(viewModelFactory, clipboardService);
            default:
                return new PA1((InterfaceC0715By0) ((InterfaceC1531Mk1) this.b).get(), (C6348rR) ((M4) this.c).get());
        }
    }

    public M4(OW ow, C3320dE c3320dE) {
        this.a = 4;
        this.c = ow;
        this.b = c3320dE;
    }
}

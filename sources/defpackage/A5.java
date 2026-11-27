package defpackage;

import com.base.feature.robot.indicatorselection.screens.shared.UnlockIndicatorsBottomSheetFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class A5 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ A5(Object obj, InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = obj;
        this.c = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7958z5((C5253mB1) ((InterfaceC1531Mk1) this.b).get(), (InterfaceC3951gE1) ((OW) this.c).get());
            case 1:
                return new C4939kj((InterfaceC0715By0) ((InterfaceC1531Mk1) this.b).get(), (C6348rR) ((M4) this.c).get());
            case 2:
                return new JC0((C4617jA1) ((InterfaceC1531Mk1) this.b).get(), (AbstractC7004uZ1) this.c.get());
            case 3:
                C4701jc animatedAppNavigator = (C4701jc) ((InterfaceC1454Lk1) this.c).get();
                ((Z21) this.b).getClass();
                Intrinsics.checkNotNullParameter(animatedAppNavigator, "animatedAppNavigator");
                C5673oB1 c5673oB1 = new C5673oB1();
                C3733fC c3733fC = new C3733fC(c5673oB1);
                c5673oB1.a.a(animatedAppNavigator);
                return c3733fC;
            case 4:
                return new C3048bw1((InterfaceC2188Uu1) ((InterfaceC1531Mk1) this.b).get(), (InterfaceC6034pv1) ((C1367Kh1) this.c).get());
            default:
                U82 provider = (U82) ((InterfaceC1454Lk1) this.b).get();
                InterfaceC3371dV callbacks = (InterfaceC3371dV) ((C3320dE) this.c).get();
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(callbacks, "callbacks");
                return new UnlockIndicatorsBottomSheetFragment(provider, callbacks);
        }
    }
}

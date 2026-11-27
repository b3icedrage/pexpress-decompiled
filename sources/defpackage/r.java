package defpackage;

import com.base.feature.robot.indicatorselection.screens.ungrouped_indicators.IndicatorSelectionBottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ r(int i, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = i;
        this.c = interfaceC5331mb0;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C6047q((InterfaceC0715By0) ((InterfaceC1531Mk1) this.b).get(), (C6348rR) ((M4) this.c).get());
            case 1:
                return new C4444ic0((YV1) ((C3280d3) this.c).get(), (InterfaceC0565Aa0) ((InterfaceC1531Mk1) this.b).get());
            case 2:
                return new IndicatorSelectionBottomSheetDialogFragment((Sd2) ((OW) this.c).get(), (AbstractC5603ns) ((InterfaceC1531Mk1) this.b).get());
            case 3:
                return new LC0((C4617jA1) ((InterfaceC1531Mk1) this.b).get(), (QC0) this.c.get());
            case 4:
                C3733fC cicerone = (C3733fC) ((InterfaceC1454Lk1) this.c).get();
                ((Z21) this.b).getClass();
                Intrinsics.checkNotNullParameter(cicerone, "cicerone");
                C5673oB1 c5673oB1 = cicerone.a;
                C0957Fb.i(c5673oB1);
                return c5673oB1;
            default:
                return new C7806yM1((C4923kf) ((InterfaceC1531Mk1) this.b).get(), (InterfaceC8087zh2) ((C7933yy1) this.c).get());
        }
    }

    public /* synthetic */ r(Object obj, InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = obj;
        this.c = interfaceC1531Mk1;
    }
}

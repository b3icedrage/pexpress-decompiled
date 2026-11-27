package defpackage;

import com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsBottomSheetDialogFragment;

/* JADX INFO: renamed from: pR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5929pR implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C5929pR(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C5719oR((C6348rR) ((M4) this.b).get());
            case 1:
                C1198Id0 c1198Id0 = ((C5130le0) this.b).a;
                C0957Fb.h(c1198Id0, "Cannot return null from a non-@Nullable @Provides method");
                return c1198Id0;
            case 2:
                return new IndicatorsDetailsBottomSheetDialogFragment((Sd2) ((OW) this.b).get());
            default:
                return new C7507ww1((C6666sw1) ((BF0) this.b).get());
        }
    }
}

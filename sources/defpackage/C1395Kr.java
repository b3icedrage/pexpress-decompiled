package defpackage;

import com.base.feature.robot.robot.confirm_bottomsheet.screens.bet_cofirm.BetConfirmBottomSheetDialogFragment;

/* JADX INFO: renamed from: Kr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1395Kr implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC5331mb0 b;

    public /* synthetic */ C1395Kr(InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new BetConfirmBottomSheetDialogFragment((Sd2) ((OW) this.b).get());
            default:
                return new C5824ov1((InterfaceC4976ku) ((C5609nu) this.b).get());
        }
    }
}

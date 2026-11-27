package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.robot.robot.account_activation.screens.RobotRealAccountActivationPart;
import com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm.StopConfirmBottomSheetDialogFragment;
import com.base.feature.support.support.screens.common.SupportFragment;

/* JADX INFO: renamed from: wy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7513wy1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final OW b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C7513wy1(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = ow;
        this.c = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new RobotRealAccountActivationPart((InterfaceC8143zy1) this.c.get(), (Sd2) this.b.get());
            case 1:
                return new StopConfirmBottomSheetDialogFragment((Sd2) this.b.get(), (ReporterApi) this.c.get());
            default:
                return new SupportFragment((Sd2) this.b.get(), (RV1) this.c.get());
        }
    }

    public C7513wy1(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow) {
        this.a = 0;
        this.c = interfaceC1531Mk1;
        this.b = ow;
    }
}

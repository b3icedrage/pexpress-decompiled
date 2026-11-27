package defpackage;

import com.base.feature.launchapp.screens.vpninstruction.VpnInstructionFragment;
import com.base.feature.robot.robot.asset_selection.RobotAssetSelectionPart;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class H6 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H6(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (Wd2) ((G6) this.e).invoke();
            case 1:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            case 2:
                return (RobotAssetSelectionPart) this.e;
            case 3:
                return (RobotRiskManagementPart) this.e;
            default:
                return (VpnInstructionFragment) this.e;
        }
    }
}

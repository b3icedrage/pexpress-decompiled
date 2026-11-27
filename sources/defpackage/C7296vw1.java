package defpackage;

import com.base.feature.profileandsettings.settings.screens.SettingsFragment;
import com.base.feature.robot.robot.footer.screens.RobotFooterPart;
import com.base.feature.robot.strategyselection.screens.StrategySelectionBottomSheetDialogFragment;

/* JADX INFO: renamed from: vw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7296vw1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final OW b;

    public /* synthetic */ C7296vw1(OW ow, int i) {
        this.a = i;
        this.b = ow;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new RobotFooterPart((Sd2) this.b.get());
            case 1:
                return new SettingsFragment((Sd2) this.b.get());
            default:
                return new StrategySelectionBottomSheetDialogFragment((Sd2) this.b.get());
        }
    }
}

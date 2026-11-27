package defpackage;

import com.base.feature.robot.robot.asset_selection.RobotAssetSelectionPart;
import com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsBottomSheetDialogFragment;
import com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase;

/* JADX INFO: renamed from: gv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4093gv1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final OW b;

    public /* synthetic */ C4093gv1(OW ow, int i) {
        this.a = i;
        this.b = ow;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new RobotAssetSelectionPart((Sd2) this.b.get(), new C3481e1());
            case 1:
                return new StrategyInstructionsBottomSheetDialogFragment((Sd2) this.b.get());
            default:
                return new SupportPopularQuestionsPartBase((Sd2) this.b.get());
        }
    }
}

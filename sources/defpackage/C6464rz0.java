package defpackage;

import com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigBottomSheetDialogFragment;
import com.base.feature.stub.screens.onboarding.StubOnboardingFragmentBase;
import com.base.feature.support.support.screens.need_help.SupportNeedHelpPartBase;

/* JADX INFO: renamed from: rz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6464rz0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final OW b;

    public /* synthetic */ C6464rz0(OW ow, int i) {
        this.a = i;
        this.b = ow;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new IndicatorsManualConfigBottomSheetDialogFragment((Sd2) this.b.get());
            case 1:
                return new StubOnboardingFragmentBase((Sd2) this.b.get());
            default:
                return new SupportNeedHelpPartBase((Sd2) this.b.get());
        }
    }
}

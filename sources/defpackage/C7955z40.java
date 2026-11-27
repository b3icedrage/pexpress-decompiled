package defpackage;

import com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigBottomSheetDialogFragment;
import com.base.feature.stub.screens.onboarding.StubOnboardingFragmentBase;
import com.base.feature.support.support.screens.need_help.SupportNeedHelpPartBase;
import com.impl.feature.registration.screens.duoauth.DuoAuthFragmentImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: z40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7955z40 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7955z40(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (DuoAuthFragmentImpl) this.e;
            case 1:
                return (IndicatorsManualConfigBottomSheetDialogFragment) this.e;
            case 2:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            case 3:
                return (StubOnboardingFragmentBase) this.e;
            default:
                return (SupportNeedHelpPartBase) this.e;
        }
    }
}

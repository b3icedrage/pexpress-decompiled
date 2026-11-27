package defpackage;

import com.base.feature.onboarding.screens.tutorial.TutorialPageFragmentBase;
import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorPageItemFragment;
import com.base.feature.robot.robot.indicators.RobotIndicatorPart;
import com.base.feature.robot.timeselection.screens.TimeSelectionBottomSheetFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class T4 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T4(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (Wd2) ((S4) this.e).invoke();
            case 1:
                VP defaultViewModelCreationExtras = ((IndicatorPageItemFragment) this.e).requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            case 2:
                return (Wd2) ((S4) this.e).invoke();
            case 3:
                return (RobotIndicatorPart) this.e;
            case 4:
                return (TimeSelectionBottomSheetFragment) this.e;
            default:
                VP defaultViewModelCreationExtras2 = ((TutorialPageFragmentBase) this.e).requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras2, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras2;
        }
    }
}

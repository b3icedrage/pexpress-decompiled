package defpackage;

import com.base.feature.onboarding.screens.tutorial.TutorialPageFragmentBase;
import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorPageItemFragment;
import com.impl.feature.activation.register.ReRegistrationFragmentImpl;
import com.impl.feature.platform.screens.verification.AccountVerificationFragmentImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class S4 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S4(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (AccountVerificationFragmentImpl) this.e;
            case 1:
                return (Wd2) ((C3) this.e).invoke();
            case 2:
                Vd2 viewModelStore = ((IndicatorPageItemFragment) this.e).requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            case 3:
                return (ReRegistrationFragmentImpl) this.e;
            case 4:
                return (Wd2) ((C3) this.e).invoke();
            case 5:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            default:
                Vd2 viewModelStore2 = ((TutorialPageFragmentBase) this.e).requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore2, "requireActivity().viewModelStore");
                return viewModelStore2;
        }
    }
}

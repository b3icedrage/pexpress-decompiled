package defpackage;

import com.base.feature.robot.indicatorselection.screens.ungrouped_indicators.IndicatorSelectionBottomSheetDialogFragment;
import com.base.feature.stub.screens.onboarding.page_item.StubOnboardingItemFragment;
import com.impl.feature.robot.account.AccountSelectionFragmentImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class C2 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            case 1:
                return (AccountSelectionFragmentImpl) this.e;
            case 2:
                return (IndicatorSelectionBottomSheetDialogFragment) this.e;
            case 3:
                return C1039Gc0.e(new StringBuilder("Unexpected end of input: yet to parse '"), ((C1747Pd1) this.e).a, '\'');
            case 4:
                return (Wd2) ((B2) this.e).invoke();
            default:
                Vd2 viewModelStore = ((StubOnboardingItemFragment) this.e).requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
        }
    }
}

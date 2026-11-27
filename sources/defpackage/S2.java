package defpackage;

import com.base.feature.account.screens.common.AccountCommonFragmentBase;
import com.base.feature.activation.screens.action_button.ActivationActionButtonFragment;
import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
import com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class S2 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S2(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (AccountCommonFragmentBase) this.e;
            case 1:
                return (ActivationActionButtonFragment) this.e;
            case 2:
                return (BotPrivacyPolicyFragmentImpl) this.e;
            case 3:
                Vd2 viewModelStore = ((IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment) this.e).requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            case 4:
                return (Wd2) ((I6) this.e).invoke();
            default:
                return (Wd2) ((I6) this.e).invoke();
        }
    }
}

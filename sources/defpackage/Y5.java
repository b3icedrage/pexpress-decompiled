package defpackage;

import com.base.feature.activation.screens.common.ActivationFragment;
import com.base.feature.onboarding.screens.tutorial.TutorialFragment;
import com.base.feature.stories.screens.full.FullStoriesFragmentBase;
import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Y5 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y5(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (ActivationFragment) this.e;
            case 1:
                return (Wd2) ((C7034uh0) this.e).invoke();
            case 2:
                return (FullStoriesFragmentBase) this.e;
            case 3:
                return (PlatformFragmentImpl) this.e;
            case 4:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            default:
                Vd2 viewModelStore = ((TutorialFragment) this.e).requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
        }
    }
}

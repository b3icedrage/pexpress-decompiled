package defpackage;

import com.base.feature.onboarding.screens.tutorial.TutorialFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Z5 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z5(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (Wd2) ((Y5) this.e).invoke();
            case 1:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            case 2:
                return (Wd2) ((Y5) this.e).invoke();
            case 3:
                return (Wd2) ((Y5) this.e).invoke();
            default:
                VP defaultViewModelCreationExtras = ((TutorialFragment) this.e).requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
        }
    }
}

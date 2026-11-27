package defpackage;

import com.base.feature.robot.instruction.screens.InstructionFragment;
import com.base.feature.stub.screens.onboarding.page_item.StubOnboardingItemFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4591j4 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4591j4(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (Wd2) ((C2) this.e).invoke();
            case 1:
                return (Wd2) ((C2) this.e).invoke();
            case 2:
                return (InstructionFragment) this.e;
            case 3:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            default:
                VP defaultViewModelCreationExtras = ((StubOnboardingItemFragment) this.e).requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
        }
    }
}

package defpackage;

import com.appsflyer.internal.AFd1jSDK;
import com.base.feature.activation.screens.top_steps.ActivationTopStepsFragment;
import com.base.feature.launchapp.screens.vpninstruction.VpnInstructionFragment;
import com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F6 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ F6(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return ((ActivationTopStepsFragment) this.e).l;
            case 1:
                ((Function0) this.e).invoke();
                return Unit.a;
            case 2:
                return ((SupportPopularQuestionsPartBase) this.e).l;
            case 3:
                return ((VpnInstructionFragment) this.e).j;
            case 4:
                Fg2 fg2 = (Fg2) this.e;
                boolean zN = fg2.n();
                C4923kf c4923kf = fg2.a;
                return new BN1(zN, c4923kf.r, c4923kf.s, new Q2(fg2, 9));
            default:
                return AFd1jSDK.AFKeystoreWrapper((AFd1jSDK) this.e);
        }
    }
}

package defpackage;

import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFf1kSDK;
import com.base.feature.launchapp.screens.launchapp.LaunchAppFragmentBase;
import com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsBottomSheetDialogFragment;
import com.base.feature.robot.robot.account_activation.screens.RobotRealAccountActivationPart;
import com.base.feature.support.support.screens.common.SupportFragment;
import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;
import com.impl.feature.platform.screens.platform_webview.PlatformWebViewFragmentImpl;
import com.impl.feature.registration.screens.forgetpassword.ForgetPasswordFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5500nO implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C5500nO(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                String str = (String) obj;
                Intrinsics.checkNotNull(str);
                return str;
            case 1:
                return ((ForgetPasswordFragmentImpl) obj).o;
            case 2:
                return ((IndicatorsDetailsBottomSheetDialogFragment) obj).i;
            case 3:
                return ((LaunchAppFragmentBase) obj).j;
            case 4:
                int i = PlatformFragmentImpl.H;
                C5189lv.k(C7235vf.a, null, new PlatformFragmentImpl.j((PlatformFragmentImpl) obj, null), 3);
                return Unit.a;
            case 5:
                return ((PlatformWebViewFragmentImpl) obj).t;
            case 6:
                return ((RobotRealAccountActivationPart) obj).m;
            case 7:
                return ((SupportFragment) obj).j;
            case 8:
                ((C4465ih2.a) obj).cancel();
                return Unit.a;
            case 9:
                return ((AFa1tSDK) obj).registerClient();
            default:
                return Boolean.valueOf(AFf1kSDK.AFLogger((AFf1kSDK) obj));
        }
    }
}

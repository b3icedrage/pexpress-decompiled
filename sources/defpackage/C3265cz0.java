package defpackage;

import androidx.activity.OnBackPressedDispatcher;
import com.base.feature.launchapp.screens.launchapp.LaunchAppFragmentBase;
import com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase;
import com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsBottomSheetDialogFragment;
import com.base.feature.robot.robot.account_activation.screens.RobotRealAccountActivationPart;
import com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm.StopConfirmBottomSheetDialogFragment;
import com.base.feature.support.support.screens.common.SupportFragment;
import com.impl.feature.platform.screens.platform_webview.PlatformWebViewFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: cz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3265cz0 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3265cz0(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? r0 = this.e;
        switch (this.d) {
            case 0:
                return (IndicatorsDetailsBottomSheetDialogFragment) r0;
            case 1:
                return ((Wd2) r0.getValue()).getViewModelStore();
            case 2:
                return (LaunchAppFragmentBase) r0;
            case 3:
                ((OnBackPressedDispatcher) r0).c();
                return Unit.a;
            case 4:
                return (PlatformWebViewFragmentImpl) r0;
            case 5:
                return (ProfileFragmentBase) r0;
            case 6:
                return (Wd2) ((C3399dd0) r0).invoke();
            case 7:
                return (RobotRealAccountActivationPart) r0;
            case 8:
                return (Wd2) ((C3399dd0) r0).invoke();
            case 9:
                return (StopConfirmBottomSheetDialogFragment) r0;
            case 10:
                return (Wd2) ((C3399dd0) r0).invoke();
            case 11:
                return (SupportFragment) r0;
            default:
                La2 la2 = (La2) r0;
                String str = la2.f;
                if (str == null) {
                    return null;
                }
                if (str.length() == 0) {
                    return "";
                }
                int length = la2.a.a.length() + 3;
                String str2 = la2.h;
                String strSubstring = str2.substring(length, StringsKt__StringsKt.s(str2, new char[]{':', '@'}, length, false));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
        }
    }
}

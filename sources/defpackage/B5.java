package defpackage;

import RR.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.base.feature.activation.screens.action_button.ActivationActionButtonFragment;
import com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase;
import com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsBottomSheetDialogFragment;
import com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B5 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ B5(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objA;
        NetworkCapabilities networkCapabilities;
        String str;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                return ((ActivationActionButtonFragment) obj).l;
            case 1:
                InterfaceC7446wf interfaceC7446wf = (InterfaceC7446wf) obj;
                Intrinsics.c(interfaceC7446wf, "null cannot be cast to non-null type com.impl.core.backend.data_sources.AppDataSourceImpl");
                return (C0579Af) interfaceC7446wf;
            case 2:
                C5189lv.k(C7235vf.a, null, ((RR) obj).new b(null), 3);
                return Unit.a;
            case 3:
                Object systemService = ((BB1) obj).a.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager == null) {
                    return "unknown";
                }
                try {
                    C1717Ot1.a aVar = C1717Ot1.e;
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    objA = "offline";
                    if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                        if (networkCapabilities.hasTransport(1)) {
                            str = "wifi";
                        } else if (networkCapabilities.hasTransport(0)) {
                            str = "cellular";
                        } else if (networkCapabilities.hasTransport(3)) {
                            str = "ethernet";
                        } else if (networkCapabilities.hasTransport(2)) {
                            str = "bluetooth";
                        } else {
                            str = networkCapabilities.hasTransport(4) ? "vpn" : "other";
                        }
                        objA = str;
                    }
                } catch (Throwable th) {
                    C1717Ot1.a aVar2 = C1717Ot1.e;
                    objA = C1795Pt1.a(th);
                }
                return (String) (C1717Ot1.a(objA) == null ? objA : "unknown");
            case 4:
                ((C5913pL1) obj).getClass();
                return new AbstractC1592Nf.m(R.string.error_starting_robot_description_text);
            case 5:
                return ((StrategyInstructionsBottomSheetDialogFragment) obj).i;
            case 6:
                SupportPopularQuestionsPartBase supportPopularQuestionsPartBase = (SupportPopularQuestionsPartBase) obj;
                Context contextRequireContext = supportPopularQuestionsPartBase.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                return new C3444dp0(contextRequireContext, supportPopularQuestionsPartBase.getResources().getDimensionPixelSize(R.dimen.popular_question_space_between), supportPopularQuestionsPartBase.getResources().getDimensionPixelSize(R.dimen.popular_question_space_border));
            default:
                WebViewFileChooserUseCaseBase webViewFileChooserUseCaseBase = (WebViewFileChooserUseCaseBase) obj;
                webViewFileChooserUseCaseBase.n.a(webViewFileChooserUseCaseBase.b.a());
                return Unit.a;
        }
    }
}

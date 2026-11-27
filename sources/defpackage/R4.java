package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.api.core.deeplinks.models.DeeplinkData;
import com.appsflyer.internal.AFc1aSDK;
import com.base.feature.onboarding.screens.tutorial.TutorialPageFragmentBase;
import com.base.feature.robot.timeselection.screens.TimeSelectionBottomSheetFragment;
import com.google.gson.Gson;
import com.impl.feature.platform.screens.verification.AccountVerificationFragmentImpl;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class R4 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ R4(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Intent intent;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                return ((AccountVerificationFragmentImpl) obj).x;
            case 1:
                int i = ApplicationC0963Fd.F;
                ApplicationC0963Fd applicationC0963Fd = (ApplicationC0963Fd) obj;
                FV0 fv0 = applicationC0963Fd.p;
                if (fv0 == null) {
                    Intrinsics.l("mainActivityProvider");
                    throw null;
                }
                if (fv0.b() == null) {
                    String packageName = applicationC0963Fd.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                    intent = new Intent(Z0.c(StringsKt.N(packageName, ".test"), ".OPEN_SUPPORT_CHAT")).setFlags(268435456);
                } else {
                    FV0 fv1 = applicationC0963Fd.p;
                    if (fv1 == null) {
                        Intrinsics.l("mainActivityProvider");
                        throw null;
                    }
                    intent = new Intent(applicationC0963Fd, fv1.b());
                }
                Gson gson = new Gson();
                PU[] puArr = PU.d;
                GU gu = GU.NAVIGATE_TO_ASSET_SELECTION;
                PendingIntent activity = PendingIntent.getActivity(applicationC0963Fd, 0, intent.putExtra("deeplink_data", gson.i(new DeeplinkData())), 201326592);
                Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
                return activity;
            case 2:
                ((Function0) obj).invoke();
                return Unit.a;
            case 3:
                return (C3668eu) ((C5399mu) obj).g.getValue();
            case 4:
                CQ0 cq0B = VE.b();
                HO ho = (HO) obj;
                cq0B.add(ho.b);
                cq0B.add(ho.c);
                cq0B.add(ho.d);
                return VE.a(cq0B);
            case 5:
                int i2 = AbstractC6558sR.x0;
                return Integer.valueOf(C0648Bc.c((AbstractC6558sR) obj, R.color.chartDefaultMarkerText));
            case 6:
                return ((TimeSelectionBottomSheetFragment) obj).k;
            case 7:
                return ((TutorialPageFragmentBase) obj).k;
            case 8:
                Vg2 vg2 = ((C4720jg2) obj).f;
                if (vg2 != null) {
                    return vg2.F();
                }
                Intrinsics.l("executor");
                throw null;
            default:
                return ((AFc1aSDK) obj).enableTCFDataCollection();
        }
    }
}

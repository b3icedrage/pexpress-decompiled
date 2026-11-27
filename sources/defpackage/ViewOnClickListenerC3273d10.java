package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.alertdialog.screen.DialogFullScreen;
import com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase;
import com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigBottomSheetDialogFragment;
import com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart;
import com.base.feature.robot.robot.indicators.RobotIndicatorPart;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import com.impl.feature.activation.register.ReRegistrationFragmentImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3273d10 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ ViewOnClickListenerC3273d10(Fragment fragment, int i) {
        this.d = i;
        this.e = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                DialogFullScreen dialogFullScreen = (DialogFullScreen) this.e;
                dialogFullScreen.h.l.invoke();
                if (dialogFullScreen.h.q) {
                    dialogFullScreen.dismiss();
                }
                break;
            case 1:
                Object obj = ((DuoAuthFragmentBase) this.e).i;
                Intrinsics.checkNotNull(obj);
                K40 k40 = (K40) obj;
                k40.e.a();
                C5189lv.k(C8056za.j(k40), null, new J40(k40, null), 3);
                break;
            case 2:
                ((IndicatorsManualConfigBottomSheetDialogFragment) this.e).j();
                break;
            case 3:
                ReRegistrationFragmentImpl reRegistrationFragmentImpl = (ReRegistrationFragmentImpl) this.e;
                Object obj2 = reRegistrationFragmentImpl.i;
                Intrinsics.checkNotNull(obj2);
                C7059un1 c7059un1 = (C7059un1) obj2;
                c7059un1.getClass();
                ReporterApi.a.b(c7059un1.z, EnumC5028l80.W0, null, null, 14);
                Object obj3 = reRegistrationFragmentImpl.i;
                Intrinsics.checkNotNull(obj3);
                C7059un1 c7059un2 = (C7059un1) obj3;
                N4 authAction = new N4(reRegistrationFragmentImpl, 6);
                CaptchaDestination.Registration destination = new CaptchaDestination.Registration(0);
                c7059un2.getClass();
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(authAction, "authAction");
                C5189lv.k(C8056za.j(c7059un2), null, new C7269vn1(destination, c7059un2, authAction, null), 3);
                break;
            case 4:
                Object obj4 = ((RobotAccountSelectionPart) this.e).i;
                Intrinsics.checkNotNull(obj4);
                C1798Pu1 c1798Pu1 = (C1798Pu1) obj4;
                c1798Pu1.getClass();
                C5189lv.k(C8056za.j(c1798Pu1), null, new C1720Ou1(c1798Pu1, null), 3);
                break;
            case 5:
                Object obj5 = ((RobotIndicatorPart) this.e).i;
                Intrinsics.checkNotNull(obj5);
                C3889fx1 c3889fx1 = (C3889fx1) obj5;
                c3889fx1.getClass();
                ReporterApi.a.b(c3889fx1.f, EnumC5028l80.g0, null, WE.f(EnumC5326ma.e, EnumC5326ma.g), 10);
                c3889fx1.e.a();
                break;
            default:
                Object obj6 = ((RobotRiskManagementPart) this.e).i;
                Intrinsics.checkNotNull(obj6);
                C2360Wy1 c2360Wy1 = (C2360Wy1) obj6;
                c2360Wy1.getClass();
                C6561sS.g(c2360Wy1, new C3266cz1(c2360Wy1, null));
                break;
        }
    }
}

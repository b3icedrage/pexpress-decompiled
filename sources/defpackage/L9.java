package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.base.feature.alertdialog.screen.AlertDialogWithVerticalButtonsRotated;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import com.base.feature.stub.screens.onboarding.StubOnboardingFragmentBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L9 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ L9(Fragment fragment, int i) {
        this.d = i;
        this.e = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object value;
        switch (this.d) {
            case 0:
                AlertDialogWithVerticalButtonsRotated alertDialogWithVerticalButtonsRotated = (AlertDialogWithVerticalButtonsRotated) this.e;
                alertDialogWithVerticalButtonsRotated.h.l.invoke();
                alertDialogWithVerticalButtonsRotated.dismiss();
                break;
            case 1:
                Object obj = ((RobotRiskManagementPart) this.e).i;
                Intrinsics.checkNotNull(obj);
                C2360Wy1 c2360Wy1 = (C2360Wy1) obj;
                c2360Wy1.getClass();
                C6561sS.g(c2360Wy1, new C3266cz1(c2360Wy1, null));
                break;
            default:
                Object obj2 = ((StubOnboardingFragmentBase) this.e).i;
                Intrinsics.checkNotNull(obj2);
                FT1 ft1 = (FT1) obj2;
                GP1 gp1 = ft1.f;
                if (((Number) gp1.getValue()).intValue() == WE.e(ft1.e)) {
                    ft1.d.a();
                } else {
                    do {
                        value = gp1.getValue();
                    } while (!gp1.d(value, Integer.valueOf(((Number) value).intValue() + 1)));
                }
                break;
        }
    }
}

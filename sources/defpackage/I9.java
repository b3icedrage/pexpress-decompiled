package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.base.feature.alertdialog.screen.AlertDialogWithVerticalButtons;
import com.base.feature.alertdialog.screen.DialogFullScreenCentered;
import com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase;
import com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigBottomSheetDialogFragment;
import com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart;
import com.base.feature.robot.robot.indicators.RobotIndicatorPart;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I9 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ I9(Fragment fragment, int i) {
        this.d = i;
        this.e = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                AlertDialogWithVerticalButtons alertDialogWithVerticalButtons = (AlertDialogWithVerticalButtons) this.e;
                alertDialogWithVerticalButtons.h.m.invoke();
                alertDialogWithVerticalButtons.dismiss();
                break;
            case 1:
                DialogFullScreenCentered dialogFullScreenCentered = (DialogFullScreenCentered) this.e;
                dialogFullScreenCentered.h.m.invoke();
                dialogFullScreenCentered.h.getClass();
                break;
            case 2:
                Object obj = ((DuoAuthFragmentBase) this.e).i;
                Intrinsics.checkNotNull(obj);
                K40 k40 = (K40) obj;
                k40.getClass();
                C5189lv.k(C8056za.j(k40), null, new I40(k40, null), 3);
                C5189lv.k(C8056za.j(k40), null, new H40(k40, null), 3);
                k40.e.a();
                break;
            case 3:
                Object obj2 = ((IndicatorsManualConfigBottomSheetDialogFragment) this.e).g;
                Intrinsics.checkNotNull(obj2);
                ((C6674sz0) obj2).l();
                break;
            case 4:
                Object obj3 = ((RobotAccountSelectionPart) this.e).i;
                Intrinsics.checkNotNull(obj3);
                C1798Pu1 c1798Pu1 = (C1798Pu1) obj3;
                c1798Pu1.getClass();
                C5189lv.k(C8056za.j(c1798Pu1), null, new C1876Qu1(c1798Pu1, null), 3);
                break;
            default:
                Object obj4 = ((RobotIndicatorPart) this.e).i;
                Intrinsics.checkNotNull(obj4);
                C3889fx1 c3889fx1 = (C3889fx1) obj4;
                c3889fx1.getClass();
                c3889fx1.h = C5189lv.k(C8056za.j(c3889fx1), null, new C3679ex1(c3889fx1, null), 3);
                break;
        }
    }
}

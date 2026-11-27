package defpackage;

import android.view.View;
import com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment;
import com.base.feature.robot.robot.confirm_bottomsheet.screens.bet_cofirm.BetConfirmBottomSheetDialogFragment;
import com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.ProfitLimitWithActivationBottomSheet;

/* JADX INFO: renamed from: Er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0927Er implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ AbstractBottomSheetDialogFragment e;
    public final /* synthetic */ Object g;

    public /* synthetic */ ViewOnClickListenerC0927Er(AbstractBottomSheetDialogFragment abstractBottomSheetDialogFragment, Object obj, int i) {
        this.d = i;
        this.e = abstractBottomSheetDialogFragment;
        this.g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.g;
        AbstractBottomSheetDialogFragment abstractBottomSheetDialogFragment = this.e;
        switch (this.d) {
            case 0:
                BetConfirmBottomSheetDialogFragment betConfirmBottomSheetDialogFragment = (BetConfirmBottomSheetDialogFragment) abstractBottomSheetDialogFragment;
                C5189lv.k(C7652xe.f(betConfirmBottomSheetDialogFragment), null, new C1161Hr((C1631Nr) obj, null), 3);
                betConfirmBottomSheetDialogFragment.dismiss();
                break;
            default:
                int i = ProfitLimitWithActivationBottomSheet.m;
                ((ProfitLimitWithActivationBottomSheet) abstractBottomSheetDialogFragment).dismiss();
                ((C4053gj1) obj).g.invoke();
                break;
        }
    }
}

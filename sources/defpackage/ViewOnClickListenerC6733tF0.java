package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import com.base.feature.robot.robot.asset_selection.RobotAssetSelectionPart;
import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import com.base.feature.robot.robot.options.screens.RobotOptionsPart;
import com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.ProfitLimitBottomSheet;
import com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsBottomSheetDialogFragment;
import com.jivosite.sdk.ui.chat.JivoChatFragment;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC6733tF0 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ ViewOnClickListenerC6733tF0(Fragment fragment, int i) {
        this.d = i;
        this.e = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.e;
        switch (this.d) {
            case 0:
                JivoChatFragment this$0 = (JivoChatFragment) fragment;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C6104qF0.i.getClass();
                g activity = this$0.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
            case 1:
                ProfitLimitBottomSheet profitLimitBottomSheet = (ProfitLimitBottomSheet) fragment;
                profitLimitBottomSheet.dismiss();
                profitLimitBottomSheet.d.c.getClass();
                Unit unit = Unit.a;
                break;
            case 2:
                Object obj = ((RobotAssetSelectionPart) fragment).i;
                Intrinsics.checkNotNull(obj);
                C5191lv1 c5191lv1 = (C5191lv1) obj;
                c5191lv1.getClass();
                C6561sS.g(c5191lv1, new C4771jv1(c5191lv1, null));
                break;
            case 3:
                int i = RobotInvestmentPart.v;
                Object obj2 = ((RobotInvestmentPart) fragment).i;
                Intrinsics.checkNotNull(obj2);
                C1259Ix1 c1259Ix1 = (C1259Ix1) obj2;
                c1259Ix1.getClass();
                C6561sS.g(c1259Ix1, new C1337Jx1(c1259Ix1, null));
                break;
            case 4:
                Object obj3 = ((RobotOptionsPart) fragment).i;
                Intrinsics.checkNotNull(obj3);
                C5623ny1 c5623ny1 = (C5623ny1) obj3;
                c5623ny1.getClass();
                C5189lv.k(C8056za.j(c5623ny1), null, new C6043py1(c5623ny1, null), 3);
                break;
            default:
                Object obj4 = ((StrategyInstructionsBottomSheetDialogFragment) fragment).g;
                Intrinsics.checkNotNull(obj4);
                BR1 br1 = (BR1) obj4;
                br1.getClass();
                C5189lv.k(C8056za.j(br1), null, new C8031zR1(br1, null), 3);
                break;
        }
    }
}

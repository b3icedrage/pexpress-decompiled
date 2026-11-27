package defpackage;

import android.view.View;
import com.base.feature.launchapp.screens.vpninstruction.VpnInstructionFragment;
import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import com.base.feature.robot.robot.options.screens.RobotOptionsPart;
import com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsBottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0792Cy implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ViewOnClickListenerC0792Cy(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                ((AbstractC1104Gy) obj).g();
                break;
            case 1:
                int i = RobotInvestmentPart.v;
                Object obj2 = ((RobotInvestmentPart) obj).i;
                Intrinsics.checkNotNull(obj2);
                C1259Ix1 c1259Ix1 = (C1259Ix1) obj2;
                c1259Ix1.getClass();
                C6561sS.g(c1259Ix1, new C1415Kx1(c1259Ix1, null));
                break;
            case 2:
                Object obj3 = ((RobotOptionsPart) obj).i;
                Intrinsics.checkNotNull(obj3);
                C5623ny1 c5623ny1 = (C5623ny1) obj3;
                c5623ny1.getClass();
                C6561sS.g(c5623ny1, new C4780jy1(c5623ny1, null));
                break;
            case 3:
                Object obj4 = ((StrategyInstructionsBottomSheetDialogFragment) obj).g;
                Intrinsics.checkNotNull(obj4);
                BR1 br1 = (BR1) obj4;
                br1.getClass();
                C5189lv.k(C8056za.j(br1), null, new C7821yR1(br1, null), 3);
                break;
            default:
                ((VpnInstructionFragment) obj).l.a();
                break;
        }
    }
}

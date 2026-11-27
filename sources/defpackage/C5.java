package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.base.feature.activation.screens.action_button.ActivationActionButtonFragment;
import com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesPart;
import com.base.feature.robot.robot.options.screens.RobotOptionsPart;
import com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.ProfitLimitWithActivationBottomSheet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ C5(SimpleFragmentInflate simpleFragmentInflate, int i) {
        this.d = i;
        this.e = simpleFragmentInflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.e;
        switch (this.d) {
            case 0:
                Object obj = ((ActivationActionButtonFragment) fragment).i;
                Intrinsics.checkNotNull(obj);
                I5 i5 = (I5) obj;
                i5.getClass();
                C5189lv.k(C8056za.j(i5), null, new H5(i5, null), 3);
                break;
            case 1:
                int i = ProfitLimitWithActivationBottomSheet.m;
                ((ProfitLimitWithActivationBottomSheet) fragment).dismiss();
                Unit unit = Unit.a;
                break;
            case 2:
                Object obj2 = ((RobotDoubleStrategiesPart) fragment).i;
                Intrinsics.checkNotNull(obj2);
                C4984kw1 c4984kw1 = (C4984kw1) obj2;
                c4984kw1.getClass();
                C6561sS.g(c4984kw1, new C5827ow1(c4984kw1, null));
                break;
            default:
                Object obj3 = ((RobotOptionsPart) fragment).i;
                Intrinsics.checkNotNull(obj3);
                ((C5623ny1) obj3).d.d();
                break;
        }
    }

    public /* synthetic */ C5(ProfitLimitWithActivationBottomSheet profitLimitWithActivationBottomSheet, C4053gj1 c4053gj1) {
        this.d = 1;
        this.e = profitLimitWithActivationBottomSheet;
    }
}

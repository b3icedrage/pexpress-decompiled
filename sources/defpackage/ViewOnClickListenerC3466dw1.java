package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesPart;
import com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.WinsInRowBottomSheet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3466dw1 implements View.OnClickListener {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ ViewOnClickListenerC3466dw1(RobotDoubleStrategiesPart robotDoubleStrategiesPart) {
        this.e = robotDoubleStrategiesPart;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.e;
        switch (this.d) {
            case 0:
                Object obj = ((RobotDoubleStrategiesPart) fragment).i;
                Intrinsics.checkNotNull(obj);
                C4984kw1 c4984kw1 = (C4984kw1) obj;
                c4984kw1.getClass();
                C6561sS.g(c4984kw1, new C5617nw1(c4984kw1, null));
                break;
            default:
                int i = WinsInRowBottomSheet.m;
                ((WinsInRowBottomSheet) fragment).dismiss();
                Unit unit = Unit.a;
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC3466dw1(WinsInRowBottomSheet winsInRowBottomSheet, C4053gj1 c4053gj1) {
        this.e = winsInRowBottomSheet;
    }
}

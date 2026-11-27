package defpackage;

import android.view.View;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm.StopConfirmBottomSheetDialogFragment;
import com.base.feature.robot.utils.recyclerbottomsheet.RobotBottomSheetWithTabsDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XQ implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ XQ(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                ((YQ) this.e).v.cancel();
                break;
            case 1:
                ((C1569Mx0) this.e).invoke();
                break;
            case 2:
                VM vm = ((RobotBottomSheetWithTabsDialogFragment) this.e).g;
                Intrinsics.checkNotNull(vm);
                vm.l();
                break;
            default:
                StopConfirmBottomSheetDialogFragment stopConfirmBottomSheetDialogFragment = (StopConfirmBottomSheetDialogFragment) this.e;
                ReporterApi.a.b(stopConfirmBottomSheetDialogFragment.j, EnumC5028l80.r0, new C7117v5("Cancel"), null, 12);
                stopConfirmBottomSheetDialogFragment.dismiss();
                break;
        }
    }
}

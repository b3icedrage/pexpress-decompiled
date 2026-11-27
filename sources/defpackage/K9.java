package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.base.feature.alertdialog.screen.AlertDialogWithVerticalButtonsRotated;
import com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetDialogFragment;
import com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigBottomSheetDialogFragment;
import com.base.feature.support.support.screens.need_help.SupportNeedHelpPartBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K9 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ K9(Fragment fragment, int i) {
        this.d = i;
        this.e = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.e;
        switch (this.d) {
            case 0:
                AlertDialogWithVerticalButtonsRotated alertDialogWithVerticalButtonsRotated = (AlertDialogWithVerticalButtonsRotated) fragment;
                alertDialogWithVerticalButtonsRotated.h.m.invoke();
                alertDialogWithVerticalButtonsRotated.dismiss();
                break;
            case 1:
                Object obj = ((IndicatorsManualConfigBottomSheetDialogFragment) fragment).g;
                Intrinsics.checkNotNull(obj);
                C6674sz0 c6674sz0 = (C6674sz0) obj;
                c6674sz0.getClass();
                C5189lv.k(C8056za.j(c6674sz0), null, new C7304vz0(c6674sz0, null), 3);
                break;
            case 2:
                Object obj2 = ((SupportNeedHelpPartBase) fragment).i;
                Intrinsics.checkNotNull(obj2);
                PV1 pv1 = (PV1) obj2;
                pv1.getClass();
                L80 l80 = L80.MAX_PROFIT;
                AbstractC2903bE1 abstractC2903bE1 = pv1.h;
                abstractC2903bE1.getClass();
                Intrinsics.checkNotNullParameter("support", "screen");
                GP1 gp1 = abstractC2903bE1.a;
                gp1.getClass();
                gp1.m(null, "support");
                pv1.d.b();
                pv1.e.a(false);
                pv1.f.b();
                break;
            default:
                Object obj3 = ((TradingAssetsBottomSheetDialogFragment) fragment).g;
                Intrinsics.checkNotNull(obj3);
                ((AbstractC6898u22) obj3).l();
                break;
        }
    }
}

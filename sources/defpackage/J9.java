package defpackage;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.base.feature.alertdialog.screen.AlertDialogWithVerticalButtons;
import com.base.feature.alertdialog.screen.DialogFullScreenCentered;
import com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetDialogFragment;
import com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigBottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J9 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ DialogFragment e;

    public /* synthetic */ J9(DialogFragment dialogFragment, int i) {
        this.d = i;
        this.e = dialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                AlertDialogWithVerticalButtons alertDialogWithVerticalButtons = (AlertDialogWithVerticalButtons) this.e;
                alertDialogWithVerticalButtons.h.l.invoke();
                alertDialogWithVerticalButtons.dismiss();
                break;
            case 1:
                DialogFullScreenCentered dialogFullScreenCentered = (DialogFullScreenCentered) this.e;
                dialogFullScreenCentered.h.l.invoke();
                dialogFullScreenCentered.h.getClass();
                break;
            case 2:
                Object obj = ((IndicatorsManualConfigBottomSheetDialogFragment) this.e).g;
                Intrinsics.checkNotNull(obj);
                C6674sz0 c6674sz0 = (C6674sz0) obj;
                c6674sz0.getClass();
                C5189lv.k(C8056za.j(c6674sz0), null, new C7094uz0(c6674sz0, null), 3);
                break;
            default:
                Object obj2 = ((TradingAssetsBottomSheetDialogFragment) this.e).g;
                Intrinsics.checkNotNull(obj2);
                AbstractC6898u22 abstractC6898u22 = (AbstractC6898u22) obj2;
                abstractC6898u22.getClass();
                C5189lv.k(C8056za.j(abstractC6898u22), null, new C7108v22(abstractC6898u22, null), 3);
                break;
        }
    }
}

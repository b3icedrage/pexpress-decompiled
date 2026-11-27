package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.base.feature.account.screens.maininfo.AccountMainInfoPartBase;
import com.base.feature.alertdialog.screen.AlertDialogWithCheckBox;
import com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment;
import com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC7950z3 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ ViewOnClickListenerC7950z3(Fragment fragment, int i) {
        this.d = i;
        this.e = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                Object obj = ((AccountMainInfoPartBase) this.e).i;
                Intrinsics.checkNotNull(obj);
                ((K3) obj).q();
                return;
            case 1:
                AlertDialogWithCheckBox alertDialogWithCheckBox = (AlertDialogWithCheckBox) this.e;
                alertDialogWithCheckBox.h.getClass();
                ((C6053q10) alertDialogWithCheckBox.i()).g.isChecked();
                throw null;
            case 2:
                VM vm = ((RobotRecyclerBottomSheetDialogFragment) this.e).g;
                Intrinsics.checkNotNull(vm);
                vm.l();
                return;
            default:
                Object obj2 = ((SupportIssueCategoriesPartBase) this.e).i;
                Intrinsics.checkNotNull(obj2);
                XV1 xv1 = (XV1) obj2;
                xv1.e.c(xv1.d.o());
                return;
        }
    }
}

package defpackage;

import androidx.fragment.app.i;
import com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0582Ag implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C0582Ag(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_information);
                AlertVerticalButtonsDialogParams.g(R.string.real_account_activation_title_text);
                AlertVerticalButtonsDialogParams.f(R.string.just_a_few_steps_left_sub_title);
                TF.a.e(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), new N4((Function0) this.e, 2), 2);
                return Unit.a;
            default:
                i it = (i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return (AbstractBottomSheetDialogFragment) this.e;
        }
    }
}

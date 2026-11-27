package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4249hg implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C4249hg(Object obj, int i) {
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
                AlertVerticalButtonsDialogParams.g(R.string.error_open_options_limit);
                TF.a.e(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), new C4039gg((C6425rm1) this.e, 0), 2);
                break;
            default:
                C4133h61 it = (C4133h61) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                C2119Tx1 c2119Tx1 = (C2119Tx1) this.e;
                it.e(c2119Tx1.a.getString(R.string.error_on_the_platform_side_text));
                it.d(c2119Tx1.a.getString(R.string.open_the_application_to_get_more_info_text));
                it.h = null;
                it.i(0, false, 0);
                break;
        }
        return Unit.a;
    }
}

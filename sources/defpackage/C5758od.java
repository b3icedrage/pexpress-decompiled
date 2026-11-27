package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5758od implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ C5758od(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C4413iS1 initStrictMode = (C4413iS1) obj;
                int i = ApplicationC0963Fd.F;
                Intrinsics.checkNotNullParameter(initStrictMode, "$this$initStrictMode");
                C5968pd config = new C5968pd();
                initStrictMode.getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                throw null;
            default:
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.g(R.string.error_need_vpn_title);
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_error_vpn);
                AlertVerticalButtonsDialogParams.f(R.string.error_need_vpn_sub_title);
                TF.a.e(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), null, 6);
                return Unit.a;
        }
    }
}

package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F4 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ F4(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [ak0, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                G4 g4 = (G4) this.e;
                g4.g.a(iIntValue, g4.h, null);
                break;
            case 1:
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.g(R.string.forgot_passsword_successfully_sent_title);
                AlertVerticalButtonsDialogParams.f(R.string.forgot_passsword_successfully_sent_description);
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_email_sent);
                TF.a.e(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), new X5((O4) this.e, 2), 2);
                break;
            default:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((C2784ak0) this.e).invoke();
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ F4(Function0 function0) {
        this.d = 2;
        this.e = (C2784ak0) function0;
    }
}

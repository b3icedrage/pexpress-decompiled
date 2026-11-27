package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2561Zf implements Function1 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Function e;

    public /* synthetic */ C2561Zf(C2924bL1 c2924bL1) {
        this.e = c2924bL1;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [ak0, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_error_big);
                AlertVerticalButtonsDialogParams.g(R.string.error_connecting_to_the_platform_title);
                AlertVerticalButtonsDialogParams.f(R.string.error_connecting_to_the_platform_description);
                TF.a.b(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), new C4((C2924bL1) this.e, 1), 6);
                break;
            default:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((C2784ak0) this.e).invoke();
                break;
        }
        return Unit.a;
    }
}

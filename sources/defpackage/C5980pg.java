package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5980pg implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ C5980pg(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.g(R.string.connection_error_title_text);
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_error_big);
                TF.a.e(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), null, 6);
                break;
            case 1:
                break;
            default:
                CommonError it = (CommonError) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Unit.a;
    }
}

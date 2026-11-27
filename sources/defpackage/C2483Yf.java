package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2483Yf implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ C2483Yf(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.g(R.string.an_error_occured_text);
                AlertVerticalButtonsDialogParams.f(R.string.error_no_internet_description);
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_error_big);
                TF.a.b(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), null, 14);
                return Unit.a;
            case 1:
                C2332Wp0 HttpClient = (C2332Wp0) obj;
                Intrinsics.checkNotNullParameter(HttpClient, "$this$HttpClient");
                HttpClient.a(C1006Fr0.d, new C6224qp(0));
                HttpClient.a(C2701aM.c, new C5117lb(1));
                return Unit.a;
            case 2:
                EM em = C7236vf0.a;
                return Boolean.TRUE;
            default:
                CommonError it = (CommonError) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.a;
        }
    }
}

package defpackage;

import com.appsflyer.internal.AFa1mSDK;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2219Vf implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ C2219Vf(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_error_big);
                AlertVerticalButtonsDialogParams.g(R.string.connection_error_title_text);
                AlertVerticalButtonsDialogParams.f(R.string.connection_error_description_text);
                TF.a.b(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.try_again_text), new C2141Uf(0), 6);
                return Unit.a;
            default:
                return AFa1mSDK.i(obj);
        }
    }
}

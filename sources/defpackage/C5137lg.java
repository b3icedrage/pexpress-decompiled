package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5137lg implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Function0 g;

    public /* synthetic */ C5137lg(Object obj, Function0 function0, int i) {
        this.d = i;
        this.e = obj;
        this.g = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_network_error_48);
                AlertVerticalButtonsDialogParams.g(R.string.error_no_internet_title);
                AlertVerticalButtonsDialogParams.f(R.string.error_no_internet_description);
                TF.a.b(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.try_again_text), new C4927kg((C6481s31) this.e, 0), 6);
                TF.a.e(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.cancel_text), null, 6);
                C7946z2 action = new C7946z2((C5852p31) this.g, 1);
                Intrinsics.checkNotNullParameter(action, "action");
                AlertVerticalButtonsDialogParams.a.k = action;
                break;
            default:
                ((C7059un1) this.e).Q.setValue((String) obj);
                this.g.invoke();
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0816Dg implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C0816Dg(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C7133v9.a AlertDialogParams = (C7133v9.a) obj;
                Intrinsics.checkNotNullParameter(AlertDialogParams, "$this$AlertDialogParams");
                AlertDialogParams.d(R.drawable.ic_information);
                AlertDialogParams.a(Integer.valueOf(R.string.activate_text), R.color.green, R.color.defaultActivationDialogActionButtonTextColor, new C0738Cg((H2) this.e, 0));
                TF.a.e(AlertDialogParams, Integer.valueOf(R.string.cancel_text), null, 6);
                AlertDialogParams.g(R.string.your_account_is_not_activated_tittle);
                AlertDialogParams.f(R.string.for_withdraw_activate_description);
                return Unit.a;
            default:
                C6990uV it = (C6990uV) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Double.valueOf(it.a[((C4065gm1.a) this.e).a]);
        }
    }
}

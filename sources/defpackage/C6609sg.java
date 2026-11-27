package defpackage;

import com.api.feature.webpage.screen.WebViewFragment;
import com.pexpress.tool.MainActivityImpl;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6609sg implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C6609sg(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.g(R.string.an_error_occured_text);
                AlertVerticalButtonsDialogParams.f(R.string.error_starting_robot_description_text);
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_error_big);
                TF.a.b(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.try_again_text), new C6693t4((C8141zy) obj2, 1), 6);
                return Unit.a;
            case 1:
                C2343Wt c2343Wt = (C2343Wt) obj;
                int i = MainActivityImpl.R;
                ZA1 za1 = ((MainActivityImpl) obj2).w;
                if (za1 != null) {
                    za1.b(c2343Wt.a);
                    return Unit.a;
                }
                Intrinsics.l("rotationProvider");
                throw null;
            default:
                ((WebViewFragment) obj2).w(false);
                return Unit.a;
        }
    }
}

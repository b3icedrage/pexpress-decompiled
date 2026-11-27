package defpackage;

import com.pexpress.tool.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1829Qf implements Function1 {
    public final /* synthetic */ int d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C7133v9.a AlertDialogParams = (C7133v9.a) obj;
                Intrinsics.checkNotNullParameter(AlertDialogParams, "$this$AlertDialogParams");
                AlertDialogParams.d(R.drawable.ic_information);
                AlertDialogParams.g(R.string.enabled_option_text);
                List<? extends Object> args = VE.c(Integer.valueOf(R.string.auto_selection_asset_text));
                Intrinsics.checkNotNullParameter(args, "args");
                AlertDialogParams.a.b = args;
                TF.a.e(AlertDialogParams, Integer.valueOf(R.string.close_text), new C1673Of(0), 2);
                TF.a.b(AlertDialogParams, Integer.valueOf(R.string.turn_off_text), new C1751Pf(), 6);
                return Unit.a;
            default:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Float.valueOf(((Number) pair.d).floatValue());
        }
    }
}

package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class De2 extends ML0 implements Function1<View, FP0> {
    public static final De2 d = new De2(1);

    @Override // kotlin.jvm.functions.Function1
    public final FP0 invoke(View view) {
        View viewParent = view;
        Intrinsics.checkNotNullParameter(viewParent, "viewParent");
        Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
        if (tag instanceof FP0) {
            return (FP0) tag;
        }
        return null;
    }
}

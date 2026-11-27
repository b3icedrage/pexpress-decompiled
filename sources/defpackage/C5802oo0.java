package defpackage;

import android.util.Property;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5802oo0 extends Property<View, Integer> {
    @Override // android.util.Property
    public final Integer get(View view) {
        View view2 = view;
        Intrinsics.checkNotNullParameter(view2, "view");
        return Integer.valueOf(view2.getHeight());
    }

    @Override // android.util.Property
    public final void set(View view, Integer num) {
        View view2 = view;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(view2, "view");
        if (iIntValue == 0) {
            view2.getLayoutParams().height = 0;
            view2.setVisibility(8);
        } else {
            view2.getLayoutParams().height = iIntValue;
            view2.requestLayout();
        }
    }
}

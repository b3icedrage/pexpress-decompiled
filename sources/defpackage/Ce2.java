package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Ce2 extends ML0 implements Function1<View, View> {
    public static final Ce2 d = new Ce2(1);

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(View view) {
        View currentView = view;
        Intrinsics.checkNotNullParameter(currentView, "currentView");
        Object parent = currentView.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}

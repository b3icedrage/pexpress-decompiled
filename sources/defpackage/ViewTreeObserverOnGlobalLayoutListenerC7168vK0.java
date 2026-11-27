package defpackage;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC7168vK0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ C5942pV0 g;

    public ViewTreeObserverOnGlobalLayoutListenerC7168vK0(Activity activity, C5942pV0 c5942pV0) {
        this.e = activity;
        this.g = c5942pV0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity = this.e;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewFindViewById = activity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById(android.R.id.content)");
        View rootView = ((ViewGroup) viewFindViewById).getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getContentRoot(activity).rootView");
        rootView.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        View viewFindViewById2 = activity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "activity.findViewById(android.R.id.content)");
        ((ViewGroup) viewFindViewById2).getLocationOnScreen(iArr);
        View rootView2 = rootView.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView2, "activityRoot.rootView");
        int height = rootView2.getHeight();
        boolean z = ((double) ((height - rect.height()) - iArr[1])) > ((double) height) * 0.15d;
        if (z == this.d) {
            return;
        }
        this.d = z;
        this.g.a.v(z);
    }
}

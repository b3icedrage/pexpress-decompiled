package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.android.core.internal.util.k;

/* JADX INFO: renamed from: Be0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewTreeObserverOnGlobalLayoutListenerC0655Be0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;
    public final /* synthetic */ ViewTreeObserver.OnDrawListener g;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0655Be0(ViewTreeObserver.OnDrawListener onDrawListener, View view, int i) {
        this.d = i;
        this.g = onDrawListener;
        this.e = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.d) {
            case 0:
                ViewTreeObserverOnDrawListenerC0811De0 viewTreeObserverOnDrawListenerC0811De0 = (ViewTreeObserverOnDrawListenerC0811De0) this.g;
                viewTreeObserverOnDrawListenerC0811De0.getClass();
                this.e.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0811De0);
                break;
            default:
                k kVar = (k) this.g;
                kVar.getClass();
                this.e.getViewTreeObserver().removeOnDrawListener(kVar);
                break;
        }
    }
}

package defpackage;

import android.view.View;

/* JADX INFO: renamed from: Ce0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0733Ce0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewTreeObserverOnDrawListenerC0811De0 d;

    public ViewOnAttachStateChangeListenerC0733Ce0(ViewTreeObserverOnDrawListenerC0811De0 viewTreeObserverOnDrawListenerC0811De0) {
        this.d = viewTreeObserverOnDrawListenerC0811De0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnDrawListener(this.d);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
    }
}

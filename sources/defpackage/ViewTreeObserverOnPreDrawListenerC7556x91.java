package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: x91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC7556x91 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View d;
    public ViewTreeObserver e;
    private final Runnable g;

    public ViewTreeObserverOnPreDrawListenerC7556x91(View view, Runnable runnable) {
        this.d = view;
        this.e = view.getViewTreeObserver();
        this.g = runnable;
    }

    @NonNull
    public static void a(@NonNull View view, @NonNull Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC7556x91 viewTreeObserverOnPreDrawListenerC7556x91 = new ViewTreeObserverOnPreDrawListenerC7556x91(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC7556x91);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC7556x91);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.e.isAlive()) {
            this.e.removeOnPreDrawListener(this);
        } else {
            this.d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.d.removeOnAttachStateChangeListener(this);
        this.g.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NonNull View view) {
        this.e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NonNull View view) {
        if (this.e.isAlive()) {
            this.e.removeOnPreDrawListener(this);
        } else {
            this.d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.d.removeOnAttachStateChangeListener(this);
    }
}

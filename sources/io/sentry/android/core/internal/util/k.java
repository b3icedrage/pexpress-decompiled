package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC0655Be0;
import io.sentry.android.core.E;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements ViewTreeObserver.OnDrawListener {

    @NotNull
    public final Handler d = new Handler(Looper.getMainLooper());

    @NotNull
    public final AtomicReference<View> e;

    @NotNull
    public final Runnable g;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(k.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(@NotNull View view, @NotNull Runnable runnable) {
        this.e = new AtomicReference<>(view);
        this.g = runnable;
    }

    public static void a(@NotNull Activity activity, @NotNull Runnable runnable, @NotNull E e) {
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                b(viewPeekDecorView, runnable, e);
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.j(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new j(window, callback, runnable, e)));
            }
        }
    }

    public static void b(@NotNull View view, @NotNull Runnable runnable, @NotNull E e) {
        k kVar = new k(view, runnable);
        e.getClass();
        if (Build.VERSION.SDK_INT >= 26 || (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow())) {
            view.getViewTreeObserver().addOnDrawListener(kVar);
        } else {
            view.addOnAttachStateChangeListener(kVar.new a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View andSet = this.e.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0655Be0(this, andSet, 1));
        this.d.postAtFrontOfQueue(this.g);
    }
}

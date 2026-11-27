package io.sentry.android.core.internal.util;

import android.view.View;
import android.view.Window;
import io.sentry.android.core.E;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ Window d;
    public final /* synthetic */ Window.Callback e;
    public final /* synthetic */ Runnable g;
    public final /* synthetic */ E h;

    public /* synthetic */ j(Window window, Window.Callback callback, Runnable runnable, E e) {
        this.d = window;
        this.e = callback;
        this.g = runnable;
        this.h = e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.d;
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            window.setCallback(this.e);
            k.b(viewPeekDecorView, this.g, this.h);
        }
    }
}

package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: De0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0811De0 implements ViewTreeObserver.OnDrawListener {

    @SuppressLint({"ThreadPoolCreation"})
    public final Handler d = new Handler(Looper.getMainLooper());
    public final AtomicReference<View> e;
    public final RunnableC2477Yd g;

    public ViewTreeObserverOnDrawListenerC0811De0(View view, RunnableC2477Yd runnableC2477Yd) {
        this.e = new AtomicReference<>(view);
        this.g = runnableC2477Yd;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View andSet = this.e.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0655Be0(this, andSet, 0));
        this.d.postAtFrontOfQueue(this.g);
    }
}

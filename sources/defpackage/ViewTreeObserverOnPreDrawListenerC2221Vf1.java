package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Vf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2221Vf1 implements ViewTreeObserver.OnPreDrawListener {

    @SuppressLint({"ThreadPoolCreation"})
    public final Handler d = new Handler(Looper.getMainLooper());
    public final AtomicReference<View> e;
    public final RunnableC2555Zd g;
    public final RunnableC2411Xh h;

    public ViewTreeObserverOnPreDrawListenerC2221Vf1(View view, RunnableC2555Zd runnableC2555Zd, RunnableC2411Xh runnableC2411Xh) {
        this.e = new AtomicReference<>(view);
        this.g = runnableC2555Zd;
        this.h = runnableC2411Xh;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View andSet = this.e.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.d;
        handler.post(this.g);
        handler.postAtFrontOfQueue(this.h);
        return true;
    }
}

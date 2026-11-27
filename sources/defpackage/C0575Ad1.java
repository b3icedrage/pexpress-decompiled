package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: Ad1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0575Ad1 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ViewOnTouchListenerC8070zd1 d;

    public C0575Ad1(ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1) {
        this.d = viewOnTouchListenerC8070zd1;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.d.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.d;
        View.OnLongClickListener onLongClickListener = viewOnTouchListenerC8070zd1.u;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(viewOnTouchListenerC8070zd1.l);
        }
    }
}

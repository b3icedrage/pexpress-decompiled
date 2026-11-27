package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: Bd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnDoubleTapListenerC0653Bd1 implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ ViewOnTouchListenerC8070zd1 d;

    public GestureDetectorOnDoubleTapListenerC0653Bd1(ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1) {
        this.d = viewOnTouchListenerC8070zd1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027 A[Catch: ArrayIndexOutOfBoundsException -> 0x002c, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x002c, blocks: (B:3:0x0003, B:5:0x0015, B:8:0x001d, B:10:0x0023, B:11:0x0027), top: B:15:0x0003 }] */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.d;
        try {
            float fD = viewOnTouchListenerC8070zd1.d();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = viewOnTouchListenerC8070zd1.h;
            if (fD < f) {
                viewOnTouchListenerC8070zd1.e(f, x, y, true);
            } else if (fD >= f) {
                float f2 = viewOnTouchListenerC8070zd1.i;
                if (fD < f2) {
                    viewOnTouchListenerC8070zd1.e(f2, x, y, true);
                } else {
                    viewOnTouchListenerC8070zd1.e(viewOnTouchListenerC8070zd1.g, x, y, true);
                }
            } else {
                viewOnTouchListenerC8070zd1.e(viewOnTouchListenerC8070zd1.g, x, y, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF rectF;
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.d;
        View.OnClickListener onClickListener = viewOnTouchListenerC8070zd1.t;
        if (onClickListener != null) {
            onClickListener.onClick(viewOnTouchListenerC8070zd1.l);
        }
        viewOnTouchListenerC8070zd1.b();
        Matrix matrixC = viewOnTouchListenerC8070zd1.c();
        Drawable drawable = viewOnTouchListenerC8070zd1.l.getDrawable();
        if (drawable != null) {
            rectF = viewOnTouchListenerC8070zd1.r;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrixC.mapRect(rectF);
        } else {
            rectF = null;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (rectF == null || !rectF.contains(x, y)) {
            return false;
        }
        rectF.width();
        rectF.height();
        return true;
    }
}

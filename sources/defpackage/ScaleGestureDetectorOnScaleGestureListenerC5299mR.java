package defpackage;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: mR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC5299mR implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ C5509nR a;

    public ScaleGestureDetectorOnScaleGestureListenerC5299mR(C5509nR c5509nR) {
        this.a = c5509nR;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        if (scaleFactor < 0.0f) {
            return true;
        }
        this.a.j.a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}

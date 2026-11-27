package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView d;

    public a(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.d;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.z.h) - clockFaceView.H;
        if (height != clockFaceView.x) {
            clockFaceView.x = height;
            clockFaceView.q();
            int i = clockFaceView.x;
            ClockHandView clockHandView = clockFaceView.z;
            clockHandView.p = i;
            clockHandView.invalidate();
        }
        return true;
    }
}

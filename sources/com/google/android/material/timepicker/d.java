package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class d extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView d;

    public d(TimePickerView timePickerView) {
        this.d = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i = TimePickerView.x;
        this.d.getClass();
        return false;
    }
}

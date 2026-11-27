package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: renamed from: hZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC4224hZ1 implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector d;

    public ViewOnTouchListenerC4224hZ1(GestureDetector gestureDetector) {
        this.d = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.d.onTouchEvent(motionEvent);
        }
        return false;
    }
}

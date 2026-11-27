package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: renamed from: jC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4621jC extends KO1 {
    @Override // defpackage.KO1
    public final void j(Canvas canvas) {
        for (int i = 0; i < l(); i++) {
            IO1 io1K = k(i);
            int iSave = canvas.save();
            canvas.rotate((i * 360) / l(), getBounds().centerX(), getBounds().centerY());
            io1K.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // defpackage.KO1, defpackage.IO1, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectB = IO1.b(rect);
        int iWidth = (int) (((((double) rectB.width()) * 3.141592653589793d) / 3.5999999046325684d) / ((double) l()));
        int iCenterX = rectB.centerX() - iWidth;
        int iCenterX2 = rectB.centerX() + iWidth;
        for (int i = 0; i < l(); i++) {
            IO1 io1K = k(i);
            int i2 = rectB.top;
            io1K.h(iCenterX, i2, iCenterX2, (iWidth * 2) + i2);
        }
    }
}

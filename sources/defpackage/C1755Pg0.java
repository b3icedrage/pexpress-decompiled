package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: Pg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1755Pg0 extends KO1 {

    /* JADX INFO: renamed from: Pg0$a */
    public class a extends C1780Po1 {
        @Override // defpackage.IO1
        public final ValueAnimator f() {
            float[] fArr = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
            JO1 jo1 = new JO1(this);
            jo1.d(fArr, IO1.E, new Integer[]{0, 0, 255, 255, 0, 0});
            jo1.d(fArr, IO1.x, new Integer[]{-180, -180, 0, 0, 0, 0});
            jo1.d(fArr, IO1.z, new Integer[]{0, 0, 0, 0, 180, 180});
            jo1.c = 2400L;
            jo1.b = new LinearInterpolator();
            return jo1.a();
        }
    }

    @Override // defpackage.KO1
    public final void j(Canvas canvas) {
        Rect rectB = IO1.b(getBounds());
        for (int i = 0; i < l(); i++) {
            int iSave = canvas.save();
            canvas.rotate((i * 90) + 45, rectB.centerX(), rectB.centerY());
            k(i).draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // defpackage.KO1
    public final IO1[] n() {
        a[] aVarArr = new a[4];
        for (int i = 0; i < 4; i++) {
            a aVar = new a();
            aVar.setAlpha(0);
            aVar.k = -180;
            aVarArr[i] = aVar;
            aVar.j = i * 300;
        }
        return aVarArr;
    }

    @Override // defpackage.KO1, defpackage.IO1, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectB = IO1.b(rect);
        int iMin = Math.min(rectB.width(), rectB.height()) / 2;
        int i = rectB.left + iMin + 1;
        int i2 = rectB.top + iMin + 1;
        for (int i3 = 0; i3 < l(); i3++) {
            IO1 io1K = k(i3);
            io1K.h(rectB.left, rectB.top, i, i2);
            Rect rect2 = io1K.t;
            io1K.h = rect2.right;
            io1K.i = rect2.bottom;
        }
    }
}

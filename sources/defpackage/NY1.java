package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class NY1 extends KO1 {

    public class a extends C5254mC {
        public a() {
            i(0.0f);
        }

        @Override // defpackage.IO1
        public final ValueAnimator f() {
            Float fValueOf = Float.valueOf(0.0f);
            float[] fArr = {0.0f, 0.4f, 0.8f, 1.0f};
            JO1 jo1 = new JO1(this);
            jo1.c(fArr, IO1.D, new Float[]{fValueOf, Float.valueOf(1.0f), fValueOf, fValueOf});
            jo1.c = 1400L;
            jo1.b(fArr);
            return jo1.a();
        }
    }

    @Override // defpackage.KO1
    public final void m(IO1... io1Arr) {
        io1Arr[1].j = 160;
        io1Arr[2].j = 320;
    }

    @Override // defpackage.KO1
    public final IO1[] n() {
        return new IO1[]{new a(), new a(), new a()};
    }

    @Override // defpackage.KO1, defpackage.IO1, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectB = IO1.b(rect);
        int iWidth = rectB.width() / 8;
        int iCenterY = rectB.centerY() - iWidth;
        int iCenterY2 = rectB.centerY() + iWidth;
        for (int i = 0; i < l(); i++) {
            int iWidth2 = ((rectB.width() * i) / 3) + rectB.left;
            k(i).h(iWidth2, iCenterY, (iWidth * 2) + iWidth2, iCenterY2);
        }
    }
}

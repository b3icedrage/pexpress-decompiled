package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class Hf2 extends KO1 {

    public class a extends C1780Po1 {
        @Override // defpackage.IO1
        public final ValueAnimator f() {
            Float fValueOf = Float.valueOf(0.4f);
            float[] fArr = {0.0f, 0.2f, 0.4f, 1.0f};
            JO1 jo1 = new JO1(this);
            jo1.c(fArr, IO1.C, new Float[]{fValueOf, Float.valueOf(1.0f), fValueOf, fValueOf});
            jo1.c = 1200L;
            jo1.b(fArr);
            return jo1.a();
        }
    }

    @Override // defpackage.KO1
    public final IO1[] n() {
        a[] aVarArr = new a[5];
        for (int i = 0; i < 5; i++) {
            a aVar = new a();
            aVar.g = 0.4f;
            aVarArr[i] = aVar;
            aVar.j = (i * 100) + 600;
        }
        return aVarArr;
    }

    @Override // defpackage.KO1, defpackage.IO1, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectB = IO1.b(rect);
        int iWidth = rectB.width() / l();
        int iWidth2 = ((rectB.width() / 5) * 3) / 5;
        for (int i = 0; i < l(); i++) {
            IO1 io1K = k(i);
            int i2 = (iWidth / 5) + (i * iWidth) + rectB.left;
            io1K.h(i2, rectB.top, i2 + iWidth2, rectB.bottom);
        }
    }
}

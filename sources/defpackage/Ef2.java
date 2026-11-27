package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import io.sentry.android.core.b0;

/* JADX INFO: loaded from: classes.dex */
public final class Ef2 extends KO1 {

    public class a extends C1780Po1 {
        public final int I;

        public a(int i) {
            this.I = i;
        }

        @Override // defpackage.IO1
        public final ValueAnimator f() {
            float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
            JO1 jo1 = new JO1(this);
            int i = 0;
            jo1.d(fArr, IO1.y, new Integer[]{0, -90, -179, -180, -270, -360});
            jo1.c(fArr, IO1.A, new Float[]{Float.valueOf(0.0f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.0f), Float.valueOf(0.0f)});
            jo1.c(fArr, IO1.B, new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.0f)});
            jo1.c(fArr, IO1.D, new Float[]{Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.0f)});
            jo1.c = 1800L;
            jo1.b(fArr);
            int i2 = this.I;
            if (i2 < 0) {
                b0.e("SpriteAnimatorBuilder", "startFrame should always be non-negative");
            } else {
                i = i2;
            }
            jo1.d = i;
            return jo1.a();
        }
    }

    @Override // defpackage.KO1
    public final IO1[] n() {
        return new IO1[]{new a(0), new a(3)};
    }

    @Override // defpackage.KO1, defpackage.IO1, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Rect rectB = IO1.b(rect);
        super.onBoundsChange(rectB);
        for (int i = 0; i < l(); i++) {
            IO1 io1K = k(i);
            int i2 = rectB.left;
            io1K.h(i2, rectB.top, (rectB.width() / 4) + i2, (rectB.height() / 4) + rectB.top);
        }
    }

    @Override // defpackage.KO1
    public final void m(IO1... io1Arr) {
    }
}

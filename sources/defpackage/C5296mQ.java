package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;

/* JADX INFO: renamed from: mQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5296mQ extends KO1 {

    /* JADX INFO: renamed from: mQ$a */
    public class a extends C1780Po1 {
        @Override // defpackage.IO1
        public final ValueAnimator f() {
            Float fValueOf = Float.valueOf(1.0f);
            float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
            JO1 jo1 = new JO1(this);
            jo1.c(fArr, IO1.D, new Float[]{fValueOf, Float.valueOf(0.0f), fValueOf, fValueOf});
            jo1.c = 1300L;
            jo1.b(fArr);
            return jo1.a();
        }
    }

    @Override // defpackage.KO1
    public final IO1[] n() {
        int[] iArr = {HttpPlatformResponse.MAX_MESSAGE_LENGTH, 300, 400, 100, HttpPlatformResponse.MAX_MESSAGE_LENGTH, 300, 0, 100, HttpPlatformResponse.MAX_MESSAGE_LENGTH};
        a[] aVarArr = new a[9];
        for (int i = 0; i < 9; i++) {
            a aVar = new a();
            aVarArr[i] = aVar;
            aVar.j = iArr[i];
        }
        return aVarArr;
    }

    @Override // defpackage.KO1, defpackage.IO1, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectB = IO1.b(rect);
        int iWidth = (int) (rectB.width() * 0.33f);
        int iHeight = (int) (rectB.height() * 0.33f);
        for (int i = 0; i < l(); i++) {
            int i2 = ((i % 3) * iWidth) + rectB.left;
            int i3 = ((i / 3) * iHeight) + rectB.top;
            k(i).h(i2, i3, i2 + iWidth, i3 + iHeight);
        }
    }
}

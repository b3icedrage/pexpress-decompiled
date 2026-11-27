package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.auth.api.credentials.CredentialsApi;

/* JADX INFO: loaded from: classes.dex */
public final class QA extends KO1 {

    public class a extends C5254mC {
        public a() {
            i(0.0f);
        }

        @Override // defpackage.IO1
        public final ValueAnimator f() {
            Float fValueOf = Float.valueOf(0.0f);
            float[] fArr = {0.0f, 0.5f, 1.0f};
            JO1 jo1 = new JO1(this);
            jo1.c(fArr, IO1.D, new Float[]{fValueOf, Float.valueOf(1.0f), fValueOf});
            jo1.c = 2000L;
            jo1.b(fArr);
            return jo1.a();
        }
    }

    @Override // defpackage.KO1, defpackage.IO1
    public final ValueAnimator f() {
        JO1 jo1 = new JO1(this);
        jo1.d(new float[]{0.0f, 1.0f}, IO1.y, new Integer[]{0, 360});
        jo1.c = 2000L;
        jo1.b = new LinearInterpolator();
        return jo1.a();
    }

    @Override // defpackage.KO1
    public final void m(IO1... io1Arr) {
        io1Arr[1].j = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
    }

    @Override // defpackage.KO1
    public final IO1[] n() {
        return new IO1[]{new a(), new a()};
    }

    @Override // defpackage.KO1, defpackage.IO1, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectB = IO1.b(rect);
        int iWidth = (int) (rectB.width() * 0.6f);
        IO1 io1K = k(0);
        int i = rectB.right;
        int i2 = rectB.top;
        io1K.h(i - iWidth, i2, i, i2 + iWidth);
        IO1 io1K2 = k(1);
        int i3 = rectB.right;
        int i4 = rectB.bottom;
        io1K2.h(i3 - iWidth, i4 - iWidth, i3, i4);
    }
}

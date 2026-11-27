package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.PathInterpolator;

/* JADX INFO: renamed from: al1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2789al1 extends C6870tu1 {
    public C2789al1() {
        i(0.0f);
    }

    @Override // defpackage.IO1
    public final ValueAnimator f() {
        Float fValueOf = Float.valueOf(1.0f);
        float[] fArr = {0.0f, 0.7f, 1.0f};
        JO1 jo1 = new JO1(this);
        jo1.c(fArr, IO1.D, new Float[]{Float.valueOf(0.0f), fValueOf, fValueOf});
        jo1.d(fArr, IO1.E, new Integer[]{255, 178, 0});
        jo1.c = 1000L;
        InterpolatorC4646jK0 interpolatorC4646jK0 = new InterpolatorC4646jK0(new PathInterpolator(0.21f, 0.53f, 0.56f, 0.8f), new float[0]);
        interpolatorC4646jK0.b = fArr;
        jo1.b = interpolatorC4646jK0;
        return jo1.a();
    }
}

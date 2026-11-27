package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class XA1 extends C5254mC {
    @Override // defpackage.IO1
    public final ValueAnimator f() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        JO1 jo1 = new JO1(this);
        jo1.d(fArr, IO1.x, new Integer[]{0, -180, -180});
        jo1.d(fArr, IO1.z, new Integer[]{0, 0, -180});
        jo1.c = 1200L;
        jo1.b(fArr);
        return jo1.a();
    }
}

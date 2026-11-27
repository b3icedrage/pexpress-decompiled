package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: Zk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2578Zk1 extends C5254mC {
    public C2578Zk1() {
        i(0.0f);
    }

    @Override // defpackage.IO1
    public final ValueAnimator f() {
        float[] fArr = {0.0f, 1.0f};
        JO1 jo1 = new JO1(this);
        jo1.c(fArr, IO1.D, new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)});
        jo1.d(fArr, IO1.E, new Integer[]{255, 0});
        jo1.c = 1000L;
        jo1.b(fArr);
        return jo1.a();
    }
}

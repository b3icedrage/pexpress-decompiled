package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: ub0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7010ub0 extends AbstractC4621jC {

    /* JADX INFO: renamed from: ub0$a */
    public class a extends C5254mC {
        @Override // defpackage.IO1
        public final ValueAnimator f() {
            float[] fArr = {0.0f, 0.39f, 0.4f, 1.0f};
            JO1 jo1 = new JO1(this);
            jo1.d(fArr, IO1.E, new Integer[]{0, 0, 255, 0});
            jo1.c = 1200L;
            jo1.b(fArr);
            return jo1.a();
        }
    }

    @Override // defpackage.KO1
    public final IO1[] n() {
        a[] aVarArr = new a[12];
        for (int i = 0; i < 12; i++) {
            a aVar = new a();
            aVar.setAlpha(0);
            aVarArr[i] = aVar;
            aVar.j = i * 100;
        }
        return aVarArr;
    }
}

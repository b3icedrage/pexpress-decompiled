package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: hC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4153hC extends AbstractC4621jC {

    /* JADX INFO: renamed from: hC$a */
    public class a extends C5254mC {
        @Override // defpackage.IO1
        public final ValueAnimator f() {
            Float fValueOf = Float.valueOf(0.0f);
            float[] fArr = {0.0f, 0.5f, 1.0f};
            JO1 jo1 = new JO1(this);
            jo1.c(fArr, IO1.D, new Float[]{fValueOf, Float.valueOf(1.0f), fValueOf});
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
            aVar.i(0.0f);
            aVarArr[i] = aVar;
            aVar.j = i * 100;
        }
        return aVarArr;
    }
}

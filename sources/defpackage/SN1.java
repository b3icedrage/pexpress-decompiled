package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class SN1 extends AbstractC1158Hq {
    public final RectF C;
    public final KL0 D;
    public final float[] E;
    public final Path F;
    public final ZN0 G;
    public Pc2 H;

    public SN1(DU0 du0, ZN0 zn0) {
        super(du0, zn0);
        this.C = new RectF();
        KL0 kl0 = new KL0();
        this.D = kl0;
        this.E = new float[8];
        this.F = new Path();
        this.G = zn0;
        kl0.setAlpha(0);
        kl0.setStyle(Paint.Style.FILL);
        kl0.setColor(zn0.l);
    }

    @Override // defpackage.AbstractC1158Hq, defpackage.InterfaceC5489nK0
    public final void c(ColorFilter colorFilter, NU0 nu0) {
        super.c(colorFilter, nu0);
        if (colorFilter == IU0.F) {
            this.H = new Pc2(nu0, null);
        }
    }

    @Override // defpackage.AbstractC1158Hq, defpackage.X30
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        RectF rectF2 = this.C;
        ZN0 zn0 = this.G;
        rectF2.set(0.0f, 0.0f, zn0.j, zn0.k);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.AbstractC1158Hq
    public final void l(Canvas canvas, Matrix matrix, int i) {
        ZN0 zn0 = this.G;
        int iAlpha = Color.alpha(zn0.l);
        if (iAlpha == 0) {
            return;
        }
        AbstractC1002Fq<Integer, Integer> abstractC1002Fq = this.w.j;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (abstractC1002Fq == null ? 100 : abstractC1002Fq.f().intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        KL0 kl0 = this.D;
        kl0.setAlpha(iIntValue);
        Pc2 pc2 = this.H;
        if (pc2 != null) {
            kl0.setColorFilter((ColorFilter) pc2.f());
        }
        if (iIntValue > 0) {
            float[] fArr = this.E;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = zn0.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = zn0.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.F;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, kl0);
        }
    }
}

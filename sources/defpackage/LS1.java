package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class LS1 extends AbstractC1862Qq {
    public final AbstractC1158Hq r;
    public final String s;
    public final boolean t;
    public final C3532eF u;
    public Pc2 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public LS1(DU0 du0, AbstractC1158Hq abstractC1158Hq, C4389iK1 c4389iK1) {
        int iOrdinal = c4389iK1.g.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = c4389iK1.h.ordinal();
        super(du0, abstractC1158Hq, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, c4389iK1.i, c4389iK1.e, c4389iK1.f, c4389iK1.c, c4389iK1.b);
        this.r = abstractC1158Hq;
        this.s = c4389iK1.a;
        this.t = c4389iK1.j;
        AbstractC1002Fq<Integer, Integer> abstractC1002FqJ = c4389iK1.d.j();
        this.u = (C3532eF) abstractC1002FqJ;
        abstractC1002FqJ.a(this);
        abstractC1158Hq.g(abstractC1002FqJ);
    }

    @Override // defpackage.AbstractC1862Qq, defpackage.InterfaceC5489nK0
    public final void c(ColorFilter colorFilter, NU0 nu0) {
        super.c(colorFilter, nu0);
        PointF pointF = IU0.a;
        C3532eF c3532eF = this.u;
        if (colorFilter == 2) {
            c3532eF.k(nu0);
            return;
        }
        if (colorFilter == IU0.F) {
            Pc2 pc2 = this.v;
            AbstractC1158Hq abstractC1158Hq = this.r;
            if (pc2 != null) {
                abstractC1158Hq.q(pc2);
            }
            Pc2 pc3 = new Pc2(nu0, null);
            this.v = pc3;
            pc3.a(this);
            abstractC1158Hq.g(c3532eF);
        }
    }

    @Override // defpackage.DL
    public final String getName() {
        return this.s;
    }

    @Override // defpackage.AbstractC1862Qq, defpackage.X30
    public final void h(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        C3532eF c3532eF = this.u;
        int iL = c3532eF.l(c3532eF.b(), c3532eF.d());
        KL0 kl0 = this.i;
        kl0.setColor(iL);
        Pc2 pc2 = this.v;
        if (pc2 != null) {
            kl0.setColorFilter((ColorFilter) pc2.f());
        }
        super.h(canvas, matrix, i);
    }
}

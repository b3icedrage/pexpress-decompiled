package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LH extends AbstractC1158Hq {
    public AbstractC1002Fq<Float, Float> C;
    public final ArrayList D;
    public final RectF E;
    public final RectF F;
    public final Paint G;
    public boolean H;

    public LH(DU0 du0, ZN0 zn0, List<ZN0> list, C3788fU0 c3788fU0) {
        int i;
        AbstractC1158Hq abstractC1158Hq;
        AbstractC1158Hq lh;
        super(du0, zn0);
        this.D = new ArrayList();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Paint();
        this.H = true;
        C1973Sb c1973Sb = zn0.s;
        if (c1973Sb != null) {
            AbstractC1002Fq<Float, Float> abstractC1002FqJ = c1973Sb.j();
            this.C = abstractC1002FqJ;
            g(abstractC1002FqJ);
            this.C.a(this);
        } else {
            this.C = null;
        }
        HT0 ht0 = new HT0(c3788fU0.i.size());
        int size = list.size() - 1;
        AbstractC1158Hq abstractC1158Hq2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            ZN0 zn1 = list.get(size);
            int iOrdinal = zn1.e.ordinal();
            if (iOrdinal == 0) {
                lh = new LH(du0, zn1, (List) c3788fU0.c.get(zn1.g), c3788fU0);
            } else if (iOrdinal == 1) {
                lh = new SN1(du0, zn1);
            } else if (iOrdinal == 2) {
                lh = new C5826ow0(du0, zn1);
            } else if (iOrdinal == 3) {
                lh = new C3298d71(du0, zn1);
            } else if (iOrdinal == 4) {
                lh = new C2921bK1(du0, zn1, this, c3788fU0);
            } else if (iOrdinal != 5) {
                CS0.b("Unknown layer type " + zn1.e);
                lh = null;
            } else {
                lh = new C2739aY1(du0, zn1);
            }
            if (lh != null) {
                ht0.g(lh.p.d, lh);
                if (abstractC1158Hq2 != null) {
                    abstractC1158Hq2.s = lh;
                    abstractC1158Hq2 = null;
                } else {
                    this.D.add(0, lh);
                    int iOrdinal2 = zn1.u.ordinal();
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        abstractC1158Hq2 = lh;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < ht0.i(); i++) {
            AbstractC1158Hq abstractC1158Hq3 = (AbstractC1158Hq) ht0.d(ht0.e(i), null);
            if (abstractC1158Hq3 != null && (abstractC1158Hq = (AbstractC1158Hq) ht0.d(abstractC1158Hq3.p.f, null)) != null) {
                abstractC1158Hq3.t = abstractC1158Hq;
            }
        }
    }

    @Override // defpackage.AbstractC1158Hq, defpackage.InterfaceC5489nK0
    public final void c(ColorFilter colorFilter, NU0 nu0) {
        super.c(colorFilter, nu0);
        if (colorFilter == IU0.z) {
            Pc2 pc2 = new Pc2(nu0, null);
            this.C = pc2;
            pc2.a(this);
            g(this.C);
        }
    }

    @Override // defpackage.AbstractC1158Hq, defpackage.X30
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.E;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC1158Hq) arrayList.get(size)).f(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.AbstractC1158Hq
    public final void l(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.F;
        ZN0 zn0 = this.p;
        rectF.set(0.0f, 0.0f, zn0.o, zn0.p);
        matrix.mapRect(rectF);
        boolean z = this.o.x;
        ArrayList arrayList = this.D;
        boolean z2 = z && arrayList.size() > 1 && i != 255;
        if (z2) {
            Paint paint = this.G;
            paint.setAlpha(i);
            C7857yc2.e(canvas, rectF, paint);
        } else {
            canvas.save();
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.H || !"__container".equals(zn0.c)) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((AbstractC1158Hq) arrayList.get(size)).h(canvas, matrix, i);
            }
        }
        canvas.restore();
        C0564Aa.i();
    }

    @Override // defpackage.AbstractC1158Hq
    public final void r(C5279mK0 c5279mK0, int i, ArrayList arrayList, C5279mK0 c5279mK1) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.D;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((AbstractC1158Hq) arrayList2.get(i2)).e(c5279mK0, i, arrayList, c5279mK1);
            i2++;
        }
    }

    @Override // defpackage.AbstractC1158Hq
    public final void s(boolean z) {
        super.s(z);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((AbstractC1158Hq) it.next()).s(z);
        }
    }

    @Override // defpackage.AbstractC1158Hq
    public final void t(float f) {
        super.t(f);
        AbstractC1002Fq<Float, Float> abstractC1002Fq = this.C;
        ZN0 zn0 = this.p;
        if (abstractC1002Fq != null) {
            C3788fU0 c3788fU0 = this.o.d;
            f = ((abstractC1002Fq.f().floatValue() * zn0.b.m) - zn0.b.k) / ((c3788fU0.l - c3788fU0.k) + 0.01f);
        }
        if (this.C == null) {
            C3788fU0 c3788fU1 = zn0.b;
            f -= zn0.n / (c3788fU1.l - c3788fU1.k);
        }
        if (zn0.m != 0.0f && !"__container".equals(zn0.c)) {
            f /= zn0.m;
        }
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC1158Hq) arrayList.get(size)).t(f);
        }
    }
}

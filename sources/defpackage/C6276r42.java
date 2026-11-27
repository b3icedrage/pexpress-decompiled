package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: renamed from: r42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6276r42 {
    public final Matrix a = new Matrix();
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public AbstractC1002Fq<PointF, PointF> f;
    public AbstractC1002Fq<?, PointF> g;
    public AbstractC1002Fq<ZC1, ZC1> h;
    public AbstractC1002Fq<Float, Float> i;
    public AbstractC1002Fq<Integer, Integer> j;
    public C4036gf0 k;
    public C4036gf0 l;
    public AbstractC1002Fq<?, Float> m;
    public AbstractC1002Fq<?, Float> n;

    public C6276r42(C3603ec c3603ec) {
        C2207Vb c2207Vb = c3603ec.a;
        this.f = c2207Vb == null ? null : c2207Vb.j();
        InterfaceC4023gc<PointF, PointF> interfaceC4023gc = c3603ec.b;
        this.g = interfaceC4023gc == null ? null : interfaceC4023gc.j();
        C2471Yb c2471Yb = c3603ec.c;
        this.h = c2471Yb == null ? null : c2471Yb.j();
        C1973Sb c1973Sb = c3603ec.d;
        this.i = c1973Sb == null ? null : c1973Sb.j();
        C1973Sb c1973Sb2 = c3603ec.f;
        C4036gf0 c4036gf0 = c1973Sb2 == null ? null : (C4036gf0) c1973Sb2.j();
        this.k = c4036gf0;
        if (c4036gf0 != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        C1973Sb c1973Sb3 = c3603ec.g;
        this.l = c1973Sb3 == null ? null : (C4036gf0) c1973Sb3.j();
        C2129Ub c2129Ub = c3603ec.e;
        if (c2129Ub != null) {
            this.j = c2129Ub.j();
        }
        C1973Sb c1973Sb4 = c3603ec.h;
        if (c1973Sb4 != null) {
            this.m = c1973Sb4.j();
        } else {
            this.m = null;
        }
        C1973Sb c1973Sb5 = c3603ec.i;
        if (c1973Sb5 != null) {
            this.n = c1973Sb5.j();
        } else {
            this.n = null;
        }
    }

    public final void a(AbstractC1158Hq abstractC1158Hq) {
        abstractC1158Hq.g(this.j);
        abstractC1158Hq.g(this.m);
        abstractC1158Hq.g(this.n);
        abstractC1158Hq.g(this.f);
        abstractC1158Hq.g(this.g);
        abstractC1158Hq.g(this.h);
        abstractC1158Hq.g(this.i);
        abstractC1158Hq.g(this.k);
        abstractC1158Hq.g(this.l);
    }

    public final void b(AbstractC1002Fq.a aVar) {
        AbstractC1002Fq<Integer, Integer> abstractC1002Fq = this.j;
        if (abstractC1002Fq != null) {
            abstractC1002Fq.a(aVar);
        }
        AbstractC1002Fq<?, Float> abstractC1002Fq2 = this.m;
        if (abstractC1002Fq2 != null) {
            abstractC1002Fq2.a(aVar);
        }
        AbstractC1002Fq<?, Float> abstractC1002Fq3 = this.n;
        if (abstractC1002Fq3 != null) {
            abstractC1002Fq3.a(aVar);
        }
        AbstractC1002Fq<PointF, PointF> abstractC1002Fq4 = this.f;
        if (abstractC1002Fq4 != null) {
            abstractC1002Fq4.a(aVar);
        }
        AbstractC1002Fq<?, PointF> abstractC1002Fq5 = this.g;
        if (abstractC1002Fq5 != null) {
            abstractC1002Fq5.a(aVar);
        }
        AbstractC1002Fq<ZC1, ZC1> abstractC1002Fq6 = this.h;
        if (abstractC1002Fq6 != null) {
            abstractC1002Fq6.a(aVar);
        }
        AbstractC1002Fq<Float, Float> abstractC1002Fq7 = this.i;
        if (abstractC1002Fq7 != null) {
            abstractC1002Fq7.a(aVar);
        }
        C4036gf0 c4036gf0 = this.k;
        if (c4036gf0 != null) {
            c4036gf0.a(aVar);
        }
        C4036gf0 c4036gf1 = this.l;
        if (c4036gf1 != null) {
            c4036gf1.a(aVar);
        }
    }

    public final boolean c(ColorFilter colorFilter, NU0 nu0) {
        if (colorFilter == IU0.a) {
            AbstractC1002Fq<PointF, PointF> abstractC1002Fq = this.f;
            if (abstractC1002Fq == null) {
                this.f = new Pc2(nu0, new PointF());
                return true;
            }
            abstractC1002Fq.k(nu0);
            return true;
        }
        if (colorFilter == IU0.b) {
            AbstractC1002Fq<?, PointF> abstractC1002Fq2 = this.g;
            if (abstractC1002Fq2 == null) {
                this.g = new Pc2(nu0, new PointF());
                return true;
            }
            abstractC1002Fq2.k(nu0);
            return true;
        }
        if (colorFilter == IU0.c) {
            AbstractC1002Fq<?, PointF> abstractC1002Fq3 = this.g;
            if (abstractC1002Fq3 instanceof EO1) {
                EO1 eo1 = (EO1) abstractC1002Fq3;
                NU0<Float> nu1 = eo1.m;
                eo1.m = nu0;
                return true;
            }
        }
        if (colorFilter == IU0.d) {
            AbstractC1002Fq<?, PointF> abstractC1002Fq4 = this.g;
            if (abstractC1002Fq4 instanceof EO1) {
                EO1 eo2 = (EO1) abstractC1002Fq4;
                NU0<Float> nu2 = eo2.n;
                eo2.n = nu0;
                return true;
            }
        }
        if (colorFilter == IU0.j) {
            AbstractC1002Fq<ZC1, ZC1> abstractC1002Fq5 = this.h;
            if (abstractC1002Fq5 == null) {
                this.h = new Pc2(nu0, new ZC1());
                return true;
            }
            abstractC1002Fq5.k(nu0);
            return true;
        }
        if (colorFilter == IU0.k) {
            AbstractC1002Fq<Float, Float> abstractC1002Fq6 = this.i;
            if (abstractC1002Fq6 == null) {
                this.i = new Pc2(nu0, Float.valueOf(0.0f));
                return true;
            }
            abstractC1002Fq6.k(nu0);
            return true;
        }
        if (colorFilter == 3) {
            AbstractC1002Fq<Integer, Integer> abstractC1002Fq7 = this.j;
            if (abstractC1002Fq7 == null) {
                this.j = new Pc2(nu0, 100);
                return true;
            }
            abstractC1002Fq7.k(nu0);
            return true;
        }
        if (colorFilter == IU0.x) {
            AbstractC1002Fq<?, Float> abstractC1002Fq8 = this.m;
            if (abstractC1002Fq8 == null) {
                this.m = new Pc2(nu0, Float.valueOf(100.0f));
                return true;
            }
            abstractC1002Fq8.k(nu0);
            return true;
        }
        if (colorFilter == IU0.y) {
            AbstractC1002Fq<?, Float> abstractC1002Fq9 = this.n;
            if (abstractC1002Fq9 == null) {
                this.n = new Pc2(nu0, Float.valueOf(100.0f));
                return true;
            }
            abstractC1002Fq9.k(nu0);
            return true;
        }
        if (colorFilter == IU0.l) {
            if (this.k == null) {
                this.k = new C4036gf0(Collections.singletonList(new C7589xK0(Float.valueOf(0.0f))));
            }
            this.k.k(nu0);
            return true;
        }
        if (colorFilter != IU0.m) {
            return false;
        }
        if (this.l == null) {
            this.l = new C4036gf0(Collections.singletonList(new C7589xK0(Float.valueOf(0.0f))));
        }
        this.l.k(nu0);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointFF;
        PointF pointFF2;
        Matrix matrix = this.a;
        matrix.reset();
        AbstractC1002Fq<?, PointF> abstractC1002Fq = this.g;
        if (abstractC1002Fq != null && (pointFF2 = abstractC1002Fq.f()) != null) {
            float f = pointFF2.x;
            if (f != 0.0f || pointFF2.y != 0.0f) {
                matrix.preTranslate(f, pointFF2.y);
            }
        }
        AbstractC1002Fq<Float, Float> abstractC1002Fq2 = this.i;
        if (abstractC1002Fq2 != null) {
            float fFloatValue = abstractC1002Fq2 instanceof Pc2 ? abstractC1002Fq2.f().floatValue() : ((C4036gf0) abstractC1002Fq2).l();
            if (fFloatValue != 0.0f) {
                matrix.preRotate(fFloatValue);
            }
        }
        C4036gf0 c4036gf0 = this.k;
        if (c4036gf0 != null) {
            C4036gf0 c4036gf1 = this.l;
            float fCos = c4036gf1 == null ? 0.0f : (float) Math.cos(Math.toRadians((-c4036gf1.l()) + 90.0f));
            C4036gf0 c4036gf2 = this.l;
            float fSin = c4036gf2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-c4036gf2.l()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(c4036gf0.l()));
            d();
            float[] fArr = this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f2;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        AbstractC1002Fq<ZC1, ZC1> abstractC1002Fq3 = this.h;
        if (abstractC1002Fq3 != null) {
            ZC1 zc1F = abstractC1002Fq3.f();
            float f3 = zc1F.a;
            if (f3 != 1.0f || zc1F.b != 1.0f) {
                matrix.preScale(f3, zc1F.b);
            }
        }
        AbstractC1002Fq<PointF, PointF> abstractC1002Fq4 = this.f;
        if (abstractC1002Fq4 != null && (((pointFF = abstractC1002Fq4.f()) != null && pointFF.x != 0.0f) || pointFF.y != 0.0f)) {
            matrix.preTranslate(-pointFF.x, -pointFF.y);
        }
        return matrix;
    }

    public final Matrix f(float f) {
        AbstractC1002Fq<?, PointF> abstractC1002Fq = this.g;
        PointF pointFF = abstractC1002Fq == null ? null : abstractC1002Fq.f();
        AbstractC1002Fq<ZC1, ZC1> abstractC1002Fq2 = this.h;
        ZC1 zc1F = abstractC1002Fq2 == null ? null : abstractC1002Fq2.f();
        Matrix matrix = this.a;
        matrix.reset();
        if (pointFF != null) {
            matrix.preTranslate(pointFF.x * f, pointFF.y * f);
        }
        if (zc1F != null) {
            double d = f;
            matrix.preScale((float) Math.pow(zc1F.a, d), (float) Math.pow(zc1F.b, d));
        }
        AbstractC1002Fq<Float, Float> abstractC1002Fq3 = this.i;
        if (abstractC1002Fq3 != null) {
            float fFloatValue = abstractC1002Fq3.f().floatValue();
            AbstractC1002Fq<PointF, PointF> abstractC1002Fq4 = this.f;
            PointF pointFF2 = abstractC1002Fq4 != null ? abstractC1002Fq4.f() : null;
            matrix.preRotate(fFloatValue * f, pointFF2 == null ? 0.0f : pointFF2.x, pointFF2 != null ? pointFF2.y : 0.0f);
        }
        return matrix;
    }
}

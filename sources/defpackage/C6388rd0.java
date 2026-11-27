package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: rd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6388rd0 implements X30, AbstractC1002Fq.a, InterfaceC5699oK0 {
    public final Path a;
    public final KL0 b;
    public final AbstractC1158Hq c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final C3532eF g;
    public final IB0 h;
    public Pc2 i;
    public final DU0 j;
    public AbstractC1002Fq<Float, Float> k;
    public float l;
    public final C3285d40 m;

    public C6388rd0(DU0 du0, AbstractC1158Hq abstractC1158Hq, WJ1 wj1) {
        Path path = new Path();
        this.a = path;
        this.b = new KL0(1);
        this.f = new ArrayList();
        this.c = abstractC1158Hq;
        this.d = wj1.c;
        this.e = wj1.f;
        this.j = du0;
        if (abstractC1158Hq.m() != null) {
            AbstractC1002Fq<Float, Float> abstractC1002FqJ = abstractC1158Hq.m().a.j();
            this.k = abstractC1002FqJ;
            abstractC1002FqJ.a(this);
            abstractC1158Hq.g(this.k);
        }
        if (abstractC1158Hq.n() != null) {
            this.m = new C3285d40(this, abstractC1158Hq, abstractC1158Hq.n());
        }
        C1895Rb c1895Rb = wj1.d;
        if (c1895Rb == null) {
            this.g = null;
            this.h = null;
            return;
        }
        C2129Ub c2129Ub = wj1.e;
        path.setFillType(wj1.b);
        AbstractC1002Fq<Integer, Integer> abstractC1002FqJ2 = c1895Rb.j();
        this.g = (C3532eF) abstractC1002FqJ2;
        abstractC1002FqJ2.a(this);
        abstractC1158Hq.g(abstractC1002FqJ2);
        AbstractC1002Fq<Integer, Integer> abstractC1002FqJ3 = c2129Ub.j();
        this.h = (IB0) abstractC1002FqJ3;
        abstractC1002FqJ3.a(this);
        abstractC1158Hq.g(abstractC1002FqJ3);
    }

    @Override // defpackage.AbstractC1002Fq.a
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.DL
    public final void b(List<DL> list, List<DL> list2) {
        for (int i = 0; i < list2.size(); i++) {
            DL dl = list2.get(i);
            if (dl instanceof InterfaceC0962Fc1) {
                this.f.add((InterfaceC0962Fc1) dl);
            }
        }
    }

    @Override // defpackage.InterfaceC5489nK0
    public final void c(ColorFilter colorFilter, NU0 nu0) {
        PointF pointF = IU0.a;
        if (colorFilter == 1) {
            this.g.k(nu0);
            return;
        }
        if (colorFilter == 4) {
            this.h.k(nu0);
            return;
        }
        ColorFilter colorFilter2 = IU0.F;
        AbstractC1158Hq abstractC1158Hq = this.c;
        if (colorFilter == colorFilter2) {
            Pc2 pc2 = this.i;
            if (pc2 != null) {
                abstractC1158Hq.q(pc2);
            }
            Pc2 pc3 = new Pc2(nu0, null);
            this.i = pc3;
            pc3.a(this);
            abstractC1158Hq.g(this.i);
            return;
        }
        if (colorFilter == IU0.e) {
            AbstractC1002Fq<Float, Float> abstractC1002Fq = this.k;
            if (abstractC1002Fq != null) {
                abstractC1002Fq.k(nu0);
                return;
            }
            Pc2 pc4 = new Pc2(nu0, null);
            this.k = pc4;
            pc4.a(this);
            abstractC1158Hq.g(this.k);
            return;
        }
        C3285d40 c3285d40 = this.m;
        if (colorFilter == 5 && c3285d40 != null) {
            c3285d40.b.k(nu0);
            return;
        }
        if (colorFilter == IU0.B && c3285d40 != null) {
            c3285d40.c(nu0);
            return;
        }
        if (colorFilter == IU0.C && c3285d40 != null) {
            c3285d40.d.k(nu0);
            return;
        }
        if (colorFilter == IU0.D && c3285d40 != null) {
            c3285d40.e.k(nu0);
        } else {
            if (colorFilter != IU0.E || c3285d40 == null) {
                return;
            }
            c3285d40.f.k(nu0);
        }
    }

    @Override // defpackage.InterfaceC5489nK0
    public final void e(C5279mK0 c5279mK0, int i, ArrayList arrayList, C5279mK0 c5279mK1) {
        C7099v01.e(c5279mK0, i, arrayList, c5279mK1, this);
    }

    @Override // defpackage.X30
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((InterfaceC0962Fc1) arrayList.get(i)).i(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.DL
    public final String getName() {
        return this.d;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.X30
    public final void h(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        C3532eF c3532eF = this.g;
        int iL = c3532eF.l(c3532eF.b(), c3532eF.d());
        int iIntValue = (int) ((((i / 255.0f) * this.h.f().intValue()) / 100.0f) * 255.0f);
        PointF pointF = C7099v01.a;
        int i2 = 0;
        int iMax = (Math.max(0, Math.min(255, iIntValue)) << 24) | (iL & 16777215);
        KL0 kl0 = this.b;
        kl0.setColor(iMax);
        Pc2 pc2 = this.i;
        if (pc2 != null) {
            kl0.setColorFilter((ColorFilter) pc2.f());
        }
        AbstractC1002Fq<Float, Float> abstractC1002Fq = this.k;
        if (abstractC1002Fq != null) {
            float fFloatValue = abstractC1002Fq.f().floatValue();
            if (fFloatValue == 0.0f) {
                kl0.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                AbstractC1158Hq abstractC1158Hq = this.c;
                if (abstractC1158Hq.A == fFloatValue) {
                    blurMaskFilter = abstractC1158Hq.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC1158Hq.B = blurMaskFilter2;
                    abstractC1158Hq.A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                kl0.setMaskFilter(blurMaskFilter);
            }
            this.l = fFloatValue;
        }
        C3285d40 c3285d40 = this.m;
        if (c3285d40 != null) {
            c3285d40.b(kl0);
        }
        Path path = this.a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, kl0);
                C0564Aa.i();
                return;
            } else {
                path.addPath(((InterfaceC0962Fc1) arrayList.get(i2)).i(), matrix);
                i2++;
            }
        }
    }
}

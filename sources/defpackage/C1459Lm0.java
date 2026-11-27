package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Lm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1459Lm0 implements X30, AbstractC1002Fq.a, InterfaceC5699oK0 {

    @NonNull
    public final String a;
    public final boolean b;
    public final AbstractC1158Hq c;
    public final HT0<LinearGradient> d = new HT0<>();
    public final HT0<RadialGradient> e = new HT0<>();
    public final Path f;
    public final KL0 g;
    public final RectF h;
    public final ArrayList i;
    public final EnumC1851Qm0 j;
    public final C1225Im0 k;
    public final IB0 l;
    public final C6607sf1 m;
    public final C6607sf1 n;
    public Pc2 o;
    public Pc2 p;
    public final DU0 q;
    public final int r;
    public AbstractC1002Fq<Float, Float> s;
    public float t;
    public final C3285d40 u;

    public C1459Lm0(DU0 du0, C3788fU0 c3788fU0, AbstractC1158Hq abstractC1158Hq, C1381Km0 c1381Km0) {
        Path path = new Path();
        this.f = path;
        this.g = new KL0(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = abstractC1158Hq;
        this.a = c1381Km0.g;
        this.b = c1381Km0.h;
        this.q = du0;
        this.j = c1381Km0.a;
        path.setFillType(c1381Km0.b);
        this.r = (int) (c3788fU0.b() / 32.0f);
        AbstractC1002Fq<C1147Hm0, C1147Hm0> abstractC1002FqJ = c1381Km0.c.j();
        this.k = (C1225Im0) abstractC1002FqJ;
        abstractC1002FqJ.a(this);
        abstractC1158Hq.g(abstractC1002FqJ);
        AbstractC1002Fq<Integer, Integer> abstractC1002FqJ2 = c1381Km0.d.j();
        this.l = (IB0) abstractC1002FqJ2;
        abstractC1002FqJ2.a(this);
        abstractC1158Hq.g(abstractC1002FqJ2);
        AbstractC1002Fq<PointF, PointF> abstractC1002FqJ3 = c1381Km0.e.j();
        this.m = (C6607sf1) abstractC1002FqJ3;
        abstractC1002FqJ3.a(this);
        abstractC1158Hq.g(abstractC1002FqJ3);
        AbstractC1002Fq<PointF, PointF> abstractC1002FqJ4 = c1381Km0.f.j();
        this.n = (C6607sf1) abstractC1002FqJ4;
        abstractC1002FqJ4.a(this);
        abstractC1158Hq.g(abstractC1002FqJ4);
        if (abstractC1158Hq.m() != null) {
            AbstractC1002Fq<Float, Float> abstractC1002FqJ5 = abstractC1158Hq.m().a.j();
            this.s = abstractC1002FqJ5;
            abstractC1002FqJ5.a(this);
            abstractC1158Hq.g(this.s);
        }
        if (abstractC1158Hq.n() != null) {
            this.u = new C3285d40(this, abstractC1158Hq, abstractC1158Hq.n());
        }
    }

    @Override // defpackage.AbstractC1002Fq.a
    public final void a() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.DL
    public final void b(List<DL> list, List<DL> list2) {
        for (int i = 0; i < list2.size(); i++) {
            DL dl = list2.get(i);
            if (dl instanceof InterfaceC0962Fc1) {
                this.i.add((InterfaceC0962Fc1) dl);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5489nK0
    public final void c(ColorFilter colorFilter, NU0 nu0) {
        PointF pointF = IU0.a;
        if (colorFilter == 4) {
            this.l.k(nu0);
            return;
        }
        ColorFilter colorFilter2 = IU0.F;
        AbstractC1158Hq abstractC1158Hq = this.c;
        if (colorFilter == colorFilter2) {
            Pc2 pc2 = this.o;
            if (pc2 != null) {
                abstractC1158Hq.q(pc2);
            }
            Pc2 pc3 = new Pc2(nu0, null);
            this.o = pc3;
            pc3.a(this);
            abstractC1158Hq.g(this.o);
            return;
        }
        if (colorFilter == IU0.G) {
            Pc2 pc4 = this.p;
            if (pc4 != null) {
                abstractC1158Hq.q(pc4);
            }
            this.d.a();
            this.e.a();
            Pc2 pc5 = new Pc2(nu0, null);
            this.p = pc5;
            pc5.a(this);
            abstractC1158Hq.g(this.p);
            return;
        }
        if (colorFilter == IU0.e) {
            AbstractC1002Fq<Float, Float> abstractC1002Fq = this.s;
            if (abstractC1002Fq != null) {
                abstractC1002Fq.k(nu0);
                return;
            }
            Pc2 pc6 = new Pc2(nu0, null);
            this.s = pc6;
            pc6.a(this);
            abstractC1158Hq.g(this.s);
            return;
        }
        C3285d40 c3285d40 = this.u;
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
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
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

    public final int[] g(int[] iArr) {
        Pc2 pc2 = this.p;
        if (pc2 != null) {
            Integer[] numArr = (Integer[]) pc2.f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.DL
    public final String getName() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        Shader shader;
        Shader radialGradient;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((InterfaceC0962Fc1) arrayList.get(i2)).i(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        EnumC1851Qm0 enumC1851Qm0 = EnumC1851Qm0.d;
        EnumC1851Qm0 enumC1851Qm1 = this.j;
        C1225Im0 c1225Im0 = this.k;
        C6607sf1 c6607sf1 = this.n;
        C6607sf1 c6607sf2 = this.m;
        if (enumC1851Qm1 == enumC1851Qm0) {
            long j = j();
            HT0<LinearGradient> ht0 = this.d;
            shader = (LinearGradient) ht0.d(j, null);
            if (shader == null) {
                PointF pointFF = c6607sf2.f();
                PointF pointFF2 = c6607sf1.f();
                C1147Hm0 c1147Hm0F = c1225Im0.f();
                radialGradient = new LinearGradient(pointFF.x, pointFF.y, pointFF2.x, pointFF2.y, g(c1147Hm0F.b), c1147Hm0F.a, Shader.TileMode.CLAMP);
                ht0.g(j, radialGradient);
                shader = radialGradient;
            }
        } else {
            long j2 = j();
            HT0<RadialGradient> ht1 = this.e;
            shader = (RadialGradient) ht1.d(j2, null);
            if (shader == null) {
                PointF pointFF3 = c6607sf2.f();
                PointF pointFF4 = c6607sf1.f();
                C1147Hm0 c1147Hm0F2 = c1225Im0.f();
                int[] iArrG = g(c1147Hm0F2.b);
                float f = pointFF3.x;
                float f2 = pointFF3.y;
                float fHypot = (float) Math.hypot(pointFF4.x - f, pointFF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f, f2, fHypot, iArrG, c1147Hm0F2.a, Shader.TileMode.CLAMP);
                ht1.g(j2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        KL0 kl0 = this.g;
        kl0.setShader(shader);
        Pc2 pc2 = this.o;
        if (pc2 != null) {
            kl0.setColorFilter((ColorFilter) pc2.f());
        }
        AbstractC1002Fq<Float, Float> abstractC1002Fq = this.s;
        if (abstractC1002Fq != null) {
            float fFloatValue = abstractC1002Fq.f().floatValue();
            if (fFloatValue == 0.0f) {
                kl0.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                kl0.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        C3285d40 c3285d40 = this.u;
        if (c3285d40 != null) {
            c3285d40.b(kl0);
        }
        int iIntValue = (int) ((((i / 255.0f) * this.l.f().intValue()) / 100.0f) * 255.0f);
        PointF pointF = C7099v01.a;
        kl0.setAlpha(Math.max(0, Math.min(255, iIntValue)));
        canvas.drawPath(path, kl0);
        C0564Aa.i();
    }

    public final int j() {
        float f = this.m.d;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.d * f2);
        int iRound3 = Math.round(this.k.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}

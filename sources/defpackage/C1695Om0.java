package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: Om0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1695Om0 extends AbstractC1862Qq {
    public final C6607sf1 A;
    public Pc2 B;
    public final String r;
    public final boolean s;
    public final HT0<LinearGradient> t;
    public final HT0<RadialGradient> u;
    public final RectF v;
    public final EnumC1851Qm0 w;
    public final int x;
    public final C1225Im0 y;
    public final C6607sf1 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1695Om0(DU0 du0, AbstractC1158Hq abstractC1158Hq, C1617Nm0 c1617Nm0) {
        int iOrdinal = c1617Nm0.h.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = c1617Nm0.i.ordinal();
        super(du0, abstractC1158Hq, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, c1617Nm0.j, c1617Nm0.d, c1617Nm0.g, c1617Nm0.k, c1617Nm0.l);
        this.t = new HT0<>();
        this.u = new HT0<>();
        this.v = new RectF();
        this.r = c1617Nm0.a;
        this.w = c1617Nm0.b;
        this.s = c1617Nm0.m;
        this.x = (int) (du0.d.b() / 32.0f);
        AbstractC1002Fq<C1147Hm0, C1147Hm0> abstractC1002FqJ = c1617Nm0.c.j();
        this.y = (C1225Im0) abstractC1002FqJ;
        abstractC1002FqJ.a(this);
        abstractC1158Hq.g(abstractC1002FqJ);
        AbstractC1002Fq<PointF, PointF> abstractC1002FqJ2 = c1617Nm0.e.j();
        this.z = (C6607sf1) abstractC1002FqJ2;
        abstractC1002FqJ2.a(this);
        abstractC1158Hq.g(abstractC1002FqJ2);
        AbstractC1002Fq<PointF, PointF> abstractC1002FqJ3 = c1617Nm0.f.j();
        this.A = (C6607sf1) abstractC1002FqJ3;
        abstractC1002FqJ3.a(this);
        abstractC1158Hq.g(abstractC1002FqJ3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC1862Qq, defpackage.InterfaceC5489nK0
    public final void c(ColorFilter colorFilter, NU0 nu0) {
        super.c(colorFilter, nu0);
        if (colorFilter == IU0.G) {
            Pc2 pc2 = this.B;
            AbstractC1158Hq abstractC1158Hq = this.f;
            if (pc2 != null) {
                abstractC1158Hq.q(pc2);
            }
            Pc2 pc3 = new Pc2(nu0, null);
            this.B = pc3;
            pc3.a(this);
            abstractC1158Hq.g(this.B);
        }
    }

    public final int[] g(int[] iArr) {
        Pc2 pc2 = this.B;
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
        return this.r;
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
    @Override // defpackage.AbstractC1862Qq, defpackage.X30
    public final void h(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.s) {
            return;
        }
        f(this.v, matrix, false);
        EnumC1851Qm0 enumC1851Qm0 = EnumC1851Qm0.d;
        EnumC1851Qm0 enumC1851Qm1 = this.w;
        C1225Im0 c1225Im0 = this.y;
        C6607sf1 c6607sf1 = this.A;
        C6607sf1 c6607sf2 = this.z;
        if (enumC1851Qm1 == enumC1851Qm0) {
            long j = j();
            HT0<LinearGradient> ht0 = this.t;
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
            HT0<RadialGradient> ht1 = this.u;
            shader = (RadialGradient) ht1.d(j2, null);
            if (shader == null) {
                PointF pointFF3 = c6607sf2.f();
                PointF pointFF4 = c6607sf1.f();
                C1147Hm0 c1147Hm0F2 = c1225Im0.f();
                int[] iArrG = g(c1147Hm0F2.b);
                float f = pointFF3.x;
                float f2 = pointFF3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointFF4.x - f, pointFF4.y - f2), iArrG, c1147Hm0F2.a, Shader.TileMode.CLAMP);
                ht1.g(j2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.i.setShader(shader);
        super.h(canvas, matrix, i);
    }

    public final int j() {
        float f = this.z.d;
        float f2 = this.x;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.A.d * f2);
        int iRound3 = Math.round(this.y.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}

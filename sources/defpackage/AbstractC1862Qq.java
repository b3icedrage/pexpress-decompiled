package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1862Qq implements AbstractC1002Fq.a, InterfaceC5699oK0, X30 {
    public final DU0 e;
    public final AbstractC1158Hq f;
    public final float[] h;
    public final KL0 i;
    public final C4036gf0 j;
    public final IB0 k;
    public final ArrayList l;
    public final C4036gf0 m;
    public Pc2 n;
    public AbstractC1002Fq<Float, Float> o;
    public float p;
    public final C3285d40 q;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    /* JADX INFO: renamed from: Qq$a */
    public static final class a {
        public final ArrayList a = new ArrayList();
        public final C5231m52 b;

        public a(C5231m52 c5231m52) {
            this.b = c5231m52;
        }
    }

    public AbstractC1862Qq(DU0 du0, AbstractC1158Hq abstractC1158Hq, Paint.Cap cap, Paint.Join join, float f, C2129Ub c2129Ub, C1973Sb c1973Sb, ArrayList arrayList, C1973Sb c1973Sb2) {
        KL0 kl0 = new KL0(1);
        this.i = kl0;
        this.p = 0.0f;
        this.e = du0;
        this.f = abstractC1158Hq;
        kl0.setStyle(Paint.Style.STROKE);
        kl0.setStrokeCap(cap);
        kl0.setStrokeJoin(join);
        kl0.setStrokeMiter(f);
        this.k = (IB0) c2129Ub.j();
        this.j = (C4036gf0) c1973Sb.j();
        if (c1973Sb2 == null) {
            this.m = null;
        } else {
            this.m = (C4036gf0) c1973Sb2.j();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((C1973Sb) arrayList.get(i)).j());
        }
        abstractC1158Hq.g(this.k);
        abstractC1158Hq.g(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            abstractC1158Hq.g((AbstractC1002Fq) this.l.get(i2));
        }
        C4036gf0 c4036gf0 = this.m;
        if (c4036gf0 != null) {
            abstractC1158Hq.g(c4036gf0);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((AbstractC1002Fq) this.l.get(i3)).a(this);
        }
        C4036gf0 c4036gf1 = this.m;
        if (c4036gf1 != null) {
            c4036gf1.a(this);
        }
        if (abstractC1158Hq.m() != null) {
            AbstractC1002Fq<Float, Float> abstractC1002FqJ = abstractC1158Hq.m().a.j();
            this.o = abstractC1002FqJ;
            abstractC1002FqJ.a(this);
            abstractC1158Hq.g(this.o);
        }
        if (abstractC1158Hq.n() != null) {
            this.q = new C3285d40(this, abstractC1158Hq, abstractC1158Hq.n());
        }
    }

    @Override // defpackage.AbstractC1002Fq.a
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063 A[SYNTHETIC] */
    @Override // defpackage.DL
    public final void b(List<DL> list, List<DL> list2) {
        C4857kK1.a aVar;
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        int size = arrayList2.size() - 1;
        a aVar2 = null;
        C5231m52 c5231m52 = null;
        while (true) {
            aVar = C4857kK1.a.e;
            if (size < 0) {
                break;
            }
            DL dl = (DL) arrayList2.get(size);
            if (dl instanceof C5231m52) {
                C5231m52 c5231m53 = (C5231m52) dl;
                if (c5231m53.c == aVar) {
                    c5231m52 = c5231m53;
                }
            }
            size--;
        }
        if (c5231m52 != null) {
            c5231m52.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            DL dl2 = list2.get(size2);
            if (dl2 instanceof C5231m52) {
                C5231m52 c5231m54 = (C5231m52) dl2;
                if (c5231m54.c == aVar) {
                    if (aVar2 != null) {
                        arrayList.add(aVar2);
                    }
                    a aVar3 = new a(c5231m54);
                    c5231m54.c(this);
                    aVar2 = aVar3;
                } else if (!(dl2 instanceof InterfaceC0962Fc1)) {
                    if (aVar2 == null) {
                        aVar2 = new a(c5231m52);
                    }
                    aVar2.a.add((InterfaceC0962Fc1) dl2);
                }
            } else if (!(dl2 instanceof InterfaceC0962Fc1)) {
                if (aVar2 == null) {
                    aVar2 = new a(c5231m52);
                }
                aVar2.a.add((InterfaceC0962Fc1) dl2);
            }
        }
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
    }

    public void c(ColorFilter colorFilter, NU0 nu0) {
        PointF pointF = IU0.a;
        if (colorFilter == 4) {
            this.k.k(nu0);
            return;
        }
        if (colorFilter == IU0.n) {
            this.j.k(nu0);
            return;
        }
        ColorFilter colorFilter2 = IU0.F;
        AbstractC1158Hq abstractC1158Hq = this.f;
        if (colorFilter == colorFilter2) {
            Pc2 pc2 = this.n;
            if (pc2 != null) {
                abstractC1158Hq.q(pc2);
            }
            Pc2 pc3 = new Pc2(nu0, null);
            this.n = pc3;
            pc3.a(this);
            abstractC1158Hq.g(this.n);
            return;
        }
        if (colorFilter == IU0.e) {
            AbstractC1002Fq<Float, Float> abstractC1002Fq = this.o;
            if (abstractC1002Fq != null) {
                abstractC1002Fq.k(nu0);
                return;
            }
            Pc2 pc4 = new Pc2(nu0, null);
            this.o = pc4;
            pc4.a(this);
            abstractC1158Hq.g(this.o);
            return;
        }
        C3285d40 c3285d40 = this.q;
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
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fL = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                C0564Aa.i();
                return;
            }
            a aVar = (a) arrayList.get(i);
            for (int i2 = 0; i2 < aVar.a.size(); i2++) {
                path.addPath(((InterfaceC0962Fc1) aVar.a.get(i2)).i(), matrix);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0214  */
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
    public void h(Canvas canvas, Matrix matrix, int i) {
        float[] fArr;
        int i2;
        float f;
        BlurMaskFilter blurMaskFilter;
        AbstractC1862Qq abstractC1862Qq = this;
        int i3 = 1;
        float[] fArr2 = C7857yc2.d.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            C0564Aa.i();
            return;
        }
        IB0 ib0 = abstractC1862Qq.k;
        float fL = (i / 255.0f) * ib0.l(ib0.b(), ib0.d());
        float f2 = 100.0f;
        PointF pointF = C7099v01.a;
        int iMax = Math.max(0, Math.min(255, (int) ((fL / 100.0f) * 255.0f)));
        KL0 kl0 = abstractC1862Qq.i;
        kl0.setAlpha(iMax);
        kl0.setStrokeWidth(C7857yc2.d(matrix) * abstractC1862Qq.j.l());
        if (kl0.getStrokeWidth() <= 0.0f) {
            C0564Aa.i();
            return;
        }
        ArrayList arrayList = abstractC1862Qq.l;
        if (arrayList.isEmpty()) {
            C0564Aa.i();
        } else {
            float fD = C7857yc2.d(matrix);
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = abstractC1862Qq.h;
                if (i4 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((AbstractC1002Fq) arrayList.get(i4)).f()).floatValue();
                fArr[i4] = fFloatValue;
                if (i4 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i4] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i4] = 0.1f;
                }
                fArr[i4] = fArr[i4] * fD;
                i4++;
            }
            C4036gf0 c4036gf0 = abstractC1862Qq.m;
            kl0.setPathEffect(new DashPathEffect(fArr, c4036gf0 == null ? 0.0f : c4036gf0.f().floatValue() * fD));
            C0564Aa.i();
        }
        Pc2 pc2 = abstractC1862Qq.n;
        if (pc2 != null) {
            kl0.setColorFilter((ColorFilter) pc2.f());
        }
        AbstractC1002Fq<Float, Float> abstractC1002Fq = abstractC1862Qq.o;
        if (abstractC1002Fq != null) {
            float fFloatValue2 = abstractC1002Fq.f().floatValue();
            if (fFloatValue2 == 0.0f) {
                kl0.setMaskFilter(null);
            } else if (fFloatValue2 != abstractC1862Qq.p) {
                AbstractC1158Hq abstractC1158Hq = abstractC1862Qq.f;
                if (abstractC1158Hq.A == fFloatValue2) {
                    blurMaskFilter = abstractC1158Hq.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC1158Hq.B = blurMaskFilter2;
                    abstractC1158Hq.A = fFloatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                kl0.setMaskFilter(blurMaskFilter);
            }
            abstractC1862Qq.p = fFloatValue2;
        }
        C3285d40 c3285d40 = abstractC1862Qq.q;
        if (c3285d40 != null) {
            c3285d40.b(kl0);
        }
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = abstractC1862Qq.g;
            if (i5 >= arrayList2.size()) {
                C0564Aa.i();
                return;
            }
            a aVar = (a) arrayList2.get(i5);
            C5231m52 c5231m52 = aVar.b;
            Path path = abstractC1862Qq.b;
            ArrayList arrayList3 = aVar.a;
            if (c5231m52 != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                    path.addPath(((InterfaceC0962Fc1) arrayList3.get(size2)).i(), matrix);
                }
                C5231m52 c5231m53 = aVar.b;
                float fFloatValue3 = c5231m53.d.f().floatValue() / f2;
                float fFloatValue4 = c5231m53.e.f().floatValue() / f2;
                float fFloatValue5 = c5231m53.f.f().floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = abstractC1862Qq.a;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length = pathMeasure.getLength() + length;
                    }
                    float f3 = fFloatValue5 * length;
                    float f4 = (fFloatValue3 * length) + f3;
                    float fMin = Math.min((fFloatValue4 * length) + f3, (f4 + length) - 1.0f);
                    int size3 = arrayList3.size() - i3;
                    float f5 = 0.0f;
                    while (size3 >= 0) {
                        int i6 = i3;
                        Path path2 = abstractC1862Qq.c;
                        path2.set(((InterfaceC0962Fc1) arrayList3.get(size3)).i());
                        path2.transform(matrix);
                        pathMeasure.setPath(path2, z);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f6 = fMin - length;
                            if (f6 >= f5 + length2 || f5 >= f6) {
                                f = f5 + length2;
                                if (f < f4 && f5 <= fMin) {
                                    if (f > fMin || f4 >= f5) {
                                        C7857yc2.a(path2, f4 < f5 ? 0.0f : (f4 - f5) / length2, fMin > f ? 1.0f : (fMin - f5) / length2, 0.0f);
                                        canvas.drawPath(path2, kl0);
                                    } else {
                                        canvas.drawPath(path2, kl0);
                                    }
                                }
                            } else {
                                C7857yc2.a(path2, f4 > length ? (f4 - length) / length2 : 0.0f, Math.min(f6 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, kl0);
                            }
                        } else {
                            f = f5 + length2;
                            if (f < f4) {
                            }
                        }
                        f5 += length2;
                        size3--;
                        abstractC1862Qq = this;
                        i3 = i6;
                        z = false;
                    }
                    i2 = i3;
                    C0564Aa.i();
                } else {
                    canvas.drawPath(path, kl0);
                    C0564Aa.i();
                    i2 = i3;
                }
            } else {
                i2 = i3;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((InterfaceC0962Fc1) arrayList3.get(size4)).i(), matrix);
                }
                C0564Aa.i();
                canvas.drawPath(path, kl0);
                C0564Aa.i();
            }
            i5++;
            abstractC1862Qq = this;
            i3 = i2;
            z = false;
            f2 = 100.0f;
        }
    }
}

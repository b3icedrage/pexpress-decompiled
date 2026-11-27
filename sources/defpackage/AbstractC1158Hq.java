package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1158Hq implements X30, AbstractC1002Fq.a, InterfaceC5489nK0 {
    public float A;
    public BlurMaskFilter B;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final KL0 d = new KL0(1);
    public final KL0 e;
    public final KL0 f;
    public final KL0 g;
    public final KL0 h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final DU0 o;
    public final ZN0 p;
    public final C7970z8 q;
    public final C4036gf0 r;
    public AbstractC1158Hq s;
    public AbstractC1158Hq t;
    public List<AbstractC1158Hq> u;
    public final ArrayList v;
    public final C6276r42 w;
    public boolean x;
    public boolean y;
    public KL0 z;

    public AbstractC1158Hq(DU0 du0, ZN0 zn0) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new KL0(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new KL0(mode2);
        KL0 kl0 = new KL0(1);
        this.g = kl0;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        KL0 kl1 = new KL0();
        kl1.setXfermode(new PorterDuffXfermode(mode3));
        this.h = kl1;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = du0;
        this.p = zn0;
        zn0.c.concat("#draw");
        if (zn0.u == ZN0.b.e) {
            kl0.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            kl0.setXfermode(new PorterDuffXfermode(mode));
        }
        C3603ec c3603ec = zn0.i;
        c3603ec.getClass();
        C6276r42 c6276r42 = new C6276r42(c3603ec);
        this.w = c6276r42;
        c6276r42.b(this);
        List<C5738oX0> list = zn0.h;
        if (list != null && !list.isEmpty()) {
            C7970z8 c7970z8 = new C7970z8(list);
            this.q = c7970z8;
            Iterator it = ((ArrayList) c7970z8.d).iterator();
            while (it.hasNext()) {
                ((AbstractC1002Fq) it.next()).a(this);
            }
            for (AbstractC1002Fq<?, ?> abstractC1002Fq : (ArrayList) this.q.e) {
                g(abstractC1002Fq);
                abstractC1002Fq.a(this);
            }
        }
        ZN0 zn1 = this.p;
        if (zn1.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        C4036gf0 c4036gf0 = new C4036gf0(zn1.t);
        this.r = c4036gf0;
        c4036gf0.b = true;
        c4036gf0.a(new AbstractC1002Fq.a() { // from class: Gq
            @Override // defpackage.AbstractC1002Fq.a
            public final void a() {
                AbstractC1158Hq abstractC1158Hq = this.a;
                boolean z = abstractC1158Hq.r.l() == 1.0f;
                if (z != abstractC1158Hq.x) {
                    abstractC1158Hq.x = z;
                    abstractC1158Hq.o.invalidateSelf();
                }
            }
        });
        boolean z = this.r.f().floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        g(this.r);
    }

    @Override // defpackage.AbstractC1002Fq.a
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.InterfaceC5489nK0
    public void c(ColorFilter colorFilter, NU0 nu0) {
        this.w.c(colorFilter, nu0);
    }

    @Override // defpackage.InterfaceC5489nK0
    public final void e(C5279mK0 c5279mK0, int i, ArrayList arrayList, C5279mK0 c5279mK1) {
        AbstractC1158Hq abstractC1158Hq = this.s;
        ZN0 zn0 = this.p;
        if (abstractC1158Hq != null) {
            String str = abstractC1158Hq.p.c;
            C5279mK0 c5279mK2 = new C5279mK0(c5279mK1);
            c5279mK2.a.add(str);
            if (c5279mK0.a(i, this.s.p.c)) {
                AbstractC1158Hq abstractC1158Hq2 = this.s;
                C5279mK0 c5279mK3 = new C5279mK0(c5279mK2);
                c5279mK3.b = abstractC1158Hq2;
                arrayList.add(c5279mK3);
            }
            if (c5279mK0.d(i, zn0.c)) {
                this.s.r(c5279mK0, c5279mK0.b(i, this.s.p.c) + i, arrayList, c5279mK2);
            }
        }
        if (c5279mK0.c(i, zn0.c)) {
            String str2 = zn0.c;
            if (!"__container".equals(str2)) {
                C5279mK0 c5279mK4 = new C5279mK0(c5279mK1);
                c5279mK4.a.add(str2);
                if (c5279mK0.a(i, str2)) {
                    C5279mK0 c5279mK5 = new C5279mK0(c5279mK4);
                    c5279mK5.b = this;
                    arrayList.add(c5279mK5);
                }
                c5279mK1 = c5279mK4;
            }
            if (c5279mK0.d(i, str2)) {
                r(c5279mK0, c5279mK0.b(i, str2) + i, arrayList, c5279mK1);
            }
        }
    }

    @Override // defpackage.X30
    public void f(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        j();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List<AbstractC1158Hq> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.u.get(size).w.e());
                }
            } else {
                AbstractC1158Hq abstractC1158Hq = this.t;
                if (abstractC1158Hq != null) {
                    matrix2.preConcat(abstractC1158Hq.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void g(AbstractC1002Fq<?, ?> abstractC1002Fq) {
        if (abstractC1002Fq == null) {
            return;
        }
        this.v.add(abstractC1002Fq);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    @Override // defpackage.X30
    public final void h(Canvas canvas, Matrix matrix, int i) {
        int i2;
        float f;
        RectF rectF;
        KL0 kl0;
        C7970z8 c7970z8;
        Integer numF;
        int i3 = 1;
        if (this.x) {
            ZN0 zn0 = this.p;
            if (!zn0.v) {
                j();
                Matrix matrix2 = this.b;
                matrix2.reset();
                matrix2.set(matrix);
                for (int size = this.u.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.u.get(size).w.e());
                }
                C0564Aa.i();
                C6276r42 c6276r42 = this.w;
                AbstractC1002Fq<Integer, Integer> abstractC1002Fq = c6276r42.j;
                int iIntValue = (int) ((((i / 255.0f) * ((abstractC1002Fq == null || (numF = abstractC1002Fq.f()) == null) ? 100 : numF.intValue())) / 100.0f) * 255.0f);
                if (!(this.s != null) && !o()) {
                    matrix2.preConcat(c6276r42.e());
                    l(canvas, matrix2, iIntValue);
                    C0564Aa.i();
                    C0564Aa.i();
                    p();
                    return;
                }
                RectF rectF2 = this.i;
                f(rectF2, matrix2, false);
                if (this.s != null && zn0.u != ZN0.b.e) {
                    RectF rectF3 = this.l;
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.s.f(rectF3, matrix, true);
                    if (!rectF2.intersect(rectF3)) {
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                matrix2.preConcat(c6276r42.e());
                RectF rectF4 = this.k;
                rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
                boolean zO = o();
                Path path = this.a;
                C7970z8 c7970z9 = this.q;
                int i4 = 3;
                int i5 = 2;
                if (zO) {
                    int size2 = ((List) c7970z9.g).size();
                    int i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            C5738oX0 c5738oX0 = (C5738oX0) ((List) c7970z9.g).get(i6);
                            Path path2 = (Path) ((AbstractC1002Fq) ((ArrayList) c7970z9.d).get(i6)).f();
                            if (path2 != null) {
                                path.set(path2);
                                path.transform(matrix2);
                                int iOrdinal = c5738oX0.a.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal != i3) {
                                        if (iOrdinal != i5) {
                                            if (iOrdinal == i4) {
                                            }
                                            rectF = this.m;
                                            path.computeBounds(rectF, false);
                                            if (i6 == 0) {
                                                rectF4.set(rectF);
                                            } else {
                                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                            }
                                        }
                                    }
                                    i2 = i3;
                                }
                                if (c5738oX0.d) {
                                    i2 = i3;
                                }
                                rectF = this.m;
                                path.computeBounds(rectF, false);
                                if (i6 == 0) {
                                    rectF4.set(rectF);
                                } else {
                                    rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                }
                            }
                            i6++;
                            i3 = i3;
                            i4 = 3;
                            i5 = 2;
                        } else {
                            i2 = i3;
                            if (!rectF2.intersect(rectF4)) {
                                f = 0.0f;
                                rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                        }
                        f = 0.0f;
                    }
                } else {
                    i2 = 1;
                    f = 0.0f;
                }
                RectF rectF5 = this.j;
                rectF5.set(f, f, canvas.getWidth(), canvas.getHeight());
                Matrix matrix3 = this.c;
                canvas.getMatrix(matrix3);
                if (!matrix3.isIdentity()) {
                    matrix3.invert(matrix3);
                    matrix3.mapRect(rectF5);
                }
                if (!rectF2.intersect(rectF5)) {
                    rectF2.set(f, f, f, f);
                }
                C0564Aa.i();
                if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                    KL0 kl1 = this.d;
                    kl1.setAlpha(255);
                    C7857yc2.a aVar = C7857yc2.a;
                    canvas.saveLayer(rectF2, kl1);
                    C0564Aa.i();
                    C0564Aa.i();
                    k(canvas);
                    l(canvas, matrix2, iIntValue);
                    C0564Aa.i();
                    if (o()) {
                        KL0 kl2 = this.e;
                        canvas.saveLayer(rectF2, kl2);
                        C0564Aa.i();
                        if (Build.VERSION.SDK_INT < 28) {
                            k(canvas);
                        }
                        C0564Aa.i();
                        int i7 = 0;
                        while (i7 < ((List) c7970z9.g).size()) {
                            List list = (List) c7970z9.g;
                            C5738oX0 c5738oX1 = (C5738oX0) list.get(i7);
                            ArrayList arrayList = (ArrayList) c7970z9.d;
                            AbstractC1002Fq abstractC1002Fq2 = (AbstractC1002Fq) arrayList.get(i7);
                            AbstractC1002Fq abstractC1002Fq3 = (AbstractC1002Fq) ((ArrayList) c7970z9.e).get(i7);
                            int iOrdinal2 = c5738oX1.a.ordinal();
                            int i8 = i7;
                            KL0 kl3 = this.f;
                            boolean z = c5738oX1.d;
                            if (iOrdinal2 != 0) {
                                c7970z8 = c7970z9;
                                if (iOrdinal2 == i2) {
                                    if (i8 == 0) {
                                        kl1.setColor(-16777216);
                                        kl1.setAlpha(255);
                                        canvas.drawRect(rectF2, kl1);
                                    }
                                    if (z) {
                                        canvas.saveLayer(rectF2, kl3);
                                        C0564Aa.i();
                                        canvas.drawRect(rectF2, kl1);
                                        kl3.setAlpha((int) (((Integer) abstractC1002Fq3.f()).intValue() * 2.55f));
                                        path.set((Path) abstractC1002Fq2.f());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, kl3);
                                        canvas.restore();
                                    } else {
                                        path.set((Path) abstractC1002Fq2.f());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, kl3);
                                    }
                                } else if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3 && !arrayList.isEmpty()) {
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= list.size()) {
                                                kl1.setAlpha(255);
                                                canvas.drawRect(rectF2, kl1);
                                                break;
                                            } else if (((C5738oX0) list.get(i9)).a != C5738oX0.a.h) {
                                                break;
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                } else if (z) {
                                    canvas.saveLayer(rectF2, kl2);
                                    C0564Aa.i();
                                    canvas.drawRect(rectF2, kl1);
                                    kl3.setAlpha((int) (((Integer) abstractC1002Fq3.f()).intValue() * 2.55f));
                                    path.set((Path) abstractC1002Fq2.f());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, kl3);
                                    canvas.restore();
                                } else {
                                    canvas.saveLayer(rectF2, kl2);
                                    C0564Aa.i();
                                    path.set((Path) abstractC1002Fq2.f());
                                    path.transform(matrix2);
                                    kl1.setAlpha((int) (((Integer) abstractC1002Fq3.f()).intValue() * 2.55f));
                                    canvas.drawPath(path, kl1);
                                    canvas.restore();
                                }
                            } else {
                                c7970z8 = c7970z9;
                                if (z) {
                                    canvas.saveLayer(rectF2, kl1);
                                    C0564Aa.i();
                                    canvas.drawRect(rectF2, kl1);
                                    path.set((Path) abstractC1002Fq2.f());
                                    path.transform(matrix2);
                                    kl1.setAlpha((int) (((Integer) abstractC1002Fq3.f()).intValue() * 2.55f));
                                    canvas.drawPath(path, kl3);
                                    canvas.restore();
                                } else {
                                    path.set((Path) abstractC1002Fq2.f());
                                    path.transform(matrix2);
                                    kl1.setAlpha((int) (((Integer) abstractC1002Fq3.f()).intValue() * 2.55f));
                                    canvas.drawPath(path, kl1);
                                }
                            }
                            i2 = 1;
                            i7 = i8 + 1;
                            c7970z9 = c7970z8;
                        }
                        canvas.restore();
                        C0564Aa.i();
                    }
                    if (this.s != null) {
                        canvas.saveLayer(rectF2, this.g);
                        C0564Aa.i();
                        C0564Aa.i();
                        k(canvas);
                        this.s.h(canvas, matrix, iIntValue);
                        canvas.restore();
                        C0564Aa.i();
                        C0564Aa.i();
                    }
                    canvas.restore();
                    C0564Aa.i();
                }
                if (this.y && (kl0 = this.z) != null) {
                    kl0.setStyle(Paint.Style.STROKE);
                    this.z.setColor(-251901);
                    this.z.setStrokeWidth(4.0f);
                    canvas.drawRect(rectF2, this.z);
                    this.z.setStyle(Paint.Style.FILL);
                    this.z.setColor(1357638635);
                    canvas.drawRect(rectF2, this.z);
                }
                C0564Aa.i();
                p();
                return;
            }
        }
        C0564Aa.i();
    }

    public final void j() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (AbstractC1158Hq abstractC1158Hq = this.t; abstractC1158Hq != null; abstractC1158Hq = abstractC1158Hq.t) {
            this.u.add(abstractC1158Hq);
        }
    }

    public final void k(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
        C0564Aa.i();
    }

    public abstract void l(Canvas canvas, Matrix matrix, int i);

    public C4973kt m() {
        return this.p.w;
    }

    public C2866b40 n() {
        return this.p.x;
    }

    public final boolean o() {
        C7970z8 c7970z8 = this.q;
        return (c7970z8 == null || ((ArrayList) c7970z8.d).isEmpty()) ? false : true;
    }

    public final void p() {
        C6389rd1 c6389rd1 = this.o.d.a;
        String str = this.p.c;
        if (!c6389rd1.a) {
            return;
        }
        HashMap map = c6389rd1.c;
        C3800fY0 c3800fY0 = (C3800fY0) map.get(str);
        if (c3800fY0 == null) {
            c3800fY0 = new C3800fY0();
            map.put(str, c3800fY0);
        }
        int i = c3800fY0.a + 1;
        c3800fY0.a = i;
        if (i == Integer.MAX_VALUE) {
            c3800fY0.a = i / 2;
        }
        if (!str.equals("__container")) {
            return;
        }
        Iterator it = c6389rd1.b.iterator();
        while (true) {
            AbstractC6155qW0.a aVar = (AbstractC6155qW0.a) it;
            if (!aVar.hasNext()) {
                return;
            } else {
                ((C6389rd1.a) aVar.next()).a();
            }
        }
    }

    public final void q(AbstractC1002Fq<?, ?> abstractC1002Fq) {
        this.v.remove(abstractC1002Fq);
    }

    public void s(boolean z) {
        if (z && this.z == null) {
            this.z = new KL0();
        }
        this.y = z;
    }

    public void t(float f) {
        C6276r42 c6276r42 = this.w;
        AbstractC1002Fq<Integer, Integer> abstractC1002Fq = c6276r42.j;
        if (abstractC1002Fq != null) {
            abstractC1002Fq.j(f);
        }
        AbstractC1002Fq<?, Float> abstractC1002Fq2 = c6276r42.m;
        if (abstractC1002Fq2 != null) {
            abstractC1002Fq2.j(f);
        }
        AbstractC1002Fq<?, Float> abstractC1002Fq3 = c6276r42.n;
        if (abstractC1002Fq3 != null) {
            abstractC1002Fq3.j(f);
        }
        AbstractC1002Fq<PointF, PointF> abstractC1002Fq4 = c6276r42.f;
        if (abstractC1002Fq4 != null) {
            abstractC1002Fq4.j(f);
        }
        AbstractC1002Fq<?, PointF> abstractC1002Fq5 = c6276r42.g;
        if (abstractC1002Fq5 != null) {
            abstractC1002Fq5.j(f);
        }
        AbstractC1002Fq<ZC1, ZC1> abstractC1002Fq6 = c6276r42.h;
        if (abstractC1002Fq6 != null) {
            abstractC1002Fq6.j(f);
        }
        AbstractC1002Fq<Float, Float> abstractC1002Fq7 = c6276r42.i;
        if (abstractC1002Fq7 != null) {
            abstractC1002Fq7.j(f);
        }
        C4036gf0 c4036gf0 = c6276r42.k;
        if (c4036gf0 != null) {
            c4036gf0.j(f);
        }
        C4036gf0 c4036gf1 = c6276r42.l;
        if (c4036gf1 != null) {
            c4036gf1.j(f);
        }
        C7970z8 c7970z8 = this.q;
        int i = 0;
        if (c7970z8 != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) c7970z8.d;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((AbstractC1002Fq) arrayList.get(i2)).j(f);
                i2++;
            }
        }
        C4036gf0 c4036gf2 = this.r;
        if (c4036gf2 != null) {
            c4036gf2.j(f);
        }
        AbstractC1158Hq abstractC1158Hq = this.s;
        if (abstractC1158Hq != null) {
            abstractC1158Hq.t(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((AbstractC1002Fq) arrayList2.get(i)).j(f);
            i++;
        }
    }

    @Override // defpackage.DL
    public final void b(List<DL> list, List<DL> list2) {
    }

    public void r(C5279mK0 c5279mK0, int i, ArrayList arrayList, C5279mK0 c5279mK1) {
    }
}

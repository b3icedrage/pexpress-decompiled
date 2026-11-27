package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: Nr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1633Nr1 implements X30, InterfaceC0962Fc1, InterfaceC2163Um0, AbstractC1002Fq.a, InterfaceC5699oK0 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final DU0 c;
    public final AbstractC1158Hq d;
    public final String e;
    public final boolean f;
    public final C4036gf0 g;
    public final C4036gf0 h;
    public final C6276r42 i;
    public ML j;

    public C1633Nr1(DU0 du0, AbstractC1158Hq abstractC1158Hq, C1552Mr1 c1552Mr1) {
        this.c = du0;
        this.d = abstractC1158Hq;
        this.e = c1552Mr1.a;
        this.f = c1552Mr1.e;
        AbstractC1002Fq<Float, Float> abstractC1002FqJ = c1552Mr1.b.j();
        this.g = (C4036gf0) abstractC1002FqJ;
        abstractC1158Hq.g(abstractC1002FqJ);
        abstractC1002FqJ.a(this);
        AbstractC1002Fq<Float, Float> abstractC1002FqJ2 = c1552Mr1.c.j();
        this.h = (C4036gf0) abstractC1002FqJ2;
        abstractC1158Hq.g(abstractC1002FqJ2);
        abstractC1002FqJ2.a(this);
        C3603ec c3603ec = c1552Mr1.d;
        c3603ec.getClass();
        C6276r42 c6276r42 = new C6276r42(c3603ec);
        this.i = c6276r42;
        c6276r42.a(abstractC1158Hq);
        c6276r42.b(this);
    }

    @Override // defpackage.AbstractC1002Fq.a
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.DL
    public final void b(List<DL> list, List<DL> list2) {
        this.j.b(list, list2);
    }

    @Override // defpackage.InterfaceC5489nK0
    public final void c(ColorFilter colorFilter, NU0 nu0) {
        if (this.i.c(colorFilter, nu0)) {
            return;
        }
        if (colorFilter == IU0.p) {
            this.g.k(nu0);
        } else if (colorFilter == IU0.q) {
            this.h.k(nu0);
        }
    }

    @Override // defpackage.InterfaceC5489nK0
    public final void e(C5279mK0 c5279mK0, int i, ArrayList arrayList, C5279mK0 c5279mK1) {
        C7099v01.e(c5279mK0, i, arrayList, c5279mK1, this);
        for (int i2 = 0; i2 < this.j.h.size(); i2++) {
            DL dl = (DL) this.j.h.get(i2);
            if (dl instanceof InterfaceC5699oK0) {
                C7099v01.e(c5279mK0, i, arrayList, c5279mK1, (InterfaceC5699oK0) dl);
            }
        }
    }

    @Override // defpackage.X30
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        this.j.f(rectF, matrix, z);
    }

    @Override // defpackage.InterfaceC2163Um0
    public final void g(ListIterator<DL> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new ML(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.DL
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.X30
    public final void h(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.g.f().floatValue();
        float fFloatValue2 = this.h.f().floatValue();
        C6276r42 c6276r42 = this.i;
        float fFloatValue3 = c6276r42.m.f().floatValue() / 100.0f;
        float fFloatValue4 = c6276r42.n.f().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(c6276r42.f(f + fFloatValue2));
            this.j.h(canvas, matrix2, (int) (C7099v01.d(fFloatValue3, fFloatValue4, f / fFloatValue) * i));
        }
    }

    @Override // defpackage.InterfaceC0962Fc1
    public final Path i() {
        Path pathI = this.j.i();
        Path path = this.b;
        path.reset();
        float fFloatValue = this.g.f().floatValue();
        float fFloatValue2 = this.h.f().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrix = this.a;
            matrix.set(this.i.f(i + fFloatValue2));
            path.addPath(pathI, matrix);
        }
        return path;
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ML implements X30, InterfaceC0962Fc1, AbstractC1002Fq.a, InterfaceC5489nK0 {
    public final KL0 a;
    public final RectF b;
    public final Matrix c;
    public final Path d;
    public final RectF e;
    public final String f;
    public final boolean g;
    public final ArrayList h;
    public final DU0 i;
    public ArrayList j;
    public final C6276r42 k;

    public ML(DU0 du0, AbstractC1158Hq abstractC1158Hq, YJ1 yj1, C3788fU0 c3788fU0) {
        C3603ec c3603ec;
        String str = yj1.a;
        List<YL> list = yj1.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            DL dlA = list.get(i2).a(du0, c3788fU0, abstractC1158Hq);
            if (dlA != null) {
                arrayList.add(dlA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                c3603ec = null;
                break;
            }
            YL yl = list.get(i);
            if (yl instanceof C3603ec) {
                c3603ec = (C3603ec) yl;
                break;
            }
            i++;
        }
        this(du0, abstractC1158Hq, str, yj1.c, arrayList, c3603ec);
    }

    @Override // defpackage.AbstractC1002Fq.a
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.DL
    public final void b(List<DL> list, List<DL> list2) {
        int size = list.size();
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            DL dl = (DL) arrayList.get(size2);
            dl.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(dl);
        }
    }

    @Override // defpackage.InterfaceC5489nK0
    public final void c(ColorFilter colorFilter, NU0 nu0) {
        C6276r42 c6276r42 = this.k;
        if (c6276r42 != null) {
            c6276r42.c(colorFilter, nu0);
        }
    }

    @Override // defpackage.InterfaceC5489nK0
    public final void e(C5279mK0 c5279mK0, int i, ArrayList arrayList, C5279mK0 c5279mK1) {
        String str = this.f;
        if (!c5279mK0.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            C5279mK0 c5279mK2 = new C5279mK0(c5279mK1);
            c5279mK2.a.add(str);
            if (c5279mK0.a(i, str)) {
                C5279mK0 c5279mK3 = new C5279mK0(c5279mK2);
                c5279mK3.b = this;
                arrayList.add(c5279mK3);
            }
            c5279mK1 = c5279mK2;
        }
        if (!c5279mK0.d(i, str)) {
            return;
        }
        int iB = c5279mK0.b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i2 >= arrayList2.size()) {
                return;
            }
            DL dl = (DL) arrayList2.get(i2);
            if (dl instanceof InterfaceC5489nK0) {
                ((InterfaceC5489nK0) dl).e(c5279mK0, iB, arrayList, c5279mK1);
            }
            i2++;
        }
    }

    @Override // defpackage.X30
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        C6276r42 c6276r42 = this.k;
        if (c6276r42 != null) {
            matrix2.preConcat(c6276r42.e());
        }
        RectF rectF2 = this.e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DL dl = (DL) arrayList.get(size);
            if (dl instanceof X30) {
                ((X30) dl).f(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List<InterfaceC0962Fc1> g() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i >= arrayList.size()) {
                    break;
                }
                DL dl = (DL) arrayList.get(i);
                if (dl instanceof InterfaceC0962Fc1) {
                    this.j.add((InterfaceC0962Fc1) dl);
                }
                i++;
            }
        }
        return this.j;
    }

    @Override // defpackage.DL
    public final String getName() {
        throw null;
    }

    @Override // defpackage.X30
    public final void h(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        C6276r42 c6276r42 = this.k;
        if (c6276r42 != null) {
            matrix2.preConcat(c6276r42.e());
            AbstractC1002Fq<Integer, Integer> abstractC1002Fq = c6276r42.j;
            i = (int) (((((abstractC1002Fq == null ? 100 : abstractC1002Fq.f().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.x;
        ArrayList arrayList = this.h;
        boolean z2 = false;
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if ((arrayList.get(i3) instanceof X30) && (i2 = i2 + 1) >= 2) {
                    if (i == 255) {
                        break;
                    }
                    z2 = true;
                    break;
                }
            }
        }
        if (z2) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            f(rectF, matrix2, true);
            KL0 kl0 = this.a;
            kl0.setAlpha(i);
            C7857yc2.e(canvas, rectF, kl0);
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof X30) {
                ((X30) obj).h(canvas, matrix2, i);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // defpackage.InterfaceC0962Fc1
    public final Path i() {
        Matrix matrix = this.c;
        matrix.reset();
        C6276r42 c6276r42 = this.k;
        if (c6276r42 != null) {
            matrix.set(c6276r42.e());
        }
        Path path = this.d;
        path.reset();
        if (!this.g) {
            ArrayList arrayList = this.h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                DL dl = (DL) arrayList.get(size);
                if (dl instanceof InterfaceC0962Fc1) {
                    path.addPath(((InterfaceC0962Fc1) dl).i(), matrix);
                }
            }
        }
        return path;
    }

    public ML(DU0 du0, AbstractC1158Hq abstractC1158Hq, String str, boolean z, ArrayList arrayList, C3603ec c3603ec) {
        this.a = new KL0();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = du0;
        this.g = z;
        this.h = arrayList;
        if (c3603ec != null) {
            C6276r42 c6276r42 = new C6276r42(c3603ec);
            this.k = c6276r42;
            c6276r42.a(abstractC1158Hq);
            c6276r42.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DL dl = (DL) arrayList.get(size);
            if (dl instanceof InterfaceC2163Um0) {
                arrayList2.add((InterfaceC2163Um0) dl);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC2163Um0) arrayList2.get(size2)).g(arrayList.listIterator(arrayList.size()));
        }
    }
}

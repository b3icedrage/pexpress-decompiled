package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class EO1 extends AbstractC1002Fq<PointF, PointF> {
    public final PointF i;
    public final PointF j;
    public final C4036gf0 k;
    public final C4036gf0 l;
    public NU0<Float> m;
    public NU0<Float> n;

    public EO1(C4036gf0 c4036gf0, C4036gf0 c4036gf1) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = c4036gf0;
        this.l = c4036gf1;
        j(this.d);
    }

    @Override // defpackage.AbstractC1002Fq
    public final PointF f() {
        return l(0.0f);
    }

    @Override // defpackage.AbstractC1002Fq
    public final /* bridge */ /* synthetic */ PointF g(C7589xK0<PointF> c7589xK0, float f) {
        return l(f);
    }

    @Override // defpackage.AbstractC1002Fq
    public final void j(float f) {
        C4036gf0 c4036gf0 = this.k;
        c4036gf0.j(f);
        C4036gf0 c4036gf1 = this.l;
        c4036gf1.j(f);
        this.i.set(c4036gf0.f().floatValue(), c4036gf1.f().floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC1002Fq.a) arrayList.get(i)).a();
            i++;
        }
    }

    public final PointF l(float f) {
        float f2;
        Float fB;
        C4036gf0 c4036gf0;
        C7589xK0<Float> c7589xK0B;
        C4036gf0 c4036gf1;
        C7589xK0<Float> c7589xK0B2;
        Float fB2 = null;
        if (this.m == null || (c7589xK0B2 = (c4036gf1 = this.k).b()) == null) {
            f2 = f;
            fB = null;
        } else {
            float fD = c4036gf1.d();
            Float f3 = c7589xK0B2.h;
            NU0<Float> nu0 = this.m;
            float f4 = c7589xK0B2.g;
            f2 = f;
            fB = nu0.b(f4, f3 == null ? f4 : f3.floatValue(), c7589xK0B2.b, c7589xK0B2.c, f, f, fD);
        }
        if (this.n != null && (c7589xK0B = (c4036gf0 = this.l).b()) != null) {
            float fD2 = c4036gf0.d();
            Float f5 = c7589xK0B.h;
            NU0<Float> nu1 = this.n;
            float f6 = c7589xK0B.g;
            fB2 = nu1.b(f6, f5 == null ? f6 : f5.floatValue(), c7589xK0B.b, c7589xK0B.c, f2, f2, fD2);
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (fB == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, fB2.floatValue());
        return pointF2;
    }
}

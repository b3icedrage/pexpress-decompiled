package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: p50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5859p50 implements InterfaceC0962Fc1, AbstractC1002Fq.a, InterfaceC5699oK0 {
    public final String b;
    public final DU0 c;
    public final C6607sf1 d;
    public final AbstractC1002Fq<?, PointF> e;
    public final C4831kC f;
    public boolean h;
    public final Path a = new Path();
    public final C1602Nh0 g = new C1602Nh0();

    public C5859p50(DU0 du0, AbstractC1158Hq abstractC1158Hq, C4831kC c4831kC) {
        this.b = c4831kC.a;
        this.c = du0;
        AbstractC1002Fq<?, ?> abstractC1002FqJ = c4831kC.c.j();
        this.d = (C6607sf1) abstractC1002FqJ;
        AbstractC1002Fq<PointF, PointF> abstractC1002FqJ2 = c4831kC.b.j();
        this.e = abstractC1002FqJ2;
        this.f = c4831kC;
        abstractC1158Hq.g(abstractC1002FqJ);
        abstractC1158Hq.g(abstractC1002FqJ2);
        abstractC1002FqJ.a(this);
        abstractC1002FqJ2.a(this);
    }

    @Override // defpackage.AbstractC1002Fq.a
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.DL
    public final void b(List<DL> list, List<DL> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            DL dl = (DL) arrayList.get(i);
            if (dl instanceof C5231m52) {
                C5231m52 c5231m52 = (C5231m52) dl;
                if (c5231m52.c == C4857kK1.a.d) {
                    ((ArrayList) this.g.d).add(c5231m52);
                    c5231m52.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC5489nK0
    public final void c(ColorFilter colorFilter, NU0 nu0) {
        if (colorFilter == IU0.f) {
            this.d.k(nu0);
        } else if (colorFilter == IU0.i) {
            this.e.k(nu0);
        }
    }

    @Override // defpackage.InterfaceC5489nK0
    public final void e(C5279mK0 c5279mK0, int i, ArrayList arrayList, C5279mK0 c5279mK1) {
        C7099v01.e(c5279mK0, i, arrayList, c5279mK1, this);
    }

    @Override // defpackage.DL
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.InterfaceC0962Fc1
    public final Path i() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        C4831kC c4831kC = this.f;
        if (c4831kC.e) {
            this.h = true;
            return path;
        }
        PointF pointFF = this.d.f();
        float f = pointFF.x / 2.0f;
        float f2 = pointFF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (c4831kC.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFF2 = this.e.f();
        path.offset(pointFF2.x, pointFF2.y);
        path.close();
        this.g.d(path);
        this.h = true;
        return path;
    }
}

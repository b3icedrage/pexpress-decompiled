package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: aK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2697aK1 extends AbstractC1002Fq<UJ1, Path> {
    public final UJ1 i;
    public final Path j;
    public ArrayList k;

    public C2697aK1(List<C7589xK0<UJ1>> list) {
        super(list);
        this.i = new UJ1();
        this.j = new Path();
    }

    @Override // defpackage.AbstractC1002Fq
    public final Path g(C7589xK0<UJ1> c7589xK0, float f) {
        UJ1 uj1 = c7589xK0.b;
        UJ1 uj2 = c7589xK0.c;
        UJ1 uj1D = this.i;
        if (uj1D.b == null) {
            uj1D.b = new PointF();
        }
        int i = 0;
        uj1D.c = uj1.c || uj2.c;
        ArrayList arrayList = uj1.a;
        int size = arrayList.size();
        int size2 = uj2.a.size();
        ArrayList arrayList2 = uj2.a;
        if (size != size2) {
            CS0.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = uj1D.a;
        if (arrayList3.size() < iMin) {
            for (int size3 = arrayList3.size(); size3 < iMin; size3++) {
                arrayList3.add(new C5506nQ());
            }
        } else if (arrayList3.size() > iMin) {
            for (int size4 = arrayList3.size() - 1; size4 >= iMin; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = uj1.b;
        PointF pointF2 = uj2.b;
        uj1D.a(C7099v01.d(pointF.x, pointF2.x, f), C7099v01.d(pointF.y, pointF2.y, f));
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            C5506nQ c5506nQ = (C5506nQ) arrayList.get(size5);
            C5506nQ c5506nQ2 = (C5506nQ) arrayList2.get(size5);
            PointF pointF3 = c5506nQ.a;
            PointF pointF4 = c5506nQ2.a;
            ((C5506nQ) arrayList3.get(size5)).a.set(C7099v01.d(pointF3.x, pointF4.x, f), C7099v01.d(pointF3.y, pointF4.y, f));
            C5506nQ c5506nQ3 = (C5506nQ) arrayList3.get(size5);
            PointF pointF5 = c5506nQ.b;
            float f2 = pointF5.x;
            PointF pointF6 = c5506nQ2.b;
            c5506nQ3.b.set(C7099v01.d(f2, pointF6.x, f), C7099v01.d(pointF5.y, pointF6.y, f));
            C5506nQ c5506nQ4 = (C5506nQ) arrayList3.get(size5);
            PointF pointF7 = c5506nQ.c;
            float f3 = pointF7.x;
            PointF pointF8 = c5506nQ2.c;
            c5506nQ4.c.set(C7099v01.d(f3, pointF8.x, f), C7099v01.d(pointF7.y, pointF8.y, f));
        }
        ArrayList arrayList4 = this.k;
        if (arrayList4 != null) {
            for (int size6 = arrayList4.size() - 1; size6 >= 0; size6--) {
                uj1D = ((InterfaceC3130cK1) this.k.get(size6)).d(uj1D);
            }
        }
        Path path = this.j;
        path.reset();
        PointF pointF9 = uj1D.b;
        path.moveTo(pointF9.x, pointF9.y);
        PointF pointF10 = C7099v01.a;
        pointF10.set(pointF9.x, pointF9.y);
        while (true) {
            ArrayList arrayList5 = uj1D.a;
            if (i >= arrayList5.size()) {
                break;
            }
            C5506nQ c5506nQ5 = (C5506nQ) arrayList5.get(i);
            PointF pointF11 = c5506nQ5.a;
            boolean zEquals = pointF11.equals(pointF10);
            PointF pointF12 = c5506nQ5.b;
            PointF pointF13 = c5506nQ5.c;
            if (zEquals && pointF12.equals(pointF13)) {
                path.lineTo(pointF13.x, pointF13.y);
            } else {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            }
            pointF10.set(pointF13.x, pointF13.y);
            i++;
        }
        if (uj1D.c) {
            path.close();
        }
        return path;
    }
}

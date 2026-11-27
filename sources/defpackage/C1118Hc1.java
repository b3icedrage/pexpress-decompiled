package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: renamed from: Hc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1118Hc1 extends C7589xK0<PointF> {
    public Path q;
    public final C7589xK0<PointF> r;

    public C1118Hc1(C3788fU0 c3788fU0, C7589xK0<PointF> c7589xK0) {
        super(c3788fU0, c7589xK0.b, c7589xK0.c, c7589xK0.d, c7589xK0.e, c7589xK0.f, c7589xK0.g, c7589xK0.h);
        this.r = c7589xK0;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.c;
        Object obj3 = this.b;
        boolean z = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.c) == null || z) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        C7589xK0<PointF> c7589xK0 = this.r;
        PointF pointF3 = c7589xK0.o;
        PointF pointF4 = c7589xK0.p;
        C7857yc2.a aVar = C7857yc2.a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.q = path;
    }
}

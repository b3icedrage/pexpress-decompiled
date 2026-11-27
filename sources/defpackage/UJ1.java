package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UJ1 {
    public final ArrayList a;
    public PointF b;
    public boolean c;

    public UJ1(PointF pointF, boolean z, List<C5506nQ> list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public final void a(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.a.size());
        sb.append("closed=");
        return C4564j.f(sb, this.c, '}');
    }

    public UJ1() {
        this.a = new ArrayList();
    }
}

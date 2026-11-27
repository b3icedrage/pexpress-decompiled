package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: dK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3340dK1 extends C3549eK1.f {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public C3340dK1(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.C3549eK1.f
    public final void a(Matrix matrix, QJ1 qj1, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((C3549eK1.f) it.next()).a(this.d, qj1, i, canvas);
        }
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: bK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2921bK1 extends AbstractC1158Hq {
    public final ML C;
    public final LH D;

    public C2921bK1(DU0 du0, ZN0 zn0, LH lh, C3788fU0 c3788fU0) {
        super(du0, zn0);
        this.D = lh;
        ML ml = new ML(du0, this, new YJ1("__container", zn0.a, false), c3788fU0);
        this.C = ml;
        List<DL> list = Collections.EMPTY_LIST;
        ml.b(list, list);
    }

    @Override // defpackage.AbstractC1158Hq, defpackage.X30
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        this.C.f(rectF, this.n, z);
    }

    @Override // defpackage.AbstractC1158Hq
    public final void l(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.C.h(canvas, matrix, i);
    }

    @Override // defpackage.AbstractC1158Hq
    public final C4973kt m() {
        C4973kt c4973kt = this.p.w;
        return c4973kt != null ? c4973kt : this.D.p.w;
    }

    @Override // defpackage.AbstractC1158Hq
    public final C2866b40 n() {
        C2866b40 c2866b40 = this.p.x;
        return c2866b40 != null ? c2866b40 : this.D.p.x;
    }

    @Override // defpackage.AbstractC1158Hq
    public final void r(C5279mK0 c5279mK0, int i, ArrayList arrayList, C5279mK0 c5279mK1) {
        this.C.e(c5279mK0, i, arrayList, c5279mK1);
    }
}

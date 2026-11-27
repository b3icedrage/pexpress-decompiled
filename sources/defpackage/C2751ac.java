package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2751ac implements InterfaceC4023gc<PointF, PointF> {
    public final C1973Sb a;
    public final C1973Sb b;

    public C2751ac(C1973Sb c1973Sb, C1973Sb c1973Sb2) {
        this.a = c1973Sb;
        this.b = c1973Sb2;
    }

    @Override // defpackage.InterfaceC4023gc
    public final boolean i() {
        return this.a.i() && this.b.i();
    }

    @Override // defpackage.InterfaceC4023gc
    public final AbstractC1002Fq<PointF, PointF> j() {
        return new EO1((C4036gf0) this.a.j(), (C4036gf0) this.b.j());
    }

    @Override // defpackage.InterfaceC4023gc
    public final List<C7589xK0<PointF>> k() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}

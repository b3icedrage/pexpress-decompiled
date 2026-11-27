package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: m52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5231m52 implements DL, AbstractC1002Fq.a {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final C4857kK1.a c;
    public final C4036gf0 d;
    public final C4036gf0 e;
    public final C4036gf0 f;

    public C5231m52(AbstractC1158Hq abstractC1158Hq, C4857kK1 c4857kK1) {
        c4857kK1.getClass();
        this.a = c4857kK1.e;
        this.c = c4857kK1.a;
        AbstractC1002Fq<Float, Float> abstractC1002FqJ = c4857kK1.b.j();
        this.d = (C4036gf0) abstractC1002FqJ;
        AbstractC1002Fq<Float, Float> abstractC1002FqJ2 = c4857kK1.c.j();
        this.e = (C4036gf0) abstractC1002FqJ2;
        AbstractC1002Fq<Float, Float> abstractC1002FqJ3 = c4857kK1.d.j();
        this.f = (C4036gf0) abstractC1002FqJ3;
        abstractC1158Hq.g(abstractC1002FqJ);
        abstractC1158Hq.g(abstractC1002FqJ2);
        abstractC1158Hq.g(abstractC1002FqJ3);
        abstractC1002FqJ.a(this);
        abstractC1002FqJ2.a(this);
        abstractC1002FqJ3.a(this);
    }

    @Override // defpackage.AbstractC1002Fq.a
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC1002Fq.a) arrayList.get(i)).a();
            i++;
        }
    }

    public final void c(AbstractC1002Fq.a aVar) {
        this.b.add(aVar);
    }

    @Override // defpackage.DL
    public final void b(List<DL> list, List<DL> list2) {
    }
}

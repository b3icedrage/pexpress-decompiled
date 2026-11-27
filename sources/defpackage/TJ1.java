package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TJ1 implements InterfaceC0962Fc1, AbstractC1002Fq.a {
    public final boolean b;
    public final DU0 c;
    public final C2697aK1 d;
    public boolean e;
    public final Path a = new Path();
    public final C1602Nh0 f = new C1602Nh0();

    public TJ1(DU0 du0, AbstractC1158Hq abstractC1158Hq, C3759fK1 c3759fK1) {
        c3759fK1.getClass();
        this.b = c3759fK1.d;
        this.c = du0;
        C2697aK1 c2697aK1 = new C2697aK1((List) c3759fK1.c.b);
        this.d = c2697aK1;
        abstractC1158Hq.g(c2697aK1);
        c2697aK1.a(this);
    }

    @Override // defpackage.AbstractC1002Fq.a
    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:12:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    @Override // defpackage.DL
    public final void b(List<DL> list, List<DL> list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.d.k = arrayList;
                return;
            }
            DL dl = (DL) arrayList2.get(i);
            if (dl instanceof C5231m52) {
                C5231m52 c5231m52 = (C5231m52) dl;
                if (c5231m52.c == C4857kK1.a.d) {
                    ((ArrayList) this.f.d).add(c5231m52);
                    c5231m52.c(this);
                } else if (!(dl instanceof InterfaceC3130cK1)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((InterfaceC3130cK1) dl);
                }
            } else if (!(dl instanceof InterfaceC3130cK1)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((InterfaceC3130cK1) dl);
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC0962Fc1
    public final Path i() {
        boolean z = this.e;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.b) {
            this.e = true;
            return path;
        }
        Path pathF = this.d.f();
        if (pathF == null) {
            return path;
        }
        path.set(pathF);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.d(path);
        this.e = true;
        return path;
    }
}

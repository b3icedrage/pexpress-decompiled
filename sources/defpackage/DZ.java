package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class DZ implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ DZ(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                FZ.a aVar = (FZ.a) this.e;
                return aVar.g.z(aVar.j);
            case 1:
                return QJ0.a((OJ0.c) this.e, false);
            default:
                VP1 vp1 = (VP1) this.e;
                return vp1.c ? WE.g(JY.e(vp1.b)) : C5653o60.d;
        }
    }
}

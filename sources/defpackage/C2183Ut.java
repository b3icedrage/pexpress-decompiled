package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: Ut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2183Ut implements InterfaceC6606sf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C2183Ut(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.InterfaceC6606sf0
    public final Object a(Object obj, JM jm) {
        switch (this.d) {
            case 0:
                Object objB = ((C1949Rt) this.e).b(jm);
                return objB == MN.d ? objB : Unit.a;
            default:
                long jLongValue = ((Number) obj).longValue();
                C5077lO c5077lO = (C5077lO) this.e;
                C2936bP1 c2936bP1 = c5077lO.e;
                if (c2936bP1 != null) {
                    c2936bP1.l(null);
                }
                c5077lO.e = C5189lv.k(C3784fT.a, null, new C5920pO(jLongValue, c5077lO, null), 3);
                return Unit.a;
        }
    }
}

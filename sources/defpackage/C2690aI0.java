package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: aI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2690aI0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C2690aI0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws C7144vC0 {
        UK0 uk0;
        String[] strArr;
        String[] strArr2;
        switch (this.d) {
            case 0:
                CQ0 cq0B = VE.b();
                C2914bI0 c2914bI0 = (C2914bI0) this.e;
                cq0B.add(c2914bI0.a.d);
                EnumC2599Zr1 enumC2599Zr1 = c2914bI0.b;
                if (enumC2599Zr1 != null) {
                    cq0B.add("under-migration:".concat(enumC2599Zr1.d));
                }
                c2914bI0.c.getClass();
                C6702t60.d.getClass();
                C5443n60.d.getClass();
                return (String[]) VE.a(cq0B).toArray(new String[0]);
            case 1:
                C3545eJ0 c3545eJ0 = (C3545eJ0) this.e;
                return c3545eJ0.o(c3545eJ0.c().y().v(), AbstractC5906pJ0.c.e);
            case 2:
                FJ0.a aVar = (FJ0.a) this.e;
                aVar.getClass();
                IJ0<Object> ij0 = FJ0.a.g[0];
                C1627Np1 c1627Np1 = (C1627Np1) aVar.c.invoke();
                if (c1627Np1 == null || (uk0 = c1627Np1.b) == null || (strArr = uk0.c) == null || (strArr2 = uk0.e) == null) {
                    return null;
                }
                Pair<C8003zI0, C3218ck1> pairH = GI0.h(strArr, strArr2);
                return new C5651o52(pairH.d, pairH.e, uk0.b);
            default:
                QY0 qy0 = (QY0) ((Function0) this.e).invoke();
                return qy0 instanceof AbstractC3062c1 ? ((AbstractC3062c1) qy0).h() : qy0;
        }
    }
}

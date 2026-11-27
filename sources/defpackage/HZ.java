package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HZ implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object g;

    public /* synthetic */ HZ(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C5638o21 name = (C5638o21) obj;
                Intrinsics.checkNotNullParameter(name, "name");
                FZ.c cVar = (FZ.c) this.e;
                C2419Xj1 c2419Xj1 = (C2419Xj1) cVar.a.get(name);
                if (c2419Xj1 == null) {
                    return null;
                }
                FZ fz = (FZ) this.g;
                return C5867p70.T0(fz.p.a.a, fz, name, cVar.c, new C6792tZ(fz.p.a.a, new IZ(fz, c2419Xj1)), VN1.a);
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.c;
                function.a((String) this.e, c2905bF0);
                function.c((String) this.g, C4719jg1.b, c2905bF0);
                return Unit.a;
        }
    }
}

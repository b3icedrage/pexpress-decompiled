package defpackage;

import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3477e0 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C3477e0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InputStream inputStreamA;
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                C1758Ph0 packageFqName = (C1758Ph0) obj;
                Intrinsics.checkNotNullParameter(packageFqName, "fqName");
                AbstractC3687f0 abstractC3687f0 = (AbstractC3687f0) obj2;
                C6532sI0 c6532sI0 = (C6532sI0) abstractC3687f0;
                c6532sI0.getClass();
                Intrinsics.checkNotNullParameter(packageFqName, "fqName");
                C1705Op1 c1705Op1 = c6532sI0.b;
                Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
                if (packageFqName.h(C4194hP1.k)) {
                    C6661sv.m.getClass();
                    String strA = C6661sv.a(packageFqName);
                    c1705Op1.b.getClass();
                    inputStreamA = C0783Cv.a(strA);
                } else {
                    inputStreamA = null;
                }
                C0627Av c0627AvA = inputStreamA != null ? C0627Av.a.a(packageFqName, c6532sI0.a, c6532sI0.c, inputStreamA) : null;
                if (c0627AvA == null) {
                    return null;
                }
                C6163qZ c6163qZ = abstractC3687f0.d;
                if (c6163qZ != null) {
                    c0627AvA.V0(c6163qZ);
                    return c0627AvA;
                }
                Intrinsics.l("components");
                throw null;
            case 1:
                S01 module = (S01) obj;
                Intrinsics.checkNotNullParameter(module, "module");
                RK0 rk0T = module.t();
                EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.INVARIANT;
                AbstractC5706oM1 abstractC5706oM1G = rk0T.g(((RK0) obj2).u());
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1G, "getArrayType(...)");
                return abstractC5706oM1G;
            case 2:
                InterfaceC1490Lx it = (InterfaceC1490Lx) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(C6132qO1.i.containsKey(C3689f01.b((InterfaceC3765fM1) obj2)));
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                function.c((String) obj2, c2905bF0, c2905bF0);
                return Unit.a;
        }
    }
}

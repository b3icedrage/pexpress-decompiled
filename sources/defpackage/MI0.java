package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MI0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ MI0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                PI0 pi0 = (PI0) this.e;
                AbstractC4649jL0 abstractC4649jL0N = pi0.o().n();
                Intrinsics.checkNotNull(abstractC4649jL0N);
                return new WJ0(abstractC4649jL0N, new T(pi0, 1));
            case 1:
                C6550sO0 c6550sO0 = (C6550sO0) this.e;
                C1758Ph0 topLevelFqName = c6550sO0.c();
                QD0 qd0 = c6550sO0.b;
                if (topLevelFqName == null) {
                    return R70.c(Q70.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, qd0.toString());
                }
                LO0 lo0 = c6550sO0.a;
                FC fcD = C6772tS0.d(topLevelFqName, lo0.a.o.h);
                if (fcD == null) {
                    C7065up1 c7065up1D = qd0.D();
                    KE0 ke0 = lo0.a;
                    fcD = ke0.k.a(c7065up1D);
                    if (fcD == null) {
                        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                        C1758Ph0 c1758Ph0E = topLevelFqName.e();
                        fcD = C7859yd0.c(ke0.o, new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)")), ke0.d.c().l);
                    }
                }
                return fcD.y();
            default:
                return ((QO0) this.e).o(LY.q);
        }
    }
}

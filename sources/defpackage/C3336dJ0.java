package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3336dJ0 implements Function0 {
    public final C3545eJ0.a d;
    public final C3545eJ0 e;

    public C3336dJ0(C3545eJ0.a aVar, C3545eJ0 c3545eJ0) {
        this.d = aVar;
        this.e = c3545eJ0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C3545eJ0.a aVar = this.d;
        Collection<AbstractC4649jL0> collectionA = aVar.b().p().a();
        Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList(collectionA.size());
        for (AbstractC4649jL0 abstractC4649jL0 : collectionA) {
            Intrinsics.checkNotNull(abstractC4649jL0);
            arrayList.add(new WJ0(abstractC4649jL0, new YI0(abstractC4649jL0, aVar, this.e)));
        }
        FC fcB = aVar.b();
        if (fcB == null) {
            RK0.a(108);
            throw null;
        }
        C5638o21 c5638o21 = RK0.e;
        if (!RK0.b(fcB, C4194hP1.a.a) && !RK0.b(fcB, C4194hP1.a.b)) {
            if (arrayList.isEmpty()) {
                AbstractC5706oM1 abstractC5706oM1E = C4900kZ.e(aVar.b()).e();
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1E, "getAnyType(...)");
                arrayList.add(new WJ0(abstractC5706oM1E, ZI0.d));
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SC scH = C4432iZ.c(((WJ0) it.next()).a).h();
                    Intrinsics.checkNotNullExpressionValue(scH, "getKind(...)");
                    if (scH == SC.e || scH == SC.i) {
                    }
                }
                AbstractC5706oM1 abstractC5706oM1E2 = C4900kZ.e(aVar.b()).e();
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1E2, "getAnyType(...)");
                arrayList.add(new WJ0(abstractC5706oM1E2, ZI0.d));
            }
        }
        return UE.f(arrayList);
    }
}

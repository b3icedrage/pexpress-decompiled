package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BD extends G1 {
    public static final void w(FC fc, LinkedHashSet<FC> linkedHashSet, QY0 qy0, boolean z) {
        for (InterfaceC4675jU interfaceC4675jU : InterfaceC2602Zs1.a.a(qy0, LY.o, 2)) {
            if (interfaceC4675jU instanceof FC) {
                FC fcX = (FC) interfaceC4675jU;
                if (fcX.Q()) {
                    C5638o21 name = fcX.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    InterfaceC5044lD interfaceC5044lDF = qy0.f(name, S41.h);
                    fcX = interfaceC5044lDF instanceof FC ? (FC) interfaceC5044lDF : interfaceC5044lDF instanceof InterfaceC3714f62 ? ((InterfaceC3714f62) interfaceC5044lDF).x() : null;
                }
                if (fcX == null) {
                    continue;
                } else {
                    if (fc == null) {
                        C4432iZ.a(27);
                        throw null;
                    }
                    int i = C4432iZ.a;
                    Iterator<AbstractC4649jL0> it = fcX.p().a().iterator();
                    while (it.hasNext()) {
                        if (C4432iZ.p(it.next(), fc.U0())) {
                            linkedHashSet.add(fcX);
                            break;
                        }
                    }
                    if (z) {
                        QY0 qy0E0 = fcX.E0();
                        Intrinsics.checkNotNullExpressionValue(qy0E0, "getUnsubstitutedInnerClassesScope(...)");
                        w(fc, linkedHashSet, qy0E0, z);
                    }
                }
            }
        }
    }
}

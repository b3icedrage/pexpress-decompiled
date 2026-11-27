package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6971uO1 {
    @NotNull
    public static final P92 a(@NotNull P92 p92, boolean z) {
        Intrinsics.checkNotNullParameter(p92, "<this>");
        BW bwA = BW.a.a(p92, z);
        if (bwA != null) {
            return bwA;
        }
        AbstractC5706oM1 abstractC5706oM1B = b(p92);
        return abstractC5706oM1B != null ? abstractC5706oM1B : p92.Z0(false);
    }

    public static final AbstractC5706oM1 b(P92 p92) {
        C4622jC0 c4622jC0;
        InterfaceC6494s62 interfaceC6494s62V0 = p92.V0();
        C4622jC0 c4622jC1 = interfaceC6494s62V0 instanceof C4622jC0 ? (C4622jC0) interfaceC6494s62V0 : null;
        if (c4622jC1 != null) {
            LinkedHashSet<AbstractC4649jL0> linkedHashSet = c4622jC1.b;
            ArrayList typesToIntersect = new ArrayList(XE.m(linkedHashSet, 10));
            boolean z = false;
            for (AbstractC4649jL0 abstractC4649jL0A : linkedHashSet) {
                if (C3089c72.e(abstractC4649jL0A)) {
                    abstractC4649jL0A = a(abstractC4649jL0A.Y0(), false);
                    z = true;
                }
                typesToIntersect.add(abstractC4649jL0A);
            }
            if (z) {
                AbstractC4649jL0 abstractC4649jL0A2 = c4622jC1.a;
                if (abstractC4649jL0A2 == null) {
                    abstractC4649jL0A2 = null;
                } else if (C3089c72.e(abstractC4649jL0A2)) {
                    abstractC4649jL0A2 = a(abstractC4649jL0A2.Y0(), false);
                }
                Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
                typesToIntersect.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(typesToIntersect);
                linkedHashSet2.hashCode();
                c4622jC0 = new C4622jC0(linkedHashSet2);
                c4622jC0.a = abstractC4649jL0A2;
            } else {
                c4622jC0 = null;
            }
            if (c4622jC0 != null) {
                return c4622jC0.g();
            }
        }
        return null;
    }

    @NotNull
    public static final AbstractC5706oM1 c(@NotNull AbstractC5706oM1 abstractC5706oM1, @NotNull AbstractC5706oM1 abbreviatedType) {
        Intrinsics.checkNotNullParameter(abstractC5706oM1, "<this>");
        Intrinsics.checkNotNullParameter(abbreviatedType, "abbreviatedType");
        return C3686f.n(abstractC5706oM1) ? abstractC5706oM1 : new C6886u(abstractC5706oM1, abbreviatedType);
    }
}

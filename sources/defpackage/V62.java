package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class V62 {
    @NotNull
    public static final AbstractC5706oM1 a(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        P92 p92Y0 = abstractC4649jL0.Y0();
        AbstractC5706oM1 abstractC5706oM1 = p92Y0 instanceof AbstractC5706oM1 ? (AbstractC5706oM1) p92Y0 : null;
        if (abstractC5706oM1 != null) {
            return abstractC5706oM1;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC4649jL0).toString());
    }

    @NotNull
    public static final AbstractC5706oM1 b(@NotNull AbstractC5706oM1 abstractC5706oM1, @NotNull List<? extends N62> newArguments, @NotNull C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(abstractC5706oM1, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == abstractC5706oM1.U0()) {
            return abstractC5706oM1;
        }
        if (newArguments.isEmpty()) {
            return abstractC5706oM1.b1(newAttributes);
        }
        if (!(abstractC5706oM1 instanceof O70)) {
            return C5492nL0.c(newAttributes, abstractC5706oM1.V0(), newArguments, abstractC5706oM1.W0(), null);
        }
        O70 o70 = (O70) abstractC5706oM1;
        o70.getClass();
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        String[] strArr = o70.k;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new O70(o70.e, o70.g, o70.h, newArguments, o70.j, strArr2);
    }

    public static AbstractC4649jL0 c(AbstractC4649jL0 abstractC4649jL0, List newArgumentsForUpperBound, InterfaceC2396Xc newAnnotations, int i) {
        if ((i & 2) != 0) {
            newAnnotations = abstractC4649jL0.k();
        }
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        Intrinsics.checkNotNullParameter(newArgumentsForUpperBound, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        Intrinsics.checkNotNullParameter(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArgumentsForUpperBound.isEmpty() || newArgumentsForUpperBound == abstractC4649jL0.T0()) && newAnnotations == abstractC4649jL0.k()) {
            return abstractC4649jL0;
        }
        C5655o62 c5655o62U0 = abstractC4649jL0.U0();
        if ((newAnnotations instanceof C7228vd0) && ((C7228vd0) newAnnotations).isEmpty()) {
            newAnnotations = InterfaceC2396Xc.a.a;
        }
        C5655o62 c5655o62N = C1952Ru.n(c5655o62U0, newAnnotations);
        P92 p92Y0 = abstractC4649jL0.Y0();
        if (p92Y0 instanceof AbstractC2299We0) {
            AbstractC2299We0 abstractC2299We0 = (AbstractC2299We0) p92Y0;
            return C5492nL0.a(b(abstractC2299We0.e, newArgumentsForUpperBound, c5655o62N), b(abstractC2299We0.g, newArgumentsForUpperBound, c5655o62N));
        }
        if (p92Y0 instanceof AbstractC5706oM1) {
            return b((AbstractC5706oM1) p92Y0, newArgumentsForUpperBound, c5655o62N);
        }
        throw new C6489s51();
    }

    public static /* synthetic */ AbstractC5706oM1 d(AbstractC5706oM1 abstractC5706oM1, List list, C5655o62 c5655o62, int i) {
        if ((i & 1) != 0) {
            list = abstractC5706oM1.T0();
        }
        if ((i & 2) != 0) {
            c5655o62 = abstractC5706oM1.U0();
        }
        return b(abstractC5706oM1, list, c5655o62);
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Hc2 {
    @NotNull
    public static final AbstractC5533nZ a(@NotNull AbstractC2766af2 abstractC2766af2) {
        Intrinsics.checkNotNullParameter(abstractC2766af2, "<this>");
        if (abstractC2766af2 == null) {
            C5891pE0.a(4);
            throw null;
        }
        AbstractC5533nZ abstractC5533nZG = (AbstractC5533nZ) C5891pE0.d.get(abstractC2766af2);
        if (abstractC5533nZG == null) {
            abstractC5533nZG = C5323mZ.g(abstractC2766af2);
        }
        Intrinsics.checkNotNullExpressionValue(abstractC5533nZG, "toDescriptorVisibility(...)");
        return abstractC5533nZG;
    }
}

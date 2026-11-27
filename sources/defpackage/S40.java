package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
public class S40 {
    public static final double a(double d, @NotNull R40 sourceUnit, @NotNull R40 targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.d.convert(1L, sourceUnit.d);
        return jConvert > 0 ? d * jConvert : d / sourceUnit.d.convert(1L, targetUnit.d);
    }

    public static final long b(long j, @NotNull R40 sourceUnit, @NotNull R40 targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.d.convert(j, sourceUnit.d);
    }

    public static final long c(long j, @NotNull R40 sourceUnit, @NotNull R40 targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.d.convert(j, sourceUnit.d);
    }
}

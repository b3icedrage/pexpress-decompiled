package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6990uV implements E10.c {

    @NotNull
    public final double[] a;

    public C6990uV() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C6990uV.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type com.api.feature.trading.direction.base_calculators.DefaultIndicatorOutput");
        return Arrays.equals(this.a, ((C6990uV) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.d("DefaultIndicatorOutput(output=", Arrays.toString(this.a), ")");
    }

    public C6990uV(@NotNull double[] output) {
        Intrinsics.checkNotNullParameter(output, "output");
        this.a = output;
    }

    public /* synthetic */ C6990uV(int i) {
        this(new double[1]);
    }
}

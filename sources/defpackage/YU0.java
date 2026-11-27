package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class YU0 implements E10.c {

    @NotNull
    public final double[] a;

    @NotNull
    public final double[] b;

    @NotNull
    public final double[] c;

    public YU0(@NotNull double[] outMACD, @NotNull double[] outSignal, @NotNull double[] outHist) {
        Intrinsics.checkNotNullParameter(outMACD, "outMACD");
        Intrinsics.checkNotNullParameter(outSignal, "outSignal");
        Intrinsics.checkNotNullParameter(outHist, "outHist");
        this.a = outMACD;
        this.b = outSignal;
        this.c = outHist;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!YU0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type com.api.feature.trading.direction.local_calculators.MACDOutput");
        YU0 yu0 = (YU0) obj;
        return Arrays.equals(this.a, yu0.a) && Arrays.equals(this.b, yu0.b) && Arrays.equals(this.c, yu0.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String string = Arrays.toString(this.a);
        String string2 = Arrays.toString(this.b);
        return C5807oq.b(C5896pG.a("MACDOutput(outMACD=", string, ", outSignal=", string2, ", outHist="), Arrays.toString(this.c), ")");
    }
}

package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class XM1 implements E10.c {
    public final int a;

    @NotNull
    public final double[] b;

    @NotNull
    public final double[] c;

    public XM1(int i) {
        double[] slowOutput = new double[i];
        double[] fastOutput = new double[i];
        Intrinsics.checkNotNullParameter(slowOutput, "slowOutput");
        Intrinsics.checkNotNullParameter(fastOutput, "fastOutput");
        this.a = i;
        this.b = slowOutput;
        this.c = fastOutput;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!XM1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type com.api.feature.trading.direction.local_calculators.SmaOutput");
        XM1 xm1 = (XM1) obj;
        return Arrays.equals(this.b, xm1.b) && Arrays.equals(this.c, xm1.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + (Arrays.hashCode(this.b) * 31);
    }

    @NotNull
    public final String toString() {
        String string = Arrays.toString(this.b);
        String string2 = Arrays.toString(this.c);
        StringBuilder sb = new StringBuilder("SmaOutput(arraySize=");
        sb.append(this.a);
        sb.append(", slowOutput=");
        sb.append(string);
        sb.append(", fastOutput=");
        return C5807oq.b(sb, string2, ")");
    }
}

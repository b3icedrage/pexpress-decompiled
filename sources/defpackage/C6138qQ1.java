package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6138qQ1 implements E10.c {

    @NotNull
    public final double[] a;

    @NotNull
    public final double[] b;

    public C6138qQ1(@NotNull double[] slowKOut, @NotNull double[] slowDOut) {
        Intrinsics.checkNotNullParameter(slowKOut, "slowKOut");
        Intrinsics.checkNotNullParameter(slowDOut, "slowDOut");
        this.a = slowKOut;
        this.b = slowDOut;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C6138qQ1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type com.api.feature.trading.direction.local_calculators.StochOutput");
        C6138qQ1 c6138qQ1 = (C6138qQ1) obj;
        return Arrays.equals(this.a, c6138qQ1.a) && Arrays.equals(this.b, c6138qQ1.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return C4694ja0.a("StochOutput(slowKOut=", Arrays.toString(this.a), ", slowDOut=", Arrays.toString(this.b), ")");
    }

    public C6138qQ1() {
        this(new double[1], new double[1]);
    }
}

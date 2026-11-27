package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5149lj implements E10.c {

    @NotNull
    public final double[] a;

    @NotNull
    public final double[] b;

    public C5149lj(@NotNull double[] outUp, @NotNull double[] outDown) {
        Intrinsics.checkNotNullParameter(outUp, "outUp");
        Intrinsics.checkNotNullParameter(outDown, "outDown");
        this.a = outUp;
        this.b = outDown;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5149lj.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type com.api.feature.trading.direction.local_calculators.AroonOutput");
        C5149lj c5149lj = (C5149lj) obj;
        return Arrays.equals(this.a, c5149lj.a) && Arrays.equals(this.b, c5149lj.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return C4694ja0.a("AroonOutput(outUp=", Arrays.toString(this.a), ", outDown=", Arrays.toString(this.b), ")");
    }
}

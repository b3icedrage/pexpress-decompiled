package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4283hp implements E10.c {

    @NotNull
    public final double[] a;

    @NotNull
    public final double[] b;

    @NotNull
    public final double[] c;

    public C4283hp(@NotNull double[] lowOutput, @NotNull double[] upOutput, @NotNull double[] middleOutput) {
        Intrinsics.checkNotNullParameter(lowOutput, "lowOutput");
        Intrinsics.checkNotNullParameter(upOutput, "upOutput");
        Intrinsics.checkNotNullParameter(middleOutput, "middleOutput");
        this.a = lowOutput;
        this.b = upOutput;
        this.c = middleOutput;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4283hp.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type com.api.feature.trading.direction.local_calculators.BBandsOutput");
        C4283hp c4283hp = (C4283hp) obj;
        return Arrays.equals(this.a, c4283hp.a) && Arrays.equals(this.b, c4283hp.b) && Arrays.equals(this.c, c4283hp.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String string = Arrays.toString(this.a);
        String string2 = Arrays.toString(this.b);
        return C5807oq.b(C5896pG.a("BBandsOutput(lowOutput=", string, ", upOutput=", string2, ", middleOutput="), Arrays.toString(this.c), ")");
    }
}

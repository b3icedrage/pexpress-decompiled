package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6466s implements E10.c {

    @NotNull
    public final double[] a;

    @NotNull
    public final double[] b;

    @NotNull
    public final double[] c;

    public C6466s() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C6466s.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type com.api.feature.trading.direction.local_calculators.ADXOutput");
        C6466s c6466s = (C6466s) obj;
        return Arrays.equals(this.a, c6466s.a) && Arrays.equals(this.b, c6466s.b) && Arrays.equals(this.c, c6466s.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String string = Arrays.toString(this.a);
        String string2 = Arrays.toString(this.b);
        return C5807oq.b(C5896pG.a("ADXOutput(adx=", string, ", adxPos=", string2, ", adxNeg="), Arrays.toString(this.c), ")");
    }

    public C6466s(int i) {
        double[] adx = new double[1];
        double[] adxPos = new double[1];
        double[] adxNeg = new double[1];
        Intrinsics.checkNotNullParameter(adx, "adx");
        Intrinsics.checkNotNullParameter(adxPos, "adxPos");
        Intrinsics.checkNotNullParameter(adxNeg, "adxNeg");
        this.a = adx;
        this.b = adxPos;
        this.c = adxNeg;
    }
}

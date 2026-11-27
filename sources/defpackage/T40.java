package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
public class T40 extends S40 {
    @NotNull
    public static final String d(@NotNull R40 r40) {
        Intrinsics.checkNotNullParameter(r40, "<this>");
        switch (r40.ordinal()) {
            case 0:
                return "ns";
            case 1:
                return "us";
            case 2:
                return "ms";
            case 3:
                return "s";
            case 4:
                return "m";
            case 5:
                return "h";
            case 6:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + r40).toString());
        }
    }
}

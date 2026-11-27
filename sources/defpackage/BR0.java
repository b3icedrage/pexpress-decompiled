package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class BR0 {

    @NotNull
    public final Set<E10> a;

    @NotNull
    public final Set<YU1> b;

    public BR0(@NotNull Set<E10> directionCalculatorsSet, @NotNull YU1 summaryDirectionCalculator) {
        Intrinsics.checkNotNullParameter(directionCalculatorsSet, "directionCalculatorsSet");
        Intrinsics.checkNotNullParameter(summaryDirectionCalculator, "summaryDirectionCalculator");
        this.a = directionCalculatorsSet;
        this.b = C5487nJ1.b(summaryDirectionCalculator);
    }
}

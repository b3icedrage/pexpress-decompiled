package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class SR1 extends P80 {

    @InterfaceC2691aI1("trading_strategy")
    @NotNull
    public final String a;

    public SR1(@NotNull String tradingStrategy) {
        Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
        this.a = tradingStrategy;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SR1) && Intrinsics.a(this.a, ((SR1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("StrategySummaryScreenShowProperty(tradingStrategy="), this.a, ")");
    }
}

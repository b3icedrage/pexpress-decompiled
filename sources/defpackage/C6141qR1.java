package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6141qR1 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public C6141qR1(@NotNull String strategyName, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(strategyName, "strategyName");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.a = strategyName;
        this.b = currencyCode;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6141qR1)) {
            return false;
        }
        C6141qR1 c6141qR1 = (C6141qR1) obj;
        return Intrinsics.a(this.a, c6141qR1.a) && Intrinsics.a(this.b, c6141qR1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StrategyInfoKey(strategyName=");
        sb.append(this.a);
        sb.append(", currencyCode=");
        return C5807oq.b(sb, this.b, ")");
    }
}

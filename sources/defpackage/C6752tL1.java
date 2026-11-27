package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6752tL1 {

    @NotNull
    public final String a;

    @NotNull
    public final Object b;

    public C6752tL1(@NotNull String indicatorName, @NotNull List<? extends Number> params) {
        Intrinsics.checkNotNullParameter(indicatorName, "indicatorName");
        Intrinsics.checkNotNullParameter(params, "params");
        this.a = indicatorName;
        this.b = params;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6752tL1)) {
            return false;
        }
        C6752tL1 c6752tL1 = (C6752tL1) obj;
        return this.a.equals(c6752tL1.a) && Intrinsics.a(this.b, c6752tL1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowOnPlatformIndicator(indicatorName=");
        sb.append(this.a);
        sb.append(", params=");
        return K1.a(sb, this.b, ")");
    }
}

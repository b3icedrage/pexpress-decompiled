package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ib1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1193Ib1 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public C1193Ib1(@NotNull String assetName, @NotNull String indicatorTitle) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(indicatorTitle, "indicatorTitle");
        this.a = assetName;
        this.b = indicatorTitle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1193Ib1)) {
            return false;
        }
        C1193Ib1 c1193Ib1 = (C1193Ib1) obj;
        return Intrinsics.a(this.a, c1193Ib1.a) && Intrinsics.a(this.b, c1193Ib1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PairUnavailableData(assetName=");
        sb.append(this.a);
        sb.append(", indicatorTitle=");
        return C5807oq.b(sb, this.b, ")");
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6542sL1 {

    @NotNull
    public final String a;

    @Nullable
    public final C6752tL1 b;

    @Nullable
    public final C2337Wr c;

    public C6542sL1(@NotNull String assetSymbol, @Nullable C6752tL1 c6752tL1, @Nullable C2337Wr c2337Wr) {
        Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
        this.a = assetSymbol;
        this.b = c6752tL1;
        this.c = c2337Wr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6542sL1)) {
            return false;
        }
        C6542sL1 c6542sL1 = (C6542sL1) obj;
        return Intrinsics.a(this.a, c6542sL1.a) && Intrinsics.a(this.b, c6542sL1.b) && Intrinsics.a(this.c, c6542sL1.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C6752tL1 c6752tL1 = this.b;
        int iHashCode2 = (iHashCode + (c6752tL1 == null ? 0 : c6752tL1.hashCode())) * 31;
        C2337Wr c2337Wr = this.c;
        return iHashCode2 + (c2337Wr != null ? c2337Wr.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ShowOnPlatformEvent(assetSymbol=" + this.a + ", indicator=" + this.b + ", bet=" + this.c + ")";
    }
}

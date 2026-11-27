package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: az0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2846az0 {

    @NotNull
    public final C1491Lx0 a;

    @Nullable
    public final InterfaceC7722xy0<?> b;
    public final boolean c;

    public C2846az0(@NotNull C1491Lx0 indicator, @Nullable InterfaceC7722xy0<?> interfaceC7722xy0, boolean z) {
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        this.a = indicator;
        this.b = interfaceC7722xy0;
        this.c = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2846az0)) {
            return false;
        }
        C2846az0 c2846az0 = (C2846az0) obj;
        return Intrinsics.a(this.a, c2846az0.a) && Intrinsics.a(this.b, c2846az0.b) && this.c == c2846az0.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        InterfaceC7722xy0<?> interfaceC7722xy0 = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (interfaceC7722xy0 == null ? 0 : interfaceC7722xy0.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IndicatorWithParams(indicator=");
        sb.append(this.a);
        sb.append(", params=");
        sb.append(this.b);
        sb.append(", paramsExperimentAvailable=");
        return C2983be.b(sb, this.c, ")");
    }
}

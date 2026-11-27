package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6584sZ1 {

    @NotNull
    public final List<C1709Or> a;
    public final boolean b;

    public C6584sZ1(@NotNull List<C1709Or> betDurationSelectionList, boolean z) {
        Intrinsics.checkNotNullParameter(betDurationSelectionList, "betDurationSelectionList");
        this.a = betDurationSelectionList;
        this.b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6584sZ1)) {
            return false;
        }
        C6584sZ1 c6584sZ1 = (C6584sZ1) obj;
        return Intrinsics.a(this.a, c6584sZ1.a) && this.b == c6584sZ1.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "TimeSelections(betDurationSelectionList=" + this.a + ", isAutoSelectionEnabled=" + this.b + ")";
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1840Qi1 extends P80 {

    @InterfaceC2691aI1("parent_element_1")
    @NotNull
    public final String a;

    public C1840Qi1() {
        Intrinsics.checkNotNullParameter("robot_screen", "parentElement");
        this.a = "robot_screen";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1840Qi1) && Intrinsics.a(this.a, ((C1840Qi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("ProfitLimitPopupShowProperty(parentElement="), this.a, ")");
    }
}

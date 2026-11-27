package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class LR1 extends P80 {

    @InterfaceC2691aI1("parent_element_1")
    @NotNull
    public final String a;

    public LR1() {
        Intrinsics.checkNotNullParameter("robot_screen", "parentElement");
        this.a = "robot_screen";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LR1) && Intrinsics.a(this.a, ((LR1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("StrategySelectionOverlayShowProperty(parentElement="), this.a, ")");
    }
}

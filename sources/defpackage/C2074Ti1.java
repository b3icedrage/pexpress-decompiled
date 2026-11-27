package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ti1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2074Ti1 extends P80 {

    @InterfaceC2691aI1("parent_element_1")
    @NotNull
    public final String a;

    @InterfaceC2691aI1("current_state")
    @NotNull
    public final String b;

    public C2074Ti1(@NotNull String currentState) {
        Intrinsics.checkNotNullParameter("robot_screen", "parentElement");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        this.a = "robot_screen";
        this.b = currentState;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2074Ti1)) {
            return false;
        }
        C2074Ti1 c2074Ti1 = (C2074Ti1) obj;
        return Intrinsics.a(this.a, c2074Ti1.a) && Intrinsics.a(this.b, c2074Ti1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfitLimitToggleClickProperty(parentElement=");
        sb.append(this.a);
        sb.append(", currentState=");
        return C5807oq.b(sb, this.b, ")");
    }
}

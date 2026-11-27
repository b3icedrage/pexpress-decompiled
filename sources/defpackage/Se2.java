package defpackage;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Se2 {

    @NotNull
    public final ViewGroup a;

    @NotNull
    public final GP1 b;

    @Nullable
    public final Integer c;

    public Se2(@NotNull ViewGroup view, @NotNull GP1 visibilityFlow, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(visibilityFlow, "visibilityFlow");
        this.a = view;
        this.b = visibilityFlow;
        this.c = num;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Se2)) {
            return false;
        }
        Se2 se2 = (Se2) obj;
        return Intrinsics.a(this.a, se2.a) && Intrinsics.a(this.b, se2.b) && Intrinsics.a(this.c, se2.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ViewVisibilityState(view=" + this.a + ", visibilityFlow=" + this.b + ", size=" + this.c + ")";
    }
}

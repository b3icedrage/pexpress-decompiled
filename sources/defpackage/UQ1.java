package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class UQ1 extends P80 {

    @InterfaceC2691aI1("stories_slides_total")
    public final int a;

    @InterfaceC2691aI1("stories_name")
    @NotNull
    public final String b;

    public UQ1(int i, @NotNull String storiesName) {
        Intrinsics.checkNotNullParameter(storiesName, "storiesName");
        this.a = i;
        this.b = storiesName;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UQ1)) {
            return false;
        }
        UQ1 uq1 = (UQ1) obj;
        return this.a == uq1.a && Intrinsics.a(this.b, uq1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return "StoriesFinishedProperty(storiesSlidesTotal=" + this.a + ", storiesName=" + this.b + ")";
    }
}

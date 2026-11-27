package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4310hy extends P80 {

    @InterfaceC2691aI1("parent_element_1")
    @NotNull
    public final String a;

    @InterfaceC2691aI1("parent_element_2")
    @NotNull
    public final String b;

    @InterfaceC2691aI1("parent_element_3")
    @NotNull
    public final String c;

    public C4310hy(@NotNull String firstParent, @NotNull String secondParent, @NotNull String thirdParent) {
        Intrinsics.checkNotNullParameter(firstParent, "firstParent");
        Intrinsics.checkNotNullParameter(secondParent, "secondParent");
        Intrinsics.checkNotNullParameter(thirdParent, "thirdParent");
        this.a = firstParent;
        this.b = secondParent;
        this.c = thirdParent;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4310hy)) {
            return false;
        }
        C4310hy c4310hy = (C4310hy) obj;
        return Intrinsics.a(this.a, c4310hy.a) && Intrinsics.a(this.b, c4310hy.b) && Intrinsics.a(this.c, c4310hy.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CancelButtonClickProperty(firstParent=");
        sb.append(this.a);
        sb.append(", secondParent=");
        sb.append(this.b);
        sb.append(", thirdParent=");
        return C5807oq.b(sb, this.c, ")");
    }
}

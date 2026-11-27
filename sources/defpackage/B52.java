package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class B52 {

    @NotNull
    public final List<G52> a;

    public B52(@NotNull List<G52> pagesData) {
        Intrinsics.checkNotNullParameter(pagesData, "pagesData");
        this.a = pagesData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B52) && Intrinsics.a(this.a, ((B52) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "TutorialData(pagesData=" + this.a + ")";
    }
}

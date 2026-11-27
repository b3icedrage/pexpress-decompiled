package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class DY {

    @NotNull
    public final String a;
    public final int b;

    @NotNull
    public final List<Object> c;
    public final int d;

    @NotNull
    public final List<Object> e;

    public DY(@NotNull String imageUrl, int i, @NotNull List<? extends Object> titleArgs, int i2, @NotNull List<? extends Object> descriptionArgs) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(titleArgs, "titleArgs");
        Intrinsics.checkNotNullParameter(descriptionArgs, "descriptionArgs");
        this.a = imageUrl;
        this.b = i;
        this.c = titleArgs;
        this.d = i2;
        this.e = descriptionArgs;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DY)) {
            return false;
        }
        DY dy = (DY) obj;
        return Intrinsics.a(this.a, dy.a) && this.b == dy.b && Intrinsics.a(this.c, dy.c) && this.d == dy.d && Intrinsics.a(this.e, dy.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + EF0.a(this.d, C5491nL.b(EF0.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31);
    }

    @NotNull
    public final String toString() {
        return "DescriptionStep(imageUrl=" + this.a + ", titleRes=" + this.b + ", titleArgs=" + this.c + ", descriptionRes=" + this.d + ", descriptionArgs=" + this.e + ")";
    }
}

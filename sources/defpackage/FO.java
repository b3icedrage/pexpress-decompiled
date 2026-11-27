package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class FO {
    public final int a;

    @NotNull
    public final String b;

    public FO(int i, @NotNull String imageName) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        this.a = i;
        this.b = imageName;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FO)) {
            return false;
        }
        FO fo = (FO) obj;
        return this.a == fo.a && this.b.equals(fo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Cover(textResId=");
        sb.append(this.a);
        sb.append(", imageName=");
        return C5807oq.b(sb, this.b, ")");
    }
}

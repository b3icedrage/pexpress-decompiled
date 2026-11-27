package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AW {

    @Nullable
    public final C6432ro1 a;

    public AW(@Nullable C6432ro1 c6432ro1) {
        this.a = c6432ro1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AW)) {
            return false;
        }
        AW aw = (AW) obj;
        aw.getClass();
        return Intrinsics.a(this.a, aw.a);
    }

    public final int hashCode() {
        C6432ro1 c6432ro1 = this.a;
        return (c6432ro1 != null ? c6432ro1.a.hashCode() : 0) * (-1796951359);
    }

    @NotNull
    public final String toString() {
        return "DefinedRequestOptions(lifecycle=null, sizeResolver=" + this.a + ", scale=null, dispatcher=null, transition=null, precision=null, bitmapConfig=null, allowHardware=null, allowRgb565=null, memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null)";
    }
}

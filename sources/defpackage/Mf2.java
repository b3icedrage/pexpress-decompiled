package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Mf2 {

    @NotNull
    public final List<String> a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public Mf2(@NotNull List<String> mimeTypes, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(mimeTypes, "mimeTypes");
        this.a = mimeTypes;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mf2)) {
            return false;
        }
        Mf2 mf2 = (Mf2) obj;
        return Intrinsics.a(this.a, mf2.a) && this.b == mf2.b && this.c == mf2.c && this.d == mf2.d && this.e == mf2.e && this.f == mf2.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + C2983be.a(C2983be.a(C2983be.a(C2983be.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    @NotNull
    public final String toString() {
        return "WebFileChooserSpec(mimeTypes=" + this.a + ", allowMultiple=" + this.b + ", wantsImageCapture=" + this.c + ", wantsVideoCapture=" + this.d + ", isCaptureOnly=" + this.e + ", isSupported=" + this.f + ")";
    }
}

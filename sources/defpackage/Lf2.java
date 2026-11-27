package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Lf2 {

    @NotNull
    public final Mf2 a;

    @Nullable
    public final CharSequence b;

    @Nullable
    public final Uri c;

    @Nullable
    public final Uri d;

    public Lf2(@NotNull Mf2 spec, @Nullable CharSequence charSequence, @Nullable Uri uri, @Nullable Uri uri2) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        this.a = spec;
        this.b = charSequence;
        this.c = uri;
        this.d = uri2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lf2)) {
            return false;
        }
        Lf2 lf2 = (Lf2) obj;
        return Intrinsics.a(this.a, lf2.a) && Intrinsics.a(this.b, lf2.b) && Intrinsics.a(this.c, lf2.c) && Intrinsics.a(this.d, lf2.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Uri uri = this.c;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.d;
        return iHashCode3 + (uri2 != null ? uri2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "WebFileChooserRequest(spec=" + this.a + ", chooserTitle=" + ((Object) this.b) + ", imageCaptureUri=" + this.c + ", videoCaptureUri=" + this.d + ")";
    }
}

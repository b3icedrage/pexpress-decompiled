package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class VU1 extends AbstractC7926yw0 {

    @NotNull
    public final Drawable a;

    @NotNull
    public final C7716xw0 b;

    @NotNull
    public final AbstractC7926yw0.a c;

    public VU1(@NotNull Drawable drawable, @NotNull C7716xw0 request, @NotNull AbstractC7926yw0.a metadata) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.a = drawable;
        this.b = request;
        this.c = metadata;
    }

    @Override // defpackage.AbstractC7926yw0
    @NotNull
    public final C7716xw0 a() {
        return this.b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VU1)) {
            return false;
        }
        VU1 vu1 = (VU1) obj;
        return Intrinsics.a(this.a, vu1.a) && Intrinsics.a(this.b, vu1.b) && Intrinsics.a(this.c, vu1.c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int iHashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        C7716xw0 c7716xw0 = this.b;
        int iHashCode2 = (iHashCode + (c7716xw0 != null ? c7716xw0.hashCode() : 0)) * 31;
        AbstractC7926yw0.a aVar = this.c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SuccessResult(drawable=" + this.a + ", request=" + this.b + ", metadata=" + this.c + ")";
    }
}

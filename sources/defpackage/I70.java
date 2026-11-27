package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class I70 extends AbstractC7926yw0 {

    @Nullable
    public final Drawable a;

    @NotNull
    public final C7716xw0 b;

    @NotNull
    public final Throwable c;

    public I70(@Nullable Drawable drawable, @NotNull C7716xw0 request, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.a = drawable;
        this.b = request;
        this.c = throwable;
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
        if (!(obj instanceof I70)) {
            return false;
        }
        I70 i70 = (I70) obj;
        return Intrinsics.a(this.a, i70.a) && Intrinsics.a(this.b, i70.b) && Intrinsics.a(this.c, i70.c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int iHashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        C7716xw0 c7716xw0 = this.b;
        int iHashCode2 = (iHashCode + (c7716xw0 != null ? c7716xw0.hashCode() : 0)) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ErrorResult(drawable=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ")";
    }
}

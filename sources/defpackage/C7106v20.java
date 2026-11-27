package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: v20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7106v20 implements OM1 {
    public final Context a;

    public C7106v20(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // defpackage.OM1
    @Nullable
    public final Object a(@NotNull C5170lo1 c5170lo1) {
        Resources resources = this.a.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return new C1433Ld1(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7106v20) {
            return Intrinsics.a(this.a, ((C7106v20) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DisplaySizeResolver(context=" + this.a + ')';
    }
}

package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Sa2 {

    @NotNull
    public final Context a;

    @NotNull
    public final KW1 b;

    public Sa2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = XO0.b(new C3410dg(this, 4));
    }
}

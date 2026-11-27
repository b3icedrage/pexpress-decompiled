package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class X32 extends V32 {

    @NotNull
    public final String a;

    @Nullable
    public final Throwable b;
    public final boolean c;

    @Nullable
    public final String d;

    public X32() {
        this(null, 15, false, null, null);
    }

    public X32(String reason, int i, boolean z, String str, Throwable th) {
        reason = (i & 1) != 0 ? "" : reason;
        th = (i & 2) != 0 ? null : th;
        z = (i & 4) != 0 ? false : z;
        str = (i & 8) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.a = reason;
        this.b = th;
        this.c = z;
        this.d = str;
    }
}

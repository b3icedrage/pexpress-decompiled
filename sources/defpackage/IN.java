package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class IN extends kotlin.coroutines.a {

    @NotNull
    public static final a g = new a();

    @NotNull
    public final String e;

    public static final class a implements CoroutineContext.a<IN> {
    }

    public IN(@NotNull String str) {
        super(g);
        this.e = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IN) && Intrinsics.a(this.e, ((IN) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("CoroutineName("), this.e, ')');
    }
}

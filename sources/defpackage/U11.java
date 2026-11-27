package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class U11 extends VP {
    public /* synthetic */ U11(int i) {
        this(VP.a.b);
    }

    @Nullable
    public final <T> T a(@NotNull VP.b<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.a.get(key);
    }

    public final <T> void b(@NotNull VP.b<T> key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.a.put(key, t);
    }

    public U11(@NotNull VP initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        this.a.putAll(initialExtras.a);
    }
}

package defpackage;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class If2 {

    @NotNull
    public final WeakReference<ClassLoader> a;
    public final int b;

    public If2(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.a = new WeakReference<>(classLoader);
        this.b = System.identityHashCode(classLoader);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof If2) && this.a.get() == ((If2) obj).a.get();
    }

    public final int hashCode() {
        return this.b;
    }

    @NotNull
    public final String toString() {
        String string;
        ClassLoader classLoader = this.a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}

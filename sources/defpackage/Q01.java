package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Q01<T> {

    @NotNull
    public final String a;

    public Q01(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
    }

    @NotNull
    public final String toString() {
        return this.a;
    }
}

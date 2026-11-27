package defpackage;

import androidx.lifecycle.s;
import defpackage.Qd2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Td2<T extends Qd2> {

    @NotNull
    public final Class<T> a;

    @NotNull
    public final s.d b;

    public Td2(@NotNull Class clazz, @NotNull s.d initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.a = clazz;
        this.b = initializer;
    }
}

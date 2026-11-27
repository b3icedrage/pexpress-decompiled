package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1173Hv {
    @NotNull
    public static final C7462wj a(@NotNull RJ0 elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new C7462wj(elementSerializer);
    }

    @NotNull
    public static final C6976uQ0 b(@NotNull RJ0 keySerializer, @NotNull RJ0 valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new C6976uQ0(keySerializer, valueSerializer);
    }

    @NotNull
    public static final <T> RJ0<T> c(@NotNull RJ0<T> rj0) {
        Intrinsics.checkNotNullParameter(rj0, "<this>");
        return rj0.c().c() ? rj0 : new C6078q71(rj0);
    }

    @NotNull
    public static final void d(@NotNull C4881kS1 c4881kS1) {
        Intrinsics.checkNotNullParameter(c4881kS1, "<this>");
        C6144qS1 c6144qS1 = C6144qS1.a;
    }
}

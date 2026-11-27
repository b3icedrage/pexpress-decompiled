package defpackage;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class C5487nJ1 {
    @NotNull
    public static C3337dJ1 a(@NotNull C3337dJ1 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        C5315mW0<E, ?> c5315mW0 = builder.d;
        c5315mW0.c();
        return c5315mW0.m > 0 ? builder : C3337dJ1.g;
    }

    @NotNull
    public static <T> Set<T> b(T t) {
        Set<T> setSingleton = Collections.singleton(t);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }
}

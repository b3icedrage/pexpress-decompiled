package kotlin.coroutines;

import defpackage.ML0;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.a<E> {

    @NotNull
    public final ML0 d;

    @NotNull
    public final CoroutineContext.a<?> e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.CoroutineContext$a<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>] */
    public b(@NotNull CoroutineContext.a<B> baseKey, @NotNull Function1<? super CoroutineContext.Element, ? extends E> safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.d = (ML0) safeCast;
        this.e = baseKey instanceof b ? (CoroutineContext.a<B>) ((b) baseKey).e : baseKey;
    }
}

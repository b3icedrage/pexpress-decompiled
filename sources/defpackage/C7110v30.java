package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: v30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7110v30 implements CoroutineContext {

    @NotNull
    public final Throwable d;
    public final /* synthetic */ CoroutineContext e;

    public C7110v30(@NotNull Throwable th, @NotNull CoroutineContext coroutineContext) {
        this.d = th;
        this.e = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext L(@NotNull CoroutineContext.a<?> aVar) {
        return this.e.L(aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R R0(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) this.e.R0(r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public final <E extends CoroutineContext.Element> E p(@NotNull CoroutineContext.a<E> aVar) {
        return (E) this.e.p(aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext t(@NotNull CoroutineContext coroutineContext) {
        return this.e.t(coroutineContext);
    }
}

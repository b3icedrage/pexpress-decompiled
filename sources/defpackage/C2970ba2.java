package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ba2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2970ba2 implements CoroutineContext.Element {

    @Nullable
    public final C2970ba2 d;

    @NotNull
    public final IS<?> e;

    public C2970ba2(@Nullable C2970ba2 c2970ba2, @NotNull IS<?> instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.d = c2970ba2;
        this.e = instance;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext L(@NotNull CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R R0(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(r, this);
    }

    public final void a(@NotNull IS candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.e == candidate) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        C2970ba2 c2970ba2 = this.d;
        if (c2970ba2 != null) {
            c2970ba2.a(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.a<?> getKey() {
        return C2746aa2.d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public final <E extends CoroutineContext.Element> E p(@NotNull CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.a(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext t(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.c(this, coroutineContext);
    }
}

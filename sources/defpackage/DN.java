package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.b;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DN extends kotlin.coroutines.a implements d {

    @NotNull
    public static final a e = new a(d.f, CN.d);

    public static final class a extends b<d, DN> {
    }

    public DN() {
        super(d.f);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [ML0, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext L(@NotNull CoroutineContext.a<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof b) {
            b bVar = (b) key;
            bVar.getClass();
            CoroutineContext.a<?> key2 = this.d;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.e != key2) {
                return this;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            if (((CoroutineContext.Element) bVar.d.invoke(this)) != null) {
                return e.d;
            }
        } else if (d.f == key) {
            return e.d;
        }
        return this;
    }

    @Override // kotlin.coroutines.d
    public final void V0(@NotNull JM<?> jm) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Intrinsics.c(jm, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        C5004l20 c5004l20 = (C5004l20) jm;
        do {
            atomicReferenceFieldUpdater = C5004l20.l;
        } while (atomicReferenceFieldUpdater.get(c5004l20) == UE.d);
        Object obj = atomicReferenceFieldUpdater.get(c5004l20);
        C6251qy c6251qy = obj instanceof C6251qy ? (C6251qy) obj : null;
        if (c6251qy != null) {
            c6251qy.n();
        }
    }

    public abstract void c1(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable);

    public void j1(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        c1(coroutineContext, runnable);
    }

    public boolean k1(@NotNull CoroutineContext coroutineContext) {
        return !(this instanceof C7342w82);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [ML0, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    @Nullable
    public final <E extends CoroutineContext.Element> E p(@NotNull CoroutineContext.a<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(key instanceof b)) {
            if (d.f == key) {
                return this;
            }
            return null;
        }
        b bVar = (b) key;
        bVar.getClass();
        CoroutineContext.a<?> key2 = this.d;
        Intrinsics.checkNotNullParameter(key2, "key");
        if (key2 != bVar && bVar.e != key2) {
            return null;
        }
        Intrinsics.checkNotNullParameter(this, "element");
        E e2 = (E) bVar.d.invoke(this);
        if (e2 != null) {
            return e2;
        }
        return null;
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '@' + C3787fU.f(this);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public final C5004l20 u(@NotNull LM lm) {
        return new C5004l20(this, lm);
    }
}

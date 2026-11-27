package kotlin.coroutines;

import defpackage.C1039Gc0;
import defpackage.C4630jF;
import defpackage.C8017zN;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements CoroutineContext, Serializable {

    @NotNull
    public final CoroutineContext d;

    @NotNull
    public final CoroutineContext.Element e;

    public c(@NotNull CoroutineContext.Element element, @NotNull CoroutineContext left) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.d = left;
        this.e = element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext L(@NotNull CoroutineContext.a<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.e;
        CoroutineContext.Element elementP = element.p(key);
        CoroutineContext coroutineContext = this.d;
        if (elementP != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextL = coroutineContext.L(key);
        if (coroutineContextL == coroutineContext) {
            return this;
        }
        return coroutineContextL == e.d ? element : new c(element, coroutineContextL);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R R0(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke((Object) this.d.R0(r, operation), this.e);
    }

    public final boolean equals(@Nullable Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            int i = 2;
            c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                CoroutineContext coroutineContext = cVar2.d;
                cVar2 = coroutineContext instanceof c ? (c) coroutineContext : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = cVar3.d;
                cVar3 = coroutineContext2 instanceof c ? (c) coroutineContext2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                c cVar4 = this;
                while (true) {
                    CoroutineContext.Element element = cVar4.e;
                    if (!Intrinsics.a(cVar.p(element.getKey()), element)) {
                        zA = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = cVar4.d;
                    if (!(coroutineContext3 instanceof c)) {
                        Intrinsics.c(coroutineContext3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        zA = Intrinsics.a(cVar.p(element2.getKey()), element2);
                        break;
                    }
                    cVar4 = (c) coroutineContext3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + this.d.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public final <E extends CoroutineContext.Element> E p(@NotNull CoroutineContext.a<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            E e = (E) cVar.e.p(key);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = cVar.d;
            if (!(coroutineContext instanceof c)) {
                return (E) coroutineContext.p(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext t(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == e.d ? this : (CoroutineContext) context.R0(this, new C8017zN(0));
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("["), (String) R0("", new C4630jF()), ']');
    }
}

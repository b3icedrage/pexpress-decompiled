package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LAH1;", "T", "LBH1;", "", "LJM;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AH1<T> extends BH1<T> implements Iterator<T>, JM<Unit>, InterfaceC6745tJ0 {
    public int d;

    @Nullable
    public T e;

    @Nullable
    public Iterator<? extends T> g;

    @Nullable
    public JM<? super Unit> h;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.BH1
    @Nullable
    public final void c(Object obj, @NotNull AbstractC1639Nt1 frame) {
        this.e = obj;
        this.d = 3;
        this.h = frame;
        MN mn = MN.d;
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    @Override // defpackage.BH1
    @Nullable
    public final Object d(@NotNull Iterator it, @NotNull Od2 frame) {
        if (!it.hasNext()) {
            return Unit.a;
        }
        this.g = it;
        this.d = 2;
        this.h = frame;
        MN mn = MN.d;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return mn;
    }

    public final RuntimeException e() {
        int i = this.d;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.d);
    }

    @Override // defpackage.JM
    @NotNull
    public final CoroutineContext getContext() {
        return e.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator<? extends T> it = this.g;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.d = 2;
                    return true;
                }
                this.g = null;
            }
            this.d = 5;
            JM<? super Unit> jm = this.h;
            Intrinsics.checkNotNull(jm);
            this.h = null;
            C1717Ot1.a aVar = C1717Ot1.e;
            jm.resumeWith(Unit.a);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.d;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.d = 1;
            Iterator<? extends T> it = this.g;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (i != 3) {
            throw e();
        }
        this.d = 0;
        T t = this.e;
        this.e = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.JM
    public final void resumeWith(@NotNull Object obj) {
        C1795Pt1.b(obj);
        this.d = 4;
    }
}

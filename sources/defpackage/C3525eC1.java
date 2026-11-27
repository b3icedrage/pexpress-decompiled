package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3525eC1<T> implements JM<T>, NN {

    @NotNull
    private static final a e = new a(null);
    public static final AtomicReferenceFieldUpdater<C3525eC1<?>, Object> g = AtomicReferenceFieldUpdater.newUpdater(C3525eC1.class, Object.class, "result");

    @NotNull
    public final JM<T> d;

    @Nullable
    private volatile Object result;

    /* JADX INFO: renamed from: eC1$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public C3525eC1() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3525eC1(@NotNull JM<? super T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        MN mn = MN.e;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.d = delegate;
        this.result = mn;
    }

    @Nullable
    public final Object a() {
        Object obj = this.result;
        MN mn = MN.e;
        if (obj == mn) {
            AtomicReferenceFieldUpdater<C3525eC1<?>, Object> atomicReferenceFieldUpdater = g;
            MN mn2 = MN.d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mn, mn2)) {
                if (atomicReferenceFieldUpdater.get(this) != mn) {
                    obj = this.result;
                }
            }
            return MN.d;
        }
        if (obj == MN.g) {
            return MN.d;
        }
        if (obj instanceof C1717Ot1.b) {
            throw ((C1717Ot1.b) obj).d;
        }
        return obj;
    }

    @Override // defpackage.NN
    @Nullable
    public final NN getCallerFrame() {
        JM<T> jm = this.d;
        if (jm instanceof NN) {
            return (NN) jm;
        }
        return null;
    }

    @Override // defpackage.JM
    @NotNull
    public final CoroutineContext getContext() {
        return this.d.getContext();
    }

    @Override // defpackage.JM
    public final void resumeWith(@NotNull Object obj) {
        while (true) {
            Object obj2 = this.result;
            MN mn = MN.e;
            if (obj2 == mn) {
                AtomicReferenceFieldUpdater<C3525eC1<?>, Object> atomicReferenceFieldUpdater = g;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mn, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != mn) {
                    }
                }
                return;
            }
            MN mn2 = MN.d;
            if (obj2 != mn2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater<C3525eC1<?>, Object> atomicReferenceFieldUpdater2 = g;
            MN mn3 = MN.g;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, mn2, mn3)) {
                    this.d.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == mn2);
        }
    }

    @NotNull
    public final String toString() {
        return "SafeContinuation for " + this.d;
    }
}

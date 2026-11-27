package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4623jC1<T> implements InterfaceC3770fO0<T>, Serializable {

    @NotNull
    public static final a g = new a(null);
    public static final AtomicReferenceFieldUpdater<C4623jC1<?>, Object> h = AtomicReferenceFieldUpdater.newUpdater(C4623jC1.class, Object.class, "e");

    @Nullable
    public volatile Function0<? extends T> d;

    @Nullable
    public volatile Object e;

    /* JADX INFO: renamed from: jC1$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public C4623jC1() {
        throw null;
    }

    @Override // defpackage.InterfaceC3770fO0
    public final boolean d() {
        return this.e != Y72.a;
    }

    @Override // defpackage.InterfaceC3770fO0
    public final T getValue() {
        T t = (T) this.e;
        Y72 y72 = Y72.a;
        if (t != y72) {
            return t;
        }
        Function0<? extends T> function0 = this.d;
        if (function0 != null) {
            T tInvoke = function0.invoke();
            AtomicReferenceFieldUpdater<C4623jC1<?>, Object> atomicReferenceFieldUpdater = h;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, y72, tInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != y72) {
                }
            }
            this.d = null;
            return tInvoke;
        }
        return (T) this.e;
    }

    @NotNull
    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class KW1<T> implements InterfaceC3770fO0<T>, Serializable {

    @Nullable
    public Function0<? extends T> d;

    @Nullable
    public volatile Object e;

    @NotNull
    public final Object g;

    public KW1(Function0 initializer, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i & 2) != 0 ? null : obj;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.d = initializer;
        this.e = Y72.a;
        this.g = obj == null ? this : obj;
    }

    @Override // defpackage.InterfaceC3770fO0
    public final boolean d() {
        return this.e != Y72.a;
    }

    @Override // defpackage.InterfaceC3770fO0
    public final T getValue() {
        T tInvoke;
        T t = (T) this.e;
        Y72 y72 = Y72.a;
        if (t != y72) {
            return t;
        }
        synchronized (this.g) {
            tInvoke = (T) this.e;
            if (tInvoke == y72) {
                Function0<? extends T> function0 = this.d;
                Intrinsics.checkNotNull(function0);
                tInvoke = function0.invoke();
                this.e = tInvoke;
                this.d = null;
            }
        }
        return tInvoke;
    }

    @NotNull
    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4146h92<T> implements InterfaceC3770fO0<T>, Serializable {

    @Nullable
    public Function0<? extends T> d;

    @Nullable
    public Object e;

    @Override // defpackage.InterfaceC3770fO0
    public final boolean d() {
        return this.e != Y72.a;
    }

    @Override // defpackage.InterfaceC3770fO0
    public final T getValue() {
        if (this.e == Y72.a) {
            Function0<? extends T> function0 = this.d;
            Intrinsics.checkNotNull(function0);
            this.e = function0.invoke();
            this.d = null;
        }
        return (T) this.e;
    }

    @NotNull
    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

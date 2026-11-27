package defpackage;

import androidx.lifecycle.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6298rA0 implements x.b {

    @NotNull
    public final Td2<?>[] a;

    public C6298rA0(@NotNull Td2<?>... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.a = initializers;
    }

    @Override // androidx.lifecycle.x.b
    @NotNull
    public final Qd2 b(@NotNull Class modelClass, @NotNull U11 extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Qd2 qd2 = null;
        for (Td2<?> td2 : this.a) {
            if (td2.a.equals(modelClass)) {
                qd2 = (Qd2) td2.b.invoke(extras);
            }
        }
        if (qd2 != null) {
            return qd2;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(modelClass.getName()));
    }
}

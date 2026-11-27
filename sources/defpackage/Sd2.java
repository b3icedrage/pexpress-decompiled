package defpackage;

import androidx.lifecycle.x;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Sd2 implements x.b {

    @NotNull
    public final Map<Class<? extends Qd2>, InterfaceC1531Mk1<Qd2>> a;

    public Sd2(@NotNull Map<Class<? extends Qd2>, InterfaceC1531Mk1<Qd2>> viewModels) {
        Intrinsics.checkNotNullParameter(viewModels, "viewModels");
        this.a = viewModels;
    }

    @Override // androidx.lifecycle.x.b
    @NotNull
    public final <T extends Qd2> T a(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        InterfaceC1531Mk1<Qd2> interfaceC1531Mk1 = this.a.get(modelClass);
        if (interfaceC1531Mk1 != null) {
            Qd2 qd2 = interfaceC1531Mk1.get();
            Intrinsics.c(qd2, "null cannot be cast to non-null type T of com.api.core.di.utils.ViewModelFactory.create");
            return (T) qd2;
        }
        throw new IllegalArgumentException("model class " + modelClass + " not found");
    }
}

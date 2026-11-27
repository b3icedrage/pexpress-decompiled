package defpackage;

import androidx.lifecycle.x;
import defpackage.Qd2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Rd2<T extends Qd2> implements x.b {

    @NotNull
    public final UF0 a;

    public Rd2(@NotNull UF0 viewModelProvider) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.a = viewModelProvider;
    }

    @Override // androidx.lifecycle.x.b
    @NotNull
    public final <VM extends Qd2> VM a(@NotNull Class<VM> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (VM) this.a.get();
    }
}

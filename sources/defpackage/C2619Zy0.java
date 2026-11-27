package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Zy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2619Zy0 extends RecyclerView.C {

    @NotNull
    public final InterfaceC3681ey0<?> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2619Zy0(@NotNull InterfaceC3681ey0<?> indicatorItemBindingProvider) {
        super(indicatorItemBindingProvider.W().d);
        Intrinsics.checkNotNullParameter(indicatorItemBindingProvider, "indicatorItemBindingProvider");
        this.u = indicatorItemBindingProvider;
    }
}

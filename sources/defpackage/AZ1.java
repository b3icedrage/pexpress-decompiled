package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AZ1 extends RecyclerView.C {

    @NotNull
    public final InterfaceC3385dZ1 u;

    @NotNull
    public final InterfaceC3804fZ1 v;

    @NotNull
    public final C5325mZ1 w;
    public final boolean x;

    @Nullable
    public C1709Or y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AZ1(@NotNull InterfaceC3385dZ1 timeItemBindingProvider, @NotNull InterfaceC3804fZ1 resourcesProvider, @NotNull C5325mZ1 onItemClick, boolean z) {
        super(timeItemBindingProvider.b());
        Intrinsics.checkNotNullParameter(timeItemBindingProvider, "timeItemBindingProvider");
        Intrinsics.checkNotNullParameter(resourcesProvider, "resourcesProvider");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.u = timeItemBindingProvider;
        this.v = resourcesProvider;
        this.w = onItemClick;
        this.x = z;
        timeItemBindingProvider.b().setOnClickListener(new ViewOnClickListenerC5228m5(this, 3));
    }
}

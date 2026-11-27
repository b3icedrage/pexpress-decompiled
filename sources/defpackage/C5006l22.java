package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5006l22 extends RecyclerView.C {

    @NotNull
    public static final IntRange w = new IntRange(80, 100, 1);

    @NotNull
    public static final IntRange x = new IntRange(50, 79, 1);

    @NotNull
    public final InterfaceC3698f22 u;

    @NotNull
    public final C5812or1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5006l22(@NotNull InterfaceC3698f22 tradingAssetBindingProvider, @NotNull C5812or1 onItemClick) {
        super(tradingAssetBindingProvider.b());
        Intrinsics.checkNotNullParameter(tradingAssetBindingProvider, "tradingAssetBindingProvider");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.u = tradingAssetBindingProvider;
        this.v = onItemClick;
    }
}

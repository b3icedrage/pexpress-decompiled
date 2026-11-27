package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Zz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2622Zz0 extends AbstractC2362Wz0 {

    @NotNull
    public final InterfaceC7524x11 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2622Zz0(@NotNull JA chartStartTimeProvider, @NotNull InterfaceC4255hh1 priceLinesUseCase, @NotNull S7 addBetOnChartUseCase, @NotNull InterfaceC7524x11 moveToChartEndUseCase) {
        super(chartStartTimeProvider, priceLinesUseCase, addBetOnChartUseCase);
        Intrinsics.checkNotNullParameter(chartStartTimeProvider, "chartStartTimeProvider");
        Intrinsics.checkNotNullParameter(priceLinesUseCase, "priceLinesUseCase");
        Intrinsics.checkNotNullParameter(addBetOnChartUseCase, "addBetOnChartUseCase");
        Intrinsics.checkNotNullParameter(moveToChartEndUseCase, "moveToChartEndUseCase");
        this.g = moveToChartEndUseCase;
    }

    @Override // defpackage.AbstractC2362Wz0
    @NotNull
    public final InterfaceC7524x11 d() {
        return this.g;
    }
}

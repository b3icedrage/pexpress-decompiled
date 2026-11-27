package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class B92 implements A92 {

    @NotNull
    public final L32 a;

    public B92(@NotNull L32 tradingRepository) {
        Intrinsics.checkNotNullParameter(tradingRepository, "tradingRepository");
        this.a = tradingRepository;
    }

    @Override // defpackage.A92
    @Nullable
    public final Object a(@NotNull String assetId, @NotNull C3569eR0 c3569eR0) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Unit unitA = this.a.a();
        return unitA == MN.d ? unitA : Unit.a;
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.DirectionCalculator$DefaultImpls", f = "DirectionCalculator.kt", l = {30}, m = "calculateDirectionResult")
public final class F10 extends LM {
    public /* synthetic */ Object d;
    public int e;

    public F10() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return E10.b.a(null, null, this);
    }
}

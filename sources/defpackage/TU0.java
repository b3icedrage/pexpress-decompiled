package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.local_calculators.MACDDirectionCalculator", f = "MACDDirectionCalculator.kt", l = {44, 45, 47}, m = "calculateDirectionResult")
public final class TU0 extends LM {
    public VU0 d;
    public I10 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ VU0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TU0(VU0 vu0, LM lm) {
        super(lm);
        this.h = vu0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}

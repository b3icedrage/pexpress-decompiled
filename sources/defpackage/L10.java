package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.DirectionCalculatorProvider", f = "DirectionCalculatorProvider.kt", l = {20}, m = "getCurrentDirectionCalculator")
public final class L10 extends LM {
    public E10.a d;
    public /* synthetic */ Object e;
    public final /* synthetic */ M10 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L10(M10 m10, LM lm) {
        super(lm);
        this.g = m10;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}

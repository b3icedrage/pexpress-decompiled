package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.trading.usecases.TraderImpl", f = "TraderImpl.kt", l = {109}, m = "checkAvailability")
public final class U12 extends LM {
    public C3279d22 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Y12 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U12(Y12 y12, LM lm) {
        super(lm);
        this.g = y12;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(null, this);
    }
}

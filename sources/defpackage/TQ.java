package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.CurrentStartAmountProvider", f = "CurrentStartAmountProvider.kt", l = {66}, m = "getMaxAmount")
public final class TQ extends LM {
    public VQ d;
    public /* synthetic */ Object e;
    public final /* synthetic */ VQ g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TQ(VQ vq, LM lm) {
        super(lm);
        this.g = vq;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}

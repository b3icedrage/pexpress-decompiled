package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.CurrencySignProviderBase", f = "CurrencySignProviderBase.kt", l = {26}, m = "getCurrencySign")
public final class GQ extends LM {
    public HQ d;
    public /* synthetic */ Object e;
    public final /* synthetic */ HQ g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GQ(HQ hq, LM lm) {
        super(lm);
        this.g = hq;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.MarketingEventsManager", f = "MarketingEventsManager.kt", l = {67}, m = "trySendMarketingLoginEvent")
public final class ZW0 extends LM {
    public C3378dX0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3378dX0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZW0(C3378dX0 c3378dX0, LM lm) {
        super(lm);
        this.g = c3378dX0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        int i = C3378dX0.g;
        return this.g.b(this);
    }
}

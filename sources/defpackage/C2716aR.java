package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.CurrentStrategyProvider", f = "CurrentStrategyProvider.kt", l = {83}, m = "getPercentsValue")
public final class C2716aR extends LM {
    public C3279d22 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3149cR g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2716aR(C3149cR c3149cR, LM lm) {
        super(lm);
        this.g = c3149cR;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}

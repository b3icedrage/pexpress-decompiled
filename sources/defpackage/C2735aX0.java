package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.MarketingEventsManager", f = "MarketingEventsManager.kt", l = {79, 85, 94}, m = "trySendMarketingRegisterEventIfNeeded-VtjQ1oo")
public final class C2735aX0 extends LM {
    public C3378dX0 d;
    public C6945uG e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C3378dX0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2735aX0(C3378dX0 c3378dX0, LM lm) {
        super(lm);
        this.h = c3378dX0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        int i = C3378dX0.g;
        return this.h.c(0L, this);
    }
}

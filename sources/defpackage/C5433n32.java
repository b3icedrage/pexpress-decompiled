package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController", f = "TradingNotificationController.kt", l = {233}, m = "getPercents")
public final class C5433n32 extends LM {
    public C3279d22 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ D32 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5433n32(D32 d32, LM lm) {
        super(lm);
        this.g = d32;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.g(null, this);
    }
}

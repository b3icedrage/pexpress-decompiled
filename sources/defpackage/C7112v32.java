package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: v32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController", f = "TradingNotificationController.kt", l = {130, 133, 134}, m = "onTradingStarted")
public final class C7112v32 extends LM {
    public D32 d;
    public KN e;
    public Object g;
    public D32 h;
    public C2255Vr i;
    public /* synthetic */ Object j;
    public final /* synthetic */ D32 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7112v32(D32 d32, JM<? super C7112v32> jm) {
        super(jm);
        this.k = d32;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return D32.c(this.k, null, this);
    }
}

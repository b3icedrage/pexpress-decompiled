package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController", f = "TradingNotificationController.kt", l = {103}, m = "listenForTradingEvent")
public final class C6692t32 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ D32 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6692t32(D32 d32, LM lm) {
        super(lm);
        this.e = d32;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        D32.b(this.e, null, this);
        return MN.d;
    }
}

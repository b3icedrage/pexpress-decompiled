package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController", f = "TradingNotificationController.kt", l = {180, 181}, m = "startUpdatingProgress")
public final class C7743y32 extends LM {
    public D32 d;
    public InterfaceC6396rf0 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ D32 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7743y32(D32 d32, LM lm) {
        super(lm);
        this.h = d32;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return D32.d(this.h, null, this);
    }
}

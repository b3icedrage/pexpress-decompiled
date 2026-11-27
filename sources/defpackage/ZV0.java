package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.MakeDepositUpdater", f = "MakeDepositUpdater.kt", l = {45, 46, 47, 48}, m = "onSuccessMakeDeposit")
public final class ZV0 extends LM {
    public C3165cW0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3165cW0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZV0(C3165cW0 c3165cW0, LM lm) {
        super(lm);
        this.g = c3165cW0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C3165cW0.d(this.g, null, this);
    }
}

package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonMakeDeposit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.MakeDepositUpdater", f = "MakeDepositUpdater.kt", l = {84}, m = "getCurrencyCode")
public final class WV0 extends LM {
    public C3165cW0 d;
    public CommonMakeDeposit e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C3165cW0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WV0(C3165cW0 c3165cW0, LM lm) {
        super(lm);
        this.h = c3165cW0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(null, this);
    }
}

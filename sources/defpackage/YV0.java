package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonMakeDeposit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.MakeDepositUpdater", f = "MakeDepositUpdater.kt", l = {57, 58}, m = "notifyAnalytics")
public final class YV0 extends LM {
    public C3165cW0 d;
    public CommonMakeDeposit e;
    public String g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C3165cW0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YV0(C3165cW0 c3165cW0, LM lm) {
        super(lm);
        this.i = c3165cW0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.g(null, this);
    }
}

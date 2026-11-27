package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.usecases.LastDepositUseCaseImpl", f = "LastDepositUseCaseImpl.kt", l = {RequestError.NO_DEV_KEY}, m = "fetchLastPendingDeposit")
public final class C5705oM0 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C6754tM0 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5705oM0(C6754tM0 c6754tM0, LM lm) {
        super(lm);
        this.e = c6754tM0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.m(this);
    }
}

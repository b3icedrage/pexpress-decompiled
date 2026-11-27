package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.usecases.FetchDepositValuesUseCaseBase", f = "FetchDepositValuesUseCaseBase.kt", l = {15}, m = "fetchMinimumDeposit")
public final class C3395dc0 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C3814fc0 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3395dc0(C3814fc0 c3814fc0, LM lm) {
        super(lm);
        this.e = c3814fc0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.a(0L, this);
    }
}

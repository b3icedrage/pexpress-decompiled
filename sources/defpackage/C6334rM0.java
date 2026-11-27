package defpackage;

import com.impl.core.backend.responseModels.Deposit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.usecases.LastDepositUseCaseImpl", f = "LastDepositUseCaseImpl.kt", l = {36}, m = "saveLastDeposit")
public final class C6334rM0 extends LM {
    public Deposit d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C6754tM0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6334rM0(C6754tM0 c6754tM0, LM lm) {
        super(lm);
        this.g = c6754tM0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.o(null, this);
    }
}

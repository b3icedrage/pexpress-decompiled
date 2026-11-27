package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.usecases.CreateBetConfirmationParamsUseCaseBase", f = "CreateBetConfirmationParamsUseCaseBase.kt", l = {115}, m = "setupTitleIconId")
public final class FP extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ AP e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FP(AP ap, LM lm) {
        super(lm);
        this.e = ap;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return AP.d(this.e, this);
    }
}

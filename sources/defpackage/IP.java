package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.usecases.CreateBetConfirmationParamsUseCaseBase", f = "CreateBetConfirmationParamsUseCaseBase.kt", l = {96, 97}, m = "setupTitleTextPercents")
public final class IP extends LM {
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AP g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IP(AP ap, LM lm) {
        super(lm);
        this.g = ap;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return AP.g(this.g, this);
    }
}

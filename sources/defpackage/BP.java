package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.usecases.CreateBetConfirmationParamsUseCaseBase", f = "CreateBetConfirmationParamsUseCaseBase.kt", l = {87, 88}, m = "setupAmount")
public final class BP extends LM {
    public AP d;
    public long e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AP h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BP(AP ap, LM lm) {
        super(lm);
        this.h = ap;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return AP.b(this.h, this);
    }
}

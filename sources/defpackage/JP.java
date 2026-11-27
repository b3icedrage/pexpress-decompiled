package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.usecases.CreateBetConfirmationParamsUseCaseBase", f = "CreateBetConfirmationParamsUseCaseBase.kt", l = {93}, m = "setupTitleTextStr")
public final class JP extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ AP e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JP(AP ap, LM lm) {
        super(lm);
        this.e = ap;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return AP.h(this.e, this);
    }
}

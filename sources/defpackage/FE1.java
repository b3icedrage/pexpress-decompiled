package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonAccount;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.accountselection.usecases.SelectAccountUseCaseBase", f = "SelectAccountUseCaseBase.kt", l = {17, 19, 20}, m = "selectAccount")
public final class FE1 extends LM {
    public JE1 d;
    public CommonAccount e;
    public /* synthetic */ Object g;
    public final /* synthetic */ JE1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FE1(JE1 je1, LM lm) {
        super(lm);
        this.h = je1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.LoginUseCaseBase", f = "LoginUseCaseBase.kt", l = {71}, m = "executeSteps$suspendImpl")
public final class YS0 extends LM {
    public XS0 d;
    public InterfaceC3220cl e;
    public InterfaceC3220cl g;
    public /* synthetic */ Object h;
    public final /* synthetic */ XS0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YS0(XS0 xs0, LM lm) {
        super(lm);
        this.i = xs0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return XS0.d(this.i, this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase", f = "LaunchAppThirdStepUseCaseBase.kt", l = {221, 226, 239, 241, 242}, m = "prepareSignedIn")
public final class CN0 extends LM {
    public C3977gN0 d;
    public InterfaceC1822Qc1 e;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C3977gN0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CN0(C3977gN0 c3977gN0, LM lm) {
        super(lm);
        this.i = c3977gN0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return C3977gN0.h(this.i, 0, this);
    }
}

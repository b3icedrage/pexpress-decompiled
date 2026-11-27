package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase", f = "LaunchAppThirdStepUseCaseBase.kt", l = {326, 327, 329}, m = "goToFirstScreen")
public final class C5708oN0 extends LM {
    public C3977gN0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3977gN0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5708oN0(C3977gN0 c3977gN0, LM lm) {
        super(lm);
        this.g = c3977gN0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C3977gN0.c(this.g, this);
    }
}

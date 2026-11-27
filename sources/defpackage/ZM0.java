package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppSecondStepUseCaseBase", f = "LaunchAppSecondStepUseCaseBase.kt", l = {75, 77}, m = "isAppVersionLessThanRequired")
public final class ZM0 extends LM {
    public C3348dN0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3348dN0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZM0(C3348dN0 c3348dN0, LM lm) {
        super(lm);
        this.g = c3348dN0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C3348dN0.a(this.g, this);
    }
}

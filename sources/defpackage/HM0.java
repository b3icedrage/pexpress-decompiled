package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppFirstStepUseCaseBase", f = "LaunchAppFirstStepUseCaseBase.kt", l = {44, 45}, m = "startStep$suspendImpl")
public final class HM0 extends LM {
    public IM0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ IM0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HM0(IM0 im0, LM lm) {
        super(lm);
        this.g = im0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return IM0.b(this.g, null, this);
    }
}

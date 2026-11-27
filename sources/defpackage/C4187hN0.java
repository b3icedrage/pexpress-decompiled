package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase", f = "LaunchAppThirdStepUseCaseBase.kt", l = {357}, m = "addPendingUser")
public final class C4187hN0 extends LM {
    public C3977gN0 d;
    public int e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C3977gN0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4187hN0(C3977gN0 c3977gN0, LM lm) {
        super(lm);
        this.h = c3977gN0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C3977gN0.a(this.h, 0, this);
    }
}

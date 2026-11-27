package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.usecases.ValidateInputUseCaseBase", f = "ValidateInputUseCaseBase.kt", l = {30, 31}, m = "validateAmount")
public final class Mc2 extends LM {
    public Nc2 d;
    public double e;
    public double g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Nc2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mc2(Nc2 nc2, LM lm) {
        super(lm);
        this.i = nc2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(0.0d, this);
    }
}

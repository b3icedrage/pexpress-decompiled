package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsViewModelBase", f = "StrategyInstructionsViewModelBase.kt", l = {52}, m = "sendAmplitudeEvent")
public final class AR1 extends LM {
    public BR1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ BR1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AR1(BR1 br1, LM lm) {
        super(lm);
        this.g = br1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return BR1.n(this.g, this);
    }
}

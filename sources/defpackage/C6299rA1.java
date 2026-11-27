package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading", f = "RobotTrading.kt", l = {578}, m = "toMoneyRepresentationWithCurrencySign")
public final class C6299rA1 extends LM {
    public Integer d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4617jA1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6299rA1(C4617jA1 c4617jA1, LM lm) {
        super(lm);
        this.g = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.w(0L, this);
    }
}

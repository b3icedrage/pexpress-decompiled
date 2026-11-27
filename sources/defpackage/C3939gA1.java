package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading", f = "RobotTrading.kt", l = {635}, m = "onTradingStarted")
public final class C3939gA1 extends LM {
    public C4617jA1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4617jA1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3939gA1(C4617jA1 c4617jA1, LM lm) {
        super(lm);
        this.g = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C4617jA1.g(this.g, this);
    }
}

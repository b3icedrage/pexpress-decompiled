package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Lz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading", f = "RobotTrading.kt", l = {303, 307}, m = "addIdToStartedDemoTradingSet")
public final class C1498Lz1 extends LM {
    public C4617jA1 d;
    public String e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C4617jA1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1498Lz1(C4617jA1 c4617jA1, LM lm) {
        super(lm);
        this.h = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C4617jA1.a(this.h, this);
    }
}

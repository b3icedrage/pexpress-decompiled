package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading", f = "RobotTrading.kt", l = {552, 553, 555, 562}, m = "getProfitLimitWithActivationBottomSheetParams")
public final class C2281Vz1 extends LM {
    public C4617jA1 d;
    public Object e;
    public String g;
    public String h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C4617jA1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2281Vz1(C4617jA1 c4617jA1, LM lm) {
        super(lm);
        this.k = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.n(0.0d, this);
    }
}

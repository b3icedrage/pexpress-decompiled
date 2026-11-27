package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.usecases.RiskManagementChangeUseCaseBase", f = "RiskManagementChangeUseCaseBase.kt", l = {47, 48, 51, 52, 55}, m = "onLossLimitChanged")
public final class C7921yu1 extends LM {
    public C8131zu1 d;
    public C2817ap1 e;
    public C2817ap1 g;
    public boolean h;
    public double i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C8131zu1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7921yu1(C8131zu1 c8131zu1, LM lm) {
        super(lm);
        this.k = c8131zu1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this, null, false);
    }
}

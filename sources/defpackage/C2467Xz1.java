package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading", f = "RobotTrading.kt", l = {438, 444, 446, 459, 461}, m = "onInsufficientFunds")
public final class C2467Xz1 extends LM {
    public C4617jA1 d;
    public String e;
    public ReporterApi g;
    public EnumC5028l80 h;
    public Double i;
    public Double j;
    public Double k;
    public /* synthetic */ Object l;
    public final /* synthetic */ C4617jA1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2467Xz1(C4617jA1 c4617jA1, LM lm) {
        super(lm);
        this.m = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return C4617jA1.d(this.m, this);
    }
}

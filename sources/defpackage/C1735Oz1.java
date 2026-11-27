package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Oz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading", f = "RobotTrading.kt", l = {744, 748, 750, 752, 755}, m = "buildSessionContext")
public final class C1735Oz1 extends LM {
    public C4617jA1 d;
    public String e;
    public EnumC4164hF1 g;
    public String h;
    public Integer i;
    public String j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ C4617jA1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735Oz1(C4617jA1 c4617jA1, LM lm) {
        super(lm);
        this.m = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return C4617jA1.b(this.m, this);
    }
}

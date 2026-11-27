package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading", f = "RobotTrading.kt", l = {729}, m = "currentAutoSelection")
public final class C1813Pz1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C4617jA1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813Pz1(C4617jA1 c4617jA1, LM lm) {
        super(lm);
        this.e = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.i(this);
    }
}

package defpackage;

import com.base.feature.robot.robot.common_action.RobotCommonActionPart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionPart", f = "RobotCommonActionPart.kt", l = {67}, m = "delayIfStoppedLoading")
public final class C6873tv1 extends LM {
    public RobotCommonActionPart d;
    public /* synthetic */ Object e;
    public final /* synthetic */ RobotCommonActionPart g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6873tv1(RobotCommonActionPart robotCommonActionPart, LM lm) {
        super(lm);
        this.g = robotCommonActionPart;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return RobotCommonActionPart.l(this.g, false, this);
    }
}

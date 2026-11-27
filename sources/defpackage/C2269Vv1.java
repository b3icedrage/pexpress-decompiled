package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common.utils.RobotCommonViewsVisibilityControllerBase", f = "RobotCommonViewsVisibilityControllerBase.kt", l = {59}, m = "startObservingRobotState")
public final class C2269Vv1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C2455Xv1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2269Vv1(C2455Xv1 c2455Xv1, LM lm) {
        super(lm);
        this.e = c2455Xv1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        this.e.a(this);
        return MN.d;
    }
}

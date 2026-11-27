package defpackage;

import android.view.ViewGroup;
import com.base.feature.robot.robot.common.screens.RobotCommonFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment", f = "RobotCommonFragment.kt", l = {175, 182}, m = "addWithAnim")
public final class C0785Cv1 extends LM {
    public ViewGroup d;
    public GP1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ RobotCommonFragment h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0785Cv1(RobotCommonFragment robotCommonFragment, LM lm) {
        super(lm);
        this.h = robotCommonFragment;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        int i = RobotCommonFragment.r;
        return this.h.m(null, this);
    }
}

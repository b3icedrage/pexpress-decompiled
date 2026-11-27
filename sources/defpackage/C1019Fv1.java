package defpackage;

import android.view.ViewGroup;
import com.base.feature.robot.robot.common.screens.RobotCommonFragment;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment", f = "RobotCommonFragment.kt", l = {154, 155, 157}, m = "initAllViews")
public final class C1019Fv1 extends LM {
    public RobotCommonFragment d;
    public Iterator e;
    public ViewGroup g;
    public InterfaceC6396rf0 h;
    public Integer i;
    public /* synthetic */ Object j;
    public final /* synthetic */ RobotCommonFragment k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1019Fv1(RobotCommonFragment robotCommonFragment, LM lm) {
        super(lm);
        this.k = robotCommonFragment;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return RobotCommonFragment.l(this.k, this);
    }
}

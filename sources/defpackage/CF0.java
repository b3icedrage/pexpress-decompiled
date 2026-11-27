package defpackage;

import com.base.feature.robot.robot.common.screens.RobotCommonFragment;
import com.base.feature.robot.robot.common.screens.RobotCommonFragment.d;
import io.sentry.android.core.internal.util.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CF0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ CF0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                SF0 this$0 = (SF0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EY0<SF0.c> ey0 = this$0.x;
                SF0.c cVarD = ey0.d();
                ey0.k(cVarD != null ? SF0.c.a(cVarD, null, false, null, null, null, null, null, null, null, null, 2045) : null);
                break;
            case 1:
                int i = RobotCommonFragment.r;
                RobotCommonFragment robotCommonFragment = (RobotCommonFragment) obj;
                FP0 viewLifecycleOwner = robotCommonFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C7652xe.f(viewLifecycleOwner).c(robotCommonFragment.new d(null));
                break;
            default:
                ((a) obj).v(false);
                break;
        }
    }
}

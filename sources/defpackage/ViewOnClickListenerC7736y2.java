package defpackage;

import android.view.View;
import com.api.core.BaseFragment;
import com.base.feature.account.screens.balance.AccountBalancePartBase;
import com.base.feature.registration.screens.authorization.AuthorizationFragmentBase;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC7736y2 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ BaseFragment e;

    public /* synthetic */ ViewOnClickListenerC7736y2(BaseFragment baseFragment, int i) {
        this.d = i;
        this.e = baseFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                Object obj = ((AccountBalancePartBase) this.e).i;
                Intrinsics.checkNotNull(obj);
                ((G2) obj).n();
                break;
            case 1:
                Object obj2 = ((AuthorizationFragmentBase) this.e).i;
                Intrinsics.checkNotNull(obj2);
                ((AbstractC1394Kq1) obj2).t();
                break;
            default:
                Object obj3 = ((RobotRiskManagementPart) this.e).i;
                Intrinsics.checkNotNull(obj3);
                C2360Wy1 c2360Wy1 = (C2360Wy1) obj3;
                c2360Wy1.getClass();
                C6561sS.g(c2360Wy1, new C2847az1(c2360Wy1, null));
                break;
        }
    }
}

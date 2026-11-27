package defpackage;

import android.view.View;
import com.api.core.BaseFragment;
import com.base.feature.registration.screens.authorization.AuthorizationFragmentBase;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3434dm implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ BaseFragment e;

    public /* synthetic */ ViewOnClickListenerC3434dm(BaseFragment baseFragment, int i) {
        this.d = i;
        this.e = baseFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                Object obj = ((AuthorizationFragmentBase) this.e).i;
                Intrinsics.checkNotNull(obj);
                ((C1146Hm) obj).L.f();
                break;
            default:
                Object obj2 = ((RobotRiskManagementPart) this.e).i;
                Intrinsics.checkNotNull(obj2);
                ((C2360Wy1) obj2).m();
                break;
        }
    }
}

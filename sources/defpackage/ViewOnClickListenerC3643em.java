package defpackage;

import android.view.View;
import com.base.feature.registration.screens.authorization.AuthorizationFragmentBase;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import com.jivosite.sdk.ui.imageviewer.ImageViewerActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3643em implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ViewOnClickListenerC3643em(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                Object obj2 = ((AuthorizationFragmentBase) obj).i;
                Intrinsics.checkNotNull(obj2);
                ((C1146Hm) obj2).E(false, false);
                break;
            case 1:
                int i = ImageViewerActivity.g;
                ImageViewerActivity this$0 = (ImageViewerActivity) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.onBackPressed();
                break;
            default:
                Object obj3 = ((RobotRiskManagementPart) obj).i;
                Intrinsics.checkNotNull(obj3);
                C2360Wy1 c2360Wy1 = (C2360Wy1) obj3;
                c2360Wy1.getClass();
                C6561sS.g(c2360Wy1, new C3685ez1(c2360Wy1, null));
                break;
        }
    }
}

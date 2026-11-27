package defpackage;

import com.base.feature.account.screens.logout.AccountLogoutPartBase;
import com.base.feature.robot.robot.common_action.RobotCommonActionPart;
import java.util.Map;

/* JADX INFO: renamed from: q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6060q3 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final OW b;

    public /* synthetic */ C6060q3(OW ow, int i) {
        this.a = i;
        this.b = ow;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new AccountLogoutPartBase((Sd2) this.b.get());
            case 1:
                return new RobotCommonActionPart((Sd2) this.b.get());
            default:
                return new WD1((Map) this.b.get());
        }
    }
}

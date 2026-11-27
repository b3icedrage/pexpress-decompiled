package defpackage;

import com.base.feature.account.screens.maininfo.AccountMainInfoPartBase;
import com.base.feature.robot.robot.strategies.RobotStrategiesPart;

/* JADX INFO: loaded from: classes.dex */
public final class I3 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ I3(int i, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new AccountMainInfoPartBase((Sd2) ((OW) this.b).get(), (C3110cE) ((C3320dE) this.c).get());
            case 1:
                return new RobotStrategiesPart((InterfaceC8143zy1) this.c.get(), (Sd2) ((OW) this.b).get(), new C3481e1());
            default:
                return new Ji2((InterfaceC0715By0) this.b.get(), (C6348rR) ((M4) this.c).get());
        }
    }

    public I3(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow) {
        this.a = 1;
        this.c = interfaceC1531Mk1;
        this.b = ow;
    }
}

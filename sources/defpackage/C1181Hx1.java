package defpackage;

import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import com.base.feature.robot.robot.options.screens.RobotOptionsPart;

/* JADX INFO: renamed from: Hx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1181Hx1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final OW c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ C1181Hx1(int i, OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = ow;
        this.d = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new RobotInvestmentPart((C2038Sw1) this.b.get(), (Sd2) this.c.get(), (InterfaceC2124Tz0) ((C2544Yz0) this.d).get(), new MT0(), new C7061uo0());
            default:
                return new RobotOptionsPart((InterfaceC8143zy1) this.b.get(), (Sd2) this.c.get(), (C2038Sw1) this.d.get());
        }
    }
}

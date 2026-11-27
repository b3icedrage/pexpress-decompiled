package defpackage;

import com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart;

/* JADX INFO: renamed from: hm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4275hm1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC5331mb0 c;

    public /* synthetic */ C4275hm1(int i, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4065gm1((InterfaceC0715By0) this.b.get(), (C6348rR) ((M4) this.c).get());
            default:
                return new RobotAccountSelectionPart((InterfaceC8143zy1) ((InterfaceC1454Lk1) this.b).get(), (Sd2) ((OW) this.c).get());
        }
    }
}

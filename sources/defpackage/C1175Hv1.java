package defpackage;

import com.base.feature.robot.robot.common.screens.RobotCommonFragment;

/* JADX INFO: renamed from: Hv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1175Hv1 implements InterfaceC5331mb0<RobotCommonFragment> {
    public final OW a;
    public final InterfaceC1531Mk1<InterfaceC6672sy1> b;
    public final InterfaceC1531Mk1<C0629Av1> c;
    public final InterfaceC1531Mk1<InterfaceC3902g10> d;
    public final InterfaceC1531Mk1<C3048bw1> e;
    public final InterfaceC1531Mk1<C2038Sw1> f;

    public C1175Hv1(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5) {
        this.a = ow;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = interfaceC1531Mk5;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new RobotCommonFragment((Sd2) this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}

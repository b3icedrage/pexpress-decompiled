package defpackage;

import com.base.feature.launchapp.screens.vpninstruction.VpnInstructionFragment;

/* JADX INFO: renamed from: ff2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3828ff2 implements InterfaceC5331mb0<VpnInstructionFragment> {
    public final OW a;
    public final InterfaceC1531Mk1<C6189qf2> b;
    public final InterfaceC1454Lk1 c;

    public C3828ff2(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.a = ow;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new VpnInstructionFragment((Sd2) this.a.get(), this.b.get(), (InterfaceC3199cf2) this.c.get());
    }
}

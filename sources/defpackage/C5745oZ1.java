package defpackage;

import com.base.feature.robot.timeselection.screens.TimeSelectionBottomSheetFragment;

/* JADX INFO: renamed from: oZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5745oZ1 implements InterfaceC5331mb0<TimeSelectionBottomSheetFragment> {
    public final OW a;
    public final Z00 b;
    public final InterfaceC1531Mk1<AbstractC5603ns> c;

    public C5745oZ1(OW ow, Z00 z00, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = ow;
        this.b = z00;
        this.c = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new TimeSelectionBottomSheetFragment((Sd2) this.a.get(), (InterfaceC3804fZ1) this.b.get(), this.c.get());
    }
}

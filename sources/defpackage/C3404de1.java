package defpackage;

import com.impl.feature.platform.screens.chart.PlatformChartFragment;

/* JADX INFO: renamed from: de1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3404de1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final OW c;

    public C3404de1(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.c = ow;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new PlatformChartFragment((Sd2) this.c.get(), (C2761ae1) this.b.get());
            default:
                return new C7166vJ1((C5253mB1) this.b.get(), (InterfaceC3951gE1) this.c.get());
        }
    }

    public C3404de1(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow) {
        this.b = interfaceC1531Mk1;
        this.c = ow;
    }
}

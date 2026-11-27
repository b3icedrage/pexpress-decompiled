package defpackage;

import com.impl.feature.robot.tradingassets.TradingAssetsBottomSheetDialogFragmentImpl;

/* JADX INFO: renamed from: Wb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2290Wb0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC5331mb0 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C2290Wb0(int i, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = i;
        this.c = interfaceC1531Mk1;
        this.b = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2208Vb0((AbstractC5463nB1) this.c.get(), (InterfaceC3951gE1) ((OW) this.b).get());
            case 1:
                return new TradingAssetsBottomSheetDialogFragmentImpl((Sd2) ((OW) this.b).get(), (AbstractC5603ns) this.c.get(), new C6268r22());
            default:
                return new C2730aV1((InterfaceC0715By0) this.c.get(), (C6348rR) ((M4) this.b).get());
        }
    }

    public C2290Wb0(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = 1;
        this.b = ow;
        this.c = interfaceC1531Mk1;
    }
}

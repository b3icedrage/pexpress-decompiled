package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IT1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final Object c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ IT1(int i, OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = ow;
        this.d = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HT1((Context) this.b.get(), (InterfaceC3951gE1) ((OW) this.c).get(), (C5253mB1) this.d.get());
            case 1:
                return new C5100lV1((InterfaceC5213m10) this.d.get(), (AbstractC5463nB1) this.b.get(), (InterfaceC3951gE1) ((OW) this.c).get());
            default:
                C5118lb0 impl = (C5118lb0) this.b.get();
                InterfaceC3706f42 telemetry = (InterfaceC3706f42) this.d.get();
                ((C7279vr) this.c).getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                Intrinsics.checkNotNullParameter(telemetry, "telemetry");
                return new FX1(impl, "ftd_updater", null, telemetry);
        }
    }

    public IT1(C7279vr c7279vr, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = 2;
        this.c = c7279vr;
        this.b = interfaceC1531Mk1;
        this.d = interfaceC1531Mk2;
    }
}

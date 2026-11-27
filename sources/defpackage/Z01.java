package defpackage;

import com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.WinsInRowBottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Z01 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1454Lk1 c;

    public Z01(InterfaceC1531Mk1 interfaceC1531Mk1, M4 m4) {
        this.b = interfaceC1531Mk1;
        this.c = m4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new Y01((InterfaceC0715By0) this.b.get(), (C6348rR) ((M4) this.c).get());
            case 1:
                C2554Zc1 impl = (C2554Zc1) this.c.get();
                InterfaceC3706f42 telemetry = (InterfaceC3706f42) this.b.get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                Intrinsics.checkNotNullParameter(telemetry, "telemetry");
                return new FX1(impl, "pending_deposit_updater", null, telemetry);
            default:
                return new WinsInRowBottomSheet((InterfaceC3371dV) ((C3320dE) this.c).get(), (C3633ej1) this.b.get());
        }
    }

    public Z01(C3320dE c3320dE, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.c = c3320dE;
        this.b = interfaceC1531Mk1;
    }

    public Z01(C7279vr c7279vr, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.c = interfaceC1454Lk1;
        this.b = interfaceC1531Mk1;
    }
}

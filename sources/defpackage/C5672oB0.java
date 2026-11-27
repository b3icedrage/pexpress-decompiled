package defpackage;

import com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.ProfitLimitWithActivationBottomSheet;

/* JADX INFO: renamed from: oB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5672oB0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC5331mb0 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C5672oB0(int i, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = i;
        this.b = interfaceC5331mb0;
        this.c = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C5462nB0((C3312dB0) ((C3320dE) this.b).get(), (InterfaceC4619jB0) this.c.get());
            default:
                return new ProfitLimitWithActivationBottomSheet((InterfaceC3371dV) ((C3320dE) this.b).get(), (C3633ej1) ((InterfaceC1454Lk1) this.c).get());
        }
    }
}

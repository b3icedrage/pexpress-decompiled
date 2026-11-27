package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3284d4 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C3284d4(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3074c4((AbstractC5463nB1) this.b.get());
            case 1:
                return new O21((MU) ((M3) this.b).get());
            case 2:
                VK1 showAlertDialogUseCase = (VK1) ((XK1) this.b).get();
                Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
                return new C1124He1(showAlertDialogUseCase);
            case 3:
                C2725aU debugLogger = (C2725aU) ((C2949bU) this.b).get();
                Intrinsics.checkNotNullParameter(debugLogger, "debugLogger");
                return new C3871fr1();
            case 4:
                return new C2942bR1(new C7652xe(), (AL1) ((D11) this.b).get(), (GO) IO.a.a.get());
            default:
                return new C7425wZ1((AbstractC1787Pr) ((C1763Pj) this.b).get());
        }
    }

    public C3284d4(C6731tE1 c6731tE1, C2949bU c2949bU) {
        this.a = 3;
        this.b = c2949bU;
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class R11 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC5331mb0 d;
    public final InterfaceC1531Mk1 e;

    public R11(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, XK1 xk1, C2147Uh c2147Uh) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = xk1;
        this.e = c2147Uh;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new Q11((U22) ((C4948kl0) this.d).get(), (O3) this.b.get(), (RT0) this.c.get(), (InterfaceC2152Ui1) this.e.get(), new MT0());
            default:
                Pa2 urlsProvider = (Pa2) this.b.get();
                C6201qi2 scriptsManager = (C6201qi2) this.c.get();
                VK1 showAlertDialogUseCase = (VK1) ((XK1) this.d).get();
                InterfaceC1131Hh appRepositoryApi = (InterfaceC1131Hh) ((C2147Uh) this.e).get();
                Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
                Intrinsics.checkNotNullParameter(scriptsManager, "scriptsManager");
                Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
                Intrinsics.checkNotNullParameter(appRepositoryApi, "appRepositoryApi");
                return new C7599xN1(urlsProvider, scriptsManager, showAlertDialogUseCase, appRepositoryApi);
        }
    }

    public R11(C4948kl0 c4948kl0, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.d = c4948kl0;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.e = interfaceC1531Mk3;
    }
}

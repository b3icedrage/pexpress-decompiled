package defpackage;

import com.base.feature.account.screens.balance.AccountBalancePartBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class E2 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ E2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new AccountBalancePartBase((Sd2) ((OW) this.b).get());
            case 1:
                return new C1529Mk((M8) ((InterfaceC1454Lk1) this.b).get());
            case 2:
                return new EK1(((C6731tE1) this.b).a.a);
            default:
                VK1 showAlertDialogUseCase = (VK1) ((XK1) this.b).get();
                Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
                return new C6755tM1(showAlertDialogUseCase);
        }
    }
}

package defpackage;

import com.base.feature.support.support.screens.faq.SupportFaqPartBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CV0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ CV0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return ((BV0) this.b).a;
            case 1:
                VK1 showAlertDialogUseCase = (VK1) ((XK1) this.b).get();
                Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
                return new C1828Qe1(showAlertDialogUseCase);
            case 2:
                return new SupportFaqPartBase((Sd2) ((OW) this.b).get());
            default:
                return new C7238vf2((C7250vi2) ((C7037ui) this.b).get(), new C3738fD1());
        }
    }
}

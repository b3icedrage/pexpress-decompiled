package defpackage;

import android.content.Context;
import com.base.feature.activation.screens.action_button.ActivationActionButtonFragment;

/* JADX INFO: loaded from: classes.dex */
public final class F5 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ F5(InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ActivationActionButtonFragment((Sd2) ((OW) this.b).get());
            case 1:
                return new C5698oK((Context) ((C6) this.b).get());
            case 2:
                return new NQ((C3051bx1) this.b.get());
            default:
                return new TM1((InterfaceC1131Hh) ((C2147Uh) this.b).get());
        }
    }
}

package defpackage;

import android.view.ViewGroup;
import com.base.feature.registration.screens.selecthaveaccount.SelectHaveAccountFragmentBase;

/* JADX INFO: loaded from: classes3.dex */
public final class OW implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ OW(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public static void a(OW ow, InterfaceC1454Lk1 interfaceC1454Lk1) {
        if (((InterfaceC1454Lk1) ow.b) != null) {
            throw new IllegalStateException();
        }
        ow.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                InterfaceC1454Lk1 interfaceC1454Lk1 = (InterfaceC1454Lk1) this.b;
                if (interfaceC1454Lk1 != null) {
                    return interfaceC1454Lk1.get();
                }
                throw new IllegalStateException();
            case 1:
                return new C2525Yt((ViewGroup) ((BV0) this.b).b.invoke());
            default:
                return new SelectHaveAccountFragmentBase((Sd2) ((OW) this.b).get());
        }
    }

    public OW() {
        this.a = 0;
    }
}

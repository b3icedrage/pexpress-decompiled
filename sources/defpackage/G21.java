package defpackage;

import com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase;

/* JADX INFO: loaded from: classes.dex */
public final class G21 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC5331mb0 b;

    public /* synthetic */ G21(InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new F21((MU) ((M3) this.b).get());
            case 1:
                return new SupportIssueCategoriesPartBase((Sd2) ((OW) this.b).get());
            default:
                return new C5563ng2(new C4720jg2(), (GI1) ((C1925Rl) this.b).get());
        }
    }
}

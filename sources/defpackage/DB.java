package defpackage;

import com.pexpress.tool.R;

/* JADX INFO: loaded from: classes.dex */
public final class DB implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ DB(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new CB((InterfaceC1131Hh) ((C2147Uh) this.b).get());
            case 1:
                ((C7784yF0) this.b).getClass();
                return new C5242m81(14, R.layout.dg_item_offline_message);
            case 2:
                return new C3865fp1((InterfaceC1442Lg1) ((InterfaceC1531Mk1) this.b).get());
            case 3:
                return new M92((InterfaceC5889pD1) ((InterfaceC1454Lk1) this.b).get());
            default:
                return ((C4724jh2) this.b).a;
        }
    }
}

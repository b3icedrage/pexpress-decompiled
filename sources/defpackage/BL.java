package defpackage;

import com.base.feature.webpage.screens.knowledgeBase.KnowledgeBaseFragmentBase;

/* JADX INFO: loaded from: classes3.dex */
public final class BL implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1454Lk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC1531Mk1 f;

    public /* synthetic */ BL(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
        this.c = interfaceC1454Lk2;
        this.d = interfaceC1531Mk1;
        this.e = interfaceC1531Mk2;
        this.f = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7801yL((InterfaceC5889pD1) this.b.get(), (EK1) this.c.get(), (C3903g11) ((InterfaceC1454Lk1) this.d).get(), (R42) ((InterfaceC1454Lk1) this.e).get(), (InterfaceC4855kK) ((InterfaceC1454Lk1) this.f).get());
            default:
                return new KnowledgeBaseFragmentBase((Sd2) ((OW) this.b).get(), new NK0(0), (C6755tM1) ((E2) this.c).get(), (OR) this.d.get(), (Ch2) this.e.get(), (KK0) this.f.get());
        }
    }
}

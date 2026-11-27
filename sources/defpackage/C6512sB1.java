package defpackage;

import com.jivosite.sdk.socket.JivoWebSocketService;

/* JADX INFO: renamed from: sB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6512sB1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1454Lk1 c;
    public final InterfaceC1454Lk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC1531Mk1 f;
    public final InterfaceC1454Lk1 g;
    public final InterfaceC1454Lk1 h;

    public C6512sB1(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2, InterfaceC1454Lk1 interfaceC1454Lk3, InterfaceC1454Lk1 interfaceC1454Lk4, InterfaceC1454Lk1 interfaceC1454Lk5, InterfaceC1454Lk1 interfaceC1454Lk6, InterfaceC1454Lk1 interfaceC1454Lk7) {
        this.b = interfaceC1454Lk1;
        this.c = interfaceC1454Lk2;
        this.d = interfaceC1454Lk3;
        this.e = interfaceC1454Lk4;
        this.f = interfaceC1454Lk5;
        this.g = interfaceC1454Lk6;
        this.h = interfaceC1454Lk7;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C6302rB1((InterfaceC6444rs1) ((C3523eC) this.c).get(), (InterfaceC4270hl0) ((C4948kl0) this.d).get(), (C4953km1) this.e.get(), (C3556eN) this.b.get(), (AbstractC7949z22) this.f.get(), (InterfaceC4209hU1) ((C3557eN0) this.g).get(), (C4065gm1) ((C4275hm1) this.h).get());
            default:
                return new C5892pE1((C6102qE1) this.b.get(), (InterfaceC5889pD1) this.c.get(), (EK1) this.d.get(), (InterfaceC5049lE1) ((InterfaceC1454Lk1) this.e).get(), (JivoWebSocketService) ((InterfaceC1454Lk1) this.f).get(), (InterfaceC3389da2) this.g.get(), (InterfaceC0836Dm1) this.h.get());
        }
    }

    public C6512sB1(C3523eC c3523eC, C4948kl0 c4948kl0, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk2, C3557eN0 c3557eN0, C4275hm1 c4275hm1) {
        this.c = c3523eC;
        this.d = c4948kl0;
        this.e = interfaceC1531Mk1;
        this.b = interfaceC1454Lk1;
        this.f = interfaceC1531Mk2;
        this.g = c3557eN0;
        this.h = c4275hm1;
    }
}

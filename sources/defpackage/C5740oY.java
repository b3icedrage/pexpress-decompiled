package defpackage;

import com.base.feature.stub.screens.stubgame.StubGameFragment;
import com.impl.feature.registration.screens.forgetpassword.ForgetPasswordFragmentImpl;
import com.jivosite.sdk.socket.JivoWebSocketService;

/* JADX INFO: renamed from: oY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5740oY implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ C5740oY(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C5530nY((C4923kf) this.b.get(), (InterfaceC3185cc0) ((C4024gc0) this.d).get(), (V11) this.c.get());
            case 1:
                return new ForgetPasswordFragmentImpl((Sd2) ((OW) this.d).get(), (InterfaceC5985ph0) this.b.get(), (C3296d7) this.c.get());
            case 2:
                return new C5720oR0((AI1) ((InterfaceC1454Lk1) this.b).get(), (JivoWebSocketService) ((InterfaceC1454Lk1) this.c).get(), (C5892pE1) ((C6512sB1) this.d).get());
            case 3:
                return new C1804Pw1((C1489Lw1) this.b.get(), (C1882Qw1) this.c.get(), (C1648Nw1) this.d.get());
            default:
                return new StubGameFragment((Sd2) ((OW) this.c).get(), (C3099cA0) ((W6) this.d).get(), (InterfaceC7172vL1) this.b.get());
        }
    }

    public C5740oY(OW ow, W6 w6, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = 4;
        this.c = ow;
        this.d = w6;
        this.b = interfaceC1531Mk1;
    }

    public C5740oY(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = 1;
        this.d = ow;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    public C5740oY(InterfaceC1531Mk1 interfaceC1531Mk1, C4024gc0 c4024gc0, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = 0;
        this.b = interfaceC1531Mk1;
        this.d = c4024gc0;
        this.c = interfaceC1531Mk2;
    }
}

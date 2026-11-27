package defpackage;

import com.jivosite.sdk.socket.JivoWebSocketService;

/* JADX INFO: renamed from: aA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2666aA0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;

    public /* synthetic */ C2666aA0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2622Zz0((JA) this.b.get(), (InterfaceC4255hh1) this.c.get(), (S7) this.d.get(), (InterfaceC7524x11) this.e.get());
            case 1:
                return new Cj2((InterfaceC2773ah1) this.b.get(), new C5027l8(), (Pa2) this.c.get(), (Oj2) this.d.get(), (Mj2) this.e.get());
            default:
                return new X10((AI1) ((InterfaceC1454Lk1) this.b).get(), (JivoWebSocketService) ((InterfaceC1454Lk1) this.c).get(), (InterfaceC1466Lo1) ((InterfaceC1454Lk1) this.d).get(), (InterfaceC4855kK) ((InterfaceC1454Lk1) this.e).get());
        }
    }
}

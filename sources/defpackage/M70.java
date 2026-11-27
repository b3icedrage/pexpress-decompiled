package defpackage;

import com.jivosite.sdk.socket.JivoWebSocketService;

/* JADX INFO: loaded from: classes3.dex */
public final class M70 implements InterfaceC5331mb0<L70> {
    public final InterfaceC1454Lk1 a;
    public final InterfaceC1454Lk1 b;
    public final C6512sB1 c;
    public final InterfaceC1454Lk1 d;
    public final InterfaceC1454Lk1 e;

    public M70(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2, C6512sB1 c6512sB1, InterfaceC1454Lk1 interfaceC1454Lk3, InterfaceC1454Lk1 interfaceC1454Lk4) {
        this.a = interfaceC1454Lk1;
        this.b = interfaceC1454Lk2;
        this.c = c6512sB1;
        this.d = interfaceC1454Lk3;
        this.e = interfaceC1454Lk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new L70((AI1) this.a.get(), (JivoWebSocketService) this.b.get(), (C5892pE1) this.c.get(), (InterfaceC1466Lo1) this.d.get(), (InterfaceC4855kK) this.e.get());
    }
}

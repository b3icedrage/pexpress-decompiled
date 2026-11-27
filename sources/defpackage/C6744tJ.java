package defpackage;

import com.jivosite.sdk.socket.JivoWebSocketService;

/* JADX INFO: renamed from: tJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6744tJ implements InterfaceC5331mb0<C6534sJ> {
    public final InterfaceC1454Lk1 a;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1454Lk1 c;
    public final InterfaceC1454Lk1 d;
    public final InterfaceC1454Lk1 e;

    public C6744tJ(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2, InterfaceC1454Lk1 interfaceC1454Lk3, InterfaceC1454Lk1 interfaceC1454Lk4, InterfaceC1454Lk1 interfaceC1454Lk5) {
        this.a = interfaceC1454Lk1;
        this.b = interfaceC1454Lk2;
        this.c = interfaceC1454Lk3;
        this.d = interfaceC1454Lk4;
        this.e = interfaceC1454Lk5;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C6534sJ((JivoWebSocketService) this.a.get(), (JivoWebSocketService) this.b.get(), (C3903g11) this.c.get(), (InterfaceC4855kK) this.d.get(), (M8) this.e.get());
    }
}

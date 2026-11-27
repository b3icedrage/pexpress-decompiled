package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7315w2 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public C7315w2(C6 c6, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.d = c6;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7105v2((Context) ((C6) this.d).get(), (C4923kf) this.b.get(), (InterfaceC3170cY) this.c.get());
            default:
                return new C5543nb2((ZT1) this.b.get(), (AbstractC3947gD0) this.c.get(), (C4923kf) this.d.get());
        }
    }

    public C7315w2(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }
}

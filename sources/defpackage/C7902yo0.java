package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: yo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7902yo0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1454Lk1 c;

    public /* synthetic */ C7902yo0(int i, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7692xo0((InterfaceC5167ln1) this.c.get(), (Context) this.b.get());
            case 1:
                return new C6241qu1((InterfaceC1442Lg1) this.b.get(), (C5260mE) this.c.get());
            default:
                return new UE1((LE1) this.b.get(), (CE1) this.c.get());
        }
    }

    public C7902yo0(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = 0;
        this.c = interfaceC1454Lk1;
        this.b = interfaceC1531Mk1;
    }
}

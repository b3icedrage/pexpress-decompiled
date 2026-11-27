package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: ga1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4017ga1<T> implements InterfaceC1612Nk1<T>, InterfaceC7203vW<T> {
    public static final K1 c = new K1();
    public static final C4016ga0 d = new C4016ga0(1);
    public InterfaceC7203vW.a<T> a;
    public volatile InterfaceC1612Nk1<T> b;

    public C4017ga1(K1 k1, InterfaceC1612Nk1 interfaceC1612Nk1) {
        this.a = k1;
        this.b = interfaceC1612Nk1;
    }

    public final void a(@NonNull final InterfaceC7203vW.a<T> aVar) {
        InterfaceC1612Nk1<T> interfaceC1612Nk1;
        InterfaceC1612Nk1<T> interfaceC1612Nk2;
        InterfaceC1612Nk1<T> interfaceC1612Nk3 = this.b;
        C4016ga0 c4016ga0 = d;
        if (interfaceC1612Nk3 != c4016ga0) {
            aVar.d(interfaceC1612Nk3);
            return;
        }
        synchronized (this) {
            interfaceC1612Nk1 = this.b;
            if (interfaceC1612Nk1 != c4016ga0) {
                interfaceC1612Nk2 = interfaceC1612Nk1;
            } else {
                final InterfaceC7203vW.a<T> aVar2 = this.a;
                this.a = new InterfaceC7203vW.a() { // from class: fa1
                    @Override // defpackage.InterfaceC7203vW.a
                    public final void d(InterfaceC1612Nk1 interfaceC1612Nk4) {
                        aVar2.d(interfaceC1612Nk4);
                        aVar.d(interfaceC1612Nk4);
                    }
                };
                interfaceC1612Nk2 = null;
            }
        }
        if (interfaceC1612Nk2 != null) {
            aVar.d(interfaceC1612Nk1);
        }
    }

    @Override // defpackage.InterfaceC1612Nk1
    public final T get() {
        return this.b.get();
    }
}

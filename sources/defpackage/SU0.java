package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class SU0 extends QU0<InterfaceC3129cK0, InterfaceC3667et1<?>> {
    public Q60 d;

    @Override // defpackage.QU0
    public final int b(InterfaceC3667et1<?> interfaceC3667et1) {
        InterfaceC3667et1<?> interfaceC3667et2 = interfaceC3667et1;
        if (interfaceC3667et2 == null) {
            return 1;
        }
        return interfaceC3667et2.c();
    }

    @Override // defpackage.QU0
    public final void c(@NonNull InterfaceC3129cK0 interfaceC3129cK0, InterfaceC3667et1<?> interfaceC3667et1) {
        InterfaceC3667et1<?> interfaceC3667et2 = interfaceC3667et1;
        Q60 q60 = this.d;
        if (q60 == null || interfaceC3667et2 == null) {
            return;
        }
        q60.e.a(interfaceC3667et2, true);
    }
}

package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Gh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1055Gh1<E> extends C1889Qz<E> implements InterfaceC1133Hh1<E> {
    @Override // defpackage.AbstractC2625a0
    public final void q0(@NotNull Throwable th, boolean z) {
        if (this.h.k(th, false) || z) {
            return;
        }
        GN.a(th, this.g);
    }

    @Override // defpackage.AbstractC2625a0
    public final void r0(Unit unit) {
        this.h.a(null);
    }

    @Override // defpackage.InterfaceC1133Hh1
    public final C1055Gh1 D() {
        return this;
    }
}

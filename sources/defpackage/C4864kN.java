package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: kN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4864kN implements InterfaceC4895kX0<C1349Kb1> {
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // defpackage.InterfaceC4895kX0
    public final void a(@NonNull C5318mX0 c5318mX0, @NonNull AbstractC6909u51 abstractC6909u51) {
        boolean z;
        C1349Kb1 c1349Kb1 = (C1349Kb1) abstractC6909u51;
        AbstractC1634Ns abstractC1634Ns = (AbstractC1634Ns) c1349Kb1.a;
        if (abstractC1634Ns != null) {
            AbstractC1634Ns abstractC1634Ns2 = (AbstractC1634Ns) abstractC1634Ns.a;
            if (abstractC1634Ns2 instanceof AQ0) {
                z = ((AQ0) abstractC1634Ns2).f;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            c5318mX0.b();
        }
        int iC = c5318mX0.c();
        c5318mX0.f(c1349Kb1);
        AbstractC7387wN.f.b(c5318mX0.b, Boolean.valueOf(z));
        c5318mX0.d(c1349Kb1, iC);
        if (z) {
            return;
        }
        c5318mX0.a(c1349Kb1);
    }
}

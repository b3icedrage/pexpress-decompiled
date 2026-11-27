package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: uN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6966uN implements InterfaceC4895kX0<IQ0> {
    @Override // defpackage.InterfaceC4895kX0
    public final void a(@NonNull C5318mX0 c5318mX0, @NonNull AbstractC6909u51 abstractC6909u51) {
        IQ0 iq0 = (IQ0) abstractC6909u51;
        int iC = c5318mX0.c();
        c5318mX0.f(iq0);
        AbstractC1634Ns abstractC1634Ns = (AbstractC1634Ns) iq0.a;
        boolean z = abstractC1634Ns instanceof C4905ka1;
        C5151lj1<AbstractC7387wN.a> c5151lj1 = AbstractC7387wN.a;
        C4047gi c4047gi = c5318mX0.b;
        if (z) {
            C4905ka1 c4905ka1 = (C4905ka1) abstractC1634Ns;
            int i = c4905ka1.g;
            c5151lj1.b(c4047gi, AbstractC7387wN.a.e);
            AbstractC7387wN.c.b(c4047gi, Integer.valueOf(i));
            c4905ka1.g++;
        } else {
            c5151lj1.b(c4047gi, AbstractC7387wN.a.d);
            C5151lj1<Integer> c5151lj2 = AbstractC7387wN.b;
            int i2 = 0;
            for (AbstractC6909u51 abstractC6909u51C = (AbstractC1634Ns) iq0.a; abstractC6909u51C != null; abstractC6909u51C = abstractC6909u51C.c()) {
                if (abstractC6909u51C instanceof IQ0) {
                    i2++;
                }
            }
            c5151lj2.b(c4047gi, Integer.valueOf(i2));
        }
        c5318mX0.d(iq0, iC);
        if (iq0.e != null) {
            c5318mX0.b();
        }
    }
}

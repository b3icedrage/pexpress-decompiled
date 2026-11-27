package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: tN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6756tN implements InterfaceC4895kX0<C4095gw0> {
    @Override // defpackage.InterfaceC4895kX0
    public final void a(@NonNull C5318mX0 c5318mX0, @NonNull AbstractC6909u51 abstractC6909u51) {
        C4095gw0 c4095gw0 = (C4095gw0) abstractC6909u51;
        C3797fX0 c3797fX0 = c5318mX0.a;
        InterfaceC3771fO1 interfaceC3771fO1 = c3797fX0.e.a.get(C4095gw0.class);
        if (interfaceC3771fO1 == null) {
            c5318mX0.f(c4095gw0);
            return;
        }
        int iC = c5318mX0.c();
        c5318mX0.f(c4095gw0);
        int iC2 = c5318mX0.c();
        C5292mO1 c5292mO1 = c5318mX0.c;
        if (iC == iC2) {
            c5292mO1.a((char) 65532);
        }
        boolean z = c4095gw0.a instanceof C5717oQ0;
        c3797fX0.d.getClass();
        C5151lj1 c5151lj1 = G1.a;
        String str = c4095gw0.f;
        C4047gi c4047gi = c5318mX0.b;
        c5151lj1.b(c4047gi, str);
        G1.b.b(c4047gi, Boolean.valueOf(z));
        G1.c.b(c4047gi, null);
        Object objA = interfaceC3771fO1.a(c3797fX0, c4047gi);
        StringBuilder sb = c5292mO1.d;
        int length = sb.length();
        int length2 = sb.length();
        if (length <= iC || iC < 0 || length > length2) {
            return;
        }
        C5292mO1.c(c5292mO1, objA, iC, length);
    }
}

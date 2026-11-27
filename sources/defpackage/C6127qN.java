package defpackage;

/* JADX INFO: renamed from: qN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6127qN implements InterfaceC4895kX0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C6127qN(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC4895kX0
    public final void a(C5318mX0 c5318mX0, AbstractC6909u51 abstractC6909u51) {
        switch (this.a) {
            case 0:
                C7359wE c7359wE = (C7359wE) abstractC6909u51;
                int iC = c5318mX0.c();
                C5292mO1 c5292mO1 = c5318mX0.c;
                StringBuilder sb = c5292mO1.d;
                sb.append((char) 160);
                sb.append(c7359wE.f);
                c5292mO1.a((char) 160);
                c5318mX0.d(c7359wE, iC);
                break;
            default:
                c5318mX0.b();
                int iC2 = c5318mX0.c();
                c5318mX0.f(abstractC6909u51);
                c5318mX0.d(abstractC6909u51, iC2);
                c5318mX0.a(abstractC6909u51);
                break;
        }
    }
}

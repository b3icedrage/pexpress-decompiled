package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;

/* JADX INFO: renamed from: rB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6301rB0 implements InterfaceC1727Ox {
    public final InterfaceC1727Ox d;
    public final W31 e;
    public final QZ1 g;
    public final long h;

    public C6301rB0(InterfaceC1727Ox interfaceC1727Ox, C2872b52 c2872b52, QZ1 qz1, long j) {
        this.d = interfaceC1727Ox;
        this.e = new W31(c2872b52);
        this.h = j;
        this.g = qz1;
    }

    @Override // defpackage.InterfaceC1727Ox
    public final void a(InterfaceC1023Fx interfaceC1023Fx, C0857Dt1 c0857Dt1) {
        FirebasePerfOkHttpClient.a(c0857Dt1, this.e, this.h, this.g.a());
        this.d.a(interfaceC1023Fx, c0857Dt1);
    }

    @Override // defpackage.InterfaceC1727Ox
    public final void b(InterfaceC1023Fx interfaceC1023Fx, IOException iOException) {
        C4543is1 c4543is1U = interfaceC1023Fx.u();
        W31 w31 = this.e;
        if (c4543is1U != null) {
            C1318Jr0 c1318Jr0 = c4543is1U.a;
            if (c1318Jr0 != null) {
                w31.j(c1318Jr0.j().toString());
            }
            String str = c4543is1U.b;
            if (str != null) {
                w31.c(str);
            }
        }
        w31.f(this.h);
        C1742Pc.e(this.g, w31, w31);
        this.d.b(interfaceC1023Fx, iOException);
    }
}

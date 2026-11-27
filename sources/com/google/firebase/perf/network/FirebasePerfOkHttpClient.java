package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import defpackage.AbstractC1091Gt1;
import defpackage.AbstractC5395ms1;
import defpackage.C0857Dt1;
import defpackage.C1318Jr0;
import defpackage.C2872b52;
import defpackage.C4543is1;
import defpackage.C6301rB0;
import defpackage.CY0;
import defpackage.InterfaceC1023Fx;
import defpackage.InterfaceC1727Ox;
import defpackage.QZ1;
import defpackage.W31;
import defpackage.X31;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class FirebasePerfOkHttpClient {
    public static void a(C0857Dt1 c0857Dt1, W31 w31, long j, long j2) {
        C4543is1 c4543is1 = c0857Dt1.d;
        if (c4543is1 == null) {
            return;
        }
        w31.j(c4543is1.a.j().toString());
        w31.c(c4543is1.b);
        AbstractC5395ms1 abstractC5395ms1 = c4543is1.d;
        if (abstractC5395ms1 != null) {
            long jA = abstractC5395ms1.a();
            if (jA != -1) {
                w31.e(jA);
            }
        }
        AbstractC1091Gt1 abstractC1091Gt1 = c0857Dt1.k;
        if (abstractC1091Gt1 != null) {
            long jF = abstractC1091Gt1.f();
            if (jF != -1) {
                w31.h(jF);
            }
            CY0 cy0G = abstractC1091Gt1.g();
            if (cy0G != null) {
                w31.g(cy0G.a);
            }
        }
        w31.d(c0857Dt1.h);
        w31.f(j);
        w31.i(j2);
        w31.b();
    }

    @Keep
    public static void enqueue(InterfaceC1023Fx interfaceC1023Fx, InterfaceC1727Ox interfaceC1727Ox) {
        QZ1 qz1 = new QZ1();
        interfaceC1023Fx.Z(new C6301rB0(interfaceC1727Ox, C2872b52.w, qz1, qz1.d));
    }

    @Keep
    public static C0857Dt1 execute(InterfaceC1023Fx interfaceC1023Fx) throws IOException {
        W31 w31 = new W31(C2872b52.w);
        QZ1 qz1 = new QZ1();
        long j = qz1.d;
        try {
            C0857Dt1 c0857Dt1C = interfaceC1023Fx.c();
            a(c0857Dt1C, w31, j, qz1.a());
            return c0857Dt1C;
        } catch (IOException e) {
            C4543is1 c4543is1U = interfaceC1023Fx.u();
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
            w31.f(j);
            w31.i(qz1.a());
            X31.c(w31);
            throw e;
        }
    }
}

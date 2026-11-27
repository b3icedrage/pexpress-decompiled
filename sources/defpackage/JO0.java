package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class JO0 implements Function1 {
    public final KO0 d;
    public final LO0 e;

    public JO0(KO0 ko0, LO0 lo0) {
        this.d = ko0;
        this.e = lo0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SK0.a.b bVarA;
        Object aVar;
        FC fcA;
        C1627Np1 c1627Np1A;
        KO0.a request = (KO0.a) obj;
        Intrinsics.checkNotNullParameter(request, "request");
        KO0 ko0 = this.d;
        QC qc = new QC(ko0.o.i, request.a);
        LO0 lo0 = this.e;
        KE0 ke0 = lo0.a;
        InterfaceC2902bE0 javaClass = request.b;
        if (javaClass != null) {
            C7793yI0 jvmMetadataVersion = ko0.w();
            C1705Op1 c1705Op1 = ke0.c;
            c1705Op1.getClass();
            Intrinsics.checkNotNullParameter(javaClass, "javaClass");
            Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
            C1758Ph0 c1758Ph0C = javaClass.c();
            if (c1758Ph0C != null) {
                Class clsI = Nm2.i(c1705Op1.a, c1758Ph0C.b());
                if (clsI == null || (c1627Np1A = C1627Np1.a.a(clsI)) == null) {
                    bVarA = null;
                } else {
                    bVarA = new SK0.a.b(c1627Np1A);
                }
            } else {
                bVarA = null;
            }
        } else {
            bVarA = ke0.c.a(qc, ko0.w());
        }
        C1627Np1 kotlinClass = bVarA != null ? bVarA.a : null;
        QC qcA = kotlinClass != null ? C4753jp1.a(kotlinClass.a) : null;
        if (qcA == null || (qcA.b.e().d() && !qcA.c)) {
            if (kotlinClass == null) {
                aVar = KO0.b.C0074b.a;
            } else if (kotlinClass.b.a == UK0.a.CLASS) {
                PZ pz = ko0.b.a.d;
                pz.getClass();
                Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
                BC bcF = pz.f(kotlinClass);
                if (bcF == null) {
                    fcA = null;
                } else {
                    fcA = pz.c().t.a(C4753jp1.a(kotlinClass.a), bcF);
                }
                aVar = fcA != null ? new KO0.b.a(fcA) : KO0.b.C0074b.a;
            } else {
                aVar = KO0.b.c.a;
            }
            if (aVar instanceof KO0.b.a) {
                return ((KO0.b.a) aVar).a;
            }
            if (!(aVar instanceof KO0.b.c)) {
                if (!(aVar instanceof KO0.b.C0074b)) {
                    throw new C6489s51();
                }
                if (javaClass == null) {
                    javaClass = ke0.b.a(new C3740fE0(qc, null, 4));
                }
                OP0[] op0Arr = OP0.d;
                C1758Ph0 c1758Ph0C2 = javaClass != null ? javaClass.c() : null;
                if (c1758Ph0C2 != null && !c1758Ph0C2.d()) {
                    C1758Ph0 c1758Ph0E = c1758Ph0C2.e();
                    GO0 go0 = ko0.o;
                    if (Intrinsics.a(c1758Ph0E, go0.i)) {
                        C7180vO0 c7180vO0 = new C7180vO0(lo0, go0, javaClass, null);
                        ke0.s.m(c7180vO0);
                        return c7180vO0;
                    }
                }
            }
        }
        return null;
    }
}

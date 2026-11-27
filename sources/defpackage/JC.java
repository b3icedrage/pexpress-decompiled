package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class JC implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ JC(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        InterfaceC2392Xa1 interfaceC2392Xa1;
        C6582sZ c6582sZA;
        WZ wz;
        C5638o21 name;
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                KC.a key = (KC.a) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                KC kc = (KC) obj2;
                kc.getClass();
                QC qc = key.a;
                C6163qZ c6163qZ = kc.a;
                Iterator<HC> it = c6163qZ.k.iterator();
                while (it.hasNext()) {
                    FC fcA = it.next().a(qc);
                    if (fcA != null) {
                        return fcA;
                    }
                }
                if (KC.c.contains(qc)) {
                    return null;
                }
                BC bcA = key.b;
                if (bcA == null && (bcA = c6163qZ.d.a(qc)) == null) {
                    return null;
                }
                QC qcE = qc.e();
                AbstractC5393ms abstractC5393ms = bcA.c;
                InterfaceC5848p21 interfaceC5848p21 = bcA.a;
                C2077Tj1 c2077Tj1 = bcA.b;
                if (qcE != null) {
                    FC fcA2 = kc.a(qcE, null);
                    FZ fz = fcA2 instanceof FZ ? (FZ) fcA2 : null;
                    if (fz == null) {
                        return null;
                    }
                    C5638o21 name2 = qc.f();
                    Intrinsics.checkNotNullParameter(name2, "name");
                    if (!fz.T0().m().contains(name2)) {
                        return null;
                    }
                    c6582sZA = fz.p;
                } else {
                    Iterator it2 = C5027l8.v(c6163qZ.f, qc.a).iterator();
                    do {
                        if (it2.hasNext()) {
                            next = it2.next();
                            InterfaceC2392Xa1 interfaceC2392Xa2 = (InterfaceC2392Xa1) next;
                            if (interfaceC2392Xa2 instanceof WZ) {
                                wz = (WZ) interfaceC2392Xa2;
                                name = qc.f();
                                wz.getClass();
                                Intrinsics.checkNotNullParameter(name, "name");
                            }
                        } else {
                            next = null;
                        }
                        interfaceC2392Xa1 = (InterfaceC2392Xa1) next;
                        if (interfaceC2392Xa1 == null) {
                            return null;
                        }
                        C4945kk1 c4945kk1 = c2077Tj1.I;
                        Intrinsics.checkNotNullExpressionValue(c4945kk1, "getTypeTable(...)");
                        C2656a72 c2656a72 = new C2656a72(c4945kk1);
                        C5761od2 c5761od2 = C5761od2.b;
                        C5578nk1 c5578nk1 = c2077Tj1.K;
                        Intrinsics.checkNotNullExpressionValue(c5578nk1, "getVersionRequirementTable(...)");
                        c6582sZA = kc.a.a(interfaceC2392Xa1, interfaceC5848p21, c2656a72, C5761od2.a.a(c5578nk1), abstractC5393ms, null);
                        abstractC5393ms = abstractC5393ms;
                    } while (!((SZ) ((ZZ) wz).v()).m().contains(name));
                    interfaceC2392Xa1 = (InterfaceC2392Xa1) next;
                    if (interfaceC2392Xa1 == null) {
                        return null;
                    }
                    C4945kk1 c4945kk2 = c2077Tj1.I;
                    Intrinsics.checkNotNullExpressionValue(c4945kk2, "getTypeTable(...)");
                    C2656a72 c2656a73 = new C2656a72(c4945kk2);
                    C5761od2 c5761od3 = C5761od2.b;
                    C5578nk1 c5578nk2 = c2077Tj1.K;
                    Intrinsics.checkNotNullExpressionValue(c5578nk2, "getVersionRequirementTable(...)");
                    c6582sZA = kc.a.a(interfaceC2392Xa1, interfaceC5848p21, c2656a73, C5761od2.a.a(c5578nk2), abstractC5393ms, null);
                    abstractC5393ms = abstractC5393ms;
                }
                return new FZ(c6582sZA, c2077Tj1, interfaceC5848p21, abstractC5393ms, bcA.d);
            default:
                String it3 = (String) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Integer.valueOf(((S62) obj2).b.getAndIncrement());
        }
    }
}

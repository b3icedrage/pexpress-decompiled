package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2054Tc extends C<InterfaceC1583Nc> {
    public static List k(CK ck) {
        if (!(ck instanceof C1059Gj)) {
            return ck instanceof C6286r70 ? VE.c(((C6286r70) ck).c.f()) : C5653o60.d;
        }
        Iterable iterable = (Iterable) ((C1059Gj) ck).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C2904bF.o(arrayList, k((CK) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.C
    public final ArrayList a(boolean z, Object obj) {
        InterfaceC1583Nc interfaceC1583Nc = (InterfaceC1583Nc) obj;
        Intrinsics.checkNotNullParameter(interfaceC1583Nc, "<this>");
        Map<C5638o21, CK<?>> mapJ = interfaceC1583Nc.j();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C5638o21, CK<?>> entry : mapJ.entrySet()) {
            C2904bF.o(arrayList, (!z || Intrinsics.a(entry.getKey(), C3333dI0.b)) ? k(entry.getValue()) : C5653o60.d);
        }
        return arrayList;
    }

    @Override // defpackage.C
    public final C1758Ph0 d(InterfaceC1583Nc interfaceC1583Nc) {
        InterfaceC1583Nc interfaceC1583Nc2 = interfaceC1583Nc;
        Intrinsics.checkNotNullParameter(interfaceC1583Nc2, "<this>");
        return interfaceC1583Nc2.c();
    }

    @Override // defpackage.C
    public final FC e(Object obj) {
        InterfaceC1583Nc interfaceC1583Nc = (InterfaceC1583Nc) obj;
        Intrinsics.checkNotNullParameter(interfaceC1583Nc, "<this>");
        FC fcD = C4900kZ.d(interfaceC1583Nc);
        Intrinsics.checkNotNull(fcD);
        return fcD;
    }

    @Override // defpackage.C
    public final Iterable<InterfaceC1583Nc> f(InterfaceC1583Nc interfaceC1583Nc) {
        InterfaceC2396Xc interfaceC2396XcK;
        InterfaceC1583Nc interfaceC1583Nc2 = interfaceC1583Nc;
        Intrinsics.checkNotNullParameter(interfaceC1583Nc2, "<this>");
        FC fcD = C4900kZ.d(interfaceC1583Nc2);
        return (fcD == null || (interfaceC2396XcK = fcD.k()) == null) ? C5653o60.d : interfaceC2396XcK;
    }
}

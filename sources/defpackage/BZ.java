package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BZ implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ BZ(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                FZ fz = (FZ) this.e;
                return CollectionsKt.e0(fz.p.a.e.k(fz.A));
            case 1:
                Collection collectionA = InterfaceC2602Zs1.a.a(((C3545eJ0.a) this.e).b().E0(), null, 3);
                ArrayList<InterfaceC4675jU> arrayList = new ArrayList();
                for (Object obj : collectionA) {
                    if (!C4432iZ.m((InterfaceC4675jU) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC4675jU interfaceC4675jU : arrayList) {
                    FC fc = interfaceC4675jU instanceof FC ? (FC) interfaceC4675jU : null;
                    Class<?> clsK = fc != null ? C7437wc2.k(fc) : null;
                    C3545eJ0 c3545eJ0 = clsK != null ? new C3545eJ0(clsK) : null;
                    if (c3545eJ0 != null) {
                        arrayList2.add(c3545eJ0);
                    }
                }
                return arrayList2;
            case 2:
                OJ0.b bVar = (OJ0.b) this.e;
                C0983Fj1 c0983Fj1F = bVar.v().o().f();
                if (c0983Fj1F != null) {
                    return c0983Fj1F;
                }
                C0983Fj1 c0983Fj1C = JY.c(bVar.v().o(), InterfaceC2396Xc.a.a);
                Intrinsics.checkNotNullExpressionValue(c0983Fj1C, "createDefaultGetter(...)");
                return c0983Fj1C;
            default:
                return (ArrayList) this.e;
        }
    }
}

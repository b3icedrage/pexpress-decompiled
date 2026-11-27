package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class LI0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ LI0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        switch (this.d) {
            case 0:
                PI0 pi0 = (PI0) this.e;
                InterfaceC1490Lx interfaceC1490LxO = pi0.o();
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                if (pi0.t()) {
                    i = 0;
                } else {
                    InterfaceC1076Go1 interfaceC1076Go1G = C7437wc2.g(interfaceC1490LxO);
                    if (interfaceC1076Go1G != null) {
                        arrayList.add(new HJ0(pi0, 0, GJ0.a.d, new C1194Ic(interfaceC1076Go1G, 1)));
                        i = 1;
                    } else {
                        i = 0;
                    }
                    InterfaceC1076Go1 interfaceC1076Go1R0 = interfaceC1490LxO.r0();
                    if (interfaceC1076Go1R0 != null) {
                        arrayList.add(new HJ0(pi0, i, GJ0.a.e, new C5612nv(interfaceC1076Go1R0, 1)));
                        i++;
                    }
                }
                int size = interfaceC1490LxO.j().size();
                while (i2 < size) {
                    arrayList.add(new HJ0(pi0, i, GJ0.a.g, new OI0(interfaceC1490LxO, i2)));
                    i2++;
                    i++;
                }
                if (pi0.s() && (interfaceC1490LxO instanceof InterfaceC2678aE0) && arrayList.size() > 1) {
                    C2680aF.n(arrayList, new PI0.a());
                }
                arrayList.trimToSize();
                return arrayList;
            case 1:
                List<AbstractC4649jL0> upperBounds = ((YJ0) this.e).d.getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                ArrayList arrayList2 = new ArrayList(XE.m(upperBounds, 10));
                Iterator<T> it = upperBounds.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new WJ0((AbstractC4649jL0) it.next(), null));
                }
                return arrayList2;
            case 2:
                return ((C6550sO0) this.e).b.h().a();
            case 3:
                return ((QO0) this.e).i(LY.p, null);
            default:
                T01 t01 = (T01) this.e;
                R01 r01 = t01.k;
                if (r01 == null) {
                    StringBuilder sb = new StringBuilder("Dependencies of module ");
                    String str = t01.getName().d;
                    Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                    sb.append(str);
                    sb.append(" were not set before querying module content");
                    throw new AssertionError(sb.toString());
                }
                t01.T0();
                List<T01> list = r01.a;
                list.contains(t01);
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    ((T01) it2.next()).getClass();
                }
                ArrayList arrayList3 = new ArrayList(XE.m(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    InterfaceC2548Za1 interfaceC2548Za1 = ((T01) it3.next()).l;
                    Intrinsics.checkNotNull(interfaceC2548Za1);
                    arrayList3.add(interfaceC2548Za1);
                }
                return new IH(arrayList3, "CompositeProvider@ModuleDescriptor for " + t01.getName());
        }
    }
}

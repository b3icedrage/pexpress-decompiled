package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class D1 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ D1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                E1 e1 = (E1) this.e;
                sb.append(e1.d.e());
                return B62.a.a(e1.e.getUpperBounds(), sb.toString());
            case 1:
                FZ.c cVar = (FZ.c) this.e;
                cVar.getClass();
                HashSet hashSet = new HashSet();
                FZ fz = FZ.this;
                Iterator<AbstractC4649jL0> it = fz.r.a().iterator();
                while (it.hasNext()) {
                    for (InterfaceC4675jU interfaceC4675jU : InterfaceC2602Zs1.a.a(it.next().v(), null, 3)) {
                        if ((interfaceC4675jU instanceof InterfaceC3765fM1) || (interfaceC4675jU instanceof InterfaceC0671Bj1)) {
                            hashSet.add(((InterfaceC1490Lx) interfaceC4675jU).getName());
                        }
                    }
                }
                C2077Tj1 c2077Tj1 = fz.i;
                List<C2575Zj1> list = c2077Tj1.u;
                Intrinsics.checkNotNullExpressionValue(list, "getFunctionList(...)");
                Iterator<T> it2 = list.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    C6582sZ c6582sZ = fz.p;
                    if (!zHasNext) {
                        List<C3637ek1> list2 = c2077Tj1.v;
                        Intrinsics.checkNotNullExpressionValue(list2, "getPropertyList(...)");
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            hashSet.add(C6267r21.b(c6582sZ.b, ((C3637ek1) it3.next()).j));
                        }
                        return C5907pJ1.d(hashSet, hashSet);
                    }
                    hashSet.add(C6267r21.b(c6582sZ.b, ((C2575Zj1) it2.next()).j));
                }
                break;
            case 2:
                CI0 ci0 = (CI0) this.e;
                GO0 go0 = ci0.c;
                go0.getClass();
                Collection<InterfaceC2699aL0> collectionValues = ((Map) Nm2.f(go0.m, GO0.q[0])).values();
                ArrayList arrayList = new ArrayList();
                for (InterfaceC2699aL0 interfaceC2699aL0 : collectionValues) {
                    KE0 ke0 = ci0.b.a;
                    C2626a00 c2626a00A = ke0.d.a(ci0.c, interfaceC2699aL0);
                    if (c2626a00A != null) {
                        arrayList.add(c2626a00A);
                    }
                }
                return (QY0[]) QD1.b(arrayList).toArray(new QY0[0]);
            default:
                Type typeB = ((WJ0) this.e).b();
                Intrinsics.checkNotNull(typeB);
                return C4753jp1.c(typeB);
        }
    }
}

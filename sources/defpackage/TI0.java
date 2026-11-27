package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TI0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ TI0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Iterable] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? C;
        switch (this.d) {
            case 0:
                C3545eJ0 c3545eJ0 = (C3545eJ0) this.e;
                return c3545eJ0.o(c3545eJ0.c().y().v(), AbstractC5906pJ0.c.d);
            case 1:
                FJ0.a aVar = (FJ0.a) this.e;
                aVar.getClass();
                IJ0<Object> ij0 = FJ0.a.g[0];
                C1627Np1 fileClass = (C1627Np1) aVar.c.invoke();
                if (fileClass == null) {
                    return QY0.b.b;
                }
                IJ0<Object> ij1 = AbstractC5906pJ0.a.b[0];
                Object objInvoke = aVar.a.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                C5332mb1 c5332mb1 = ((C7983zB1) objInvoke).b;
                Intrinsics.checkNotNullParameter(fileClass, "fileClass");
                ConcurrentHashMap<QC, QY0> concurrentHashMap = c5332mb1.c;
                Class<?> cls = fileClass.a;
                QC qcA = C4753jp1.a(cls);
                QY0 qy0 = concurrentHashMap.get(qcA);
                if (qy0 == null) {
                    QC qcA2 = C4753jp1.a(cls);
                    UK0 uk0 = fileClass.b;
                    UK0.a aVar2 = uk0.a;
                    UK0.a aVar3 = UK0.a.MULTIFILE_CLASS;
                    PZ pz = c5332mb1.a;
                    if (aVar2 == aVar3) {
                        String[] strArr = aVar2 == aVar3 ? uk0.c : null;
                        List listB = strArr != null ? C1371Kj.b(strArr) : null;
                        if (listB == null) {
                            listB = C5653o60.d;
                        }
                        C = new ArrayList();
                        Iterator it = listB.iterator();
                        while (it.hasNext()) {
                            C1758Ph0 topLevelFqName = new C1758Ph0(C6952uI0.c((String) it.next()).a.replace('/', JwtParser.SEPARATOR_CHAR));
                            Intrinsics.checkNotNullExpressionValue(topLevelFqName, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                            C1758Ph0 c1758Ph0E = topLevelFqName.e();
                            InterfaceC2699aL0 interfaceC2699aL0A = TK0.a(c5332mb1.b, new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)")), C5027l8.t(pz.c().c));
                            if (interfaceC2699aL0A != null) {
                                C.add(interfaceC2699aL0A);
                            }
                        }
                    } else {
                        C = VE.c(fileClass);
                    }
                    S01 s01 = pz.c().b;
                    C1758Ph0 c1758Ph0 = qcA2.a;
                    C6073q60 c6073q60 = new C6073q60(s01, c1758Ph0);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = C.iterator();
                    while (it2.hasNext()) {
                        C2626a00 c2626a00A = pz.a(c6073q60, (InterfaceC2699aL0) it2.next());
                        if (c2626a00A != null) {
                            arrayList.add(c2626a00A);
                        }
                    }
                    QY0 qy0A = C7093uz.a.a("package " + c1758Ph0 + " (" + fileClass + ')', CollectionsKt.e0(arrayList));
                    QY0 qy0PutIfAbsent = concurrentHashMap.putIfAbsent(qcA, qy0A);
                    qy0 = qy0PutIfAbsent == null ? qy0A : qy0PutIfAbsent;
                }
                Intrinsics.checkNotNullExpressionValue(qy0, "getOrPut(...)");
                return qy0;
            case 2:
                List listU = ((FO0) this.e).o.u();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listU) {
                    if (((InterfaceC6520sE0) obj).G()) {
                        arrayList2.add(obj);
                    }
                }
                int iA = OW0.a(XE.m(arrayList2, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj2 : arrayList2) {
                    linkedHashMap.put(((InterfaceC6520sE0) obj2).getName(), obj2);
                }
                return linkedHashMap;
            default:
                YO0 yo0 = (YO0) this.e;
                T01 t01 = yo0.g;
                t01.T0();
                return Boolean.valueOf(C5027l8.s((IH) t01.o.getValue(), yo0.h));
        }
    }
}

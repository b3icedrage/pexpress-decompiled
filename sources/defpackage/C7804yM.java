package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;

/* JADX INFO: renamed from: yM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7804yM implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object g;

    public /* synthetic */ C7804yM(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00c5  */
    /* JADX WARN: Type inference failed for: r2v2, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Collection<InterfaceC2076Tj0> collectionM;
        ArrayList arrayList;
        String strA;
        switch (this.d) {
            case 0:
                InterfaceC2396Xc additionalAnnotations = ((WC) this.g).k();
                LO0 lo0 = (LO0) this.e;
                Intrinsics.checkNotNullParameter(lo0, "<this>");
                Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
                return lo0.a.q.b((C3114cF0) lo0.d.getValue(), additionalAnnotations);
            default:
                C6535sJ0 c6535sJ0 = (C6535sJ0) this.e;
                AbstractC5906pJ0 abstractC5906pJ0 = c6535sJ0.i;
                abstractC5906pJ0.getClass();
                String name = (String) this.g;
                Intrinsics.checkNotNullParameter(name, "name");
                String signature = c6535sJ0.j;
                Intrinsics.checkNotNullParameter(signature, "signature");
                if (Intrinsics.a(name, "<init>")) {
                    collectionM = CollectionsKt.e0(abstractC5906pJ0.l());
                    arrayList = new ArrayList();
                    for (Object obj : collectionM) {
                        InterfaceC3550eL interfaceC3550eL = (InterfaceC3550eL) obj;
                        if (interfaceC3550eL.G()) {
                            InterfaceC5257mD interfaceC5257mDE = interfaceC3550eL.e();
                            Intrinsics.checkNotNullExpressionValue(interfaceC5257mDE, "getContainingDeclaration(...)");
                            if (C7138vA0.d(interfaceC5257mDE)) {
                                String strA2 = DB1.c(interfaceC3550eL).a();
                                if (!d.o(strA2, "constructor-impl", false) || !d.h(strA2, ")V", false)) {
                                    throw new IllegalArgumentException(("Invalid signature of " + interfaceC3550eL + ": " + strA2).toString());
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(StringsKt.N(strA2, "V"));
                                InterfaceC5257mD interfaceC5257mDE2 = interfaceC3550eL.e();
                                Intrinsics.checkNotNullExpressionValue(interfaceC5257mDE2, "getContainingDeclaration(...)");
                                Intrinsics.checkNotNullParameter(interfaceC5257mDE2, "<this>");
                                QC qcF = C4900kZ.f(interfaceC5257mDE2);
                                Intrinsics.checkNotNull(qcF);
                                sb.append(UC.b(qcF.b()));
                                strA = sb.toString();
                            } else {
                                strA = DB1.c(interfaceC3550eL).a();
                            }
                        } else {
                            strA = DB1.c(interfaceC3550eL).a();
                        }
                        if (Intrinsics.a(strA, signature)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    C5638o21 c5638o21K = C5638o21.k(name);
                    Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
                    collectionM = abstractC5906pJ0.m(c5638o21K);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : collectionM) {
                        if (Intrinsics.a(DB1.c((InterfaceC2076Tj0) obj2).a(), signature)) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = arrayList2;
                }
                if (arrayList.size() == 1) {
                    return (InterfaceC2076Tj0) CollectionsKt.U(arrayList);
                }
                String strJ = CollectionsKt.J(collectionM, "\n", null, null, C3736fD.g, 30);
                StringBuilder sbA = C5896pG.a("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbA.append(abstractC5906pJ0);
                sbA.append(':');
                sbA.append(strJ.length() == 0 ? " no members found" : "\n".concat(strJ));
                throw new C3761fL0(sbA.toString());
        }
    }
}

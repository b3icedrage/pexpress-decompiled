package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7391wO0 implements Function0 {
    public final FO0 d;
    public final LO0 e;

    public C7391wO0(FO0 fo0, LO0 lo0) {
        this.d = fo0;
        this.e = lo0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [FO0] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7, types: [FO0] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [AC, Wj0, cE0] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [cE0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LO0 lo0;
        FC fc;
        LO0 lo1;
        Object obj;
        LO0 lo2;
        List listG;
        ?? r3;
        ?? arrayList;
        ?? r21;
        ?? r1;
        Pair pair;
        FO0 fo0 = this.d;
        List listL = fo0.o.l();
        ArrayList arrayList2 = new ArrayList(listL.size());
        Iterator it = listL.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            lo0 = fo0.b;
            fc = fo0.n;
            if (!zHasNext) {
                break;
            }
            InterfaceC4628jE0 typeParameterOwner = (InterfaceC4628jE0) it.next();
            C6970uO0 c6970uO0H = C3043bv.h(lo0, typeParameterOwner);
            KE0 ke0 = lo0.a;
            C3111cE0 containingDeclaration = C3111cE0.i1(fc, c6970uO0H, false, ke0.j.a(typeParameterOwner));
            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "createJavaConstructor(...)");
            int size = fc.A().size();
            Intrinsics.checkNotNullParameter(lo0, "<this>");
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
            LO0 lo3 = new LO0(ke0, new WO0(lo0, containingDeclaration, typeParameterOwner, size), lo0.c);
            QO0.b bVarU = QO0.u(lo3, containingDeclaration, typeParameterOwner.j());
            List<H62> listA = fc.A();
            Intrinsics.checkNotNullExpressionValue(listA, "getDeclaredTypeParameters(...)");
            ArrayList arrayListW = typeParameterOwner.w();
            ArrayList arrayList3 = new ArrayList(XE.m(arrayListW, 10));
            Iterator it2 = arrayListW.iterator();
            while (it2.hasNext()) {
                H62 h62A = lo3.b.a((ZE0) it2.next());
                Intrinsics.checkNotNull(h62A);
                arrayList3.add(h62A);
            }
            containingDeclaration.h1(bVarU.a, Hc2.a(typeParameterOwner.d()), CollectionsKt.Q(listA, arrayList3));
            containingDeclaration.b1(false);
            containingDeclaration.c1(bVarU.b);
            containingDeclaration.d1(fc.y());
            lo3.a.g.getClass();
            arrayList2.add(containingDeclaration);
        }
        InterfaceC2902bE0 interfaceC2902bE0 = fo0.o;
        boolean zV = interfaceC2902bE0.v();
        InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
        String str = "PROTECTED_AND_PACKAGE";
        String str2 = "getVisibility(...)";
        LO0 lo4 = this.e;
        if (zV) {
            C3111cE0 c3111cE0I1 = C3111cE0.i1(fc, c0193a, true, lo0.a.j.a(interfaceC2902bE0));
            Intrinsics.checkNotNullExpressionValue(c3111cE0I1, "createJavaConstructor(...)");
            ArrayList arrayListN = interfaceC2902bE0.n();
            ArrayList arrayList4 = new ArrayList(arrayListN.size());
            VE0 ve0Q = C3686f.q(EnumC2880b72.e, false, null, 6);
            Iterator it3 = arrayListN.iterator();
            LO0 lo5 = lo4;
            int i = 0;
            while (it3.hasNext()) {
                IE0 ie0 = (IE0) it3.next();
                Iterator it4 = it3;
                AbstractC4649jL0 abstractC4649jL0D = lo0.e.d(ie0.getType(), ve0Q);
                KE0 ke1 = lo0.a;
                LO0 lo6 = lo5;
                C5638o21 name = ie0.getName();
                CB1.a aVarA = ke1.j.a(ie0);
                ArrayList arrayList5 = arrayList4;
                C3111cE0 c3111cE0 = c3111cE0I1;
                arrayList5.add(new Yc2(c3111cE0, null, i, c0193a, name, abstractC4649jL0D, false, false, false, null, aVarA));
                arrayList4 = arrayList5;
                lo5 = lo6;
                c3111cE0I1 = c3111cE0;
                i++;
                it3 = it4;
            }
            AC ac = c3111cE0I1;
            ArrayList arrayList6 = arrayList4;
            lo1 = lo5;
            obj = null;
            ac.c1(false);
            AbstractC5533nZ PROTECTED_AND_PACKAGE = fc.d();
            Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "getVisibility(...)");
            if (Intrinsics.a(PROTECTED_AND_PACKAGE, C5891pE0.b)) {
                PROTECTED_AND_PACKAGE = C5891pE0.c;
                Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
            }
            ac.g1(arrayList6, PROTECTED_AND_PACKAGE);
            ac.b1(false);
            ac.d1(fc.y());
            String strA = C3689f01.a(ac, 2);
            if (arrayList2.isEmpty()) {
                arrayList2.add(ac);
                lo1.a.g.getClass();
                break;
            }
            Iterator it5 = arrayList2.iterator();
            do {
                if (!it5.hasNext()) {
                    arrayList2.add(ac);
                    lo1.a.g.getClass();
                    break;
                }
            } while (!Intrinsics.a(C3689f01.a((InterfaceC7984zC) it5.next(), 2), strA));
        } else {
            lo1 = lo4;
            obj = null;
        }
        lo1.a.x.b(fc, arrayList2, lo1);
        KE0 ke2 = lo1.a;
        if (arrayList2.isEmpty()) {
            boolean zS = interfaceC2902bE0.s();
            interfaceC2902bE0.H();
            if (zS) {
                C3111cE0 c3111cE0I2 = C3111cE0.i1(fc, c0193a, true, lo0.a.j.a(interfaceC2902bE0));
                Intrinsics.checkNotNullExpressionValue(c3111cE0I2, "createJavaConstructor(...)");
                if (zS) {
                    List listY = interfaceC2902bE0.y();
                    arrayList = new ArrayList(listY.size());
                    VE0 ve0Q2 = C3686f.q(EnumC2880b72.e, true, null, 6);
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList<InterfaceC7991zE0> arrayList8 = new ArrayList();
                    for (Object obj2 : listY) {
                        if (Intrinsics.a(((InterfaceC7991zE0) obj2).getName(), C3333dI0.b)) {
                            arrayList7.add(obj2);
                        } else {
                            arrayList8.add(obj2);
                        }
                    }
                    arrayList7.size();
                    InterfaceC7991zE0 interfaceC7991zE0 = (InterfaceC7991zE0) CollectionsKt.firstOrNull(arrayList7);
                    C3533eF0 c3533eF0 = lo0.e;
                    if (interfaceC7991zE0 != null) {
                        TE0 te0M = interfaceC7991zE0.m();
                        if (te0M instanceof ZD0) {
                            ZD0 zd0 = (ZD0) te0M;
                            pair = new Pair(c3533eF0.c(zd0, ve0Q2, true), c3533eF0.d(zd0.K(), ve0Q2));
                        } else {
                            pair = new Pair(c3533eF0.d(te0M, ve0Q2), null);
                        }
                        lo2 = lo1;
                        C3111cE0 c3111cE1 = c3111cE0I2;
                        ?? r2 = fo0;
                        r2.v(arrayList, c3111cE1, 0, interfaceC7991zE0, (AbstractC4649jL0) pair.d, (AbstractC4649jL0) pair.e);
                        r1 = r2;
                        r3 = c3111cE1;
                    } else {
                        lo2 = lo1;
                        r3 = c3111cE0I2;
                        r1 = fo0;
                    }
                    int i2 = interfaceC7991zE0 != null ? 1 : 0;
                    int i3 = 0;
                    for (InterfaceC7991zE0 interfaceC7991zE1 : arrayList8) {
                        r1.v(arrayList, r3, i3 + i2, interfaceC7991zE1, c3533eF0.d(interfaceC7991zE1.m(), ve0Q2), null);
                        i3++;
                    }
                } else {
                    lo2 = lo1;
                    str2 = "getVisibility(...)";
                    r3 = c3111cE0I2;
                    str = "PROTECTED_AND_PACKAGE";
                    arrayList = Collections.EMPTY_LIST;
                }
                r3.c1(false);
                AbstractC5533nZ abstractC5533nZD = fc.d();
                Intrinsics.checkNotNullExpressionValue(abstractC5533nZD, str2);
                if (Intrinsics.a(abstractC5533nZD, C5891pE0.b)) {
                    abstractC5533nZD = C5891pE0.c;
                    Intrinsics.checkNotNullExpressionValue(abstractC5533nZD, str);
                }
                r3.g1(arrayList, abstractC5533nZD);
                r3.b1(true);
                r3.d1(fc.y());
                lo0.a.g.getClass();
                r21 = r3;
            } else {
                lo2 = lo1;
                r21 = obj;
            }
            listG = WE.g(r21);
        } else {
            lo2 = lo1;
            listG = arrayList2;
        }
        return CollectionsKt.e0(ke2.r.c(lo2, listG));
    }
}

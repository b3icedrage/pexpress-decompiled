package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class QY implements Function1 {
    public static final QY e = new QY(0);
    public static final QY g = new QY(1);
    public static final QY h = new QY(2);
    public final /* synthetic */ int d;

    public /* synthetic */ QY(int i) {
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        AbstractC5706oM1 abstractC5706oM1Y;
        P92 p92V;
        AbstractC4649jL0 abstractC4649jL0N;
        AbstractC4649jL0 type;
        switch (this.d) {
            case 0:
                InterfaceC3383dZ withOptions = (InterfaceC3383dZ) obj;
                C2964bZ c2964bZ = XY.a;
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.j();
                withOptions.d(C6702t60.d);
                withOptions.m();
                return Unit.a;
            case 1:
                C5638o21 it = (C5638o21) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            default:
                InterfaceC2076Tj0 Checks = (InterfaceC2076Tj0) obj;
                U91 u91 = U91.a;
                Intrinsics.checkNotNullParameter(Checks, "$this$Checks");
                InterfaceC4675jU interfaceC4675jUE = Checks.e();
                Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
                if (interfaceC4675jUE instanceof FC) {
                    FC fc = (FC) interfaceC4675jUE;
                    if (fc == null) {
                        RK0.a(109);
                        throw null;
                    }
                    C5638o21 c5638o21 = RK0.e;
                    if (RK0.b(fc, C4194hP1.a.a)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return null;
                }
                Collection<? extends InterfaceC1490Lx> collectionU = Checks.u();
                Intrinsics.checkNotNullExpressionValue(collectionU, "getOverriddenDescriptors(...)");
                Collection<? extends InterfaceC1490Lx> collection = collectionU;
                if (!collection.isEmpty()) {
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        InterfaceC4675jU interfaceC4675jUE2 = ((InterfaceC2076Tj0) it2.next()).e();
                        Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE2, "getContainingDeclaration(...)");
                        if (interfaceC4675jUE2 instanceof FC) {
                            FC fc2 = (FC) interfaceC4675jUE2;
                            if (fc2 == null) {
                                RK0.a(109);
                                throw null;
                            }
                            C5638o21 c5638o22 = RK0.e;
                            if (RK0.b(fc2, C4194hP1.a.a)) {
                                return null;
                            }
                        }
                    }
                }
                Intrinsics.checkNotNullParameter(Checks, "<this>");
                InterfaceC4675jU interfaceC4675jUE3 = Checks.e();
                FC fc3 = interfaceC4675jUE3 instanceof FC ? (FC) interfaceC4675jUE3 : null;
                if (fc3 != null) {
                    if (!C7138vA0.f(fc3)) {
                        fc3 = null;
                    }
                    if (fc3 != null && (abstractC5706oM1Y = fc3.y()) != null && (p92V = C0564Aa.v(abstractC5706oM1Y)) != null && (abstractC4649jL0N = Checks.n()) != null && Intrinsics.a(Checks.getName(), V91.d)) {
                        Intrinsics.checkNotNullParameter(abstractC4649jL0N, "<this>");
                        C5638o21 c5638o23 = RK0.e;
                        if (!RK0.B(abstractC4649jL0N, C4194hP1.a.h)) {
                            Intrinsics.checkNotNullParameter(abstractC4649jL0N, "<this>");
                            if (RK0.E(abstractC4649jL0N)) {
                                if (Checks.j().size() == 1) {
                                    type = Checks.j().get(0).getType();
                                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                                    if (Intrinsics.a(C0564Aa.v(type), p92V) && Checks.w0().isEmpty() && Checks.r0() == null) {
                                        return null;
                                    }
                                }
                            }
                        } else if (Checks.j().size() == 1) {
                            type = Checks.j().get(0).getType();
                            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            if (Intrinsics.a(C0564Aa.v(type), p92V)) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                InterfaceC4675jU interfaceC4675jUE4 = Checks.e();
                Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE4, "getContainingDeclaration(...)");
                if (C7138vA0.f(interfaceC4675jUE4)) {
                    C2964bZ c2964bZ2 = XY.b;
                    InterfaceC4675jU interfaceC4675jUE5 = Checks.e();
                    Intrinsics.c(interfaceC4675jUE5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    AbstractC5706oM1 abstractC5706oM1Y2 = ((FC) interfaceC4675jUE5).y();
                    Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y2, "getDefaultType(...)");
                    sb.append(" or define ''equals(other: " + c2964bZ2.Z(C0564Aa.v(abstractC5706oM1Y2)) + "): Boolean''");
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
        }
    }
}

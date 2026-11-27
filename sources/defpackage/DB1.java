package defpackage;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DB1 {

    @NotNull
    public static final QC a;

    static {
        C1758Ph0 topLevelFqName = new C1758Ph0("java.lang.Void");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        C1758Ph0 c1758Ph0E = topLevelFqName.e();
        a = new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)"));
    }

    public static AbstractC7373wI0.e a(InterfaceC2076Tj0 interfaceC2076Tj0) {
        String strA = C5712oO1.a(interfaceC2076Tj0);
        if (strA == null) {
            if (interfaceC2076Tj0 instanceof InterfaceC0905Ej1) {
                String strE = C4900kZ.k(interfaceC2076Tj0).getName().e();
                Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
                strA = C3123cI0.a(strE);
            } else if (interfaceC2076Tj0 instanceof InterfaceC1609Nj1) {
                String strE2 = C4900kZ.k(interfaceC2076Tj0).getName().e();
                Intrinsics.checkNotNullExpressionValue(strE2, "asString(...)");
                strA = C3123cI0.b(strE2);
            } else {
                strA = interfaceC2076Tj0.getName().e();
                Intrinsics.checkNotNullExpressionValue(strA, "asString(...)");
            }
        }
        return new AbstractC7373wI0.e(new AbstractC7583xI0.b(strA, C3689f01.a(interfaceC2076Tj0, 1)));
    }

    @NotNull
    public static EI0 b(@NotNull InterfaceC0671Bj1 possiblyOverriddenProperty) {
        Intrinsics.checkNotNullParameter(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        InterfaceC0671Bj1 interfaceC0671Bj1U0 = ((InterfaceC0671Bj1) C4432iZ.t(possiblyOverriddenProperty)).U0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0671Bj1U0, "getOriginal(...)");
        if (interfaceC0671Bj1U0 instanceof C2850b00) {
            C2850b00 c2850b00 = (C2850b00) interfaceC0671Bj1U0;
            C3637ek1 c3637ek1 = c2850b00.E;
            AbstractC0673Bk0.e<C3637ek1, FI0.c> propertySignature = FI0.d;
            Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
            FI0.c cVar = (FI0.c) C5998pk1.a(c3637ek1, propertySignature);
            if (cVar != null) {
                return new EI0.c((C2850b00) interfaceC0671Bj1U0, c3637ek1, cVar, c2850b00.F, c2850b00.G);
            }
        } else if (interfaceC0671Bj1U0 instanceof HE0) {
            HE0 he0 = (HE0) interfaceC0671Bj1U0;
            VN1 vn1I = he0.i();
            OE0 oe0 = vn1I instanceof OE0 ? (OE0) vn1I : null;
            AbstractC8116zp1 abstractC8116zp1B = oe0 != null ? oe0.b() : null;
            if (abstractC8116zp1B instanceof C0689Bp1) {
                return new EI0.a(((C0689Bp1) abstractC8116zp1B).a);
            }
            if (!(abstractC8116zp1B instanceof C0923Ep1)) {
                throw new C3761fL0("Incorrect resolution sequence for Java field " + interfaceC0671Bj1U0 + " (source = " + abstractC8116zp1B + ')');
            }
            Method method = ((C0923Ep1) abstractC8116zp1B).a;
            C1687Oj1 c1687Oj1 = he0.B;
            VN1 vn1I2 = c1687Oj1 != null ? c1687Oj1.i() : null;
            OE0 oe1 = vn1I2 instanceof OE0 ? (OE0) vn1I2 : null;
            AbstractC8116zp1 abstractC8116zp1B2 = oe1 != null ? oe1.b() : null;
            C0923Ep1 c0923Ep1 = abstractC8116zp1B2 instanceof C0923Ep1 ? (C0923Ep1) abstractC8116zp1B2 : null;
            return new EI0.b(method, c0923Ep1 != null ? c0923Ep1.a : null);
        }
        C0983Fj1 c0983Fj1F = interfaceC0671Bj1U0.f();
        Intrinsics.checkNotNull(c0983Fj1F);
        AbstractC7373wI0.e eVarA = a(c0983Fj1F);
        InterfaceC1609Nj1 interfaceC1609Nj1G = interfaceC0671Bj1U0.g();
        return new EI0.d(eVarA, interfaceC1609Nj1G != null ? a(interfaceC1609Nj1G) : null);
    }

    @NotNull
    public static AbstractC7373wI0 c(@NotNull InterfaceC2076Tj0 possiblySubstitutedFunction) {
        Method method;
        Intrinsics.checkNotNullParameter(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        InterfaceC2076Tj0 interfaceC2076Tj0U0 = ((InterfaceC2076Tj0) C4432iZ.t(possiblySubstitutedFunction)).U0();
        Intrinsics.checkNotNullExpressionValue(interfaceC2076Tj0U0, "getOriginal(...)");
        if (!(interfaceC2076Tj0U0 instanceof InterfaceC7002uZ)) {
            if (interfaceC2076Tj0U0 instanceof AE0) {
                VN1 vn1I = ((AE0) interfaceC2076Tj0U0).i();
                OE0 oe0 = vn1I instanceof OE0 ? (OE0) vn1I : null;
                AbstractC8116zp1 abstractC8116zp1B = oe0 != null ? oe0.b() : null;
                C0923Ep1 c0923Ep1 = abstractC8116zp1B instanceof C0923Ep1 ? (C0923Ep1) abstractC8116zp1B : null;
                if (c0923Ep1 != null && (method = c0923Ep1.a) != null) {
                    return new AbstractC7373wI0.c(method);
                }
                throw new C3761fL0("Incorrect resolution sequence for Java method " + interfaceC2076Tj0U0);
            }
            if (interfaceC2076Tj0U0 instanceof C3111cE0) {
                VN1 vn1I2 = ((C3111cE0) interfaceC2076Tj0U0).i();
                OE0 oe1 = vn1I2 instanceof OE0 ? (OE0) vn1I2 : null;
                AbstractC8116zp1 abstractC8116zp1B2 = oe1 != null ? oe1.b() : null;
                if (abstractC8116zp1B2 instanceof C7906yp1) {
                    return new AbstractC7373wI0.b(((C7906yp1) abstractC8116zp1B2).a);
                }
                if (abstractC8116zp1B2 instanceof C7065up1) {
                    C7065up1 c7065up1 = (C7065up1) abstractC8116zp1B2;
                    if (c7065up1.a.isAnnotation()) {
                        return new AbstractC7373wI0.a(c7065up1.a);
                    }
                }
                throw new C3761fL0("Incorrect resolution sequence for Java constructor " + interfaceC2076Tj0U0 + " (" + abstractC8116zp1B2 + ')');
            }
            if (interfaceC2076Tj0U0 == null) {
                JY.a(28);
                throw null;
            }
            if ((interfaceC2076Tj0U0.getName().equals(C4194hP1.c) && JY.k(interfaceC2076Tj0U0)) || ((interfaceC2076Tj0U0.getName().equals(C4194hP1.a) && JY.k(interfaceC2076Tj0U0)) || (Intrinsics.a(interfaceC2076Tj0U0.getName(), C3739fE.e) && interfaceC2076Tj0U0.j().isEmpty()))) {
                return a(interfaceC2076Tj0U0);
            }
            throw new C3761fL0("Unknown origin of " + interfaceC2076Tj0U0 + " (" + interfaceC2076Tj0U0.getClass() + ')');
        }
        QZ qz = (QZ) interfaceC2076Tj0U0;
        HZ0 hz0J = qz.J();
        if (hz0J instanceof C2575Zj1) {
            C1578Na0 c1578Na0 = GI0.a;
            AbstractC7583xI0.b bVarC = GI0.c((C2575Zj1) hz0J, qz.i0(), qz.Z());
            if (bVarC != null) {
                return new AbstractC7373wI0.e(bVarC);
            }
        }
        if (hz0J instanceof C2155Uj1) {
            C1578Na0 c1578Na1 = GI0.a;
            AbstractC7583xI0.b bVarA = GI0.a((C2155Uj1) hz0J, qz.i0(), qz.Z());
            if (bVarA != null) {
                InterfaceC4675jU interfaceC4675jUE = possiblySubstitutedFunction.e();
                Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
                if (C7138vA0.b(interfaceC4675jUE)) {
                    return new AbstractC7373wI0.e(bVarA);
                }
                InterfaceC4675jU interfaceC4675jUE2 = possiblySubstitutedFunction.e();
                Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE2, "getContainingDeclaration(...)");
                if (!C7138vA0.d(interfaceC4675jUE2)) {
                    return new AbstractC7373wI0.d(bVarA);
                }
                InterfaceC3550eL interfaceC3550eL = (InterfaceC3550eL) possiblySubstitutedFunction;
                boolean zG = interfaceC3550eL.G();
                String name = bVarA.a;
                String str = bVarA.b;
                if (zG) {
                    if (!Intrinsics.a(name, "constructor-impl") || !d.h(str, ")V", false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + bVarA).toString());
                    }
                } else {
                    if (!Intrinsics.a(name, "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + bVarA).toString());
                    }
                    FC fcH = interfaceC3550eL.H();
                    Intrinsics.checkNotNullExpressionValue(fcH, "getConstructedClass(...)");
                    Intrinsics.checkNotNullParameter(fcH, "<this>");
                    QC qcF = C4900kZ.f(fcH);
                    Intrinsics.checkNotNull(qcF);
                    String strB = UC.b(qcF.b());
                    if (d.h(str, ")V", false)) {
                        String desc = StringsKt.N(str, "V") + strB;
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(desc, "desc");
                        bVarA = new AbstractC7583xI0.b(name, desc);
                    } else if (!d.h(str, strB, false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + bVarA).toString());
                    }
                }
                return new AbstractC7373wI0.e(bVarA);
            }
        }
        return a(interfaceC2076Tj0U0);
    }
}

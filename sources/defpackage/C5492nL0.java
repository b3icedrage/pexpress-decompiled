package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5492nL0 {
    @NotNull
    public static final P92 a(@NotNull AbstractC5706oM1 lowerBound, @NotNull AbstractC5706oM1 upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return Intrinsics.a(lowerBound, upperBound) ? lowerBound : new C2481Ye0(lowerBound, upperBound);
    }

    @NotNull
    public static final AbstractC5706oM1 b(@NotNull C5655o62 attributes, @NotNull FC descriptor, @NotNull List<? extends N62> arguments) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        InterfaceC6494s62 interfaceC6494s62P = descriptor.p();
        Intrinsics.checkNotNullExpressionValue(interfaceC6494s62P, "getTypeConstructor(...)");
        return c(attributes, interfaceC6494s62P, arguments, false, null);
    }

    @NotNull
    public static final AbstractC5706oM1 c(@NotNull C5655o62 attributes, @NotNull InterfaceC6494s62 constructor, @NotNull List<? extends N62> arguments, boolean z, @Nullable AbstractC6331rL0 kotlinTypeRefiner) {
        QY0 qy0A;
        O01 o01;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z && constructor.c() != null) {
            InterfaceC5044lD interfaceC5044lDC = constructor.c();
            Intrinsics.checkNotNull(interfaceC5044lDC);
            AbstractC5706oM1 abstractC5706oM1Y = interfaceC5044lDC.y();
            Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y, "getDefaultType(...)");
            return abstractC5706oM1Y;
        }
        InterfaceC5044lD interfaceC5044lDC2 = constructor.c();
        if (interfaceC5044lDC2 instanceof H62) {
            qy0A = ((H62) interfaceC5044lDC2).y().v();
        } else if (interfaceC5044lDC2 instanceof FC) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = C4900kZ.i(C4900kZ.j(interfaceC5044lDC2));
            }
            if (arguments.isEmpty()) {
                FC fc = (FC) interfaceC5044lDC2;
                Intrinsics.checkNotNullParameter(fc, "<this>");
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                Intrinsics.checkNotNullParameter(fc, "<this>");
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                o01 = fc instanceof O01 ? (O01) fc : null;
                if (o01 == null || (qy0A = o01.G0(kotlinTypeRefiner)) == null) {
                    qy0A = fc.L0();
                    Intrinsics.checkNotNullExpressionValue(qy0A, "getUnsubstitutedMemberScope(...)");
                }
            } else {
                FC fc2 = (FC) interfaceC5044lDC2;
                T62 typeSubstitution = AbstractC7124v62.b.a(constructor, arguments);
                Intrinsics.checkNotNullParameter(fc2, "<this>");
                Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                Intrinsics.checkNotNullParameter(fc2, "<this>");
                Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                o01 = fc2 instanceof O01 ? (O01) fc2 : null;
                if (o01 == null || (qy0A = o01.N(typeSubstitution, kotlinTypeRefiner)) == null) {
                    qy0A = fc2.h0(typeSubstitution);
                    Intrinsics.checkNotNullExpressionValue(qy0A, "getMemberScope(...)");
                }
            }
        } else if (interfaceC5044lDC2 instanceof InterfaceC3714f62) {
            qy0A = R70.a(K70.SCOPE_FOR_ABBREVIATION_TYPE, true, ((InterfaceC3714f62) interfaceC5044lDC2).getName().d);
        } else {
            if (!(constructor instanceof C4622jC0)) {
                throw new IllegalStateException("Unsupported classifier: " + interfaceC5044lDC2 + " for constructor: " + constructor);
            }
            qy0A = B62.a.a(((C4622jC0) constructor).b, "member scope for intersection type");
        }
        return e(attributes, constructor, arguments, z, qy0A, new C5069lL0(constructor, arguments, attributes, z));
    }

    @NotNull
    public static final AbstractC5706oM1 d(@NotNull QY0 memberScope, @NotNull C5655o62 attributes, @NotNull InterfaceC6494s62 constructor, @NotNull List arguments, boolean z) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        C5916pM1 c5916pM1 = new C5916pM1(constructor, arguments, z, memberScope, new C5282mL0(memberScope, attributes, constructor, arguments, z));
        return attributes.isEmpty() ? c5916pM1 : new C6335rM1(c5916pM1, attributes);
    }

    @NotNull
    public static final AbstractC5706oM1 e(@NotNull C5655o62 attributes, @NotNull InterfaceC6494s62 constructor, @NotNull List<? extends N62> arguments, boolean z, @NotNull QY0 memberScope, @NotNull Function1<? super AbstractC6331rL0, ? extends AbstractC5706oM1> refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        C5916pM1 c5916pM1 = new C5916pM1(constructor, arguments, z, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? c5916pM1 : new C6335rM1(c5916pM1, attributes);
    }
}

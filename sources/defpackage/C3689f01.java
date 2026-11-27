package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3689f01 {
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    public static String a(InterfaceC2076Tj0 descriptor, int i) {
        String strE;
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (descriptor instanceof InterfaceC3550eL) {
                strE = "<init>";
            } else {
                strE = descriptor.getName().e();
                Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
            }
            sb.append(strE);
        }
        sb.append("(");
        InterfaceC1076Go1 interfaceC1076Go1R0 = descriptor.r0();
        if (interfaceC1076Go1R0 != null) {
            AbstractC4649jL0 type = interfaceC1076Go1R0.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb.append(c(type));
        }
        Iterator<Xc2> it = descriptor.j().iterator();
        while (it.hasNext()) {
            AbstractC4649jL0 type2 = it.next().getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            sb.append(c(type2));
        }
        sb.append(")");
        if (z) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (descriptor instanceof InterfaceC3550eL) {
                sb.append("V");
            } else {
                AbstractC4649jL0 abstractC4649jL0N = descriptor.n();
                Intrinsics.checkNotNull(abstractC4649jL0N);
                if (abstractC4649jL0N == null) {
                    RK0.a(143);
                    throw null;
                }
                C5638o21 c5638o21 = RK0.e;
                if (RK0.D(abstractC4649jL0N, C4194hP1.a.d)) {
                    AbstractC4649jL0 abstractC4649jL0N2 = descriptor.n();
                    Intrinsics.checkNotNull(abstractC4649jL0N2);
                    if (!C3089c72.e(abstractC4649jL0N2) && !(descriptor instanceof InterfaceC0905Ej1)) {
                        sb.append("V");
                    }
                }
                AbstractC4649jL0 abstractC4649jL0N3 = descriptor.n();
                Intrinsics.checkNotNull(abstractC4649jL0N3);
                sb.append(c(abstractC4649jL0N3));
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Nullable
    public static final String b(@NotNull InterfaceC1335Jx interfaceC1335Jx) {
        Intrinsics.checkNotNullParameter(interfaceC1335Jx, "<this>");
        if (!C4432iZ.o(interfaceC1335Jx)) {
            InterfaceC4675jU interfaceC4675jUE = interfaceC1335Jx.e();
            FC fc = interfaceC4675jUE instanceof FC ? (FC) interfaceC4675jUE : null;
            if (fc != null && !fc.getName().e) {
                InterfaceC1335Jx interfaceC1335JxU0 = interfaceC1335Jx.U0();
                InterfaceC3765fM1 interfaceC3765fM1 = interfaceC1335JxU0 instanceof InterfaceC3765fM1 ? (InterfaceC3765fM1) interfaceC1335JxU0 : null;
                if (interfaceC3765fM1 != null) {
                    return Nm2.h(fc, a(interfaceC3765fM1, 3));
                }
            }
        }
        return null;
    }

    @NotNull
    public static final HI0 c(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        return (HI0) C1589Ne.p(abstractC4649jL0, G62.k, C4056gk0.d);
    }
}

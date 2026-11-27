package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Zp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2593Zp1 {

    @NotNull
    public static final C2964bZ a = XY.a;

    public static void a(InterfaceC1490Lx interfaceC1490Lx, StringBuilder sb) {
        InterfaceC1076Go1 interfaceC1076Go1G = C7437wc2.g(interfaceC1490Lx);
        InterfaceC1076Go1 interfaceC1076Go1R0 = interfaceC1490Lx.r0();
        if (interfaceC1076Go1G != null) {
            AbstractC4649jL0 type = interfaceC1076Go1G.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb.append(d(type));
            sb.append(".");
        }
        boolean z = (interfaceC1076Go1G == null || interfaceC1076Go1R0 == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        if (interfaceC1076Go1R0 != null) {
            AbstractC4649jL0 type2 = interfaceC1076Go1R0.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            sb.append(d(type2));
            sb.append(".");
        }
        if (z) {
            sb.append(")");
        }
    }

    @NotNull
    public static String b(@NotNull InterfaceC2076Tj0 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(descriptor, sb);
        C5638o21 name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb.append(a.P(name, true));
        List<Xc2> listJ = descriptor.j();
        Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
        CollectionsKt.I(listJ, sb, ", ", "(", ")", C4154hC0.g, 48);
        sb.append(": ");
        AbstractC4649jL0 abstractC4649jL0N = descriptor.n();
        Intrinsics.checkNotNull(abstractC4649jL0N);
        sb.append(d(abstractC4649jL0N));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static String c(@NotNull InterfaceC0671Bj1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(descriptor.p0() ? "var " : "val ");
        a(descriptor, sb);
        C5638o21 name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb.append(a.P(name, true));
        sb.append(": ");
        AbstractC4649jL0 type = descriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb.append(d(type));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static String d(@NotNull AbstractC4649jL0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return a.Z(type);
    }
}

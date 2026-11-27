package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Ic2 {
    public static final String a(InterfaceC6494s62 interfaceC6494s62) {
        StringBuilder sb = new StringBuilder();
        b("type: " + interfaceC6494s62, sb);
        b("hashCode: " + interfaceC6494s62.hashCode(), sb);
        b("javaClass: " + interfaceC6494s62.getClass().getCanonicalName(), sb);
        for (InterfaceC4675jU interfaceC4675jUC = interfaceC6494s62.c(); interfaceC4675jUC != null; interfaceC4675jUC = interfaceC4675jUC.e()) {
            b("fqName: " + XY.a.w(interfaceC4675jUC), sb);
            b("javaClass: " + interfaceC4675jUC.getClass().getCanonicalName(), sb);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final void b(String str, StringBuilder sb) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        sb.append(str);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
    }
}

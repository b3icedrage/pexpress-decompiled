package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class TA1 extends C1111Ha0 {
    @Override // defpackage.QY1
    public final String q(InterfaceC3882fv0 interfaceC3882fv0) {
        StringBuilder sb = new StringBuilder(2048);
        r(sb, null, 1, interfaceC3882fv0);
        return sb.toString();
    }

    public final void r(StringBuilder sb, String str, int i, InterfaceC3882fv0 interfaceC3882fv0) {
        if (interfaceC3882fv0.getCause() != null) {
            r(sb, str, i, interfaceC3882fv0.getCause());
            str = null;
        }
        C0957Fb.q(i - 1, sb);
        if (str != null) {
            sb.append(str);
        }
        if (interfaceC3882fv0.getCause() != null) {
            sb.append("Wrapped by: ");
        }
        sb.append(interfaceC3882fv0.b());
        sb.append(": ");
        sb.append(interfaceC3882fv0.getMessage());
        sb.append(C3766fN.a);
        p(sb, i, interfaceC3882fv0);
        InterfaceC3882fv0[] interfaceC3882fv0ArrC = interfaceC3882fv0.c();
        if (interfaceC3882fv0ArrC != null) {
            for (InterfaceC3882fv0 interfaceC3882fv1 : interfaceC3882fv0ArrC) {
                r(sb, "Suppressed: ", i + 1, interfaceC3882fv1);
            }
        }
    }
}

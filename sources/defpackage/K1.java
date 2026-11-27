package defpackage;

import com.google.firebase.abt.component.AbtRegistrar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K1 implements InterfaceC5056lH, InterfaceC7203vW.a, InterfaceC1608Nj0 {
    public static String a(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        return Long.valueOf(((C2980bd0) obj).c);
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        return AbtRegistrar.lambda$getComponents$0(c1480Lt1);
    }

    @Override // defpackage.InterfaceC7203vW.a
    public void d(InterfaceC1612Nk1 interfaceC1612Nk1) {
    }
}

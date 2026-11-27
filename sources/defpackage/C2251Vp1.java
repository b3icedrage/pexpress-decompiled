package defpackage;

import java.util.List;

/* JADX INFO: renamed from: Vp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2251Vp1 {
    public RI0 b(Class cls) {
        return new XC(cls);
    }

    public InterfaceC5486nJ0 c(Class cls, String str) {
        return new C5542nb1(cls, str);
    }

    public String h(InterfaceC1764Pj0 interfaceC1764Pj0) {
        String string = interfaceC1764Pj0.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(ML0 ml0) {
        return h(ml0);
    }

    public SJ0 j(RI0 ri0, List list) {
        return new R62(ri0, list);
    }

    public InterfaceC6325rJ0 a(C2574Zj0 c2574Zj0) {
        return c2574Zj0;
    }

    public InterfaceC7796yJ0 d(Z11 z11) {
        return z11;
    }

    public AJ0 e(AbstractC2859b21 abstractC2859b21) {
        return abstractC2859b21;
    }

    public JJ0 f(AbstractC1139Hj1 abstractC1139Hj1) {
        return abstractC1139Hj1;
    }

    public LJ0 g(AbstractC1295Jj1 abstractC1295Jj1) {
        return abstractC1295Jj1;
    }
}

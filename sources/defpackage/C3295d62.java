package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3295d62 implements Function0 {
    public final C3504e62 d;
    public final InterfaceC7984zC e;

    public C3295d62(C3504e62 c3504e62, InterfaceC7984zC interfaceC7984zC) {
        this.d = c3504e62;
        this.e = interfaceC7984zC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C3504e62 c3504e62 = this.d;
        OQ1 oq1 = c3504e62.I;
        InterfaceC7984zC interfaceC7984zC = this.e;
        InterfaceC2396Xc interfaceC2396XcK = interfaceC7984zC.k();
        InterfaceC1490Lx.a aVarH = interfaceC7984zC.h();
        Intrinsics.checkNotNullExpressionValue(aVarH, "getKind(...)");
        InterfaceC3714f62 interfaceC3714f62 = c3504e62.J;
        VN1 vn1I = interfaceC3714f62.i();
        Intrinsics.checkNotNullExpressionValue(vn1I, "getSource(...)");
        C3504e62 c3504e63 = new C3504e62(oq1, c3504e62.J, interfaceC7984zC, c3504e62, interfaceC2396XcK, aVarH, vn1I);
        C3504e62.M.getClass();
        X62 x62D = interfaceC3714f62.x() == null ? null : X62.d(interfaceC3714f62.b0());
        if (x62D == null) {
            return null;
        }
        InterfaceC1076Go1 interfaceC1076Go1M0 = interfaceC7984zC.m0();
        X0 x0B = interfaceC1076Go1M0 != null ? interfaceC1076Go1M0.b(x62D) : null;
        List<InterfaceC1076Go1> listW0 = interfaceC7984zC.w0();
        Intrinsics.checkNotNullExpressionValue(listW0, "getContextReceiverParameters(...)");
        ArrayList arrayList = new ArrayList(XE.m(listW0, 10));
        Iterator<T> it = listW0.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC1076Go1) it.next()).b(x62D));
        }
        List<H62> listA = interfaceC3714f62.A();
        List<Xc2> listJ = c3504e62.j();
        AbstractC4649jL0 abstractC4649jL0 = c3504e62.k;
        Intrinsics.checkNotNull(abstractC4649jL0);
        c3504e63.Y0(null, x0B, arrayList, listA, listJ, abstractC4649jL0, C01.e, interfaceC3714f62.d());
        return c3504e63;
    }
}

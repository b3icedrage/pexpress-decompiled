package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7522x1 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C7522x1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                return new B1.a(((B1) obj).h());
            case 1:
                LY ly = LY.m;
                QY0.a.getClass();
                QY qy = QY.g;
                S41 s41 = S41.d;
                return ((FZ.a) obj).i(ly, qy);
            case 2:
                OJ0.c cVar = (OJ0.c) obj;
                InterfaceC1609Nj1 interfaceC1609Nj1G = cVar.v().v().g();
                if (interfaceC1609Nj1G != null) {
                    return interfaceC1609Nj1G;
                }
                C1687Oj1 c1687Oj1D = JY.d(cVar.v().v(), InterfaceC2396Xc.a.a);
                Intrinsics.checkNotNullExpressionValue(c1687Oj1D, "createDefaultSetter(...)");
                return c1687Oj1D;
            default:
                VP1 vp1 = (VP1) obj;
                return WE.f(JY.f(vp1.b), JY.g(vp1.b));
        }
    }
}

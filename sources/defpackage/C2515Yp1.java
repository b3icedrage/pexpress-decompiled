package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Yp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2515Yp1 implements Function1 {
    public static final C2515Yp1 e = new C2515Yp1(0);
    public static final C2515Yp1 g = new C2515Yp1(1);
    public final /* synthetic */ int d;

    public /* synthetic */ C2515Yp1(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C2964bZ c2964bZ = C2593Zp1.a;
                AbstractC4649jL0 type = ((Xc2) obj).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return C2593Zp1.d(type);
            default:
                InterfaceC4675jU it = (InterfaceC4675jU) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it instanceof InterfaceC1335Jx);
        }
    }
}

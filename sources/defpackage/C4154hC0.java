package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4154hC0 implements Function1 {
    public static final C4154hC0 e = new C4154hC0(0);
    public static final C4154hC0 g = new C4154hC0(1);
    public static final C4154hC0 h = new C4154hC0(2);
    public final /* synthetic */ int d;

    public /* synthetic */ C4154hC0(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                AbstractC4649jL0 it = (AbstractC4649jL0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
            case 1:
                C2964bZ c2964bZ = C2593Zp1.a;
                AbstractC4649jL0 type = ((Xc2) obj).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return C2593Zp1.d(type);
            default:
                InterfaceC1490Lx it2 = (InterfaceC1490Lx) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                InterfaceC1076Go1 interfaceC1076Go1R0 = it2.r0();
                Intrinsics.checkNotNull(interfaceC1076Go1R0);
                AbstractC4649jL0 type2 = interfaceC1076Go1R0.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                return type2;
        }
    }
}

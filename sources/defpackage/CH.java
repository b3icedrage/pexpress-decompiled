package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CH implements Function1 {
    public static final CH e = new CH(0);
    public static final CH g = new CH(1);
    public static final CH h = new CH(2);
    public final /* synthetic */ int d;

    public /* synthetic */ CH(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC2396Xc it = (InterfaceC2396Xc) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return CollectionsKt.y(it);
            case 1:
                P92 it2 = (P92) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(it2 instanceof C2242Vm1);
            default:
                InterfaceC4675jU it3 = (InterfaceC4675jU) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                List<H62> listW = ((InterfaceC1335Jx) it3).w();
                Intrinsics.checkNotNullExpressionValue(listW, "getTypeParameters(...)");
                return CollectionsKt.y(listW);
        }
    }
}

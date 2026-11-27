package defpackage;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PF0 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ PF0(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Long o1 = (Long) obj;
                long jLongValue = ((Long) obj2).longValue();
                Intrinsics.checkNotNullExpressionValue(o1, "o1");
                return Intrinsics.f(jLongValue, o1.longValue());
            default:
                InterfaceC2347Wu0 interfaceC2347Wu0 = (InterfaceC2347Wu0) obj;
                InterfaceC2347Wu0 interfaceC2347Wu1 = (InterfaceC2347Wu0) obj2;
                if (interfaceC2347Wu0 == interfaceC2347Wu1) {
                    return 0;
                }
                int iCompareTo = interfaceC2347Wu0.B().compareTo(interfaceC2347Wu1.B());
                return iCompareTo != 0 ? iCompareTo : interfaceC2347Wu0.w().e.toString().compareTo(interfaceC2347Wu1.w().e.toString());
        }
    }
}

package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7843yZ implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C7843yZ(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                FZ fz = (FZ) this.e;
                C2077Tj1 c2077Tj1 = fz.i;
                if ((c2077Tj1.g & 4) == 4) {
                    InterfaceC5044lD interfaceC5044lDF = fz.T0().f(C6267r21.b(fz.p.b, c2077Tj1.j), S41.k);
                    if (interfaceC5044lDF instanceof FC) {
                        return (FC) interfaceC5044lDF;
                    }
                }
                return null;
            case 1:
                AbstractC5706oM1 abstractC5706oM1E = ((C5693oI0) this.e).a.h.e();
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1E, "getAnyType(...)");
                return abstractC5706oM1E;
            case 2:
                return ((NJ0) this.e).u();
            case 3:
                HashMap map = new HashMap();
                GO0 go0 = (GO0) this.e;
                go0.getClass();
                for (Map.Entry entry : ((Map) Nm2.f(go0.m, GO0.q[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    InterfaceC2699aL0 interfaceC2699aL0 = (InterfaceC2699aL0) entry.getValue();
                    C6952uI0 c6952uI0C = C6952uI0.c(str);
                    Intrinsics.checkNotNullExpressionValue(c6952uI0C, "byInternalName(...)");
                    UK0 uk0A = interfaceC2699aL0.a();
                    int iOrdinal = uk0A.a.ordinal();
                    if (iOrdinal == 2) {
                        map.put(c6952uI0C, c6952uI0C);
                    } else if (iOrdinal == 5) {
                        String str2 = uk0A.a == UK0.a.MULTIFILE_CLASS_PART ? uk0A.f : null;
                        if (str2 != null) {
                            map.put(c6952uI0C, C6952uI0.c(str2));
                        }
                    }
                }
                return map;
            default:
                return ((X62) this.e).g().c();
        }
    }
}

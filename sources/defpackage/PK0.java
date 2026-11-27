package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class PK0 implements Function0<RK0.a> {
    public final /* synthetic */ RK0 d;

    public PK0(RK0 rk0) {
        this.d = rk0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RK0.a invoke() {
        EnumMap enumMap = new EnumMap(EnumC6405rh1.class);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (EnumC6405rh1 enumC6405rh1 : EnumC6405rh1.values()) {
            String strE = enumC6405rh1.d.e();
            RK0 rk0 = this.d;
            if (strE == null) {
                rk0.getClass();
                RK0.a(47);
                throw null;
            }
            AbstractC5706oM1 abstractC5706oM1Y = rk0.j(strE).y();
            if (abstractC5706oM1Y == null) {
                RK0.a(48);
                throw null;
            }
            String strE2 = enumC6405rh1.e.e();
            if (strE2 == null) {
                RK0.a(47);
                throw null;
            }
            AbstractC5706oM1 abstractC5706oM1Y2 = rk0.j(strE2).y();
            if (abstractC5706oM1Y2 == null) {
                RK0.a(48);
                throw null;
            }
            enumMap.put(enumC6405rh1, abstractC5706oM1Y2);
            map.put(abstractC5706oM1Y, abstractC5706oM1Y2);
            map2.put(abstractC5706oM1Y2, abstractC5706oM1Y);
        }
        return new RK0.a(enumMap, map, map2);
    }
}

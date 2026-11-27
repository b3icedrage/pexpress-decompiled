package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes3.dex */
public final class UJ0 implements Function0 {
    public final WJ0 d;
    public final Function0 e;

    public UJ0(WJ0 wj0, Function0 function0) {
        this.d = wj0;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KTypeProjection kTypeProjection;
        WJ0 wj0 = this.d;
        List<N62> listT0 = wj0.a.T0();
        if (listT0.isEmpty()) {
            return C5653o60.d;
        }
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.d, new D1(wj0, 3));
        ArrayList arrayList = new ArrayList(XE.m(listT0, 10));
        int i = 0;
        for (Object obj : listT0) {
            int i2 = i + 1;
            if (i < 0) {
                WE.l();
                throw null;
            }
            N62 n62 = (N62) obj;
            if (n62.c()) {
                KTypeProjection.INSTANCE.getClass();
                kTypeProjection = KTypeProjection.d;
            } else {
                AbstractC4649jL0 type = n62.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                WJ0 type2 = new WJ0(type, this.e != null ? new VJ0(wj0, i, interfaceC3770fO0A) : null);
                int iOrdinal = n62.b().ordinal();
                if (iOrdinal == 0) {
                    KTypeProjection.INSTANCE.getClass();
                    Intrinsics.checkNotNullParameter(type2, "type");
                    kTypeProjection = new KTypeProjection(EnumC2920bK0.d, type2);
                } else if (iOrdinal == 1) {
                    KTypeProjection.INSTANCE.getClass();
                    Intrinsics.checkNotNullParameter(type2, "type");
                    kTypeProjection = new KTypeProjection(EnumC2920bK0.e, type2);
                } else {
                    if (iOrdinal != 2) {
                        throw new C6489s51();
                    }
                    KTypeProjection.INSTANCE.getClass();
                    Intrinsics.checkNotNullParameter(type2, "type");
                    kTypeProjection = new KTypeProjection(EnumC2920bK0.g, type2);
                }
            }
            arrayList.add(kTypeProjection);
            i = i2;
        }
        return arrayList;
    }
}

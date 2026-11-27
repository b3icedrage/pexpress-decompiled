package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: aZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2740aZ implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C2740aZ(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection<C2575Zj1> collectionP;
        switch (this.d) {
            case 0:
                N62 it = (N62) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.c()) {
                    return "*";
                }
                AbstractC4649jL0 type = it.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                String strZ = ((C2964bZ) this.e).Z(type);
                if (it.b() == EnumC3610ed2.INVARIANT) {
                    return strZ;
                }
                return it.b() + ' ' + strZ;
            case 1:
                C5638o21 it2 = (C5638o21) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                SZ.b bVar = (SZ.b) this.e;
                LinkedHashMap linkedHashMap = bVar.a;
                C2575Zj1.a PARSER = C2575Zj1.z;
                Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
                byte[] bArr = (byte[]) linkedHashMap.get(it2);
                SZ sz = bVar.i;
                if (bArr == null || (collectionP = JH1.p(FH1.d(new SZ.b.a(PARSER, new ByteArrayInputStream(bArr), sz)))) == null) {
                    collectionP = C5653o60.d;
                }
                ArrayList arrayList = new ArrayList(collectionP.size());
                for (C2575Zj1 c2575Zj1 : collectionP) {
                    OY0 oy0 = sz.b.i;
                    Intrinsics.checkNotNull(c2575Zj1);
                    C3059c00 c3059c00E = oy0.e(c2575Zj1);
                    if (!sz.r(c3059c00E)) {
                        c3059c00E = null;
                    }
                    if (c3059c00E != null) {
                        arrayList.add(c3059c00E);
                    }
                }
                sz.j(it2, arrayList);
                return UE.f(arrayList);
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                String str = (String) this.e;
                function.a(str, c2905bF0);
                function.a(str, c2905bF0);
                function.b(DI0.BOOLEAN);
                return Unit.a;
        }
    }
}

package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TZ implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ TZ(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection<C3637ek1> collectionP;
        switch (this.d) {
            case 0:
                C5638o21 it = (C5638o21) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                SZ.b bVar = (SZ.b) this.e;
                LinkedHashMap linkedHashMap = bVar.b;
                C3637ek1.a PARSER = C3637ek1.z;
                Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
                byte[] bArr = (byte[]) linkedHashMap.get(it);
                SZ sz = bVar.i;
                if (bArr == null || (collectionP = JH1.p(FH1.d(new SZ.b.a(PARSER, new ByteArrayInputStream(bArr), sz)))) == null) {
                    collectionP = C5653o60.d;
                }
                ArrayList arrayList = new ArrayList(collectionP.size());
                for (C3637ek1 c3637ek1 : collectionP) {
                    OY0 oy0 = sz.b.i;
                    Intrinsics.checkNotNull(c3637ek1);
                    arrayList.add(oy0.f(c3637ek1));
                }
                sz.k(it, arrayList);
                return UE.f(arrayList);
            case 1:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a((String) this.e, C4719jg1.b);
                return Unit.a;
            default:
                int iIntValue = ((Number) obj).intValue();
                C6582sZ c6582sZ = ((C7334w62) this.e).a;
                QC qcA = C6267r21.a(c6582sZ.b, iIntValue);
                boolean z = qcA.c;
                C6163qZ c6163qZ = c6582sZ.a;
                return z ? c6163qZ.b(qcA) : C7859yd0.b(c6163qZ.b, qcA);
        }
    }
}

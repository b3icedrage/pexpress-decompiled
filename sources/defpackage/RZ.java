package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class RZ implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ RZ(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iR;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                SZ sz = (SZ) obj;
                Set<C5638o21> setN = sz.n();
                if (setN == null) {
                    return null;
                }
                return C5907pJ1.d(C5907pJ1.d(sz.m(), sz.c.f()), setN);
            case 1:
                PI0 pi0 = (PI0) obj;
                List<GJ0> listB = pi0.b();
                int size = (pi0.z() ? 1 : 0) + listB.size();
                if (((Boolean) pi0.h.getValue()).booleanValue()) {
                    iR = 0;
                    for (GJ0 gj0 : listB) {
                        iR += gj0.h() == GJ0.a.g ? pi0.r(gj0) : 0;
                    }
                } else if (listB.isEmpty()) {
                    iR = 0;
                } else {
                    Iterator<T> it = listB.iterator();
                    iR = 0;
                    while (it.hasNext()) {
                        if (((GJ0) it.next()).h() == GJ0.a.g && (iR = iR + 1) < 0) {
                            WE.k();
                            throw null;
                        }
                    }
                }
                int i = (iR + 31) / 32;
                Object[] objArr = new Object[size + i + 1];
                for (GJ0 gj1 : listB) {
                    if (gj1.m()) {
                        WJ0 type = gj1.getType();
                        C1758Ph0 c1758Ph0 = C7437wc2.a;
                        Intrinsics.checkNotNullParameter(type, "<this>");
                        AbstractC4649jL0 abstractC4649jL0 = type.a;
                        if (abstractC4649jL0 == null || !C7138vA0.c(abstractC4649jL0)) {
                            int iL = gj1.l();
                            WJ0 type2 = gj1.getType();
                            Intrinsics.checkNotNullParameter(type2, "<this>");
                            Type typeB = type2.b();
                            if (typeB == null) {
                                typeB = C7128v72.d(type2);
                            }
                            objArr[iL] = C7437wc2.e(typeB);
                        }
                    }
                    if (gj1.e()) {
                        objArr[gj1.l()] = PI0.h(gj1.getType());
                    }
                }
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[size + i2] = 0;
                }
                return objArr;
            default:
                return P01.a(((AbstractC5906pJ0) obj).h());
        }
    }
}

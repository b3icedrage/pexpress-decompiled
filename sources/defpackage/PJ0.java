package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PJ0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ PJ0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return QJ0.a((OJ0.b) this.e, true);
            default:
                LY kindFilter = LY.m;
                QY0.a.getClass();
                QY nameFilter = QY.g;
                QO0 qo0 = (QO0) this.e;
                qo0.getClass();
                Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
                Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
                S41 s41 = S41.h;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (kindFilter.a(LY.l)) {
                    for (C5638o21 c5638o21 : qo0.h(kindFilter, nameFilter)) {
                        nameFilter.invoke(c5638o21);
                        UE.b(linkedHashSet, qo0.f(c5638o21, s41));
                    }
                }
                boolean zA = kindFilter.a(LY.i);
                List<KY> list = kindFilter.a;
                if (zA && !list.contains(KY.a.a)) {
                    for (C5638o21 c5638o22 : qo0.i(kindFilter, nameFilter)) {
                        nameFilter.invoke(c5638o22);
                        linkedHashSet.addAll(qo0.d(c5638o22, s41));
                    }
                }
                if (kindFilter.a(LY.j) && !list.contains(KY.a.a)) {
                    for (C5638o21 c5638o23 : qo0.o(kindFilter)) {
                        nameFilter.invoke(c5638o23);
                        linkedHashSet.addAll(qo0.b(c5638o23, s41));
                    }
                }
                return CollectionsKt.e0(linkedHashSet);
        }
    }
}

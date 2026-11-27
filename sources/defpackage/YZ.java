package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class YZ implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ YZ(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                Set setKeySet = ((ZZ) this.e).m.d.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    QC qc = (QC) obj;
                    if (qc.b.e().d() && !KC.c.contains(qc)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((QC) it.next()).f());
                }
                return arrayList2;
            case 1:
                return new C3545eJ0.a((C3545eJ0) this.e);
            case 2:
                return new FJ0.a((FJ0) this.e);
            case 3:
                return CollectionsKt.h0(((FO0) this.e).o.N());
            default:
                return C5208m0.q(((C4662jP1) this.e).a);
        }
    }
}

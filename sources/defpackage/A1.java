package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class A1 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ A1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                AbstractC4649jL0 it = (AbstractC4649jL0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((B1) this.e).n(it);
                return Unit.a;
            default:
                C5638o21 name = (C5638o21) obj;
                Intrinsics.checkNotNullParameter(name, "name");
                QO0 qo0 = (QO0) this.e;
                FO0 fo0 = qo0.c;
                if (fo0 != null) {
                    return (Collection) ((C2720aS0.k) fo0.f).invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                Iterator<InterfaceC7991zE0> it2 = qo0.e.invoke().c(name).iterator();
                while (it2.hasNext()) {
                    AE0 ae0T = qo0.t(it2.next());
                    if (qo0.r(ae0T)) {
                        qo0.b.a.g.getClass();
                        arrayList.add(ae0T);
                    }
                }
                qo0.j(name, arrayList);
                return arrayList;
        }
    }
}

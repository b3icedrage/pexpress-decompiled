package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class UI0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ UI0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                C3545eJ0 c3545eJ0 = (C3545eJ0) this.e;
                QY0 qy0Y = c3545eJ0.c().Y();
                Intrinsics.checkNotNullExpressionValue(qy0Y, "getStaticScope(...)");
                return c3545eJ0.o(qy0Y, AbstractC5906pJ0.c.d);
            default:
                YO0 yo0 = (YO0) this.e;
                if (yo0.isEmpty()) {
                    return QY0.b.b;
                }
                List<InterfaceC2392Xa1> listO = yo0.O();
                ArrayList arrayList = new ArrayList(XE.m(listO, 10));
                Iterator<T> it = listO.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC2392Xa1) it.next()).v());
                }
                T01 t01 = yo0.g;
                C1758Ph0 c1758Ph0 = yo0.h;
                return C7093uz.a.a("package view scope for " + c1758Ph0 + " in " + t01.getName(), CollectionsKt.R(arrayList, new C3370dU1(t01, c1758Ph0)));
        }
    }
}
